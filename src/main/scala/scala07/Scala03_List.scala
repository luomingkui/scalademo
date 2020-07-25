package scala07

import java.util

/**
  * @author luomingkui
  * @date 2018/6/11 上午8:05
  * @desc 列表 List
  *       如果希望得到一个空列表，可以使用Nil对象。
  */
object Scala03_List {

  def main(args: Array[String]): Unit = {
    // 创建空列表
    //val a1 = new util.ArrayList[Int]()
    //val a1 =Nil;
    //println(a1)


    // 创建有初始值的列表
    // apply
    val a1 = List(1,2,3)
    println(a1(1))

    // 访问元素
    println(a1.head) // 头
    println(a1.last) // 最后
    println(a1.tail) // 尾部 （包含排除第一个以后的所有元素的新列表）


    // 增加元素
    // 增加元素需要考虑列表的位置以及对应的符号位置
    //val list2 = a1 :+ 99
    val list2 = 98 +: a1
    println(list2)

    println("========")

     //List(1, 2, 3, List(1,2,3))
     // 使用两个冒号可以增加元素，如果使用三个冒号可以将集合中的元素增加的新的列表中
     // val list4 = 1 :: 2 :: 3 :: a1 ::: Nil

    // var list4= (4, 5, 6, 1,2,3)

    val list4 = 4 :: 5 :: 6 :: a1

    println(list4)


  }

}
