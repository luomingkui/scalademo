package chapter09

/**
 * 拉链：在开发中，当我们需要将两个集合进行 对偶元组合并，可以使用拉链。
 * 拉链使用注意事项：
 * 1) 拉链的本质就是两个集合的合并操作，合并后每个元素是一个 对偶元组。
 * 2) 如果两个集合个数不对应，会造成数据丢失。
 * 3) 集合不限于 List, 也可以是其它集合比如 Array。
 * 4) 如果要取出合并后的各个对偶元组的数据，可以遍历。
 */
object Scala07_ZipDemo01 {
  def main(args: Array[String]): Unit = {
    // 拉链
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)
    val list3 = list1.zip(list2) // (1,4),(2,5),(3,6)
    println("list3=" + list3)

  }
}
