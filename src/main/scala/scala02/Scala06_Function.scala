package scala02

/**
  * @author luomingkui
  * @date 2018/6/9 上午9:31
  * @desc 函数的声明和调用
  */
object Scala06_Function {


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

    println("======")
    val r3 = test2("1")
    val r4 = test2("2")
    println("r3 = " + r3.getClass.getName + ":" + r3)
    println("r4 = " + r4.getClass.getName + ":" + r4)





    // 方法可以传递多个参数，参数可以设定默认值，如果在调用方法时，没有传递指定参数，就会采用默认值
    def test5(s1: String, s2: String = "1"): String = {
      s1 + s2
    }




    println(test5("a"))


    println("======")

    def test6(s: String, start: String = "<<<", end: String = ">>>"): String = {
      start + s + end
    }

    println(test6("Scala"))


    println("===77777===")

    def test7(args: Int*): Unit = {
      var result = 0
      for (arg <- args)
        result += arg
    }

    println(test7(1, 2, 3));

    println("======")


    // 递归函数在使用时必须有明确的返回值类型
    def factorial(n: Int): Int = {
      if (n <= 0)
        1
      else
        n * factorial(n - 1)
    }

    println(factorial(2))


    println("*************")

    def test8(s: String) = {
      "123"
    }

    println(test8("1"))


    println("*************")

    def test9(): Unit = {
      println("lazy test9");
    }

    lazy val r9 = test9()
    println("after invoke...");
    println(r9)

  }
}
