package chapter08

import scala.collection.mutable.ArrayBuffer

/**
 * @author mkluo
 * @date 2020/7/28 上午7:57
 * @desc 定长数组与变长数组的转换
 */
object Scala01_Array22ArrayBuffer {
  def main(args: Array[String]): Unit = {

    val arr2 = ArrayBuffer[Int]()
    // 追加值
    arr2.append(1, 2, 3)
    println(arr2)

    val newArr = arr2.toArray
    println(newArr)

    val newArr2 = newArr.toBuffer
    newArr2.append(123)
    println(newArr2)
  }
}
