package chapter07

/**
 * @author mkluo
 * @date 2020/7/27 下午11:37
 * @desc 隐式函数快速入门
 */
object Scala01_ImplicitNotice {
  def main(args: Array[String]): Unit = {

    //1. 隐式转换不能有二义性
    //2. 隐式转换不能嵌套使用
    implicit def f1(d: Double): Int = {
      d.toInt
    }

    val num1: Int = 1.1
    println(num1)
  }
}
