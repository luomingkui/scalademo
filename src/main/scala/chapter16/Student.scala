package chapter16

/**
 * @author mkluo
 * @date 2020/8/29 上午12:35
 * @desc 单例类型 this.type
 */
class Student extends Person{
  private var studentNo:String = null
  def setStudentNo(no:String) = {
    this.studentNo=no
    this
  }
  override def toString() = super.toString()+" studetNo:"+studentNo
}