package scala10

/**
  * @author luomingkui
  * @date 2018/6/13 上午12:58
  * @desc
  */
object Scala01_Trait01 {


 // Logger with Cloneable with Serializable是一个整体，extends这个整体
 // 所有的java接口都可以当做Scala特质使用。


  def main(args: Array[String]): Unit = {

    // 1）使用trait关键字声明特质
    //    1-1）所有面向对象的语言都不支持类的多继承，但是都可以支持接口（特质）的多实现（混入）
    // 2）子类混入特质，重写其中的抽象方法
    //    2-1）如果类存在父类，那么需要使用extends关键字继承父类，然后采用with关键字混入特质
    //    2-2）如果类没有父类，那么可以直接使用extends关键字混入特质
    // 3）一般情况下，混入特质（实现接口）是在声明类的时候，
    // 4）但是scala支持在创建对象的同时混入特质。
    // 5）这种处理方式对于抽象类的实例化是非常好的，因为可以将抽象的方法补充完整
    val account = new SavingsAccount with ConsoleLogger
    account.withdraw(100)
  }
}
trait Logger {
  def log(msg: String)
}

trait ConsoleLogger extends Logger {
  def log(msg: String) {
    println(msg)
  }
}

class Account {
  protected var balance = 0.0
}

abstract class SavingsAccount extends Account with Logger {
  def withdraw(amount: Double) {
    if (amount > balance) log("余额不足")
    else balance -= amount
  }
}



