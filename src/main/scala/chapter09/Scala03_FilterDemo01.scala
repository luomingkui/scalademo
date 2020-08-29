package chapter09

/**
 * 集合元素的过滤-filter
 */
object Scala03_FilterDemo01 {
  def main(args: Array[String]): Unit = {
    // 选出首字母为A的元素
    val names = List("Alice", "Bob", "Nick")
    val names2 = names.filter(startA)
    println("names=" + names)
    println("names2=" + names2)
  }
  def startA(str:String): Boolean = {
    str.startsWith("A")
  }

}
