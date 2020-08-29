package chapter10

/**
 * @author mkluo
 * @date 2020/8/27 下午4:37
 * @desc  案例：异常处理
 */
object Scala04_MatchTypeDemo02 {
  def main(args: Array[String]): Unit = {
    import java.io._

    def processException(e: Exception) {
      e match {
        case e1: IllegalArgumentException => println("you have illegal arguments! exception is: " + e1)
        case e2: FileNotFoundException => println("cannot find the file you need read or write!, exception is: " + e2)
        case e3: IOException => println("you got an error while you were doing IO operation! exception is: " + e3)
        case _: Exception => println("cannot know which exception you have!" )
      }
    }
    processException(new IOException("not such file"))
  }
}