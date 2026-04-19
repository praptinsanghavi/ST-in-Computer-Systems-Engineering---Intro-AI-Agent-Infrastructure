---
description: Akka 2.6.21 - akka.persistence.fsm.PersistentFSMBase
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:22:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/fsm/PersistentFSMBase.html
title: Akka 2.6.21 - akka.persistence.fsm.PersistentFSMBase
---

# Akka 2.6.21 - akka.persistence.fsm.PersistentFSMBase

> **Summary:** Akka 2.6.21 - akka.persistence.fsm.PersistentFSMBase

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/fsm/index.html "Permalink")  package [fsm](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/fsm/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[fsm](index.html)
- [AbstractPersistentFSM](AbstractPersistentFSM.html "Java API: compatible with lambda expressions")
- [AbstractPersistentFSMBase](AbstractPersistentFSMBase.html "Java API: compatible with lambda expressions")
- [AbstractPersistentLoggingFSM](AbstractPersistentLoggingFSM.html "Java API: compatible with lambda expressions")
- [LoggingPersistentFSM](LoggingPersistentFSM.html "Stackable trait for akka.actor.FSM which adds a rolling event log and debug logging capabilities (analogous to akka.event.LoggingReceive).")
- [PersistentFSM](PersistentFSM.html "A FSM implementation with persistent state.")
- PersistentFSMBase
t[akka](../../index.html).[persistence](../index.html).[fsm](index.html)

# PersistentFSMBase[**](../../../akka/persistence/fsm/PersistentFSMBase.html "Permalink")

### 

#### trait PersistentFSMBase\[S, D, E] extends [Actor](../../actor/Actor.html) with [Listeners](../../routing/Listeners.html) with [ActorLogging](../../actor/ActorLogging.html)

Finite State Machine actor trait. Use as follows:

```

  object A {
    trait State
    case class One extends State
    case class Two extends State

    case class Data(i : Int)
  }

  class A extends Actor with FSM[A.State, A.Data] {
    import A._

    startWith(One, Data(42))
    when(One) {
        case Event(SomeMsg, Data(x)) => ...
        case Event(SomeOtherMsg, _) => ... // convenience when data not needed
    }
    when(Two, stateTimeout = 5 seconds) { ... }
    initialize()
  }

```
Within the partial function the following values are returned for effecting
state transitions:

- `stay` for staying in the same state
- `stay using Data(...)` for staying in the same state, but with
 different data
- `stay forMax 5.millis` for staying with a state timeout; can be
 combined with `using`
- `goto(...)` for changing into a different state; also supports
 `using` and `forMax`
- `stop` for terminating this FSM actor

Each of the above also supports the method `replying(AnyRef)` for
sending a reply before changing state.

While changing state, custom handlers may be invoked which are registered
using `onTransition`. This is meant to enable concentrating
different concerns in different places; you may choose to use
`when` for describing the properties of a state, including of
course initiating transitions, but you can describe the transitions using
`onTransition` to avoid having to duplicate that code among
multiple paths which lead to a transition:

```

onTransition {
  case Active -> _ => cancelTimer("activeTimer")
}

```
Multiple such blocks are supported and all of them will be called, not only
the first matching one.

Another feature is that other actors may subscribe for transition events by
sending a `SubscribeTransitionCallback` message to this actor.
Stopping a listener without unregistering will not remove the listener from the
subscription list; use `UnsubscribeTransitionCallback` before stopping
the listener.

State timeouts set an upper bound to the time which may pass before another
message is received in the current state. If no external message is
available, then upon expiry of the timeout a StateTimeout message is sent.
Note that this message will only be received in the state for which the
timeout was set and that any message received will cancel the timeout
(possibly to be started again by the next transition).

Another feature is the ability to install and cancel single\-shot as well as
repeated timers which arrange for the sending of a user\-specified message:

```

  startTimerWithFixedDelay("tock", TockMsg, 1 second) // repeating
  startSingleTimer("lifetime", TerminateMsg, 1 hour) // single-shot
  cancelTimer("tock")
  isTimerActive("tock")

```
Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use EventSourcedBehavior

Source[PersistentFSMBase.scala](https://github.com/akka/akka/tree/v2.6.21//akka-persistence/src/main/scala/akka/persistence/fsm/PersistentFSMBase.scala#L100)Linear Supertypes[ActorLogging](../../actor/ActorLogging.html), [Listeners](../../routing/Listeners.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Known Subclasses[AbstractPersistentFSM](AbstractPersistentFSM.html), [AbstractPersistentFSMBase](AbstractPersistentFSMBase.html), [AbstractPersistentLoggingFSM](AbstractPersistentLoggingFSM.html), [LoggingPersistentFSM](LoggingPersistentFSM.html), [PersistentFSM](PersistentFSM.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistentFSMBase
2. ActorLogging
3. Listeners
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
### Type Members

1. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#Event=akka.persistence.fsm.PersistentFSM.Event[D] "Permalink")  type Event \= [PersistentFSM.Event](PersistentFSM$$Event.html)\[D]
2. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
3. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#State=akka.persistence.fsm.PersistentFSM.State[S,D,E] "Permalink")  type State \= [PersistentFSM.State](PersistentFSM$$State.html)\[S, D, E]
4. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#StateFunction=PartialFunction[PersistentFSMBase.this.Event,PersistentFSMBase.this.State] "Permalink")  type StateFunction \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Event](#Event=akka.persistence.fsm.PersistentFSM.Event[D]), [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])]
5. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#StopEvent=akka.persistence.fsm.PersistentFSM.StopEvent[S,D] "Permalink")  type StopEvent \= [PersistentFSM.StopEvent](PersistentFSM$$StopEvent.html)\[S, D]
6. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#Timeout=Option[scala.concurrent.duration.FiniteDuration] "Permalink")  type Timeout \= [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]
7. [**](../../../akka/persistence/fsm/PersistentFSMBase$TransformHelper.html "Permalink") final  class [TransformHelper](PersistentFSMBase$TransformHelper.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)
8. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#TransitionHandler=PartialFunction[(S,S),Unit] "Permalink")  type TransitionHandler \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[(S, S), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]
### Value Members

1. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/fsm/PersistentFSMBase.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistentFSMBase\[S, D, E] toany2stringadd\[PersistentFSMBase\[S, D, E]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#->:akka.persistence.fsm.PersistentFSM.->.type "Permalink")  val \-\>: [PersistentFSM.\-\>](PersistentFSM$$$minus$greater$.html).typeThis extractor is just convenience for matching a (S, S) pair, including a
reminder what the new state is.
5. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#Event:akka.persistence.fsm.PersistentFSM.Event.type "Permalink")  val Event: PersistentFSM.Event.type
7. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#StateTimeout:akka.persistence.fsm.PersistentFSM.StateTimeout.type "Permalink")  val StateTimeout: [PersistentFSM.StateTimeout](PersistentFSM$$StateTimeout$.html).typeThis case object is received in case of a state timeout.
8. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#StopEvent:akka.persistence.fsm.PersistentFSM.StopEvent.type "Permalink")  val StopEvent: PersistentFSM.StopEvent.type
9. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
12. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
13. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
14. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
15. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#cancelTimer(name:String):Unit "Permalink") final  def cancelTimer(name: String): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Cancel named timer, ensuring that the message is not subsequently delivered (no race).

Cancel named timer, ensuring that the message is not subsequently delivered (no race).

nameof the timer to cancel
16. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
17. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
18. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistentFSMBase\[S, D, E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): PersistentFSMBase\[S, D, E]ImplicitThis member is added by an implicit conversion from PersistentFSMBase\[S, D, E] toEnsuring\[PersistentFSMBase\[S, D, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistentFSMBase\[S, D, E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): PersistentFSMBase\[S, D, E]ImplicitThis member is added by an implicit conversion from PersistentFSMBase\[S, D, E] toEnsuring\[PersistentFSMBase\[S, D, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): PersistentFSMBase\[S, D, E]ImplicitThis member is added by an implicit conversion from PersistentFSMBase\[S, D, E] toEnsuring\[PersistentFSMBase\[S, D, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): PersistentFSMBase\[S, D, E]ImplicitThis member is added by an implicit conversion from PersistentFSMBase\[S, D, E] toEnsuring\[PersistentFSMBase\[S, D, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
24. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
25. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#gossip(msg:Any)(implicitsender:akka.actor.ActorRef):Unit "Permalink")  def gossip(msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any))(implicit sender: [ActorRef](../../actor/ActorRef.html) \= [Actor.noSender](../../index.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Sends the supplied message to all current listeners using the provided sender() as sender.

Sends the supplied message to all current listeners using the provided sender() as sender.

Attributesprotected Definition Classes[Listeners](../../routing/Listeners.html)
26. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#goto(nextStateName:S):PersistentFSMBase.this.State "Permalink") final  def goto(nextStateName: S): [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])Produce transition to other state.

Produce transition to other state.
Return this from a state function in order to effect the transition.

This method always triggers transition events, even for `A -> A` transitions.
If you want to stay in the same state without triggering an state transition event use [\#stay](#stay():PersistentFSMBase.this.State) instead.

nextStateNamestate designator for the next state

returnsstate transition descriptor
27. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
28. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
29. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#isTimerActive(name:String):Boolean "Permalink") final  def isTimerActive(name: String): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Inquire whether the named timer is still active.

Inquire whether the named timer is still active. Returns true unless the
timer does not exist, has previously been canceled or if it was a
single\-shot timer whose message was already received.
30. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#listenerManagement:akka.actor.Actor.Receive "Permalink")  def listenerManagement: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Chain this into the receive function.

Chain this into the receive function.

```
def receive = listenerManagement orElse …
```
Attributesprotected Definition Classes[Listeners](../../routing/Listeners.html)
31. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#listeners:java.util.Set[akka.actor.ActorRef] "Permalink")  val listeners: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ActorRef](../../actor/ActorRef.html)]Attributesprotected Definition Classes[Listeners](../../routing/Listeners.html)
32. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../event/LoggingAdapter.html)Definition Classes[ActorLogging](../../actor/ActorLogging.html)
33. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#logTermination(reason:akka.persistence.fsm.PersistentFSM.Reason):Unit "Permalink")  def logTermination(reason: [Reason](PersistentFSM$$Reason.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)By default [PersistentFSM.Failure](PersistentFSM$$Failure.html) is logged at error level and other reason
types are not logged.

By default [PersistentFSM.Failure](PersistentFSM$$Failure.html) is logged at error level and other reason
types are not logged. It is possible to override this behavior.

Attributesprotected
34. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
35. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#nextStateData:D "Permalink") final  def nextStateData: DReturn next state data (available in onTransition handlers)
36. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
37. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
38. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#onTermination(terminationHandler:PartialFunction[PersistentFSMBase.this.StopEvent,Unit]):Unit "Permalink") final  def onTermination(terminationHandler: [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[StopEvent](#StopEvent=akka.persistence.fsm.PersistentFSM.StopEvent[S,D]), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set handler which is called upon termination of this FSM actor.

Set handler which is called upon termination of this FSM actor. Calling
this method again will overwrite the previous contents.
39. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#onTransition(transitionHandler:PersistentFSMBase.this.TransitionHandler):Unit "Permalink") final  def onTransition(transitionHandler: [TransitionHandler](#TransitionHandler=PartialFunction[(S,S),Unit])): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set handler which is called upon each state transition, i.e.

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
40. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
41. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Call `onTermination` hook; if you want to retain this behavior when
overriding make sure to call `super.postStop()`.

Call `onTermination` hook; if you want to retain this behavior when
overriding make sure to call `super.postStop()`.

Please note that this method is called by default from `preRestart()`,
so override that one if `onTermination` shall not be called during
restart.

Definition ClassesPersistentFSMBase → [Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
42. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
43. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
44. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#receive:PersistentFSMBase.this.Receive "Permalink")  def receive: [Receive](#Receive=akka.actor.Actor.Receive)Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesPersistentFSMBase → [Actor](../../actor/Actor.html)
45. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
46. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
47. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#setStateTimeout(state:S,timeout:PersistentFSMBase.this.Timeout):Unit "Permalink") final  def setStateTimeout(state: S, timeout: [Timeout](#Timeout=Option[scala.concurrent.duration.FiniteDuration])): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set state timeout explicitly.

Set state timeout explicitly. This method can safely be used from within a
state handler.
48. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#startSingleTimer(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startSingleTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.
49. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#startTimerAtFixedRate(name:String,msg:Any,interval:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerAtFixedRate(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
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
50. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#startTimerWithFixedDelay(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerWithFixedDelay(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
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
51. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#startWith(stateName:S,stateData:D,timeout:PersistentFSMBase.this.Timeout):Unit "Permalink") final  def startWith(stateName: S, stateData: D, timeout: [Timeout](#Timeout=Option[scala.concurrent.duration.FiniteDuration]) \= None): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set initial state.

Set initial state. Call this method from the constructor before the \#initialize method.
If different state is needed after a restart this method, followed by \#initialize, can
be used in the actor life cycle hooks [akka.actor.Actor\#preStart](../../actor/Actor.html#preStart():Unit) and [akka.actor.Actor\#postRestart](../../actor/Actor.html#postRestart(reason:Throwable):Unit).

stateNameinitial state designator

stateDatainitial state data

timeoutstate timeout for the initial state, overriding the default timeout for that state
52. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#stateData:D "Permalink") final  def stateData: DReturn current state data (i.e.

Return current state data (i.e. object of type D)
53. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#stateName:S "Permalink") final  def stateName: SReturn current state name (i.e.

Return current state name (i.e. object of type S)
54. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#stay():PersistentFSMBase.this.State "Permalink") final  def stay(): [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])Produce "empty" transition descriptor.

Produce "empty" transition descriptor.
Return this from a state function when no state change is to be effected.

No transition event will be triggered by [\#stay](#stay():PersistentFSMBase.this.State).
If you want to trigger an event like `S -> S` for `onTransition` to handle use `goto` instead.

returnsdescriptor for staying in current state
55. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#stop(reason:akka.persistence.fsm.PersistentFSM.Reason,stateData:D):PersistentFSMBase.this.State "Permalink") final  def stop(reason: [Reason](PersistentFSM$$Reason.html), stateData: D): [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])Produce change descriptor to stop this FSM actor including specified reason.
56. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#stop(reason:akka.persistence.fsm.PersistentFSM.Reason):PersistentFSMBase.this.State "Permalink") final  def stop(reason: [Reason](PersistentFSM$$Reason.html)): [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])Produce change descriptor to stop this FSM actor including specified reason.
57. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#stop():PersistentFSMBase.this.State "Permalink") final  def stop(): [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])Produce change descriptor to stop this FSM actor with reason "Normal".
58. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
59. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
60. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
61. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#total2pf(transitionHandler:(S,S)=>Unit):PersistentFSMBase.this.TransitionHandler "Permalink") implicit final  def total2pf(transitionHandler: (S, S) \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)): [TransitionHandler](#TransitionHandler=PartialFunction[(S,S),Unit])Convenience wrapper for using a total function instead of a partial
function literal.

Convenience wrapper for using a total function instead of a partial
function literal. To be used with onTransition.
62. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#transform(func:PersistentFSMBase.this.StateFunction):PersistentFSMBase.this.TransformHelper "Permalink") final  def transform(func: [StateFunction](#StateFunction=PartialFunction[PersistentFSMBase.this.Event,PersistentFSMBase.this.State])): [TransformHelper](PersistentFSMBase$TransformHelper.html)
63. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
64. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
65. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
66. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
67. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#when(stateName:S,stateTimeout:scala.concurrent.duration.FiniteDuration)(stateFunction:PersistentFSMBase.this.StateFunction):Unit "Permalink") final  def when(stateName: S, stateTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration) \= null)(stateFunction: [StateFunction](#StateFunction=PartialFunction[PersistentFSMBase.this.Event,PersistentFSMBase.this.State])): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Insert a new StateFunction at the end of the processing chain for the
given state.

Insert a new StateFunction at the end of the processing chain for the
given state. If the stateTimeout parameter is set, entering this state
without a differing explicit timeout setting will trigger a StateTimeout
event; the same is true when using \#stay.

stateNamedesignator for the state

stateTimeoutdefault state timeout for this state

stateFunctionpartial function describing response to input
68. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#whenUnhandled(stateFunction:PersistentFSMBase.this.StateFunction):Unit "Permalink") final  def whenUnhandled(stateFunction: [StateFunction](#StateFunction=PartialFunction[PersistentFSMBase.this.Event,PersistentFSMBase.this.State])): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set handler which is called upon reception of unhandled messages.

Set handler which is called upon reception of unhandled messages. Calling
this method again will overwrite the previous contents.

The current state may be queried using `stateName`.
### Shadowed Implicit Value Members

1. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistentFSMBase\[S, D, E], B)ImplicitThis member is added by an implicit conversion from PersistentFSMBase\[S, D, E] toArrowAssoc\[PersistentFSMBase\[S, D, E]] performed by method ArrowAssoc in scala.Predef.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(persistentFSMBase: ArrowAssoc[PersistentFSMBase[S, D, E]]).->(y)
```
Definition ClassesArrowAssocAnnotations@inline()
### Deprecated Value Members

1. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistentFSMBase\[S, D, E] toStringFormat\[PersistentFSMBase\[S, D, E]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#setTimer(name:String,msg:Any,timeout:scala.concurrent.duration.FiniteDuration,repeat:Boolean):Unit "Permalink") final  def setTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), repeat: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean) \= false): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Schedule named timer to deliver message after given delay, possibly repeating.

Schedule named timer to deliver message after given delay, possibly repeating.
Any existing timer with the same name will automatically be canceled before
adding the new timer.

nameidentifier to be used with cancelTimer()

msgmessage to be delivered

timeoutdelay of first message delivery and between subsequent messages

repeatsend once if false, scheduleAtFixedRate if true

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use startSingleTimer, startTimerWithFixedDelay or startTimerAtFixedRate instead. This has the same semantics as startTimerAtFixedRate, but startTimerWithFixedDelay is often preferred.
4. [**](../../../akka/persistence/fsm/PersistentFSMBase.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistentFSMBase\[S, D, E], B)ImplicitThis member is added by an implicit conversion from PersistentFSMBase\[S, D, E] toArrowAssoc\[PersistentFSMBase\[S, D, E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ActorLogging](../../actor/ActorLogging.html)

### Inherited from [Listeners](../../routing/Listeners.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistentFSMBase\[S, D, E] to any2stringadd\[PersistentFSMBase\[S, D, E]]

### Inherited by implicit conversion StringFormat fromPersistentFSMBase\[S, D, E] to StringFormat\[PersistentFSMBase\[S, D, E]]

### Inherited by implicit conversion Ensuring fromPersistentFSMBase\[S, D, E] to Ensuring\[PersistentFSMBase\[S, D, E]]

### Inherited by implicit conversion ArrowAssoc fromPersistentFSMBase\[S, D, E] to ArrowAssoc\[PersistentFSMBase\[S, D, E]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSMBase$.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSMBase.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/LoggingPersistentFSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$$minus$greater$.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$Event.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$Failure.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$Reason.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$State.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$StateTimeout$.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$StopEvent.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase$TransformHelper.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/japi/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/routing/Listeners.html
- https://doc.akka.io/api/akka-core/2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase.html](https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase.html)*