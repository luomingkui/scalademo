package chapter14
import scala.io.Source
/**
 * @author mkluo
 * @date 2020/8/28 下午2:12
 * @desc 读取行
 */
object Scala01_FileSyllabus {
  def main(args: Array[String]): Unit = {
    //文件读取
    val file1 = Source.fromFile("/Users/luomingkui/Downloads/scala.txt")
    val lines = file1.getLines
    for (line <- lines) {
      println(line)
    }
    file1.close
  }
}