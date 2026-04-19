---
description: Akka 2.10.17 - akka.persistence.telemetry.EventsourcedInstrumentation
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:56:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/telemetry/EventsourcedInstrumentation.html
title: Akka 2.10.17 - akka.persistence.telemetry.EventsourcedInstrumentation
---

# Akka 2.10.17 - akka.persistence.telemetry.EventsourcedInstrumentation

> **Summary:** Akka 2.10.17 - akka.persistence.telemetry.EventsourcedInstrumentation

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](index.html)Definition Classes[persistence](../index.html)
- [EmptyEventsourcedInstrumentation](EmptyEventsourcedInstrumentation.html "INTERNAL API")
- [EmptyRecoveryPermitterInstrumentation](EmptyRecoveryPermitterInstrumentation.html "INTERNAL API")
- [EventsourcedEnsemble](EventsourcedEnsemble.html "INTERNAL API")
- EventsourcedInstrumentation
- [EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "INTERNAL API")
- [RecoveryPermitterEnsemble](RecoveryPermitterEnsemble.html "INTERNAL API")
- [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "INTERNAL API: Instrumentation SPI for PersistentActor.")
- [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider.html "INTERNAL API")
[t](EventsourcedInstrumentation$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[telemetry](index.html)

# [EventsourcedInstrumentation](EventsourcedInstrumentation$.html "See companion object")[**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html "Permalink")

### Companion [object EventsourcedInstrumentation](EventsourcedInstrumentation$.html "See companion object")

#### trait EventsourcedInstrumentation extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

INTERNAL API: Instrumentation SPI for PersistentActor.

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)() Source[EventsourcedInstrumentation.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/telemetry/EventsourcedInstrumentation.scala#L34)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[EmptyEventsourcedInstrumentation](EmptyEventsourcedInstrumentation.html), [EmptyEventsourcedInstrumentation](EmptyEventsourcedInstrumentation$.html), [EventsourcedEnsemble](EventsourcedEnsemble.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventsourcedInstrumentation
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

1. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#afterRequestRecoveryPermit(actorRef:akka.actor.ActorRef,context:akka.persistence.telemetry.EventsourcedInstrumentation.Context):Unit "Permalink") abstract  def afterRequestRecoveryPermit(actorRef: [ActorRef](../../actor/ActorRef.html), context: [Context](EventsourcedInstrumentation$.html#Context=AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record after a recovery permit is requested.

Record after a recovery permit is requested.

actorRefthe `ActorRef` for which the recovery permit is requested

contextreturned by `beforeRequestRecoveryPermit`
2. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#beforeRequestRecoveryPermit(actorRef:akka.actor.ActorRef):akka.persistence.telemetry.EventsourcedInstrumentation.Context "Permalink") abstract  def beforeRequestRecoveryPermit(actorRef: [ActorRef](../../actor/ActorRef.html)): [Context](EventsourcedInstrumentation$.html#Context=AnyRef)Record before a recovery permit is requested.

Record before a recovery permit is requested.

actorRefthe `ActorRef` for which the recovery permit is about to be requested

returnscontext that will be passed to `afterRequestRecoveryPermit`
3. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#dependencies:Seq[String] "Permalink") abstract  def dependencies: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]Optional dependencies for this instrumentation.

Optional dependencies for this instrumentation.

Dependency instrumentations will always be ordered before this instrumentation.

returnslist of class names for optional instrumentation dependencies
4. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#persistEventCalled(actorRef:akka.actor.ActorRef,event:Any,command:Any):akka.persistence.telemetry.EventsourcedInstrumentation.Context "Permalink") abstract  def persistEventCalled(actorRef: [ActorRef](../../actor/ActorRef.html), event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), command: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Context](EventsourcedInstrumentation$.html#Context=AnyRef)Record persist event.

Record persist event.

actorRefthe `ActorRef` for which the event will be sent to the journal.

eventthe event that was submitted for persistence. For persist of several events it will be
 called for each event in the batch in the same order.

commandactor message (command), if any (otherwise null), for which the event was emitted.

returnscontext that will be passed to `persistEventWritten`
5. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#persistEventDone(actorRef:akka.actor.ActorRef,context:akka.persistence.telemetry.EventsourcedInstrumentation.Context):Unit "Permalink") abstract  def persistEventDone(actorRef: [ActorRef](../../actor/ActorRef.html), context: [Context](EventsourcedInstrumentation$.html#Context=AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record event is written and the registered callback is called.

Record event is written and the registered callback is called.

actorRefthe `ActorRef` for which the event has been successfully persisted.

contextcontext returned by `persistEventWritten`
6. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#persistEventWritten(actorRef:akka.actor.ActorRef,event:Any,context:akka.persistence.telemetry.EventsourcedInstrumentation.Context):akka.persistence.telemetry.EventsourcedInstrumentation.Context "Permalink") abstract  def persistEventWritten(actorRef: [ActorRef](../../actor/ActorRef.html), event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), context: [Context](EventsourcedInstrumentation$.html#Context=AnyRef)): [Context](EventsourcedInstrumentation$.html#Context=AnyRef)Record event is written but the registered callback has not been called yet

Record event is written but the registered callback has not been called yet

actorRefthe `ActorRef` for which the event has been successfully persisted.

eventthe event that was stored in the journal.

contextcontext returned by `persistEventCalled`

returnscontext that will be passed to `persistEventDone`
7. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#persistFailed(actorRef:akka.actor.ActorRef,throwable:Throwable,event:Any,seqNr:Long,context:akka.persistence.telemetry.EventsourcedInstrumentation.Context):Unit "Permalink") abstract  def persistFailed(actorRef: [ActorRef](../../actor/ActorRef.html), throwable: Throwable, event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), context: [Context](EventsourcedInstrumentation$.html#Context=AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence persist failure.

Record persistence persist failure.

actorRefthe `ActorRef` for which the recovery has failed.

throwablethe cause of the failure.

eventthe event that was to be persisted.

seqNrthe sequence number associated with the failure

contextcontext returned by `persistEventCalled`
8. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#persistRejected(actorRef:akka.actor.ActorRef,throwable:Throwable,event:Any,seqNr:Long,context:akka.persistence.telemetry.EventsourcedInstrumentation.Context):Unit "Permalink") abstract  def persistRejected(actorRef: [ActorRef](../../actor/ActorRef.html), throwable: Throwable, event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), context: [Context](EventsourcedInstrumentation$.html#Context=AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence persist failure.

Record persistence persist failure.

actorRefthe `ActorRef` for which the recovery has failed.

throwablethe cause of the failure.

eventthe event that was to be persisted.

seqNrthe sequence number associated with the failure

contextcontext returned by `persistEventCalled`
9. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#recoveryDone(actorRef:akka.actor.ActorRef):Unit "Permalink") abstract  def recoveryDone(actorRef: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence recovery done.

Record persistence recovery done.

actorRefthe `ActorRef` for which the recovery is finished.
10. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#recoveryFailed(actorRef:akka.actor.ActorRef,throwable:Throwable,event:Any):Unit "Permalink") abstract  def recoveryFailed(actorRef: [ActorRef](../../actor/ActorRef.html), throwable: Throwable, event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence recovery failure.

Record persistence recovery failure.

actorRefthe `ActorRef` for which the recovery has failed.

throwablethe cause of the failure.

eventthe event that was replayed, if any (otherwise null)
11. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#recoveryStarted(actorRef:akka.actor.ActorRef):Unit "Permalink") abstract  def recoveryStarted(actorRef: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record persistence recovery started.

Record persistence recovery started.

actorRefthe `ActorRef` for which the recovery is started.
### Concrete Value Members

1. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventsourcedInstrumentation toany2stringadd\[EventsourcedInstrumentation] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventsourcedInstrumentation, B)ImplicitThis member is added by an implicit conversion from EventsourcedInstrumentation toArrowAssoc\[EventsourcedInstrumentation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventsourcedInstrumentation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventsourcedInstrumentationImplicitThis member is added by an implicit conversion from EventsourcedInstrumentation toEnsuring\[EventsourcedInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventsourcedInstrumentation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventsourcedInstrumentationImplicitThis member is added by an implicit conversion from EventsourcedInstrumentation toEnsuring\[EventsourcedInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventsourcedInstrumentationImplicitThis member is added by an implicit conversion from EventsourcedInstrumentation toEnsuring\[EventsourcedInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventsourcedInstrumentationImplicitThis member is added by an implicit conversion from EventsourcedInstrumentation toEnsuring\[EventsourcedInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventsourcedInstrumentation toStringFormat\[EventsourcedInstrumentation] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventsourcedInstrumentation, B)ImplicitThis member is added by an implicit conversion from EventsourcedInstrumentation toArrowAssoc\[EventsourcedInstrumentation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventsourcedInstrumentation to any2stringadd\[EventsourcedInstrumentation]

### Inherited by implicit conversion StringFormat fromEventsourcedInstrumentation to StringFormat\[EventsourcedInstrumentation]

### Inherited by implicit conversion Ensuring fromEventsourcedInstrumentation to Ensuring\[EventsourcedInstrumentation]

### Inherited by implicit conversion ArrowAssoc fromEventsourcedInstrumentation to ArrowAssoc\[EventsourcedInstrumentation]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EmptyEventsourcedInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EmptyEventsourcedInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedEnsemble.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedInstrumentationProvider$.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedInstrumentationProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/RecoveryPermitterEnsemble.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider$.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedInstrumentation.html](https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedInstrumentation.html)*