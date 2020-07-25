package scala07

/**
  * @author luomingkui
  * @date 2018/6/11 下午8:56
  * @desc stream是一个集合。
  *       这个集合，可以用于存放，无穷多个元素，但是这无穷个元素并不会一次性生产出来，
  *       而是需要用到多大的区间，就会动态的生产，末尾元素遵循lazy规则。
  */
object Scala08_Stream {

  def main(args: Array[String]): Unit = {

    //使用#::得到一个stream
    def numsForm(n: BigInt) : Stream[BigInt] ={
      n #:: numsForm(n + 1)

    }

    val tenOrMore = numsForm(10)
    println(tenOrMore)

    println(tenOrMore.tail.head)
    println(tenOrMore)



  }

}
