package chapter10

/**
 * @author mkluo
 * @date 2020/8/2 下午11:34
 * @desc 守卫:如果想要表达匹配某个范围的数据，就需要在模式匹配中增加条件守卫
 */
object Scala02_MatchIfDemo01 {
  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.toString.equals("3") => digit = 3
        case _ if (ch > 1110 || ch < 120) => println("ch > 10")
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + digit)
    }

  }
}
