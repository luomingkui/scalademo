一、Scala核心编程简介
    随着大数据的兴起，大数据核心框架Spark和Kafka也受到到广泛关注， Spark底层是Scala实现的，因此也带火了Scala语言，目前Scala被全球知名公司广泛用于Spark开发。

二、Scala内容目标
    内容: Scala语言概述、基础语法、运算符与运算符重载、程序流程控制、函数式编程基础【函数、递归、过程、惰性函数、异常】、面向对象编程基础【类、属性、方法、对象、构造器、Bean 属性】、面向对象编程中级【包、抽象、封装、继承、重写、类型检查和转换】、面向对象编程高级【伴生对象、伴生类、apply、特质、嵌套类】、隐式转换、数据结构、模式匹配和样例类、函数式编程高级【偏函数、值函数、作为参数的函数、匿名函数、参数(类型)推断、高阶函数、闭包、柯里化、抽象控制】、使用递归的方式去思考和编程、并发编程模型 Akka、文件和正则表达式、注解、类型参数、高级类型、解析、定界延续
    目标：通过学习，能掌握Scala编程思想和Scala底层机制,为进一步学习Spark打下坚实基础。

三、谁适合学
    希望以较低的投入和风险，来了解自己是否适合转型从事Spark开发的求职人员。
    有一定的Java基础，或者自学过一些Java书籍与视频资料，想系统掌握Scala语言的程序员。

四、学习地址：https://blog.csdn.net/luomingkui1109/category_7766633.html

### chapter01 HelloWorld
    HelloScala:Scala的helloworld；
### chapter02 Scala基础
    Scala01_Var：val与var区别；
    Scala02_DataType:数据类型；
    Scala03_Name：命名规范；
    Scala04_Function：调用函数与方法；
    Scala05_Control_for：for 循坏演示；
    Scala05_Control_ifelse：if...else 循坏演示；
    Scala05_Control_while:while循坏演示；
    Scala06_Control_dowhile:do while循坏演示；
    Scala07_Exercise:练习代码;
### chapter03 函数式编程(基础部分)
    Scala01_Function:函数;
    Scala02_Exercise：递归；
    Scala03_procedure:过程；
    Scala04_lazy：惰性函数；
    Scala05_Exception：异常；
### chapter04 面向对象编程(基础部分)
    Scala01_CatDemo:面向对象：快速入门（类、对象、属性、方法）；
    Scala02_CreateObj:类和对象；
    MScala03_ethodDemo：属性和方法；
    Scala04_ConDemo：构造器；
    Scala05_BeanPropertDemo：Bean 属性；
### chapter05 面向对象编程(中级部分)
    Scala01_BankDemo:抽象示例；
    Scala02_ScalaBaseConstrator：封装；
    Scala03_Extends：继承；
    Scala04_FiledOverrideDetail：重写；
    Scala05_TypeConvert：类型检查和转换；
### chapter06 面向对象编程(高级部分)
    Scala01_AccompanyObject：静态属性和静态方法（伴生类、伴生对象）;
    Scala02_ApplyDemo:伴生对象;
    Scala03_TraitDemo:特质的快速入门案例;
    Scala04_MixInDemo01:带有特质的对象，动态混入;
    Scala05_AddTraits:叠加特质；
### chapter07 隐式转换
    Scala01_ImplicitNotice：隐式函数快速入门；
    Scala02_Implicit：隐式转换丰富类库功能；
    Scala03_ImplicitVal：隐式值；
    Scala04_ImplicitClassDemo：隐式类；
### chapter08 数据结构(上)
    Scala01_Array_*:Array 相关操作；
    Scala02_Tuple：元组Tuple；
    Scala03_List_*:List和ListBuffer相关操作；
    Scala05_Queue：队列；
    Scala06_MapDemo：map；
    Scala07_SetDemo：set；
### chapter09 数据结构(下)
    Scala01_MapOperate_*:集合元素的映射(传统方法)；
    Scala02_FlatMapDemo01:集合元素的映射(flatmap映射)；
    Scala03_FilterDemo01：集合元素过滤-filter；
    Scala04_ReduceDemo01：化简；
    Scala05_FoldDemo01：折叠；
    Scala06_ScanDemo01：扫描；
    Scala07_ZipDemo01：拉；
    Scala08_IteratorDemo01：迭代器；
    Scala09_StreamDemo01：流；
    Scala10_ViewDemo01：视图；
    Scala11_ParallelCollection：并行集合；
    Scala12_OperatorDemo01：操作符；
### chapter10 模式匹配和样例类
    Scala01_MatchDemo01：match；
    Scala02_MatchIfDemo01：守卫；
    Scala03_MatchVarDemo01：模式中的变量；
    Scala04_MatchTypeDemo：类型匹配；
    Scala05_MatchArr：匹配数组；
    Scala06_MatchList：匹配列表；
    Scala07_MatchTupleDemo01：匹配数组；
    Scala08_MatchObjectDemo01：对象匹配；
    Scala09_MatchVarDemo：变量声明中的模式；
    Scala10_MatchForDemo：for 模式匹配；
    Scala11_CaseClassDemo01：样例类；
    Scala12_MidCase：case 语句的中置(缀)表达式；
    Scala13_SalesDem01：匹配嵌套结构；
    Scala14_seale：密封类；
### chapter11 函数式编程高级
    Scala01_PartialFunDemo:偏函数；
    Scala02_ValueDemo：值函数；
    Scala03_FunParameter：作为参数的函数；
    Scala04_AnonymouseFunction：匿名函数；
    Scala05_ParameterInfer：参数(类型)推断；
    Scala06_HigherOrderFunction：高阶函数；
    Scala07_ClosureDemo01：闭包；
    Scala08_CurryDemo01：颗粒化；
    Scala09_AbstractControl：抽象控制；
### chapter12 使用递归的方式去思考、编程
    Scala01_RecursiveDemo01：使用递归的方式去思考,去编程(while 实现)；
    Scala02_RecursiveDemo02：使用递归的方式去思考,去编程(递归实现)；
### chapter13 并发编程模型 Akka
    该章内容后续进行深入学习；
### chapter14 文件和正则表达式
    Scala01_FileSyllabus：读取行；
    Scala02_FromFile：读取字符；
    Scala03_FromFile：读取词法单元和数字；
    Scala04_FromFile：读取网络资源、文件写入、控制台操作；
    Scala05_PersonMain：序列化；
    Scala06_Regex：正则表达式；
### chapter15 类型参数
    Scala01_Demo01:类的泛型;
    Scala02_MethodType:函数的泛型;
    Scala03_Main_*:泛型的上界、下界限定;
    Scala04_Main3:视图界定;
    Scala05_Covariance:Scala当中协变，逆变和非变;
### chapter16 高级类型
    Scala01_Demo01：单例类型 this.type；
    Scala02_Demo01：类型投影；
    Scala03_Demo01：结构类型；
    Scala04_ComplexType：复合类型；
    Scala05_Demo01：中置类型；
    Scala06_ExistsType：存在类型；
    Scala07_ConcreteType：自身类型；
    Scala08_AbstractType：抽象类型；
