package scala06_02

/**
  * @author luomingkui
  * @date 2018/6/13 上午12:51
  * @desc
  */
object Scala02_Override {
  def main(args: Array[String]): Unit = {

    var emp = new Employee
    println(emp.name)
    println(emp.salary)

  }

}

class Person {
  var name = "zhangsan"
  override def toString = getClass.getName + "[name=" + name + "]"
}

class Employee extends Person {

  var salary = 0.0
  override def toString = super.toString + "[salary=" + salary + "]"
}