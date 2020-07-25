package scala03

/**
  * @author luomingkui
  * @date 2018/6/12 下午10:55
  * @desc 伴生对象
  */
object Scala02_InnerClass02 {
  def main(args: Array[String]): Unit = {
    val chatter3 = new Network2
    val chatter4 = new Network2

    //tom 和 jack加入局域网1
    val tom2 = chatter3.join("Tom")
    val jack2 = chatter3.join("Jack")
    //Bob加入局域网2
    val bob2 = chatter4.join("Bob")
    //Tom将同属于局域网3中的Jack添加为联系人
    tom2.contacts += jack2
    //Tom将不同属于局域网3中，属于局域网4中的的Bob添加为联系人
    tom2.contacts += bob2

    println(chatter3.description)
    println(chatter4.description)

    println(tom2.description)
    println(jack2.description)
    println(bob2.description)


  }

}

import scala.collection.mutable.ArrayBuffer
// 伴生对象
class Network2 {
  private val members = new ArrayBuffer[Network2.Member]
  def join(name: String) = {
    val m = new Network2.Member(name)
    members += m
    m
  }
  def description = "该局域网中的联系人：" +
    (for (m <- members) yield m.description).mkString(", ")
}

object Network2 {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
    def description = name + "的联系人：" +
      (for (c <- contacts) yield c.name).mkString(" ")
  }
}

