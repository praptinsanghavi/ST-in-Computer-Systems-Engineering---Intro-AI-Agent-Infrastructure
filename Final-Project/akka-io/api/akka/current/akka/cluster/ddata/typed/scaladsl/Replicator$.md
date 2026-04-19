---
description: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.Replicator
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:47:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/scaladsl/Replicator$.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.Replicator
---

# Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.Replicator

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.Replicator

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[ddata](../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.")
- Replicator
- [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "When interacting with the Replicator from an actor this class provides convenient methods that adapts the response messages to the requesting actor's message protocol.")
- [ReplicatorSettings](ReplicatorSettings$.html)
o[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html).[scaladsl](index.html)

# Replicator[**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html "Permalink")

### 

#### object Replicator

Source[Replicator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/scaladsl/Replicator.scala#L19)See also[akka.cluster.ddata.Replicator](../../Replicator.html).

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

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#Changed[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.Changed[A] "Permalink")  type Changed\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.Changed](../../Replicator$$Changed.html)\[A]The data value is retrieved with dd.Replicator.Changed.get using the typed key.

The data value is retrieved with dd.Replicator.Changed.get using the typed key.

See also[Subscribe](Replicator$$Subscribe.html)
2. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Command.html "Permalink")  trait [Command](Replicator$$Command.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#DataDeleted[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DataDeleted[A] "Permalink")  type DataDeleted\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.DataDeleted](../../Replicator$$DataDeleted.html)\[A]
4. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html "Permalink") final  case class [Delete](Replicator$$Delete.html "Send this message to the local Replicator to delete a data value for the given key.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], consistency: [WriteConsistency](#WriteConsistency=akka.cluster.ddata.Replicator.WriteConsistency), replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[[DeleteResponse](#DeleteResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DeleteResponse[A])\[A]]) extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the local `Replicator` to delete a data value for the
given `key`.

Send this message to the local `Replicator` to delete a data value for the
given `key`. The `Replicator` will reply with one of the [DeleteResponse](#DeleteResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DeleteResponse[A]) messages.
5. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#DeleteFailure[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.ReplicationDeleteFailure[A] "Permalink")  type DeleteFailure\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [ReplicationDeleteFailure](../../Replicator$$ReplicationDeleteFailure.html)\[A]
6. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#DeleteResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DeleteResponse[A] "Permalink")  type DeleteResponse\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.DeleteResponse](../../Replicator$$DeleteResponse.html)\[A]
7. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#DeleteSuccess[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DeleteSuccess[A] "Permalink")  type DeleteSuccess\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.DeleteSuccess](../../Replicator$$DeleteSuccess.html)\[A]
8. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#Deleted[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.Deleted[A] "Permalink")  type Deleted\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.Deleted](../../Replicator$$Deleted.html)\[A]See also[Delete](Replicator$$Delete.html)
9. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#Expired[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.Expired[A] "Permalink")  type Expired\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.Expired](../../Replicator$$Expired.html)\[A]See also[Expired](#Expired[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.Expired[A])
10. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Get.html "Permalink") final  case class [Get](Replicator$$Get.html "Send this message to the local Replicator to retrieve a data value for the given key.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], consistency: [ReadConsistency](#ReadConsistency=akka.cluster.ddata.Replicator.ReadConsistency), replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[[GetResponse](#GetResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.GetResponse[A])\[A]]) extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the local `Replicator` to retrieve a data value for the
given `key`.

Send this message to the local `Replicator` to retrieve a data value for the
given `key`. The `Replicator` will reply with one of the [GetResponse](#GetResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.GetResponse[A]) messages.
11. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#GetDataDeleted[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.GetDataDeleted[A] "Permalink")  type GetDataDeleted\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.GetDataDeleted](../../Replicator$$GetDataDeleted.html)\[A]The [Get](Replicator$$Get.html) request couldn't be performed because the entry has been deleted.
12. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#GetFailure[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.GetFailure[A] "Permalink")  type GetFailure\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.GetFailure](../../Replicator$$GetFailure.html)\[A]The [Get](Replicator$$Get.html) request could not be fulfill according to the given
[consistency level](#ReadConsistency=akka.cluster.ddata.Replicator.ReadConsistency) and timeout.
13. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$GetReplicaCount.html "Permalink") final  case class [GetReplicaCount](Replicator$$GetReplicaCount.html "Get current number of replicas, including the local replica.")(replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[[ReplicaCount](#ReplicaCount=akka.cluster.ddata.Replicator.ReplicaCount)]) extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableGet current number of replicas, including the local replica.

Get current number of replicas, including the local replica.
Will reply to sender with [ReplicaCount](#ReplicaCount=akka.cluster.ddata.Replicator.ReplicaCount).
14. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#GetResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.GetResponse[A] "Permalink")  type GetResponse\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.GetResponse](../../Replicator$$GetResponse.html)\[A]Reply from `Get`.

Reply from `Get`. The data value is retrieved with dd.Replicator.GetSuccess.get using the typed key.
15. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#GetSuccess[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.GetSuccess[A] "Permalink")  type GetSuccess\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.GetSuccess](../../Replicator$$GetSuccess.html)\[A]
16. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#ModifyFailure[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.ModifyFailure[A] "Permalink")  type ModifyFailure\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.ModifyFailure](../../Replicator$$ModifyFailure.html)\[A]If the `modify` function of the [Update](Replicator$$Update.html) throws an exception the reply message
will be this `ModifyFailure` message.

If the `modify` function of the [Update](Replicator$$Update.html) throws an exception the reply message
will be this `ModifyFailure` message. The original exception is included as `cause`.
17. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#NotFound[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.NotFound[A] "Permalink")  type NotFound\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.NotFound](../../Replicator$$NotFound.html)\[A]
18. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#ReadAll=akka.cluster.ddata.Replicator.ReadAll "Permalink")  type ReadAll \= [Replicator.ReadAll](../../Replicator$$ReadAll.html)
19. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#ReadConsistency=akka.cluster.ddata.Replicator.ReadConsistency "Permalink")  type ReadConsistency \= [Replicator.ReadConsistency](../../Replicator$$ReadConsistency.html)
20. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#ReadFrom=akka.cluster.ddata.Replicator.ReadFrom "Permalink")  type ReadFrom \= [Replicator.ReadFrom](../../Replicator$$ReadFrom.html)
21. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#ReadMajority=akka.cluster.ddata.Replicator.ReadMajority "Permalink")  type ReadMajority \= [Replicator.ReadMajority](../../Replicator$$ReadMajority.html)
22. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#ReplicaCount=akka.cluster.ddata.Replicator.ReplicaCount "Permalink")  type ReplicaCount \= [Replicator.ReplicaCount](../../Replicator$$ReplicaCount.html)Current number of replicas.

Current number of replicas. Reply to `GetReplicaCount`.
23. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#StoreFailure[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.StoreFailure[A] "Permalink")  type StoreFailure\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.StoreFailure](../../Replicator$$StoreFailure.html)\[A]The local store or direct replication of the [Update](Replicator$$Update.html) could not be fulfill according to
the given [consistency level](#WriteConsistency=akka.cluster.ddata.Replicator.WriteConsistency) due to durable store errors.

The local store or direct replication of the [Update](Replicator$$Update.html) could not be fulfill according to
the given [consistency level](#WriteConsistency=akka.cluster.ddata.Replicator.WriteConsistency) due to durable store errors. This is
only used for entries that have been configured to be durable.

The `Update` was still performed in memory locally and possibly replicated to some nodes,
but it might not have been written to durable storage.
It will eventually be disseminated to other replicas, unless the local replica
crashes before it has been able to communicate with other replicas.
24. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Subscribe.html "Permalink") final  case class [Subscribe](Replicator$$Subscribe.html "Register a subscriber that will be notified with a Changed message when the value of the given key is changed.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], subscriber: [ActorRef](../../../../actor/typed/ActorRef.html)\[[SubscribeResponse](#SubscribeResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.SubscribeResponse[A])\[A]]) extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRegister a subscriber that will be notified with a [Changed](#Changed[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.Changed[A]) message
when the value of the given `key` is changed.

Register a subscriber that will be notified with a [Changed](#Changed[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.Changed[A]) message
when the value of the given `key` is changed. Current value is also
sent as a [Changed](#Changed[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.Changed[A]) message to a new subscriber.

Subscribers will be notified periodically with the configured `notify-subscribers-interval`,
and it is also possible to send an explicit `FlushChanges` message to
the `Replicator` to notify the subscribers immediately.

The subscriber will automatically be unregistered if it is terminated.

If the key is deleted the subscriber is notified with a [Deleted](#Deleted[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.Deleted[A])
message.
25. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#SubscribeResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.SubscribeResponse[A] "Permalink")  type SubscribeResponse\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.SubscribeResponse](../../Replicator$$SubscribeResponse.html)\[A]See also[Subscribe](Replicator$$Subscribe.html)
26. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Unsubscribe.html "Permalink") final  case class [Unsubscribe](Replicator$$Unsubscribe.html "Unregister a subscriber.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], subscriber: [ActorRef](../../../../actor/typed/ActorRef.html)\[[SubscribeResponse](#SubscribeResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.SubscribeResponse[A])\[A]]) extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableUnregister a subscriber.

Unregister a subscriber.

See also[Subscribe](Replicator$$Subscribe.html)
27. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Update.html "Permalink") final  case class [Update](Replicator$$Update.html "Send this message to the local Replicator to update a data value for the given key.")\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], writeConsistency: [WriteConsistency](#WriteConsistency=akka.cluster.ddata.Replicator.WriteConsistency), replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[[UpdateResponse](#UpdateResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.UpdateResponse[A])\[A]])(modify: ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]) \=\> A) extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the local `Replicator` to update a data value for the
given `key`.

Send this message to the local `Replicator` to update a data value for the
given `key`. The `Replicator` will reply with one of the [UpdateResponse](#UpdateResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.UpdateResponse[A]) messages.

Note that the [companion](Replicator$$Update$.html) object provides `apply` functions for convenient
construction of this message.

The current data value for the `key` is passed as parameter to the `modify` function.
It is `None` if there is no value for the `key`, and otherwise `Some(data)`. The function
is supposed to return the new value of the data, which will then be replicated according to
the given `writeConsistency`.

The `modify` function is called by the `Replicator` actor and must therefore be a pure
function that only uses the data parameter and stable fields from enclosing scope. It must
for example not access `sender()` reference of an enclosing actor.
28. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#UpdateDataDeleted[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.UpdateDataDeleted[A] "Permalink")  type UpdateDataDeleted\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.UpdateDataDeleted](../../Replicator$$UpdateDataDeleted.html)\[A]The [Update](Replicator$$Update.html) couldn't be performed because the entry has been deleted.
29. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#UpdateFailure[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.UpdateFailure[A] "Permalink")  type UpdateFailure\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.UpdateFailure](../../Replicator$$UpdateFailure.html)\[A]
30. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#UpdateResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.UpdateResponse[A] "Permalink")  type UpdateResponse\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.UpdateResponse](../../Replicator$$UpdateResponse.html)\[A]
31. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#UpdateSuccess[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.UpdateSuccess[A] "Permalink")  type UpdateSuccess\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.UpdateSuccess](../../Replicator$$UpdateSuccess.html)\[A]
32. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#UpdateTimeout[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.UpdateTimeout[A] "Permalink")  type UpdateTimeout\[A \<: [ReplicatedData](../../ReplicatedData.html)] \= [Replicator.UpdateTimeout](../../Replicator$$UpdateTimeout.html)\[A]The direct replication of the [Update](Replicator$$Update.html) could not be fulfill according to
the given [consistency level](#WriteConsistency=akka.cluster.ddata.Replicator.WriteConsistency) and
timeout.

The direct replication of the [Update](Replicator$$Update.html) could not be fulfill according to
the given [consistency level](#WriteConsistency=akka.cluster.ddata.Replicator.WriteConsistency) and
timeout.

The `Update` was still performed locally and possibly replicated to some nodes.
It will eventually be disseminated to other replicas, unless the local replica
crashes before it has been able to communicate with other replicas.
33. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#WriteAll=akka.cluster.ddata.Replicator.WriteAll "Permalink")  type WriteAll \= [Replicator.WriteAll](../../Replicator$$WriteAll.html)
34. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#WriteConsistency=akka.cluster.ddata.Replicator.WriteConsistency "Permalink")  type WriteConsistency \= [Replicator.WriteConsistency](../../Replicator$$WriteConsistency.html)
35. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#WriteMajority=akka.cluster.ddata.Replicator.WriteMajority "Permalink")  type WriteMajority \= [Replicator.WriteMajority](../../Replicator$$WriteMajority.html)
36. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#WriteTo=akka.cluster.ddata.Replicator.WriteTo "Permalink")  type WriteTo \= [Replicator.WriteTo](../../Replicator$$WriteTo.html)
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#ReadLocal:akka.cluster.ddata.Replicator.ReadLocal.type "Permalink")  val ReadLocal: [Replicator.ReadLocal](../../Replicator$$ReadLocal$.html).type
5. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#WriteLocal:akka.cluster.ddata.Replicator.WriteLocal.type "Permalink")  val WriteLocal: [Replicator.WriteLocal](../../Replicator$$WriteLocal$.html).type
6. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#behavior(settings:akka.cluster.ddata.typed.scaladsl.ReplicatorSettings,underlyingReplicator:akka.actor.ActorRef):akka.actor.typed.Behavior[akka.cluster.ddata.typed.scaladsl.Replicator.Command] "Permalink")  def behavior(settings: [ReplicatorSettings](index.html#ReplicatorSettings=akka.cluster.ddata.ReplicatorSettings), underlyingReplicator: [ActorRef](../../../../actor/ActorRef.html)): [Behavior](../../../../actor/typed/Behavior.html)\[[Command](Replicator$$Command.html)]The `Behavior` for the `Replicator` actor.

The `Behavior` for the `Replicator` actor.
It will use the given underlying [akka.cluster.ddata.Replicator](../../Replicator.html)
8. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#behavior(settings:akka.cluster.ddata.typed.scaladsl.ReplicatorSettings):akka.actor.typed.Behavior[akka.cluster.ddata.typed.scaladsl.Replicator.Command] "Permalink")  def behavior(settings: [ReplicatorSettings](index.html#ReplicatorSettings=akka.cluster.ddata.ReplicatorSettings)): [Behavior](../../../../actor/typed/Behavior.html)\[[Command](Replicator$$Command.html)]The `Behavior` for the `Replicator` actor.
9. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Changed$.html "Permalink")  object [Changed](Replicator$$Changed$.html "The data value is retrieved with dd.Replicator.Changed.get using the typed key.")The data value is retrieved with dd.Replicator.Changed.get using the typed key.

The data value is retrieved with dd.Replicator.Changed.get using the typed key.

See also[Subscribe](Replicator$$Subscribe.html)
24. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$DataDeleted$.html "Permalink")  object [DataDeleted](Replicator$$DataDeleted$.html)
25. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html "Permalink")  object [Delete](Replicator$$Delete$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
26. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$DeleteFailure$.html "Permalink")  object [DeleteFailure](Replicator$$DeleteFailure$.html)
27. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$DeleteSuccess$.html "Permalink")  object [DeleteSuccess](Replicator$$DeleteSuccess$.html)
28. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Deleted$.html "Permalink")  object [Deleted](Replicator$$Deleted$.html)
29. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Expired$.html "Permalink")  object [Expired](Replicator$$Expired$.html)
30. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$FlushChanges$.html "Permalink")  object [FlushChanges](Replicator$$FlushChanges$.html "Notify subscribers of changes now, otherwise they will be notified periodically with the configured notify-subscribers-interval.") extends [Command](Replicator$$Command.html)Notify subscribers of changes now, otherwise they will be notified periodically
with the configured `notify-subscribers-interval`.
31. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Get$.html "Permalink")  object [Get](Replicator$$Get$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
32. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$GetDataDeleted$.html "Permalink")  object [GetDataDeleted](Replicator$$GetDataDeleted$.html)
33. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$GetFailure$.html "Permalink")  object [GetFailure](Replicator$$GetFailure$.html)
34. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$GetReplicaCount$.html "Permalink")  object [GetReplicaCount](Replicator$$GetReplicaCount$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
35. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$GetSuccess$.html "Permalink")  object [GetSuccess](Replicator$$GetSuccess$.html)
36. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$ModifyFailure$.html "Permalink")  object [ModifyFailure](Replicator$$ModifyFailure$.html)
37. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$NotFound$.html "Permalink")  object [NotFound](Replicator$$NotFound$.html)
38. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$ReadAll$.html "Permalink")  object [ReadAll](Replicator$$ReadAll$.html)
39. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$ReadFrom$.html "Permalink")  object [ReadFrom](Replicator$$ReadFrom$.html)
40. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$ReadMajority$.html "Permalink")  object [ReadMajority](Replicator$$ReadMajority$.html)
41. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$ReplicaCount$.html "Permalink")  object [ReplicaCount](Replicator$$ReplicaCount$.html)
42. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$StoreFailure$.html "Permalink")  object [StoreFailure](Replicator$$StoreFailure$.html)
43. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Update$.html "Permalink")  object [Update](Replicator$$Update$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
44. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$UpdateDataDeleted$.html "Permalink")  object [UpdateDataDeleted](Replicator$$UpdateDataDeleted$.html)
45. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$UpdateFailure$.html "Permalink")  object [UpdateFailure](Replicator$$UpdateFailure$.html)
46. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$UpdateSuccess$.html "Permalink")  object [UpdateSuccess](Replicator$$UpdateSuccess$.html)
47. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$UpdateTimeout$.html "Permalink")  object [UpdateTimeout](Replicator$$UpdateTimeout$.html)
48. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$WriteAll$.html "Permalink")  object [WriteAll](Replicator$$WriteAll$.html)
49. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$WriteMajority$.html "Permalink")  object [WriteMajority](Replicator$$WriteMajority$.html)
50. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$WriteTo$.html "Permalink")  object [WriteTo](Replicator$$WriteTo$.html)
### Deprecated Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$Changed.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$DataDeleted.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$DeleteResponse.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$DeleteSuccess.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$Deleted.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$Expired.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$GetDataDeleted.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$GetFailure.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$GetResponse.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$GetSuccess.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$ModifyFailure.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$NotFound.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$ReadAll.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$ReadConsistency.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$ReadFrom.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$ReadLocal$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$ReadMajority.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$ReplicaCount.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$ReplicationDeleteFailure.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$StoreFailure.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$SubscribeResponse.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$UpdateDataDeleted.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$UpdateFailure.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$UpdateResponse.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$UpdateSuccess.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$UpdateTimeout.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$WriteAll.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$WriteConsistency.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$WriteLocal$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$WriteMajority.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator$$WriteTo.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/DistributedData$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/DistributedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$$Changed$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$$Command.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$$DataDeleted$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$$DeleteFailure$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$$DeleteSuccess$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$$Deleted$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$$Expired$.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$.html)*