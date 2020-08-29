package chapter10

/**
 * @author mkluo
 * @date 2020/8/3 上午12:29
 * @desc 匹配元组
 */
object Scala07_MatchTupleDemo01 {
  def main(args: Array[String]): Unit = {
    for (pair <- Array((0, 1), (1, 0), (10, 30), (1, 1), (1, 0, 2))) {
      val result = pair match {
        case (0, _) => "0 ..."
        case (y, 0) => y
        case (x, y) => (y, x)
        case _ => "other"
      }
      println(result)
    }

  }
}
