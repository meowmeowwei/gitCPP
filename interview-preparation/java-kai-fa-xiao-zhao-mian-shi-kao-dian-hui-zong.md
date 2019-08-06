# Java开发校招面试考点汇总

作者：牛妹  
链接：[https://www.nowcoder.com/discuss/161991](https://www.nowcoder.com/discuss/161991)  
来源：牛客网  
  


#### 一、JavaSE部分

**❤1、Java基础**

1、为什么重写equals还要重写hashcode  
2、说一下map的分类和常见的情况

3、Object若不重写hashCode\(\)的话，hashCode\(\)如何计算出来的？  
4、==比较的是什么？

5、若对一个类不重写，它的equals\(\)方法是如何比较的？

6、java8新特性

7、说说Lamda表达式的优缺点。

8、一个十进制的数在内存中是怎么存的？

9、为啥有时会出现4.0-3.6=0.40000001这种现象？

10、Java支持的数据类型有哪些？什么是自动拆装箱？

11、什么是值传递和引用传递？

12、数组\(Array\)和列表\(ArrayList\)有什么区别？什么时候应该使用Array而不是ArrayList？

13、你了解大O符号\(big-O notation\)么？你能给出不同数据结构的例子么？

14、String是最基本的数据类型吗?

15、int 和 Integer 有什么区别

16、String 和StringBuffer的区别

17、我们在web应用开发过程中经常遇到输出某种编码的字符，如iso8859-1等，如何输出一个某种编码的字符串？

18、int和Integer有什么区别？

19、&和&&的区别？

20、在Java中，如何跳出当前的多重嵌套循环？

21、你能比较一下Java和JavaSciprt吗？

22、简述正则表达式及其用途。

23、Java中是如何支持正则表达式操作的？

24、请你说说Java和PHP的区别？

**❤2、关键字**

  
1、介绍一下Syncronized锁，如果用这个关键字修饰一个静态方法，锁住了什么？如果修饰成员方法，锁住了什么？

2、介绍一下volatile？

3、锁有了解嘛，说一下Synchronized和lock

4、讲一讲Java里面的final关键字怎么用的？  


**❤3、面向对象**

1、wait方法底层原理

2、Java有哪些特性，举个多态的例子。

3、String为啥不可变？

4、类和对象的区别

5、请列举你所知道的Object类的方法。

6、重载和重写的区别？相同参数不同返回值能重载吗？

7、”static”关键字是什么意思？Java中是否可以覆盖\(override\)一个private或者是static的方法？

8、String能继承吗？

9、StringBuffer和StringBuilder有什么区别，底层实现上呢？

10、类加载机制，双亲委派模型，好处是什么？

11、静态变量存在哪?

12、讲讲什么是泛型？

13、解释extends 和super 泛型限定符-上界不存下界不取

14、是否可以在static环境中访问非static变量？

15、谈谈如何通过反射创建对象？

16、Java支持多继承么？

17、接口和抽象类的区别是什么？

18、Comparable和Comparator接口是干什么的？列出它们的区别。

19、面向对象的特征有哪些方面

20、final, finally, finalize的区别。

21、Overload和Override的区别。Overloaded的方法是否可以改变返回值的类型?

22、abstract class和interface有什么区别?

23、Static Nested Class 和 Inner Class的不同

24、当一个对象被当作参数传递到一个方法后，此方法可改变这个对象的属性，并可返回变化后的结果，那么这里到底是值传递还是引用传递?

25、Java的接口和C++的虚类的相同和不同处。

26、JAVA语言如何进行异常处理，关键字：throws,throw,try,catch,finally分别代表什么意义？在try块中可以抛出异常吗？

27、内部类可以引用他包含类的成员吗？有没有什么限制？

28、两个对象值相同\(x.equals\(y\) == true\)，但却可有不同的hash code说法是否正确？

29、重载（Overload）和重写（Override）的区别。重载的方法能否根据返回类型进行区分？

30、如何通过反射获取和设置对象私有字段的值？

31、谈一下面向对象的"六原则一法则"。

32、请问Query接口的list方法和iterate方法有什么区别？

33、Java中的方法覆盖\(Overriding\)和方法重载\(Overloading\)是什么意思？

34、Java中，什么是构造函数？什么是构造函数重载？什么是复制构造函数？35、hashCode\(\)和equals\(\)方法有什么联系？  


**❤4、集合**

1、Map和ConcurrentHashMap的区别？

2、hashMap内部具体如何实现的？

3、如果hashMap的key是一个自定义的类，怎么办？

4、ArrayList和LinkedList的区别，如果一直在list的尾部添加元素，用哪个效率高？

5、HashMap底层，负载因子，为啥是2^n？

6、ConcurrentHashMap锁加在了哪些地方？

7、TreeMap底层，红黑树原理？

8、concurrenthashmap有啥优势，1.7，1.8区别？

9、ArrayList是否会越界？

10、什么是TreeMap?

11、ConcurrentHashMap的原理是什么？

12、Java集合类框架的基本接口有哪些？

13、为什么集合类没有实现Cloneable和Serializable接口？

14、什么是迭代器？

15、Iterator和ListIterator的区别是什么？

16、快速失败\(fail-fast\)和安全失败\(fail-safe\)的区别是什么？

17、HashMap和Hashtable有什么区别？

18、ArrayList和LinkedList有什么区别？

19、ArrayList,Vector,LinkedList的存储性能和特性是什么？

20、Collection 和 Collections的区别。

21、你所知道的集合类都有哪些？主要方法？

22、List、Set、Map是否继承自Collection接口？

23、阐述ArrayList、Vector、LinkedList的存储性能和特性24、List、Map、Set三个接口存取元素时，各有什么特点？  


**❤5、线程**

1、多线程中的i++线程安全吗？为什么？

2、如何线程安全的实现一个计数器？

3、多线程同步的方法

4、介绍一下生产者消费者模式？

5、线程，进程，然后线程创建有很大开销，怎么优化？

6、线程池运行流程，参数，策略

7、讲一下AQS吧。

8、创建线程的方法，哪个更好，为什么？

9、Java中有几种方式启动一个线程？

10、Java中有几种线程池？

11、线程池有什么好处？

12、cyclicbarrier和countdownlatch的区别

13、如何理解Java多线程回调方法？

14、创建线程有几种不同的方式？你喜欢哪一种？为什么？

15、概括的解释下线程的几种可用状态。

16、同步方法和同步代码块的区别是什么？

17、启动线程有哪几种方式，线程池有哪几种？

18、在监视器\(Monitor\)内部，是如何做线程同步的？程序应该做哪种级别的同步？

19、sleep\(\) 和 wait\(\) 有什么区别？

20、同步和异步有何异同，在什么情况下分别使用他们？举例说明。

21、设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。使用内部类实现线程，对j增减的时候没有考虑顺序问题。

22、启动一个线程是用run\(\)还是start\(\)?

23、请说出你所知道的线程同步的方法

24、多线程有几种实现方法,都是什么?同步有几种实现方法,都是什么?

25、java中有几种方法可以实现一个线程？用什么关键字修饰同步方法? stop\(\)和suspend\(\)方法为何不推荐使用？

26、线程的sleep\(\)方法和yield\(\)方法有什么区别？

27、当一个线程进入一个对象的synchronized方法A之后，其它线程是否可进入此对象的synchronized方法B？

28、请说出与线程同步以及线程调度相关的方法。

29、举例说明同步和异步

30、什么是线程池（thread pool）？

31、说说线程的基本状态以及状态之间的关系？32、如何保证线程安全？  


**❤6、锁**

  
1、讲一下非公平锁和公平锁在reetrantlock里的实现。

2、讲一下synchronized，可重入怎么实现。

3、锁和同步的区别。

4、什么是死锁\(deadlock\)？

5、如何确保N个线程可以访问N个资源同时又不导致死锁？6、请你简述synchronized和java.util.concurrent.locks.Lock的异同？  


**❤7、JDK**

  
1、Java中的LongAdder和AtomicLong的区别2、JDK和JRE的区别是什么？  


**❤8、反射**

1、反射的实现与作用  


**😀9、JVM**

1、JVM回收算法和回收器，CMS采用哪种回收算法，怎么解决内存碎片问题？

2、类加载过程

3、JVM分区

4、eden区，survial区?

5、JAVA虚拟机的作用?

6、GC中如何判断对象需要被回收？7、JAVA虚拟机中，哪些可作为ROOT对象？

8、JVM内存模型是什么？

9、jvm是如何实现线程？

10、jvm最大内存限制多少

11、什么是Java虚拟机？为什么Java被称作是“平台无关的编程语言”？12、描述一下JVM加载class文件的原理机制?  


**❤10、GC**

  
1、java中内存泄露是啥，什么时候出现内存泄露？

2、minor gc如果运行的很频繁，可能是什么原因引起的，minor gc如果运行的很慢，可能是什么原因引起的?

3、阐述GC算法

4、GC是什么? 为什么要有GC?

5、垃圾回收的优点和原理。并考虑2种回收机制

6、java中会存在内存泄漏吗，请简单描述。7、垃圾回收器的基本原理是什么？垃圾回收器可以马上回收内存吗？有什么办法主动通知虚拟机进行垃圾回收？（垃圾回收）  


**❤11、IO和NIO、AIO**

1、怎么打印日志？

2、运行时异常与一般异常有何异同？

3、error和exception有什么区别?

4、给我一个你最常见到的runtime exception

5、Java中的异常处理机制的简单原理和应用。

6、java中有几种类型的流？JDK为每种类型的流提供了一些抽象类以供继承，请说出他们分别是哪些类？

7、什么是java序列化，如何实现java序列化？8、运行时异常与受检异常有什么区别？  


#### 二、JavaEE部分

**❤1、Spring**

1、说一下IOC和AOP?

2、介绍一下bean的生命周期

3、Spring里面注解用过没有？autowired 和resource区别？

4、@Controller和@RestController的区别？

5、依赖注入的方式有几种，哪几种？

6、springIOC原理？自己实现IOC要怎么做，哪些步骤？

7、Spring中BeanFactory和ApplicationContext的区别？、

8、什么是IoC和DI？DI是如何实现的？

9、请问Spring中Bean的作用域有哪些？

10、谈谈Spring中自动装配的方式有哪些？

11、aop的应用场景？

12、AOP的原理是什么？

13、你如何理解AOP中的连接点（Joinpoint）、切点（Pointcut）、增强（Advice）、引介（Introduction）、织入（Weaving）、切面（Aspect）这些概念？

14、Spring支持的事务管理类型有哪些？你在项目中使用哪种方式？

15、介绍一下spring？

16、Struts拦截器和Spring AOP区别？

17、spring框架的优点？

18、选择使用Spring框架的原因（Spring框架为企业级开发带来的好处有哪些）？

19、持久层设计要考虑的问题有哪些？你用过的持久层框架有哪些？

**❤2、Hibernate**

1、阐述实体对象的三种状态以及转换关系。

2、Hibernate中SessionFactory是线程安全的吗？Session是线程安全的吗（两个线程能够共享同一个Session吗）？

3、Hibernate中Session的load和get方法的区别是什么？

4、如何理解Hibernate的延迟加载机制？在实际应用中，延迟加载与Session关闭的矛盾是如何处理的？

4、简述Hibernate常见优化策略。

5、锁机制有什么用？简述Hibernate的悲观锁和乐观锁机制。

6、Hibernate如何实现分页查询？7、谈一谈Hibernate的一级缓存、二级缓存和查询缓存。  


**❤3、Struts**

1、说说STRUTS的应用  
  


**❤4、Mybatis**

1、解释一下MyBatis中命名空间（namespace）的作用。2、MyBatis中的动态SQL是什么意思？  


**❤5、MVC**

1、Spring MVC注解的优点

2、springmvc和spring-boot区别？

3、SpringMVC的运行机制，运行机制的每一部分的相关知识？4、谈谈Spring MVC的工作原理是怎样的？  


**❤6、各框架对比与项目优化**

1、Mybatis和Hibernate区别？2、介绍一下你了解的Java领域的Web Service框架。  


**❤7、JPA**

1、EJB是基于哪些技术实现的？并说出SessionBean和EntityBean的区别，StatefulBean和StatelessBean的区别。

2、EJB与JAVA BEAN的区别？

3、EJB包括（SessionBean,EntityBean）说出他们的生命周期，及如何管理事务的？

4、EJB的角色和三个对象是什么？

5、说说EJB规范规定EJB中禁止的操作有哪些？

6、EJB的激活机制是什么？

7、EJB的几种类型分别是什么8、EJB需直接实现它的业务接口或Home接口吗，请简述理由。  


#### 三、Java  web编程

**❤1、web编程基础**

1、启动项目时如何实现不在链接里输入项目名就能启动?

2、1分钟之内只能处理1000个请求，你怎么实现，手撕代码?

3、什么时候用assert

4、JAVA应用服务器有那些？

5、JSP的内置对象及方法。

6、JSP和Servlet有哪些相同点和不同点，他们之间的联系是什么？（JSP）

7、说一说四种会话跟踪技术

8、讲讲Request对象的主要方法

9、说说weblogic中一个Domain的缺省目录结构?比如要将一个简单的helloWorld.jsp放入何目录下,然后在浏览器上就可打入主机？

10、jsp有哪些动作?作用分别是什么?

11、请谈谈JSP有哪些内置对象？作用分别是什么？

12、说一下表达式语言（EL）的隐式对象及其作用

13、JSP中的静态包含和动态包含有什么区别？

14、过滤器有哪些作用和用法？

15、请谈谈你对Javaweb开发中的监听器的理解？16、说说web.xml文件中可以配置哪些内容？  


**❤2、web编程进阶**

1、forward与redirect区别，说一下你知道的状态码，redirect的状态码是多少？

2、servlet生命周期，是否单例，为什么是单例。

3、说出Servlet的生命周期，并说出Servlet和CGI的区别。

4、Servlet执行时一般实现哪几个方法？

5、阐述一下阐述Servlet和CGI的区别?

6、说说Servlet接口中有哪些方法？

7、Servlet 3中的异步处理指的是什么？

8、如何在基于Java的Web项目中实现文件上传和下载？

9、服务器收到用户提交的表单数据，到底是调用Servlet的doGet\(\)还是doPost\(\)方法？

10、Servlet中如何获取用户提交的查询参数或表单数据？

11、Servlet中如何获取用户配置的初始化参数以及服务器上下文参数？

12、讲一下redis的主从复制怎么做的？

13、redis为什么读写速率快性能好？

14、redis为什么是单线程？

15、缓存的优点？

16、aof，rdb，优点，区别？

17、redis的List能用做什么场景？

18、说说MVC的各个部分都有那些技术来实现?如何实现?

19、什么是DAO模式？

20、请问Java Web开发的Model 1和Model 2分别指的是什么？

21、你的项目中使用过哪些JSTL标签？22、使用标签库有什么好处？如何自定义JSP标签？（JSP标签）  


**❤3、web编程原理**

1、get和post区别？

2、请谈谈转发和重定向的区别？

3、说说你对get和post请求，并且说说它们之间的区别？

4、cookie 和session 的区别？

5、forward 和redirect的区别

6、BS与CS的联系与区别。

7、如何设置请求的编码以及响应内容的类型？

8、什么是Web Service（Web服务）？

9、谈谈Session的save\(\)、update\(\)、merge\(\)、lock\(\)、saveOrUpdate\(\)和persist\(\)方法分别是做什么的？有什么区别？

10、大型网站在架构上应当考虑哪些问题？11、请对J2EE中常用的名词进行解释\(或简单描述\)  


#### 四、JDBC编程

**❤1、SQL基础**

1、写SQL：找出每个城市的最新一条记录。

2、一个学生表，一个课程成绩表，怎么找出学生课程的最高分数3、有一组合索引（A,B,C），会出现哪几种查询方式？tag:sql语句  


**❤2、JDBC基础**

1、数据库水平切分，垂直切分

2、数据库索引介绍一下。介绍一下什么时候用Innodb什么时候用MyISAM。

3、数据库两种引擎

4、索引了解嘛，底层怎么实现的，什么时候会失效

5、问了数据库的隔离级别

6、数据库乐观锁和悲观锁

7、数据库的三范式？

8、讲一下数据库ACID的特性？

9、mysql主从复制？

10、leftjoin和rightjoin的区别？

11、数据库优化方法

12、谈一下你对继承映射的理解。

13、说出数据连接池的工作机制是什么?

14、事务的ACID是指什么？15、JDBC中如何进行事务处理？  


**❤3、JDBC进阶**

1、JDBC的反射，反射都是什么？

2、Jdo是什么?

3、Statement和PreparedStatement有什么区别？哪个性能更好？4、使用JDBC操作数据库时，如何提升读取数据的性能？如何提升更新数据的性能？  


#### 五、XML

**❤1、XML基础**

1、XML文档定义有几种形式？它们之间有何本质区别？解析XML文档有哪几种方式？  


**❤2、Web Service**

1、WEB SERVICE名词解释，JSWDL开发包的介绍，JAXP、JAXM的解释。SOAP、UDDI,WSDL解释。

2、请你谈谈对SOAP、WSDL、UDDI的了解？3、谈谈Java规范中和Web Service相关的规范有哪些？  


#### 六、计算机网络

**❤1、网络概述**

1、TCP协议在哪一层？IP协议在那一层？HTTP在哪一层？  


**❤2、运输层**

1、讲一下TCP的连接和释放连接。

2、TCP有哪些应用场景

3、tcp为什么可靠

4、tcp为什么要建立连接

5、阐述TCP的4次挥手

6、讲一下浏览器从接收到一个URL到最后展示出页面，经历了哪些过程。tag

7、http和https的区别

8、http的请求有哪些，应答码502和504有什么区别

9、http1.1和1.0的区别

10、说说ssl四次握手的过程11、304状态码有什么含义？  


**❤3、网络层**

1、arp协议，arp攻击

2、icmp协议3、讲一下路由器和交换机的区别？  


**❤4、应用层**

1、DNS寻址过程2、负载均衡反向代理模式优点及缺点  


#### 七、操作系统

**❤1、操作系统概论**

1、CentOS 和 Linux的关系？2、64位和32位的区别？  


**❤2、进程的描述与控制**

1、怎么杀死进程？

2、线程，进程区别

3、系统线程数量上限是多少？

4、进程和线程的区别是什么？5、解释一下LINUX下线程，GDI类。  


**❤3、输入输出系统**

1、socket编程，BIO，NIO，epoll？  


**❤4、存储器管理**

1、什么是页式存储？2、操作系统里的内存碎片你怎么理解，有什么解决办法？  


**❤5、处理机调度与死锁**

1、什么情况下会发生死锁，解决策略有哪些？

2、系统CPU比较高是什么原因？3、系统如何提高并发性？  


#### 八、算法与数据结构

**❤1、哈希**

1、hashset存的数是有序的吗？

2、Object作为HashMap的key的话，对Object有什么要求吗？

3、一致性哈希算法

4、什么是hashmap?

5、Java中的HashMap的工作原理是什么？6、hashCode\(\)和equals\(\)方法的重要性体现在什么地方？  


**❤2、树**

1、说一下B+树和B-树？

2、怎么求一个二叉树的深度?手撕代码?

3、算法题：二叉树层序遍历，进一步提问：要求每层打印出一个换行符

4、二叉树任意两个节点之间路径的最大长度

5、如何实现二叉树的深度？

6、如何打印二叉树每层的节点？7、TreeMap和TreeSet在排序时如何比较元素？Collections工具类中的sort\(\)方法如何比较元素？  


**❤3、遍历**

1、编程题：写一个函数，找到一个文件夹下所有文件，包括子文件夹2、二叉树 Z 字型遍历  


**❤4、链表**

1、反转单链表

2、随机链表的复制

3、链表-奇数位升序偶数位降序-让链表变成升序

4、bucket如果用链表存储，它的缺点是什么？5、如何判断链表检测环  


**❤5、数组**

1、寻找一数组中前K个最大的数

2、求一个数组中连续子向量的最大和

3、找出数组中和为S的一对组合，找出一组就行

4、一个数组，除一个元素外其它都是两两相等，求那个元素?5、算法题：将一个二维数组顺时针旋转90度，说一下思路。  


**❤6、排序**

1、排序算法知道哪些，时间复杂度是多少，解释一下快排？

2、如何得到一个数据流中的中位数？

3、堆排序的原理是什么？

4、归并排序的原理是什么？

5、排序都有哪几种方法？请列举出来。6、如何用java写一个冒泡排序？  


**❤7、堆与栈**

1、堆与栈的不同是什么？

2、heap和stack有什么区别。3、解释内存中的栈\(stack\)、堆\(heap\)和静态区\(static area\)的用法。  


**❤8、队列**

1、什么是Java优先级队列\(Priority Queue\)？  


**❤9、高级算法**

1、题目：

Design and implement a data structure for Least Frequently Used \(LFU\) cache. It should support the following operations: get and put.

get\(key\) - Get the value \(will always be positive\) of the key if the key exists in the cache, otherwise return -1.

put\(key, value\) - Set or insert the value if the key is not already present. When the cache reaches its capacity, it should invalidate the least frequently used item before inserting a new item. For the purpose of this problem, when there is a tie \(i.e., two or more keys that have the same frequency\), the least recently used key would be evicted.

Could you do both operations in O\(1\) time complexity?

2、id全局唯一且自增，如何实现？

3、如何设计算法压缩一段URL？

4、为什么要设计后缀表达式，有什么好处？5、LRU算法的实现原理？  


#### 九、设计模式

**❤1、结构型模式**

1、java中有哪些代理模式？

2、如何实现动态代理3、IO流熟悉吗，用的什么设计模式？  


**❤2、创建型模式**

1、介绍一下单例模式？懒汉式的单例模式如何实现单例？  


**❤3、行为型模式**

1、介绍一下策略模式？2、设计模式了解哪些，手写一下观察者模式？  


**❤4、模式汇总**

1、说说你所熟悉或听说过的j2ee中的几种常用模式?及对设计模式的一些看法

2、j2ee常用的设计模式？说明工厂模式。

3、开发中都用到了那些设计模式?用在什么场合?4、简述一下你了解的Java设计模式  


#### 十、场景题

**❤1、场景题汇总**

1、情景题：如果一个外卖配送单子要发布，现在有200个骑手都想要接这一单，如何保证只有一个骑手接到单子？  
2、场景题：美团首页每天会从10000个商家里面推荐50个商家置顶，每个商家有一个权值，你如何来推荐？第二天怎么更新推荐的商家？  
可以借鉴下stackoverflow，视频网站等等的推荐算法。  
3、场景题：微信抢红包问题  
悲观锁，乐观锁，存储过程放在mysql数据库中。  
4、场景题：1000个任务，分给10个人做，你怎么分配，先在纸上写个最简单的版本，然后优化。  
全局队列，把1000任务放在一个队列里面，然后每个人都是取，完成任务。  
分为10个队列，每个人分别到自己对应的队列中去取务。  
5、场景题：保证发送消息的有序性，消息处理的有序性。  
6、如何把一个文件快速下发到100w个服务器  
7、给每个组分配不同的IP段，怎么设计一种结构使的快速得知IP是哪个组的?  
8、10亿个数，找出最大的10个。  
建议一个大小为10的小根堆。  
9、有几台机器存储着几亿淘宝搜索日志，你只有一台2g的电脑，怎么选出搜索热度最高的十个搜索关键词？  
10、分布式集群中如何保证线程安全？  
11、给个淘宝场景，怎么设计一消息队列？  
12、10万个数，输出从小到大？  
先划分成多个小文件，送进内存排序，然后再采用多路归并排序。  
13、有十万个单词，找出重复次数最高十个？  


#### 十一、UML

**❤1、UML**

1、请你谈一下UML中有哪些常用的图？

