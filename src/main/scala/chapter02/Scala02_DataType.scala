package chapter02

/**
  * @author luomingkui
  * @date 2018/6/8 下午2:09
  * @desc 数据类型。在Scala没有基本数据类型和引用数据类型这么一说，所有的类型都是对象。
  */
object Scala02_DataType {
  def main(args: Array[String]): Unit = {

    val s: String = "123"
    println(s)

    val i1: AnyRef = null
    val i: Any = i1

    println(i)
    println(i1)

  }
}
