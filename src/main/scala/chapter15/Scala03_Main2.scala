package chapter15

/**
 * @author mkluo
 * @date 2020/8/28 下午11:45
 * @desc 泛型的下界限定
 */

class Pair2[T](val first: T, val second: T) {
  def replaceFirst[R >: T](newFirst: R) = new Pair2[R](newFirst, second)
  override def toString = "(" + first + "," + second + ")"
}
//我们可以通过下界的限定，限定我们传入的类型必须是某个类型的父类
object Scala03_Main2  extends App{
    override def main(args: Array[String]): Unit = {
      val p = new Pair2("Nick", "Alice")
      println(p)
      println(p.replaceFirst("Joke"))
      println(p)
    }
}