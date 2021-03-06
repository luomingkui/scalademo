package chapter01

/**
  * @author luomingkui
  * @date 2018/6/8 下午1:01
  * @desc
  */

// 类对象，其中声明的都是类似于java中静态的方法，可以直接调用
// Scala是一个完全面向对象的语言，所以没有静态的关键字，所以需要采用object声明
object HelloScala {
  // def关键字用于声明函数
  // 类似于java中的main方法
  def main(args: Array[String]): Unit = {
    System.out.println("Hello Scala");
    println("*" * 10)
  }
}
