package chapter14
import scala.io.Source
/**
 * @author mkluo
 * @date 2020/8/28 下午2:26
 * @desc 读取词法单元和数字
 */
object Scala03_FromFile {
  def main(args: Array[String]): Unit = {
    val file3 = Source.fromFile("/Users/luomingkui/Downloads/scala.txt")
    val tokens = file3.mkString.split(",")
    println(tokens.mkString(" "))
    file3.close
  }
}
