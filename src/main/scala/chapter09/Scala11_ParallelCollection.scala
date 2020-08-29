package chapter09

/**
 * @author mkluo
 * @date 2020/8/27 下午2:20
 * @desc 并行集合
 */
object Scala11_ParallelCollection {
  def main(args: Array[String]): Unit = {

    // 打印1~5
    (1 to 5).foreach(println(_))
    println()
    (1 to 5).par.foreach(println(_))

    // 查看并行集合中元素访问的线程
    val result1 = (0 to 10000).map{case _ => Thread.currentThread.getName}.distinct
    val result2 = (0 to 10000).par.map{case _ => Thread.currentThread.getName}.distinct
    println(result1)
    println(result2)

  }
}
