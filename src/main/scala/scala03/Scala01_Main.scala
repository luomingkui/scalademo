package scala03

/**
  * @author luomingkui
  * @date 2018/6/12 下午9:28
  * @desc
  */
object Scala01_Main {

  def main(args: Array[String]): Unit = {


    // 声明主构造方法时，如果方法参数没有使用var,val声明，表示局部变量，不会在外部访问
    // 但是如果方法参数使用var, val声明，这个时候，scala会将局部变量升级为类的属性字段

    val test = new Scala01_ClassConstructor("HelloScala", 100)



    val classConstructor2 = new Scala01_ClassConstructor2("aa", 20)
    println("name:"+classConstructor2.name)
    println("price:"+classConstructor2.price)

    println("===People===")
    val people = new Person();
    println(people.name)


  }

}
