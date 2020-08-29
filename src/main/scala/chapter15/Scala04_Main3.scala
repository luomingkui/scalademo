package chapter15

/**
 * @author mkluo
 * @date 2020/8/28 下午11:48
 * @desc  视图界定
 */

class Pair3[T <% Comparable[T]](val first: T, val second: T) {
  def smaller = if (first.compareTo(second) < 0) first else second
  override def toString = "(" + first + "," + second + ")"
}

object Scala04_Main3  extends App {
    val p = new Pair3(4, 2)
    println(p.smaller)
}
