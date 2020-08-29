package chapter08
import scala.collection.mutable
/**
  * @author luomingkui
  * @date 2018/6/11 上午8:52
  * @desc Scala中map详细讲解。
  */
object Scala06_MapDemo {

  def main(args: Array[String]): Unit = {

    // 构建的4种方式：
    // 方式1：构造不可变映射
    val map = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
    println(map)
    // 方式2：构造可变映射
    val map2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
    println(map2)
    map2 += ("D"->4, "E" -> 5)
    println(map2)
    //方式3：创建空的映射
    val map3 = new scala.collection.mutable.HashMap[String, Int]
    println(map3)
    // 方式4：对偶元组
    val map4 = Map(("Alice", 10), ("Bob", 20), ("Kotlin", 30))
    println(map4)

    // 取值的4中方式：
    // 方式1：使用 map(key)【如果 key 存在则返回对应的值，如果 key 不存在则抛出异常[java.util.NoSuchElementException]；在 Java 中,如果 key 不存在则返回 null】
    //println(map4("Alice")) //10
    //println(map4("Alice~")) //java.util.NoSuchElementException: key not found

    // 方式2：使用 contains 方法检查是否存在 key。【返回Boolean，如果key存在则返回true、如果 key 不存在则返回 false】
    if (map4.contains("Alice")) {
      println("key 存在，值=" + map4("Alice")) }
    else {
      println("key 不存在:)")
    }

    //方式3：使用 map.get(key).get 取值
    // 1) map.get方法会将数据进行包装
    // 2) 如果 map.get(key) key 存在返回 some,如果 key 不存在，则返回 None
    // 3) 如果 map.get(key).get key 存在，返回 key 对应的值 , 否则，抛出异常java.util.NoSuchElementException: None.get
    println(map4.get("Alice").get)
    //println(map4.get("Alice~").get) // 抛出异常

    // 方式4：使用 map4.getOrElse()取值。如果key存在返回key对应的值。如果key不存在返回默认值。
    println(map4.getOrElse("Alice~~~","默认的值 鱼 <・)))><<"))

    // 对Map进行修改、添加、删除
    // 更新 map 的元素：map 是可变的才能修改否则报错。如果key存在则修改对应的值,key不存在等价于添加一个 key-val。
    val map5 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    map5("A") = 20 //增加
    println("map5=" + map5)
    // 添加：
    map5 += ("A" -> 100)
    println("map5=" + map5)
    // 删除：
    map5 -= ("A", "B", "AAA") //
    println("map5=" + map5)

    // MAP 的遍历
    for ((k, v) <- map2) println(k + " is mapped to " + v)
    for (k <- map2.keys) println(k)
    for (v <- map2.values) println(v)
    for (v <- map2) println(v._1 + "=>" + v._2)
  }
}
