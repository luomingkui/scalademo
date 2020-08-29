package chapter07

/**
 * @author mkluo
 * @date 2020/7/27 下午11:46
 * @desc 隐式转换丰富类库功能
 */
object Scala02_Implicit {
  def main(args: Array[String]): Unit = {
    //编写一个隐式函数，丰富mySQL功能
    implicit def addDelete(msql:MySQL): DB = {
      new DB
    }
    //创建mysql对象
    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete() // 编译器工作 分析 addDelete$1(mySQL).delete()
    mySQL.update()
  }
}

class MySQL {
  def insert(): Unit = {
    println("insert")
  }
}

class DB {
  def delete(): Unit = {
    println("delete")
  }
  def update(): Unit = {
    println("update")
  }
}

class Dog {}

