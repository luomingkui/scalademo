package chapter10

/**
 * @author mkluo
 * @date 2020/8/3 上午1:05
 * @desc 变量声明中的模式
 *       match 中每一个 case 都可以单独提取出来，意思是一样的.
 */
object Scala09_MatchVarDemo {
  def main(args: Array[String]): Unit = {
    val (x, y, z) = (1, 2, "hello")
    println("x=" + x)

    val (q, r) = BigInt(10) /% 3 //说明  q = BigInt(10) / 3   r = BigInt(10) % 3
    val arr = Array(1, 7, 2, 9)
    val Array(first, second, _*) = arr // 提出arr的前两个元素
    println(first, second)

  }
}
