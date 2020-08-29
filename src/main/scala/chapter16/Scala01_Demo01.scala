package chapter16

/**
 * @author mkluo
 * @date 2020/8/29 上午12:34
 * @desc 单例类型 this.type
 */
object Scala01_Demo01 extends App {
  /**
   * 报错是因为返回的this代表的是父类自己而不是子类自己，而弗雷是没有setStudentNo方法的
   * 为解决该问题，可以将setName、setAge方法的返回值设置为：this.type
   */
    println(new Student().setName("john").setAge(22).setStudentNo("2020"))
}
