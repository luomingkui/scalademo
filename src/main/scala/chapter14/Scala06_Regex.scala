package chapter14
import scala.util.matching.Regex
/**
 * @author mkluo
 * @date 2020/8/28 下午7:49
 * @desc 正则表达式
 */
object Scala06_Regex {
  def main(args: Array[String]): Unit = {
    val pattern1 = new Regex("(S|s)cala")
    val pattern2 = "(S|s)cala".r
    val str = "Scala is scalable and cool"
    println((pattern2 findAllIn str).mkString(","))
  }
}
