package chapter09

/**
 * @author mkluo
 * @date 2020/8/27 下午12:16
 * @desc 迭代器
 */
object Scala08_IteratorDemo02 {
  def main(args: Array[String]): Unit = {
    val listIterator = List(1,2,"zhangsan")
    val iterator = listIterator.iterator
    while(iterator.hasNext){
      println(iterator.next())
    }
  }
}
