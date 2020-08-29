package chapter16

import scala.collection.mutable

/**
 * @author mkluo
 * @date 2020/8/29 上午1:15
 * @desc 抽象类型
 *       是指在类或者特质中利用type关键字定义一个没有确定类型的标识，该标志在子类被确定，称这种类型为程序类型。
 */
abstract class Persons{
  //声明一个未被确定的类型
  type UndefinedType
  def show(x:UndefinedType)
}

class Students extends Persons{
  //确定抽象类型
  type UndefinedType = String
  def show(x:UndefinedType):Unit = {
    println("Student show => "+ x.toLowerCase())
  }
}

class Teachers extends Persons{
  type UndefinedType = mutable.HashMap[String,String]
  def show(x:UndefinedType):Unit = {
    for ((k,v) <- x){
      println("Teacher show key => "+k+" value=>"+v)
    }
  }
}

class Scala08_AbstractType extends App {
  val message = "Welcome You, Guys"
  val map = mutable.HashMap(("Nicky", "Math"), ("Allice", "History"), ("Judy", "English"))
  val s = new Students
  s.show(message)
  val t = new Teachers
  t.show(map)
}

// 上述代码的也可用泛型进行实现，如下：
abstract class People[T]{
  def show(x:T)
}

class Worker extends People[String]{
  def show(x:String):Unit = {
    println("Student show => "+ x.toLowerCase())
  }
}

class Leader extends People[mutable.HashMap[String,String]]{
  def show(x:mutable.HashMap[String,String]):Unit = {
    for ((k,v) <- x){
      println("Teacher show key => "+k+" value=>"+v)
    }
  }
}