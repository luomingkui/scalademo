package scala03

/**
  * @author luomingkui
  * @date 2018/6/12 下午10:47
  * @desc
  */
object Scala02_InnerClass {

  def main(args: Array[String]): Unit = {
    //创建两个局域网
    val chatter1 = new Network
    val chatter2 = new Network

    //Fred 和 Wilma加入局域网1
    val tom = chatter1.join("Tom")
    val jack = chatter1.join("Jack")
    //Barney加入局域网2
    val bob = chatter2.join("Bob")

    //tom将同属于局域网1中的jack添加为联系人
    tom.contacts += jack
    //tom.contacts += bob //这样做是不行的，tom和bob不属于同一个局域网，即，tom和bob不是同一个class Member实例化出来的对象

  }

}


import scala.collection.mutable.ArrayBuffer
//嵌套类
class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }
  private val members = new ArrayBuffer[Member]
  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}