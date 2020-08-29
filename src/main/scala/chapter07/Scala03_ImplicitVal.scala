package chapter07

/**
 * @author mkluo
 * @date 2020/7/27 下午11:43
 * @desc 隐式值
 */
object Scala03_ImplicitVal {
  def main(args: Array[String]): Unit = {

    implicit val str1: String = "jack~" //这个就是隐式值

    //implicit name: String ：name就是隐式参数
    def hello(implicit name: String): Unit = {
      println(name + " hello")
    }

    hello //底层 hello$1(str1);

  }
}
