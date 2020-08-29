package chapter09

/**
 * 迭代器
 */
object Scala08_IteratorDemo01 {
  def main(args: Array[String]): Unit = {
    val iterator = List(1, 2, 3, 4, 5).iterator // 得到迭代器

    println(" === 遍历方式1 while === ")
    while (iterator.hasNext) {
      println(iterator.next())
    }

    println(" === 遍历方式2 for === ")
    for(enum <- iterator) {
      println(enum)
    }
  }
}
