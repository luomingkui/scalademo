package chapter05

/**
 * @author mkluo
 * @date 2020/7/26 下午7:49
 * @desc 重写
 */
object Scala03_FiledOverrideDetail {
  def main(args: Array[String]): Unit = {
    val bbbb = new BBBB
  }
}

class AAAA {
  val name: String = ""
}

class BBBB extends AAAA {
  override val name: String = "jj"
}
