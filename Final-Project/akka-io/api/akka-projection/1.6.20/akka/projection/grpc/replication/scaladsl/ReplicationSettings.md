---
description: Akka Projection 1.6.20 - akka.projection.grpc.replication.scaladsl.ReplicationSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:02:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings.html
title: Akka Projection 1.6.20 - akka.projection.grpc.replication.scaladsl.ReplicationSettings
---

# Akka Projection 1.6.20 - akka.projection.grpc.replication.scaladsl.ReplicationSettings

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.replication.scaladsl.ReplicationSettings

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/replication/index.html "Permalink")  package [replication](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/replication/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[replication](../index.html)
- [Replica](Replica.html "Not for user extension, construct using Replica.apply")
- [ReplicatedBehaviors](ReplicatedBehaviors.html "Dynamically provides factory methods for creating replicated event sourced behaviors.")
- [Replication](Replication.html "Created using Replication.grpcReplication, which starts sharding with the entity and replication stream consumers but not the replication endpoint needed to publish events to other replication places.")
- [ReplicationProjectionProvider](ReplicationProjectionProvider.html "Factory/function for creating the projection where offsets are kept track of for the replication streams")
- ReplicationSettings
[c](ReplicationSettings$.html "See companion object")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[replication](../index.html).[scaladsl](index.html)

# [ReplicationSettings](ReplicationSettings$.html "See companion object")[**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html "Permalink")

### Companion [object ReplicationSettings](ReplicationSettings$.html "See companion object")

#### final  class ReplicationSettings\[Command] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Not for user extension. Constructed through companion object factories.

Source[ReplicationSettings.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/replication/scaladsl/ReplicationSettings.scala#L166)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReplicationSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#acceptEdgeReplication:Boolean "Permalink")  val acceptEdgeReplication: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
5. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
7. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#configureEntity(configure:akka.cluster.sharding.typed.scaladsl.Entity[Command,akka.cluster.sharding.typed.ShardingEnvelope[Command]]=>akka.cluster.sharding.typed.scaladsl.Entity[Command,akka.cluster.sharding.typed.ShardingEnvelope[Command]]):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def configureEntity(configure: ([Entity](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/scaladsl/Entity.html#akka.cluster.sharding.typed.scaladsl.Entity)\[Command, [ShardingEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/ShardingEnvelope.html#akka.cluster.sharding.typed.ShardingEnvelope)\[Command]]) \=\> [Entity](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/scaladsl/Entity.html#akka.cluster.sharding.typed.scaladsl.Entity)\[Command, [ShardingEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/ShardingEnvelope.html#akka.cluster.sharding.typed.ShardingEnvelope)\[Command]]): ReplicationSettings\[Command]Allows for changing the settings of the replicated entity, such as stop message, passivation strategy etc.
8. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#configureEntity:akka.cluster.sharding.typed.scaladsl.Entity[Command,akka.cluster.sharding.typed.ShardingEnvelope[Command]]=>akka.cluster.sharding.typed.scaladsl.Entity[Command,akka.cluster.sharding.typed.ShardingEnvelope[Command]] "Permalink")  val configureEntity: ([Entity](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/scaladsl/Entity.html#akka.cluster.sharding.typed.scaladsl.Entity)\[Command, [ShardingEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/ShardingEnvelope.html#akka.cluster.sharding.typed.ShardingEnvelope)\[Command]]) \=\> [Entity](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/scaladsl/Entity.html#akka.cluster.sharding.typed.scaladsl.Entity)\[Command, [ShardingEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/ShardingEnvelope.html#akka.cluster.sharding.typed.ShardingEnvelope)\[Command]]
9. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#edgeReplicationDeliveryMaxBackoff:scala.concurrent.duration.FiniteDuration "Permalink")  val edgeReplicationDeliveryMaxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
10. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#edgeReplicationDeliveryMinBackoff:scala.concurrent.duration.FiniteDuration "Permalink")  val edgeReplicationDeliveryMinBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
11. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#edgeReplicationDeliveryRetries:Int "Permalink")  val edgeReplicationDeliveryRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
12. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#entityEventReplicationTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val entityEventReplicationTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
13. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#entityTypeKey:akka.cluster.sharding.typed.scaladsl.EntityTypeKey[Command] "Permalink")  val entityTypeKey: [EntityTypeKey](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#akka.cluster.sharding.typed.scaladsl.EntityTypeKey)\[Command]
14. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#eventOriginFilterEnabled:Boolean "Permalink")  val eventOriginFilterEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
17. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#eventProducerInterceptor:Option[akka.projection.grpc.producer.scaladsl.EventProducerInterceptor] "Permalink")  val eventProducerInterceptor: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[EventProducerInterceptor](../../producer/scaladsl/EventProducerInterceptor.html)]
18. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#eventProducerSettings:akka.projection.grpc.producer.EventProducerSettings "Permalink")  val eventProducerSettings: [EventProducerSettings](../../producer/EventProducerSettings.html)
19. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
20. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
21. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#initialConsumerFilter:Seq[akka.projection.grpc.consumer.ConsumerFilter.FilterCriteria] "Permalink")  val initialConsumerFilter: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[FilterCriteria](../../consumer/ConsumerFilter$$FilterCriteria.html)]
22. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
25. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
26. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#otherReplicas:Set[akka.projection.grpc.replication.scaladsl.Replica] "Permalink")  val otherReplicas: Set\[[Replica](Replica.html)]
27. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#parallelUpdates:Int "Permalink")  val parallelUpdates: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
28. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#producerFilter:akka.persistence.query.typed.EventEnvelope[Any]=>Boolean "Permalink")  val producerFilter: ([EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
29. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#projectionProvider:akka.projection.grpc.replication.scaladsl.ReplicationProjectionProvider "Permalink")  val projectionProvider: [ReplicationProjectionProvider](ReplicationProjectionProvider.html)
30. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#selfReplicaId:akka.persistence.typed.ReplicaId "Permalink")  val selfReplicaId: [ReplicaId](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/typed/ReplicaId.html#akka.persistence.typed.ReplicaId)
31. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#streamId:String "Permalink")  val streamId: String
32. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesReplicationSettings → AnyRef → Any
34. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withEdgeReplication(edgeReplicationAllowed:Boolean):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withEdgeReplication(edgeReplicationAllowed: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicationSettings\[Command]Allow edge replicas to connect and replicate updates, default is to not allow.
38. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withEdgeReplicationDeliveryMaxBackoff(maxBackoff:scala.concurrent.duration.FiniteDuration):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withEdgeReplicationDeliveryMaxBackoff(maxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ReplicationSettings\[Command]
39. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withEdgeReplicationDeliveryMinBackoff(minBackoff:scala.concurrent.duration.FiniteDuration):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withEdgeReplicationDeliveryMinBackoff(minBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ReplicationSettings\[Command]
40. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withEdgeReplicationDeliveryRetries(retries:Int):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withEdgeReplicationDeliveryRetries(retries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ReplicationSettings\[Command]Replicated event sourcing from edge sends each event over sharding, in case that delivery
fails or times out, retry this number of times
41. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withEntityEventReplicationTimeout(duration:scala.concurrent.duration.FiniteDuration):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withEntityEventReplicationTimeout(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ReplicationSettings\[Command]Set the timeout for events being completely processed after arriving to a node in the replication stream
42. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withEventOriginFilterEnabled(enabled:Boolean):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withEventOriginFilterEnabled(enabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicationSettings\[Command]
43. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withEventProducerInterceptor(interceptor:akka.projection.grpc.producer.scaladsl.EventProducerInterceptor):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withEventProducerInterceptor(interceptor: [EventProducerInterceptor](../../producer/scaladsl/EventProducerInterceptor.html)): ReplicationSettings\[Command]Add an interceptor to the gRPC event producer for example for authentication of incoming requests
44. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withEventProducerSettings(eventProducerSettings:akka.projection.grpc.producer.EventProducerSettings):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withEventProducerSettings(eventProducerSettings: [EventProducerSettings](../../producer/EventProducerSettings.html)): ReplicationSettings\[Command]
45. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withInitialConsumerFilter(initialConsumerFilter:Seq[akka.projection.grpc.consumer.ConsumerFilter.FilterCriteria]):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withInitialConsumerFilter(initialConsumerFilter: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[FilterCriteria](../../consumer/ConsumerFilter$$FilterCriteria.html)]): ReplicationSettings\[Command]Set the initial consumer filter to use for events.

Set the initial consumer filter to use for events. Should only be used for static, up front consumer filters.
Combining this with updating consumer filters directly means that the filters may be reset to these
filters.
46. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withOtherReplicas(replicas:Set[akka.projection.grpc.replication.scaladsl.Replica]):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withOtherReplicas(replicas: Set\[[Replica](Replica.html)]): ReplicationSettings\[Command]
47. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withParallelUpdates(parallelUpdates:Int):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withParallelUpdates(parallelUpdates: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ReplicationSettings\[Command]Run up to this many parallel updates over sharding.

Run up to this many parallel updates over sharding. Note however that updates for the same persistence id
is always sequential.
48. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withProducerFilter[Event](producerFilter:akka.persistence.query.typed.EventEnvelope[Event]=>Boolean):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withProducerFilter\[Event](producerFilter: ([EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[Event]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicationSettings\[Command]Filter events matching the `producerFilter` predicate, for example based on tags.
49. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withProducerFilterTopicExpression(topicExpression:String):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withProducerFilterTopicExpression(topicExpression: String): ReplicationSettings\[Command]Filter events matching the topic expression according to MQTT specification, including wildcards.

Filter events matching the topic expression according to MQTT specification, including wildcards.
The topic of an event is defined by a tag with certain prefix, see `topic-tag-prefix` configuration.
50. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withProjectionProvider(projectionProvider:akka.projection.grpc.replication.scaladsl.ReplicationProjectionProvider):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withProjectionProvider(projectionProvider: [ReplicationProjectionProvider](ReplicationProjectionProvider.html)): ReplicationSettings\[Command]Change projection provider
51. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withSelfReplicaId(selfReplicaId:akka.persistence.typed.ReplicaId):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withSelfReplicaId(selfReplicaId: [ReplicaId](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/typed/ReplicaId.html#akka.persistence.typed.ReplicaId)): ReplicationSettings\[Command]
52. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#withStreamId(streamId:String):akka.projection.grpc.replication.scaladsl.ReplicationSettings[Command] "Permalink")  def withStreamId(streamId: String): ReplicationSettings\[Command]
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$FilterCriteria.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/EventProducerSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducerInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replica$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replica.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicatedBehaviors.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replication$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replication.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings.html)*