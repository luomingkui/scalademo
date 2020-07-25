package scala08

/**
  * @author luomingkui
  * @date 2018/6/12 下午7:48
  * @desc 控制抽象
  */
object Scala03 {
  def main(args: Array[String]): Unit = {

    // 控制抽象是一类函数：
    // 1、参数是函数。
    // 2、函数参数没有输入值也没有返回值。

    def runInThread(f1: () => Unit): Unit = {
      new Thread {
        override def run(): Unit = {
          f1()
        }
      }.start()
    }

    runInThread {
      () => println("干活咯！")
        //Thread.sleep(5000)
        println("干完咯！")
    }


    //是不是很爽？是不是有点类似线程池的感觉，同一个线程，可以动态的向里面塞不同的任务去执行。

    println("===可以再简化一下，省略()，看下如下形式===")
    def runInThread1(f1: => Unit): Unit = {
      new Thread {
        override def run(): Unit = {
          f1
        }
      }.start()
    }

    runInThread1 {
      println("干活咯！")
      //Thread.sleep(5000)
      println("干完咯！")
    }


    println("=== 进阶用法：实现类似while的until函数===")
    def until(condition: => Boolean)(block: => Unit) {
      if (!condition) {
        block
        until(condition)(block)
      }
    }
    var x = 10
    until(x == 0) {
      x -= 1
      println(x)
    }
  }

}
