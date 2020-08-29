package chapter16

/**
 * @author mkluo
 * @date 2020/8/29 上午12:48
 * @desc 类型投影
 */
object Scala02_Demo01 extends App{
  val chatter = new NetWork
  val myFace = new NetWork
  /**
   * 现在chatter.Member和 myFace.Member和是不同的类
   * 你不可以将其中一个member添加到另外一个member
   */
  val fred = chatter.join("Fred")
  val banery = myFace.join("Banery")
  //这样是有问题的
  fred.contacts += banery
}