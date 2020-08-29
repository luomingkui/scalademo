package chapter04

/**
 * @author mkluo
 * @date 2020/7/25 下午10:14
 * @desc 类和对象
 */
object Scala02_CreateObj {
  def main(args: Array[String]): Unit = {
    // emp 类型就是 Emp //如果我们希望将子类对象，交给父类的引用，这时就需要写上类型 val emp2: Person = new Emp
    val emp = new Emp
  }
}

class Person {}
class Emp extends Person {}
