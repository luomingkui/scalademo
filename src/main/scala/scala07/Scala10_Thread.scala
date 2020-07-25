package scala07

/**
  * @author luomingkui
  * @date 2018/6/11 下午9:19
  * @desc 所有线程安全的集合都是以Synchronized开头的集合，例如
  *       并行集合
  */
object Scala10_Thread {

  def main(args: Array[String]): Unit = {
    /*
    SynchronizedBuffer
    SynchronizedMap
    SynchronizedPriorityQueue
    SynchronizedQueue
    SynchronizedSet
    SynchronizedStack
    */


    (1 to 5).foreach(println(_))

    println("====")

    (1 to 5).par.foreach(println(_))

    val result1 = (0 to 10000).map { case _ => Thread.currentThread.getName }.distinct
    val result2 = (0 to 10000).par.map { case _ => Thread.currentThread.getName }.distinct
    println(result1)
    println(result2)

    println("======")
    //操作符
    //这部分内容没有必要刻意去理解和记忆，语法使用的多了，自然就会产生感觉，该部分内容暂时大致了解一下即可
    val `val` = 42
    println(`val`)


  }

}
