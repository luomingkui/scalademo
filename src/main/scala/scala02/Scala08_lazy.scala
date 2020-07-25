package scala02

/**
 * @author mkluo
 * @date 2020/6/16 上午11:25
 * @desc
 */
object Scala08_lazy {

  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)
    println("-----------------")
    println("res=" + res) //在要使用res 前，才执行 }
    def sum(n1: Int, n2: Int): Int = {
      println("sum() 执行了..")
      return n1 + n2
    }
  }

}
