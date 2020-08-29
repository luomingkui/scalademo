package chapter07

/**
 * @author mkluo
 * @date 2020/7/27 下午11:55
 * @desc 隐式类
 */
object Scala04_ImplicitClassDemo {

  def main(args: Array[String]): Unit = {
    implicit class DB1(val m: MySQL1) { //ImplicitClassDemo$DB1$2
      def addSuffix(): String = {
        m + " scala"
      }
    }

    //创建一个MySQL1实例
    val mySQL = new MySQL1
    mySQL.sayOk()
    mySQL.addSuffix() //研究 如何关联到 DB1$1(mySQL).addSuffix();
    implicit def f1(d:Double): Int = {
      d.toInt
    }

    def test1(n1:Int): Unit = {
      println("ok")
    }
    test1(10.1)
  }
}

class DB1 {}

class MySQL1 {
  def sayOk(): Unit = {
    println("sayOk")
  }
}

