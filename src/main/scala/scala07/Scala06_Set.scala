package scala07

/**
  * @author luomingkui
  * @date 2018/6/11 下午7:45
  * @desc
  */
object Scala06_Set {

  def main(args: Array[String]): Unit = {

    // 不可变的set集合
    val set = Set(1,2,3)
    println(set)
    println("======")

    // 可变的set集合
    val mutableSet = scala.collection.mutable.Set(1, 2, 3)
    mutableSet.add(4)
    mutableSet.add(5)
    mutableSet.add(6)
    println(mutableSet)

    println("======")

    val mutableSet1 = mutableSet += 100

    val mutableSet2 = mutableSet.+(200)

    println(mutableSet1)
    println(mutableSet2)

    //可变集合的元素删除
    println("======")
    println(mutableSet2.-(2))
    println(mutableSet2.remove(200))
    println(mutableSet2)

    println("======")
    //遍历
    for(x<- mutableSet2){
      println(x)
    }

  }

}
