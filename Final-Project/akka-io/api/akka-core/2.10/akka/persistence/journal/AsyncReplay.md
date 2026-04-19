---
description: Akka 2.10.17 - akka.persistence.journal.AsyncReplay
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:21:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/AsyncReplay.html
title: Akka 2.10.17 - akka.persistence.journal.AsyncReplay
---

# Akka 2.10.17 - akka.persistence.journal.AsyncReplay

> **Summary:** Akka 2.10.17 - akka.persistence.journal.AsyncReplay

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/journal/index.html "Permalink")  package [journal](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/journal/inmem/index.html "Permalink")  package [inmem](inmem/index.html)Definition Classes[journal](index.html)
- [**](../../../akka/persistence/journal/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[journal](index.html)
- [**](../../../akka/persistence/journal/leveldb/index.html "Permalink")  package [leveldb](leveldb/index.html)Definition Classes[journal](index.html)
- [AsyncRecovery](AsyncRecovery.html "Asynchronous message replay and sequence number recovery interface.")
- AsyncReplay
- [AsyncReplayTimeoutException](AsyncReplayTimeoutException.html "Thrown if replay inactivity exceeds a specified timeout.")
- [AsyncWriteJournal](AsyncWriteJournal.html "Abstract journal, optimized for asynchronous, non-blocking writes.")
- [EmptyEventSeq](EmptyEventSeq.html)
- [EventAdapter](EventAdapter.html "An EventAdapter is both a WriteEventAdapter and a ReadEventAdapter.")
- [EventAdapters](EventAdapters.html "EventAdapters serves as a per-journal collection of bound event adapters.")
- [EventSeq](EventSeq.html)
- [EventsSeq](EventsSeq.html)
- [IdentityEventAdapter](IdentityEventAdapter$.html "No-op model adapter which passes through the incoming events as-is.")
- [JournalPerfSpec](JournalPerfSpec.html "This spec measures execution times of the basic operations that an akka.persistence.PersistentActor provides, using the provided Journal (plugin).")
- [JournalSpec](JournalSpec.html "This spec aims to verify custom akka-persistence Journal implementations.")
- [PersistencePluginProxy](PersistencePluginProxy.html)
- [PersistencePluginProxyExtension](PersistencePluginProxyExtension$.html)
- [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "PersistencePluginProxyExtensionImpl is an Extension that enables initialization of the PersistencePluginProxy via configuration, without requiring any code changes or the creation of any actors.")
- [ReadEventAdapter](ReadEventAdapter.html "Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.")
- [SingleEventSeq](SingleEventSeq.html)
- [Tagged](Tagged.html "The journal may support tagging of events that are used by the EventsByTag query and it may support specifying the tags via an akka.persistence.journal.EventAdapter that wraps the events in a Tagged with the given tags.")
- [WriteEventAdapter](WriteEventAdapter.html "Facility to convert to specialised data models, as may be required by specialized persistence Journals.")
t[akka](../../index.html).[persistence](../index.html).[journal](index.html)

# AsyncReplay[**](../../../akka/persistence/journal/AsyncReplay.html "Permalink")

### 

#### trait AsyncReplay extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A plugin may implement this trait as an optimization. Combining `asyncReplayMessages` and
`asyncReadHighestSequenceNr` into one method. If this trait is implemented the
methods in [AsyncRecovery](AsyncRecovery.html) will not be called.

Source[AsyncRecovery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/journal/AsyncRecovery.scala#L81)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AsyncReplay
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

1. [**](../../../akka/persistence/journal/AsyncReplay.html#replayMessages(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long,max:Long)(recoveryCallback:akka.persistence.PersistentRepr=>Unit):scala.concurrent.Future[Long] "Permalink") abstract  def replayMessages(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(recoveryCallback: ([PersistentRepr](../PersistentRepr.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Plugin API: asynchronously replays persistent messages.

Plugin API: asynchronously replays persistent messages. Implementations replay
a message by calling `replayCallback`. The returned future must be completed
with the highest sequence number when all messages (matching the sequence number bounds)
have been replayed. Journal must maintain the highest sequence number and never decrease it.
The future must be completed with a failure if any of the persistent messages
could not be replayed.

The `toSequenceNr` will either be `Long.MaxValue` to replay all messages or otherwise a limited
upper sequence number. When replaying all messages the returned highest sequence number should
be the same as the last replayed message, and the implementation would typically not have to
read highest sequence number in other way than replaying the messages. With a custom `toSequenceNr`
the implementation would typically have to both replay messages and read the actual highest sequence
number.

One special case is `toSequenceNr` of 0, which means that no messages should be replayed, but the
returned highest sequence number must still be the highest of all stored messages. In this case
the implementation would typically have to read the actual highest sequence number but can skip
replay of messages.

Another special case is `fromSequenceNr` of \-1, which means that only the last message if any
should be replayed.

This call is NOT protected with a circuit\-breaker because it may take long time
to replay all events. The plugin implementation itself must protect against
an unresponsive backend store and make sure that the returned Future is
completed with success or failure within reasonable time. It is not allowed
to ignore completing the future.

Please also note that requests to `replayMessages` may be made concurrently
to writes executing for the same `persistenceId`, in particular it is possible that
a restarting actor tries to recover before its outstanding writes have completed.

persistenceIdpersistent actor id.

fromSequenceNrsequence number where replay should start (inclusive).

toSequenceNrsequence number where replay should end (inclusive).

maxmaximum number of messages to be replayed.

recoveryCallbackcalled to replay a single message. Can be called from any
 thread.

returnshighest sequence number

See also[AsyncWriteJournal](AsyncWriteJournal.html)
### Concrete Value Members

1. [**](../../../akka/persistence/journal/AsyncReplay.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/journal/AsyncReplay.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/journal/AsyncReplay.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AsyncReplay toany2stringadd\[AsyncReplay] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/journal/AsyncReplay.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AsyncReplay, B)ImplicitThis member is added by an implicit conversion from AsyncReplay toArrowAssoc\[AsyncReplay] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/journal/AsyncReplay.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/journal/AsyncReplay.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/journal/AsyncReplay.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/journal/AsyncReplay.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AsyncReplay) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AsyncReplayImplicitThis member is added by an implicit conversion from AsyncReplay toEnsuring\[AsyncReplay] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/journal/AsyncReplay.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AsyncReplay) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AsyncReplayImplicitThis member is added by an implicit conversion from AsyncReplay toEnsuring\[AsyncReplay] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/journal/AsyncReplay.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AsyncReplayImplicitThis member is added by an implicit conversion from AsyncReplay toEnsuring\[AsyncReplay] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/journal/AsyncReplay.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AsyncReplayImplicitThis member is added by an implicit conversion from AsyncReplay toEnsuring\[AsyncReplay] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/journal/AsyncReplay.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/journal/AsyncReplay.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/persistence/journal/AsyncReplay.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/journal/AsyncReplay.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/journal/AsyncReplay.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/persistence/journal/AsyncReplay.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/persistence/journal/AsyncReplay.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/persistence/journal/AsyncReplay.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/journal/AsyncReplay.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/journal/AsyncReplay.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/persistence/journal/AsyncReplay.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/journal/AsyncReplay.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/persistence/journal/AsyncReplay.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/journal/AsyncReplay.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/journal/AsyncReplay.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AsyncReplay toStringFormat\[AsyncReplay] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/journal/AsyncReplay.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AsyncReplay, B)ImplicitThis member is added by an implicit conversion from AsyncReplay toArrowAssoc\[AsyncReplay] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAsyncReplay to any2stringadd\[AsyncReplay]

### Inherited by implicit conversion StringFormat fromAsyncReplay to StringFormat\[AsyncReplay]

### Inherited by implicit conversion Ensuring fromAsyncReplay to Ensuring\[AsyncReplay]

### Inherited by implicit conversion ArrowAssoc fromAsyncReplay to ArrowAssoc\[AsyncReplay]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncReplay.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncReplayTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EmptyEventSeq$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EmptyEventSeq.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventSeq$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventsSeq.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/IdentityEventAdapter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/JournalPerfSpec$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/JournalSpec$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/PersistencePluginProxy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/PersistencePluginProxy.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/PersistencePluginProxyExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/ReadEventAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/SingleEventSeq.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/Tagged.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/WriteEventAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/inmem/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/leveldb/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncReplay.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncReplay.html)*