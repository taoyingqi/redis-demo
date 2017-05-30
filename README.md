#Spring-data-redis: 分布式队列


Redis中list数据结构，具有“双端队列”的特性，同时redis具有持久数据的能力，因此redis实现分布式队列是非常安全可靠的。它类似于JMS中的“Queue”，只不过功能和可靠性(事务性)并没有JMS严格。

Redis中的队列阻塞时，整个connection都无法继续进行其他操作，因此在基于连接池设计是需要注意。

我们通过spring-data-redis，来实现“同步队列”，设计风格类似与JMS。

```
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>1.5.3.RELEASE</version>
</parent>
```