package scala03

import scala.beans.BeanProperty

/**
  * @author luomingkui
  * @date 2018/6/12 下午9:40
  * @desc
  */
class Scala01_ClassConstructor2(@BeanProperty val name: String = "", val price: Double = 0) {
  println(name + "," + price)

}
