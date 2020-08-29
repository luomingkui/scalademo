package chapter10

/**
 * @author mkluo
 * @date 2020/8/3 上午12:51
 * @desc 对象匹配
 */
object Scala08_MatchObjectDemo2 {
  def main(args: Array[String]): Unit = {

    val namesString = "Alice,Bob,Thomas"
    namesString match {
      // 当 执行   case Names(first, second, third)
      // 1. 会调用 unapplySeq（str）,把 "Alice,Bob,Thomas" 传入给 str
      // 2. 如果 返回的是 Some("Alice","Bob","Thomas"),分别给 （first, second, third）
      //    注意，这里的返回的值的个数需要和 （first, second, third）要一样
      // 3. 如果返回的None ,表示匹配失败

      case Names(first, second, third) => {
        println("the string contains three people's names")
        // 打印字符串
        println(s"$first $second $third")
      }
      case _ => println("nothing matched")
    }

  }
}

object Names {
  //当构造器是多个参数时，就会触发这个对象提取器
  def unapplySeq(str: String): Option[Seq[String]] = {
    if (str.contains(",")) Some(str.split(","))
    else None
  }
}
