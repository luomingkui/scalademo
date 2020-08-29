package chapter10

/**
 * @author mkluo
 * @date 2020/8/3 上午1:52
 * @desc 密封类
 * 1、使用 sealed 修饰的类或者特质，不能在类定义文件之外定义它的子类。
 * 2、可以避免滥用继承。
 * 3、用在模式匹配之中,可以让编译器在编译阶段进行检查，确保当前匹配的完整性。
 */
  sealed abstract class Furniture
  //定义两个样例类
  case class Couch() extends Furniture
  case class Chair() extends Furniture

object Scala14_seale {
    def findPlaceToSit(furniture: Furniture):String =furniture match {
      case a:Couch => "line on couch"
      case b:Chair => "line on Chair"
    }
    val chair = Chair()

    def main(args: Array[String]): Unit = {
      println(findPlaceToSit(chair))
    }
}