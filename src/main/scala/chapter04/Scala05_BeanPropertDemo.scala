package chapter04
import scala.beans.BeanProperty
/**
 * @author mkluo
 * @date 2020/7/25 下午11:27
 * @desc Bean属性
 */
object Scala05_BeanPropertDemo {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.name = "宝马"
    println(car.name)

    //使用 @BeanProperty 自动生成 getXxx 和 setXxx
    car.setName("奔驰")
    println(car.getName())
  }
}

class Car {
  @BeanProperty var name: String = null
}