---
description: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.Replicator
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:47:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/javadsl/Replicator$.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.Replicator
---

# Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.Replicator

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.Replicator

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[ddata](../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.")
- [DistributedDataSetup](DistributedDataSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the DistributedData extension.")
- Replicator
- [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "When interacting with the Replicator from an actor this class provides convenient methods that adapts the response messages to the requesting actor's message protocol.")
- [ReplicatorSettings](ReplicatorSettings$.html)
o[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html).[javadsl](index.html)

# Replicator[**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html "Permalink")

### 

#### object Replicator

Source[Replicator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/javadsl/Replicator.scala#L26)See also[akka.cluster.ddata.Replicator](../../Replicator.html).

Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Replicator
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Changed.html "Permalink") final  case class [Changed](Replicator$$Changed.html "The data value is retrieved with #get using the typed key.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A])(data: A) extends [SubscribeResponse](Replicator$$SubscribeResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe data value is retrieved with [\#get](Replicator$$Changed.html#get[T<:akka.cluster.ddata.ReplicatedData](key:akka.cluster.ddata.Key[T]):T) using the typed key.

The data value is retrieved with [\#get](Replicator$$Changed.html#get[T<:akka.cluster.ddata.ReplicatedData](key:akka.cluster.ddata.Key[T]):T) using the typed key.

See also[Replicator.Subscribe](Replicator$$Subscribe.html)
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Command.html "Permalink")  trait [Command](Replicator$$Command.html) extends [scaladsl.Replicator.Command](../scaladsl/Replicator$$Command.html)Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$DataDeleted.html "Permalink") final  case class [DataDeleted](Replicator$$DataDeleted.html)\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A]) extends [DeleteResponse](Replicator$$DeleteResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
4. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Delete.html "Permalink") final  case class [Delete](Replicator$$Delete.html "Send this message to the local Replicator to delete a data value for the given key.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], consistency: [WriteConsistency](Replicator$$WriteConsistency.html), replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[[DeleteResponse](Replicator$$DeleteResponse.html)\[A]]) extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the local `Replicator` to delete a data value for the
given `key`.

Send this message to the local `Replicator` to delete a data value for the
given `key`. The `Replicator` will reply with one of the [DeleteResponse](Replicator$$DeleteResponse.html) messages.
5. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$DeleteFailure.html "Permalink") final  case class [DeleteFailure](Replicator$$DeleteFailure.html)\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A]) extends [DeleteResponse](Replicator$$DeleteResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
6. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$DeleteResponse.html "Permalink") sealed  trait [DeleteResponse](Replicator$$DeleteResponse.html)\[A \<: [ReplicatedData](../../ReplicatedData.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
7. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$DeleteSuccess.html "Permalink") final  case class [DeleteSuccess](Replicator$$DeleteSuccess.html)\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A]) extends [DeleteResponse](Replicator$$DeleteResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
8. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Deleted.html "Permalink") final  case class [Deleted](Replicator$$Deleted.html)\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A]) extends [SubscribeResponse](Replicator$$SubscribeResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSee also[Replicator.Subscribe](Replicator$$Subscribe.html)
9. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Expired.html "Permalink") final  case class [Expired](Replicator$$Expired.html)\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A]) extends [SubscribeResponse](Replicator$$SubscribeResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSee also[Replicator.Subscribe](Replicator$$Subscribe.html)
10. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Get.html "Permalink") final  case class [Get](Replicator$$Get.html "Send this message to the local Replicator to retrieve a data value for the given key.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], consistency: [ReadConsistency](Replicator$$ReadConsistency.html), replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[[GetResponse](Replicator$$GetResponse.html)\[A]]) extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the local `Replicator` to retrieve a data value for the
given `key`.

Send this message to the local `Replicator` to retrieve a data value for the
given `key`. The `Replicator` will reply with one of the [GetResponse](Replicator$$GetResponse.html) messages.
11. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$GetDataDeleted.html "Permalink") final  case class [GetDataDeleted](Replicator$$GetDataDeleted.html "The Get request couldn't be performed because the entry has been deleted.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A]) extends [GetResponse](Replicator$$GetResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe [Get](Replicator$$Get.html) request couldn't be performed because the entry has been deleted.
12. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$GetFailure.html "Permalink") final  case class [GetFailure](Replicator$$GetFailure.html "The Get request could not be fulfill according to the given consistency level and timeout.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A]) extends [GetResponse](Replicator$$GetResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe [Get](Replicator$$Get.html) request could not be fulfill according to the given
[consistency level](Replicator$$ReadConsistency.html) and [timeout](Replicator$$ReadConsistency.html#timeout:java.time.Duration).
13. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$GetReplicaCount.html "Permalink") final  case class [GetReplicaCount](Replicator$$GetReplicaCount.html "Get current number of replicas, including the local replica.")(replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[[ReplicaCount](Replicator$$ReplicaCount.html)]) extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableGet current number of replicas, including the local replica.

Get current number of replicas, including the local replica.
Will reply to sender with [ReplicaCount](Replicator$$ReplicaCount.html).
14. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$GetResponse.html "Permalink") sealed abstract  class [GetResponse](Replicator$$GetResponse.html)\[A \<: [ReplicatedData](../../ReplicatedData.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
15. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$GetSuccess.html "Permalink") final  case class [GetSuccess](Replicator$$GetSuccess.html "Reply from Get.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A])(data: A) extends [GetResponse](Replicator$$GetResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableReply from `Get`.

Reply from `Get`. The data value is retrieved with [\#get](Replicator$$GetSuccess.html#get[T<:akka.cluster.ddata.ReplicatedData](key:akka.cluster.ddata.Key[T]):T) using the typed key.
16. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html "Permalink") final  case class [ModifyFailure](Replicator$$ModifyFailure.html "If the modify function of the Update throws an exception the reply message will be this ModifyFailure message.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], errorMessage: String, cause: Throwable) extends [UpdateFailure](Replicator$$UpdateFailure.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableIf the `modify` function of the [Update](Replicator$$Update.html) throws an exception the reply message
will be this `ModifyFailure` message.

If the `modify` function of the [Update](Replicator$$Update.html) throws an exception the reply message
will be this `ModifyFailure` message. The original exception is included as `cause`.
17. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$NotFound.html "Permalink") final  case class [NotFound](Replicator$$NotFound.html)\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A]) extends [GetResponse](Replicator$$GetResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
18. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ReadAll.html "Permalink") final  case class [ReadAll](Replicator$$ReadAll.html)(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)) extends [ReadConsistency](Replicator$$ReadConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
19. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ReadConsistency.html "Permalink") sealed  trait [ReadConsistency](Replicator$$ReadConsistency.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
20. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ReadFrom.html "Permalink") final  case class [ReadFrom](Replicator$$ReadFrom.html)(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)) extends [ReadConsistency](Replicator$$ReadConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
21. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ReadMajority.html "Permalink") final  case class [ReadMajority](Replicator$$ReadMajority.html)(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), minCap: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= [DefaultMajorityMinCap](../../../../index.html)) extends [ReadConsistency](Replicator$$ReadConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
22. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ReplicaCount.html "Permalink") final  case class [ReplicaCount](Replicator$$ReplicaCount.html "Current number of replicas.")(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableCurrent number of replicas.

Current number of replicas. Reply to `GetReplicaCount`.
23. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$StoreFailure.html "Permalink") final  case class [StoreFailure](Replicator$$StoreFailure.html "The local store or direct replication of the Update could not be fulfill according to the given consistency level due to durable store errors.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A]) extends [UpdateFailure](Replicator$$UpdateFailure.html)\[A] with [DeleteResponse](Replicator$$DeleteResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe local store or direct replication of the [Update](Replicator$$Update.html) could not be fulfill according to
the given [consistency level](Replicator$$WriteConsistency.html) due to durable store errors.

The local store or direct replication of the [Update](Replicator$$Update.html) could not be fulfill according to
the given [consistency level](Replicator$$WriteConsistency.html) due to durable store errors. This is
only used for entries that have been configured to be durable.

The `Update` was still performed in memory locally and possibly replicated to some nodes,
but it might not have been written to durable storage.
It will eventually be disseminated to other replicas, unless the local replica
crashes before it has been able to communicate with other replicas.
24. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Subscribe.html "Permalink") final  case class [Subscribe](Replicator$$Subscribe.html "Register a subscriber that will be notified with a Changed message when the value of the given key is changed.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], subscriber: [ActorRef](../../../../actor/typed/ActorRef.html)\[[SubscribeResponse](Replicator$$SubscribeResponse.html)\[A]]) extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRegister a subscriber that will be notified with a [Changed](Replicator$$Changed.html) message
when the value of the given `key` is changed.

Register a subscriber that will be notified with a [Changed](Replicator$$Changed.html) message
when the value of the given `key` is changed. Current value is also
sent as a [Changed](Replicator$$Changed.html) message to a new subscriber.

Subscribers will be notified periodically with the configured `notify-subscribers-interval`,
and it is also possible to send an explicit `FlushChanges` message to
the `Replicator` to notify the subscribers immediately.

The subscriber will automatically be unregistered if it is terminated.

If the key is deleted the subscriber is notified with a [Deleted](Replicator$$Deleted.html)
message.

If the key is expired the subscriber is notified with a [Expired](Replicator$$Expired.html)
message.
25. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$SubscribeResponse.html "Permalink") sealed  trait [SubscribeResponse](Replicator$$SubscribeResponse.html)\[A \<: [ReplicatedData](../../ReplicatedData.html)] extends [NoSerializationVerificationNeeded](../../../../actor/NoSerializationVerificationNeeded.html)See also[Replicator.Subscribe](Replicator$$Subscribe.html)
26. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Unsubscribe.html "Permalink") final  case class [Unsubscribe](Replicator$$Unsubscribe.html "Unregister a subscriber.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], subscriber: [ActorRef](../../../../actor/typed/ActorRef.html)\[[SubscribeResponse](Replicator$$SubscribeResponse.html)\[A]]) extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableUnregister a subscriber.

Unregister a subscriber.

See also[Replicator.Subscribe](Replicator$$Subscribe.html)
27. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html "Permalink") final  case class [Update](Replicator$$Update.html "Send this message to the local Replicator to update a data value for the given key.")\[A \<: [ReplicatedData](../../ReplicatedData.html)] extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the local `Replicator` to update a data value for the
given `key`.

Send this message to the local `Replicator` to update a data value for the
given `key`. The `Replicator` will reply with one of the [UpdateResponse](Replicator$$UpdateResponse.html) messages.

The current data value for the `key` is passed as parameter to the `modify` function.
It is `None` if there is no value for the `key`, and otherwise `Some(data)`. The function
is supposed to return the new value of the data, which will then be replicated according to
the given `writeConsistency`.

The `modify` function is called by the `Replicator` actor and must therefore be a pure
function that only uses the data parameter and stable fields from enclosing scope. It must
for example not access `sender()` reference of an enclosing actor.
28. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$UpdateDataDeleted.html "Permalink") final  case class [UpdateDataDeleted](Replicator$$UpdateDataDeleted.html "The Update couldn't be performed because the entry has been deleted.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A]) extends [UpdateResponse](Replicator$$UpdateResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe [Update](Replicator$$Update.html) couldn't be performed because the entry has been deleted.
29. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$UpdateFailure.html "Permalink") sealed abstract  class [UpdateFailure](Replicator$$UpdateFailure.html)\[A \<: [ReplicatedData](../../ReplicatedData.html)] extends [UpdateResponse](Replicator$$UpdateResponse.html)\[A]Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
30. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$UpdateResponse.html "Permalink") sealed abstract  class [UpdateResponse](Replicator$$UpdateResponse.html)\[A \<: [ReplicatedData](../../ReplicatedData.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
31. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$UpdateSuccess.html "Permalink") final  case class [UpdateSuccess](Replicator$$UpdateSuccess.html)\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A]) extends [UpdateResponse](Replicator$$UpdateResponse.html)\[A] with [DeadLetterSuppression](../../../../actor/DeadLetterSuppression.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
32. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$UpdateTimeout.html "Permalink") final  case class [UpdateTimeout](Replicator$$UpdateTimeout.html "The direct replication of the Update could not be fulfill according to the given consistency level and timeout.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A]) extends [UpdateFailure](Replicator$$UpdateFailure.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe direct replication of the [Update](Replicator$$Update.html) could not be fulfill according to
the given [consistency level](Replicator$$WriteConsistency.html) and
[timeout](Replicator$$WriteConsistency.html#timeout:java.time.Duration).

The direct replication of the [Update](Replicator$$Update.html) could not be fulfill according to
the given [consistency level](Replicator$$WriteConsistency.html) and
[timeout](Replicator$$WriteConsistency.html#timeout:java.time.Duration).

The `Update` was still performed locally and possibly replicated to some nodes.
It will eventually be disseminated to other replicas, unless the local replica
crashes before it has been able to communicate with other replicas.
33. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$WriteAll.html "Permalink") final  case class [WriteAll](Replicator$$WriteAll.html)(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)) extends [WriteConsistency](Replicator$$WriteConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
34. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$WriteConsistency.html "Permalink") sealed  trait [WriteConsistency](Replicator$$WriteConsistency.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
35. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$WriteMajority.html "Permalink") final  case class [WriteMajority](Replicator$$WriteMajority.html)(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), minCap: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= [DefaultMajorityMinCap](../../../../index.html)) extends [WriteConsistency](Replicator$$WriteConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
36. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$WriteTo.html "Permalink") final  case class [WriteTo](Replicator$$WriteTo.html)(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)) extends [WriteConsistency](Replicator$$WriteConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#behavior(settings:akka.cluster.ddata.ReplicatorSettings,underlyingReplicator:akka.actor.ActorRef):akka.actor.typed.Behavior[akka.cluster.ddata.typed.javadsl.Replicator.Command] "Permalink")  def behavior(settings: [ddata.ReplicatorSettings](../../ReplicatorSettings.html), underlyingReplicator: [ActorRef](../../../../actor/ActorRef.html)): [Behavior](../../../../actor/typed/Behavior.html)\[[Command](Replicator$$Command.html)]The `Behavior` for the `Replicator` actor.

The `Behavior` for the `Replicator` actor.
It will use the given underlying [akka.cluster.ddata.Replicator](../../Replicator.html)
6. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#behavior(settings:akka.cluster.ddata.ReplicatorSettings):akka.actor.typed.Behavior[akka.cluster.ddata.typed.javadsl.Replicator.Command] "Permalink")  def behavior(settings: [ddata.ReplicatorSettings](../../ReplicatorSettings.html)): [Behavior](../../../../actor/typed/Behavior.html)\[[Command](Replicator$$Command.html)]The `Behavior` for the `Replicator` actor.
7. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#flushChanges:akka.cluster.ddata.typed.javadsl.Replicator.Command "Permalink")  def flushChanges: [Command](Replicator$$Command.html)The `FlushChanges` instance.

The `FlushChanges` instance. Notify subscribers of changes now, otherwise they will be notified periodically
with the configured `notify-subscribers-interval`.
11. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#readLocal:akka.cluster.ddata.typed.javadsl.Replicator.ReadConsistency "Permalink")  def readLocal: [ReadConsistency](Replicator$$ReadConsistency.html)The `ReadLocal` instance
18. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#writeLocal:akka.cluster.ddata.typed.javadsl.Replicator.WriteConsistency "Permalink")  def writeLocal: [WriteConsistency](Replicator$$WriteConsistency.html)The `WriteLocal` instance
24. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ReadLocal$.html "Permalink")  case object [ReadLocal](Replicator$$ReadLocal$.html) extends [ReadConsistency](Replicator$$ReadConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
25. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update$.html "Permalink")  object [Update](Replicator$$Update$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
26. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$WriteLocal$.html "Permalink")  case object [WriteLocal](Replicator$$WriteLocal$.html) extends [WriteConsistency](Replicator$$WriteConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ReplicatorSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/DistributedData$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/DistributedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$Changed.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$Command.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$DataDeleted.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$Delete.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$DeleteFailure.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$DeleteResponse.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$DeleteSuccess.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$Deleted.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$Expired.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$Get.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$GetDataDeleted.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$GetFailure.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$GetReplicaCount.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$GetResponse.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$GetSuccess.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$NotFound.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$ReadAll.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$ReadConsistency.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$ReadFrom.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$ReadLocal$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$ReadMajority.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$ReplicaCount.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$StoreFailure.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$Subscribe.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$SubscribeResponse.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$Unsubscribe.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$Update$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$Update.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$UpdateDataDeleted.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$UpdateFailure.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$UpdateResponse.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$UpdateSuccess.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$$UpdateTimeout.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$.html)*