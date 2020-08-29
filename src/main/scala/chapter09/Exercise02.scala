package chapter09

import scala.collection.mutable.ArrayBuffer

/**
 * 练习：val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"将 sentence 中各个字符，通过 foldLeft 存放到 一个 ArrayBuffer 中
 */

object Exercise02 {

  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    val arrayBuffer = new ArrayBuffer[Char]()
    sentence.foldLeft(arrayBuffer)(putArray)
    println("arrayBuffer=" + arrayBuffer)
  }
  def putArray(arr:ArrayBuffer[Char],c:Char): ArrayBuffer[Char] = {
    arr.append(c)
    arr
  }

}
