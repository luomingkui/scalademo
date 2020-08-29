package chapter09

/**
 * 视图：
 * Stream 的懒加载特性，也可以对其他集合应用 view 方法来得到类似的效果，具有如下特点:
 * 1) view方法产出一个总是被懒执行的集合。
 * 2) view不会缓存数据，每次都要重新计算，比如遍历View时。
 *
 * 练习：请找到 1-100 中，数字倒序排列 和它本身相同的所有数。(1 2, 11, 22, 33 ...)
 */
object Scala10_ViewDemo01 {
  def main(args: Array[String]): Unit = {

    //如果这个数，逆序后和原来数相等，就返回true,否则返回false
    def eq(i: Int): Boolean = {
      i.toString.equals(i.toString.reverse)
    }

    //说明: 没有使用view
    val viewSquares1 = (1 to 100).filter(eq)
    println(viewSquares1)


    //说明：使用view，来完成这个问题,程序中对集合进行map,filter,reduce,fold...
    // 当你并不希望立即执行，而是在使用到结果才执行，则可以使用view来进行优化.
    val viewSquares2 = (1 to 100).view.filter(eq)
    println(viewSquares2)
    //遍历
    for (item <- viewSquares2) {
      println("item=" + item)
    }

  }
}
