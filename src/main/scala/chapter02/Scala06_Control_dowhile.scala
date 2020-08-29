package chapter02

/**
 * @author mkluo
 * @date 2020/8/26 下午2:54
 * @desc scala 中do...while使用
 */
object Scala06_Control_dowhile {
  def main(args: Array[String]): Unit = {

    var i = 0
    do {
      printf(i + ": hello Scala \n" )
      i += 1
    } while (i < 10)

  }
}
