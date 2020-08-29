package chapter14
import scala.io.Source
/**
 * @author mkluo
 * @date 2020/8/28 下午2:22
 * @desc 读取字符
 */
object Scala02_FromFile {
  def main(args: Array[String]): Unit = {
    val file2 = Source.fromFile("/Users/luomingkui/Downloads/scala.txt","UTF-8")
    for(ch <- file2){
      println(ch)
    }
    file2.close
  }
}
