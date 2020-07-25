package scala03

/**
  * @author luomingkui
  * @date 2018/6/12 下午10:57
  * @desc 投影
  */
object Scala02_InnerClass03 {
  def main(args: Array[String]): Unit = {

    val chatter5 = new Network3
    val chatter6 = new Network3

    //Fred 和 Wilma加入局域网1
    val fred3 = chatter5.join("Fred")
    val wilma3 = chatter5.join("Wilma")
    //Barney加入局域网2
    val barney3 = chatter6.join("Barney")
    fred3.contacts += wilma3


  }

}

import scala.collection.mutable.ArrayBuffer

//投影
class Network3 {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Network3#Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}
