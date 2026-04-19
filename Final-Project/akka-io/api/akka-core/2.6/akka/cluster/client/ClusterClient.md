---
description: Akka 2.6.21 - akka.cluster.client.ClusterClient
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/client/ClusterClient.html
title: Akka 2.6.21 - akka.cluster.client.ClusterClient
---

# Akka 2.6.21 - akka.cluster.client.ClusterClient

> **Summary:** Akka 2.6.21 - akka.cluster.client.ClusterClient

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/client/index.html "Permalink")  package [client](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/client/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[client](index.html)
- ClusterClient
- [ClusterClientInteraction](ClusterClientInteraction.html "Declares a super type for all events emitted by the ClusterReceptionist.")
- [ClusterClientMessage](ClusterClientMessage.html "Marker trait for remote messages with special serializer.")
- [ClusterClientReceptionist](ClusterClientReceptionist.html "Extension that starts ClusterReceptionist and accompanying akka.cluster.pubsub.DistributedPubSubMediator with settings defined in config section akka.cluster.client.receptionist.")
- [ClusterClientSettings](ClusterClientSettings.html)
- [ClusterClientUnreachable](ClusterClientUnreachable.html "Emitted to the Akka event stream when a cluster client was previously connected but then not seen for some time.")
- [ClusterClientUp](ClusterClientUp.html "Emitted to the Akka event stream when a cluster client has interacted with a receptionist.")
- [ClusterClients](ClusterClients.html "The reply to GetClusterClients.")
- [ClusterReceptionist](ClusterReceptionist.html "ClusterClient connects to this actor to retrieve.")
- [ClusterReceptionistSettings](ClusterReceptionistSettings.html)
- [ContactPointAdded](ContactPointAdded.html "Emitted to a subscriber when contact points have been received by the ClusterClient and a new one has been added.")
- [ContactPointChange](ContactPointChange.html "Declares a super type for all events emitted by the ClusterClient in relation to contact points being added or removed.")
- [ContactPointRemoved](ContactPointRemoved.html "Emitted to a subscriber when contact points have been received by the ClusterClient and a new one has been added.")
- [ContactPoints](ContactPoints.html "The reply to GetContactPoints.")
- [GetClusterClients](GetClusterClients.html)
- [GetContactPoints](GetContactPoints.html)
- [SubscribeClusterClients](SubscribeClusterClients.html)
- [SubscribeContactPoints](SubscribeContactPoints.html)
- [UnsubscribeClusterClients](UnsubscribeClusterClients.html)
- [UnsubscribeContactPoints](UnsubscribeContactPoints.html)
[c](ClusterClient$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[client](index.html)

# [ClusterClient](ClusterClient$.html "See companion object")[**](../../../akka/cluster/client/ClusterClient.html "Permalink")

### Companion [object ClusterClient](ClusterClient$.html "See companion object")

#### final  class ClusterClient extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html)

This actor is intended to be used on an external node that is not member
of the cluster. It acts like a gateway for sending messages to actors
somewhere in the cluster. From the initial contact points it will establish
a connection to a [ClusterReceptionist](ClusterReceptionist.html) somewhere in the cluster. It will
monitor the connection to the receptionist and establish a new connection if
the link goes down. When looking for a new receptionist it uses fresh contact
points retrieved from previous establishment, or periodically refreshed
contacts, i.e. not necessarily the initial contact points.

You can send messages via the `ClusterClient` to any actor in the cluster
that is registered in the [ClusterReceptionist](ClusterReceptionist.html).
Messages are wrapped in [ClusterClient.Send](ClusterClient$$Send.html), [ClusterClient.SendToAll](ClusterClient$$SendToAll.html)
or [ClusterClient.Publish](ClusterClient$$Publish.html).

1\. [ClusterClient.Send](ClusterClient$$Send.html) \-
The message will be delivered to one recipient with a matching path, if any such
exists. If several entries match the path the message will be delivered
to one random destination. The sender of the message can specify that local
affinity is preferred, i.e. the message is sent to an actor in the same local actor
system as the used receptionist actor, if any such exists, otherwise random to any other
matching entry.

2\. [ClusterClient.SendToAll](ClusterClient$$SendToAll.html) \-
The message will be delivered to all recipients with a matching path.

3\. [ClusterClient.Publish](ClusterClient$$Publish.html) \-
The message will be delivered to all recipients Actors that have been registered as subscribers to
to the named topic.

 Use the factory method [ClusterClient\#props](ClusterClient$.html#props(settings:akka.cluster.client.ClusterClientSettings):akka.actor.Props)) to create the
[akka.actor.Props](../../actor/Props.html) for the actor.

If the receptionist is not currently available, the client will buffer the messages
and then deliver them when the connection to the receptionist has been established.
The size of the buffer is configurable and it can be disabled by using a buffer size
of 0\. When the buffer is full old messages will be dropped when new messages are sent
via the client.

Note that this is a best effort implementation: messages can always be lost due to the distributed
nature of the actors involved.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc

Source[ClusterClient.scala](https://github.com/akka/akka/tree/v2.6.21//akka-cluster-tools/src/main/scala/akka/cluster/client/ClusterClient.scala#L376)Linear Supertypes[ActorLogging](../../actor/ActorLogging.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterClient
2. ActorLogging
3. Actor
4. AnyRef
5. Any
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

1. [**](../../../akka/cluster/client/ClusterClient.html#<init>(settings:akka.cluster.client.ClusterClientSettings):akka.cluster.client.ClusterClient "Permalink")  new ClusterClient(settings: [ClusterClientSettings](ClusterClientSettings.html))
### Type Members

1. [**](../../../akka/cluster/client/ClusterClient.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
### Value Members

1. [**](../../../akka/cluster/client/ClusterClient.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/client/ClusterClient.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/client/ClusterClient.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterClient toany2stringadd\[ClusterClient] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/client/ClusterClient.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterClient, B)ImplicitThis member is added by an implicit conversion from ClusterClient toArrowAssoc\[ClusterClient] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/client/ClusterClient.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/client/ClusterClient.html#active(receptionist:akka.actor.ActorRef):akka.actor.Actor.Receive "Permalink")  def active(receptionist: [ActorRef](../../actor/ActorRef.html)): [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])
7. [**](../../../akka/cluster/client/ClusterClient.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
8. [**](../../../akka/cluster/client/ClusterClient.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
9. [**](../../../akka/cluster/client/ClusterClient.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/cluster/client/ClusterClient.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/cluster/client/ClusterClient.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
12. [**](../../../akka/cluster/client/ClusterClient.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../../akka/cluster/client/ClusterClient.html#buffer(msg:Any):Unit "Permalink")  def buffer(msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
14. [**](../../../akka/cluster/client/ClusterClient.html#buffer:akka.util.MessageBuffer "Permalink")  var buffer: [MessageBuffer](../../util/MessageBuffer.html)
15. [**](../../../akka/cluster/client/ClusterClient.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
16. [**](../../../akka/cluster/client/ClusterClient.html#contactPaths:scala.collection.immutable.HashSet[akka.actor.ActorPath] "Permalink")  var contactPaths: [HashSet](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/HashSet.html#scala.collection.immutable.HashSet)\[[ActorPath](../../actor/ActorPath.html)]
17. [**](../../../akka/cluster/client/ClusterClient.html#contactPathsPublished:scala.collection.immutable.HashSet[akka.actor.ActorPath] "Permalink")  var contactPathsPublished: [HashSet](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/HashSet.html#scala.collection.immutable.HashSet)\[[ActorPath](../../actor/ActorPath.html)]
18. [**](../../../akka/cluster/client/ClusterClient.html#contactPointMessages:akka.actor.Actor.Receive "Permalink")  def contactPointMessages: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])
19. [**](../../../akka/cluster/client/ClusterClient.html#contacts:scala.collection.immutable.HashSet[akka.actor.ActorSelection] "Permalink")  var contacts: [HashSet](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/HashSet.html#scala.collection.immutable.HashSet)\[[ActorSelection](../../actor/ActorSelection.html)]
20. [**](../../../akka/cluster/client/ClusterClient.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
21. [**](../../../akka/cluster/client/ClusterClient.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterClient) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ClusterClientImplicitThis member is added by an implicit conversion from ClusterClient toEnsuring\[ClusterClient] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../akka/cluster/client/ClusterClient.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterClient) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ClusterClientImplicitThis member is added by an implicit conversion from ClusterClient toEnsuring\[ClusterClient] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../../akka/cluster/client/ClusterClient.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ClusterClientImplicitThis member is added by an implicit conversion from ClusterClient toEnsuring\[ClusterClient] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
24. [**](../../../akka/cluster/client/ClusterClient.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ClusterClientImplicitThis member is added by an implicit conversion from ClusterClient toEnsuring\[ClusterClient] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
25. [**](../../../akka/cluster/client/ClusterClient.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../akka/cluster/client/ClusterClient.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
27. [**](../../../akka/cluster/client/ClusterClient.html#establishing:akka.actor.Actor.Receive "Permalink")  def establishing: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])
28. [**](../../../akka/cluster/client/ClusterClient.html#failureDetector:akka.remote.DeadlineFailureDetector "Permalink")  val failureDetector: [DeadlineFailureDetector](../../remote/DeadlineFailureDetector.html)
29. [**](../../../akka/cluster/client/ClusterClient.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
30. [**](../../../akka/cluster/client/ClusterClient.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
31. [**](../../../akka/cluster/client/ClusterClient.html#heartbeatTask:akka.actor.Cancellable "Permalink")  val heartbeatTask: [Cancellable](../../actor/Cancellable.html)
32. [**](../../../akka/cluster/client/ClusterClient.html#initialContactsSel:scala.collection.immutable.HashSet[akka.actor.ActorSelection] "Permalink")  val initialContactsSel: [HashSet](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/HashSet.html#scala.collection.immutable.HashSet)\[[ActorSelection](../../actor/ActorSelection.html)]
33. [**](../../../akka/cluster/client/ClusterClient.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
34. [**](../../../akka/cluster/client/ClusterClient.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../event/LoggingAdapter.html)Definition Classes[ActorLogging](../../actor/ActorLogging.html)
35. [**](../../../akka/cluster/client/ClusterClient.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
36. [**](../../../akka/cluster/client/ClusterClient.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
37. [**](../../../akka/cluster/client/ClusterClient.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
38. [**](../../../akka/cluster/client/ClusterClient.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
39. [**](../../../akka/cluster/client/ClusterClient.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition ClassesClusterClient → [Actor](../../actor/Actor.html)
40. [**](../../../akka/cluster/client/ClusterClient.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
41. [**](../../../akka/cluster/client/ClusterClient.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
42. [**](../../../akka/cluster/client/ClusterClient.html#publishContactPoints():Unit "Permalink")  def publishContactPoints(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
43. [**](../../../akka/cluster/client/ClusterClient.html#receive:PartialFunction[Any,Unit] "Permalink")  def receive: [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesClusterClient → [Actor](../../actor/Actor.html)
44. [**](../../../akka/cluster/client/ClusterClient.html#reestablish():Unit "Permalink")  def reestablish(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
45. [**](../../../akka/cluster/client/ClusterClient.html#refreshContactsTask:Option[akka.actor.Cancellable] "Permalink")  var refreshContactsTask: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Cancellable](../../actor/Cancellable.html)]
46. [**](../../../akka/cluster/client/ClusterClient.html#scheduleRefreshContactsTick(interval:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def scheduleRefreshContactsTick(interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
47. [**](../../../akka/cluster/client/ClusterClient.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
48. [**](../../../akka/cluster/client/ClusterClient.html#sendBuffered(receptionist:akka.actor.ActorRef):Unit "Permalink")  def sendBuffered(receptionist: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
49. [**](../../../akka/cluster/client/ClusterClient.html#sendGetContacts():Unit "Permalink")  def sendGetContacts(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
50. [**](../../../akka/cluster/client/ClusterClient.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
51. [**](../../../akka/cluster/client/ClusterClient.html#subscribers:scala.collection.immutable.Vector[akka.actor.ActorRef] "Permalink")  var subscribers: [Vector](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Vector.html#scala.collection.immutable.Vector)\[[ActorRef](../../actor/ActorRef.html)]
52. [**](../../../akka/cluster/client/ClusterClient.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
53. [**](../../../akka/cluster/client/ClusterClient.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
54. [**](../../../akka/cluster/client/ClusterClient.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
55. [**](../../../akka/cluster/client/ClusterClient.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
56. [**](../../../akka/cluster/client/ClusterClient.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
57. [**](../../../akka/cluster/client/ClusterClient.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
58. [**](../../../akka/cluster/client/ClusterClient.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/client/ClusterClient.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/cluster/client/ClusterClient.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterClient toStringFormat\[ClusterClient] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/client/ClusterClient.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterClient, B)ImplicitThis member is added by an implicit conversion from ClusterClient toArrowAssoc\[ClusterClient] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ActorLogging](../../actor/ActorLogging.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterClient to any2stringadd\[ClusterClient]

### Inherited by implicit conversion StringFormat fromClusterClient to StringFormat\[ClusterClient]

### Inherited by implicit conversion Ensuring fromClusterClient to Ensuring\[ClusterClient]

### Inherited by implicit conversion ArrowAssoc fromClusterClient to ArrowAssoc\[ClusterClient]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$$Publish.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$$Send.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$$SendToAll.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientInteraction.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientSettings$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientUnreachable.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientUp.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClients.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ContactPointAdded.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ContactPointChange.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ContactPointRemoved.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ContactPoints.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/GetClusterClients$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/GetClusterClients.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/GetContactPoints$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/GetContactPoints.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/SubscribeClusterClients$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/SubscribeClusterClients.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/SubscribeContactPoints$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/SubscribeContactPoints.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/UnsubscribeClusterClients$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/UnsubscribeClusterClients.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/UnsubscribeContactPoints$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/UnsubscribeContactPoints.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html)*