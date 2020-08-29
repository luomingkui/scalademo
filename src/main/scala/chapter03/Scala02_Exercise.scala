package chapter03

/**
 * @author mkluo
 * @date 2020/6/16 上午12:27
 * @desc 递归
 */
object Scala02_Exercise {

  def main(args: Array[String]): Unit = {

    /*
    题1：请使用递归的方式，求出斐波那契数1,1,2,3,5,8,13...给你一个整数n，求出它的斐波那契数是多少？
     */
    println("fbn的结果是=" + fbn(7))

    /*
    题2：求函数值 [演示]已知 f(1)=3; f(n) = 2*f(n-1)+1; 请使用递归的思想编程，求出 f(n)的值
     */
    println(f(2))

    /*
    题3：猴子吃桃子问题有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后再多吃一个。当到第十天时，想再吃时（还没吃），发现只有1个桃子了。问题：最初共多少个桃子？
     */
    println("桃子个数=" + peach(1))

  }


  // 题1：
  def fbn(n: Int): Int = {
    if (n == 1 || n == 2) {
      1
    } else {
      fbn(n - 1) + fbn(n - 2)
    }
  }

  // 题2：
  def f(n: Int): Int = {
    if (n == 1) {
      3
    } else {
      2 * f(n - 1) + 1
    }
  }

  // 题3：
  def peach(day: Int): Int = {
    if (day == 10) {
      1
    } else {
      (peach(day + 1) + 1) * 2
    }
  }

}
