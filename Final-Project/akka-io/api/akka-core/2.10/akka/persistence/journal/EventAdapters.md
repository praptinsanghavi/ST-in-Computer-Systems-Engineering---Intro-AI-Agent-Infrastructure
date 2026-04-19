---
description: Akka 2.10.17 - akka.persistence.journal.EventAdapters
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:21:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/EventAdapters.html
title: Akka 2.10.17 - akka.persistence.journal.EventAdapters
---

# Akka 2.10.17 - akka.persistence.journal.EventAdapters

> **Summary:** Akka 2.10.17 - akka.persistence.journal.EventAdapters

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
- [AsyncReplay](AsyncReplay.html "A plugin may implement this trait as an optimization.")
- [AsyncReplayTimeoutException](AsyncReplayTimeoutException.html "Thrown if replay inactivity exceeds a specified timeout.")
- [AsyncWriteJournal](AsyncWriteJournal.html "Abstract journal, optimized for asynchronous, non-blocking writes.")
- [EmptyEventSeq](EmptyEventSeq.html)
- [EventAdapter](EventAdapter.html "An EventAdapter is both a WriteEventAdapter and a ReadEventAdapter.")
- EventAdapters
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
c[akka](../../index.html).[persistence](../index.html).[journal](index.html)

# EventAdapters[**](../../../akka/persistence/journal/EventAdapters.html "Permalink")

### 

#### class EventAdapters extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

`EventAdapters` serves as a per\-journal collection of bound event adapters.

Source[EventAdapters.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/journal/EventAdapters.scala#L23)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventAdapters
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
### Instance Constructors

1. [**](../../../akka/persistence/journal/EventAdapters.html#<init>(map:java.util.concurrent.ConcurrentHashMap[Class[_],akka.persistence.journal.EventAdapter],bindings:Seq[(Class[_],akka.persistence.journal.EventAdapter)],log:akka.event.LoggingAdapter):akka.persistence.journal.EventAdapters "Permalink")  new EventAdapters(map: [ConcurrentHashMap](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ConcurrentHashMap.html#java.util.concurrent.ConcurrentHashMap)\[Class\[\_], [EventAdapter](EventAdapter.html)], bindings: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(Class\[\_], [EventAdapter](EventAdapter.html))], log: [LoggingAdapter](../../event/LoggingAdapter.html))
### Value Members

1. [**](../../../akka/persistence/journal/EventAdapters.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/journal/EventAdapters.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/journal/EventAdapters.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventAdapters toany2stringadd\[EventAdapters] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/journal/EventAdapters.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventAdapters, B)ImplicitThis member is added by an implicit conversion from EventAdapters toArrowAssoc\[EventAdapters] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/journal/EventAdapters.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/journal/EventAdapters.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/journal/EventAdapters.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/journal/EventAdapters.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventAdapters) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventAdaptersImplicitThis member is added by an implicit conversion from EventAdapters toEnsuring\[EventAdapters] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/journal/EventAdapters.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventAdapters) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventAdaptersImplicitThis member is added by an implicit conversion from EventAdapters toEnsuring\[EventAdapters] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/journal/EventAdapters.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventAdaptersImplicitThis member is added by an implicit conversion from EventAdapters toEnsuring\[EventAdapters] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/journal/EventAdapters.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventAdaptersImplicitThis member is added by an implicit conversion from EventAdapters toEnsuring\[EventAdapters] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/journal/EventAdapters.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/journal/EventAdapters.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/persistence/journal/EventAdapters.html#get(clazz:Class[_]):akka.persistence.journal.EventAdapter "Permalink")  def get(clazz: Class\[\_]): [EventAdapter](EventAdapter.html)Finds the "most specific" matching adapter for the given class (i.e.

Finds the "most specific" matching adapter for the given class (i.e. it may return an adapter that can work on a
interface implemented by the given class if no direct match is found).

Falls back to [IdentityEventAdapter](IdentityEventAdapter$.html) if no adapter was defined for the given class.
15. [**](../../../akka/persistence/journal/EventAdapters.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/journal/EventAdapters.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/persistence/journal/EventAdapters.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/persistence/journal/EventAdapters.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/persistence/journal/EventAdapters.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/journal/EventAdapters.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/persistence/journal/EventAdapters.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/persistence/journal/EventAdapters.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesEventAdapters → AnyRef → Any
23. [**](../../../akka/persistence/journal/EventAdapters.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/persistence/journal/EventAdapters.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/persistence/journal/EventAdapters.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/journal/EventAdapters.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/journal/EventAdapters.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventAdapters toStringFormat\[EventAdapters] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/journal/EventAdapters.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventAdapters, B)ImplicitThis member is added by an implicit conversion from EventAdapters toArrowAssoc\[EventAdapters] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventAdapters to any2stringadd\[EventAdapters]

### Inherited by implicit conversion StringFormat fromEventAdapters to StringFormat\[EventAdapters]

### Inherited by implicit conversion Ensuring fromEventAdapters to Ensuring\[EventAdapters]

### Inherited by implicit conversion ArrowAssoc fromEventAdapters to ArrowAssoc\[EventAdapters]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventAdapters.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventAdapters.html)*