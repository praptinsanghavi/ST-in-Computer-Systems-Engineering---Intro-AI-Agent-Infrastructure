---
description: Akka Projection 1.6.20 - akka.projection.grpc.consumer.ConsumerFilter.RemoveExcludeEntityIds
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:47:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html
title: Akka Projection 1.6.20 - akka.projection.grpc.consumer.ConsumerFilter.RemoveExcludeEntityIds
---

# Akka Projection 1.6.20 - akka.projection.grpc.consumer.ConsumerFilter.RemoveExcludeEntityIds

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.consumer.ConsumerFilter.RemoveExcludeEntityIds

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/grpc/consumer/index.html "Permalink")  package [consumer](index.html)Definition Classes[grpc](../index.html)
- [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html "Permalink")  object [ConsumerFilter](ConsumerFilter$.html "Extension to dynamically control the filters for the GrpcReadJournal.") extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ExtensionId.html#akka.actor.typed.ExtensionId)\[[ConsumerFilter](ConsumerFilter.html)]Extension to dynamically control the filters for the `GrpcReadJournal`.

Extension to dynamically control the filters for the `GrpcReadJournal`.

Definition Classes[consumer](index.html)
- [Command](ConsumerFilter$$Command.html)
- [CurrentFilter](ConsumerFilter$$CurrentFilter.html)
- [EntityIdOffset](ConsumerFilter$$EntityIdOffset.html)
- [ExcludeEntityIds](ConsumerFilter$$ExcludeEntityIds.html "Exclude events for entities with the given entity ids, unless there is a matching include filter that overrides the exclude.")
- [ExcludeRegexEntityIds](ConsumerFilter$$ExcludeRegexEntityIds.html "Exclude events for entities with entity ids matching the given regular expressions, unless there is a matching include filter that overrides the exclude.")
- [ExcludeTags](ConsumerFilter$$ExcludeTags.html "Exclude events with any of the given tags, unless there is a matching include filter that overrides the exclude.")
- [FilterCriteria](ConsumerFilter$$FilterCriteria.html)
- [GetFilter](ConsumerFilter$$GetFilter.html)
- [IncludeEntityIds](ConsumerFilter$$IncludeEntityIds.html "Include events for entities with the given entity ids.")
- [IncludeRegexEntityIds](ConsumerFilter$$IncludeRegexEntityIds.html "Include events for entities with entity ids matching the given regular expressions.")
- [IncludeTags](ConsumerFilter$$IncludeTags.html "Include events with any of the given tags.")
- [IncludeTopics](ConsumerFilter$$IncludeTopics.html "Include events with any of the given matching topics.")
- [PersistenceIdOffset](ConsumerFilter$$PersistenceIdOffset.html)
- [RemoveCriteria](ConsumerFilter$$RemoveCriteria.html)
- [RemoveExcludeEntityIds](ConsumerFilter$$RemoveExcludeEntityIds.html "Remove a previously added ExcludeEntityIds.")
- [RemoveExcludeRegexEntityIds](ConsumerFilter$$RemoveExcludeRegexEntityIds.html "Remove a previously added ExcludeRegexEntityIds.")
- [RemoveExcludeTags](ConsumerFilter$$RemoveExcludeTags.html "Remove a previously added ExcludeTags.")
- [RemoveIncludeEntityIds](ConsumerFilter$$RemoveIncludeEntityIds.html "Remove a previously added IncludeEntityIds.")
- [RemoveIncludeRegexEntityIds](ConsumerFilter$$RemoveIncludeRegexEntityIds.html "Remove a previously added IncludeRegexEntityIds.")
- [RemoveIncludeTags](ConsumerFilter$$RemoveIncludeTags.html "Remove a previously added IncludeTags.")
- [RemoveIncludeTopics](ConsumerFilter$$RemoveIncludeTopics.html "Remove a previously added IncludeTopics.")
- [Replay](ConsumerFilter$$Replay.html "Explicit request to replay events for given entities.")
- [ReplayPersistenceId](ConsumerFilter$$ReplayPersistenceId.html)
- [ReplayWithFilter](ConsumerFilter$$ReplayWithFilter.html "Explicit request to replay events for given entities.")
- [SubscriberCommand](ConsumerFilter$$SubscriberCommand.html)
- [UpdateFilter](ConsumerFilter$$UpdateFilter.html "Add or remove filter criteria.")
[o](ConsumerFilter$$RemoveExcludeEntityIds.html "See companion class")[akka](../../../index.html).[projection](../../index.html).[grpc](../index.html).[consumer](index.html).[ConsumerFilter](ConsumerFilter$.html)

# [RemoveExcludeEntityIds](ConsumerFilter$$RemoveExcludeEntityIds.html "See companion class")[**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html "Permalink")

### Companion [class RemoveExcludeEntityIds](ConsumerFilter$$RemoveExcludeEntityIds.html "See companion class")

#### object RemoveExcludeEntityIds extends [Serializable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/io/Serializable.html#java.io.Serializable)

Source[ConsumerFilter.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/ConsumerFilter.scala#L385)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RemoveExcludeEntityIds
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#apply(replicaId:akka.persistence.typed.ReplicaId,entityIds:Set[String]):akka.projection.grpc.consumer.ConsumerFilter.RemoveExcludeEntityIds "Permalink")  def apply(replicaId: [ReplicaId](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/typed/ReplicaId.html#akka.persistence.typed.ReplicaId), entityIds: Set\[String]): [RemoveExcludeEntityIds](ConsumerFilter$$RemoveExcludeEntityIds.html)
5. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
7. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
11. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
15. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$Command.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$CurrentFilter.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$EntityIdOffset.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$ExcludeEntityIds$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$ExcludeEntityIds.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$ExcludeRegexEntityIds.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$ExcludeTags.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$FilterCriteria.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$GetFilter.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$IncludeEntityIds$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$IncludeEntityIds.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$IncludeRegexEntityIds.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$IncludeTags.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$IncludeTopics.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$PersistenceIdOffset.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveCriteria.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeRegexEntityIds.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveIncludeEntityIds$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveIncludeEntityIds.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveIncludeRegexEntityIds.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveIncludeTags.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveIncludeTopics.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$Replay$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$Replay.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$ReplayPersistenceId.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$ReplayWithFilter$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$ReplayWithFilter.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$SubscriberCommand.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$UpdateFilter.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html)*