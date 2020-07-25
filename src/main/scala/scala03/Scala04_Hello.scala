package scala03

/**
  * @author luomingkui
  * @date 2018/6/13 上午12:27
  * @desc
  */
object Scala04_Hello {
  def main(args: Array[String]) {
    println("Hello, World!")
  }

}


object Hello extends App {
  if (args.length > 0)
    println("Hello, " + args(0))
  else
    println("Hello, World!")
}
