package chapter15

/**
 * @author mkluo
 * @date 2020/8/28 下午11:43
 * @desc 泛型的上界限定
 */


class Pair1[T <: Comparable[T]](val first: T, val second: T) {
  def smaller = if (first.compareTo(second) < 0) first else second
}
//我们可以通过上界的限定，限定我们传入的类型必须是某个类型的子类
object Scala03_Main1  extends App{
    override def main(args: Array[String]): Unit = {
      val p = new Pair1("hello", "Brooks")
      println(p.smaller)
    }
}