package chapter16

/**
 * @author mkluo
 * @date 2020/8/29 上午12:53
 * @desc 结构类型
 */
class StructType {
  type append_func = {def append(line:String):Any}
  def appendLines(target:append_func,lines:Iterable[String]): StringBuilder ={
    val sb = new StringBuilder()
    for (l <- lines){
      val s = target.append(l)
      sb.append(s).append("\n")
    }
    sb
  }
}