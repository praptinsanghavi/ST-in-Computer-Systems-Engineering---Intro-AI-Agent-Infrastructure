---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:13:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.html
title: ClusterSingletonManager
---

# ClusterSingletonManager

## Content

Package [akka.cluster.singleton](package-summary.html)
## Class ClusterSingletonManager

- java.lang.Object
- - akka.cluster.singleton.ClusterSingletonManager

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`, `[FSM](../../actor/FSM.html "interface in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>`, `[Listeners](../../routing/Listeners.html "interface in akka.routing")`

---

```
public class ClusterSingletonManager
extends java.lang.Object
implements [Actor](../../actor/Actor.html "interface in akka.actor"), [FSM](../../actor/FSM.html "interface in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>
```

Manages singleton actor instance among all cluster nodes or a group
 of nodes tagged with a specific role. At most one singleton instance
 is running at any point in time.
 
 The ClusterSingletonManager is supposed to be started on all nodes,
 or all nodes with specified role, in the cluster with `actorOf`.
 The actual singleton is started on the oldest node by creating a child
 actor from the supplied `singletonProps`.
 

 The singleton actor is always running on the oldest member with specified role.
 The oldest member is determined by [`Member.isOlderThan(akka.cluster.Member)`](../Member.html#isOlderThan(akka.cluster.Member)).
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
 

 You access the singleton actor with [`ClusterSingletonProxy`](ClusterSingletonProxy.html "class in akka.cluster.singleton").
 Alternatively the singleton actor may broadcast its existence when it is started.
 

 Use factory method [`props(akka.actor.Props, java.lang.Object, akka.cluster.singleton.ClusterSingletonManagerSettings)`](#props(akka.actor.Props,java.lang.Object,akka.cluster.singleton.ClusterSingletonManagerSettings)) to create the
 [`Props`](../../actor/Props.html "class in akka.actor") for the actor.
 

 Not intended for subclassing by user code.
 

 param: singletonProps [`Props`](../../actor/Props.html "class in akka.actor") of the singleton actor instance.
 

 param: terminationMessage When handing over to a new oldest node
 this `terminationMessage` is sent to the singleton actor to tell
 it to finish its work, close resources, and stop.
 The hand\-over to the new oldest node is completed when the
 singleton actor is terminated.
 Note that [`PoisonPill`](../../actor/PoisonPill.html "class in akka.actor") is a perfectly fine
 `terminationMessage` if you only need to stop the actor.
 

 param: settings see [`ClusterSingletonManagerSettings`](ClusterSingletonManagerSettings.html "class in akka.cluster.singleton")

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")` | INTERNAL API  public due to the `with FSM` type parameters |
	| `static class` | `[ClusterSingletonManager.Internal$](ClusterSingletonManager.Internal$.html "class in akka.cluster.singleton")` | INTERNAL API |
	| `static interface` | `[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton")` | INTERNAL API  public due to the `with FSM` type parameters |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.actor.[FSM](../../actor/FSM.html "interface in akka.actor")
		
		
		`[FSM.$minus$greater$](../../actor/FSM.$minus$greater$.html "class in akka.actor"), [FSM.CurrentState](../../actor/FSM.CurrentState.html "class in akka.actor")<[S](../../actor/FSM.CurrentState.html "type parameter in FSM.CurrentState")>, [FSM.CurrentState$](../../actor/FSM.CurrentState$.html "class in akka.actor"), [FSM.Event](../../actor/FSM.Event.html "class in akka.actor")<[D](../../actor/FSM.Event.html "type parameter in FSM.Event")>, [FSM.Event$](../../actor/FSM.Event$.html "class in akka.actor"), [FSM.Failure](../../actor/FSM.Failure.html "class in akka.actor"), [FSM.Failure$](../../actor/FSM.Failure$.html "class in akka.actor"), [FSM.FixedDelayMode$](../../actor/FSM.FixedDelayMode$.html "class in akka.actor"), [FSM.FixedRateMode$](../../actor/FSM.FixedRateMode$.html "class in akka.actor"), [FSM.LogEntry](../../actor/FSM.LogEntry.html "class in akka.actor")<[S](../../actor/FSM.LogEntry.html "type parameter in FSM.LogEntry"),​[D](../../actor/FSM.LogEntry.html "type parameter in FSM.LogEntry")>, [FSM.LogEntry$](../../actor/FSM.LogEntry$.html "class in akka.actor"), [FSM.Normal$](../../actor/FSM.Normal$.html "class in akka.actor"), [FSM.NullFunction$](../../actor/FSM.NullFunction$.html "class in akka.actor"), [FSM.Reason](../../actor/FSM.Reason.html "interface in akka.actor"), [FSM.Shutdown$](../../actor/FSM.Shutdown$.html "class in akka.actor"), [FSM.SilentState](../../actor/FSM.SilentState.html "class in akka.actor")<[S](../../actor/FSM.SilentState.html "type parameter in FSM.SilentState"),​[D](../../actor/FSM.SilentState.html "type parameter in FSM.SilentState")>, [FSM.SingleMode$](../../actor/FSM.SingleMode$.html "class in akka.actor"), [FSM.State$](../../actor/FSM.State$.html "class in akka.actor"), [FSM.StateTimeout$](../../actor/FSM.StateTimeout$.html "class in akka.actor"), [FSM.StopEvent](../../actor/FSM.StopEvent.html "class in akka.actor")<[S](../../actor/FSM.StopEvent.html "type parameter in FSM.StopEvent"),​[D](../../actor/FSM.StopEvent.html "type parameter in FSM.StopEvent")>, [FSM.StopEvent$](../../actor/FSM.StopEvent$.html "class in akka.actor"), [FSM.SubscribeTransitionCallBack](../../actor/FSM.SubscribeTransitionCallBack.html "class in akka.actor"), [FSM.SubscribeTransitionCallBack$](../../actor/FSM.SubscribeTransitionCallBack$.html "class in akka.actor"), [FSM.Timer](../../actor/FSM.Timer.html "class in akka.actor"), [FSM.Timer$](../../actor/FSM.Timer$.html "class in akka.actor"), [FSM.TimerMode](../../actor/FSM.TimerMode.html "interface in akka.actor"), [FSM.TransformHelper](../../actor/FSM.TransformHelper.html "class in akka.actor"), [FSM.Transition](../../actor/FSM.Transition.html "class in akka.actor")<[S](../../actor/FSM.Transition.html "type parameter in FSM.Transition")>, [FSM.Transition$](../../actor/FSM.Transition$.html "class in akka.actor"), [FSM.UnsubscribeTransitionCallBack](../../actor/FSM.UnsubscribeTransitionCallBack.html "class in akka.actor"), [FSM.UnsubscribeTransitionCallBack$](../../actor/FSM.UnsubscribeTransitionCallBack$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingletonManager](#%3Cinit%3E(akka.actor.Props,java.lang.Object,akka.cluster.singleton.ClusterSingletonManagerSettings))​([Props](../../actor/Props.html "class in akka.actor") singletonProps,  java.lang.Object terminationMessage,  [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.singleton") settings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[FSM.$minus$greater$](../../actor/FSM.$minus$greater$.html "class in akka.actor")` | `[$minus$greater](#$minus$greater())()` | This extractor is just convenience for matching a (S, S) pair, including a  reminder what the new state is. |
	| `void` | `[addRemoved](#addRemoved(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") node)` |  |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `protected void` | `[akka$actor$FSM$_setter_$Event_$eq](#akka$actor$FSM$_setter_$Event_$eq(akka.actor.FSM.Event$))​([FSM.Event$](../../actor/FSM.Event$.html "class in akka.actor") x$1)` |  |
	| `protected void` | `[akka$actor$FSM$_setter_$StateTimeout_$eq](#akka$actor$FSM$_setter_$StateTimeout_$eq(akka.actor.FSM.StateTimeout$))​([FSM.StateTimeout$](../../actor/FSM.StateTimeout$.html "class in akka.actor") x$1)` | This case object is received in case of a state timeout. |
	| `protected void` | `[akka$actor$FSM$_setter_$StopEvent_$eq](#akka$actor$FSM$_setter_$StopEvent_$eq(akka.actor.FSM.StopEvent$))​([FSM.StopEvent$](../../actor/FSM.StopEvent$.html "class in akka.actor") x$1)` |  |
	| `protected void` | `[akka$routing$Listeners$_setter_$listeners_$eq](#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set))​(java.util.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)` |  |
	| `void` | `[cleanupOverdueNotMemberAnyMore](#cleanupOverdueNotMemberAnyMore())()` |  |
	| `[Cluster](../Cluster.html "class in akka.cluster")` | `[cluster](#cluster())()` |  |
	| `[ActorContext](../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `[CoordinatedShutdown](../../actor/CoordinatedShutdown.html "class in akka.actor")` | `[coordShutdown](#coordShutdown())()` |  |
	| `[FSM.Event$](../../actor/FSM.Event$.html "class in akka.actor")` | `[Event](#Event())()` |  |
	| `void` | `[getNextOldestChanged](#getNextOldestChanged())()` |  |
	| `[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>` | `[gotoHandingOver](#gotoHandingOver(scala.Option,scala.Option))​(scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> singleton,  scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> handOverTo)` |  |
	| `[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>` | `[gotoOldest](#gotoOldest())()` |  |
	| `[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>` | `[gotoStopping](#gotoStopping(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") singleton)` |  |
	| `[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>` | `[handleMemberEvent](#handleMemberEvent(akka.cluster.ClusterEvent.MemberEvent))​([ClusterEvent.MemberEvent](../ClusterEvent.MemberEvent.html "interface in akka.cluster") event)` |  |
	| `[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>` | `[handleOldestChanged](#handleOldestChanged(scala.Option,scala.Option))​(scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> singleton,  scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> oldestOption)` |  |
	| `[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>` | `[handOverDone](#handOverDone(scala.Option))​(scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> handOverTo)` |  |
	| `scala.Option<[Lease](../../coordination/lease/scaladsl/Lease.html "class in akka.coordination.lease.scaladsl")>` | `[lease](#lease())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[leaseRetryInterval](#leaseRetryInterval())()` |  |
	| `protected java.util.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[listeners](#listeners())()` |  |
	| `[MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event")` | `[log](#log())()` |  |
	| `void` | `[logInfo](#logInfo(akka.event.LogMarker,java.lang.String))​([LogMarker](../../event/LogMarker.html "class in akka.event") marker,  java.lang.String message)` |  |
	| `void` | `[logInfo](#logInfo(akka.event.LogMarker,java.lang.String,java.lang.Object))​([LogMarker](../../event/LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[logInfo](#logInfo(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](../../event/LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[logInfo](#logInfo(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[logInfo](#logInfo(java.lang.String,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[logInfo](#logInfo(java.lang.String,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[logInfo](#logInfo(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `int` | `[maxHandOverRetries](#maxHandOverRetries())()` |  |
	| `int` | `[maxTakeOverRetries](#maxTakeOverRetries())()` |  |
	| `scala.concurrent.Promise<[Done](../../Done.html "class in akka")>` | `[memberExitingProgress](#memberExitingProgress())()` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[oldestChangedBuffer](#oldestChangedBuffer())()` |  |
	| `void` | `[oldestChangedBuffer_$eq](#oldestChangedBuffer_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` |  |
	| `boolean` | `[oldestChangedReceived](#oldestChangedReceived())()` |  |
	| `void` | `[oldestChangedReceived_$eq](#oldestChangedReceived_$eq(boolean))​(boolean x$1)` |  |
	| `[ActorSelection](../../actor/ActorSelection.html "class in akka.actor")` | `[peer](#peer(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") at)` |  |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `boolean` | `[preparingForFullShutdown](#preparingForFullShutdown())()` |  |
	| `void` | `[preparingForFullShutdown_$eq](#preparingForFullShutdown_$eq(boolean))​(boolean x$1)` |  |
	| `void` | `[preStart](#preStart())()` | User overridable callback. |
	| `static [Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(akka.actor.Props,java.lang.Object,akka.cluster.singleton.ClusterSingletonManagerSettings))​([Props](../../actor/Props.html "class in akka.actor") singletonProps,  java.lang.Object terminationMessage,  [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.singleton") settings)` | Scala API: Factory method for `ClusterSingletonManager` [`Props`](../../actor/Props.html "class in akka.actor"). |
	| `scala.concurrent.duration.FiniteDuration` | `[removalMargin](#removalMargin())()` |  |
	| `scala.collection.immutable.Map<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​scala.concurrent.duration.Deadline>` | `[removed](#removed())()` |  |
	| `void` | `[removed_$eq](#removed_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​scala.concurrent.duration.Deadline> x$1)` |  |
	| `void` | `[scheduleDelayedMemberRemoved](#scheduleDelayedMemberRemoved(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	| `boolean` | `[selfExited](#selfExited())()` |  |
	| `void` | `[selfExited_$eq](#selfExited_$eq(boolean))​(boolean x$1)` |  |
	| `void` | `[selfMemberExited](#selfMemberExited())()` |  |
	| `scala.Some<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[selfUniqueAddressOption](#selfUniqueAddressOption())()` |  |
	| `[FSM.StateTimeout$](../../actor/FSM.StateTimeout$.html "class in akka.actor")` | `[StateTimeout](#StateTimeout())()` | This case object is received in case of a state timeout. |
	| `[FSM.StopEvent$](../../actor/FSM.StopEvent$.html "class in akka.actor")` | `[StopEvent](#StopEvent())()` |  |
	| `[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>` | `[tryAcquireLease](#tryAcquireLease())()` |  |
	| `[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>` | `[tryGotoOldest](#tryGotoOldest())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter))`
		- ### Methods inherited from interface akka.actor.[FSM](../../actor/FSM.html "interface in akka.actor")
		
		
		`[applyState](../../actor/FSM.html#applyState(akka.actor.FSM.State)), [cancelTimer](../../actor/FSM.html#cancelTimer(java.lang.String)), [currentState_$eq](../../actor/FSM.html#currentState_$eq(akka.actor.FSM.State)), [debugEvent](../../actor/FSM.html#debugEvent()), [generation_$eq](../../actor/FSM.html#generation_$eq(long)), [handleEvent_$eq](../../actor/FSM.html#handleEvent_$eq(scala.PartialFunction)), [handleTransition](../../actor/FSM.html#handleTransition(S,S)), [initialize](../../actor/FSM.html#initialize()), [isStateTimerActive](../../actor/FSM.html#isStateTimerActive()), [isTimerActive](../../actor/FSM.html#isTimerActive(java.lang.String)), [logTermination](../../actor/FSM.html#logTermination(akka.actor.FSM.Reason)), [makeTransition](../../actor/FSM.html#makeTransition(akka.actor.FSM.State)), [nextState_$eq](../../actor/FSM.html#nextState_$eq(akka.actor.FSM.State)), [nextStateData](../../actor/FSM.html#nextStateData()), [onTermination](../../actor/FSM.html#onTermination(scala.PartialFunction)), [onTransition](../../actor/FSM.html#onTransition(scala.PartialFunction)), [processEvent](../../actor/FSM.html#processEvent(akka.actor.FSM.Event,java.lang.Object)), [processMsg](../../actor/FSM.html#processMsg(java.lang.Object,java.lang.Object)), [receive](../../actor/FSM.html#receive()), [register](../../actor/FSM.html#register(S,scala.PartialFunction,scala.Option)), [setStateTimeout](../../actor/FSM.html#setStateTimeout(S,scala.Option)), [setTimer](../../actor/FSM.html#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,boolean)), [setTimer$default$4](../../actor/FSM.html#setTimer$default$4()), [startSingleTimer](../../actor/FSM.html#startSingleTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimer](../../actor/FSM.html#startTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,akka.actor.FSM.TimerMode)), [startTimerAtFixedRate](../../actor/FSM.html#startTimerAtFixedRate(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimerWithFixedDelay](../../actor/FSM.html#startTimerWithFixedDelay(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startWith](../../actor/FSM.html#startWith(S,D,scala.Option)), [startWith$default$3](../../actor/FSM.html#startWith$default$3()), [stateData](../../actor/FSM.html#stateData()), [stateName](../../actor/FSM.html#stateName()), [stay](../../actor/FSM.html#stay()), [stop](../../actor/FSM.html#stop()), [stop](../../actor/FSM.html#stop(akka.actor.FSM.Reason)), [stop](../../actor/FSM.html#stop(akka.actor.FSM.Reason,D)), [super$postStop](../../actor/FSM.html#super$postStop()), [terminate](../../actor/FSM.html#terminate(akka.actor.FSM.State)), [terminateEvent_$eq](../../actor/FSM.html#terminateEvent_$eq(scala.PartialFunction)), [timeoutFuture_$eq](../../actor/FSM.html#timeoutFuture_$eq(scala.Option)), [total2pf](../../actor/FSM.html#total2pf(scala.Function2)), [transform](../../actor/FSM.html#transform(scala.PartialFunction)), [transitionEvent_$eq](../../actor/FSM.html#transitionEvent_$eq(scala.collection.immutable.List)), [when](../../actor/FSM.html#when(S,scala.concurrent.duration.FiniteDuration,scala.PartialFunction)), [when$default$2](../../actor/FSM.html#when$default$2()), [whenUnhandled](../../actor/FSM.html#whenUnhandled(scala.PartialFunction))`
		- ### Methods inherited from interface akka.routing.[Listeners](../../routing/Listeners.html "interface in akka.routing")
		
		
		`[gossip](../../routing/Listeners.html#gossip(java.lang.Object,akka.actor.ActorRef)), [gossip$default$2](../../routing/Listeners.html#gossip$default$2(java.lang.Object)), [listenerManagement](../../routing/Listeners.html#listenerManagement())`

- - ### Constructor Detail
	
	
	
		- #### ClusterSingletonManager
		
		
		
		```
		public ClusterSingletonManager​([Props](../../actor/Props.html "class in akka.actor") singletonProps,
		                               java.lang.Object terminationMessage,
		                               [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.singleton") settings)
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public static [Props](../../actor/Props.html "class in akka.actor") props​([Props](../../actor/Props.html "class in akka.actor") singletonProps,
		                          java.lang.Object terminationMessage,
		                          [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.singleton") settings)
		```
		
		Scala API: Factory method for `ClusterSingletonManager` [`Props`](../../actor/Props.html "class in akka.actor").
		- #### Event
		
		
		
		```
		public [FSM.Event$](../../actor/FSM.Event$.html "class in akka.actor") Event()
		```
		
		
		Specified by:
		`[Event](../../actor/FSM.html#Event())` in interface `[FSM](../../actor/FSM.html "interface in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>`
		- #### StopEvent
		
		
		
		```
		public [FSM.StopEvent$](../../actor/FSM.StopEvent$.html "class in akka.actor") StopEvent()
		```
		
		
		Specified by:
		`[StopEvent](../../actor/FSM.html#StopEvent())` in interface `[FSM](../../actor/FSM.html "interface in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>`
		- #### $minus$greater
		
		
		
		```
		public [FSM.$minus$greater$](../../actor/FSM.$minus$greater$.html "class in akka.actor") $minus$greater()
		```
		
		Description copied from interface: `[FSM](../../actor/FSM.html#$minus$greater())`
		This extractor is just convenience for matching a (S, S) pair, including a
		 reminder what the new state is.
		
		Specified by:
		`[$minus$greater](../../actor/FSM.html#$minus$greater())` in interface `[FSM](../../actor/FSM.html "interface in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>`
		- #### StateTimeout
		
		
		
		```
		public [FSM.StateTimeout$](../../actor/FSM.StateTimeout$.html "class in akka.actor") StateTimeout()
		```
		
		Description copied from interface: `[FSM](../../actor/FSM.html#StateTimeout())`
		This case object is received in case of a state timeout.
		
		Specified by:
		`[StateTimeout](../../actor/FSM.html#StateTimeout())` in interface `[FSM](../../actor/FSM.html "interface in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>`
		- #### akka$actor$FSM$\_setter\_$Event\_$eq
		
		
		
		```
		protected void akka$actor$FSM$_setter_$Event_$eq​([FSM.Event$](../../actor/FSM.Event$.html "class in akka.actor") x$1)
		```
		
		
		Specified by:
		`[akka$actor$FSM$_setter_$Event_$eq](../../actor/FSM.html#akka$actor$FSM$_setter_$Event_$eq(akka.actor.FSM.Event$))` in interface `[FSM](../../actor/FSM.html "interface in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>`
		- #### akka$actor$FSM$\_setter\_$StopEvent\_$eq
		
		
		
		```
		protected void akka$actor$FSM$_setter_$StopEvent_$eq​([FSM.StopEvent$](../../actor/FSM.StopEvent$.html "class in akka.actor") x$1)
		```
		
		
		Specified by:
		`[akka$actor$FSM$_setter_$StopEvent_$eq](../../actor/FSM.html#akka$actor$FSM$_setter_$StopEvent_$eq(akka.actor.FSM.StopEvent$))` in interface `[FSM](../../actor/FSM.html "interface in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>`
		- #### akka$actor$FSM$\_setter\_$StateTimeout\_$eq
		
		
		
		```
		protected void akka$actor$FSM$_setter_$StateTimeout_$eq​([FSM.StateTimeout$](../../actor/FSM.StateTimeout$.html "class in akka.actor") x$1)
		```
		
		Description copied from interface: `[FSM](../../actor/FSM.html#akka$actor$FSM$_setter_$StateTimeout_$eq(akka.actor.FSM.StateTimeout$))`
		This case object is received in case of a state timeout.
		
		Specified by:
		`[akka$actor$FSM$_setter_$StateTimeout_$eq](../../actor/FSM.html#akka$actor$FSM$_setter_$StateTimeout_$eq(akka.actor.FSM.StateTimeout$))` in interface `[FSM](../../actor/FSM.html "interface in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>`
		- #### listeners
		
		
		
		```
		protected java.util.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> listeners()
		```
		
		
		Specified by:
		`[listeners](../../routing/Listeners.html#listeners())` in interface `[Listeners](../../routing/Listeners.html "interface in akka.routing")`
		- #### akka$routing$Listeners$\_setter\_$listeners\_$eq
		
		
		
		```
		protected void akka$routing$Listeners$_setter_$listeners_$eq​(java.util.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)
		```
		
		
		Specified by:
		`[akka$routing$Listeners$_setter_$listeners_$eq](../../routing/Listeners.html#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set))` in interface `[Listeners](../../routing/Listeners.html "interface in akka.routing")`
		- #### context
		
		
		
		```
		public [ActorContext](../../actor/ActorContext.html "interface in akka.actor") context()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#context())`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[context](../../actor/Actor.html#context())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### self
		
		
		
		```
		public final [ActorRef](../../actor/ActorRef.html "class in akka.actor") self()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](../../actor/Actor.html#self())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		protected final void akka$actor$Actor$_setter_$self_$eq​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### cluster
		
		
		
		```
		public [Cluster](../Cluster.html "class in akka.cluster") cluster()
		```
		- #### selfUniqueAddressOption
		
		
		
		```
		public scala.Some<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> selfUniqueAddressOption()
		```
		- #### log
		
		
		
		```
		public [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log()
		```
		
		
		Specified by:
		`[log](../../actor/ActorLogging.html#log())` in interface `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`
		- #### lease
		
		
		
		```
		public scala.Option<[Lease](../../coordination/lease/scaladsl/Lease.html "class in akka.coordination.lease.scaladsl")> lease()
		```
		- #### leaseRetryInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration leaseRetryInterval()
		```
		- #### removalMargin
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration removalMargin()
		```
		- #### maxHandOverRetries
		
		
		
		```
		public int maxHandOverRetries()
		```
		- #### maxTakeOverRetries
		
		
		
		```
		public int maxTakeOverRetries()
		```
		- #### oldestChangedBuffer
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") oldestChangedBuffer()
		```
		- #### oldestChangedBuffer\_$eq
		
		
		
		```
		public void oldestChangedBuffer_$eq​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		- #### oldestChangedReceived
		
		
		
		```
		public boolean oldestChangedReceived()
		```
		- #### oldestChangedReceived\_$eq
		
		
		
		```
		public void oldestChangedReceived_$eq​(boolean x$1)
		```
		- #### preparingForFullShutdown
		
		
		
		```
		public boolean preparingForFullShutdown()
		```
		- #### preparingForFullShutdown\_$eq
		
		
		
		```
		public void preparingForFullShutdown_$eq​(boolean x$1)
		```
		- #### selfExited
		
		
		
		```
		public boolean selfExited()
		```
		- #### selfExited\_$eq
		
		
		
		```
		public void selfExited_$eq​(boolean x$1)
		```
		- #### removed
		
		
		
		```
		public scala.collection.immutable.Map<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​scala.concurrent.duration.Deadline> removed()
		```
		- #### removed\_$eq
		
		
		
		```
		public void removed_$eq​(scala.collection.immutable.Map<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​scala.concurrent.duration.Deadline> x$1)
		```
		- #### addRemoved
		
		
		
		```
		public void addRemoved​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") node)
		```
		- #### cleanupOverdueNotMemberAnyMore
		
		
		
		```
		public void cleanupOverdueNotMemberAnyMore()
		```
		- #### coordShutdown
		
		
		
		```
		public [CoordinatedShutdown](../../actor/CoordinatedShutdown.html "class in akka.actor") coordShutdown()
		```
		- #### memberExitingProgress
		
		
		
		```
		public scala.concurrent.Promise<[Done](../../Done.html "class in akka")> memberExitingProgress()
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​(java.lang.String message)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​([LogMarker](../../event/LogMarker.html "class in akka.event") marker,
		                    java.lang.String message)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​(java.lang.String template,
		                    java.lang.Object arg1)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​([LogMarker](../../event/LogMarker.html "class in akka.event") marker,
		                    java.lang.String template,
		                    java.lang.Object arg1)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​(java.lang.String template,
		                    java.lang.Object arg1,
		                    java.lang.Object arg2)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​([LogMarker](../../event/LogMarker.html "class in akka.event") marker,
		                    java.lang.String template,
		                    java.lang.Object arg1,
		                    java.lang.Object arg2)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​(java.lang.String template,
		                    java.lang.Object arg1,
		                    java.lang.Object arg2,
		                    java.lang.Object arg3)
		```
		- #### preStart
		
		
		
		```
		public void preStart()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#preStart())`
		User overridable callback.
		 
		 Is called when an Actor is started.
		 Actors are automatically started asynchronously when created.
		 Empty default implementation.
		
		Specified by:
		`[preStart](../../actor/Actor.html#preStart())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### postStop
		
		
		
		```
		public void postStop()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#postStop())`
		User overridable callback.
		 
		 Is called asynchronously after 'actor.stop()' is invoked.
		 Empty default implementation.
		
		Specified by:
		`[postStop](../../actor/Actor.html#postStop())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		Specified by:
		`[postStop](../../actor/FSM.html#postStop())` in interface `[FSM](../../actor/FSM.html "interface in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")>`
		- #### peer
		
		
		
		```
		public [ActorSelection](../../actor/ActorSelection.html "class in akka.actor") peer​([Address](../../actor/Address.html "class in akka.actor") at)
		```
		- #### getNextOldestChanged
		
		
		
		```
		public void getNextOldestChanged()
		```
		- #### handleMemberEvent
		
		
		
		```
		public [FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")> handleMemberEvent​([ClusterEvent.MemberEvent](../ClusterEvent.MemberEvent.html "interface in akka.cluster") event)
		```
		- #### scheduleDelayedMemberRemoved
		
		
		
		```
		public void scheduleDelayedMemberRemoved​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### tryAcquireLease
		
		
		
		```
		public [FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")> tryAcquireLease()
		```
		- #### tryGotoOldest
		
		
		
		```
		public [FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")> tryGotoOldest()
		```
		- #### gotoOldest
		
		
		
		```
		public [FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")> gotoOldest()
		```
		- #### handleOldestChanged
		
		
		
		```
		public [FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")> handleOldestChanged​(scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> singleton,
		                                                                                                       scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> oldestOption)
		```
		- #### gotoHandingOver
		
		
		
		```
		public [FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")> gotoHandingOver​(scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> singleton,
		                                                                                                   scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> handOverTo)
		```
		- #### handOverDone
		
		
		
		```
		public [FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")> handOverDone​(scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> handOverTo)
		```
		- #### gotoStopping
		
		
		
		```
		public [FSM.State](../../actor/FSM.State.html "class in akka.actor")<[ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton"),​[ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton")> gotoStopping​([ActorRef](../../actor/ActorRef.html "class in akka.actor") singleton)
		```
		- #### selfMemberExited
		
		
		
		```
		public void selfMemberExited()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.$minus$greater$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.CurrentState$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.CurrentState.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.Event$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.Event.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.Failure$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.Failure.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.FixedDelayMode$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.FixedRateMode$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.LogEntry$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.LogEntry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.Normal$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.NullFunction$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.Reason.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.Shutdown$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.SilentState.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.SingleMode$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.State$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.State.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.StateTimeout$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.StopEvent$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.StopEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.SubscribeTransitionCallBack$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.SubscribeTransitionCallBack.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.Timer$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.Timer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.TimerMode.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.TransformHelper.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.Transition$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.Transition.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.UnsubscribeTransitionCallBack$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.UnsubscribeTransitionCallBack.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.MemberEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.html)*