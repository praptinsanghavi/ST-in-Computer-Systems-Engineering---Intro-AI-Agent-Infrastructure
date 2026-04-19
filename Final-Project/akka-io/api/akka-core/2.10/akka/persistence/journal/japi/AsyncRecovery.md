---
description: Akka 2.10.17 - akka.persistence.journal.japi.AsyncRecovery
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:13:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/japi/AsyncRecovery.html
title: Akka 2.10.17 - akka.persistence.journal.japi.AsyncRecovery
---

# Akka 2.10.17 - akka.persistence.journal.japi.AsyncRecovery

> **Summary:** Akka 2.10.17 - akka.persistence.journal.japi.AsyncRecovery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/journal/index.html "Permalink")  package [journal](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/journal/japi/index.html "Permalink")  package [japi](index.html)Definition Classes[journal](../index.html)
- AsyncRecovery
- [AsyncWriteJournal](AsyncWriteJournal.html "Java API: abstract journal, optimized for asynchronous, non-blocking writes.")
c[akka](../../../index.html).[persistence](../../index.html).[journal](../index.html).[japi](index.html)

# AsyncRecovery[**](../../../../akka/persistence/journal/japi/AsyncRecovery.html "Permalink")

### 

#### abstract  class AsyncRecovery extends [journal.AsyncRecovery](../AsyncRecovery.html) with AsyncRecoveryPlugin

Java API: asynchronous message replay and sequence number recovery interface.

Self TypeAsyncRecovery with [Actor](../../../actor/Actor.html)Source[AsyncRecovery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/journal/japi/AsyncRecovery.scala#L18)Linear SupertypesAsyncRecoveryPlugin, [journal.AsyncRecovery](../AsyncRecovery.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AsyncWriteJournal](AsyncWriteJournal.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AsyncRecovery
2. AsyncRecoveryPlugin
3. AsyncRecovery
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

1. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#<init>():akka.persistence.journal.japi.AsyncRecovery "Permalink")  new AsyncRecovery()
### Abstract Value Members

1. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#doAsyncReadHighestSequenceNr(persistenceId:String,fromSequenceNr:Long):scala.concurrent.Future[Long] "Permalink") abstract  def doAsyncReadHighestSequenceNr(persistenceId: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String), fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Long](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Long.html#java.lang.Long)]Java API, Plugin API: asynchronously reads the highest stored sequence number for the given
`persistenceId`.

Java API, Plugin API: asynchronously reads the highest stored sequence number for the given
`persistenceId`. The persistent actor will use the highest sequence number after recovery as
the starting point when persisting new events. This sequence number is also used as
`toSequenceNr` in subsequent call to [\#asyncReplayMessages](#asyncReplayMessages(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long,max:Long)(replayCallback:akka.persistence.PersistentRepr=>Unit):scala.concurrent.Future[Unit]) unless the user has specified a
lower `toSequenceNr`.

persistenceIdid of the persistent actor.

fromSequenceNrhint where to start searching for the highest sequence number.

Definition ClassesAsyncRecoveryPlugin
2. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#doAsyncReplayMessages(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long,max:Long,replayCallback:java.util.function.Consumer[akka.persistence.PersistentRepr]):scala.concurrent.Future[Void] "Permalink") abstract  def doAsyncReplayMessages(persistenceId: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String), fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), replayCallback: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[[PersistentRepr](../../PersistentRepr.html)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Void](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Void.html#java.lang.Void)]Java API, Plugin API: asynchronously replays persistent messages.

Java API, Plugin API: asynchronously replays persistent messages. Implementations replay a
message by calling `replayCallback`. The returned future must be completed when all messages
(matching the sequence number bounds) have been replayed. The future must be completed with a
failure if any of the persistent messages could not be replayed.

The `replayCallback` must also be called with messages that have been marked as deleted. In
this case a replayed message's `deleted` method must return `true`.

The `toSequenceNr` is the lowest of what was returned by `#doAsyncReadHighestSequenceNr` and what the user specified as recovery `akka.persistence.Recovery` parameter.

persistenceIdid of the persistent actor.

fromSequenceNrsequence number where replay should start (inclusive).

toSequenceNrsequence number where replay should end (inclusive).

maxmaximum number of messages to be replayed.

replayCallbackcalled to replay a single message. Can be called from any thread.

Definition ClassesAsyncRecoveryPlugin
### Concrete Value Members

1. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AsyncRecovery toany2stringadd\[AsyncRecovery] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AsyncRecovery, B)ImplicitThis member is added by an implicit conversion from AsyncRecovery toArrowAssoc\[AsyncRecovery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#asyncReadHighestSequenceNr(persistenceId:String,fromSequenceNr:Long):scala.concurrent.Future[Long] "Permalink") final  def asyncReadHighestSequenceNr(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Plugin API: asynchronously reads the highest stored sequence number for the
given `persistenceId`.

Plugin API: asynchronously reads the highest stored sequence number for the
given `persistenceId`. The persistent actor will use the highest sequence
number after recovery as the starting point when persisting new events.
This sequence number is also used as `toSequenceNr` in subsequent call
to [\#asyncReplayMessages](#asyncReplayMessages(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long,max:Long)(replayCallback:akka.persistence.PersistentRepr=>Unit):scala.concurrent.Future[Unit]) unless the user has specified a lower `toSequenceNr`.
Journal must maintain the highest sequence number and never decrease it.

This call is protected with a circuit\-breaker.

Please also note that requests for the highest sequence number may be made concurrently
to writes executing for the same `persistenceId`, in particular it is possible that
a restarting actor tries to recover before its outstanding writes have completed.

persistenceIdpersistent actor id.

fromSequenceNrhint where to start searching for the highest sequence
 number. When a persistent actor is recovering this
 `fromSequenceNr` will be the sequence number of the used
 snapshot or `0L` if no snapshot is used.

Definition ClassesAsyncRecovery → [AsyncRecovery](../AsyncRecovery.html)
8. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#asyncReplayMessages(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long,max:Long)(replayCallback:akka.persistence.PersistentRepr=>Unit):scala.concurrent.Future[Unit] "Permalink") final  def asyncReplayMessages(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(replayCallback: ([PersistentRepr](../../PersistentRepr.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Plugin API: asynchronously replays persistent messages.

Plugin API: asynchronously replays persistent messages. Implementations replay
a message by calling `replayCallback`. The returned future must be completed
when all messages (matching the sequence number bounds) have been replayed.
The future must be completed with a failure if any of the persistent messages
could not be replayed.

The `replayCallback` must also be called with messages that have been marked
as deleted. In this case a replayed message's `deleted` method must return
`true`.

The `toSequenceNr` is the lowest of what was returned by [\#asyncReadHighestSequenceNr](#asyncReadHighestSequenceNr(persistenceId:String,fromSequenceNr:Long):scala.concurrent.Future[Long])
and what the user specified as recovery [akka.persistence.Recovery](../../Recovery.html) parameter.
This does imply that this call is always preceded by reading the highest sequence
number for the given `persistenceId`.

A special case is `fromSequenceNr` of \-1, which means that only the last message if any
should be replayed.

This call is NOT protected with a circuit\-breaker because it may take long time
to replay all events. The plugin implementation itself must protect against
an unresponsive backend store and make sure that the returned Future is
completed with success or failure within reasonable time. It is not allowed
to ignore completing the future.

persistenceIdpersistent actor id.

fromSequenceNrsequence number where replay should start (inclusive).

toSequenceNrsequence number where replay should end (inclusive).

maxmaximum number of messages to be replayed.

Definition ClassesAsyncRecovery → [AsyncRecovery](../AsyncRecovery.html)See also[AsyncWriteJournal](AsyncWriteJournal.html)
9. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AsyncRecovery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AsyncRecoveryImplicitThis member is added by an implicit conversion from AsyncRecovery toEnsuring\[AsyncRecovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AsyncRecovery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AsyncRecoveryImplicitThis member is added by an implicit conversion from AsyncRecovery toEnsuring\[AsyncRecovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AsyncRecoveryImplicitThis member is added by an implicit conversion from AsyncRecovery toEnsuring\[AsyncRecovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AsyncRecoveryImplicitThis member is added by an implicit conversion from AsyncRecovery toEnsuring\[AsyncRecovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AsyncRecovery toStringFormat\[AsyncRecovery] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/journal/japi/AsyncRecovery.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AsyncRecovery, B)ImplicitThis member is added by an implicit conversion from AsyncRecovery toArrowAssoc\[AsyncRecovery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from AsyncRecoveryPlugin

### Inherited from [journal.AsyncRecovery](../AsyncRecovery.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAsyncRecovery to any2stringadd\[AsyncRecovery]

### Inherited by implicit conversion StringFormat fromAsyncRecovery to StringFormat\[AsyncRecovery]

### Inherited by implicit conversion Ensuring fromAsyncRecovery to Ensuring\[AsyncRecovery]

### Inherited by implicit conversion ArrowAssoc fromAsyncRecovery to ArrowAssoc\[AsyncRecovery]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Recovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/japi/AsyncRecovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/japi/AsyncWriteJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/japi/AsyncRecovery.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/japi/AsyncRecovery.html)*