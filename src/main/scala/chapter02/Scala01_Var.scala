package chapter02

/**
  * @author luomingkui
  * @date 2018/6/8 下午2:03
  * @desc
  */
object Scala01_Var {
  def main(args: Array[String]): Unit = {

    // 声明变量
    val s : String = "Hello Scala";
    val s1 :String = "Hello ";

    // 变量一定要初始化
    // Scala可以根据变量值推断变量类型
    // 所以变量类型可以省略
    val s2 :String = "Scala"
    // Scala中运算符其实是对象的方法
    val s3 = s1 + s2

     println(s)
     println(s1)
     println(s2)
     println(s3)

  }
}
