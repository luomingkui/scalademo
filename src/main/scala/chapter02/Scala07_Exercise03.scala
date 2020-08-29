package chapter02

/**
 * @author mkluo
 * @date 2020/8/26 下午3:03
 * @desc 打印出九九乘法表
 */
object Scala07_Exercise03 {
  def main(args: Array[String]): Unit = {
    //3.打印出九九乘法表
    //思路分析
    //(1) 使用两层循环, 有9行, 每1行的列数在增加
    //(2) 根据逻辑，我们可以编写代码
    val num = 9
    for (i <- 1 to num) { //确定行数
      for (j <- 1 to i) {//确定列数
        printf("%d * %d = %d\t" , j , i , i * j)
      }
      println()
    }
  }
}