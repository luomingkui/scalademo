package chapter06

/**
 * @author mkluo
 * @date 2020/7/26 下午11:03
 * @desc 伴生对象 apply 方法: 在伴生对象中定义 apply 方法，可以实现: 类名(参数) 方式来创建对象实例.
 */
object Scala02_ApplyDemo {
  def main(args: Array[String]): Unit = {

    //使用apply方法来创建对象
    val pig2 = Pig("小黑猪") //自动  apply(pName: String)
    val pig3 = Pig() // 自动触发 apply()

    println("pig2.name=" + pig2.name) //小黑猪
    println("pig3.name=" + pig3.name) //匿名猪猪
  }
}

//案例演示apply方法.
class Pig(pName:String) {
  var name: String = pName
}

object Pig {
  //编写一个apply
  def apply(pName: String): Pig = new Pig(pName)
  def apply(): Pig = new Pig("匿名猪猪")
}
