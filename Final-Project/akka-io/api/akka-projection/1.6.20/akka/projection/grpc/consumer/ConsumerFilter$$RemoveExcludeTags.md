---
description: Akka Projection 1.6.20 - akka.projection.grpc.consumer.ConsumerFilter.RemoveExcludeTags
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:47:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html
title: Akka Projection 1.6.20 - akka.projection.grpc.consumer.ConsumerFilter.RemoveExcludeTags
---

# Akka Projection 1.6.20 - akka.projection.grpc.consumer.ConsumerFilter.RemoveExcludeTags

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.consumer.ConsumerFilter.RemoveExcludeTags

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
- RemoveExcludeTags
- [RemoveIncludeEntityIds](ConsumerFilter$$RemoveIncludeEntityIds.html "Remove a previously added IncludeEntityIds.")
- [RemoveIncludeRegexEntityIds](ConsumerFilter$$RemoveIncludeRegexEntityIds.html "Remove a previously added IncludeRegexEntityIds.")
- [RemoveIncludeTags](ConsumerFilter$$RemoveIncludeTags.html "Remove a previously added IncludeTags.")
- [RemoveIncludeTopics](ConsumerFilter$$RemoveIncludeTopics.html "Remove a previously added IncludeTopics.")
- [Replay](ConsumerFilter$$Replay.html "Explicit request to replay events for given entities.")
- [ReplayPersistenceId](ConsumerFilter$$ReplayPersistenceId.html)
- [ReplayWithFilter](ConsumerFilter$$ReplayWithFilter.html "Explicit request to replay events for given entities.")
- [SubscriberCommand](ConsumerFilter$$SubscriberCommand.html)
- [UpdateFilter](ConsumerFilter$$UpdateFilter.html "Add or remove filter criteria.")
c[akka](../../../index.html).[projection](../../index.html).[grpc](../index.html).[consumer](index.html).[ConsumerFilter](ConsumerFilter$.html)

# RemoveExcludeTags[**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html "Permalink")

### 

#### final  case class RemoveExcludeTags(tags: Set\[String]) extends [RemoveCriteria](ConsumerFilter$$RemoveCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Remove a previously added [ExcludeTags](ConsumerFilter$$ExcludeTags.html).

Source[ConsumerFilter.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/ConsumerFilter.scala#L267)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [RemoveCriteria](ConsumerFilter$$RemoveCriteria.html), [FilterCriteria](ConsumerFilter$$FilterCriteria.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RemoveExcludeTags
2. Serializable
3. Product
4. Equals
5. RemoveCriteria
6. FilterCriteria
7. AnyRef
8. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#<init>(tags:java.util.Set[String]):akka.projection.grpc.consumer.ConsumerFilter.RemoveExcludeTags "Permalink")  new RemoveExcludeTags(tags: [Set](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Set.html#java.util.Set)\[String])Java API
2. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#<init>(tags:Set[String]):akka.projection.grpc.consumer.ConsumerFilter.RemoveExcludeTags "Permalink")  new RemoveExcludeTags(tags: Set\[String])
### Value Members

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
8. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
9. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
11. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
12. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
13. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
14. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#tags:Set[String] "Permalink")  val tags: Set\[String]
15. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
16. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
17. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [RemoveCriteria](ConsumerFilter$$RemoveCriteria.html)

### Inherited from [FilterCriteria](ConsumerFilter$$FilterCriteria.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ExtensionId.html
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
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html)*