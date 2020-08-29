package chapter04

/**
 * @author mkluo
 * @date 2020/7/25 下午10:20
 * @desc 属性和方法：Scala 中的方法其实就是函数，声明规则请参考函数式编程中的函数声明。
 */
object MScala03_ethodDemo {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    println(dog.cal(10, 20))
  }
}

class Dog {
  private var sal: Double = _
  var food: String = _
  def cal(n1: Int, n2: Int): Int = {
    return n1 + n2 }
}