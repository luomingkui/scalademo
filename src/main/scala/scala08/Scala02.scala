package scala08

import scala.collection.GenSeq

/**
  * @author luomingkui
  * @date 2018/6/12 下午7:28
  * @desc 闭包与颗粒化
  */
object Scala02 {
  def main(args: Array[String]): Unit = {


    println("===闭包===")
    def minusxy(x: Int) = (y: Int) => x - y
    val f1 = minusxy(10)
    val f2 = minusxy(10)
    println(f1(3) + f2(3))

    println("===闭包与颗粒化===")
    def play(x:Int)(y:Int)={
      x+y
    }
    println(play(6)(9))


    println("===柯里化===")
    // 函数编程中，接受多个参数的函数都可以转化为接受单个参数的函数，这个转化过程就叫柯里化，柯里化就是证明了函数只需要一个参数而已。
    // 其实我们刚才的学习过程中，已经涉及到了柯里化操作，所以这也印证了，柯里化就是以函数为主体这种思想发展的必然产生的结果。
    def mul(x: Int, y: Int) = x * y
    println(mul(10, 10))

    def mulCurry(x: Int) = (y: Int) => x * y
    println(mulCurry(10)(9))

    def mulCurry2(x: Int)(y:Int) = x * y
    println(mulCurry2(10)(8))

    println("===柯里化的应用===")
    //不要设立柯里化存在的意义这样的命题，柯里化，是面向函数思想的必然产生结果。
    //比较两个字符串在忽略大小写的情况下是否相等，注意，这里是两个任务：
    val a = Array("Hello", "World")
    val b = Array("hello", "world")
    println(a.corresponds(b)(_.equalsIgnoreCase(_)))


  }

}
