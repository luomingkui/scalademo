package scala02

/**
  * @author luomingkui
  * @date 2018/6/8 下午2:09
  * @desc 常用类型。在Scala没有基本数据类型和引用数据类型这个一说
  */
object Scala02_DataType {
  def main(args: Array[String]): Unit = {

    // 常用类型
    // scala语言是完全面向对象的语言，所以没有基本类型,全是对象
    val s: String = "123"
    println(s)

    val i1: AnyRef = null
    val i: Any = i1
    println(i)

    //scala中对象调用方法是无参方法，那么小括号可以省略
    println(i1)

  }
}
