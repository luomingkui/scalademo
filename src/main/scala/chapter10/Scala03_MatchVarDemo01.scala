package chapter10

/**
 * @author mkluo
 * @date 2020/8/2 下午11:52
 * @desc 模式中的变量
 */
object Scala03_MatchVarDemo01 {
  def main(args: Array[String]): Unit = {
    val ch = 'U'
    ch match {
      case '+' => println("yes～")
      case mychar => println("ok~" + mychar)
      case _ => println ("no～")
    }
  }
}
