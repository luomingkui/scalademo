package chapter16

/**
 * @author mkluo
 * @date 2020/8/29 上午12:54
 * @desc 结构类型
 */
object Scala03_Demo01 extends  App{
  val st = new StructType
  val animals = List("tiger","lions","hadoop")
  val sb = st.appendLines(new {def append(line:String):Any = {"<"+line.toUpperCase()+">"}},animals)
  sb.foreach(e => print(e))
}