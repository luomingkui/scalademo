package chapter08

import scala.collection.mutable

/**
  * @author luomingkui
  * @date 2018/6/11 上午8:47
  * @desc 队列数据存取符合先进先出策略
  *  1) 队列是一个有序列表，在底层可以用数组或是链表来实现。
  *  2) 其输入和输出要遵循先入先出的原则。即:先存入队列的数据，要先取出。后存入的要后取
  *  3) 在 Scala 中，由设计者直接给我们提供队列类型 Queue 使用。
  *  4) 在 scala 中, 有 scala.collection.mutable.Queue 和 scala.collection.immutable.Queue , 一般来说，我们在开发中通常使用可变集合中的队列。
  */
object Scala05_Queue {
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
