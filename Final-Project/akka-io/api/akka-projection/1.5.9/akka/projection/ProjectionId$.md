---
description: Akka Projection 1.5.9 - akka.projection.ProjectionId
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:43:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionId$.html
title: Akka Projection 1.5.9 - akka.projection.ProjectionId
---

# Akka Projection 1.5.9 - akka.projection.ProjectionId

> **Summary:** Akka Projection 1.5.9 - akka.projection.ProjectionId

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/projection/index.html "Permalink")  package [projection](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/projection/cassandra/index.html "Permalink")  package [cassandra](cassandra/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/eventsourced/index.html "Permalink")  package [eventsourced](eventsourced/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/grpc/index.html "Permalink")  package [grpc](grpc/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/jdbc/index.html "Permalink")  package [jdbc](jdbc/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/kafka/index.html "Permalink")  package [kafka](kafka/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/r2dbc/index.html "Permalink")  package [r2dbc](r2dbc/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/slick/index.html "Permalink")  package [slick](slick/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/state/index.html "Permalink")  package [state](state/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[projection](index.html)
- [BySlicesSourceProvider](BySlicesSourceProvider.html "Implemented by EventSourcedProvider and DurableStateSourceProvider.")
- [HandlerRecoveryStrategy](HandlerRecoveryStrategy.html "Error handling strategy when processing an Envelope fails.")
- [MergeableOffset](MergeableOffset.html)
- [OffsetVerification](OffsetVerification.html)
- [Projection](Projection.html "The core abstraction in Akka Projections.")
- [ProjectionBehavior](ProjectionBehavior$.html)
- [ProjectionContext](ProjectionContext.html)
- [ProjectionId](ProjectionId.html)
- [RetryRecoveryStrategy](RetryRecoveryStrategy.html)
- [StatusObserver](StatusObserver.html "Track status of a projection by implementing a StatusObserver and install it using Projection.withStatusObserver.")
- [StrictRecoveryStrategy](StrictRecoveryStrategy.html)
[o](ProjectionId.html "See companion class")[akka](../index.html).[projection](index.html)

# [ProjectionId](ProjectionId.html "See companion class")[**](../../akka/projection/ProjectionId$.html "Permalink")

### Companion [class ProjectionId](ProjectionId.html "See companion class")

#### object ProjectionId

Source[ProjectionId.scala](https://github.com/akka/akka-projection/tree/v1.5.9/akka-projection-core/src/main/scala/akka/projection/ProjectionId.scala#L11)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ProjectionId
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/projection/ProjectionId$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/projection/ProjectionId$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/projection/ProjectionId$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/projection/ProjectionId$.html#apply(name:String,keys:scala.collection.immutable.Set[String]):scala.collection.immutable.Set[akka.projection.ProjectionId] "Permalink")  def apply(name: String, keys: [Set](https://www.scala-lang.org/api/2.13.15/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[String]): [Set](https://www.scala-lang.org/api/2.13.15/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[[ProjectionId](ProjectionId.html)]Constructs a Set of ProjectionId.

Constructs a Set of ProjectionId.

A ProjectionId is composed by a name and a key.

The projection name is shared across multiple instances of [Projection](Projection.html) with different keys.
For example, a "user\-view" could be the name of a projection.

The key must be unique for a projection name.
For example, a "user\-view" could have multiple projections with different keys representing different partitions,
shards, etc.

name\- the projection name

keys\- the Set of keys to associated with the passed name.

returnsan immutable.Set of [ProjectionId](ProjectionId.html)s
5. [**](../../akka/projection/ProjectionId$.html#apply(name:String,key:String):akka.projection.ProjectionId "Permalink")  def apply(name: String, key: String): [ProjectionId](ProjectionId.html)Constructs a ProjectionId.

Constructs a ProjectionId.

A ProjectionId is composed by a name and a key.

The projection name is shared across multiple instances of [Projection](Projection.html) with different keys.
For example, a "user\-view" could be the name of a projection.

The key must be unique for a projection name.
For example, a "user\-view" could have multiple projections with different keys representing different partitions,
shards, etc.

name\- the projection name

key\- the unique key. The key must be unique for a projection name.

returnsProjectionId
6. [**](../../akka/projection/ProjectionId$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/projection/ProjectionId$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/projection/ProjectionId$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../akka/projection/ProjectionId$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../akka/projection/ProjectionId$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/projection/ProjectionId$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/projection/ProjectionId$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../akka/projection/ProjectionId$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/projection/ProjectionId$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/projection/ProjectionId$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/projection/ProjectionId$.html#of(name:String,keys:java.util.Set[String]):java.util.Set[akka.projection.ProjectionId] "Permalink")  def of(name: String, keys: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ProjectionId](ProjectionId.html)]Java API: Constructs a Set of ProjectionId.

Java API: Constructs a Set of ProjectionId.

A ProjectionId is composed by a name and a key.

The projection name is shared across multiple instances of [Projection](Projection.html) with different keys.
For example, a "user\-view" could be the name of a projection.

The key must be unique for a projection name.
For example, a "user\-view" could have multiple projections with different keys representing different partitions,
shards, etc.

name\- the projection name

keys\- the Set of keys to associated with the passed name.

returnsan [java.util.Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html) of [ProjectionId](ProjectionId.html)s
17. [**](../../akka/projection/ProjectionId$.html#of(name:String,key:String):akka.projection.ProjectionId "Permalink")  def of(name: String, key: String): [ProjectionId](ProjectionId.html)Java API: Constructs a ProjectionId.

Java API: Constructs a ProjectionId.

A ProjectionId is composed by a name and a key.

The projection name is shared across multiple instances of [Projection](Projection.html) with different keys.
For example, a "user\-view" could be the name of a projection.

The key must be unique for a projection name.
For example, a "user\-view" could have multiple projections with different keys representing different partitions,
shards, etc.

name\- the projection name

key\- the unique key. The key must be unique for a projection name.

returnsa ProjectionId
18. [**](../../akka/projection/ProjectionId$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../akka/projection/ProjectionId$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../akka/projection/ProjectionId$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../akka/projection/ProjectionId$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../akka/projection/ProjectionId$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/projection/ProjectionId$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/BySlicesSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/HandlerRecoveryStrategy$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/HandlerRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/MergeableOffset.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/OffsetVerification$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/OffsetVerification.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/Projection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionBehavior$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionContext.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionId$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionId.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/RetryRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/StatusObserver.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/StrictRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/cassandra/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/eventsourced/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/internal/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/kafka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/r2dbc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/slick/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/state/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/testkit/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionId$.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionId$.html)*