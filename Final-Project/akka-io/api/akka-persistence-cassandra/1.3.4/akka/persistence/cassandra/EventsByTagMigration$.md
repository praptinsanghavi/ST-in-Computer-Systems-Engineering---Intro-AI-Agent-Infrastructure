---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.EventsByTagMigration
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/EventsByTagMigration$.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.EventsByTagMigration
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.EventsByTagMigration

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.EventsByTagMigration

## Content

Akka Persistence Cassandra1\.3\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/cassandra/index.html "Permalink")  package [cassandra](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/cassandra/cleanup/index.html "Permalink")  package [cleanup](cleanup/index.html)Definition Classes[cassandra](index.html)
- [**](../../../akka/persistence/cassandra/compaction/index.html "Permalink")  package [compaction](compaction/index.html)Definition Classes[cassandra](index.html)
- [**](../../../akka/persistence/cassandra/example/index.html "Permalink")  package [example](example/index.html)Definition Classes[cassandra](index.html)
- [**](../../../akka/persistence/cassandra/healthcheck/index.html "Permalink")  package [healthcheck](healthcheck/index.html)Definition Classes[cassandra](index.html)
- [**](../../../akka/persistence/cassandra/journal/index.html "Permalink")  package [journal](journal/index.html)Definition Classes[cassandra](index.html)
- [**](../../../akka/persistence/cassandra/query/index.html "Permalink")  package [query](query/index.html)Definition Classes[cassandra](index.html)
- [**](../../../akka/persistence/cassandra/reconciler/index.html "Permalink")  package [reconciler](reconciler/index.html)Definition Classes[cassandra](index.html)
- [EventsByTagMigration](EventsByTagMigration.html)
- [KeyspaceAndTableStatements](KeyspaceAndTableStatements.html "Definitions of keyspace and table creation statements.")
[o](EventsByTagMigration.html "See companion class")[akka](../../index.html).[persistence](../index.html).[cassandra](index.html)

# [EventsByTagMigration](EventsByTagMigration.html "See companion class")[**](../../../akka/persistence/cassandra/EventsByTagMigration$.html "Permalink")

### Companion [class EventsByTagMigration](EventsByTagMigration.html "See companion class")

#### object EventsByTagMigration

Source[EventsByTagMigration.scala](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/core/src/main/scala/akka/persistence/cassandra/EventsByTagMigration.scala#L29)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventsByTagMigration
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#apply(systemProvider:akka.actor.ClassicActorSystemProvider):akka.persistence.cassandra.EventsByTagMigration "Permalink")  def apply(systemProvider: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [EventsByTagMigration](EventsByTagMigration.html)
5. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
14. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
15. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#rawPayloadOldTagSchemaExtractor(bucketSize:akka.persistence.cassandra.BucketSize,systemProvider:akka.actor.ClassicActorSystemProvider):akka.persistence.cassandra.Extractors.Extractor[akka.persistence.cassandra.Extractors.RawEvent] "Permalink")  def rawPayloadOldTagSchemaExtractor(bucketSize: BucketSize, systemProvider: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): Extractor\[RawEvent]
16. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/persistence/cassandra/EventsByTagMigration$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/EventsByTagMigration$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/EventsByTagMigration.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/KeyspaceAndTableStatements.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/example/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/healthcheck/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/journal/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/EventsByTagMigration$.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/EventsByTagMigration$.html)*