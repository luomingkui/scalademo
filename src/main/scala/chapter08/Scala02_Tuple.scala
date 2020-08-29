package chapter08

/**
  * @author luomingkui
  * @date 2018/6/11 上午7:53
  * @desc 元组Tuple：元组可以理解为一个容器，可以存放各种相同或不同类型的数据
  */
object Scala02_Tuple {
  def main(args: Array[String]): Unit = {

    // 创建元组
    val tuple1 = (1, 2, 3, "hello", 4)
    println(tuple1)

    //访问元组
    val t1 = (1, "a", "b", true, 2)
    println(t1._1) // 访问元组的第一个元素 ，从1开始
    println(t1.productElement(0)) // 0 // 访问元组的第一个元素，从0开始

    //遍历元组, 元组的遍历需要使用到迭代器
    for (item <- t1.productIterator) {
      println("item=" + item)
    }
  }
}
