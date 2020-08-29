package chapter16

import scala.collection.mutable.ArrayBuffer

/**
 * @author mkluo
 * @date 2020/8/29 上午12:46
 * @desc 类型投影
 */
class NetWork {
  class Member(val name:String){
    val contacts = new ArrayBuffer[NetWork#Member]()
  }

  private val members = new ArrayBuffer[NetWork.this.Member]
  def join(name:String) = {
    val m = new Member(name)
    members += m
    m
  }
}