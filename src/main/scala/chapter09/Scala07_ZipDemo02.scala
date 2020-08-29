package chapter09

/**
 * @author mkluo
 * @date 2020/8/27 下午12:13
 * @desc  拉链操作
 */
object Scala07_ZipDemo02 {
  def main(args: Array[String]): Unit = {
    val zipList1 = List("name","age","sex")
    val zipList2 = List("zhangsan",28)
    val zip = zipList1.zip(zipList2)
    val toMap1 = zip.toMap
    println(zip)
    println(toMap1)
  }
}
