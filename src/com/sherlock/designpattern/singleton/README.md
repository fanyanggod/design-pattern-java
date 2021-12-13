## Singleton
> 单例设计模式：一个类只允许创建一个对象或实例

## 什么时候（为什么）需要使用单例模式
### 案例1:处理资源访问冲突
定义一个Logger类，实现往文件中写入日志的功能，代码示例：[LoggerUnsafe](./LoggerUnSafe.java)
在 UserController 和 OrderController 中，分别创建了两个Logger对象，而在Web容器的Servlet多线程环境中，
那么存在同时写入文件的情况，将会到导致文件相互覆盖情况，所以是线程不安全的。

那么如何解决呢？既然是线程不安全问题，那就加锁呀，简单直接暴力！
使用synchronized来保证线程安全，同一时刻只允许一个线程调用log()。
代码示例：[LoggerSafe](./LoggerSafe.java)

除了加锁之外，还有什么办法呢？回到问题上来，两个Controller分别创建了两个Logger对象，
那是不是只要我限制它俩使用的是同一个对象，再加上FileWriter本身就是线程安全的是否就可以解决这个问题了。所以使用单例模式也能够
实现，代码示例：[LoggerSingleton](./LoggerSingleton.java)

### 案例2:全局唯一类
有些数据在系统中只应保存一份，那就能够设计为单例

## 如何实现单例
### 1.饿汉式
饿汉式的实现方式是在类加载期间，就已经将 instance 静态实例初始化了。
所以，此方法具有线程安全的特性，但是不支持延迟加载。代码示例：[HungrySingleton](./HungrySingleton.java)
### 2.懒汉式
懒汉式相较于饿汉式的优势式支持延迟加载，但是存在频繁加锁、释放锁，并发低。代码示例：[LazySingleton](./LazySingleton.java)
### 3.双重检测
双重检测实现即支持延迟加载，也支持高并发。代码示例：[DoubleCheckSingleton](./DoubleCheckSingleton.java)
### 4.静态内部类
利用Java的静态内部类来实现单例，相较于双重检测较为简单。代码示例：[StaticInternalSingleton](./StaticInternalSingleton.java)
### 5.枚举
最简单的实现方式，基于枚举类型实现单例。代码示例：[EnumSingleton](./EnumSingleton.java)

## 存在的问题
  1. 对OOP特性的支持不友好:
     如果一个类被设置成单例，那么在使用继承和多态的时候就显的不是那么友好。 
  2. 单例会隐藏类之间的关系:
    单例类是不需要显式创建、不需要依赖参数传递，直接可以在函数中调用。因此会隐藏类之间的关系，降低代码可阅读性。
  3. 单例对代码的扩展性不友好:
    如果一个类被设计成单例，那么后期如果需要将创建多个实例或对象时，则无法进行拓展，例如数据库连接池。 
  4. 对单元测试不友好:
     某个类使用到了单例的类A，在做单元测试时，无法通过mock的形式进行替换。 
  5. 单例不支持有参数的构造函数.