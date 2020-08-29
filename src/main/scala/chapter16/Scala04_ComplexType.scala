package chapter16

/**
 * @author mkluo
 * @date 2020/8/29 上午12:59
 * @desc 复合类型
 */
class A {
  def show(desc:String): Unit ={
    println(desc)
  }
}

trait B {
  def toUpper(message:String):String
}

/**
 * 现在这个类就是A和Serializable的复合类型
 * 注意：
 * with 必须是trait或者java的接口，不能是scala的类或者java类
 * 就算是抽象类也不行
 */
/*class Scala04_ComplexType extends A with java.io.Serializable with B {
  override def toUpper(message: String): String = {
    message.toUpperCase()
  }
}*/

//我们可以利用关键字type声明一个复合类型
class Scala04_ComplexType {
  type Type = A with java.io.Serializable with B
  def func(t:Type): Unit ={
    t.show("I love you")
  }
}
