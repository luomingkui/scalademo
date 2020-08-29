package chapter10

/**
 * @author mkluo
 * @date 2020/8/3 上午1:16
 * @desc 样例类
 */
object Scala11_CaseClassDemo01 {
  def main(args: Array[String]): Unit = {
    println("hello~~")
  }
}

abstract class Amount
case class Dollar(value: Double) extends Amount    //样例类
case class Currency(value: Double, unit: String) extends Amount //样例类
case object NoAmount extends Amount  //样例类

