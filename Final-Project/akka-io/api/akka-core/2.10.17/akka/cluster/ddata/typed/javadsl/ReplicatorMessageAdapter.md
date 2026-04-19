---
description: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.ReplicatorMessageAdapter
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:24:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.ReplicatorMessageAdapter
---

# Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.ReplicatorMessageAdapter

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.ReplicatorMessageAdapter

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
- [Replicator](Replicator$.html)
- ReplicatorMessageAdapter
- [ReplicatorSettings](ReplicatorSettings$.html)
c[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html).[javadsl](index.html)

# ReplicatorMessageAdapter[**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html "Permalink")

### 

#### class ReplicatorMessageAdapter\[A, B \<: [ReplicatedData](../../ReplicatedData.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

When interacting with the `Replicator` from an actor this class provides convenient
methods that adapts the response messages to the requesting actor's message protocol.

One `ReplicatorMessageAdapter` instance can be used for a given `ReplicatedData` type,
e.g. an `OrSet<String>`. Interaction with several [Key](../../Key.html)s can be used via the same adapter
but they must all be of the same `ReplicatedData` type. For interaction with several different
`ReplicatedData` types, e.g. an `OrSet<String>` and a `GCounter`, an adapter can be created
for each type.

For the default replicator in the [DistributedData](DistributedData.html) extension a `ReplicatorMessageAdapter`
can be created with [DistributedData.withReplicatorMessageAdapter](DistributedData$.html#withReplicatorMessageAdapter[A,B<:akka.cluster.ddata.ReplicatedData](factory:java.util.function.Function[akka.cluster.ddata.typed.javadsl.ReplicatorMessageAdapter[A,B],akka.actor.typed.Behavior[A]]):akka.actor.typed.Behavior[A]).

\*Warning\*: `ReplicatorMessageAdapter` is not thread\-safe and must only be used from the actor
corresponding to the given `ActorContext`. It must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
callbacks. It must not be shared between several actor instances.

AMessage type of the requesting actor.

BType of the [ReplicatedData](../../ReplicatedData.html).

Source[ReplicatorMessageAdapter.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.scala#L52)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
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

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#<init>(context:akka.actor.typed.javadsl.ActorContext[A],replicator:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.javadsl.Replicator.Command],unexpectedAskTimeout:java.time.Duration):akka.cluster.ddata.typed.javadsl.ReplicatorMessageAdapter[A,B] "Permalink")  new ReplicatorMessageAdapter(context: [ActorContext](../../../../actor/typed/javadsl/ActorContext.html)\[A], replicator: [ActorRef](../../../../actor/typed/ActorRef.html)\[[Command](Replicator$$Command.html)], unexpectedAskTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration))contextThe ActorContext of the requesting actor. The `ReplicatorMessageAdapter` can
 only be used in this actor.

replicatorThe replicator to interact with, typically `DistributedData.get(system).replicator`.

unexpectedAskTimeoutThe timeout to use for `ask` operations. This should be longer than
 the `timeout` given in [Replicator.WriteConsistency](Replicator$$WriteConsistency.html) and
 [Replicator.ReadConsistency](Replicator$$ReadConsistency.html). The replicator will always send
 a reply within those timeouts so the `unexpectedAskTimeout` should
 not occur, but for cleanup in a failure situation it must still exist.
 If `askUpdate`, `askGet` or `askDelete` takes longer then this
 `unexpectedAskTimeout` a [java.util.concurrent.TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html)
 will be thrown by the requesting actor and may be handled by supervision.
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toany2stringadd\[ReplicatorMessageAdapter\[A, B]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReplicatorMessageAdapter\[A, B], B)ImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toArrowAssoc\[ReplicatorMessageAdapter\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#askDelete(createRequest:java.util.function.Function[akka.actor.typed.ActorRef[akka.cluster.ddata.typed.javadsl.Replicator.DeleteResponse[B]],akka.cluster.ddata.typed.javadsl.Replicator.Delete[B]],responseAdapter:java.util.function.Function[akka.cluster.ddata.typed.javadsl.Replicator.DeleteResponse[B],A]):Unit "Permalink")  def askDelete(createRequest: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorRef](../../../../actor/typed/ActorRef.html)\[[DeleteResponse](Replicator$$DeleteResponse.html)\[B]], [Delete](Replicator$$Delete.html)\[B]], responseAdapter: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[DeleteResponse](Replicator$$DeleteResponse.html)\[B], A]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a [Replicator.Delete](Replicator$$Delete.html) request to the replicator.

Send a [Replicator.Delete](Replicator$$Delete.html) request to the replicator. The [Replicator.DeleteResponse](Replicator$$DeleteResponse.html)
message is transformed to the message protocol of the requesting actor with the given
`responseAdapter` function.

Note that `createRequest` is a function that creates the `Delete` message from the provided
`ActorRef[DeleteResponse]` that the the replicator will send the response message back through.
Use that `ActorRef[DeleteResponse]` as the `replyTo` parameter in the `Delete` message.
8. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#askGet(createRequest:java.util.function.Function[akka.actor.typed.ActorRef[akka.cluster.ddata.typed.javadsl.Replicator.GetResponse[B]],akka.cluster.ddata.typed.javadsl.Replicator.Get[B]],responseAdapter:java.util.function.Function[akka.cluster.ddata.typed.javadsl.Replicator.GetResponse[B],A]):Unit "Permalink")  def askGet(createRequest: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorRef](../../../../actor/typed/ActorRef.html)\[[GetResponse](Replicator$$GetResponse.html)\[B]], [Get](Replicator$$Get.html)\[B]], responseAdapter: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[GetResponse](Replicator$$GetResponse.html)\[B], A]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a [Replicator.Get](Replicator$$Get.html) request to the replicator.

Send a [Replicator.Get](Replicator$$Get.html) request to the replicator. The [Replicator.GetResponse](Replicator$$GetResponse.html)
message is transformed to the message protocol of the requesting actor with the given
`responseAdapter` function.

Note that `createRequest` is a function that creates the `Get` message from the provided
`ActorRef[GetResponse]` that the the replicator will send the response message back through.
Use that `ActorRef[GetResponse]` as the `replyTo` parameter in the `Get` message.
9. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#askReplicaCount(createRequest:java.util.function.Function[akka.actor.typed.ActorRef[akka.cluster.ddata.typed.javadsl.Replicator.ReplicaCount],akka.cluster.ddata.typed.javadsl.Replicator.GetReplicaCount],responseAdapter:java.util.function.Function[akka.cluster.ddata.typed.javadsl.Replicator.ReplicaCount,A]):Unit "Permalink")  def askReplicaCount(createRequest: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorRef](../../../../actor/typed/ActorRef.html)\[[ReplicaCount](Replicator$$ReplicaCount.html)], [GetReplicaCount](Replicator$$GetReplicaCount.html)], responseAdapter: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ReplicaCount](Replicator$$ReplicaCount.html), A]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a [Replicator.GetReplicaCount](Replicator$$GetReplicaCount.html) request to the replicator.

Send a [Replicator.GetReplicaCount](Replicator$$GetReplicaCount.html) request to the replicator. The [Replicator.ReplicaCount](Replicator$$ReplicaCount.html)
message is transformed to the message protocol of the requesting actor with the given
`responseAdapter` function.

Note that `createRequest` is a function that creates the `GetReplicaCount` message from the provided
`ActorRef[ReplicaCount]` that the the replicator will send the response message back through.
Use that `ActorRef[ReplicaCount]` as the `replyTo` parameter in the `GetReplicaCount` message.
10. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#askUpdate(createRequest:java.util.function.Function[akka.actor.typed.ActorRef[akka.cluster.ddata.typed.javadsl.Replicator.UpdateResponse[B]],akka.cluster.ddata.typed.javadsl.Replicator.Update[B]],responseAdapter:java.util.function.Function[akka.cluster.ddata.typed.javadsl.Replicator.UpdateResponse[B],A]):Unit "Permalink")  def askUpdate(createRequest: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorRef](../../../../actor/typed/ActorRef.html)\[[UpdateResponse](Replicator$$UpdateResponse.html)\[B]], [Update](Replicator$$Update.html)\[B]], responseAdapter: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[UpdateResponse](Replicator$$UpdateResponse.html)\[B], A]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a [Replicator.Update](Replicator$$Update.html) request to the replicator.

Send a [Replicator.Update](Replicator$$Update.html) request to the replicator. The [Replicator.UpdateResponse](Replicator$$UpdateResponse.html)
message is transformed to the message protocol of the requesting actor with the given
`responseAdapter` function.

Note that `createRequest` is a function that creates the `Update` message from the provided
`ActorRef[UpdateResponse]` that the the replicator will send the response message back through.
Use that `ActorRef[UpdateResponse]` as the `replyTo` parameter in the `Update` message.
11. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReplicatorMessageAdapter\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatorMessageAdapter\[A, B]ImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toEnsuring\[ReplicatorMessageAdapter\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReplicatorMessageAdapter\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatorMessageAdapter\[A, B]ImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toEnsuring\[ReplicatorMessageAdapter\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatorMessageAdapter\[A, B]ImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toEnsuring\[ReplicatorMessageAdapter\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatorMessageAdapter\[A, B]ImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toEnsuring\[ReplicatorMessageAdapter\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#subscribe(key:akka.cluster.ddata.Key[B],responseAdapter:akka.japi.function.Function[akka.cluster.ddata.typed.javadsl.Replicator.SubscribeResponse[B],A]):Unit "Permalink")  def subscribe(key: [Key](../../Key.html)\[B], responseAdapter: [Function](../../../../japi/function/Function.html)\[[SubscribeResponse](Replicator$$SubscribeResponse.html)\[B], A]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Subscribe to changes of the given `key`.

Subscribe to changes of the given `key`. The [Replicator.Changed](Replicator$$Changed.html) and [Replicator.Deleted](Replicator$$Deleted.html) messages from
the replicator are transformed to the message protocol of the requesting actor with
the given `responseAdapter` function.
25. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#unsubscribe(key:akka.cluster.ddata.Key[B]):Unit "Permalink")  def unsubscribe(key: [Key](../../Key.html)\[B]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Unsubscribe from a previous subscription of a given `key`.

Unsubscribe from a previous subscription of a given `key`.

See also[ReplicatorMessageAdapter.subscribe](#subscribe(key:akka.cluster.ddata.Key[B],responseAdapter:akka.japi.function.Function[akka.cluster.ddata.typed.javadsl.Replicator.SubscribeResponse[B],A]):Unit)
28. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toStringFormat\[ReplicatorMessageAdapter\[A, B]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReplicatorMessageAdapter\[A, B], B)ImplicitThis member is added by an implicit conversion from ReplicatorMessageAdapter\[A, B] toArrowAssoc\[ReplicatorMessageAdapter\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReplicatorMessageAdapter\[A, B] to any2stringadd\[ReplicatorMessageAdapter\[A, B]]

### Inherited by implicit conversion StringFormat fromReplicatorMessageAdapter\[A, B] to StringFormat\[ReplicatorMessageAdapter\[A, B]]

### Inherited by implicit conversion Ensuring fromReplicatorMessageAdapter\[A, B] to Ensuring\[ReplicatorMessageAdapter\[A, B]]

### Inherited by implicit conversion ArrowAssoc fromReplicatorMessageAdapter\[A, B] to ArrowAssoc\[ReplicatorMessageAdapter\[A, B]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/DistributedData$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/DistributedData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$Changed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$Delete.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$DeleteResponse.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$Deleted.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$Get.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$GetReplicaCount.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$GetResponse.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$ReadConsistency.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$ReplicaCount.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$SubscribeResponse.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$Update.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$UpdateResponse.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$$WriteConsistency.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/ReplicatorSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html)*