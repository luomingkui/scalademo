package chapter11

/**
 * @author mkluo
 * @date 2020/8/3 下午11:51
 * @desc 便函数的简写
 */
object Scala01_PartialFunDemo04 {
  def main(args: Array[String]): Unit = {

    //第一种简写形式
    def partialFun2: PartialFunction[Any,Int] = {
      case i:Int => i + 1
      case j:Double => (j * 2).toInt
    }
    val list = List(1, 2, 3, 4, 1.2, 2.4, 1.9f, "hello")
    val list2 = list.collect(partialFun2)
    println("list2=" + list2)

    //第二种简写形式
    val list3 = list.collect{
      case i:Int => i + 1
      case j:Double => (j * 2).toInt
      case k:Float => (k * 3).toInt
    }
    println("list3=" + list3)

  }
}
