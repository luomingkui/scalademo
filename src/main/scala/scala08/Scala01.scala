package scala08

/**
  * @author luomingkui
  * @date 2018/6/12 下午7:09
  * @desc 高阶函数
  */
object Scala01 {

  def main(args: Array[String]): Unit = {
    println("===作为参数的函数===")
    //作为参数的函数:函数作为一个变量传入到了另一个函数中，那么该作为参数的函数的类型是：function1，即：（参数类型） => 返回类型
    //注：带有一个参数的函数的类型是function1，带有两个是function2，以此类推
    def plus(x: Int) = 3 + x
    val result1 = Array(1, 2, 3, 4).map(plus(_))
    println(result1.mkString("-"))

    println("===匿名函数===")
    //即没有名字的函数，可以通过函数表达式来设置匿名函数。
    val triple = (x: Int) => 3 * x
    println(triple(3))

    println("===高阶函数===")
    //能够接受函数作为参数的函数，叫做高阶函数。
    // 高阶函数的使用
    def highOrderFunction1(f: Double => Double) = f(10)
    def minus7(x: Double) = x - 7
    val result2 = highOrderFunction1(minus7)
    println(result2)
    // 高阶函数同样可以返回函数类型
    def minusxy(x: Int) = (y: Int) => x - y
    val result3 = minusxy(3)(5)
    println(result3)

    println("===参数（类型）推断===")
    // 传入函数表达式
    highOrderFunction1((x: Double) => 3 * x)
    // 参数推断省去类型信息
    highOrderFunction1((x) => 3 * x)
    // 单个参数可以省去括号
    highOrderFunction1(x => 3 * x)
    // 如果变量旨在=>右边只出现一次，可以用_来代替
    highOrderFunction1(3 * _)


  }

}
