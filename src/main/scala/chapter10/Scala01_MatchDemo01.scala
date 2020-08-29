package chapter10

/**
 * @author mkluo
 * @date 2020/8/2 下午11:20
 * @desc switch
 * 1) 如果所有 case 都不匹配，那么会执行 case _ 分支，类似于 Java 中 default 语句
 * 2) 如果所有 case 都不匹配，又没有写 case _ 分支，那么会抛出 MatchError
 * 3) 每个 case 中，不用 break 语句，自动中断 case
 * 4) 可以在 match 中使用其它类型，而不仅仅是字符
 * 5) => 等价于 java swtich 的 :
 * 6) => 后面的代码块到下一个 case， 是作为一个整体执行，可以使用{} 扩起来，也可以不扩。
 */
object Scala01_MatchDemo01 {
  def main(args: Array[String]): Unit = {
    val oper = '+'
    val n1 = 20
    val n2 = 10
    var res = 0

    oper match {
      case '+' => {
        res = n1 + n2
        println("hello~~")
      }
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case 1 => println("匹配到1")
      case 1.1 => println("匹配1.1")
      case _ => println("oper error")
    }
    println("res=" + res)

  }
}
