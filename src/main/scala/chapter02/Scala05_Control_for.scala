package chapter02

/**
  * @author luomingkui
  * @date 2018/6/8 下午3:58
  * @desc 控制结构
  */
object Scala05_Control_for {

  def main(args: Array[String]): Unit = {

    /**
      * for 循环练习
      */
    println("=== for示例1：to左右两边为前闭后闭的访问  ===")
    for (i <- 1 to 3) {
      println("i = " + i)
    }

    println("=== for示例2：until左右两边为前闭后开的访问  ===")
    for (i <- 1 until 3) {
      println("i = " + i)
    }

    println("=== for示例3：引入保护式（也称条件判断式，守卫）该语句只打印1 3。保护式满足为true则进入循环内部，满足为false则跳过，类似于Java中的continue。  ===")
    for (i <- 1 to 3 if (i != 2)) {
      println(i)
    }

    println("=== for示例4：引入变量  ===")
    for(i <- 1 to 3; j = 4 - i) {
      print(j + " ")
    }

    println("=== for示例5：引入变量  ===")
    for(i <- 1 to 3; j <- 1 to 3) {
      print(i*j + " ")
    }

    println("=== for示例6：循环返回值（将遍历过程中处理的结果返回到一个，使用yield关键字）  ===")
    val for5 = for(i <- 1 to 10) yield i
    println(for5)


    println("===  for示例7：使用花括号{}代替小括号()  ===")
    for{
      i <- 1 to 3
      j = 4 - i}
      print(i * j + " ")

    println("===  for示例8：步长控制的两种方式  ===")
    // 控制步长的第一种方式
    // Range(1,10,2)的对应的构建方法是
    // def apply(start: Int, end: Int, step: Int): Range = new Range(start, end, step)
    for (i <- Range(1, 10, 2)) {
      println("i=" + i)
    }

    //控制步长的第二种方式-for循环守卫
    for (i <- 1 to 10 if i % 2 == 1) {
      println("i=" + i)
    }

  }

}
