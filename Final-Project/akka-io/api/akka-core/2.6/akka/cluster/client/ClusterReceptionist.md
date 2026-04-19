---
description: Akka 2.6.21 - akka.cluster.client.ClusterReceptionist
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/client/ClusterReceptionist.html
title: Akka 2.6.21 - akka.cluster.client.ClusterReceptionist
---

# Akka 2.6.21 - akka.cluster.client.ClusterReceptionist

> **Summary:** Akka 2.6.21 - akka.cluster.client.ClusterReceptionist

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/client/index.html "Permalink")  package [client](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/client/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[client](index.html)
- [ClusterClient](ClusterClient.html "This actor is intended to be used on an external node that is not member of the cluster.")
- [ClusterClientInteraction](ClusterClientInteraction.html "Declares a super type for all events emitted by the ClusterReceptionist.")
- [ClusterClientMessage](ClusterClientMessage.html "Marker trait for remote messages with special serializer.")
- [ClusterClientReceptionist](ClusterClientReceptionist.html "Extension that starts ClusterReceptionist and accompanying akka.cluster.pubsub.DistributedPubSubMediator with settings defined in config section akka.cluster.client.receptionist.")
- [ClusterClientSettings](ClusterClientSettings.html)
- [ClusterClientUnreachable](ClusterClientUnreachable.html "Emitted to the Akka event stream when a cluster client was previously connected but then not seen for some time.")
- [ClusterClientUp](ClusterClientUp.html "Emitted to the Akka event stream when a cluster client has interacted with a receptionist.")
- [ClusterClients](ClusterClients.html "The reply to GetClusterClients.")
- ClusterReceptionist
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
[c](ClusterReceptionist$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[client](index.html)

# [ClusterReceptionist](ClusterReceptionist$.html "See companion object")[**](../../../akka/cluster/client/ClusterReceptionist.html "Permalink")

### Companion [object ClusterReceptionist](ClusterReceptionist$.html "See companion object")

#### final  class ClusterReceptionist extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html)

[ClusterClient](ClusterClient.html) connects to this actor to retrieve. The `ClusterReceptionist` is
supposed to be started on all nodes, or all nodes with specified role, in the cluster.
The receptionist can be started with the [ClusterClientReceptionist](ClusterClientReceptionist.html) or as an
ordinary actor (use the factory method [ClusterReceptionist\#props](ClusterReceptionist$.html#props(pubSubMediator:akka.actor.ActorRef,settings:akka.cluster.client.ClusterReceptionistSettings):akka.actor.Props)).

The receptionist forwards messages from the client to the associated [akka.cluster.pubsub.DistributedPubSubMediator](../pubsub/DistributedPubSubMediator.html),
i.e. the client can send messages to any actor in the cluster that is registered in the
`DistributedPubSubMediator`. Messages from the client are wrapped in
[akka.cluster.pubsub.DistributedPubSubMediator.Send](../pubsub/DistributedPubSubMediator$$Send.html), [akka.cluster.pubsub.DistributedPubSubMediator.SendToAll](../pubsub/DistributedPubSubMediator$$SendToAll.html)
or [akka.cluster.pubsub.DistributedPubSubMediator.Publish](../pubsub/DistributedPubSubMediator$$Publish.html) with the semantics described in
[akka.cluster.pubsub.DistributedPubSubMediator](../pubsub/DistributedPubSubMediator.html).

Response messages from the destination actor are tunneled via the receptionist
to avoid inbound connections from other cluster nodes to the client, i.e.
the `sender()`, as seen by the destination actor, is not the client itself.
The `sender()` of the response messages, as seen by the client, is `deadLetters`
since the client should normally send subsequent messages via the `ClusterClient`.
It is possible to pass the original sender inside the reply messages if
the client is supposed to communicate directly to the actor in the cluster.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc

Source[ClusterClient.scala](https://github.com/akka/akka/tree/v2.6.21//akka-cluster-tools/src/main/scala/akka/cluster/client/ClusterClient.scala#L948)Linear Supertypes[ActorLogging](../../actor/ActorLogging.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterReceptionist
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

1. [**](../../../akka/cluster/client/ClusterReceptionist.html#<init>(pubSubMediator:akka.actor.ActorRef,settings:akka.cluster.client.ClusterReceptionistSettings):akka.cluster.client.ClusterReceptionist "Permalink")  new ClusterReceptionist(pubSubMediator: [ActorRef](../../actor/ActorRef.html), settings: [ClusterReceptionistSettings](ClusterReceptionistSettings.html))
### Type Members

1. [**](../../../akka/cluster/client/ClusterReceptionist.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
### Value Members

1. [**](../../../akka/cluster/client/ClusterReceptionist.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/client/ClusterReceptionist.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/client/ClusterReceptionist.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterReceptionist toany2stringadd\[ClusterReceptionist] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/client/ClusterReceptionist.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterReceptionist, B)ImplicitThis member is added by an implicit conversion from ClusterReceptionist toArrowAssoc\[ClusterReceptionist] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/client/ClusterReceptionist.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/client/ClusterReceptionist.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
7. [**](../../../akka/cluster/client/ClusterReceptionist.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
8. [**](../../../akka/cluster/client/ClusterReceptionist.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
9. [**](../../../akka/cluster/client/ClusterReceptionist.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/cluster/client/ClusterReceptionist.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/cluster/client/ClusterReceptionist.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../akka/cluster/client/ClusterReceptionist.html#checkDeadlinesTask:akka.actor.Cancellable "Permalink")  val checkDeadlinesTask: [Cancellable](../../actor/Cancellable.html)
13. [**](../../../akka/cluster/client/ClusterReceptionist.html#clientInteractions:scala.collection.immutable.HashMap[akka.actor.ActorRef,akka.remote.DeadlineFailureDetector] "Permalink")  var clientInteractions: [HashMap](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/HashMap.html#scala.collection.immutable.HashMap)\[[ActorRef](../../actor/ActorRef.html), [DeadlineFailureDetector](../../remote/DeadlineFailureDetector.html)]
14. [**](../../../akka/cluster/client/ClusterReceptionist.html#clientsPublished:scala.collection.immutable.HashSet[akka.actor.ActorRef] "Permalink")  var clientsPublished: [HashSet](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/HashSet.html#scala.collection.immutable.HashSet)\[[ActorRef](../../actor/ActorRef.html)]
15. [**](../../../akka/cluster/client/ClusterReceptionist.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
16. [**](../../../akka/cluster/client/ClusterReceptionist.html#cluster:akka.cluster.Cluster "Permalink")  val cluster: [Cluster](../Cluster.html)
17. [**](../../../akka/cluster/client/ClusterReceptionist.html#consistentHash:akka.routing.ConsistentHash[akka.actor.Address] "Permalink")  var consistentHash: [ConsistentHash](../../routing/ConsistentHash.html)\[[Address](../../actor/Address.html)]
18. [**](../../../akka/cluster/client/ClusterReceptionist.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
19. [**](../../../akka/cluster/client/ClusterReceptionist.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterReceptionist) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ClusterReceptionistImplicitThis member is added by an implicit conversion from ClusterReceptionist toEnsuring\[ClusterReceptionist] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../akka/cluster/client/ClusterReceptionist.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterReceptionist) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ClusterReceptionistImplicitThis member is added by an implicit conversion from ClusterReceptionist toEnsuring\[ClusterReceptionist] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../akka/cluster/client/ClusterReceptionist.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ClusterReceptionistImplicitThis member is added by an implicit conversion from ClusterReceptionist toEnsuring\[ClusterReceptionist] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../akka/cluster/client/ClusterReceptionist.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ClusterReceptionistImplicitThis member is added by an implicit conversion from ClusterReceptionist toEnsuring\[ClusterReceptionist] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../../akka/cluster/client/ClusterReceptionist.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../akka/cluster/client/ClusterReceptionist.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
25. [**](../../../akka/cluster/client/ClusterReceptionist.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
26. [**](../../../akka/cluster/client/ClusterReceptionist.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
27. [**](../../../akka/cluster/client/ClusterReceptionist.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../../akka/cluster/client/ClusterReceptionist.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../event/LoggingAdapter.html)Definition Classes[ActorLogging](../../actor/ActorLogging.html)
29. [**](../../../akka/cluster/client/ClusterReceptionist.html#matchingRole(m:akka.cluster.Member):Boolean "Permalink")  def matchingRole(m: [Member](../Member.html)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
30. [**](../../../akka/cluster/client/ClusterReceptionist.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
31. [**](../../../akka/cluster/client/ClusterReceptionist.html#nodes:scala.collection.immutable.SortedSet[akka.actor.Address] "Permalink")  var nodes: [SortedSet](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Address](../../actor/Address.html)]
32. [**](../../../akka/cluster/client/ClusterReceptionist.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
33. [**](../../../akka/cluster/client/ClusterReceptionist.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
34. [**](../../../akka/cluster/client/ClusterReceptionist.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
35. [**](../../../akka/cluster/client/ClusterReceptionist.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition ClassesClusterReceptionist → [Actor](../../actor/Actor.html)
36. [**](../../../akka/cluster/client/ClusterReceptionist.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
37. [**](../../../akka/cluster/client/ClusterReceptionist.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition ClassesClusterReceptionist → [Actor](../../actor/Actor.html)
38. [**](../../../akka/cluster/client/ClusterReceptionist.html#publishClientsUnreachable():Unit "Permalink")  def publishClientsUnreachable(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
39. [**](../../../akka/cluster/client/ClusterReceptionist.html#receive:PartialFunction[Any,Unit] "Permalink")  def receive: [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesClusterReceptionist → [Actor](../../actor/Actor.html)
40. [**](../../../akka/cluster/client/ClusterReceptionist.html#responseTunnel(client:akka.actor.ActorRef):akka.actor.ActorRef "Permalink")  def responseTunnel(client: [ActorRef](../../actor/ActorRef.html)): [ActorRef](../../actor/ActorRef.html)
41. [**](../../../akka/cluster/client/ClusterReceptionist.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
42. [**](../../../akka/cluster/client/ClusterReceptionist.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
43. [**](../../../akka/cluster/client/ClusterReceptionist.html#subscribers:scala.collection.immutable.Vector[akka.actor.ActorRef] "Permalink")  var subscribers: [Vector](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Vector.html#scala.collection.immutable.Vector)\[[ActorRef](../../actor/ActorRef.html)]
44. [**](../../../akka/cluster/client/ClusterReceptionist.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
45. [**](../../../akka/cluster/client/ClusterReceptionist.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
46. [**](../../../akka/cluster/client/ClusterReceptionist.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
47. [**](../../../akka/cluster/client/ClusterReceptionist.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
48. [**](../../../akka/cluster/client/ClusterReceptionist.html#updateClientInteractions(client:akka.actor.ActorRef):Unit "Permalink")  def updateClientInteractions(client: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
49. [**](../../../akka/cluster/client/ClusterReceptionist.html#verboseHeartbeat:Boolean "Permalink")  val verboseHeartbeat: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
50. [**](../../../akka/cluster/client/ClusterReceptionist.html#virtualNodesFactor:Int "Permalink")  val virtualNodesFactor: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)
51. [**](../../../akka/cluster/client/ClusterReceptionist.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
52. [**](../../../akka/cluster/client/ClusterReceptionist.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
53. [**](../../../akka/cluster/client/ClusterReceptionist.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/client/ClusterReceptionist.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/cluster/client/ClusterReceptionist.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterReceptionist toStringFormat\[ClusterReceptionist] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/client/ClusterReceptionist.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterReceptionist, B)ImplicitThis member is added by an implicit conversion from ClusterReceptionist toArrowAssoc\[ClusterReceptionist] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ActorLogging](../../actor/ActorLogging.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterReceptionist to any2stringadd\[ClusterReceptionist]

### Inherited by implicit conversion StringFormat fromClusterReceptionist to StringFormat\[ClusterReceptionist]

### Inherited by implicit conversion Ensuring fromClusterReceptionist to Ensuring\[ClusterReceptionist]

### Inherited by implicit conversion ArrowAssoc fromClusterReceptionist to ArrowAssoc\[ClusterReceptionist]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/Member.html
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
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html)*