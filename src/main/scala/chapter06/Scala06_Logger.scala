package chapter06

/**
 * @author mkluo
 * @date 2020/8/26 下午7:10
 * @desc 带有特质的类
 */
trait Scala06_Logger {
    def log(msg: String)  // 抽象方法
  }

  class ConsoleLogger extends Scala06_Logger with Serializable {  // 使用extends
    def log(msg: String): Unit = {  // 不需要override关键字
      println("ConsoleLogger: " + msg)
    }
  }

  object LoggerTest extends App{
    val logger = new ConsoleLogger
    logger.log("hi")
  }