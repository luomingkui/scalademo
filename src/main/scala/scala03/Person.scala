package scala03

/**
  * @author luomingkui
  * @date 2018/6/12 下午9:50
  * @desc 辅助构造器名称为this，通过不同参数进行区分，每一个辅助构造器都必须以主构造器或者已经定义的辅助构造器的调用开始
  */
class Person {
   var name = ""
   var age = 0

  def this(name: String) {
    this()
    this.name = name
  }
  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }

  def description = name + " is " + age + " years old"
}

