package chapter03

/**
  * @author luomingkui
  * @date 2018/6/9 上午9:31
  * @desc 函数:函数的声明和调用
  */
object Scala01_Function {

  //scala 函数的申明
  def main(args: Array[String]): Unit = {

    //函数的声明事可以嵌套的
    def test(s: String): String = {
      s + "123"
    }

    def test1(s: String) = {
      s + "456"
    }

    def test2(s: String) = {
      if (s == "1") {
        "123"
      } else {
        "456"
      }
    }

    val result = test("111")
    println(result)

    val result1 = test1("111")
    println(result1)

    val result2 = test2("1")
    println(result2)


  }
}
