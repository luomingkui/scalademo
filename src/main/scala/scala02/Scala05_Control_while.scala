package scala02

import scala.util.control.Breaks

/**
  * @author luomingkui
  * @date 2018/6/8 下午7:08
  * @desc scala 中while的使用
  */
object Scala05_Control_while {

  def main(args: Array[String]): Unit = {
   /* var n:Int=1
    var while1 = while (n<=10){
      n+=1
    }
    println(while1.getClass.getName)
    println(while1)
    println(n+"=")
    println(n.getClass.getName)*/

    var n = 1;
    val loop = new Breaks
    var loop1 = new Breaks;
    // 可以实现嵌套循环
    loop.breakable{
      loop1.breakable{
        while(n <= 20) {
          n += 1;
          if (n == 15) {
            loop.break()
          }
        }
      }
    }
    println(n);

  }

}
