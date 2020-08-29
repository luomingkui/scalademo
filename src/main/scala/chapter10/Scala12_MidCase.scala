package chapter10

/**
 * @author mkluo
 * @date 2020/8/3 上午1:29
 * @desc  case 语句的中置(缀)表达式
 */
object Scala12_MidCase {
  def main(args: Array[String]): Unit = {
    List(1, 3, 5, 9) match {
      //1.两个元素间::叫中置表达式,至少first，second两个匹配才行.
      //2.first 匹配第一个 second 匹配第二个, rest 匹配剩余部分(5,9)
      case first :: second :: rest => println(first + " " + second  + " "+ rest.length + " " + rest)
      case _ => println("匹配不到...")
    }
  }
}
