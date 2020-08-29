package chapter10

/**
 * @author mkluo
 * @date 2020/8/27 下午4:30
 * @desc 在模式匹配中进行变量赋值
 * Scala的模式匹配语法，有一个特点在于，可以将模式匹配的默认情况，下划线，替换为一个变量名，此时模式匹配语法就会将要匹配的值赋值给这个变量，从而可以在后面的处理语句中使用要匹配的值。
 * 为什么有这种语法？？思考一下。因为只要使用用case匹配到的值，是不是我们就知道这个只啦！！在这个case的处理语句中，是不是就直接可以使用写程序时就已知的值。
 * 但是对于下划线_这种情况，所有不满足前面的case的值，都会进入_这种默认情况进行处理，此时如果我们在处理语句中需要拿到具体的值进行处理呢？那就需要使用这种在模式匹配中进行变量赋值的语法。
 */
object Scala03_MatchVarDemo02 {
  def main(args: Array[String]): Unit = {
    def studentScore(name:String,score:String): Unit ={
      score match {
        case "A"=>println("excellent")
        case "B"=>println("good")
        case "C"=>println("soso")
        case _ if name=="leo"=>print(name+",you are good boy,come on!")
        case _score =>println("you need work harder,your score only "+_score)  //变量赋值
      }
    }
    studentScore("le","F")
  }
}
