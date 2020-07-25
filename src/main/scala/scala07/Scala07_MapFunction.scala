package scala07

/**
  * @author luomingkui
  * @date 2018/6/11 下午8:04
  * @desc  集合元素与函数的映射
  */
object Scala07_MapFunction {

  def main(args: Array[String]): Unit = {

    //将集合中的每一个元素通过指定功能（函数）映射（转换）成新的结果集合
    val names = List("Alice","Bob","Nick")
    //集合中每一个元素转换为大写
    println(names.map(_.toUpperCase))
    //集合中每一个元素转换为小写
    println(names.map(_.toLowerCase))

    // flatmap：flat即压扁，压平，扁平化，效果就是将集合中的每个元素的子元素映射到某个函数并返回新的集合
    println(names.flatMap(_.toUpperCase()))


    println("===化简、折叠、扫描===")
    val list=List(1,2,3,4,5)

    //((（1 - 2) - 3) - 4) - 5)
    val i1 = list.reduceLeft(_-_)
    //  (1 - (2 - (3 - (4 - 5))))
    val i2 = list.reduceRight(_-_)
    println(i1)
    println(i2)


    //函数的颗粒化
    println("===fold===")
    //参与加运算
    val list2 = List(1, 9, 2, 8)
    val i4 = list2.fold(0)((sum, y) => sum + y)
    println(i4)

    println("===foldRight===")
    val list3 = List(1, 9, 2, 8)
    val i5 = list3.foldRight(10)(_ - _)
    println(i5)


    println("===foldLeft===")
    //0-1-9-2-8=-20
    val list4 = List(1, 9, 2, 8)
    val i6 = (0 /: list4)(_ - _)
    println(i6)

    println("===统计一句话中，各个文字出现的次数===")
    val sentence = "一首现luomk 哈哈代诗《笑里藏刀》:哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈刀哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈"
    val i7 = (Map[Char, Int]() /: sentence)((m, c) => m + (c -> (m.getOrElse(c, 0) + 1)))
     println(i7)

    //这个理解需要结合上面的知识点，扫描，即对某个集合的所有元素做fold操作，但是会把产生的所有中间结果放置于一个集合中保存。
    println("=== 折叠，化简，扫描===")
    val i8 = (1 to 10).scanLeft(0)(_ + _)
    val i88 = (1 to 10).foldLeft(0)(_ + _)
    println(i8)
    println(i88)


    println("===拉链===")
    val list1 = List("15837312345", "13737312345", "13811332299")
    val list11 = List("张三", "李四")
    val z1=list1 zip list11
    println(z1)


    println("=== 迭代器===")
    //你可以通过iterator方法从集合获得一个迭代器，通过while循环和for表达式对集合进行遍历。
    val iterator = List(1, 2, 3, 4, 5).iterator
    /*while (iterator.hasNext) {
      println(iterator.next())
    }*/
   // 或：
    for(enum <- iterator) {
      println(enum)
    }







  }

}
