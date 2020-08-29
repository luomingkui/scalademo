package chapter16

/**
 * @author mkluo
 * @date 2020/8/29 上午1:06
 * @desc 中置类型
 * 中置类型是一个带有两个类型参数的类型，以中置语法表示，类型名称写在两个类型参数之间，举例来说，你可以这样写：String Map Int 而不是Map[String,Int]
 */

case class InfixType[S,T](val name:S,val age:T) {
}

class Scala05_Demo01 extends App{
  //我么一般这么写：
  val infix1:InfixType[String,Int] = InfixType[String,Int]("Infix",28)
  //使用中置表达式写法
  val infix2:String InfixType Int = InfixType("Infix",28)
}

