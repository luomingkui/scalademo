package chapter05

/**
 * @author mkluo
 * @date 2020/7/26 下午5:50
 * @desc 继承
 */
object Scala02_Extends {
    def main(args: Array[String]): Unit = {
      //使用
      val student = new Student
      student.name = "jack" //调用了 student.name() //调用到从 Person 继承的 name() student.studying()
      student.showInfo()
    }
}

class Person {
   var name : String = _
   var age : Int = _
    def showInfo(): Unit = {
      println("学生信息如下:")
      println("名字:" + this.name)
    }
}

//Student 类继承 Person
class Student extends Person {
  def studying(): Unit = { //这里可以使用父类的属性 println(this.name + "学习 scala 中....")
  }
}