# Builder
## 为什么使用建造者模式
定义一个资源池配置类 ResourcePoolConfig, 有一下几个成员变量：

| 成员变量     | 解释        | 是否必填 | 默认值  |
|----------|-----------|------|------|
| name     | 资源名       | 是    | null |
| maxTotal | 最大总资源数量   | 否    | 8    |
| maxIdle  | 最大空闲资源数量  | 否    | 8    |
| minIdle  | 最小空闲资源数量  | 否    | 1    |

### 通过构造函数创建
代码示例：[ResourcePoolConfig](ResourcePoolConfig.java),
创建示例：
```java
 ResourcePoolConfig config = new ResourcePoolConfig(name,8,8,1)
```
在创建对象时，通过构造函数完成参数传递。
这个方法有着很明显的不足，即如果参数过多，在代码的可读性和易用性上变得很差。
且无法没有对参数之间进行校验。
### 通过Set创建
代码示例：[ResourcePoolConfig](ResourcePoolConfig2.java),
创建示例：
```java
  ResourceConfig config = new ResourceConfig(name);
         config.setMaxTotal = 8;
         config.setMaxIdle = 8;
         config.setMinIdle = 1;
```
通过set()来解决构造函数参数过多所带来的问题，但是同样无法解决参数之间校验的问题。
### 通过Builder创建
代码示例：[ResourcePoolConfig](ResourcePoolConfig3.java),
[Builder](Builder.java)
创建示例：
```java
   ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                  .setName()
                  .setMaxTotal()
                  .setMaxIdle()
                  .setMinIdle()
                  .build();
```
通过Builder来创建config，首先通过 Builder的set() 来设置参数，然后在 
Builder.build() 中完成参数之间校验的工作，最后将 Builder的值赋值给config.


## 建造者模式与工厂模式的区别
- 工厂模式是用来创建不同但是相关类型的对象(继承同一父类或者接口的一组子类),由给定的参数决定创建哪种类型的对象.
- 建造者模式是用来创建一种类型的复杂对象，通过设置不同的可选参数，定制化地创建不同对象。