package scala03

/**
  * @author luomingkui
  * @date 2018/6/13 上午12:12
  * @desc
  *      对象的构造器在该对象第一次使用时调用。如果对象没有使用过，他的构造器也不会被执行。
         对象基本具有类的所有特性，就是一点，你不能设置构造器的参数。
  */
object Scala03_Dog {

  //单例对象
  //Scala中没有静态方法和静态字段，可以用object这个语法结构来达到同样的目的
  println("已初始化...")
  private var leg = 0

  def plus() = {
    leg += 1
    leg
  }

  def main(args: Array[String]): Unit = {
    Scala03_Dog.plus()
   println(Scala03_Dog.leg)

  }

}
