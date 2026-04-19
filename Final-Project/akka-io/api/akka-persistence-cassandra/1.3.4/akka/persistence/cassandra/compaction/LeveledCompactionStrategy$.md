---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction.LeveledCompactionStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:13:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction.LeveledCompactionStrategy
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction.LeveledCompactionStrategy

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction.LeveledCompactionStrategy

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
- [TimeWindowCompactionStrategy](TimeWindowCompactionStrategy.html)
[o](LeveledCompactionStrategy.html "See companion class")[akka](../../../index.html).[persistence](../../index.html).[cassandra](../index.html).[compaction](index.html)

# [LeveledCompactionStrategy](LeveledCompactionStrategy.html "See companion class")[**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html "Permalink")

### Companion [class LeveledCompactionStrategy](LeveledCompactionStrategy.html "See companion class")

#### object LeveledCompactionStrategy extends [CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)\[[LeveledCompactionStrategy](LeveledCompactionStrategy.html)]

Source[LeveledCompactionStrategy.scala](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/core/src/main/scala/akka/persistence/cassandra/compaction/LeveledCompactionStrategy.scala#L30)Linear Supertypes[CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)\[[LeveledCompactionStrategy](LeveledCompactionStrategy.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LeveledCompactionStrategy
2. CassandraCompactionStrategyConfig
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#ClassName:String "Permalink")  val ClassName: StringDefinition ClassesLeveledCompactionStrategy → [CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)
5. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#fromConfig(config:com.typesafe.config.Config):akka.persistence.cassandra.compaction.LeveledCompactionStrategy "Permalink")  def fromConfig(config: Config): [LeveledCompactionStrategy](LeveledCompactionStrategy.html)Definition ClassesLeveledCompactionStrategy → [CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)
10. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
15. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#propertyKeys:List[String] "Permalink")  def propertyKeys: List\[String]Definition ClassesLeveledCompactionStrategy → [CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)
17. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)\[[LeveledCompactionStrategy](LeveledCompactionStrategy.html)]

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
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html)*