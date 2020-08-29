package chapter09

/**
 * 操作符：
 * 1) 如果想在变量名、类名等定义中使用语法关键字(保留字)，可以配合反引号反引号 val `val` = 42
 * 2) 中置操作符:A 操作符 B 等同于 A.操作符(B)
 * 3) 后置操作符:A 操作符 等同于 A.操作符，如果操作符定义的时候不带()则调用时不能加括号。
 * 4) 前置操作符，+、-、!、~等操作符 A 等同于 A.unary_操作符
 * 5) 赋值操作符，A操作符=B等同于A=A操作符B ，比如A+=B等价A=A+B
 */
object Scala12_OperatorDemo01 {
  def main(args: Array[String]): Unit = {

    val n1 = 1
    val n2 = 2
    val r1 = n1 + n2 // 3
    val r2 = n1.+(n2) // 3

    val monster = new Monster
    monster + 10
    monster.+(10)

    println("monster.money=" + monster.money) // 20

    println(monster++)
    println(monster.++)

    println("monster.money=" + monster.money) // 22

    !monster
    println("monster.money=" + monster.money) // -22

  }
}

class Monster {
  var money: Int = 0

  //对操作符进行重载 (中置操作符)
  def +(n:Int): Unit = {
    this.money += n
  }
  //对操作符进行重载(后置操作符)
  def ++(): Unit = {
    this.money += 1
  }

  //对操作符进行重载(前置操作符，一元运算符)
  def unary_!(): Unit = {
    this.money = -this.money
  }
}