package chapter05

/**
 * @author mkluo
 * @date 2020/7/26 下午10:06
 * @desc 抽象类
 */
object Scala06_AbstractDemo {
  def main(args: Array[String]): Unit = {
    println("xxx")
  }
}

//抽象类
abstract class Animal{
  var name : String //抽象的字段
  var age : Int // 抽象的字段
  var color : String = "black" //普通属性
  def cry() //抽象方法,不需要标记 abstract
}

