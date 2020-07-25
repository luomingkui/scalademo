package scala03

/**
  * @author luomingkui
  * @date 2018/6/13 上午12:30
  * @desc
  */
object Scala04_TrafficLightColor {

  def main(args: Array[String]): Unit = {

    println(TrafficLightColor.Red)
    println(TrafficLightColor.Red.id)

    println(TrafficLightColor.Yellow)
    println(TrafficLightColor.Yellow.id)

    println(TrafficLightColor.Green)
    println(TrafficLightColor.Green.id)

  }

}


object TrafficLightColor extends Enumeration {
  val Red = Value(0, "Stop")
  val Yellow = Value(1, "Slow")
  val Green = Value(2, "Go")
}

