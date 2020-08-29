package chapter11

/**
 * @author mkluo
 * @date 2020/8/16 下午5:59
 * @desc 颗粒化
 * 编写一个函数，接收两个整数，可以返回两个数的乘积，要求:使用函数柯里化完成
 */
object Scala08_CurryDemo01 {
  def main(args: Array[String]): Unit = {
    def mulCurry2(x: Int)(y:Int) = x * y
    println(mulCurry2(10)(8))
  }
}
