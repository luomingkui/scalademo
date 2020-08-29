package chapter14

/**
 * @author mkluo
 * @date 2020/8/28 下午7:43
 * @desc 序列化
 */
object Scala05_PersonMain {
  def main(args: Array[String]): Unit = {
    def main(args: Array[String]): Unit = {

      import java.io.{FileOutputStream, FileInputStream, ObjectOutputStream, ObjectInputStream}
      val nick = new Person
      val out = new ObjectOutputStream(new FileOutputStream("Nick.obj"))
      out.writeObject(nick)
      out.close()

      val in = new ObjectInputStream(new FileInputStream("Nick.obj"))
      val saveNick = in.readObject()
      in.close()
      println(saveNick)
    }
  }
}

@SerialVersionUID(1L) class Person extends Serializable{
  override def toString = name + "," + age
  val name = "Nick"
  val age = 20
}