---
description: Akka 2.10.17 - akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentation
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:58:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html
title: Akka 2.10.17 - akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentation
---

# Akka 2.10.17 - akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentation

> **Summary:** Akka 2.10.17 - akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentation

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](index.html)Definition Classes[typed](../index.html)
- [DurableStateBehaviorEnsemble](DurableStateBehaviorEnsemble.html "INTERNAL API")
- DurableStateBehaviorInstrumentation
- [DurableStateBehaviorInstrumentationProvider](DurableStateBehaviorInstrumentationProvider.html "INTERNAL API")
- [EmptyDurableStateBehaviorInstrumentation](EmptyDurableStateBehaviorInstrumentation.html "INTERNAL API")
- [EmptyEventSourcedBehaviorInstrumentation](EmptyEventSourcedBehaviorInstrumentation.html "INTERNAL API")
- [EventSourcedBehaviorEnsemble](EventSourcedBehaviorEnsemble.html "INTERNAL API")
- [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "INTERNAL API: Instrumentation SPI for EventSourcedBehavior.")
- [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "INTERNAL API")
[t](DurableStateBehaviorInstrumentation$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[telemetry](index.html)

# [DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation$.html "See companion object")[**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html "Permalink")

### Companion [object DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation$.html "See companion object")

#### trait DurableStateBehaviorInstrumentation extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

INTERNAL API: Instrumentation SPI for DurableStateBehavior.

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)() Source[DurableStateBehaviorInstrumentation.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.scala#L31)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[DurableStateBehaviorEnsemble](DurableStateBehaviorEnsemble.html), [EmptyDurableStateBehaviorInstrumentation](EmptyDurableStateBehaviorInstrumentation.html), [EmptyDurableStateBehaviorInstrumentation](EmptyDurableStateBehaviorInstrumentation$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateBehaviorInstrumentation
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
### Abstract Value Members

1. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#actorInitialized(actorRef:akka.actor.typed.ActorRef[_]):Unit "Permalink") abstract  def actorInitialized(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Initialize state for an EventSourcedBehavior actor.
2. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#afterRequestRecoveryPermit(actorRef:akka.actor.typed.ActorRef[_],context:akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentation.Context):Unit "Permalink") abstract  def afterRequestRecoveryPermit(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], context: [Context](DurableStateBehaviorInstrumentation$.html#Context=AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record after a recovery permit is requested.

Record after a recovery permit is requested.

actorRefthe `ActorRef` for which the recovery permit is requested

contextreturned by `beforeRequestRecoveryPermit`
3. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#beforeRequestRecoveryPermit(actorRef:akka.actor.typed.ActorRef[_]):akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentation.Context "Permalink") abstract  def beforeRequestRecoveryPermit(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_]): [Context](DurableStateBehaviorInstrumentation$.html#Context=AnyRef)Record before a recovery permit is requested.

Record before a recovery permit is requested.

actorRefthe `ActorRef` for which the recovery permit is about to be requested

returnscontext that will be passed to `afterRequestRecoveryPermit`
4. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#deleteStateCalled(actorRef:akka.actor.typed.ActorRef[_],command:Any):akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentation.Context "Permalink") abstract  def deleteStateCalled(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], command: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Context](DurableStateBehaviorInstrumentation$.html#Context=AnyRef)Record delete state.

Record delete state.

actorRefthe `ActorRef` for which the delete state will be sent to the store.

commandactor message (command) for which the state update was emitted.

returnscontext that will be passed to `persistStateWritten`
5. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#dependencies:Seq[String] "Permalink") abstract  def dependencies: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]Optional dependencies for this instrumentation.

Optional dependencies for this instrumentation.

Dependency instrumentations will always be ordered before this instrumentation.

returnslist of class names for optional instrumentation dependencies
6. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#persistFailed(actorRef:akka.actor.typed.ActorRef[_],throwable:Throwable,state:Any,revision:Long,context:akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentation.Context):Unit "Permalink") abstract  def persistFailed(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], throwable: Throwable, state: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), revision: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), context: [Context](DurableStateBehaviorInstrumentation$.html#Context=AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence persist failure.

Record persistence persist failure.

actorRefthe `ActorRef` for which the recovery has failed.

throwablethe cause of the failure.

statethe state that was to be persisted.

revisionthe sequence number associated with the failure

contextcontext returned by `persistStateCalled`
7. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#persistStateCalled(actorRef:akka.actor.typed.ActorRef[_],state:Any,command:Any):akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentation.Context "Permalink") abstract  def persistStateCalled(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], state: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), command: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Context](DurableStateBehaviorInstrumentation$.html#Context=AnyRef)Record persist state.

Record persist state.

actorRefthe `ActorRef` for which the state will be sent to the store.

statethe state that was submitted for persistence.

commandactor message (command) for which the state update was emitted.

returnscontext that will be passed to `persistStateWritten`
8. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#persistStateDone(actorRef:akka.actor.typed.ActorRef[_],context:akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentation.Context):Unit "Permalink") abstract  def persistStateDone(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], context: [Context](DurableStateBehaviorInstrumentation$.html#Context=AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record state is written and the registered callback is called.

Record state is written and the registered callback is called.

actorRefthe `ActorRef` for which the state has been successfully persisted.

contextcontext returned by `persistStateWritten`
9. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#persistStateWritten(actorRef:akka.actor.typed.ActorRef[_],state:Any,context:akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentation.Context):akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentation.Context "Permalink") abstract  def persistStateWritten(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], state: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), context: [Context](DurableStateBehaviorInstrumentation$.html#Context=AnyRef)): [Context](DurableStateBehaviorInstrumentation$.html#Context=AnyRef)Record state is written but the registered callback has not been called yet

Record state is written but the registered callback has not been called yet

actorRefthe `ActorRef` for which the state has been successfully persisted.

statethe state that was stored in the journal.

contextcontext returned by `persistStateCalled`

returnscontext that will be passed to `persistStateDone`
10. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#recoveryDone(actorRef:akka.actor.typed.ActorRef[_]):Unit "Permalink") abstract  def recoveryDone(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence recovery done.

Record persistence recovery done.

actorRefthe `ActorRef` for which the recovery is finished.
11. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#recoveryFailed(actorRef:akka.actor.typed.ActorRef[_],throwable:Throwable):Unit "Permalink") abstract  def recoveryFailed(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_], throwable: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence recovery failure.

Record persistence recovery failure.

actorRefthe `ActorRef` for which the recovery has failed.

throwablethe cause of the failure.
12. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#recoveryStarted(actorRef:akka.actor.typed.ActorRef[_]):Unit "Permalink") abstract  def recoveryStarted(actorRef: [ActorRef](../../../actor/typed/ActorRef.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence recovery started.

Record persistence recovery started.

actorRefthe `ActorRef` for which the recovery is started.
### Concrete Value Members

1. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DurableStateBehaviorInstrumentation toany2stringadd\[DurableStateBehaviorInstrumentation] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DurableStateBehaviorInstrumentation, B)ImplicitThis member is added by an implicit conversion from DurableStateBehaviorInstrumentation toArrowAssoc\[DurableStateBehaviorInstrumentation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DurableStateBehaviorInstrumentation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateBehaviorInstrumentationImplicitThis member is added by an implicit conversion from DurableStateBehaviorInstrumentation toEnsuring\[DurableStateBehaviorInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DurableStateBehaviorInstrumentation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateBehaviorInstrumentationImplicitThis member is added by an implicit conversion from DurableStateBehaviorInstrumentation toEnsuring\[DurableStateBehaviorInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateBehaviorInstrumentationImplicitThis member is added by an implicit conversion from DurableStateBehaviorInstrumentation toEnsuring\[DurableStateBehaviorInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateBehaviorInstrumentationImplicitThis member is added by an implicit conversion from DurableStateBehaviorInstrumentation toEnsuring\[DurableStateBehaviorInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DurableStateBehaviorInstrumentation toStringFormat\[DurableStateBehaviorInstrumentation] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DurableStateBehaviorInstrumentation, B)ImplicitThis member is added by an implicit conversion from DurableStateBehaviorInstrumentation toArrowAssoc\[DurableStateBehaviorInstrumentation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDurableStateBehaviorInstrumentation to any2stringadd\[DurableStateBehaviorInstrumentation]

### Inherited by implicit conversion StringFormat fromDurableStateBehaviorInstrumentation to StringFormat\[DurableStateBehaviorInstrumentation]

### Inherited by implicit conversion Ensuring fromDurableStateBehaviorInstrumentation to Ensuring\[DurableStateBehaviorInstrumentation]

### Inherited by implicit conversion ArrowAssoc fromDurableStateBehaviorInstrumentation to ArrowAssoc\[DurableStateBehaviorInstrumentation]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/DurableStateBehaviorEnsemble.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html)*