package scala07

import scala.collection.mutable

/**
  * @author luomingkui
  * @date 2018/6/11 上午8:47
  * @desc 队列数据存取符合先进先出策略
  */
object Scala04_Queue {

  def main(args: Array[String]): Unit = {

    // 创建队列
    val q1 = new mutable.Queue[Int]
    println(q1)

    //队列元素的追加
    q1 +=(1)
    println(q1)


    //向队列中追加List
    q1 ++=List(2,3,4)
    println(q1)

    // 按照进入队列的顺序删除元素
    q1.dequeue()
    println(q1)


    //塞入数据
    q1.enqueue(9, 8, 7)
    println(q1)

    println(q1.head)

    println(q1.last)

    println(q1.tail)

  }


}
