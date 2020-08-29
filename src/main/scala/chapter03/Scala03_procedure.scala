package chapter03

/**
 * @author mkluo
 * @date 2020/7/25 下午9:22
 * @desc 过程：将函数的返回类型为Unit的函数称之为过程。如果明确函数没有返回值，那么等号可以省略。
 */
object Scala03_procedure {
  def shout1(content: String) : Unit = {
      println(content)
  }
}
