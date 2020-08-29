package chapter10

/**
 * @author mkluo
 * @date 2020/8/3 上午12:11
 * @desc 匹配数组
 */
object Scala05_MatchArr {
  def main(args: Array[String]): Unit = {
        val arrs = Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))
        for (arr <- arrs ) {
          val result = arr match {
            case Array(0) => "0"
            case Array(x, y) => x + "=" + y
            case Array(0, _*) => "以0开头和数组"
            case _ => "什么集合都不是"
          }
          println("result = " + result)
        }
  }
}
