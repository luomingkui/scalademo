package chapter11

/**
 * @author mkluo
 * @date 2020/8/27 下午6:08
 * @desc 值函数
 */
object Scala02_ValueDemo {
    def main(args: Array[String]) {
      println( "Returned Value : " + addInt() );
    }

    def addInt( a:Int = 5, b:Int = 7 ) : Int = {
      var sum:Int = 0
      sum = a + b
      return sum
    }
}