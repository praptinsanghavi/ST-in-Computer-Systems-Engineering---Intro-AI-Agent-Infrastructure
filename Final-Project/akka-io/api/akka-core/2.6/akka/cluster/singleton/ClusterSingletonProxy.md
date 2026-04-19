---
description: Akka 2.6.21 - akka.cluster.singleton.ClusterSingletonProxy
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:21:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/singleton/ClusterSingletonProxy.html
title: Akka 2.6.21 - akka.cluster.singleton.ClusterSingletonProxy
---

# Akka 2.6.21 - akka.cluster.singleton.ClusterSingletonProxy

> **Summary:** Akka 2.6.21 - akka.cluster.singleton.ClusterSingletonProxy

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](index.html)Definition Classes[cluster](../index.html)
- [ClusterSingletonManager](ClusterSingletonManager.html "Manages singleton actor instance among all cluster nodes or a group of nodes tagged with a specific role.")
- [ClusterSingletonManagerIsStuck](ClusterSingletonManagerIsStuck.html "Thrown when a consistent state can't be determined within the defined retry limits.")
- [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)
- [ClusterSingletonMessage](ClusterSingletonMessage.html "Marker trait for remote messages with special serializer.")
- ClusterSingletonProxy
- [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html)
[c](ClusterSingletonProxy$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[singleton](index.html)

# [ClusterSingletonProxy](ClusterSingletonProxy$.html "See companion object")[**](../../../akka/cluster/singleton/ClusterSingletonProxy.html "Permalink")

### Companion [object ClusterSingletonProxy](ClusterSingletonProxy$.html "See companion object")

#### final  class ClusterSingletonProxy extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html)

The `ClusterSingletonProxy` works together with the [akka.cluster.singleton.ClusterSingletonManager](ClusterSingletonManager.html) to provide a
distributed proxy to the singleton actor.

The proxy can be started on every node where the singleton needs to be reached and used as if it were the singleton
itself. It will then act as a router to the currently running singleton instance. If the singleton is not currently
available, e.g., during hand off or startup, the proxy will buffer the messages sent to the singleton and then deliver
them when the singleton is finally available. The size of the buffer is configurable and it can be disabled by using
a buffer size of 0\. When the buffer is full old messages will be dropped when new messages are sent via the proxy.

The proxy works by keeping track of the oldest cluster member. When a new oldest member is identified, e.g. because
the older one left the cluster, or at startup, the proxy will try to identify the singleton on the oldest member by
periodically sending an [akka.actor.Identify](../../actor/Identify.html) message until the singleton responds with its
[akka.actor.ActorIdentity](../../actor/ActorIdentity.html).

Note that this is a best effort implementation: messages can always be lost due to the distributed nature of the
actors involved.

Source[ClusterSingletonProxy.scala](https://github.com/akka/akka/tree/v2.6.21//akka-cluster-tools/src/main/scala/akka/cluster/singleton/ClusterSingletonProxy.scala#L161)Linear Supertypes[ActorLogging](../../actor/ActorLogging.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSingletonProxy
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

1. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#<init>(singletonManagerPath:String,settings:akka.cluster.singleton.ClusterSingletonProxySettings):akka.cluster.singleton.ClusterSingletonProxy "Permalink")  new ClusterSingletonProxy(singletonManagerPath: String, settings: [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html))
### Type Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
### Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterSingletonProxy toany2stringadd\[ClusterSingletonProxy] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterSingletonProxy, B)ImplicitThis member is added by an implicit conversion from ClusterSingletonProxy toArrowAssoc\[ClusterSingletonProxy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#add(m:akka.cluster.Member):Unit "Permalink")  def add(m: [Member](../Member.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Adds new member if it has the right role.

Adds new member if it has the right role.

mNew cluster member.
7. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#ageOrdering:Ordering[akka.cluster.Member] "Permalink")  val ageOrdering: Ordering\[[Member](../Member.html)]
8. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
9. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
12. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
13. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
14. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#buffer(msg:Any):Unit "Permalink")  def buffer(msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
15. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#buffer:akka.util.MessageBuffer "Permalink")  var buffer: [MessageBuffer](../../util/MessageBuffer.html)
16. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#cancelTimer():Unit "Permalink")  def cancelTimer(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
17. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
18. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#cluster:akka.cluster.Cluster "Permalink")  val cluster: [Cluster](../Cluster.html)
19. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
20. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#createIdentifyId(i:Int):String "Permalink")  def createIdentifyId(i: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
21. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterSingletonProxy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ClusterSingletonProxyImplicitThis member is added by an implicit conversion from ClusterSingletonProxy toEnsuring\[ClusterSingletonProxy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterSingletonProxy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ClusterSingletonProxyImplicitThis member is added by an implicit conversion from ClusterSingletonProxy toEnsuring\[ClusterSingletonProxy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ClusterSingletonProxyImplicitThis member is added by an implicit conversion from ClusterSingletonProxy toEnsuring\[ClusterSingletonProxy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
24. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ClusterSingletonProxyImplicitThis member is added by an implicit conversion from ClusterSingletonProxy toEnsuring\[ClusterSingletonProxy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
25. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
27. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
28. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#handleInitial(state:akka.cluster.ClusterEvent.CurrentClusterState):Unit "Permalink")  def handleInitial(state: [CurrentClusterState](../ClusterEvent$$CurrentClusterState.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
29. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
30. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#identifyCounter:Int "Permalink")  var identifyCounter: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)
31. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#identifyId:String "Permalink")  var identifyId: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
32. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#identifySingleton():Unit "Permalink")  def identifySingleton(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Discard old singleton ActorRef and send a periodic message to self to identify the singleton.
33. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#identifyTimer:Option[akka.actor.Cancellable] "Permalink")  var identifyTimer: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Cancellable](../../actor/Cancellable.html)]
34. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
35. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../event/LoggingAdapter.html)Definition Classes[ActorLogging](../../actor/ActorLogging.html)
36. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#matchingRole(member:akka.cluster.Member):Boolean "Permalink")  def matchingRole(member: [Member](../Member.html)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
37. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#membersByAge:scala.collection.immutable.SortedSet[akka.cluster.Member] "Permalink")  var membersByAge: [SortedSet](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](../Member.html)]
38. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
39. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
40. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
41. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
42. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition ClassesClusterSingletonProxy → [Actor](../../actor/Actor.html)
43. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
44. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition ClassesClusterSingletonProxy → [Actor](../../actor/Actor.html)
45. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#receive:PartialFunction[Any,Unit] "Permalink")  def receive: [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesClusterSingletonProxy → [Actor](../../actor/Actor.html)
46. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#remove(m:akka.cluster.Member):Unit "Permalink")  def remove(m: [Member](../Member.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Removes a member.

Removes a member.

mCluster member to remove.
47. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
48. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#sendBuffered():Unit "Permalink")  def sendBuffered(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
49. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
50. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#singleton:Option[akka.actor.ActorRef] "Permalink")  var singleton: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[ActorRef](../../actor/ActorRef.html)]
51. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#singletonPath:Array[String] "Permalink")  val singletonPath: [Array](https://www.scala-lang.org/api/2.13.8/scala/Array.html#scala.Array)\[[String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)]
52. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
53. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
54. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
55. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#trackChange(block:()=>Unit):Unit "Permalink")  def trackChange(block: () \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
56. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
57. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
58. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
59. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterSingletonProxy toStringFormat\[ClusterSingletonProxy] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterSingletonProxy, B)ImplicitThis member is added by an implicit conversion from ClusterSingletonProxy toArrowAssoc\[ClusterSingletonProxy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ActorLogging](../../actor/ActorLogging.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterSingletonProxy to any2stringadd\[ClusterSingletonProxy]

### Inherited by implicit conversion StringFormat fromClusterSingletonProxy to StringFormat\[ClusterSingletonProxy]

### Inherited by implicit conversion Ensuring fromClusterSingletonProxy to Ensuring\[ClusterSingletonProxy]

### Inherited by implicit conversion ArrowAssoc fromClusterSingletonProxy to ArrowAssoc\[ClusterSingletonProxy]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorIdentity.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Identify.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ClusterEvent$$CurrentClusterState.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManager$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/ClusterSingletonMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/ClusterSingletonProxy$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/ClusterSingletonProxy.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/ClusterSingletonProxySettings$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/ClusterSingletonProxySettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/util/MessageBuffer.html
- https://doc.akka.io/api/akka-core/2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/ClusterSingletonProxy.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/singleton/ClusterSingletonProxy.html)*