---
description: Akka 2.6.21 - akka.persistence.fsm.LoggingPersistentFSM
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:22:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/fsm/LoggingPersistentFSM.html
title: Akka 2.6.21 - akka.persistence.fsm.LoggingPersistentFSM
---

# Akka 2.6.21 - akka.persistence.fsm.LoggingPersistentFSM

> **Summary:** Akka 2.6.21 - akka.persistence.fsm.LoggingPersistentFSM

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
- LoggingPersistentFSM
- [PersistentFSM](PersistentFSM.html "A FSM implementation with persistent state.")
- [PersistentFSMBase](PersistentFSMBase.html "Finite State Machine actor trait.")
t[akka](../../index.html).[persistence](../index.html).[fsm](index.html)

# LoggingPersistentFSM[**](../../../akka/persistence/fsm/LoggingPersistentFSM.html "Permalink")

### 

#### trait LoggingPersistentFSM\[S, D, E] extends [PersistentFSMBase](PersistentFSMBase.html)\[S, D, E]

Stackable trait for [akka.actor.FSM](../../actor/FSM.html) which adds a rolling event log and
debug logging capabilities (analogous to [akka.event.LoggingReceive](../../event/LoggingReceive.html)).

Self TypeLoggingPersistentFSM\[S, D, E] with [Actor](../../actor/Actor.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use EventSourcedBehavior

Source[PersistentFSMBase.scala](https://github.com/akka/akka/tree/v2.6.21//akka-persistence/src/main/scala/akka/persistence/fsm/PersistentFSMBase.scala#L633)Linear Supertypes[PersistentFSMBase](PersistentFSMBase.html)\[S, D, E], [ActorLogging](../../actor/ActorLogging.html), [Listeners](../../routing/Listeners.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Known Subclasses[AbstractPersistentLoggingFSM](AbstractPersistentLoggingFSM.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LoggingPersistentFSM
2. PersistentFSMBase
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
### Type Members

1. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#Event=akka.persistence.fsm.PersistentFSM.Event[D] "Permalink")  type Event \= [PersistentFSM.Event](PersistentFSM$$Event.html)\[D]Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
2. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
3. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#State=akka.persistence.fsm.PersistentFSM.State[S,D,E] "Permalink")  type State \= [PersistentFSM.State](PersistentFSM$$State.html)\[S, D, E]Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
4. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#StateFunction=PartialFunction[PersistentFSMBase.this.Event,PersistentFSMBase.this.State] "Permalink")  type StateFunction \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[(LoggingPersistentFSM.this)\#Event, (LoggingPersistentFSM.this)\#State]Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
5. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#StopEvent=akka.persistence.fsm.PersistentFSM.StopEvent[S,D] "Permalink")  type StopEvent \= [PersistentFSM.StopEvent](PersistentFSM$$StopEvent.html)\[S, D]Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
6. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#Timeout=Option[scala.concurrent.duration.FiniteDuration] "Permalink")  type Timeout \= [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
7. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#TransitionHandler=PartialFunction[(S,S),Unit] "Permalink")  type TransitionHandler \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[(S, S), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
8. [**](../../../akka/persistence/fsm/PersistentFSMBase$TransformHelper.html "Permalink") final  class [TransformHelper](PersistentFSMBase$TransformHelper.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
### Value Members

1. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LoggingPersistentFSM\[S, D, E] toany2stringadd\[LoggingPersistentFSM\[S, D, E]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#->:akka.persistence.fsm.PersistentFSM.->.type "Permalink")  val \-\>: [PersistentFSM.\-\>](PersistentFSM$$$minus$greater$.html).typeThis extractor is just convenience for matching a (S, S) pair, including a
reminder what the new state is.

This extractor is just convenience for matching a (S, S) pair, including a
reminder what the new state is.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
5. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#Event:akka.persistence.fsm.PersistentFSM.Event.type "Permalink")  val Event: PersistentFSM.Event.typeDefinition Classes[PersistentFSMBase](PersistentFSMBase.html)
7. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#StateTimeout:akka.persistence.fsm.PersistentFSM.StateTimeout.type "Permalink")  val StateTimeout: [PersistentFSM.StateTimeout](PersistentFSM$$StateTimeout$.html).typeThis case object is received in case of a state timeout.

This case object is received in case of a state timeout.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
8. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#StopEvent:akka.persistence.fsm.PersistentFSM.StopEvent.type "Permalink")  val StopEvent: PersistentFSM.StopEvent.typeDefinition Classes[PersistentFSMBase](PersistentFSMBase.html)
9. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
12. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
13. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
14. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
15. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#cancelTimer(name:String):Unit "Permalink") final  def cancelTimer(name: String): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Cancel named timer, ensuring that the message is not subsequently delivered (no race).

Cancel named timer, ensuring that the message is not subsequently delivered (no race).

nameof the timer to cancel

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
16. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
17. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
18. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LoggingPersistentFSM\[S, D, E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): LoggingPersistentFSM\[S, D, E]ImplicitThis member is added by an implicit conversion from LoggingPersistentFSM\[S, D, E] toEnsuring\[LoggingPersistentFSM\[S, D, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LoggingPersistentFSM\[S, D, E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): LoggingPersistentFSM\[S, D, E]ImplicitThis member is added by an implicit conversion from LoggingPersistentFSM\[S, D, E] toEnsuring\[LoggingPersistentFSM\[S, D, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): LoggingPersistentFSM\[S, D, E]ImplicitThis member is added by an implicit conversion from LoggingPersistentFSM\[S, D, E] toEnsuring\[LoggingPersistentFSM\[S, D, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): LoggingPersistentFSM\[S, D, E]ImplicitThis member is added by an implicit conversion from LoggingPersistentFSM\[S, D, E] toEnsuring\[LoggingPersistentFSM\[S, D, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
24. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
25. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#getLog:IndexedSeq[akka.persistence.fsm.PersistentFSM.LogEntry[S,D]] "Permalink")  def getLog: IndexedSeq\[[LogEntry](PersistentFSM$$LogEntry.html)\[S, D]]Retrieve current rolling log in oldest\-first order.

Retrieve current rolling log in oldest\-first order. The log is filled with
each incoming event before processing by the user supplied state handler.
The log entries are lost when this actor is restarted.

Attributesprotected
26. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#gossip(msg:Any)(implicitsender:akka.actor.ActorRef):Unit "Permalink")  def gossip(msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any))(implicit sender: [ActorRef](../../actor/ActorRef.html) \= [Actor.noSender](../../index.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Sends the supplied message to all current listeners using the provided sender() as sender.

Sends the supplied message to all current listeners using the provided sender() as sender.

Attributesprotected Definition Classes[Listeners](../../routing/Listeners.html)
27. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#goto(nextStateName:S):PersistentFSMBase.this.State "Permalink") final  def goto(nextStateName: S): (LoggingPersistentFSM.this)\#StateProduce transition to other state.

Produce transition to other state.
Return this from a state function in order to effect the transition.

This method always triggers transition events, even for `A -> A` transitions.
If you want to stay in the same state without triggering an state transition event use [\#stay](#stay():PersistentFSMBase.this.State) instead.

nextStateNamestate designator for the next state

returnsstate transition descriptor

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
28. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
29. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
30. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#isTimerActive(name:String):Boolean "Permalink") final  def isTimerActive(name: String): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Inquire whether the named timer is still active.

Inquire whether the named timer is still active. Returns true unless the
timer does not exist, has previously been canceled or if it was a
single\-shot timer whose message was already received.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
31. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#listenerManagement:akka.actor.Actor.Receive "Permalink")  def listenerManagement: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Chain this into the receive function.

Chain this into the receive function.

```
def receive = listenerManagement orElse …
```
Attributesprotected Definition Classes[Listeners](../../routing/Listeners.html)
32. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#listeners:java.util.Set[akka.actor.ActorRef] "Permalink")  val listeners: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ActorRef](../../actor/ActorRef.html)]Attributesprotected Definition Classes[Listeners](../../routing/Listeners.html)
33. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../event/LoggingAdapter.html)Definition Classes[ActorLogging](../../actor/ActorLogging.html)
34. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#logDepth:Int "Permalink")  def logDepth: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)
35. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#logTermination(reason:akka.persistence.fsm.PersistentFSM.Reason):Unit "Permalink")  def logTermination(reason: [Reason](PersistentFSM$$Reason.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)By default [PersistentFSM.Failure](PersistentFSM$$Failure.html) is logged at error level and other reason
types are not logged.

By default [PersistentFSM.Failure](PersistentFSM$$Failure.html) is logged at error level and other reason
types are not logged. It is possible to override this behavior.

Attributesprotected Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
36. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
37. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#nextStateData:D "Permalink") final  def nextStateData: DReturn next state data (available in onTransition handlers)

Return next state data (available in onTransition handlers)

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
38. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
39. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
40. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#onTermination(terminationHandler:PartialFunction[PersistentFSMBase.this.StopEvent,Unit]):Unit "Permalink") final  def onTermination(terminationHandler: [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[(LoggingPersistentFSM.this)\#StopEvent, [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set handler which is called upon termination of this FSM actor.

Set handler which is called upon termination of this FSM actor. Calling
this method again will overwrite the previous contents.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
41. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#onTransition(transitionHandler:PersistentFSMBase.this.TransitionHandler):Unit "Permalink") final  def onTransition(transitionHandler: (LoggingPersistentFSM.this)\#TransitionHandler): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set handler which is called upon each state transition, i.e.

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

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
42. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
43. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Call `onTermination` hook; if you want to retain this behavior when
overriding make sure to call `super.postStop()`.

Call `onTermination` hook; if you want to retain this behavior when
overriding make sure to call `super.postStop()`.

Please note that this method is called by default from `preRestart()`,
so override that one if `onTermination` shall not be called during
restart.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html) → [Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
44. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
45. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
46. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#receive:PersistentFSMBase.this.Receive "Permalink")  def receive: (LoggingPersistentFSM.this)\#ReceiveScala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html) → [Actor](../../actor/Actor.html)
47. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
48. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
49. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#setStateTimeout(state:S,timeout:PersistentFSMBase.this.Timeout):Unit "Permalink") final  def setStateTimeout(state: S, timeout: (LoggingPersistentFSM.this)\#Timeout): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set state timeout explicitly.

Set state timeout explicitly. This method can safely be used from within a
state handler.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
50. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#startSingleTimer(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startSingleTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
51. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#startTimerAtFixedRate(name:String,msg:Any,interval:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerAtFixedRate(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
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

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
52. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#startTimerWithFixedDelay(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerWithFixedDelay(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
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

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
53. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#startWith(stateName:S,stateData:D,timeout:PersistentFSMBase.this.Timeout):Unit "Permalink") final  def startWith(stateName: S, stateData: D, timeout: (LoggingPersistentFSM.this)\#Timeout \= None): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set initial state.

Set initial state. Call this method from the constructor before the \#initialize method.
If different state is needed after a restart this method, followed by \#initialize, can
be used in the actor life cycle hooks [akka.actor.Actor\#preStart](../../actor/Actor.html#preStart():Unit) and [akka.actor.Actor\#postRestart](../../actor/Actor.html#postRestart(reason:Throwable):Unit).

stateNameinitial state designator

stateDatainitial state data

timeoutstate timeout for the initial state, overriding the default timeout for that state

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
54. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#stateData:D "Permalink") final  def stateData: DReturn current state data (i.e.

Return current state data (i.e. object of type D)

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
55. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#stateName:S "Permalink") final  def stateName: SReturn current state name (i.e.

Return current state name (i.e. object of type S)

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
56. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#stay():PersistentFSMBase.this.State "Permalink") final  def stay(): (LoggingPersistentFSM.this)\#StateProduce "empty" transition descriptor.

Produce "empty" transition descriptor.
Return this from a state function when no state change is to be effected.

No transition event will be triggered by [\#stay](#stay():PersistentFSMBase.this.State).
If you want to trigger an event like `S -> S` for `onTransition` to handle use `goto` instead.

returnsdescriptor for staying in current state

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
57. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#stop(reason:akka.persistence.fsm.PersistentFSM.Reason,stateData:D):PersistentFSMBase.this.State "Permalink") final  def stop(reason: [Reason](PersistentFSM$$Reason.html), stateData: D): (LoggingPersistentFSM.this)\#StateProduce change descriptor to stop this FSM actor including specified reason.

Produce change descriptor to stop this FSM actor including specified reason.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
58. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#stop(reason:akka.persistence.fsm.PersistentFSM.Reason):PersistentFSMBase.this.State "Permalink") final  def stop(reason: [Reason](PersistentFSM$$Reason.html)): (LoggingPersistentFSM.this)\#StateProduce change descriptor to stop this FSM actor including specified reason.

Produce change descriptor to stop this FSM actor including specified reason.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
59. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#stop():PersistentFSMBase.this.State "Permalink") final  def stop(): (LoggingPersistentFSM.this)\#StateProduce change descriptor to stop this FSM actor with reason "Normal".

Produce change descriptor to stop this FSM actor with reason "Normal".

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
60. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
61. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
62. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
63. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#total2pf(transitionHandler:(S,S)=>Unit):PersistentFSMBase.this.TransitionHandler "Permalink") implicit final  def total2pf(transitionHandler: (S, S) \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)): (LoggingPersistentFSM.this)\#TransitionHandlerConvenience wrapper for using a total function instead of a partial
function literal.

Convenience wrapper for using a total function instead of a partial
function literal. To be used with onTransition.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
64. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#transform(func:PersistentFSMBase.this.StateFunction):PersistentFSMBase.this.TransformHelper "Permalink") final  def transform(func: (LoggingPersistentFSM.this)\#StateFunction): (LoggingPersistentFSM.this)\#TransformHelperDefinition Classes[PersistentFSMBase](PersistentFSMBase.html)
65. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
66. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
67. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
68. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
69. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#when(stateName:S,stateTimeout:scala.concurrent.duration.FiniteDuration)(stateFunction:PersistentFSMBase.this.StateFunction):Unit "Permalink") final  def when(stateName: S, stateTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration) \= null)(stateFunction: (LoggingPersistentFSM.this)\#StateFunction): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Insert a new StateFunction at the end of the processing chain for the
given state.

Insert a new StateFunction at the end of the processing chain for the
given state. If the stateTimeout parameter is set, entering this state
without a differing explicit timeout setting will trigger a StateTimeout
event; the same is true when using \#stay.

stateNamedesignator for the state

stateTimeoutdefault state timeout for this state

stateFunctionpartial function describing response to input

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
70. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#whenUnhandled(stateFunction:PersistentFSMBase.this.StateFunction):Unit "Permalink") final  def whenUnhandled(stateFunction: (LoggingPersistentFSM.this)\#StateFunction): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set handler which is called upon reception of unhandled messages.

Set handler which is called upon reception of unhandled messages. Calling
this method again will overwrite the previous contents.

The current state may be queried using `stateName`.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
### Shadowed Implicit Value Members

1. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LoggingPersistentFSM\[S, D, E], B)ImplicitThis member is added by an implicit conversion from LoggingPersistentFSM\[S, D, E] toArrowAssoc\[LoggingPersistentFSM\[S, D, E]] performed by method ArrowAssoc in scala.Predef.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(loggingPersistentFSM: ArrowAssoc[LoggingPersistentFSM[S, D, E]]).->(y)
```
Definition ClassesArrowAssocAnnotations@inline()
### Deprecated Value Members

1. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LoggingPersistentFSM\[S, D, E] toStringFormat\[LoggingPersistentFSM\[S, D, E]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#setTimer(name:String,msg:Any,timeout:scala.concurrent.duration.FiniteDuration,repeat:Boolean):Unit "Permalink") final  def setTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), repeat: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean) \= false): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Schedule named timer to deliver message after given delay, possibly repeating.

Schedule named timer to deliver message after given delay, possibly repeating.
Any existing timer with the same name will automatically be canceled before
adding the new timer.

nameidentifier to be used with cancelTimer()

msgmessage to be delivered

timeoutdelay of first message delivery and between subsequent messages

repeatsend once if false, scheduleAtFixedRate if true

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use startSingleTimer, startTimerWithFixedDelay or startTimerAtFixedRate instead. This has the same semantics as startTimerAtFixedRate, but startTimerWithFixedDelay is often preferred.
4. [**](../../../akka/persistence/fsm/LoggingPersistentFSM.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LoggingPersistentFSM\[S, D, E], B)ImplicitThis member is added by an implicit conversion from LoggingPersistentFSM\[S, D, E] toArrowAssoc\[LoggingPersistentFSM\[S, D, E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [PersistentFSMBase](PersistentFSMBase.html)\[S, D, E]

### Inherited from [ActorLogging](../../actor/ActorLogging.html)

### Inherited from [Listeners](../../routing/Listeners.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLoggingPersistentFSM\[S, D, E] to any2stringadd\[LoggingPersistentFSM\[S, D, E]]

### Inherited by implicit conversion StringFormat fromLoggingPersistentFSM\[S, D, E] to StringFormat\[LoggingPersistentFSM\[S, D, E]]

### Inherited by implicit conversion Ensuring fromLoggingPersistentFSM\[S, D, E] to Ensuring\[LoggingPersistentFSM\[S, D, E]]

### Inherited by implicit conversion ArrowAssoc fromLoggingPersistentFSM\[S, D, E] to ArrowAssoc\[LoggingPersistentFSM\[S, D, E]]

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
- https://doc.akka.io/api/akka-core/2.6/akka/actor/FSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/LoggingReceive.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSMBase$.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSMBase.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/LoggingPersistentFSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$$minus$greater$.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$Event.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$Failure.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$LogEntry.html
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
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/LoggingPersistentFSM.html](https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/LoggingPersistentFSM.html)*