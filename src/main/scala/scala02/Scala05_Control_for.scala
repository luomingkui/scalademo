package scala02

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
    for (i <- 1 to 3) {
      println("i = " + i)
    }
    println("======")

    for (i <- 1 until 3) {
      println("i = " + i)
    }
    println("======")

    for (i <- 1 to 3 if (i != 2)) {
      println(i)
    }

    println("======")

    for (i <- 1 to 3; j <- 1 to 3) {
      println(i +j)
    }
    println("======")

    var f1= for {
      i<- 1 to 3
      j<- 1 to 3
    } yield i+j

    println(f1.getClass.getName+"="+f1);

    println("=====")
    for (i <- 1.to(10) if (i != 2)) {
      println(i)
    }

    println("=====")
    var s= 123
    s=456;
    println(s.getClass)


    println("=====")

    val ff = 5 to 1 by -1 ;
    println(ff)

  }

}
