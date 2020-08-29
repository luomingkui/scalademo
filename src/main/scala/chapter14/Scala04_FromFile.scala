package chapter14
import scala.io.{Source, StdIn}
/**
 * @author mkluo
 * @date 2020/8/28 下午7:38
 * @desc 读取网络资源、文件写入、控制台操作
 */
object Scala04_FromFile {
  def main(args: Array[String]): Unit = {
    // 读取网络资源
    val webFile = Source.fromURL("http://www.baidu.com")
    webFile.foreach(print)
    webFile.close()

    // 写入数据到文件
    import java.io.{File, PrintWriter}
    val writer = new PrintWriter(new File("hello.txt"))
    for (i <- 1 to 100)
      writer.println(i)
     writer.close()

    //控制台操作
    //控制台交互--老API
    print("请输入内容:")
    val consoleLine1 = Console.readLine()
    println("刚才输入的内容是:" + consoleLine1)

    //控制台交互--新API
    print("请输入内容(新API):")
    val consoleLine2 = StdIn.readLine()
    println("刚才输入的内容是:" + consoleLine2)

  }
}
