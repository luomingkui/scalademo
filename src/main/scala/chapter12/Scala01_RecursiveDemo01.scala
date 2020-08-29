package chapter12
import java.text.SimpleDateFormat
import java.util.Date
/**
 * @author mkluo
 * @date 2020/8/16 下午6:41
 * @desc 使用递归的方式去思考,去编程(while 实现)
 */
object Scala01_RecursiveDemo01 {
  def main(args: Array[String]): Unit = {

    //传统方法完成 1-50 的求和任务
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("date=" + date)

    var res = BigInt(0)
    var num = BigInt(1)
    var maxVal = BigInt(99999999l)
    while (num <= maxVal) {
      res += num
      num += 1
    }
    println("res=" + res)

    val now2: Date = new Date()
    val date2 = dateFormat.format(now2)
    println("date2=" + date2) //输出时间

  }
}
