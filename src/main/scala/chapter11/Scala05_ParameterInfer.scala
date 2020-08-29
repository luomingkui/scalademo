package chapter11

/**
 * @author mkluo
 * @date 2020/8/4 上午12:35
 * @desc 参数(类型)推断
 * 1) 参数类型是可以推断时，可以省略参数类型
 * 2) 当传入的函数，只有单个参数时，可以省去括号
 * 3) 如果变量只在=>右边只出现一次，可以用_来代替
 */
object Scala05_ParameterInfer {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    println(list.map((x:Int)=>x + 1)) //(2,3,4,5)
    println(list.map((x)=>x + 1)) //(2,3,4,5)
    println(list.map(x=>x + 1)) //(2,3,4,5)
    println(list.map( _ + 1)) //(2,3,4,5)
    println(list.reduce(f1)) // 10
    println(list.reduce((n1:Int ,n2:Int) => n1 + n2)) //10
    println(list.reduce((n1 ,n2) => n1 + n2)) //10
    println(list.reduce( _ + _)) //10
    val res = list.reduce(_+_)
  }
  def f1(n1:Int ,n2:Int): Int = {
    n1 + n2
  }
}
