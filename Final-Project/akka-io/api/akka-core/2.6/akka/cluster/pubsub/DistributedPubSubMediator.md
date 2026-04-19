---
description: Akka 2.6.21 - akka.cluster.pubsub.DistributedPubSubMediator
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.html
title: Akka 2.6.21 - akka.cluster.pubsub.DistributedPubSubMediator
---

# Akka 2.6.21 - akka.cluster.pubsub.DistributedPubSubMediator

> **Summary:** Akka 2.6.21 - akka.cluster.pubsub.DistributedPubSubMediator

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[pubsub](index.html)
- [DistributedPubSub](DistributedPubSub.html "Extension that starts a DistributedPubSubMediator actor with settings defined in config section akka.cluster.pub-sub.")
- DistributedPubSubMediator
- [DistributedPubSubMessage](DistributedPubSubMessage.html "Marker trait for remote messages with special serializer.")
- [DistributedPubSubSettings](DistributedPubSubSettings.html)
[c](DistributedPubSubMediator$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[pubsub](index.html)

# [DistributedPubSubMediator](DistributedPubSubMediator$.html "See companion object")[**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html "Permalink")

### Companion [object DistributedPubSubMediator](DistributedPubSubMediator$.html "See companion object")

#### class DistributedPubSubMediator extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html) with PerGroupingBuffer

This actor manages a registry of actor references and replicates
the entries to peer actors among all cluster nodes or a group of nodes
tagged with a specific role.

The `DistributedPubSubMediator` actor is supposed to be started on all nodes,
or all nodes with specified role, in the cluster. The mediator can be
started with the [DistributedPubSub](DistributedPubSub.html) extension or as an ordinary actor.

Changes are only performed in the own part of the registry and those changes
are versioned. Deltas are disseminated in a scalable way to other nodes with
a gossip protocol. The registry is eventually consistent, i.e. changes are not
immediately visible at other nodes, but typically they will be fully replicated
to all other nodes after a few seconds.

You can send messages via the mediator on any node to registered actors on
any other node. There is three modes of message delivery.

1\. [DistributedPubSubMediator.Send](DistributedPubSubMediator$$Send.html) \-
The message will be delivered to one recipient with a matching path, if any such
exists in the registry. If several entries match the path the message will be sent
via the supplied `routingLogic` (default random) to one destination. The sender of the
message can specify that local affinity is preferred, i.e. the message is sent to an actor
in the same local actor system as the used mediator actor, if any such exists, otherwise
route to any other matching entry. A typical usage of this mode is private chat to one
other user in an instant messaging application. It can also be used for distributing
tasks to registered workers, like a cluster aware router where the routees dynamically
can register themselves.

2\. [DistributedPubSubMediator.SendToAll](DistributedPubSubMediator$$SendToAll.html) \-
The message will be delivered to all recipients with a matching path. Actors with
the same path, without address information, can be registered on different nodes.
On each node there can only be one such actor, since the path is unique within one
local actor system. Typical usage of this mode is to broadcast messages to all replicas
with the same path, e.g. 3 actors on different nodes that all perform the same actions,
for redundancy.

3\. [DistributedPubSubMediator.Publish](DistributedPubSubMediator$$Publish.html) \-
Actors may be registered to a named topic instead of path. This enables many subscribers
on each node. The message will be delivered to all subscribers of the topic. For
efficiency the message is sent over the wire only once per node (that has a matching topic),
and then delivered to all subscribers of the local topic representation. This is the
true pub/sub mode. A typical usage of this mode is a chat room in an instant messaging
application.

4\. [DistributedPubSubMediator.Publish](DistributedPubSubMediator$$Publish.html) with sendOneMessageToEachGroup \-
Actors may be subscribed to a named topic with an optional property `group`.
If subscribing with a group name, each message published to a topic with the
`sendOneMessageToEachGroup` flag is delivered via the supplied `routingLogic`
(default random) to one actor within each subscribing group.
If all the subscribed actors have the same group name, then this works just like
[DistributedPubSubMediator.Send](DistributedPubSubMediator$$Send.html) and all messages are delivered to one subscribe.
If all the subscribed actors have different group names, then this works like normal
[DistributedPubSubMediator.Publish](DistributedPubSubMediator$$Publish.html) and all messages are broadcast to all subscribers.

You register actors to the local mediator with [DistributedPubSubMediator.Put](DistributedPubSubMediator$$Put.html) or
[DistributedPubSubMediator.Subscribe](DistributedPubSubMediator$$Subscribe.html). `Put` is used together with `Send` and
`SendToAll` message delivery modes. The `ActorRef` in `Put` must belong to the same
local actor system as the mediator. `Subscribe` is used together with `Publish`.
Actors are automatically removed from the registry when they are terminated, or you
can explicitly remove entries with [DistributedPubSubMediator.Remove](DistributedPubSubMediator$$Remove.html) or
[DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator$$Unsubscribe.html).

Successful `Subscribe` and `Unsubscribe` is acknowledged with
[DistributedPubSubMediator.SubscribeAck](DistributedPubSubMediator$$SubscribeAck.html) and [DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator$$UnsubscribeAck.html)
replies.

Not intended for subclassing by user code.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[DistributedPubSubMediator.scala](https://github.com/akka/akka/tree/v2.6.21//akka-cluster-tools/src/main/scala/akka/cluster/pubsub/DistributedPubSubMediator.scala#L558)Linear SupertypesPerGroupingBuffer, [ActorLogging](../../actor/ActorLogging.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DistributedPubSubMediator
2. PerGroupingBuffer
3. ActorLogging
4. Actor
5. AnyRef
6. Any
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

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#<init>(settings:akka.cluster.pubsub.DistributedPubSubSettings):akka.cluster.pubsub.DistributedPubSubMediator "Permalink")  new DistributedPubSubMediator(settings: [DistributedPubSubSettings](DistributedPubSubSettings.html))
### Type Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
### Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DistributedPubSubMediator toany2stringadd\[DistributedPubSubMediator] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DistributedPubSubMediator, B)ImplicitThis member is added by an implicit conversion from DistributedPubSubMediator toArrowAssoc\[DistributedPubSubMediator] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
7. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
8. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
9. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#bufferOr(grouping:String,message:Any,originalSender:akka.actor.ActorRef)(action:=>Unit):Unit "Permalink")  def bufferOr(grouping: String, message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), originalSender: [ActorRef](../../actor/ActorRef.html))(action: \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesPerGroupingBuffer
13. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
14. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#cluster:akka.cluster.Cluster "Permalink")  val cluster: [Cluster](../Cluster.html)
15. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#collectDelta(otherVersions:Map[akka.actor.Address,Long]):scala.collection.immutable.Iterable[akka.cluster.pubsub.DistributedPubSubMediator.Internal.Bucket] "Permalink")  def collectDelta(otherVersions: Map\[[Address](../../actor/Address.html), [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)]): [Iterable](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[Bucket]
16. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
17. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#deltaCount:Long "Permalink")  var deltaCount: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)
18. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DistributedPubSubMediator) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): DistributedPubSubMediatorImplicitThis member is added by an implicit conversion from DistributedPubSubMediator toEnsuring\[DistributedPubSubMediator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DistributedPubSubMediator) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): DistributedPubSubMediatorImplicitThis member is added by an implicit conversion from DistributedPubSubMediator toEnsuring\[DistributedPubSubMediator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): DistributedPubSubMediatorImplicitThis member is added by an implicit conversion from DistributedPubSubMediator toEnsuring\[DistributedPubSubMediator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): DistributedPubSubMediatorImplicitThis member is added by an implicit conversion from DistributedPubSubMediator toEnsuring\[DistributedPubSubMediator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
24. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#forwardMessages(grouping:String,recipient:akka.actor.ActorRef):Unit "Permalink")  def forwardMessages(grouping: String, recipient: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesPerGroupingBuffer
25. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
26. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#getCurrentTopics():scala.collection.immutable.Set[String] "Permalink")  def getCurrentTopics(): [Set](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[String]
27. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#gossip():Unit "Permalink")  def gossip(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Gossip to peer nodes.
28. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#gossipTask:akka.actor.Cancellable "Permalink")  val gossipTask: [Cancellable](../../actor/Cancellable.html)
29. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#gossipTo(address:akka.actor.Address):Unit "Permalink")  def gossipTo(address: [Address](../../actor/Address.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
30. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
31. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#initializeGrouping(grouping:String):Unit "Permalink")  def initializeGrouping(grouping: String): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesPerGroupingBuffer
32. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
33. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../event/LoggingAdapter.html)Definition Classes[ActorLogging](../../actor/ActorLogging.html)
34. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#matchingRole(m:akka.cluster.Member):Boolean "Permalink")  def matchingRole(m: [Member](../Member.html)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
35. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#mkKey(path:akka.actor.ActorPath):String "Permalink")  def mkKey(path: [ActorPath](../../actor/ActorPath.html)): String
36. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#mkKey(ref:akka.actor.ActorRef):String "Permalink")  def mkKey(ref: [ActorRef](../../actor/ActorRef.html)): String
37. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#myVersions:Map[akka.actor.Address,Long] "Permalink")  def myVersions: Map\[[Address](../../actor/Address.html), [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)]
38. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
39. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#newTopicActor(encTopic:String):akka.actor.ActorRef "Permalink")  def newTopicActor(encTopic: String): [ActorRef](../../actor/ActorRef.html)
40. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#nextVersion:()=>Long "Permalink")  val nextVersion: () \=\> [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)
41. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#nodes:scala.collection.immutable.Set[akka.actor.Address] "Permalink")  var nodes: [Set](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[[Address](../../actor/Address.html)]
42. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
43. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
44. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#otherHasNewerVersions(otherVersions:Map[akka.actor.Address,Long]):Boolean "Permalink")  def otherHasNewerVersions(otherVersions: Map\[[Address](../../actor/Address.html), [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)]): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
45. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
46. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition ClassesDistributedPubSubMediator → [Actor](../../actor/Actor.html)
47. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
48. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition ClassesDistributedPubSubMediator → [Actor](../../actor/Actor.html)
49. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#prune():Unit "Permalink")  def prune(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
50. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#pruneInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val pruneInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
51. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#pruneTask:akka.actor.Cancellable "Permalink")  val pruneTask: [Cancellable](../../actor/Cancellable.html)
52. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#publish(path:String,msg:Any,allButSelf:Boolean):Unit "Permalink")  def publish(path: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), allButSelf: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean) \= false): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
53. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#publishToEachGroup(path:String,msg:Any):Unit "Permalink")  def publishToEachGroup(path: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
54. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#put(key:String,valueOption:Option[akka.actor.ActorRef]):Unit "Permalink")  def put(key: String, valueOption: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[ActorRef](../../actor/ActorRef.html)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
55. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#receive:PartialFunction[Any,Unit] "Permalink")  def receive: [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesDistributedPubSubMediator → [Actor](../../actor/Actor.html)
56. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#recreateAndForwardMessagesIfNeeded(grouping:String,recipient:=>akka.actor.ActorRef):Unit "Permalink")  def recreateAndForwardMessagesIfNeeded(grouping: String, recipient: \=\> [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesPerGroupingBuffer
57. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#registerTopic(ref:akka.actor.ActorRef):Unit "Permalink")  def registerTopic(ref: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
58. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#registry:Map[akka.actor.Address,akka.cluster.pubsub.DistributedPubSubMediator.Internal.Bucket] "Permalink")  var registry: Map\[[Address](../../actor/Address.html), Bucket]
59. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#removedTimeToLiveMillis:Long "Permalink")  val removedTimeToLiveMillis: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)
60. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#selectRandomNode(addresses:IndexedSeq[akka.actor.Address]):Option[akka.actor.Address] "Permalink")  def selectRandomNode(addresses: [IndexedSeq](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Address](../../actor/Address.html)]): [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Address](../../actor/Address.html)]
61. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
62. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
63. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
64. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
65. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
66. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
67. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
68. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
69. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DistributedPubSubMediator toStringFormat\[DistributedPubSubMediator] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DistributedPubSubMediator, B)ImplicitThis member is added by an implicit conversion from DistributedPubSubMediator toArrowAssoc\[DistributedPubSubMediator] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from PerGroupingBuffer

### Inherited from [ActorLogging](../../actor/ActorLogging.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDistributedPubSubMediator to any2stringadd\[DistributedPubSubMediator]

### Inherited by implicit conversion StringFormat fromDistributedPubSubMediator to StringFormat\[DistributedPubSubMediator]

### Inherited by implicit conversion Ensuring fromDistributedPubSubMediator to Ensuring\[DistributedPubSubMediator]

### Inherited by implicit conversion ArrowAssoc fromDistributedPubSubMediator to ArrowAssoc\[DistributedPubSubMediator]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator$$Publish.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator$$Put.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator$$Remove.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator$$Send.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator$$SubscribeAck.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator$$UnsubscribeAck.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubSettings$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.html)*