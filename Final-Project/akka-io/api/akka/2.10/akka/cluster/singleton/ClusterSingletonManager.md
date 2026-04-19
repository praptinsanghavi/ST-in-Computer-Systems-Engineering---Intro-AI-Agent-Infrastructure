---
description: Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManager
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:54:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonManager.html
title: Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManager
---

# Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManager

> **Summary:** Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManager

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](index.html)Definition Classes[cluster](../index.html)
- ClusterSingletonManager
- [ClusterSingletonManagerIsStuck](ClusterSingletonManagerIsStuck.html "Thrown when a consistent state can't be determined within the defined retry limits.")
- [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)
- [ClusterSingletonMessage](ClusterSingletonMessage.html "Marker trait for remote messages with special serializer.")
- [ClusterSingletonProxy](ClusterSingletonProxy.html "The ClusterSingletonProxy works together with the akka.cluster.singleton.ClusterSingletonManager to provide a distributed proxy to the singleton actor.")
- [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html)
[c](ClusterSingletonManager$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[singleton](index.html)

# [ClusterSingletonManager](ClusterSingletonManager$.html "See companion object")[**](../../../akka/cluster/singleton/ClusterSingletonManager.html "Permalink")

### Companion [object ClusterSingletonManager](ClusterSingletonManager$.html "See companion object")

#### class ClusterSingletonManager extends [Actor](../../actor/Actor.html) with [FSM](../../actor/FSM.html)\[[State](ClusterSingletonManager$$State.html), [Data](ClusterSingletonManager$$Data.html)]

Manages singleton actor instance among all cluster nodes or a group
of nodes tagged with a specific role. At most one singleton instance
is running at any point in time.

The ClusterSingletonManager is supposed to be started on all nodes,
or all nodes with specified role, in the cluster with `actorOf`.
The actual singleton is started on the oldest node by creating a child
actor from the supplied `singletonProps`.

The singleton actor is always running on the oldest member with specified role.
The oldest member is determined by [akka.cluster.Member\#isOlderThan](../Member.html#isOlderThan(other:akka.cluster.Member):Boolean).
This can change when removing members. A graceful hand over can normally
be performed when current oldest node is leaving the cluster. Be aware that
there is a short time period when there is no active singleton during the
hand\-over process.

The cluster failure detector will notice when oldest node
becomes unreachable due to things like JVM crash, hard shut down,
or network failure. When the crashed node has been removed (via down) from the
cluster then a new oldest node will take over and a new singleton actor is
created. For these failure scenarios there will not be a graceful hand\-over,
but more than one active singletons is prevented by all reasonable means. Some
corner cases are eventually resolved by configurable timeouts.

You access the singleton actor with [ClusterSingletonProxy](ClusterSingletonProxy.html).
Alternatively the singleton actor may broadcast its existence when it is started.

Use factory method [ClusterSingletonManager\#props](ClusterSingletonManager$.html#props(singletonProps:akka.actor.Props,terminationMessage:Any,settings:akka.cluster.singleton.ClusterSingletonManagerSettings):akka.actor.Props) to create the
[akka.actor.Props](../../actor/Props.html) for the actor.

Not intended for subclassing by user code.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[ClusterSingletonManager.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/scala/akka/cluster/singleton/ClusterSingletonManager.scala#L497)Linear Supertypes[FSM](../../actor/FSM.html)\[[ClusterSingletonManager.State](ClusterSingletonManager$$State.html), [Data](ClusterSingletonManager$$Data.html)], [ActorLogging](../../actor/ActorLogging.html), [Listeners](../../routing/Listeners.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSingletonManager
2. FSM
3. ActorLogging
4. Listeners
5. Actor
6. AnyRef
7. Any
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

1. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#<init>(singletonProps:akka.actor.Props,terminationMessage:Any,settings:akka.cluster.singleton.ClusterSingletonManagerSettings):akka.cluster.singleton.ClusterSingletonManager "Permalink")  new ClusterSingletonManager(singletonProps: [Props](../../actor/Props.html), terminationMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), settings: [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html))singletonProps[akka.actor.Props](../../actor/Props.html) of the singleton actor instance.

terminationMessageWhen handing over to a new oldest node
 this `terminationMessage` is sent to the singleton actor to tell
 it to finish its work, close resources, and stop.
 The hand\-over to the new oldest node is completed when the
 singleton actor is terminated.
 Note that [akka.actor.PoisonPill](../../actor/PoisonPill.html) is a perfectly fine
 `terminationMessage` if you only need to stop the actor.

settingssee [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)
### Type Members

1. [**](../../../akka/actor/FSM$TransformHelper.html "Permalink") final  class [TransformHelper](../../actor/FSM$TransformHelper.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[FSM](../../actor/FSM.html)
2. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#Event=akka.actor.FSM.Event[D] "Permalink")  type Event \= [actor.FSM.Event](../../actor/FSM$$Event.html)\[[Data](ClusterSingletonManager$$Data.html)]Definition Classes[FSM](../../actor/FSM.html)
3. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
4. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#State=akka.actor.FSM.State[S,D] "Permalink")  type State \= [actor.FSM.State](../../actor/FSM$$State.html)\[[ClusterSingletonManager.State](ClusterSingletonManager$$State.html), [Data](ClusterSingletonManager$$Data.html)]Definition Classes[FSM](../../actor/FSM.html)
5. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#StateFunction=PartialFunction[FSM.this.Event,FSM.this.State] "Permalink")  type StateFunction \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Event](#Event=akka.actor.FSM.Event[D]), [State](#State=akka.actor.FSM.State[S,D])]Definition Classes[FSM](../../actor/FSM.html)
6. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#StopEvent=akka.actor.FSM.StopEvent[S,D] "Permalink")  type StopEvent \= [actor.FSM.StopEvent](../../actor/FSM$$StopEvent.html)\[[ClusterSingletonManager.State](ClusterSingletonManager$$State.html), [Data](ClusterSingletonManager$$Data.html)]Definition Classes[FSM](../../actor/FSM.html)
7. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#Timeout=Option[scala.concurrent.duration.FiniteDuration] "Permalink")  type Timeout \= [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]Definition Classes[FSM](../../actor/FSM.html)
8. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#TransitionHandler=PartialFunction[(S,S),Unit] "Permalink")  type TransitionHandler \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[([ClusterSingletonManager.State](ClusterSingletonManager$$State.html), [ClusterSingletonManager.State](ClusterSingletonManager$$State.html)), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[FSM](../../actor/FSM.html)
### Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterSingletonManager toany2stringadd\[ClusterSingletonManager] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#->:akka.actor.FSM.->.type "Permalink")  val \-\>: [actor.FSM.\-\>](../../actor/FSM$$$minus$greater$.html).typeThis extractor is just convenience for matching a (S, S) pair, including a
reminder what the new state is.

This extractor is just convenience for matching a (S, S) pair, including a
reminder what the new state is.

Definition Classes[FSM](../../actor/FSM.html)
5. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#Event:akka.actor.FSM.Event.type "Permalink")  val Event: actor.FSM.Event.typeDefinition Classes[FSM](../../actor/FSM.html)
7. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#StateTimeout:akka.actor.FSM.StateTimeout.type "Permalink")  val StateTimeout: [actor.FSM.StateTimeout](../../actor/FSM$$StateTimeout$.html).typeThis case object is received in case of a state timeout.

This case object is received in case of a state timeout.

Definition Classes[FSM](../../actor/FSM.html)
8. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#StopEvent:akka.actor.FSM.StopEvent.type "Permalink")  val StopEvent: actor.FSM.StopEvent.typeDefinition Classes[FSM](../../actor/FSM.html)
9. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#addRemoved(node:akka.cluster.UniqueAddress):Unit "Permalink")  def addRemoved(node: [UniqueAddress](../UniqueAddress.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
10. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
12. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
13. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
14. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
15. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
16. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#cancelTimer(name:String):Unit "Permalink") final  def cancelTimer(name: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Cancel named timer, ensuring that the message is not subsequently delivered (no race).

Cancel named timer, ensuring that the message is not subsequently delivered (no race).

nameof the timer to cancel

Definition Classes[FSM](../../actor/FSM.html)
17. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#cleanupOverdueNotMemberAnyMore():Unit "Permalink")  def cleanupOverdueNotMemberAnyMore(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
18. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#cluster:akka.cluster.Cluster "Permalink")  val cluster: [Cluster](../Cluster.html)
20. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
21. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#coordShutdown:akka.actor.CoordinatedShutdown "Permalink")  val coordShutdown: [CoordinatedShutdown](../../actor/CoordinatedShutdown.html)
22. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterSingletonManager) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterSingletonManagerImplicitThis member is added by an implicit conversion from ClusterSingletonManager toEnsuring\[ClusterSingletonManager] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterSingletonManager) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterSingletonManagerImplicitThis member is added by an implicit conversion from ClusterSingletonManager toEnsuring\[ClusterSingletonManager] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
24. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterSingletonManagerImplicitThis member is added by an implicit conversion from ClusterSingletonManager toEnsuring\[ClusterSingletonManager] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
25. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterSingletonManagerImplicitThis member is added by an implicit conversion from ClusterSingletonManager toEnsuring\[ClusterSingletonManager] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
26. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
28. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#getNextOldestChanged():Unit "Permalink")  def getNextOldestChanged(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
30. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#gossip(msg:Any)(implicitsender:akka.actor.ActorRef):Unit "Permalink")  def gossip(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit sender: [ActorRef](../../actor/ActorRef.html) \= [Actor.noSender](../../index.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sends the supplied message to all current listeners using the provided sender() as sender.

Sends the supplied message to all current listeners using the provided sender() as sender.

Attributesprotected Definition Classes[Listeners](../../routing/Listeners.html)
31. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#goto(nextStateName:S):FSM.this.State "Permalink") final  def goto(nextStateName: [ClusterSingletonManager.State](ClusterSingletonManager$$State.html)): [State](#State=akka.actor.FSM.State[S,D])Produce transition to other state.

Produce transition to other state.
Return this from a state function in order to effect the transition.

This method always triggers transition events, even for `A -> A` transitions.
If you want to stay in the same state without triggering an state transition event use [\#stay](#stay():FSM.this.State) instead.

nextStateNamestate designator for the next state

returnsstate transition descriptor

Definition Classes[FSM](../../actor/FSM.html)
32. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#gotoHandingOver(singleton:Option[akka.actor.ActorRef],handOverTo:Option[akka.actor.ActorRef]):ClusterSingletonManager.this.State "Permalink")  def gotoHandingOver(singleton: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ActorRef](../../actor/ActorRef.html)], handOverTo: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ActorRef](../../actor/ActorRef.html)]): [State](#State=akka.actor.FSM.State[S,D])
33. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#gotoOldest():ClusterSingletonManager.this.State "Permalink")  def gotoOldest(): [State](#State=akka.actor.FSM.State[S,D])Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
34. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#gotoStopping(singleton:akka.actor.ActorRef):ClusterSingletonManager.this.State "Permalink")  def gotoStopping(singleton: [ActorRef](../../actor/ActorRef.html)): [State](#State=akka.actor.FSM.State[S,D])
35. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#handOverDone(handOverTo:Option[akka.actor.ActorRef]):ClusterSingletonManager.this.State "Permalink")  def handOverDone(handOverTo: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ActorRef](../../actor/ActorRef.html)]): [State](#State=akka.actor.FSM.State[S,D])
36. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#handleMemberEvent(event:akka.cluster.ClusterEvent.MemberEvent):ClusterSingletonManager.this.State "Permalink")  def handleMemberEvent(event: [MemberEvent](../ClusterEvent$$MemberEvent.html)): [State](#State=akka.actor.FSM.State[S,D])
37. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#handleOldestChanged(singleton:Option[akka.actor.ActorRef],oldestOption:Option[akka.cluster.UniqueAddress]):ClusterSingletonManager.this.State "Permalink")  def handleOldestChanged(singleton: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ActorRef](../../actor/ActorRef.html)], oldestOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[UniqueAddress](../UniqueAddress.html)]): [State](#State=akka.actor.FSM.State[S,D])
38. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
39. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#initialize():Unit "Permalink") final  def initialize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Verify existence of initial state and setup timers.

Verify existence of initial state and setup timers. This should be the
last call within the constructor, or [akka.actor.Actor\#preStart](../../actor/Actor.html#preStart():Unit) and
[akka.actor.Actor\#postRestart](../../actor/Actor.html#postRestart(reason:Throwable):Unit)

An initial `currentState -> currentState` notification will be triggered by calling this method.

Definition Classes[FSM](../../actor/FSM.html)See also[\#startWith](#startWith(stateName:S,stateData:D,timeout:FSM.this.Timeout):Unit)
40. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
41. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#isTimerActive(name:String):Boolean "Permalink") final  def isTimerActive(name: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Inquire whether the named timer is still active.

Inquire whether the named timer is still active. Returns true unless the
timer does not exist, has previously been canceled or if it was a
single\-shot timer whose message was already received.

Definition Classes[FSM](../../actor/FSM.html)
42. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#lease:Option[akka.coordination.lease.scaladsl.Lease] "Permalink")  val lease: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Lease](../../coordination/lease/scaladsl/Lease.html)]
43. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#leaseRetryInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val leaseRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
44. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#listenerManagement:akka.actor.Actor.Receive "Permalink")  def listenerManagement: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Chain this into the receive function.

Chain this into the receive function.

```
def receive = listenerManagement orElse …
```
Attributesprotected Definition Classes[Listeners](../../routing/Listeners.html)
45. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#listeners:java.util.Set[akka.actor.ActorRef] "Permalink")  val listeners: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ActorRef](../../actor/ActorRef.html)]Attributesprotected Definition Classes[Listeners](../../routing/Listeners.html)
46. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#log:akka.event.MarkerLoggingAdapter "Permalink")  val log: [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html)Definition ClassesClusterSingletonManager → [ActorLogging](../../actor/ActorLogging.html)
47. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#logInfo(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def logInfo(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
48. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#logInfo(marker:akka.event.LogMarker,template:String,arg1:Any,arg2:Any):Unit "Permalink")  def logInfo(marker: [LogMarker](../../event/LogMarker.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
49. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#logInfo(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def logInfo(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
50. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#logInfo(marker:akka.event.LogMarker,template:String,arg1:Any):Unit "Permalink")  def logInfo(marker: [LogMarker](../../event/LogMarker.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
51. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#logInfo(template:String,arg1:Any):Unit "Permalink")  def logInfo(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
52. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#logInfo(marker:akka.event.LogMarker,message:String):Unit "Permalink")  def logInfo(marker: [LogMarker](../../event/LogMarker.html), message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
53. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#logInfo(message:String):Unit "Permalink")  def logInfo(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
54. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#logTermination(reason:akka.actor.FSM.Reason):Unit "Permalink")  def logTermination(reason: [Reason](../../actor/FSM$$Reason.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)By default FSM.Failure is logged at error level and other reason
types are not logged.

By default FSM.Failure is logged at error level and other reason
types are not logged. It is possible to override this behavior.

Attributesprotected Definition Classes[FSM](../../actor/FSM.html)
55. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#maxHandOverRetries:Int "Permalink")  val maxHandOverRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
56. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#maxTakeOverRetries:Int "Permalink")  val maxTakeOverRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
57. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#memberExitingProgress:scala.concurrent.Promise[akka.Done] "Permalink")  val memberExitingProgress: [Promise](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Promise.html#scala.concurrent.Promise)\[[Done](../../Done.html)]
58. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
59. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#nextStateData:D "Permalink") final  def nextStateData: [Data](ClusterSingletonManager$$Data.html)Return next state data (available in onTransition handlers)

Return next state data (available in onTransition handlers)

Definition Classes[FSM](../../actor/FSM.html)
60. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
61. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
62. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#oldestChangedBuffer:akka.actor.ActorRef "Permalink")  var oldestChangedBuffer: [ActorRef](../../actor/ActorRef.html)
63. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#oldestChangedReceived:Boolean "Permalink")  var oldestChangedReceived: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
64. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#onTermination(terminationHandler:PartialFunction[FSM.this.StopEvent,Unit]):Unit "Permalink") final  def onTermination(terminationHandler: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[StopEvent](#StopEvent=akka.actor.FSM.StopEvent[S,D]), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set handler which is called upon termination of this FSM actor.

Set handler which is called upon termination of this FSM actor. Calling
this method again will overwrite the previous contents.

Definition Classes[FSM](../../actor/FSM.html)
65. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#onTransition(transitionHandler:FSM.this.TransitionHandler):Unit "Permalink") final  def onTransition(transitionHandler: [TransitionHandler](#TransitionHandler=PartialFunction[(S,S),Unit])): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set handler which is called upon each state transition, i.e.

Set handler which is called upon each state transition, i.e. not when
staying in the same state. This may use the pair extractor defined in the
FSM companion object like so:

```

onTransition {
  case Old -> New => doSomething
}

```
It is also possible to supply a 2\-ary function object:

```

onTransition(handler _)

private def handler(from: S, to: S) { ... }

```
The underscore is unfortunately necessary to enable the nicer syntax shown
above (it uses the implicit conversion total2pf under the hood).

**Multiple handlers may be installed, and every one of them will be
called, not only the first one matching.**

Definition Classes[FSM](../../actor/FSM.html)
66. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#peer(at:akka.actor.Address):akka.actor.ActorSelection "Permalink")  def peer(at: [Address](../../actor/Address.html)): [ActorSelection](../../actor/ActorSelection.html)
67. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
68. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Call `onTermination` hook; if you want to retain this behavior when
overriding make sure to call `super.postStop()`.

Call `onTermination` hook; if you want to retain this behavior when
overriding make sure to call `super.postStop()`.

Please note that this method is called by default from `preRestart()`,
so override that one if `onTermination` shall not be called during
restart.

Definition ClassesClusterSingletonManager → [FSM](../../actor/FSM.html) → [Actor](../../actor/Actor.html)
69. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
70. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition ClassesClusterSingletonManager → [Actor](../../actor/Actor.html)
71. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#preparingForFullShutdown:Boolean "Permalink")  var preparingForFullShutdown: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
72. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#receive:FSM.this.Receive "Permalink")  def receive: [Receive](#Receive=akka.actor.Actor.Receive)Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition Classes[FSM](../../actor/FSM.html) → [Actor](../../actor/Actor.html)
73. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#removalMargin:scala.concurrent.duration.FiniteDuration "Permalink")  val removalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
74. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#removed:scala.collection.immutable.Map[akka.cluster.UniqueAddress,scala.concurrent.duration.Deadline] "Permalink")  var removed: [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[[UniqueAddress](../UniqueAddress.html), [Deadline](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Deadline.html#scala.concurrent.duration.Deadline)]
75. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#scheduleDelayedMemberRemoved(m:akka.cluster.Member):Unit "Permalink")  def scheduleDelayedMemberRemoved(m: [Member](../Member.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
76. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
77. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#selfExited:Boolean "Permalink")  var selfExited: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
78. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#selfMemberExited():Unit "Permalink")  def selfMemberExited(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
79. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#selfUniqueAddressOption:Some[akka.cluster.UniqueAddress] "Permalink")  val selfUniqueAddressOption: [Some](https://www.scala-lang.org/api/2.13.17/scala/Some.html#scala.Some)\[[UniqueAddress](../UniqueAddress.html)]
80. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
81. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#setStateTimeout(state:S,timeout:FSM.this.Timeout):Unit "Permalink") final  def setStateTimeout(state: [ClusterSingletonManager.State](ClusterSingletonManager$$State.html), timeout: [Timeout](#Timeout=Option[scala.concurrent.duration.FiniteDuration])): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set state timeout explicitly.

Set state timeout explicitly. This method can safely be used from within a
state handler.

Definition Classes[FSM](../../actor/FSM.html)
82. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#startSingleTimer(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startSingleTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.

Definition Classes[FSM](../../actor/FSM.html)
83. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#startTimerAtFixedRate(name:String,msg:Any,interval:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerAtFixedRate(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

It will compensate the delay for a subsequent message if the sending of previous
message was delayed more than specified. In such cases, the actual message interval
will differ from the interval passed to the method.

If the execution is delayed longer than the `interval`, the subsequent message will
be sent immediately after the prior one. This also has the consequence that after
long garbage collection pauses or other reasons when the JVM was suspended all
"missed" messages will be sent when the process wakes up again.

In the long run, the frequency of messages will be exactly the reciprocal of the
specified `interval`.

Warning: `startTimerAtFixedRate` can result in bursts of scheduled messages after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `startTimerWithFixedDelay` is often preferred.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.

Definition Classes[FSM](../../actor/FSM.html)
84. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#startTimerWithFixedDelay(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerWithFixedDelay(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages.

Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages.

It will not compensate the delay between messages if scheduling is delayed
longer than specified for some reason. The delay between sending of subsequent
messages will always be (at least) the given `delay`.

In the long run, the frequency of messages will generally be slightly lower than
the reciprocal of the specified `delay`.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.

Definition Classes[FSM](../../actor/FSM.html)
85. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#startWith(stateName:S,stateData:D,timeout:FSM.this.Timeout):Unit "Permalink") final  def startWith(stateName: [ClusterSingletonManager.State](ClusterSingletonManager$$State.html), stateData: [Data](ClusterSingletonManager$$Data.html), timeout: [Timeout](#Timeout=Option[scala.concurrent.duration.FiniteDuration]) \= None): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set initial state.

Set initial state. Call this method from the constructor before the [\#initialize](#initialize():Unit) method.
If different state is needed after a restart this method, followed by [\#initialize](#initialize():Unit), can
be used in the actor life cycle hooks [akka.actor.Actor\#preStart](../../actor/Actor.html#preStart():Unit) and [akka.actor.Actor\#postRestart](../../actor/Actor.html#postRestart(reason:Throwable):Unit).

stateNameinitial state designator

stateDatainitial state data

timeoutstate timeout for the initial state, overriding the default timeout for that state

Definition Classes[FSM](../../actor/FSM.html)
86. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#stateData:D "Permalink") final  def stateData: [Data](ClusterSingletonManager$$Data.html)Return current state data (i.e.

Return current state data (i.e. object of type D)

Definition Classes[FSM](../../actor/FSM.html)
87. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#stateName:S "Permalink") final  def stateName: [ClusterSingletonManager.State](ClusterSingletonManager$$State.html)Return current state name (i.e.

Return current state name (i.e. object of type S)

Definition Classes[FSM](../../actor/FSM.html)
88. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#stay():FSM.this.State "Permalink") final  def stay(): [State](#State=akka.actor.FSM.State[S,D])Produce "empty" transition descriptor.

Produce "empty" transition descriptor.
Return this from a state function when no state change is to be effected.

No transition event will be triggered by [\#stay](#stay():FSM.this.State).
If you want to trigger an event like `S -> S` for `onTransition` to handle use `goto` instead.

returnsdescriptor for staying in current state

Definition Classes[FSM](../../actor/FSM.html)
89. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#stop(reason:akka.actor.FSM.Reason,stateData:D):FSM.this.State "Permalink") final  def stop(reason: [Reason](../../actor/FSM$$Reason.html), stateData: [Data](ClusterSingletonManager$$Data.html)): [State](#State=akka.actor.FSM.State[S,D])Produce change descriptor to stop this FSM actor including specified reason.

Produce change descriptor to stop this FSM actor including specified reason.

Definition Classes[FSM](../../actor/FSM.html)
90. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#stop(reason:akka.actor.FSM.Reason):FSM.this.State "Permalink") final  def stop(reason: [Reason](../../actor/FSM$$Reason.html)): [State](#State=akka.actor.FSM.State[S,D])Produce change descriptor to stop this FSM actor including specified reason.

Produce change descriptor to stop this FSM actor including specified reason.

Definition Classes[FSM](../../actor/FSM.html)
91. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#stop():FSM.this.State "Permalink") final  def stop(): [State](#State=akka.actor.FSM.State[S,D])Produce change descriptor to stop this FSM actor with reason "Normal".

Produce change descriptor to stop this FSM actor with reason "Normal".

Definition Classes[FSM](../../actor/FSM.html)
92. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
93. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
94. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
95. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#total2pf(transitionHandler:(S,S)=>Unit):FSM.this.TransitionHandler "Permalink") implicit final  def total2pf(transitionHandler: ([ClusterSingletonManager.State](ClusterSingletonManager$$State.html), [ClusterSingletonManager.State](ClusterSingletonManager$$State.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [TransitionHandler](#TransitionHandler=PartialFunction[(S,S),Unit])Convenience wrapper for using a total function instead of a partial
function literal.

Convenience wrapper for using a total function instead of a partial
function literal. To be used with onTransition.

Definition Classes[FSM](../../actor/FSM.html)
96. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#transform(func:FSM.this.StateFunction):FSM.this.TransformHelper "Permalink") final  def transform(func: [StateFunction](#StateFunction=PartialFunction[FSM.this.Event,FSM.this.State])): [TransformHelper](#TransformHelperextendsAnyRef)Definition Classes[FSM](../../actor/FSM.html)
97. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#tryAcquireLease():akka.actor.FSM.State[akka.cluster.singleton.ClusterSingletonManager.State,akka.cluster.singleton.ClusterSingletonManager.Data] "Permalink")  def tryAcquireLease(): [actor.FSM.State](../../actor/FSM$$State.html)\[[ClusterSingletonManager.State](ClusterSingletonManager$$State.html), [Data](ClusterSingletonManager$$Data.html)]
98. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#tryGotoOldest():ClusterSingletonManager.this.State "Permalink")  def tryGotoOldest(): [State](#State=akka.actor.FSM.State[S,D])
99. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
100. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
101. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
102. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
103. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#when(stateName:S,stateTimeout:scala.concurrent.duration.FiniteDuration)(stateFunction:FSM.this.StateFunction):Unit "Permalink") final  def when(stateName: [ClusterSingletonManager.State](ClusterSingletonManager$$State.html), stateTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration) \= null)(stateFunction: [StateFunction](#StateFunction=PartialFunction[FSM.this.Event,FSM.this.State])): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Insert a new StateFunction at the end of the processing chain for the
given state.

Insert a new StateFunction at the end of the processing chain for the
given state. If the stateTimeout parameter is set, entering this state
without a differing explicit timeout setting will trigger a StateTimeout
event; the same is true when using \#stay.

stateNamedesignator for the state

stateTimeoutdefault state timeout for this state

stateFunctionpartial function describing response to input

Definition Classes[FSM](../../actor/FSM.html)
104. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#whenUnhandled(stateFunction:FSM.this.StateFunction):Unit "Permalink") final  def whenUnhandled(stateFunction: [StateFunction](#StateFunction=PartialFunction[FSM.this.Event,FSM.this.State])): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set handler which is called upon reception of unhandled messages.

Set handler which is called upon reception of unhandled messages. Calling
this method again will overwrite the previous contents.

The current state may be queried using `stateName`.

Definition Classes[FSM](../../actor/FSM.html)
### Shadowed Implicit Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterSingletonManager, B)ImplicitThis member is added by an implicit conversion from ClusterSingletonManager toArrowAssoc\[ClusterSingletonManager] performed by method ArrowAssoc in scala.Predef.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(clusterSingletonManager: ArrowAssoc[ClusterSingletonManager]).->(y)
```
Definition ClassesArrowAssocAnnotations@inline()
### Deprecated Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterSingletonManager toStringFormat\[ClusterSingletonManager] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#setTimer(name:String,msg:Any,timeout:scala.concurrent.duration.FiniteDuration,repeat:Boolean):Unit "Permalink") final  def setTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), repeat: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedule named timer to deliver message after given delay, possibly repeating.

Schedule named timer to deliver message after given delay, possibly repeating.
Any existing timer with the same name will automatically be canceled before
adding the new timer.

nameidentifier to be used with cancelTimer()

msgmessage to be delivered

timeoutdelay of first message delivery and between subsequent messages

repeatsend once if false, scheduleAtFixedRate if true

Definition Classes[FSM](../../actor/FSM.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use startSingleTimer, startTimerWithFixedDelay or startTimerAtFixedRate instead. This has the same semantics as startTimerAtFixedRate, but startTimerWithFixedDelay is often preferred.
4. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterSingletonManager, B)ImplicitThis member is added by an implicit conversion from ClusterSingletonManager toArrowAssoc\[ClusterSingletonManager] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [FSM](../../actor/FSM.html)\[[ClusterSingletonManager.State](ClusterSingletonManager$$State.html), [Data](ClusterSingletonManager$$Data.html)]

### Inherited from [ActorLogging](../../actor/ActorLogging.html)

### Inherited from [Listeners](../../routing/Listeners.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterSingletonManager to any2stringadd\[ClusterSingletonManager]

### Inherited by implicit conversion StringFormat fromClusterSingletonManager to StringFormat\[ClusterSingletonManager]

### Inherited by implicit conversion Ensuring fromClusterSingletonManager to Ensuring\[ClusterSingletonManager]

### Inherited by implicit conversion ArrowAssoc fromClusterSingletonManager to ArrowAssoc\[ClusterSingletonManager]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/Done.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Actor$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka/2.10/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/api/akka/2.10/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka/2.10/akka/actor/FSM$$$minus$greater$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/FSM$$Event.html
- https://doc.akka.io/api/akka/2.10/akka/actor/FSM$$Reason.html
- https://doc.akka.io/api/akka/2.10/akka/actor/FSM$$State.html
- https://doc.akka.io/api/akka/2.10/akka/actor/FSM$$StateTimeout$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/FSM$$StopEvent.html
- https://doc.akka.io/api/akka/2.10/akka/actor/FSM$TransformHelper.html
- https://doc.akka.io/api/akka/2.10/akka/actor/FSM.html
- https://doc.akka.io/api/akka/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Props.html
- https://doc.akka.io/api/akka/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Terminated.html
- https://doc.akka.io/api/akka/2.10/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/ClusterEvent$$MemberEvent.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/Member.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonManager$$Data.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonManager$$State.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonManager$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonMessage.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonProxy$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonProxy.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonProxySettings$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka/2.10/akka/coordination/lease/scaladsl/Lease.html
- https://doc.akka.io/api/akka/2.10/akka/event/EventStream.html
- https://doc.akka.io/api/akka/2.10/akka/event/LogMarker.html
- https://doc.akka.io/api/akka/2.10/akka/event/MarkerLoggingAdapter.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonManager.html](https://doc.akka.io/api/akka/2.10/akka/cluster/singleton/ClusterSingletonManager.html)*