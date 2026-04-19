---
description: Akka 2.10.17 - akka.persistence.typed.telemetry.EventSourcedBehaviorEnsemble
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:59:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html
title: Akka 2.10.17 - akka.persistence.typed.telemetry.EventSourcedBehaviorEnsemble
---

# Akka 2.10.17 - akka.persistence.typed.telemetry.EventSourcedBehaviorEnsemble

> **Summary:** Akka 2.10.17 - akka.persistence.typed.telemetry.EventSourcedBehaviorEnsemble

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](index.html)Definition Classes[typed](../index.html)
- [DurableStateBehaviorEnsemble](DurableStateBehaviorEnsemble.html "INTERNAL API")
- [DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "INTERNAL API: Instrumentation SPI for DurableStateBehavior.")
- [DurableStateBehaviorInstrumentationProvider](DurableStateBehaviorInstrumentationProvider.html "INTERNAL API")
- [EmptyDurableStateBehaviorInstrumentation](EmptyDurableStateBehaviorInstrumentation.html "INTERNAL API")
- [EmptyEventSourcedBehaviorInstrumentation](EmptyEventSourcedBehaviorInstrumentation.html "INTERNAL API")
- EventSourcedBehaviorEnsemble
- [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "INTERNAL API: Instrumentation SPI for EventSourcedBehavior.")
- [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "INTERNAL API")
c[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[telemetry](index.html)

# EventSourcedBehaviorEnsemble[**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html "Permalink")

### 

#### class EventSourcedBehaviorEnsemble extends [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)() Source[EventSourcedBehaviorInstrumentation.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation.scala#L193)Linear Supertypes[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventSourcedBehaviorEnsemble
2. EventSourcedBehaviorInstrumentation
3. AnyRef
4. Any
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

1. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#<init>(instrumentations:Seq[akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentation]):akka.persistence.typed.telemetry.EventSourcedBehaviorEnsemble "Permalink")  new EventSourcedBehaviorEnsemble(instrumentations: Seq\[[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)])
### Value Members

1. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventSourcedBehaviorEnsemble toany2stringadd\[EventSourcedBehaviorEnsemble] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventSourcedBehaviorEnsemble, B)ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorEnsemble toArrowAssoc\[EventSourcedBehaviorEnsemble] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#actorInitialized(actorRef:akka.actor.typed.ActorRef[_]):Unit "Permalink")  def actorInitialized(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Initialize state for an EventSourcedBehavior actor.

Initialize state for an EventSourcedBehavior actor.

Definition ClassesEventSourcedBehaviorEnsemble → [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
7. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#afterRequestRecoveryPermit(actorRef:akka.actor.typed.ActorRef[_],context:akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentation.Context):Unit "Permalink")  def afterRequestRecoveryPermit(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], context: [Context](EventSourcedBehaviorInstrumentation$.html#Context=AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record after a recovery permit is requested.

Record after a recovery permit is requested.

actorRefthe `ActorRef` for which the recovery permit is requested

contextreturned by `beforeRequestRecoveryPermit`

Definition ClassesEventSourcedBehaviorEnsemble → [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
8. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#beforeRequestRecoveryPermit(actorRef:akka.actor.typed.ActorRef[_]):akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentation.Context "Permalink")  def beforeRequestRecoveryPermit(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_]): [Context](EventSourcedBehaviorInstrumentation$.html#Context=AnyRef)Record before a recovery permit is requested.

Record before a recovery permit is requested.

actorRefthe `ActorRef` for which the recovery permit is about to be requested

returnscontext that will be passed to `afterRequestRecoveryPermit`

Definition ClassesEventSourcedBehaviorEnsemble → [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
10. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#dependencies:Seq[String] "Permalink")  def dependencies: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]Optional dependencies for this instrumentation.

Optional dependencies for this instrumentation.

Dependency instrumentations will always be ordered before this instrumentation.

returnslist of class names for optional instrumentation dependencies

Definition ClassesEventSourcedBehaviorEnsemble → [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
12. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventSourcedBehaviorEnsemble) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventSourcedBehaviorEnsembleImplicitThis member is added by an implicit conversion from EventSourcedBehaviorEnsemble toEnsuring\[EventSourcedBehaviorEnsemble] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventSourcedBehaviorEnsemble) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventSourcedBehaviorEnsembleImplicitThis member is added by an implicit conversion from EventSourcedBehaviorEnsemble toEnsuring\[EventSourcedBehaviorEnsemble] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventSourcedBehaviorEnsembleImplicitThis member is added by an implicit conversion from EventSourcedBehaviorEnsemble toEnsuring\[EventSourcedBehaviorEnsemble] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventSourcedBehaviorEnsembleImplicitThis member is added by an implicit conversion from EventSourcedBehaviorEnsemble toEnsuring\[EventSourcedBehaviorEnsemble] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#instrumentations:Seq[akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentation] "Permalink")  val instrumentations: Seq\[[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)]
21. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#persistEventCalled(actorRef:akka.actor.typed.ActorRef[_],event:Any,command:Any):akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentation.Context "Permalink")  def persistEventCalled(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), command: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Context](EventSourcedBehaviorInstrumentation$.html#Context=AnyRef)Record persist event.

Record persist event.

actorRefthe `ActorRef` for which the event will be sent to the journal.

eventthe event that was submitted for persistence. For persist of several events it will be
 called for each event in the batch in the same order.

commandactor message (command), if any (otherwise null), for which the event was emitted.

returnscontext that will be passed to `persistEventWritten`

Definition ClassesEventSourcedBehaviorEnsemble → [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
26. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#persistEventDone(actorRef:akka.actor.typed.ActorRef[_],context:akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentation.Context):Unit "Permalink")  def persistEventDone(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], context: [Context](EventSourcedBehaviorInstrumentation$.html#Context=AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record event is written and the registered callback is called.

Record event is written and the registered callback is called.

actorRefthe `ActorRef` for which the event has been successfully persisted.

contextcontext returned by `persistEventWritten`

Definition ClassesEventSourcedBehaviorEnsemble → [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
27. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#persistEventWritten(actorRef:akka.actor.typed.ActorRef[_],event:Any,context:akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentation.Context):akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentation.Context "Permalink")  def persistEventWritten(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), context: [Context](EventSourcedBehaviorInstrumentation$.html#Context=AnyRef)): [Context](EventSourcedBehaviorInstrumentation$.html#Context=AnyRef)Record event is written but the registered callback has not been called yet

Record event is written but the registered callback has not been called yet

actorRefthe `ActorRef` for which the event has been successfully persisted.

eventthe event that was stored in the journal.

contextcontext returned by `persistEventCalled`

returnscontext that will be passed to `persistEventDone`

Definition ClassesEventSourcedBehaviorEnsemble → [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
28. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#persistFailed(actorRef:akka.actor.typed.ActorRef[_],throwable:Throwable,event:Any,seqNr:Long,context:akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentation.Context):Unit "Permalink")  def persistFailed(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], throwable: Throwable, event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), context: [Context](EventSourcedBehaviorInstrumentation$.html#Context=AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence persist failure.

Record persistence persist failure.

actorRefthe `ActorRef` for which the recovery has failed.

throwablethe cause of the failure.

eventthe event that was to be persisted.

seqNrthe sequence number associated with the failure

contextcontext returned by `persistEventCalled`

Definition ClassesEventSourcedBehaviorEnsemble → [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
29. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#persistRejected(actorRef:akka.actor.typed.ActorRef[_],throwable:Throwable,event:Any,seqNr:Long,context:akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentation.Context):Unit "Permalink")  def persistRejected(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], throwable: Throwable, event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), context: [Context](EventSourcedBehaviorInstrumentation$.html#Context=AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence persist failure.

Record persistence persist failure.

actorRefthe `ActorRef` for which the recovery has failed.

throwablethe cause of the failure.

eventthe event that was to be persisted.

seqNrthe sequence number associated with the failure

contextcontext returned by `persistEventCalled`

Definition ClassesEventSourcedBehaviorEnsemble → [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
30. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#recoveryDone(actorRef:akka.actor.typed.ActorRef[_]):Unit "Permalink")  def recoveryDone(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence recovery done.

Record persistence recovery done.

actorRefthe `ActorRef` for which the recovery is finished.

Definition ClassesEventSourcedBehaviorEnsemble → [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
31. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#recoveryFailed(actorRef:akka.actor.typed.ActorRef[_],throwable:Throwable,event:Any):Unit "Permalink")  def recoveryFailed(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], throwable: Throwable, event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence recovery failure.

Record persistence recovery failure.

actorRefthe `ActorRef` for which the recovery has failed.

throwablethe cause of the failure.

eventthe event that was replayed, if any (otherwise null)

Definition ClassesEventSourcedBehaviorEnsemble → [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
32. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#recoveryStarted(actorRef:akka.actor.typed.ActorRef[_]):Unit "Permalink")  def recoveryStarted(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence recovery started.

Record persistence recovery started.

actorRefthe `ActorRef` for which the recovery is started.

Definition ClassesEventSourcedBehaviorEnsemble → [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
33. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
35. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventSourcedBehaviorEnsemble toStringFormat\[EventSourcedBehaviorEnsemble] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventSourcedBehaviorEnsemble, B)ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorEnsemble toArrowAssoc\[EventSourcedBehaviorEnsemble] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventSourcedBehaviorEnsemble to any2stringadd\[EventSourcedBehaviorEnsemble]

### Inherited by implicit conversion StringFormat fromEventSourcedBehaviorEnsemble to StringFormat\[EventSourcedBehaviorEnsemble]

### Inherited by implicit conversion Ensuring fromEventSourcedBehaviorEnsemble to Ensuring\[EventSourcedBehaviorEnsemble]

### Inherited by implicit conversion ArrowAssoc fromEventSourcedBehaviorEnsemble to ArrowAssoc\[EventSourcedBehaviorEnsemble]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorEnsemble.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html)*