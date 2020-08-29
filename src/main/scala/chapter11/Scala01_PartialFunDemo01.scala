package chapter11

/**
 * @author mkluo
 * @date 2020/8/3 下午11:20
 * @desc 偏函数引出
 */
object Scala01_PartialFunDemo01 {
  def main(args: Array[String]): Unit = {
    //思路1：filter + map 方式解决
    // 虽然可以解决问题，但是麻烦
    val list = List(1, 2, 3, 4, "hello")
    // 先过滤，再map
    println(list.filter(f1).map(f3).map(f2))
  }
  def f1(n: Any): Boolean = {
    n.isInstanceOf[Int]
  }
  def f2(n: Int): Int = {
    n + 1
  }
  def f3(n: Any): Int = {
    n.asInstanceOf[Int]
  }
}
