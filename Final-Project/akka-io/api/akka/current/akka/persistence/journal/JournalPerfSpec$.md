---
description: Akka 2.10.17 - akka.persistence.journal.JournalPerfSpec
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:53:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/JournalPerfSpec$.html
title: Akka 2.10.17 - akka.persistence.journal.JournalPerfSpec
---

# Akka 2.10.17 - akka.persistence.journal.JournalPerfSpec

> **Summary:** Akka 2.10.17 - akka.persistence.journal.JournalPerfSpec

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
[o](JournalPerfSpec.html "See companion class")[akka](../../index.html).[persistence](../index.html).[journal](index.html)

# [JournalPerfSpec](JournalPerfSpec.html "See companion class")[**](../../../akka/persistence/journal/JournalPerfSpec$.html "Permalink")

### Companion [class JournalPerfSpec](JournalPerfSpec.html "See companion class")

#### object JournalPerfSpec extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[JournalPerfSpec.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-tck/src/main/scala/akka/persistence/journal/JournalPerfSpec.scala#L26)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JournalPerfSpec
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/persistence/journal/JournalPerfSpec$$BenchActor.html "Permalink")  class [BenchActor](JournalPerfSpec$$BenchActor.html) extends [PersistentActor](../PersistentActor.html) with [ActorLogging](../../actor/ActorLogging.html)
2. [**](../../../akka/persistence/journal/JournalPerfSpec$$Cmd.html "Permalink")  case class [Cmd](JournalPerfSpec$$Cmd.html)(mode: String, payload: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/journal/JournalPerfSpec$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/persistence/journal/JournalPerfSpec$$ResetCounter$.html "Permalink")  case object [ResetCounter](JournalPerfSpec$$ResetCounter$.html) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../../akka/persistence/journal/JournalPerfSpec$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/AsyncReplay.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/AsyncReplayTimeoutException.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EmptyEventSeq$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EmptyEventSeq.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EventSeq$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EventsSeq.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/IdentityEventAdapter$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalPerfSpec$$BenchActor.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalPerfSpec$$Cmd.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalPerfSpec$$ResetCounter$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalPerfSpec$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalSpec$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/PersistencePluginProxy$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/PersistencePluginProxy.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/PersistencePluginProxyExtension$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/ReadEventAdapter.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/SingleEventSeq.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/Tagged.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/WriteEventAdapter.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/inmem/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/japi/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/leveldb/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalPerfSpec$.html](https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalPerfSpec$.html)*