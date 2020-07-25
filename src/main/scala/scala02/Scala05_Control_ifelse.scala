package scala02

/**
  * @author luomingkui
  * @date 2018/6/8 下午7:08
  * @desc scala的if...else练习
  */
object Scala05_Control_ifelse {

  def main(args: Array[String]): Unit = {

    val a3=10;

    val a4=
      if(a3>20){
        "a3大于20"
      }else{
        "a3小于20"
      }

    println(a3.getClass.getName)
    println(a4)
    println(a4.getClass.getName)


    val a5=
    if(a3>20){
      "a3大于20"
    }
    println(a5)

    println("===========")

    val s:String =""
    val r1=if(s=="")"123" else "456"
    println(r1)


    println("===========")
    val r2 = if ( s != "" ) "222"
    println(r2.getClass.getName + ":" + r2)


  }

}
