#发布与订阅信息
发布订阅（pub/sub）是一种消息通信模式，主要的目的是解除消息发布者和消息订阅者之间的耦合，Redis作为一个pub/sub的server，在订阅者和发布者之间起到了消息路由的功能。订阅者可以通过subscribe和pubscribe命令相redis server订阅自己感兴趣的消息类型，redis将信息类型成为通道（channel）。当发布者通过publish命令向redis server发送特定类型的信息时，订阅改信息类型的全部client都会受到此消息。

##Redis 发布订阅命令
| 序号 |	命令及描述 |
| ------ |:-----------------------------:|
| 1 | PSUBSCRIBE pattern [pattern ...] |
|   | 订阅一个或多个符合给定模式的频道。 |
| 2	| PUBSUB subcommand [argument [argument ...]]  |
|   | 查看订阅与发布系统状态。 |
| 3	| PUBLISH channel message | 
|   | 将信息发送到指定的频道。 |
| 4	| PUNSUBSCRIBE [pattern [pattern ...]]  |
|   | 退订所有给定模式的频道。 |
| 5	| SUBSCRIBE channel [channel ...]  |
|   | 订阅给定的一个或多个频道的信息。 |
| 6	| UNSUBSCRIBE [channel [channel ...]]  |
|   | 指退订给定的频道。 |


“消息”是在两台计算机间传送的数据单位。消息可以非常简单，例如只包含文本字符串；也可以更复杂，可能包含嵌入对象。消息被发送到队列中，“消息队列”是在消息的传输过程中保存消息的容器。