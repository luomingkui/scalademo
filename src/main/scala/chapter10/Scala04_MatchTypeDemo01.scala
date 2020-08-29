package chapter10

/**
 * @author mkluo
 * @date 2020/8/3 上午12:00
 * @desc 类型匹配
 * 可以匹配对象的任意类型，这样做避免了使用 isInstanceOf 和 asInstanceOf 方法。
 * Scala的模式匹配一个强大之处就在于，可以直接匹配类型，而不是值！！！这点是java的switch case绝对做不到的。
 * 对类型如何进行匹配？其他语法与匹配值其实是一样的，但是匹配类型的话，就是要用“case 变量: 类型 => 代码”这种语法，而不是匹配值的“case 值 => 代码”这种语法。
 */
object Scala04_MatchTypeDemo01 {
  def main(args: Array[String]): Unit = {
    val a = 8
    //说明 obj 实例的类型 根据 a 的值来返回
    val obj = if (a == 1) 1
    else if (a == 2) "2"
    else if (a == 3) BigInt(3)
    else if (a == 4) Map("aa" -> 1)
    else if (a == 5) Map(1 -> "aa")
    else if (a == 6) Array(1, 2, 3)
    else if (a == 7) Array("aa", 1)
    else if (a == 8) Array("aa")

    //说明:根据obj的类型来匹配
    val result = obj match {
      case a: Int => a
      case b: Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c: Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d: Array[String] => "对象是一个字符串数组"
      case e: Array[Int] => "对象是一个数字数组"
      case f: BigInt => Int.MaxValue
      case y: Float => println("xx")
      case _ => "啥也不是"
    }
    println(result)
  }
}
