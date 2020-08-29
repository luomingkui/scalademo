package chapter11

/**
 * @author mkluo
 * @date 2020/8/4 上午12:24
 * @desc 高阶函数
 */
object Scala06_HigherOrderFunction2 {
  def main(args: Array[String]): Unit = {

    //说明
    //1. minusxy是高阶函数,因为它返回匿名函数
    //2. 返回的匿名函数 (y: Int) => x - y
    //3. 返回的匿名函数可以使用变量接收

    def minusxy(x: Int) = {
      (y: Int) => x - y
    }
    val f1 = minusxy(3)
    println("f1的类型=" + f1)
    println(f1(1)) //  2
    println(f1(9)) //  -6
    println(minusxy(4)(9)) // -5

  }
}
