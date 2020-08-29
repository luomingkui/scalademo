package chapter16

/**
 * @author mkluo
 * @date 2020/8/29 上午12:32
 * @desc 单例类型 this.type
 */
class Person {
  private var name:String = null
  private var age:Int = 0
  def setName(name:String):this.type = {
    this.name=name
    //返回对象本身
    this
  }
  def setAge(age:Int):this.type={
    this.age=age
    //返回对象本身
    this
  }
  override def toString()="name:"+name+" age:"+age
}