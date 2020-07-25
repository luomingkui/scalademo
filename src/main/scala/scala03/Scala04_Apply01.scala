package scala05_01

/**
  * @author luomingkui
  * @date 2018/6/12 上午10:23
  * @desc Apply方法
  */
object Scala04_Apply01 {

  def main(args: Array[String]): Unit = {
    // apply声明在伴生对象中，用于构建伴生类对象
    // 使用方式  伴生对象名称()
    var man = Man("zhangsan")
    man.describe
  }

}


// apply方法一般都声明在伴生类对象中，可以用来实例化伴生类的对象：
class Man private(val sex: String, name: String) {
  def describe = {
    println("Sex:" + sex + "name:" + name)
  }
}

object Man {
  def apply(name: String) = {
    new Man("男", name)
  }
}