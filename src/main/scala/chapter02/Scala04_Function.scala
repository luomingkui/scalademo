package chapter02

import scala.math._
/**
 * @author luomingkui
 * @date 2018/6/8 下午2:41
 * @desc 调用函数与方法
 */
object Scala04_Function {
  def main(args: Array[String]): Unit = {

    // scala是函数式编程语言，所以全都是函数，类中函数称之为方法。
    // scala中哪些类（对象）不需要导包就能使用：java.lang, scala
    // 在导包的时候，如果使用下划线，表示这个包下的所有函数全都可以直接调用
    // 调用函数演示：
    val i1 = sqrt(4)
    val i2 = max(10, 11)
    println(i1)
    println(i2)

    // object类对象中的函数可以通过对象名直接调用，但是类中函数（方法）必须构建对象后才可以使用
    // 调用方法演示：
    var user = new User();
    user.test()

  }
}

class User {
  def test(): Unit = {
    println("test");
  }
}