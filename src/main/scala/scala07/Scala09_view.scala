package scala07

/**
  * @author luomingkui
  * @date 2018/6/11 下午9:05
  * @desc Stream的懒执行行为，你可以对其他集合应用view方法来得到类似的效果，
  *       该方法产出一个其方法总是被懒执行的集合。但是view不会缓存数据，每次都要重新计算。
  */
object Scala09_view {

  def main(args: Array[String]): Unit = {

    //例如：我们找到10万以内，所有数字倒序排列还是它本身的数字。
    val viewSquares = (1 to 100000).view.map(x => x).filter(x => {x.toString == x.toString.reverse})
    for (x <- viewSquares) {
      println(x + "，")
    }
  }

}
