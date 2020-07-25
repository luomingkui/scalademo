package scala09

/**
  * @author luomingkui
  * @date 2018/6/13 上午12:43
  * @desc 和Java一样使用extends关键字，在定义中给出子类需要而超类没有的字段和方法，或者重写超类的方法。
  *       注：如果类声明为final，他将不能被继承。如果单个方法声明为final，将不能被重写。
  */
object Scala01_Extends {
  def main(args: Array[String]): Unit = {

    val e = new Manager("lisi")
    e.name = "zhangsan"
    println(e.description)

    println("======")
    val obj = new Ant2
    println(obj.env.length)
  }
}

class Person1 {
  var name = ""
}

// 子类继承父类的时候，会默认调用父类的主构造函数
// 如果父类主构造函数需要参数，子类在继承的时候，也需要提供参数
class Employee(s: String) extends Person1 {
  val salary = 0.0
  name = s

  def description = "员工姓名：" + name + ", 薪水：" + salary
}

class Manager(s: String) extends Employee(s) {
  override val salary = 100.0
  override def description = super.description
}

class Creature {
  val range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override val range = 2
}

class Ant2 extends {
  override val range = 3
} with Creature
