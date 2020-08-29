package chapter08

import scala.collection.mutable.ArrayBuffer

/**
 * @author mkluo
 * @date 2020/7/28 上午8:09
 * @desc Scala集合和Java集合互相转换
 */
object Scala01_ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {

    //Scala 的 ArrayBuffer 转成 Java 的 List
    // implicit def bufferAsJavaList[A](b : scala.collection.mutable.Buffer[A]) : java.util.List[A] = { /* compiled code */ }
    val arr = ArrayBuffer("1", "2", "3")
    import scala.collection.JavaConversions.bufferAsJavaList
    //对象 ProcessBuilder ， 因为 这里使用到上面的  bufferAsJavaList
    val javaArr = new ProcessBuilder(arr) //为什么可以这样使用?
    // 这里arrList 就是java中的List
    val arrList = javaArr.command()
    println(arrList) //输出 [1, 2, 3]

    //java的List 转成 scala的 ArrayBuffer
    // implicit def asScalaBuffer[A](l : java.util.List[A]) : scala.collection.mutable.Buffer[A] = { /* compiled code */ }
    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable
    val scalaArr: mutable.Buffer[String] = arrList
    scalaArr.append("jack")
    scalaArr.append("tom")
    scalaArr.remove(0)
    println(scalaArr)

  }
}
