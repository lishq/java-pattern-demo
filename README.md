# Java设计模式demo，23种设计模式

开发者须知，开发规范

1.[六大设计原则之里氏替换原则-by-陈礼松](https://blog.csdn.net/a291382932/article/details/52851119)

2.[六大设计原则之单一职责-by-陈礼松](https://blog.csdn.net/a291382932/article/details/52843842)

3.[一些设计上的基本常识-by-梁飞](http://javatar.iteye.com/blog/706098)

4.[谈谈扩充式扩展与增量式扩展-by-梁飞](http://javatar.iteye.com/blog/690845)

# 快速开始
- 每个包为一个独立的设计模式demo
- 运行Client.java

# class-diagram
- 类图，参考class-diagram文件夹下【设计模式.png】

# 代理模式和策略模式的区别
- 代理模式 
- 代理模式中，代理类知道被代理类的行为，因为代理类与被代理类实现的是同一个接口，因此代理类与被代理类的结构是相同的

- 代理模式主要针对对象的访问控制，比如在hibernate的懒加载中，不希望页面直接访问dao层的数据，这时候给页面开放一个Proxy。

- 策略模式 
- 而策略模式中，策略容器并不知道内部策略的详细信息，因为容器并没有实现与内部策略相同的接口，即容器与内部策略只是简单的组合关系，容器只是将内部策略的行为抽取出来，进行了统一的实现。

- 策略模式在项目中适用于实现一个目标但是有很多不同的做法的情况，比如实现数据库里面的搜索，可能算法，方式很多，但是目的差不多。这时可以使用策略模式。

# 总结
- 代理模式主要使用了Java的多态，干活的是被代理类，代理类主要是接货，你让我干活，好，我交给幕后的类去干， 你满意就可以，那怎么知道被代理的能不能干活呢，同根就成，同一个接口。

## 单例模式多线程访问是否有问题？

`假如现在有两个线程 A 和线程 B，线程 A 执行this.singletonPattern =new SingletonPattern()，正在申请内存分配，可能需要 0.001 微秒，就在这 0.001 微秒之内，线程 B 执行到if(this.singletonPattern == null)，`

`你说这个时候这个判断条件是 true 还是 false？是 true，那然后呢？线程 B 也往下走，于是乎就在内存中就有两个 SingletonPattern 的实例了，看看是不是出问题了？`

`如果你这个单例是去拿一个序列号或者创建一个信号资源的时候，会怎么样？业务逻辑混乱！数据一致性校验失败！最重要的是你从代码上还看不出什么问题，这才是最要命的！`

### 怎么解决？
* 加syncrhoized，多线程访问时加锁，分布式环境下存在效率问题`
* 直接 new 一个对象传递给类的成员变量 pattern，你要的时候 getInstance（）直接返回给你`

### 简单代理模式与策略模式的区别： 

简单代理模式中，代理类知道被代理类的行为，因为代理类与被代理类实现的是同一个接口，因此代理类与被代理类的结构是相同的； 

而策略模式中，策略容器并不知道内部策略的详细信息，因为容器并没有实现与内部策略相同的接口，即容器与内部策略只是简单的组合关系，容器只是将内部策略的行为抽取出来，进行了统一的实现。
