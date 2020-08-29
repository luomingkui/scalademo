package chapter04

/**
 * @author mkluo
 * @date 2020/6/16 下午4:26
 * @desc 面向对象：快速入门
 *
 * 类和对象的区别和联系：
 *  1) 类是抽象的，概念的，代表一类事物,比如人类,猫类。
 *  2) 对象是具体的，实际的，代表一个具体事物。
 *  3) 类是对象的模板，对象是类的一个个体，对应一个实例。
 *  4) Scala 中类和对象的区别和联系 和 Java 是一样的。
 */
object Scala01_CatDemo {
  def main(args: Array[String]): Unit = {

    //创建一只猫
    val cat = new Cat
    //给猫的属性赋值
    //1. cat.name = "小白" 其实不是直接访问属性，而是  cat.name_$eq("小白")
    //2. cat.name 等价于 cat.name()
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"
    printf("\n小猫的信息如下: %s %d %s", cat.name, cat.age, cat.color)
  }
}

//定义一个类Cat
class Cat {
  //定义/声明三个属性
  //1. 当我们声明了 var name :String时, 在底层对应 private name
  //2. 同时会生成 两个public方法 name() <=类似=> getter  public name_$eq() => setter
  var name: String = "" //给初始值
  var age: Int = _ // _ 表示给age 一个默认的值 ，如果Int 默认就是0
  var color: String = _ // _ 给 color 默认值，如果String ,默认是就是""
}

