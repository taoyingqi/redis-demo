#持久化机制

Redis是一个支持持久化的内存数据库，也就是活redis需要经常将内存中的数据同步到硬盘来保证持久化。

Redis支持两种持久化方式
1. snapshotting（快照），默认方式
2. Append-only file（aof）

## 1. snapshotting方式
快照是默认的持久化方式。这种方式是将内存中数据以快照的方式写入到二进制文件中，默认的文件名为dump.rdb。可以通过配置设置自动做持久化的方式。我们可以配置redis在n妙内如果超过m个key被修改就自动做快照。
```
save 900 1 #900秒内如果超过1个key被修改，则发起快照保存
save 300 10
save 60 10000
```

## 2. Append-only file方式
由于快照方式是在一定间隔时间做一次的，所以如果redis意外down掉的话，就会丢失最后一次快照后的所有修改。
aof比快照方式有更好的持久性，是由于在使用aof是，redis会将每一个手机的写命令都通过write函数追加到文件中，当redis重启是会通过重新执行文件中保存的写命令来在内存中重建整个数据库的内容。

当然由于os会在内核中缓存write做的修改，所以可能不是立即写在磁盘上。这样aof方式的持久化也还是有可能丢失部分数修改。

可以通过配置文件告诉redis我们想要通过fsync函数强制os写入到磁盘的时机。

```
appendonly yes #启用aof持久化方式
appendonly always #收到写命令就立即写入磁盘，最慢，但是保证完整的持久化
appendfsync everysec #每秒写入磁盘一次，在性能和持久化方面做了很好的折中
appendfsync no #完全依赖os，性能最好，持久化美保证
```