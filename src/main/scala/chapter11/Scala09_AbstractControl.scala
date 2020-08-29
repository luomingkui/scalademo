package chapter11

/**
 * @author mkluo
 * @date 2020/8/16 下午6:21
 * @desc 抽象控制
 * 控制抽象是这样的函数，满足如下条件
 *   1) 参数是函数
 *   2) 函数参数没有输入值也没有返回值
 * 控制抽象的应用案例(使用控制抽象实现了 while 语法)
 */
object Scala09_AbstractControl {
  def main(args: Array[String]): Unit = {
    //myRunInThread 就是一个抽象控制
    //是没有输入，也没有输出的函数 f1: () => Unit
    def myRunInThread(f1: () => Unit) = {
      new Thread {
        override def run(): Unit = {
          f1()
        }
      }.start()
    }
    myRunInThread {
      () =>
        println("干活咯！5秒完成...")
        Thread.sleep(5000)
        println("干完咯！")

    }

    //简写形式
    def myRunInThread2(f1:  => Unit) = {
      new Thread {
        override def run(): Unit = {
          f1
        }
      }.start()
    }
    //对于没有输入，也没有返回值函数，可以简写成如下形式
    myRunInThread2 {
      println("干活咯！5秒完成...~~~")
      Thread.sleep(5000)
      println("干完咯！~~~")
    }

  }
}
