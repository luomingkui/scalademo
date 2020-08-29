package chapter12
import java.text.SimpleDateFormat
import java.util.Date
/**
 * @author mkluo
 * @date 2020/8/16 下午6:42
 * @desc 使用递归的方式去思考,去编程(递归实现)
 */
object Scala02_RecursiveDemo02 {
  def main(args: Array[String]): Unit = {

    //递归实现 1-50 的求和任务
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("date=" + date)

    def mx(num: BigInt, sum: BigInt): BigInt = {
      if (num <= 99999999l) return mx(num + 1, sum + num)
      else return sum
    }

    var num = BigInt(1)
    var sum = BigInt(0)
    var res = mx(num,sum)
    println("res=" + res)

    val now2: Date = new Date()
    val date2 = dateFormat.format(now2)
    println("date2=" + date2) //输出时间

  }
}
