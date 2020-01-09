# DesignPatternForJava

资料来源于https://www.cnblogs.com/fomin/p/9671896.html

#### 面向对象7个设计原则: 

1.单一职责原则(Single Responsiblity Principle, SRP)

2.开闭原则(Open Closed Principle, OCP)

3.里氏代换原则(Liskov Substitution Principle, LSP)

4.依赖倒转原则(Dependency Inversion Principle, DIP)

5.接口隔离原则(Interface Segregation Principle, ISP)

6.合成/聚合复用原则(Composite/Aggregate Reuse Principle, CARP)

7.最小知识原则(Principle of Least Knowledge, PLK, 也叫迪米特法则)

设计模式就是实现了这些原则，从而达到了代码复用、增加可维护性的目的。其中单一职责、开闭、接口隔离、里氏替换、和依赖倒置原则被典型应用在测试驱动上、并且是敏捷开发以及自适应开发等指导思想的重要组成部分。


#### 设计模式分类:

 * **创建型模式:** 单例模式、抽象工厂模式、建造者模式、工厂模式、原型模式
 * **结构性模式:** 适配器模式、桥接模式、装饰模式、组合模式、外观模式、享元模式、代理模式
 * **行为型模式:** 模板方法模式、命令模式、迭代器模式、观察者模式、中介者模式、备忘录模式、解析器模式(Interpreter模式)、状态模式、策略模式、职责链模式(责任链模式)、访问者模式
 
**单例模式(Singleton) :** 一个类只有一个实例

**观察者模式(Observer) :** 定义对象间的一种一对多的依赖关系。以便当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并自动刷新。
