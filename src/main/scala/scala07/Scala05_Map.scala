package scala07

/**
  * @author luomingkui
  * @date 2018/6/11 上午8:52
  * @desc 类比Java的map集合学习即可。
  */
object Scala05_Map {

  def main(args: Array[String]): Unit = {

    // Scala中Map
    // 不可变Map集合无法添加KV数据
    val map = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
    println(map)


    // 可变Map集合，可以添加KV数据
    val map2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
    println(map2)

    map2 += ("D"->4, "E" -> 5)
    println(map2)

    val map3 = new scala.collection.mutable.HashMap[String, Int]
    println(map3)

    // 对偶元组
    val map4 = Map(("Alice", 10), ("Bob", 20), ("Kotlin", 30))
    println(map4)

    println("======")

    // 获取集合中的元素
    // 获取不存在的key的场合，scala会发生错误
    //println(map4("Bob1"));
    // 采用get方法获取的结果要么是None（无值）或Some(有值),采用get方法获取即可
    // println(map4.get("Bob").get);
    // 采用getOrElse方法获取的结果如果不存在，不会发生错误，而是将第二个参数作为默认值返回
     println(map4.getOrElse("Bob1", 100))

   /* println("======")
    map2("Bob") = 50
    println(map2)

    println("======")

    map2 -= ("Bob")
    println(map2)

    println("======")*/
    println("==下面是遍历====")

    println(map2)
    // 循环遍历
    for ((k, v) <- map2) println(k + " is mapped to " + v)
    println("======")
    for (k <- map2.keys) println(k)
    println("======")
    for (v <- map2.values) println(v)
    println("======")
    for (v <- map2) println(v._1 + "=>" + v._2)


  }



}
