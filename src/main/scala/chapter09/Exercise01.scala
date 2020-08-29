package chapter09

/**
 * 练习：请将 val names = List("Alice", "Bob", "Nick") 中的所有单词，全部转成字母大写，返回到新的 List集合中
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
    val names2 = names.map(upper)
    println("names=" + names2)
  }

  def upper(s:String): String = {
    s.toUpperCase
  }
}
