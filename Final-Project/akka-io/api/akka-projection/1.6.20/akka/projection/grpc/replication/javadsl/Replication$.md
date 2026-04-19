---
description: Akka Projection 1.6.20 - akka.projection.grpc.replication.javadsl.Replication
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:02:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replication$.html
title: Akka Projection 1.6.20 - akka.projection.grpc.replication.javadsl.Replication
---

# Akka Projection 1.6.20 - akka.projection.grpc.replication.javadsl.Replication

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.replication.javadsl.Replication

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
- [ReplicationSettings](ReplicationSettings.html "Not for user extension, construct using ReplicationSettings#create")
[o](Replication.html "See companion trait")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[replication](../index.html).[javadsl](index.html)

# [Replication](Replication.html "See companion trait")[**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html "Permalink")

### Companion [trait Replication](Replication.html "See companion trait")

#### object Replication

Source[Replication.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/replication/javadsl/Replication.scala#L82)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Replication
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#grpcEdgeReplication[Command,Event,State](settings:akka.projection.grpc.replication.javadsl.ReplicationSettings[Command],replicatedBehaviorFactory:akka.japi.function.Function[akka.projection.grpc.replication.javadsl.ReplicatedBehaviors[Command,Event,State],akka.actor.typed.Behavior[Command]],system:akka.actor.typed.ActorSystem[_]):akka.projection.grpc.replication.javadsl.EdgeReplication[Command] "Permalink")  def grpcEdgeReplication\[Command, Event, State](settings: [ReplicationSettings](ReplicationSettings.html)\[Command], replicatedBehaviorFactory: [Function](https://doc.akka.io/api/akka-core/2.10.13/akka/japi/function/Function.html#akka.japi.function.Function)\[[ReplicatedBehaviors](ReplicatedBehaviors.html)\[Command, Event, State], [Behavior](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/Behavior.html#akka.actor.typed.Behavior)\[Command]], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [EdgeReplication](EdgeReplication.html)\[Command]Called to bootstrap the entity on each edge node.

Called to bootstrap the entity on each edge node. In edge mode all connections for replication
comes from edge node to cloud. Cloud service needs to be configured for regular grpc replication
with edge replication enabled through `ReplicationSettings#withEdgeReplication(true)`.

Each edge replica must use a unique replica id.

The cloud replicas does not know about the edge replica ids up front (it should not be in their "other replicas" set).

An edge replica can connect to more than one cloud replica for redundancy (but only one is required).
10. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#grpcReplication[Command,Event,State](settings:akka.projection.grpc.replication.javadsl.ReplicationSettings[Command],replicatedBehaviorFactory:akka.japi.function.Function[akka.projection.grpc.replication.javadsl.ReplicatedBehaviors[Command,Event,State],akka.actor.typed.Behavior[Command]],system:akka.actor.typed.ActorSystem[_]):akka.projection.grpc.replication.javadsl.Replication[Command] "Permalink")  def grpcReplication\[Command, Event, State](settings: [ReplicationSettings](ReplicationSettings.html)\[Command], replicatedBehaviorFactory: [Function](https://doc.akka.io/api/akka-core/2.10.13/akka/japi/function/Function.html#akka.japi.function.Function)\[[ReplicatedBehaviors](ReplicatedBehaviors.html)\[Command, Event, State], [Behavior](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/Behavior.html#akka.actor.typed.Behavior)\[Command]], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [Replication](Replication.html)\[Command]Called to bootstrap the entity on each cluster node in each of the replicas.

Called to bootstrap the entity on each cluster node in each of the replicas.

Important: Note that this does not publish the endpoint, additional steps are needed!
11. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
12. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
15. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
16. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#grpcReplication[Command,Event,State](settings:akka.projection.grpc.replication.javadsl.ReplicationSettings[Command],topicExpression:String,replicatedBehaviorFactory:akka.japi.function.Function[akka.projection.grpc.replication.javadsl.ReplicatedBehaviors[Command,Event,State],akka.actor.typed.Behavior[Command]],system:akka.actor.typed.ActorSystem[_]):akka.projection.grpc.replication.javadsl.Replication[Command] "Permalink")  def grpcReplication\[Command, Event, State](settings: [ReplicationSettings](ReplicationSettings.html)\[Command], topicExpression: String, replicatedBehaviorFactory: [Function](https://doc.akka.io/api/akka-core/2.10.13/akka/japi/function/Function.html#akka.japi.function.Function)\[[ReplicatedBehaviors](ReplicatedBehaviors.html)\[Command, Event, State], [Behavior](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/Behavior.html#akka.actor.typed.Behavior)\[Command]], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [Replication](Replication.html)\[Command]Called to bootstrap the entity on each cluster node in each of the replicas.

Called to bootstrap the entity on each cluster node in each of the replicas.

Filter events matching the topic expression according to MQTT specification, including wildcards.
The topic of an event is defined by a tag with certain prefix, see `topic-tag-prefix` configuration.

Important: Note that this does not publish the endpoint, additional steps are needed!

Annotations@Deprecated @deprecated Deprecated*(Since version 1\.5\.1\)* Define topicExpression via settings.withProducerFilterTopicExpression
3. [**](../../../../../akka/projection/grpc/replication/javadsl/Replication$.html#grpcReplication[Command,Event,State](settings:akka.projection.grpc.replication.javadsl.ReplicationSettings[Command],producerFilter:java.util.function.Predicate[akka.persistence.query.typed.EventEnvelope[Event]],replicatedBehaviorFactory:akka.japi.function.Function[akka.projection.grpc.replication.javadsl.ReplicatedBehaviors[Command,Event,State],akka.actor.typed.Behavior[Command]],system:akka.actor.typed.ActorSystem[_]):akka.projection.grpc.replication.javadsl.Replication[Command] "Permalink")  def grpcReplication\[Command, Event, State](settings: [ReplicationSettings](ReplicationSettings.html)\[Command], producerFilter: [Predicate](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[Event]], replicatedBehaviorFactory: [Function](https://doc.akka.io/api/akka-core/2.10.13/akka/japi/function/Function.html#akka.japi.function.Function)\[[ReplicatedBehaviors](ReplicatedBehaviors.html)\[Command, Event, State], [Behavior](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/Behavior.html#akka.actor.typed.Behavior)\[Command]], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [Replication](Replication.html)\[Command]Called to bootstrap the entity on each cluster node in each of the replicas.

Called to bootstrap the entity on each cluster node in each of the replicas.

Filter events matching the `producerFilter` predicate, for example based on tags.

Important: Note that this does not publish the endpoint, additional steps are needed!

Annotations@Deprecated @deprecated Deprecated*(Since version 1\.5\.1\)* Define producerFilter via settings.withProducerFilter
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
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
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replication$.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replication$.html)*