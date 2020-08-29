package chapter06

/**
 * @author mkluo
 * @date 2020/8/26 下午7:15
 * @desc
 */
trait Scala07_Feline {
  def say()
}

trait Tiger extends Scala07_Feline {
  // 在特质中重写抽象方法, 需要在方法前添加 abstract override 2个关键字
  abstract override def say() = println("嗷嗷嗷")
  def king() = println("I'm king of here")
}

class Cat extends Scala07_Feline {
  override def say() = println("喵喵喵")
}

object Test extends App {
  val feline = new Cat with Tiger
  feline.say  // Cat 和 Tiger 都与 say 方法, 调用时从右往左调用, 是 Tiger 在叫
  feline.king // 可以看到即使没有 cat 中没有 king 方法, Tiger 特质也能将自己的方法混入 Cat 中
}