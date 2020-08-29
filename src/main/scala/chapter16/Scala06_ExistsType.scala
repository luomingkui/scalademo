package chapter16

/**
 * @author mkluo
 * @date 2020/8/29 上午1:11
 * @desc 存在类型
 *       存在类型的语法 [类型表达式] forsome {type T}
 *       forSome使得我们能够使用更加复杂的关系，比如Map[T,S]
 *       forSome {type T;type S <: T},而不仅限于类型通配符能表达的那些
 */
class Scala06_ExistsType {
  def func1[T](ele:Array[T] forSome {type T}):Unit = {
    ele.foreach(e => print(e+" "))
  }

  def func2(ele:Array[_]):Unit = {
    ele.foreach(e => print(e+" "))
  }

  //Map[_,_]相当于Map[T,U] forSome {type T;type U}
  def func3[T,S](dict:Map[T,S] forSome {type T;type S}): Unit ={
    for((k,v) <- dict){
      print(k,v)
    }
  }
  def func4(dict:Map[_,_]): Unit ={
    for((k,v) <- dict){
      print(k,v)
    }
  }
}
