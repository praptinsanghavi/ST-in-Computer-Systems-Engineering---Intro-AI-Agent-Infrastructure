---
description: Akka Projection 1.6.20 - akka.projection.grpc.consumer.ConsumerFilter
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$.html
title: Akka Projection 1.6.20 - akka.projection.grpc.consumer.ConsumerFilter
---

# Akka Projection 1.6.20 - akka.projection.grpc.consumer.ConsumerFilter

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.consumer.ConsumerFilter

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/grpc/consumer/index.html "Permalink")  package [consumer](index.html)Definition Classes[grpc](../index.html)
- [**](../../../../akka/projection/grpc/consumer/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[consumer](index.html)
- [**](../../../../akka/projection/grpc/consumer/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[consumer](index.html)
- [ConsumerFilter](ConsumerFilter.html)
- [EventProducerPushDestinationSettings](EventProducerPushDestinationSettings.html)
- [GrpcQuerySettings](GrpcQuerySettings.html)
- [GrpcReadJournalProvider](GrpcReadJournalProvider.html "Note that GrpcReadJournal should be created with the GrpcReadJournal apply / create factory method and not from configuration via GrpcReadJournalProvider when using Protobuf serialization.")
[o](ConsumerFilter.html "See companion class")[akka](../../../index.html).[projection](../../index.html).[grpc](../index.html).[consumer](index.html)

# [ConsumerFilter](ConsumerFilter.html "See companion class")[**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html "Permalink")

### Companion [class ConsumerFilter](ConsumerFilter.html "See companion class")

#### object ConsumerFilter extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ExtensionId.html#akka.actor.typed.ExtensionId)\[[ConsumerFilter](ConsumerFilter.html)]

Extension to dynamically control the filters for the `GrpcReadJournal`.

Source[ConsumerFilter.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/ConsumerFilter.scala#L33)Linear Supertypes[ExtensionId](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ExtensionId.html#akka.actor.typed.ExtensionId)\[[ConsumerFilter](ConsumerFilter.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConsumerFilter
2. ExtensionId
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$Command.html "Permalink")  trait [Command](ConsumerFilter$$Command.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$CurrentFilter.html "Permalink") final  case class [CurrentFilter](ConsumerFilter$$CurrentFilter.html)(streamId: String, criteria: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[FilterCriteria](ConsumerFilter$$FilterCriteria.html)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
3. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$EntityIdOffset.html "Permalink") final  case class [EntityIdOffset](ConsumerFilter$$EntityIdOffset.html)(entityId: String, seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
4. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$ExcludeEntityIds.html "Permalink") final  case class [ExcludeEntityIds](ConsumerFilter$$ExcludeEntityIds.html "Exclude events for entities with the given entity ids, unless there is a matching include filter that overrides the exclude.")(entityIds: Set\[String]) extends [FilterCriteria](ConsumerFilter$$FilterCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableExclude events for entities with the given entity ids,
unless there is a matching include filter that overrides the exclude.
5. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$ExcludeRegexEntityIds.html "Permalink") final  case class [ExcludeRegexEntityIds](ConsumerFilter$$ExcludeRegexEntityIds.html "Exclude events for entities with entity ids matching the given regular expressions, unless there is a matching include filter that overrides the exclude.")(matching: Set\[String]) extends [FilterCriteria](ConsumerFilter$$FilterCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableExclude events for entities with entity ids matching the given regular expressions,
unless there is a matching include filter that overrides the exclude.
6. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$ExcludeTags.html "Permalink") final  case class [ExcludeTags](ConsumerFilter$$ExcludeTags.html "Exclude events with any of the given tags, unless there is a matching include filter that overrides the exclude.")(tags: Set\[String]) extends [FilterCriteria](ConsumerFilter$$FilterCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableExclude events with any of the given tags,
unless there is a matching include filter that overrides the exclude.
7. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$FilterCriteria.html "Permalink") sealed  trait [FilterCriteria](ConsumerFilter$$FilterCriteria.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
8. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$GetFilter.html "Permalink") final  case class [GetFilter](ConsumerFilter$$GetFilter.html)(streamId: String, replyTo: [ActorRef](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorRef.html#akka.actor.typed.ActorRef)\[[CurrentFilter](ConsumerFilter$$CurrentFilter.html)]) extends [Command](ConsumerFilter$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
9. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$IncludeEntityIds.html "Permalink") final  case class [IncludeEntityIds](ConsumerFilter$$IncludeEntityIds.html "Include events for entities with the given entity ids.")(entityOffsets: Set\[[EntityIdOffset](ConsumerFilter$$EntityIdOffset.html)]) extends [FilterCriteria](ConsumerFilter$$FilterCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableInclude events for entities with the given entity ids.

Include events for entities with the given entity ids. A matching include overrides
a matching exclude.

For the given entity ids a `seqNr` can be defined to replay all events for the entity
from the sequence number (inclusive). If `seqNr` is 0 events will not be replayed.
10. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$IncludeRegexEntityIds.html "Permalink") final  case class [IncludeRegexEntityIds](ConsumerFilter$$IncludeRegexEntityIds.html "Include events for entities with entity ids matching the given regular expressions.")(matching: Set\[String]) extends [FilterCriteria](ConsumerFilter$$FilterCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableInclude events for entities with entity ids matching the given regular expressions.

Include events for entities with entity ids matching the given regular expressions.
A matching include overrides a matching exclude.
11. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$IncludeTags.html "Permalink") final  case class [IncludeTags](ConsumerFilter$$IncludeTags.html "Include events with any of the given tags.")(tags: Set\[String]) extends [FilterCriteria](ConsumerFilter$$FilterCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableInclude events with any of the given tags.

Include events with any of the given tags. A matching include overrides
a matching exclude.
12. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$IncludeTopics.html "Permalink") final  case class [IncludeTopics](ConsumerFilter$$IncludeTopics.html "Include events with any of the given matching topics.")(expressions: Set\[String]) extends [FilterCriteria](ConsumerFilter$$FilterCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableInclude events with any of the given matching topics.

Include events with any of the given matching topics. A matching include overrides a matching exclude.

Topic match expression according to MQTT specification, including wildcards.
The topic of an event is defined by a tag with certain prefix, see `topic-tag-prefix` configuration.
13. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$PersistenceIdOffset.html "Permalink") final  case class [PersistenceIdOffset](ConsumerFilter$$PersistenceIdOffset.html)(persistenceIdId: String, seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
14. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveCriteria.html "Permalink") sealed  trait [RemoveCriteria](ConsumerFilter$$RemoveCriteria.html) extends [FilterCriteria](ConsumerFilter$$FilterCriteria.html)
15. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds.html "Permalink") final  case class [RemoveExcludeEntityIds](ConsumerFilter$$RemoveExcludeEntityIds.html "Remove a previously added ExcludeEntityIds.")(entityIds: Set\[String]) extends [RemoveCriteria](ConsumerFilter$$RemoveCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRemove a previously added [ExcludeEntityIds](ConsumerFilter$$ExcludeEntityIds.html).
16. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeRegexEntityIds.html "Permalink") final  case class [RemoveExcludeRegexEntityIds](ConsumerFilter$$RemoveExcludeRegexEntityIds.html "Remove a previously added ExcludeRegexEntityIds.")(matching: Set\[String]) extends [RemoveCriteria](ConsumerFilter$$RemoveCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRemove a previously added [ExcludeRegexEntityIds](ConsumerFilter$$ExcludeRegexEntityIds.html).
17. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeTags.html "Permalink") final  case class [RemoveExcludeTags](ConsumerFilter$$RemoveExcludeTags.html "Remove a previously added ExcludeTags.")(tags: Set\[String]) extends [RemoveCriteria](ConsumerFilter$$RemoveCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRemove a previously added [ExcludeTags](ConsumerFilter$$ExcludeTags.html).
18. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveIncludeEntityIds.html "Permalink") final  case class [RemoveIncludeEntityIds](ConsumerFilter$$RemoveIncludeEntityIds.html "Remove a previously added IncludeEntityIds.")(entityIds: Set\[String]) extends [RemoveCriteria](ConsumerFilter$$RemoveCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRemove a previously added [IncludeEntityIds](ConsumerFilter$$IncludeEntityIds.html).
19. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveIncludeRegexEntityIds.html "Permalink") final  case class [RemoveIncludeRegexEntityIds](ConsumerFilter$$RemoveIncludeRegexEntityIds.html "Remove a previously added IncludeRegexEntityIds.")(matching: Set\[String]) extends [RemoveCriteria](ConsumerFilter$$RemoveCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRemove a previously added [IncludeRegexEntityIds](ConsumerFilter$$IncludeRegexEntityIds.html).
20. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveIncludeTags.html "Permalink") final  case class [RemoveIncludeTags](ConsumerFilter$$RemoveIncludeTags.html "Remove a previously added IncludeTags.")(tags: Set\[String]) extends [FilterCriteria](ConsumerFilter$$FilterCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRemove a previously added [IncludeTags](ConsumerFilter$$IncludeTags.html).
21. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveIncludeTopics.html "Permalink") final  case class [RemoveIncludeTopics](ConsumerFilter$$RemoveIncludeTopics.html "Remove a previously added IncludeTopics.")(expressions: Set\[String]) extends [FilterCriteria](ConsumerFilter$$FilterCriteria.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRemove a previously added [IncludeTopics](ConsumerFilter$$IncludeTopics.html).
22. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$Replay.html "Permalink") final  class [Replay](ConsumerFilter$$Replay.html "Explicit request to replay events for given entities.") extends [Product2](https://www.scala-lang.org/api/2.13.17/scala/Product2.html#scala.Product2)\[String, Set\[[PersistenceIdOffset](ConsumerFilter$$PersistenceIdOffset.html)]] with [SubscriberCommand](ConsumerFilter$$SubscriberCommand.html) with SerializableExplicit request to replay events for given entities.

Explicit request to replay events for given entities.

Use the `replayCorrelationId` from the `GrpcReadJournal`.
23. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$ReplayPersistenceId.html "Permalink") final  case class [ReplayPersistenceId](ConsumerFilter$$ReplayPersistenceId.html)(persistenceIdOffset: [PersistenceIdOffset](ConsumerFilter$$PersistenceIdOffset.html), filterAfterSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
24. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$ReplayWithFilter.html "Permalink") final  class [ReplayWithFilter](ConsumerFilter$$ReplayWithFilter.html "Explicit request to replay events for given entities.") extends [Product2](https://www.scala-lang.org/api/2.13.17/scala/Product2.html#scala.Product2)\[String, Set\[[ReplayPersistenceId](ConsumerFilter$$ReplayPersistenceId.html)]] with [SubscriberCommand](ConsumerFilter$$SubscriberCommand.html) with SerializableExplicit request to replay events for given entities.

Explicit request to replay events for given entities.

Use the `replayCorrelationId` from the `GrpcReadJournal`.
25. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$SubscriberCommand.html "Permalink") sealed  trait [SubscriberCommand](ConsumerFilter$$SubscriberCommand.html) extends [Command](ConsumerFilter$$Command.html)
26. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$UpdateFilter.html "Permalink") final  case class [UpdateFilter](ConsumerFilter$$UpdateFilter.html "Add or remove filter criteria.")(streamId: String, criteria: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[FilterCriteria](ConsumerFilter$$FilterCriteria.html)]) extends [SubscriberCommand](ConsumerFilter$$SubscriberCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAdd or remove filter criteria.

Add or remove filter criteria.

Exclude criteria are evaluated first.
If no matching exclude criteria the event is emitted.
If an exclude criteria is matching the include criteria are evaluated.
If no matching include criteria the event is discarded.
If matching include criteria the event is emitted.
### Value Members

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#apply(system:akka.actor.typed.ActorSystem[_]):T "Permalink") final  def apply(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [ConsumerFilter](ConsumerFilter.html)Definition ClassesExtensionId
5. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
7. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#createExtension(system:akka.actor.typed.ActorSystem[_]):akka.projection.grpc.consumer.ConsumerFilter "Permalink")  def createExtension(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [ConsumerFilter](ConsumerFilter.html)Definition ClassesConsumerFilter → ExtensionId
8. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesExtensionId → AnyRef → Any
10. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#excludeAll:akka.projection.grpc.consumer.ConsumerFilter.FilterCriteria "Permalink")  val excludeAll: [FilterCriteria](ConsumerFilter$$FilterCriteria.html)Exclude events from all entity ids, convenience for combining with for example a topic filter
to include only events matching the topic filter.
11. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#get(system:akka.actor.typed.ActorSystem[_]):akka.projection.grpc.consumer.ConsumerFilter "Permalink")  def get(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [ConsumerFilter](ConsumerFilter.html)Java API: retrieve the extension instance for the given system.
12. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesExtensionId → AnyRef → Any
14. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#id:akka.actor.typed.ExtensionId[T] "Permalink")  def id: [ExtensionId](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ExtensionId.html#akka.actor.typed.ExtensionId)\[[ConsumerFilter](ConsumerFilter.html)]Definition ClassesExtensionId
15. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
18. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
19. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$ExcludeEntityIds$.html "Permalink")  object [ExcludeEntityIds](ConsumerFilter$$ExcludeEntityIds$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/io/Serializable.html#java.io.Serializable)
25. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$IncludeEntityIds$.html "Permalink")  object [IncludeEntityIds](ConsumerFilter$$IncludeEntityIds$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/io/Serializable.html#java.io.Serializable)
26. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveExcludeEntityIds$.html "Permalink")  object [RemoveExcludeEntityIds](ConsumerFilter$$RemoveExcludeEntityIds$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/io/Serializable.html#java.io.Serializable)
27. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$RemoveIncludeEntityIds$.html "Permalink")  object [RemoveIncludeEntityIds](ConsumerFilter$$RemoveIncludeEntityIds$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/io/Serializable.html#java.io.Serializable)
28. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$Replay$.html "Permalink")  object [Replay](ConsumerFilter$$Replay$.html) extends [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[String, Set\[[PersistenceIdOffset](ConsumerFilter$$PersistenceIdOffset.html)], [Replay](ConsumerFilter$$Replay.html)] with [Serializable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/io/Serializable.html#java.io.Serializable)
29. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$$ReplayWithFilter$.html "Permalink")  object [ReplayWithFilter](ConsumerFilter$$ReplayWithFilter$.html) extends [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[String, Set\[[ReplayPersistenceId](ConsumerFilter$$ReplayPersistenceId.html)], [ReplayWithFilter](ConsumerFilter$$ReplayWithFilter.html)] with [Serializable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionId](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ExtensionId.html#akka.actor.typed.ExtensionId)\[[ConsumerFilter](ConsumerFilter.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html
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
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/EventProducerPushDestinationSettings$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/EventProducerPushDestinationSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcReadJournalProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$.html)*