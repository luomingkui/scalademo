package chapter09

/**
 * flatmap映射: flat 即压扁，压平，扁平化映射，效果就是将集合中的每个元素的子元素映射到某个函数并返回新的集合。
 */
object Scala02_FlatMapDemo01 {
  def main(args: Array[String]): Unit = {
    // 将List集合中的所有元素，进行扁平化操作，即把所有元素打散
    val names = List("Alice", "Bob", "Nick")
    val names2 = names.flatMap(upper)
    println("names2=" + names2)
  }
  def upper( s : String ) : String = {
    s. toUpperCase
  }
}
