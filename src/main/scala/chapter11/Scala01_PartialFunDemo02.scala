package chapter11

/**
 * @author mkluo
 * @date 2020/8/27 下午5:53
 * @desc
 */
object Scala01_PartialFunDemo02 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, "hello")
    // 思路2：模式匹配
    // 虽然使用模式匹配比较简单，但是不够完美
    val list2 = list.map(addOne2)
    println("list2=" + list2)
  }
  def addOne2( i : Any ): Any = {
    i match {
      case x:Int => x + 1
      case _ =>
    }
  }
}
