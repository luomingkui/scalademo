package chapter16

/**
 * @author mkluo
 * @date 2020/8/29 上午1:12
 * @desc 自身类型
 *       我们知道，我们可以限制混入特质的时候，限定类型。
 *       通过语法this:指定类型 => 然后指定所允许混入的类或者其子类才可以混入该trait。
 */
class BaseType
class ParentType
trait MyTrait {
  /**
   * 指定该trait只能被BaseType的子类可以混入
   * 不是BaseType的子类是不可以混入这个trait的
   */
  this:BaseType =>
}

class Scala07_ConcreteType extends BaseType with MyTrait
/*所以这里会报错*/
// class ImplementType extends ParentType with MyTrait