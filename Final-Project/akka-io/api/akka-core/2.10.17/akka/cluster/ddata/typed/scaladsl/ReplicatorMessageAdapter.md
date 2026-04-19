---
description: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.ReplicatorMessageAdapter
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:24:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.ReplicatorMessageAdapter
---

# Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.ReplicatorMessageAdapter

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.ReplicatorMessageAdapter

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[ddata](../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.")
- [Replicator](Replicator$.html)
- ReplicatorMessageAdapter
- [ReplicatorSettings](ReplicatorSettings$.html)
[c](ReplicatorMessageAdapter$.html "See companion object")[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [ReplicatorMessageAdapter](ReplicatorMessageAdapter$.html "See companion object")[**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html "Permalink")

### Companion [object ReplicatorMessageAdapter](ReplicatorMessageAdapter$.html "See companion object")

#### class ReplicatorMessageAdapter\[A, B \<: [ReplicatedData](../../ReplicatedData.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

When interacting with the `Replicator` from an actor this class provides convenient
methods that adapts the response messages to the requesting actor's message protocol.

One `ReplicatorMessageAdapter` instance can be used for a given `ReplicatedData` type,
e.g. an `OrSet[String]`. Interaction with several [Key](../../Key.html)s can be used via the same adapter
but they must all be of the same `ReplicatedData` type. For interaction with several different
`ReplicatedData` types, e.g. an `OrSet[String]` and a `GCounter`, an adapter can be created
for each type.

For the default replicator in the [DistributedData](DistributedData.html) extension a `ReplicatorMessageAdapter`
can be created with [DistributedData.withReplicatorMessageAdapter](DistributedData$.html#withReplicatorMessageAdapter[A,B<:akka.cluster.ddata.ReplicatedData](factory:akka.cluster.ddata.typed.scaladsl.ReplicatorMessageAdapter[A,B]=>akka.actor.typed.Behavior[A]):akka.actor.typed.Behavior[A]).

\*Warning\*: `ReplicatorMessageAdapter` is not thread\-safe and must only be used from the actor
corresponding to the given `ActorContext`. It must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
It must not be shared between several actor instances.

AMessage type of the requesting actor.

BType of the [ReplicatedData](../../ReplicatedData.html).

Source[ReplicatorMessageAdapter.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.scala#L57)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReplicatorMessageAdapter
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#<init>(context:akka.actor.typed.scaladsl.ActorContext[A],replicator:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.scaladsl.Replicator.Command],unexpectedAskTimeout:scala.concurrent.duration.FiniteDuration):akka.cluster.ddata.typed.scaladsl.ReplicatorMessageAdapter[A,B] "Permalink")  new ReplicatorMessageAdapter(context: [ActorContext](../../../../actor/typed/scaladsl/ActorContext.html)\[A], replicator: [ActorRef](../../../../actor/typed/ActorRef.html)\[[Command](Replicator$$Command.html)], unexpectedAskTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))contextThe ActorContext of the requesting actor. The `ReplicatorMessageAdapter` can
 only be used in this actor.

replicatorThe replicator to interact with, typically `DistributedData(system).replicator`.

unexpectedAskTimeoutThe timeout to use for `ask` operations. This should be longer than
 the `timeout` given in [Replicator.WriteConsistency](Replicator$.html#WriteConsistency=akka.cluster.ddata.Replicator.WriteConsistency) and
 [Replicator.ReadConsistency](Replicator$.html#ReadConsistency=akka.cluster.ddata.Replicator.ReadConsistency). The replicator will always send
 a reply within those timeouts so the `unexpectedAskTimeout` should
 not occur, but for cleanup in a failure situation it must still exist.
 If `askUpdate`, `askGet` or `askDelete` takes longer then this
 `unexpectedAskTimeout` a [java.util.concurrent.TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html)
 will be thrown by the requesting actor and may be handled by supervision.
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toany2stringadd\[ReplicatorMessageAdapter\[A, B]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReplicatorMessageAdapter\[A, B], B)ImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toArrowAssoc\[ReplicatorMessageAdapter\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#askDelete(createRequest:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.scaladsl.Replicator.DeleteResponse[B]]=>akka.cluster.ddata.typed.scaladsl.Replicator.Delete[B],responseAdapter:akka.cluster.ddata.typed.scaladsl.Replicator.DeleteResponse[B]=>A):Unit "Permalink")  def askDelete(createRequest: ([ActorRef](../../../../actor/typed/ActorRef.html)\[[DeleteResponse](Replicator$.html#DeleteResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DeleteResponse[A])\[B]]) \=\> [Delete](Replicator$$Delete.html)\[B], responseAdapter: ([DeleteResponse](Replicator$.html#DeleteResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DeleteResponse[A])\[B]) \=\> A): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a [Replicator.Delete](Replicator$$Delete.html) request to the replicator.

Send a [Replicator.Delete](Replicator$$Delete.html) request to the replicator. The [Replicator.DeleteResponse](Replicator$.html#DeleteResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DeleteResponse[A])
message is transformed to the message protocol of the requesting actor with the given
`responseAdapter` function.

Note that `createRequest` is a function that creates the `Delete` message from the provided
`ActorRef[DeleteResponse]` that the the replicator will send the response message back through.
Use that `ActorRef[DeleteResponse]` as the `replyTo` parameter in the `Delete` message.
8. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#askGet(createRequest:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.scaladsl.Replicator.GetResponse[B]]=>akka.cluster.ddata.typed.scaladsl.Replicator.Get[B],responseAdapter:akka.cluster.ddata.typed.scaladsl.Replicator.GetResponse[B]=>A):Unit "Permalink")  def askGet(createRequest: ([ActorRef](../../../../actor/typed/ActorRef.html)\[[GetResponse](Replicator$.html#GetResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.GetResponse[A])\[B]]) \=\> [Get](Replicator$$Get.html)\[B], responseAdapter: ([GetResponse](Replicator$.html#GetResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.GetResponse[A])\[B]) \=\> A): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a [Replicator.Get](Replicator$$Get.html) request to the replicator.

Send a [Replicator.Get](Replicator$$Get.html) request to the replicator. The [Replicator.GetResponse](Replicator$.html#GetResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.GetResponse[A])
message is transformed to the message protocol of the requesting actor with the given
`responseAdapter` function.

Note that `createRequest` is a function that creates the `Get` message from the provided
`ActorRef[GetResponse]` that the the replicator will send the response message back through.
Use that `ActorRef[GetResponse]` as the `replyTo` parameter in the `Get` message.
9. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#askReplicaCount(createRequest:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.scaladsl.Replicator.ReplicaCount]=>akka.cluster.ddata.typed.scaladsl.Replicator.GetReplicaCount,responseAdapter:akka.cluster.ddata.typed.scaladsl.Replicator.ReplicaCount=>A):Unit "Permalink")  def askReplicaCount(createRequest: ([ActorRef](../../../../actor/typed/ActorRef.html)\[[ReplicaCount](Replicator$.html#ReplicaCount=akka.cluster.ddata.Replicator.ReplicaCount)]) \=\> [GetReplicaCount](Replicator$$GetReplicaCount.html), responseAdapter: ([ReplicaCount](Replicator$.html#ReplicaCount=akka.cluster.ddata.Replicator.ReplicaCount)) \=\> A): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a [Replicator.GetReplicaCount](Replicator$$GetReplicaCount.html) request to the replicator.

Send a [Replicator.GetReplicaCount](Replicator$$GetReplicaCount.html) request to the replicator. The [Replicator.ReplicaCount](Replicator$.html#ReplicaCount=akka.cluster.ddata.Replicator.ReplicaCount)
message is transformed to the message protocol of the requesting actor with the given
`responseAdapter` function.

Note that `createRequest` is a function that creates the `GetReplicaCount` message from the provided
`ActorRef[ReplicaCount]` that the the replicator will send the response message back through.
Use that `ActorRef[ReplicaCount]` as the `replyTo` parameter in the `GetReplicaCount` message.
10. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#askUpdate(createRequest:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.scaladsl.Replicator.UpdateResponse[B]]=>akka.cluster.ddata.typed.scaladsl.Replicator.Update[B],responseAdapter:akka.cluster.ddata.typed.scaladsl.Replicator.UpdateResponse[B]=>A):Unit "Permalink")  def askUpdate(createRequest: ([ActorRef](../../../../actor/typed/ActorRef.html)\[[UpdateResponse](Replicator$.html#UpdateResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.UpdateResponse[A])\[B]]) \=\> [Update](Replicator$$Update.html)\[B], responseAdapter: ([UpdateResponse](Replicator$.html#UpdateResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.UpdateResponse[A])\[B]) \=\> A): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a [Replicator.Update](Replicator$$Update.html) request to the replicator.

Send a [Replicator.Update](Replicator$$Update.html) request to the replicator. The [Replicator.UpdateResponse](Replicator$.html#UpdateResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.UpdateResponse[A])
message is transformed to the message protocol of the requesting actor with the given
`responseAdapter` function.

Note that `createRequest` is a function that creates the `Update` message from the provided
`ActorRef[UpdateResponse]` that the the replicator will send the response message back through.
Use that `ActorRef[UpdateResponse]` as the `replyTo` parameter in the `Update` message.
11. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReplicatorMessageAdapter\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatorMessageAdapter\[A, B]ImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toEnsuring\[ReplicatorMessageAdapter\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReplicatorMessageAdapter\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatorMessageAdapter\[A, B]ImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toEnsuring\[ReplicatorMessageAdapter\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatorMessageAdapter\[A, B]ImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toEnsuring\[ReplicatorMessageAdapter\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatorMessageAdapter\[A, B]ImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toEnsuring\[ReplicatorMessageAdapter\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#subscribe(key:akka.cluster.ddata.Key[B],responseAdapter:akka.cluster.ddata.typed.scaladsl.Replicator.SubscribeResponse[B]=>A):Unit "Permalink")  def subscribe(key: [Key](../../Key.html)\[B], responseAdapter: ([SubscribeResponse](Replicator$.html#SubscribeResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.SubscribeResponse[A])\[B]) \=\> A): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Subscribe to changes of the given `key`.

Subscribe to changes of the given `key`. The [Replicator.Changed](Replicator$.html#Changed[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.Changed[A]), [Replicator.Deleted](Replicator$.html#Deleted[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.Deleted[A]) and
[Replicator.Expired](Replicator$.html#Expired[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.Expired[A]) messages from the replicator are transformed to the message protocol of the
requesting actor with the given `responseAdapter` function.
25. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#unsubscribe(key:akka.cluster.ddata.Key[B]):Unit "Permalink")  def unsubscribe(key: [Key](../../Key.html)\[B]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Unsubscribe from a previous subscription of a given `key`.

Unsubscribe from a previous subscription of a given `key`.

See also[ReplicatorMessageAdapter.subscribe](#subscribe(key:akka.cluster.ddata.Key[B],responseAdapter:akka.cluster.ddata.typed.scaladsl.Replicator.SubscribeResponse[B]=>A):Unit)
28. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toStringFormat\[ReplicatorMessageAdapter\[A, B]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReplicatorMessageAdapter\[A, B], B)ImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toArrowAssoc\[ReplicatorMessageAdapter\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReplicatorMessageAdapter\[A, B] to any2stringadd\[ReplicatorMessageAdapter\[A, B]]

### Inherited by implicit conversion StringFormat fromReplicatorMessageAdapter\[A, B] to StringFormat\[ReplicatorMessageAdapter\[A, B]]

### Inherited by implicit conversion Ensuring fromReplicatorMessageAdapter\[A, B] to Ensuring\[ReplicatorMessageAdapter\[A, B]]

### Inherited by implicit conversion ArrowAssoc fromReplicatorMessageAdapter\[A, B] to ArrowAssoc\[ReplicatorMessageAdapter\[A, B]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/DistributedData$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/DistributedData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator$$Get.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator$$GetReplicaCount.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator$$Update.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/ReplicatorSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html)*