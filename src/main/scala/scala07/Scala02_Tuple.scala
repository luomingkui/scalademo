package scala07

/**
  * @author luomingkui
  * @date 2018/6/11 上午7:53
  * @desc 元组可以理解为一个容器，可以存放各种相同或不同类型的数据
  */
object Scala02_Tuple {


  def main(args: Array[String]): Unit = {
    // 将多个无关的数据可以封装为一个整体，称之为元组
    // 声明元组的方式为小括号中包含数据
    val t1 = (1, 2, "Hello", true, 100)
    val t2 = ("string", 100, true,"学习");

    val (ff, mm, ee,ceshi) = t2

    println("ff = " + ff)
    println("mm = " + mm)
    println("ee = " + ee)
    println("ceshi = " + ceshi)

    println("======")

    // 访问元组的数据采用下划线和位置（计数器）来位置
    println(t2._2)

    println("======")

    for ( i <- t1.productIterator ) {
      println(i)
    }

    println("======")

    for (i<- t2.productIterator){
      println(i)
    }

  }

}
