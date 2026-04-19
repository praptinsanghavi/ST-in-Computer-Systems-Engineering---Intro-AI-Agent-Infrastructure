---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction.TimeWindowCompactionStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:13:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction.TimeWindowCompactionStrategy
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction.TimeWindowCompactionStrategy

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction.TimeWindowCompactionStrategy

## Content

Akka Persistence Cassandra1\.3\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/cassandra/compaction/index.html "Permalink")  package [compaction](index.html)Definition Classes[cassandra](../index.html)
- [BaseCompactionStrategy](BaseCompactionStrategy.html)
- [CassandraCompactionStrategy](CassandraCompactionStrategy.html)
- [CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)
- [LeveledCompactionStrategy](LeveledCompactionStrategy.html)
- [SizeTieredCompactionStrategy](SizeTieredCompactionStrategy.html)
- TimeWindowCompactionStrategy
[c](TimeWindowCompactionStrategy$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[cassandra](../index.html).[compaction](index.html)

# [TimeWindowCompactionStrategy](TimeWindowCompactionStrategy$.html "See companion object")[**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html "Permalink")

### Companion [object TimeWindowCompactionStrategy](TimeWindowCompactionStrategy$.html "See companion object")

#### class TimeWindowCompactionStrategy extends [BaseCompactionStrategy](BaseCompactionStrategy.html)

Source[TimeWindowCompactionStrategy.scala](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/core/src/main/scala/akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.scala#L11)Linear Supertypes[BaseCompactionStrategy](BaseCompactionStrategy.html), [CassandraCompactionStrategy](CassandraCompactionStrategy.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TimeWindowCompactionStrategy
2. BaseCompactionStrategy
3. CassandraCompactionStrategy
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#<init>(config:com.typesafe.config.Config):akka.persistence.cassandra.compaction.TimeWindowCompactionStrategy "Permalink")  new TimeWindowCompactionStrategy(config: Config)
### Value Members

1. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#asCQL:String "Permalink")  def asCQL: StringDefinition ClassesTimeWindowCompactionStrategy → [BaseCompactionStrategy](BaseCompactionStrategy.html) → [CassandraCompactionStrategy](CassandraCompactionStrategy.html)
5. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#compactionWindowSize:Int "Permalink")  val compactionWindowSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
8. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#compactionWindowUnit:java.util.concurrent.TimeUnit "Permalink")  val compactionWindowUnit: [TimeUnit](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)
9. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#enabled:Boolean "Permalink")  val enabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[BaseCompactionStrategy](BaseCompactionStrategy.html)
10. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
14. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
17. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
18. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#tombstoneCompactionInterval:Long "Permalink")  val tombstoneCompactionInterval: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition Classes[BaseCompactionStrategy](BaseCompactionStrategy.html)
21. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#tombstoneThreshold:Double "Permalink")  val tombstoneThreshold: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)Definition Classes[BaseCompactionStrategy](BaseCompactionStrategy.html)
22. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#uncheckedTombstoneCompaction:Boolean "Permalink")  val uncheckedTombstoneCompaction: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[BaseCompactionStrategy](BaseCompactionStrategy.html)
23. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [BaseCompactionStrategy](BaseCompactionStrategy.html)

### Inherited from [CassandraCompactionStrategy](CassandraCompactionStrategy.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/BaseCompactionStrategy$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/BaseCompactionStrategy.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/CassandraCompactionStrategy$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/CassandraCompactionStrategy.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/LeveledCompactionStrategy.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/SizeTieredCompactionStrategy$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/SizeTieredCompactionStrategy.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html)*