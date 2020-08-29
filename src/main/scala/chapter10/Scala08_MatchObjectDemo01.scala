package chapter10

/**
 * @author mkluo
 * @date 2020/8/3 上午12:36
 * @desc 对象匹配
 * 对象匹配，什么才算是匹配呢?，规则如下:
 * 1) case中对象的unapply方法(对象提取器)返回Some集合则为匹配成功
 * 2) 返回 None 集合则为匹配失败
 */
object Scala08_MatchObjectDemo01 {
  def main(args: Array[String]): Unit = {
    // 模式匹配使用：
    val number: Double = Square(5.0) // 36.0
    number match {
      //说明 case Square(n) 的运行的机制
      //1. 当匹配到 case Square(n)
      //2. 调用Square 的 unapply(z: Double),z 的值就是 number
      //3. 如果对象提取器 unapply(z: Double) 返回的是Some(6) ,则表示匹配成功，同时将6 赋给 Square(n) 的n
      //4.  果对象提取器 unapply(z: Double) 返回的是None ,则表示匹配不成功
      case Square(n) => println("匹配成功 n=" + n)
      case _ => println("nothing matched")
    }
  }
}
object Square {
  //说明
  //1. unapply方法是对象提取器
  //2. 接收z:Double 类型
  //3. 返回类型是Option[Double]
  //4. 返回的值是 Some(math.sqrt(z)) 返回z的开平方的值，并放入到Some(x)
  def unapply(z: Double): Option[Double] = {
    println("unapply被调用 z 是=" + z)
    Some(math.sqrt(z))
    //None
  }
  def apply(z: Double): Double = z * z
}
