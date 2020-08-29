package chapter15

/**
 * @author mkluo
 * @date 2020/8/28 下午11:38
 * @desc 函数的泛型
 */
object Scala02_MethodType {
  def getMiddle[T](canshu:T) ={
    canshu
  }
  def main(args: Array[String]): Unit = {
    // 从参数类型来推断类型
    println(getMiddle(Array("Bob", "had", "a", "little", "brother")).getClass.getTypeName)
    //指定类型，并保存为具体的函数。
    val f = getMiddle[String] _
    println(f("Bob"))
  }
}