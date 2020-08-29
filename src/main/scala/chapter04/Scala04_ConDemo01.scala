package chapter04

/**
 * @author mkluo
 * @date 2020/7/25 下午10:45
 * @desc
 */
object Scala04_ConDemo01 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person01("jack", 20)
    println(p1)
    //下面这句话就会调用def this(name:String)
    val p2 = new Person01("tom");
    println(p2)
  }
}

//构造器
//创建Person对象的同时初始化对象的age属性值和name属性值
class Person01(inName:String,inAge:Int) {
  var name: String = inName
  var age: Int = inAge
  age += 10
  //重写了toString，便于输出对象的信息
  override def toString: String = {
    "name=" + this.name + "\t age" + this.age
  }

  //辅助构造器，必须在第一行显式调用主构造器(可以是直接，也可以是间接)
  def this(name:String) {
    this("jack", 10)
    this.name = name
  }
}
