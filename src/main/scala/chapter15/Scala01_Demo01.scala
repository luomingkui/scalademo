package chapter15

/**
 * @author mkluo
 * @date 2020/8/28 下午11:35
 * @desc 类的泛型
 */
object Scala01_Demo01 {
  def main(args: Array[String]): Unit = {
    val result1 = new MyClass("hello",50)
    val result2 = new MyClass[Any,Any]("zhangsan","Lisi");
  }
}

/**
 * 定义一个class类，接收两个参数，但是两个参数都是泛型，泛型的类型，会根据我们创建类的实例化对象的时候，动态的传递进行动态的推断
 */
class MyClass[T,B](first:T,second:B){
  println(first+","+second)
}