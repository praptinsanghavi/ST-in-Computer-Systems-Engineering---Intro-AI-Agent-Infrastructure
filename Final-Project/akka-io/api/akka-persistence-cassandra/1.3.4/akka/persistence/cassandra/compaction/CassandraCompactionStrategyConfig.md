---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction.CassandraCompactionStrategyConfig
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:13:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction.CassandraCompactionStrategyConfig
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction.CassandraCompactionStrategyConfig

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction.CassandraCompactionStrategyConfig

## Content

Akka Persistence Cassandra1\.3\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/cassandra/compaction/index.html "Permalink")  package [compaction](index.html)Definition Classes[cassandra](../index.html)
- [BaseCompactionStrategy](BaseCompactionStrategy.html)
- [CassandraCompactionStrategy](CassandraCompactionStrategy.html)
- CassandraCompactionStrategyConfig
- [LeveledCompactionStrategy](LeveledCompactionStrategy.html)
- [SizeTieredCompactionStrategy](SizeTieredCompactionStrategy.html)
- [TimeWindowCompactionStrategy](TimeWindowCompactionStrategy.html)
t[akka](../../../index.html).[persistence](../../index.html).[cassandra](../index.html).[compaction](index.html)

# CassandraCompactionStrategyConfig[**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html "Permalink")

### 

#### trait CassandraCompactionStrategyConfig\[CSS \<: [CassandraCompactionStrategy](CassandraCompactionStrategy.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[CassandraCompactionStrategyConfig.scala](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/core/src/main/scala/akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.scala#L9)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[BaseCompactionStrategy](BaseCompactionStrategy$.html), [LeveledCompactionStrategy](LeveledCompactionStrategy$.html), [SizeTieredCompactionStrategy](SizeTieredCompactionStrategy$.html), [TimeWindowCompactionStrategy](TimeWindowCompactionStrategy$.html)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CassandraCompactionStrategyConfig
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#ClassName:String "Permalink") abstract  val ClassName: String
2. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#fromConfig(config:com.typesafe.config.Config):CSS "Permalink") abstract  def fromConfig(config: Config): CSS
3. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#propertyKeys:List[String] "Permalink") abstract  def propertyKeys: List\[String]
### Concrete Value Members

1. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
13. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
14. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html)*