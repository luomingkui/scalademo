package chapter10

/**
 * @author mkluo
 * @date 2020/8/3 上午1:26
 * @desc 样例类最佳实践 2:
 * 样例类的copy方法和带名参数
 * copy创建一个与现有对象值相同的新对象，并可以通过带名参数来修改某些属性。
 */
object Scala11_CaseClassDemo03 {
  def main(args: Array[String]): Unit = {
    val amt = new Currency3(3000.0,"RMB")
    val amt2 = amt.copy() // 克隆,创建的对象和amt的属性一样
    println("amt2.value" + amt2.value + " amt2.unit= " + amt2.unit)
    println(amt2)

    val amt3 = amt.copy(value = 8000.0)
    println(amt3)

    val amt4 = amt.copy(unit = "美元")
  }
}


abstract class Amount3
case class Dollar3(value: Double) extends Amount3    //样例类
case class Currency3(value: Double, unit: String) extends Amount3 //样例类
case object NoAmount3 extends Amount3  //样例类