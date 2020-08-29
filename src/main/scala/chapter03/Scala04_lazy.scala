package chapter03

/**
 * @author mkluo
 * @date 2020/6/16 上午11:25
 * @desc 惰性函数
 */
object Scala04_lazy {
  def main(args: Array[String]): Unit = {
    // lazy 不能修饰 var 类型的变量
    lazy val res = sum(10, 20)
    println("res=" + res)
    def sum(n1: Int, n2: Int): Int = {
      println("sum() 执行了..")
      return n1 + n2
    }
  }
}
