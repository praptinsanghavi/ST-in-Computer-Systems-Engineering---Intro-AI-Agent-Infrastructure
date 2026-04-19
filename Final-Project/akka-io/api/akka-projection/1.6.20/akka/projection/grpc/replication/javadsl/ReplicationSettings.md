---
description: Akka Projection 1.6.20 - akka.projection.grpc.replication.javadsl.ReplicationSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:02:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationSettings.html
title: Akka Projection 1.6.20 - akka.projection.grpc.replication.javadsl.ReplicationSettings
---

# Akka Projection 1.6.20 - akka.projection.grpc.replication.javadsl.ReplicationSettings

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.replication.javadsl.ReplicationSettings

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/replication/index.html "Permalink")  package [replication](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/replication/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[replication](../index.html)
- [EdgeReplication](EdgeReplication.html)
- [Replica](Replica.html "Not for user extension, construct using Replica.create")
- [ReplicatedBehaviors](ReplicatedBehaviors.html "Dynamically provides factory methods for creating replicated event sourced behaviors.")
- [Replication](Replication.html "Created using Replication.grpcReplication, which starts sharding with the entity and replication stream consumers but not the replication endpoint needed to publish events to other replication places.")
- [ReplicationProjectionProvider](ReplicationProjectionProvider.html "Factory for creating the projection where offsets are kept track of for the replication streams")
- ReplicationSettings
[c](ReplicationSettings$.html "See companion object")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[replication](../index.html).[javadsl](index.html)

# [ReplicationSettings](ReplicationSettings$.html "See companion object")[**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html "Permalink")

### Companion [object ReplicationSettings](ReplicationSettings$.html "See companion object")

#### final  class ReplicationSettings\[Command] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Not for user extension, construct using ReplicationSettings\#create

Annotations@DoNotInherit() Source[ReplicationSettings.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/replication/javadsl/ReplicationSettings.scala#L153)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#configureEntity(configure:java.util.function.Function[akka.cluster.sharding.typed.javadsl.Entity[Command,akka.cluster.sharding.typed.ShardingEnvelope[Command]],akka.cluster.sharding.typed.javadsl.Entity[Command,akka.cluster.sharding.typed.ShardingEnvelope[Command]]]):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def configureEntity(configure: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[[Entity](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/javadsl/Entity.html#akka.cluster.sharding.typed.javadsl.Entity)\[Command, [ShardingEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/ShardingEnvelope.html#akka.cluster.sharding.typed.ShardingEnvelope)\[Command]], [Entity](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/javadsl/Entity.html#akka.cluster.sharding.typed.javadsl.Entity)\[Command, [ShardingEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/ShardingEnvelope.html#akka.cluster.sharding.typed.ShardingEnvelope)\[Command]]]): ReplicationSettings\[Command]Allows for changing the settings of the replicated entity, such as stop message, passivation strategy etc.
7. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#configureEntity:java.util.function.Function[akka.cluster.sharding.typed.javadsl.Entity[Command,akka.cluster.sharding.typed.ShardingEnvelope[Command]],akka.cluster.sharding.typed.javadsl.Entity[Command,akka.cluster.sharding.typed.ShardingEnvelope[Command]]] "Permalink")  val configureEntity: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[[Entity](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/javadsl/Entity.html#akka.cluster.sharding.typed.javadsl.Entity)\[Command, [ShardingEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/ShardingEnvelope.html#akka.cluster.sharding.typed.ShardingEnvelope)\[Command]], [Entity](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/javadsl/Entity.html#akka.cluster.sharding.typed.javadsl.Entity)\[Command, [ShardingEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/ShardingEnvelope.html#akka.cluster.sharding.typed.ShardingEnvelope)\[Command]]]
8. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#edgeReplication:Boolean "Permalink")  val edgeReplication: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
9. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#edgeReplicationDeliveryMaxBackoff:java.time.Duration "Permalink")  val edgeReplicationDeliveryMaxBackoff: [Duration](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/time/Duration.html#java.time.Duration)
10. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#edgeReplicationDeliveryMinBackoff:java.time.Duration "Permalink")  val edgeReplicationDeliveryMinBackoff: [Duration](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/time/Duration.html#java.time.Duration)
11. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#edgeReplicationDeliveryRetries:Int "Permalink")  val edgeReplicationDeliveryRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
12. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#entityEventReplicationTimeout:java.time.Duration "Permalink")  val entityEventReplicationTimeout: [Duration](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/time/Duration.html#java.time.Duration)
13. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#entityTypeKey:akka.cluster.sharding.typed.javadsl.EntityTypeKey[Command] "Permalink")  val entityTypeKey: [EntityTypeKey](https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html#akka.cluster.sharding.typed.javadsl.EntityTypeKey)\[Command]
14. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#eventProducerInterceptor:java.util.Optional[akka.projection.grpc.producer.javadsl.EventProducerInterceptor] "Permalink")  val eventProducerInterceptor: [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[EventProducerInterceptor](../../producer/javadsl/EventProducerInterceptor.html)]
17. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#eventProducerSettings:akka.projection.grpc.producer.EventProducerSettings "Permalink")  val eventProducerSettings: [EventProducerSettings](../../producer/EventProducerSettings.html)
18. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
19. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
20. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#initialConsumerFilter:java.util.List[akka.projection.grpc.consumer.ConsumerFilter.FilterCriteria] "Permalink")  val initialConsumerFilter: [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[[FilterCriteria](../../consumer/ConsumerFilter$$FilterCriteria.html)]
21. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
24. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
25. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#otherReplicas:java.util.Set[akka.projection.grpc.replication.javadsl.Replica] "Permalink")  val otherReplicas: [Set](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Set.html#java.util.Set)\[[Replica](Replica.html)]
26. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#parallelUpdates:Int "Permalink")  val parallelUpdates: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
27. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#producerFilter:java.util.function.Predicate[akka.persistence.query.typed.EventEnvelope[Any]] "Permalink")  val producerFilter: [Predicate](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]
28. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#replicationProjectionProvider:akka.projection.grpc.replication.javadsl.ReplicationProjectionProvider "Permalink")  val replicationProjectionProvider: [ReplicationProjectionProvider](ReplicationProjectionProvider.html)
29. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#selfReplicaId:akka.persistence.typed.ReplicaId "Permalink")  val selfReplicaId: [ReplicaId](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/typed/ReplicaId.html#akka.persistence.typed.ReplicaId)
30. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#streamId:String "Permalink")  val streamId: String
31. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesReplicationSettings → AnyRef → Any
33. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withEdgeReplication(edgeReplication:Boolean):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withEdgeReplication(edgeReplication: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicationSettings\[Command]
37. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withEdgeReplicationDeliveryMaxBackoff(maxBackoff:java.time.Duration):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withEdgeReplicationDeliveryMaxBackoff(maxBackoff: [Duration](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/time/Duration.html#java.time.Duration)): ReplicationSettings\[Command]
38. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withEdgeReplicationDeliveryMinBackoff(minBackoff:java.time.Duration):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withEdgeReplicationDeliveryMinBackoff(minBackoff: [Duration](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/time/Duration.html#java.time.Duration)): ReplicationSettings\[Command]
39. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withEdgeReplicationDeliveryRetries(retries:Int):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withEdgeReplicationDeliveryRetries(retries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ReplicationSettings\[Command]Replicated event sourcing from edge sends each event over sharding, in case that delivery
fails or times out, retry this number of times
40. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withEntityEventReplicationTimeout(duration:java.time.Duration):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withEntityEventReplicationTimeout(duration: [Duration](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/time/Duration.html#java.time.Duration)): ReplicationSettings\[Command]Set the timeout for events being completely processed after arriving to a node in the replication stream
41. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withEventProducerInterceptor(interceptor:akka.projection.grpc.producer.javadsl.EventProducerInterceptor):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withEventProducerInterceptor(interceptor: [EventProducerInterceptor](../../producer/javadsl/EventProducerInterceptor.html)): ReplicationSettings\[Command]Add an interceptor to the gRPC event producer for example for authentication of incoming requests
42. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withEventProducerSettings(eventProducerSettings:akka.projection.grpc.producer.EventProducerSettings):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withEventProducerSettings(eventProducerSettings: [EventProducerSettings](../../producer/EventProducerSettings.html)): ReplicationSettings\[Command]
43. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withInitialConsumerFilter(initialConsumerFilter:java.util.List[akka.projection.grpc.consumer.ConsumerFilter.FilterCriteria]):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withInitialConsumerFilter(initialConsumerFilter: [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[[FilterCriteria](../../consumer/ConsumerFilter$$FilterCriteria.html)]): ReplicationSettings\[Command]Set the initial consumer filter to use for events.

Set the initial consumer filter to use for events. Should only be used for static, up front consumer filters.
Combining this with updating consumer filters directly means that the filters may be reset to these
filters.
44. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withOtherReplicas(otherReplicas:java.util.Set[akka.projection.grpc.replication.javadsl.Replica]):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withOtherReplicas(otherReplicas: [Set](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Set.html#java.util.Set)\[[Replica](Replica.html)]): ReplicationSettings\[Command]
45. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withParallelUpdates(parallelUpdates:Int):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withParallelUpdates(parallelUpdates: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ReplicationSettings\[Command]Run up to this many parallel updates over sharding.

Run up to this many parallel updates over sharding. Note however that updates for the same persistence id
is always sequential.
46. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withProducerFilter[Event](producerFilter:java.util.function.Predicate[akka.persistence.query.typed.EventEnvelope[Event]]):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withProducerFilter\[Event](producerFilter: [Predicate](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[Event]]): ReplicationSettings\[Command]Filter events matching the `producerFilter` predicate, for example based on tags.
47. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withProducerFilterTopicExpression(topicExpression:String):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withProducerFilterTopicExpression(topicExpression: String): ReplicationSettings\[Command]Filter events matching the topic expression according to MQTT specification, including wildcards.

Filter events matching the topic expression according to MQTT specification, including wildcards.
The topic of an event is defined by a tag with certain prefix, see `topic-tag-prefix` configuration.
48. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withProjectionProvider(projectionProvider:akka.projection.grpc.replication.javadsl.ReplicationProjectionProvider):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withProjectionProvider(projectionProvider: [ReplicationProjectionProvider](ReplicationProjectionProvider.html)): ReplicationSettings\[Command]Change projection provider
49. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withSelfReplicaId(selfReplicaId:akka.persistence.typed.ReplicaId):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withSelfReplicaId(selfReplicaId: [ReplicaId](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/typed/ReplicaId.html#akka.persistence.typed.ReplicaId)): ReplicationSettings\[Command]
50. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#withStreamId(streamId:String):akka.projection.grpc.replication.javadsl.ReplicationSettings[Command] "Permalink")  def withStreamId(streamId: String): ReplicationSettings\[Command]
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/replication/javadsl/ReplicationSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/javadsl/Entity.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$FilterCriteria.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/EventProducerSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/EdgeReplication.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replica$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replica.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicatedBehaviors.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replication$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replication.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationProjectionProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationSettings$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationSettings.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationSettings.html)*