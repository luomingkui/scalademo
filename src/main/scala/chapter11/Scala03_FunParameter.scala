package chapter11

/**
 * @author mkluo
 * @date 2020/8/4 上午12:02
 * @desc 作为参数的函数
 * 在scala中，函数也是有类型，比如plus就是 <function1>
 */
object Scala03_FunParameter {
  def main(args: Array[String]): Unit = {
    def plus(x: Int) = 3 + x
    val result1 = Array(1, 2, 3, 4).map(plus(_))
    println(result1.mkString(","))
    println("puls的函数类型function1" + (plus _))
  }
}
