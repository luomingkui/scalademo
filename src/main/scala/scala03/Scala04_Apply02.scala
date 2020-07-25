package scala05_02

/**
  * @author luomingkui
  * @date 2018/6/13 上午12:25
  * @desc 也可以用来实现单例模式，我们只需要对上述列子稍加改进
  */
object Scala04_Apply02 {
  def main(args: Array[String]): Unit = {

    val man1 = Man("Nick")
    val man2 = Man("Thomas")
    man1.describe
    man2.describe

  }

}


class Man private(val sex: String, name: String) {
  def describe = {
    println("Sex:" + sex + "name:" + name)
  }
}

object Man {
  var instance: Man = null
  def apply(name: String) = {
    if(instance == null) {
      instance = new Man("男", name)
    }
    instance
  }
}