#redis-demo
1. pub-sub-demo
2. pub-sub-spring-demo
3. redis-queue-demo


##3. redis-queue-demo��Spring-data-redis: �ֲ�ʽ����


Redis��list���ݽṹ�����С�˫�˶��С������ԣ�ͬʱredis���г־����ݵ����������redisʵ�ֲַ�ʽ�����Ƿǳ���ȫ�ɿ��ġ���������JMS�еġ�Queue����ֻ�������ܺͿɿ���(������)��û��JMS�ϸ�

Redis�еĶ�������ʱ������connection���޷�����������������������ڻ������ӳ��������Ҫע�⡣

����ͨ��spring-data-redis����ʵ�֡�ͬ�����С�����Ʒ��������JMS��

```
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>1.5.3.RELEASE</version>
</parent>
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
```