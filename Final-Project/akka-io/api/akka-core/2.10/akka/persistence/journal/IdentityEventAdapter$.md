---
description: Akka 2.10.17 - akka.persistence.journal.IdentityEventAdapter
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:21:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/IdentityEventAdapter$.html
title: Akka 2.10.17 - akka.persistence.journal.IdentityEventAdapter
---

# Akka 2.10.17 - akka.persistence.journal.IdentityEventAdapter

> **Summary:** Akka 2.10.17 - akka.persistence.journal.IdentityEventAdapter

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
- [EventAdapters](EventAdapters.html "EventAdapters serves as a per-journal collection of bound event adapters.")
- [EventSeq](EventSeq.html)
- [EventsSeq](EventsSeq.html)
- IdentityEventAdapter
- [JournalPerfSpec](JournalPerfSpec.html "This spec measures execution times of the basic operations that an akka.persistence.PersistentActor provides, using the provided Journal (plugin).")
- [JournalSpec](JournalSpec.html "This spec aims to verify custom akka-persistence Journal implementations.")
- [PersistencePluginProxy](PersistencePluginProxy.html)
- [PersistencePluginProxyExtension](PersistencePluginProxyExtension$.html)
- [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "PersistencePluginProxyExtensionImpl is an Extension that enables initialization of the PersistencePluginProxy via configuration, without requiring any code changes or the creation of any actors.")
- [ReadEventAdapter](ReadEventAdapter.html "Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.")
- [SingleEventSeq](SingleEventSeq.html)
- [Tagged](Tagged.html "The journal may support tagging of events that are used by the EventsByTag query and it may support specifying the tags via an akka.persistence.journal.EventAdapter that wraps the events in a Tagged with the given tags.")
- [WriteEventAdapter](WriteEventAdapter.html "Facility to convert to specialised data models, as may be required by specialized persistence Journals.")
o[akka](../../index.html).[persistence](../index.html).[journal](index.html)

# IdentityEventAdapter[**](../../../akka/persistence/journal/IdentityEventAdapter$.html "Permalink")

### 

#### case object IdentityEventAdapter extends [EventAdapter](EventAdapter.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

No\-op model adapter which passes through the incoming events as\-is.

Source[EventAdapter.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/journal/EventAdapter.scala#L115)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [EventAdapter](EventAdapter.html), [ReadEventAdapter](ReadEventAdapter.html), [WriteEventAdapter](WriteEventAdapter.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. IdentityEventAdapter
2. Serializable
3. Product
4. Equals
5. EventAdapter
6. ReadEventAdapter
7. WriteEventAdapter
8. AnyRef
9. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#fromJournal(event:Any,manifest:String):akka.persistence.journal.EventSeq "Permalink")  def fromJournal(event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), manifest: String): [EventSeq](EventSeq.html)Convert a event from its journal model to the applications domain model.

Convert a event from its journal model to the applications domain model.

One event may be adapter into multiple (or none) events which should be delivered to the [akka.persistence.PersistentActor](../PersistentActor.html).
Use the specialised [akka.persistence.journal.EventSeq\#single](EventSeq$.html#single(event:Any):akka.persistence.journal.EventSeq) method to emit exactly one event,
or [akka.persistence.journal.EventSeq\#empty](EventSeq$.html#empty:akka.persistence.journal.EventSeq) in case the adapter is not handling this event. Multiple [EventAdapter](EventAdapter.html) instances are
applied in order as defined in configuration and their emitted event seqs are concatenated and delivered in order
to the PersistentActor.

eventevent to be adapted before delivering to the PersistentActor

manifestoptionally provided manifest (type hint) in case the Adapter has stored one for this event, `""` if none

returnssequence containing the adapted events (possibly zero) which will be delivered to the PersistentActor

Definition ClassesIdentityEventAdapter → [ReadEventAdapter](ReadEventAdapter.html)
9. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#manifest(event:Any):String "Permalink")  def manifest(event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StringReturn the manifest (type hint) that will be provided in the `fromJournal` method.

Return the manifest (type hint) that will be provided in the `fromJournal` method.
Use `""` if manifest is not needed.

Definition ClassesIdentityEventAdapter → [WriteEventAdapter](WriteEventAdapter.html)
12. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
16. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
17. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#toJournal(event:Any):Any "Permalink")  def toJournal(event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Convert domain event to journal event type.

Convert domain event to journal event type.

Some journal may require a specific type to be returned to them,
for example if a primary key has to be associated with each event then a journal
may require adapters to return `com.example.myjournal.EventWithPrimaryKey(event, key)`.

The `toJournal` adaptation must be an 1\-to\-1 transformation.
It is not allowed to drop incoming events during the `toJournal` adaptation.

eventthe application\-side domain event to be adapted to the journal model

returnsthe adapted event object, possibly the same object if no adaptation was performed

Definition ClassesIdentityEventAdapter → [WriteEventAdapter](WriteEventAdapter.html)
19. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [EventAdapter](EventAdapter.html)

### Inherited from [ReadEventAdapter](ReadEventAdapter.html)

### Inherited from [WriteEventAdapter](WriteEventAdapter.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/IdentityEventAdapter$.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/IdentityEventAdapter$.html)*