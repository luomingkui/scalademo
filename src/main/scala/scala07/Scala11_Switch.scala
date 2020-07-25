package scala07

/**
  * @author luomingkui
  * @date 2018/6/11 下午9:30
  * @desc 模式匹配
  *      与default等效的是捕获所有的case_ 模式。如果没有模式匹配，抛出MatchError，每个case中，不用break语句。
  *      可以在match中使用任何类型，而不仅仅是数字。
  */
object Scala11_Switch {

  def main(args: Array[String]): Unit = {

    // scala中的模式匹配类似于java中的switch分支判断
    // scala中不需要break，因为可以自动推断处理，避免java中忘记写break所产生的问题
    var result = 0;
    val op : Char = '='

    op match {
      case '+' => result = 1
      case '-' => result = -1
      case _ => result = 0
    }
    println(result)


    println("===守卫===")
    // 守卫:像if表达式一样，match也提供守卫功能，守卫可以是任何Boolean条件
    for (ch <- "+-*/3"){
      ch match{
        case '+'=>println(1)
        case '-'=>println(2)
        case '*'=>println(3)
        case _ if ch.toString.equals("3")=>println("333")
        case '/'=>println("4")
      }
    }

    println("===模式中的变量===")
    //如果在case关键字后跟变量名，那么match前表达式的值会赋给那个变量。
    val str = "+-3!"
    for (i <- str.indices) {
      var sign = 0
      var digit = 0

      str(i) match {
        case '+' => sign = 1
        case '-' => sign = -1
        case ch if Character.isDigit(ch) => digit = Character.digit(ch, 10)
        case _ =>
      }
      println(str(i) + " " + sign + " " + digit)
    }

    //可以匹配对象的任意类型，但是不能直接匹配泛型类型，这样描述比较抽象，看下面的例子：
    // 这样做的意义在于，避免了使用isInstanceOf和asInstanceOf方法。
    println("===类型模式===")
    val a = 8
    val obj = if(a == 1) 1
    else if(a == 2) "2"
    else if(a == 3) BigInt(3)
    else if(a == 4) Map("aa" -> 1)
    else if(a == 5) Map(1 -> "aa")
    else if(a == 6) Array(1, 2, 3)
    else if(a == 7) Array("aa", 1)
    else if(a == 8) Array("aa")
    val r1 = obj match {
      case x: Int => x
      case s: String => s.toInt
      case BigInt => -1 //不能这么匹配
      case _: BigInt => Int.MaxValue
      case m: Map[String, Int] => "Map[String, Int]类型的Map集合"
      case m: Map[_, _] => "Map集合"
      case a: Array[Int] => "It's an Array[Int]"
      case a: Array[String] => "It's an Array[String]"
      case a: Array[_] => "It's an array of something other than Int"
      case _ => 0
    }
    println(r1 + ", " + r1.getClass.getName)


    println("===匹配数组、列表、元组===")
    // Array(0) 匹配只有一个元素且为0的数组。
    // Array(x,y) 匹配数组有两个元素，并将两个元素赋值为x和y。
    // Array(0,_*) 匹配数组以0开始。

    println("===匹配数组===")
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))) {
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + " " + y
        case Array(x, y, z) => x + " " + y + " " + z
        case Array(0, _*) => "0..."
        case _ => "something else"
      }
      println(result)
    }

    println("===匹配列表===")
    //与匹配数组相似，同样可以应用于列表
    for (lst <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
      val result = lst match {
        case 0 :: Nil => "0"
        case x :: y :: Nil => x + " " + y
        case 0 :: tail => "0 ..."
        case _ => "something else"
      }
      println(result)
    }

    println("===匹配元组===")
    //同样可以应用于元组
    for (pair <- Array((0, 1), (1, 0), (1, 1))) {
      val result = pair match {
        case (0, _) => "0 ..."
        case (y, 0) => y + " 0"
        case _ => "neither is 0"
      }
      println(result)
    }

    println("===提取器===")
    //模式匹配，什么才算是匹配呢？即，case中unapply方法返回some集合则为匹配成功，返回none集合则为匹配失败。下面我们来看几个例子做详细探讨。

    //unapply
    //创建object Square：
    object Square {
      def unapply(z: Double): Option[Double] = Some(math.sqrt(z))
    }
    //模式匹配使用：
    val number: Double = 36.0
    number match {
      case Square(n) => println(s"square root of $number is $n")
      case _ => println("nothing matched")
    }

    //unapplySeq
    //--调用unapplySeq，传入namesString
    //--接收返回值并判断返回值是None，还是Some
    //--如果是Some，则将其解开
    //--判断解开之后得到的sequence中的元素的个数是否是三个
    //--如果是三个，则把三个元素分别取出，赋值给first，second和third
    println("=== 模式匹配使用 ===")

    object Names {
      def unapplySeq(str: String): Option[Seq[String]] = {
        if (str.contains(",")) Some(str.split(","))
        else None
      }
    }
    val namesString = "Alice,Bob,Thomas"
    namesString match {
      case Names(first, second, third) => {
        println("the string contains three people's names")
        println(s"$first $second $third")
      }
      case _ => println("nothing matched")
    }

    println("===变量声明中的模式===")
    //match中每一个case都可以单独提取出来，意思是一样的，如下：
    val (x, y) = (1, 2)
    val (q, r) = BigInt(10) /% 3
    val arr = Array(1, 7, 2, 9)
    val Array(first, second, _*) = arr
    println(first, second)

    println("===for表达式中的模式===")
    import scala.collection.JavaConverters._
    for ((k, v) <- System.getProperties.asScala)
      println(k + " -> " + v)

    for ((k, "") <- System.getProperties.asScala)
      println(k)

    for ((k, v) <- System.getProperties.asScala if v == "")
      println(k)

    println("===样例类===")
  //  package unit6
    abstract class Amount
    case class Dollar(value: Double) extends Amount
    case class Currency(value: Double, unit: String) extends Amount
    case object Nothing extends Amount

    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "EUR"), Nothing)) {
      val result = amt match {
        case Dollar(v) => "$" + v
        case Currency(_, u) => u
        case Nothing => ""
      }
      println(amt + ": " + result)
    }

    println("===Copy方法和带名参数===")
    //copy创建一个与现有对象值相同的新对象，并可以通过带名参数来修改某些属性
    val amt = Currency(29.95, "EUR")
    val price = amt.copy(value = 19.95)
    println(amt)
    println(price)
    println(amt.copy(unit = "CHF"))

    println("===Case语句的中置(缀)表达式===")
    //什么是中置表达式？1 + 2，这就是一个中置表达式。如果unapply方法产出一个元组，你可以在case语句中使用中置表示法。比如可以匹配一个List序列。
    List(1, 7, 2, 9) match {
      case first :: second :: rest => println(first + second + rest.length)
    }

    println("===匹配嵌套结构===")
    //比如某一系列商品想捆绑打折出售
    abstract class Item
    case class Article(description: String, price: Double) extends Item
    case class Bundle(description: String, discount: Double, item: Item*) extends Item
    //匹配嵌套结构
    val sale = Bundle("愚人节大甩卖系列", 10,
    Article("《九阴真经》", 40),
    Bundle("从出门一条狗到装备全发光的修炼之路系列", 20,
    Article("《如何快速捡起地上的装备》", 80),
    Article("《名字起得太长躲在树后容易被地方发现》",30)))
    //将descr绑定到第一个Article的描述
    val result1 = sale match {
      case Bundle(_, _, Article(descr, _), _*) => descr
    }
    println(result1)

    println("===通过@表示法将嵌套的值绑定到变量。_*绑定剩余Item到rest===")
    val result2 = sale match {
      case Bundle(_, _, art @ Article(_, _), rest @ _*) => (art, rest)
    }
    println(result2)

    println("===不使用_*绑定剩余Item到rest===")
    val result3 = sale match {
      case Bundle(_, _, art @ Article(_, _), rest) => (art, rest)
    }
    println(result3)


    println("===模拟枚举===")
    sealed abstract class TrafficLightColor
    case object Red extends TrafficLightColor
    case object Yellow extends TrafficLightColor
    case object Green extends TrafficLightColor
    for (color <- Array(Red, Yellow, Green))
      println(
     color match {
     case Red => "stop"
     case Yellow => "slowly"
     case Green => "go"
    })

    println("===偏函数===")

    val f: PartialFunction[Char, Int] = {
        case '+' => 1
        case '-' => -1
    }

    println(f('-'))
    println(f.isDefinedAt('0'))
    println(f('+'))

    println("===111===")

    val f1 = new PartialFunction[Any, Int] {
        def apply(any: Any) = any.asInstanceOf[Int] + 1

        def isDefinedAt(any: Any) = if (any.isInstanceOf[Int]) true else false
    }

    // 集合中collect方法需要传递偏函数
    val rf1 = List(1, 3, 5, "seven") collect f1
    println(rf1)

    println("===222===")

    def f2: PartialFunction[Any, Any] = {
      case i: Int => i + 1
      case ch => ch
    }
    val rf2 = List(1, 3, 5, "seven") collect f2
    println(rf2)
  }
}



abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount
case object Nothing extends Amount


abstract class Item
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, item: Item*) extends Item

sealed abstract class TrafficLightColor
case object Red extends TrafficLightColor
case object Yellow extends TrafficLightColor
case object Green extends TrafficLightColor
