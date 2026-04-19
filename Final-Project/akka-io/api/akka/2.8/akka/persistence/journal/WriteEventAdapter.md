---
description: Akka 2.8.9 - akka.persistence.journal.WriteEventAdapter
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:29:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/journal/WriteEventAdapter.html
title: Akka 2.8.9 - akka.persistence.journal.WriteEventAdapter
---

# Akka 2.8.9 - akka.persistence.journal.WriteEventAdapter

> **Summary:** Akka 2.8.9 - akka.persistence.journal.WriteEventAdapter

## Content

Akka2\.8\.9 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/journal/index.html "Permalink")  package [journal](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/journal/inmem/index.html "Permalink")  package [inmem](inmem/index.html)Definition Classes[journal](index.html)
- [**](../../../akka/persistence/journal/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[journal](index.html)
- [**](../../../akka/persistence/journal/leveldb/index.html "Permalink")  package [leveldb](leveldb/index.html)Definition Classes[journal](index.html)
- [AsyncRecovery](AsyncRecovery.html "Asynchronous message replay and sequence number recovery interface.")
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
- WriteEventAdapter
t[akka](../../index.html).[persistence](../index.html).[journal](index.html)

# WriteEventAdapter[**](../../../akka/persistence/journal/WriteEventAdapter.html "Permalink")

### 

#### trait WriteEventAdapter extends [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

Facility to convert to specialised data models, as may be required by specialized persistence Journals.

Typical use cases include (but are not limited to):

- adding metadata, a.k.a. "tagging" \- by wrapping objects into tagged counterparts
- manually converting to the Journals storage format, such as JSON, BSON or any specialised binary format
- splitting up large events into sequences of smaller ones
Source[EventAdapter.scala](https://github.com/akka/akka/tree/v2.8.9//akka-persistence/src/main/scala/akka/persistence/journal/EventAdapter.scala#L33)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)Known Subclasses[EventAdapter](EventAdapter.html), [IdentityEventAdapter](IdentityEventAdapter$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WriteEventAdapter
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

1. [**](../../../akka/persistence/journal/WriteEventAdapter.html#manifest(event:Any):String "Permalink") abstract  def manifest(event: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): StringReturn the manifest (type hint) that will be provided in the `fromJournal` method.

Return the manifest (type hint) that will be provided in the `fromJournal` method.
Use `""` if manifest is not needed.
2. [**](../../../akka/persistence/journal/WriteEventAdapter.html#toJournal(event:Any):Any "Permalink") abstract  def toJournal(event: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)Convert domain event to journal event type.

Convert domain event to journal event type.

Some journal may require a specific type to be returned to them,
for example if a primary key has to be associated with each event then a journal
may require adapters to return `com.example.myjournal.EventWithPrimaryKey(event, key)`.

The `toJournal` adaptation must be an 1\-to\-1 transformation.
It is not allowed to drop incoming events during the `toJournal` adaptation.

eventthe application\-side domain event to be adapted to the journal model

returnsthe adapted event object, possibly the same object if no adaptation was performed
### Concrete Value Members

1. [**](../../../akka/persistence/journal/WriteEventAdapter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/journal/WriteEventAdapter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/journal/WriteEventAdapter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from WriteEventAdapter toany2stringadd\[WriteEventAdapter] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/journal/WriteEventAdapter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (WriteEventAdapter, B)ImplicitThis member is added by an implicit conversion from WriteEventAdapter toArrowAssoc\[WriteEventAdapter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/journal/WriteEventAdapter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/journal/WriteEventAdapter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/journal/WriteEventAdapter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
8. [**](../../../akka/persistence/journal/WriteEventAdapter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (WriteEventAdapter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): WriteEventAdapterImplicitThis member is added by an implicit conversion from WriteEventAdapter toEnsuring\[WriteEventAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/journal/WriteEventAdapter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (WriteEventAdapter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): WriteEventAdapterImplicitThis member is added by an implicit conversion from WriteEventAdapter toEnsuring\[WriteEventAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/journal/WriteEventAdapter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): WriteEventAdapterImplicitThis member is added by an implicit conversion from WriteEventAdapter toEnsuring\[WriteEventAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/journal/WriteEventAdapter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): WriteEventAdapterImplicitThis member is added by an implicit conversion from WriteEventAdapter toEnsuring\[WriteEventAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/journal/WriteEventAdapter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/journal/WriteEventAdapter.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/persistence/journal/WriteEventAdapter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
15. [**](../../../akka/persistence/journal/WriteEventAdapter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
16. [**](../../../akka/persistence/journal/WriteEventAdapter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/persistence/journal/WriteEventAdapter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/persistence/journal/WriteEventAdapter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
19. [**](../../../akka/persistence/journal/WriteEventAdapter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
20. [**](../../../akka/persistence/journal/WriteEventAdapter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/journal/WriteEventAdapter.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/persistence/journal/WriteEventAdapter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/journal/WriteEventAdapter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/persistence/journal/WriteEventAdapter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/journal/WriteEventAdapter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated @Deprecated Deprecated
2. [**](../../../akka/persistence/journal/WriteEventAdapter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from WriteEventAdapter toStringFormat\[WriteEventAdapter] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/journal/WriteEventAdapter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (WriteEventAdapter, B)ImplicitThis member is added by an implicit conversion from WriteEventAdapter toArrowAssoc\[WriteEventAdapter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromWriteEventAdapter to any2stringadd\[WriteEventAdapter]

### Inherited by implicit conversion StringFormat fromWriteEventAdapter to StringFormat\[WriteEventAdapter]

### Inherited by implicit conversion Ensuring fromWriteEventAdapter to Ensuring\[WriteEventAdapter]

### Inherited by implicit conversion ArrowAssoc fromWriteEventAdapter to ArrowAssoc\[WriteEventAdapter]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/AsyncReplayTimeoutException.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/EmptyEventSeq$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/EmptyEventSeq.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/EventSeq$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/EventsSeq.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/IdentityEventAdapter$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/JournalPerfSpec$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/JournalSpec$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/PersistencePluginProxy$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/PersistencePluginProxy.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/PersistencePluginProxyExtension$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/ReadEventAdapter.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/SingleEventSeq.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/Tagged.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/WriteEventAdapter.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/inmem/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/japi/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/journal/leveldb/index.html
- https://doc.akka.io/api/akka/2.8/index.html

---
*Source: [https://doc.akka.io/api/akka/2.8/akka/persistence/journal/WriteEventAdapter.html](https://doc.akka.io/api/akka/2.8/akka/persistence/journal/WriteEventAdapter.html)*