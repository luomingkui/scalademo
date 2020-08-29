package chapter01

import scala.io.StdIn

/**
 * @author mkluo
 * @date 2020/8/26 下午12:07
 * @desc
 */
object InputCon {
  def main(args: Array[String]): Unit = {
    /*
    要求：可以从控制台接收用户信息，【姓名，年龄，薪水】
     */
    println("请输入姓名")
    val name = StdIn.readLine()
    println("请输入年龄")
    val age = StdIn.readInt()
    println("请输入薪水")
    val sal = StdIn.readDouble()
    printf("用户的信息为 name=%s age=%d sal=%.2f", name, age, sal)
  }
}
