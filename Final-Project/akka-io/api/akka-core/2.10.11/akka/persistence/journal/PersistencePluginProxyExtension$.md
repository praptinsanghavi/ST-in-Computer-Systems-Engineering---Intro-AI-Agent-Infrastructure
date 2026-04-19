---
description: Akka 2.10.11 - akka.persistence.journal.PersistencePluginProxyExtension
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/PersistencePluginProxyExtension$.html
title: Akka 2.10.11 - akka.persistence.journal.PersistencePluginProxyExtension
---

# Akka 2.10.11 - akka.persistence.journal.PersistencePluginProxyExtension

> **Summary:** Akka 2.10.11 - akka.persistence.journal.PersistencePluginProxyExtension

## Content

Akka2\.10\.11 \< Back****# Packages

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
- PersistencePluginProxyExtension
- [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "PersistencePluginProxyExtensionImpl is an Extension that enables initialization of the PersistencePluginProxy via configuration, without requiring any code changes or the creation of any actors.")
- [ReadEventAdapter](ReadEventAdapter.html "Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.")
- [SingleEventSeq](SingleEventSeq.html)
- [Tagged](Tagged.html "The journal may support tagging of events that are used by the EventsByTag query and it may support specifying the tags via an akka.persistence.journal.EventAdapter that wraps the events in a Tagged with the given tags.")
- [WriteEventAdapter](WriteEventAdapter.html "Facility to convert to specialised data models, as may be required by specialized persistence Journals.")
o[akka](../../index.html).[persistence](../index.html).[journal](index.html)

# PersistencePluginProxyExtension[**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html "Permalink")

### 

#### object PersistencePluginProxyExtension extends [ExtensionId](../../actor/ExtensionId.html)\[[PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)

Source[PersistencePluginProxy.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-persistence/src/main/scala/akka/persistence/journal/PersistencePluginProxy.scala#L65)Linear Supertypes[ExtensionIdProvider](../../actor/ExtensionIdProvider.html), [ExtensionId](../../actor/ExtensionId.html)\[[PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistencePluginProxyExtension
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../actor/ExtensionId.html)
5. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../../actor/ActorSystem.html)): [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../actor/ExtensionId.html)
6. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.persistence.journal.PersistencePluginProxyExtensionImpl "Permalink")  def createExtension(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html)): [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesPersistencePluginProxyExtension → [ExtensionId](../../actor/ExtensionId.html)
9. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../actor/ExtensionId.html) → AnyRef → Any
11. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.persistence.journal.PersistencePluginProxyExtensionImpl "Permalink")  def get(system: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesPersistencePluginProxyExtension → [ExtensionId](../../actor/ExtensionId.html)
12. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#get(system:akka.actor.ActorSystem):akka.persistence.journal.PersistencePluginProxyExtensionImpl "Permalink")  def get(system: [ActorSystem](../../actor/ActorSystem.html)): [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ActorSystem): TheExtension = super.get(system)
```
Definition ClassesPersistencePluginProxyExtension → [ExtensionId](../../actor/ExtensionId.html)
13. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../actor/ExtensionId.html) → AnyRef → Any
15. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#lookup:akka.actor.ExtensionId[_<:akka.actor.Extension] "Permalink")  def lookup: [ExtensionId](../../actor/ExtensionId.html)\[\_ \<: [Extension](../../actor/Extension.html)]Returns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesPersistencePluginProxyExtension → [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)
17. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../../actor/ExtensionId.html)\[[PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/AsyncReplay.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/AsyncReplayTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/EmptyEventSeq$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/EmptyEventSeq.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/EventSeq$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/EventsSeq.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/IdentityEventAdapter$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/JournalPerfSpec$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/JournalSpec$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/PersistencePluginProxy$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/PersistencePluginProxy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/PersistencePluginProxyExtension$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/ReadEventAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/SingleEventSeq.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/Tagged.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/WriteEventAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/inmem/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/leveldb/index.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/PersistencePluginProxyExtension$.html](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/journal/PersistencePluginProxyExtension$.html)*