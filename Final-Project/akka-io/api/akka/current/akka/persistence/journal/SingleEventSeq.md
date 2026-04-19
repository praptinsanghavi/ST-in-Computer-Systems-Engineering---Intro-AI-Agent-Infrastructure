---
description: Akka 2.10.17 - akka.persistence.journal.SingleEventSeq
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:54:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/SingleEventSeq.html
title: Akka 2.10.17 - akka.persistence.journal.SingleEventSeq
---

# Akka 2.10.17 - akka.persistence.journal.SingleEventSeq

> **Summary:** Akka 2.10.17 - akka.persistence.journal.SingleEventSeq

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
- SingleEventSeq
- [Tagged](Tagged.html "The journal may support tagging of events that are used by the EventsByTag query and it may support specifying the tags via an akka.persistence.journal.EventAdapter that wraps the events in a Tagged with the given tags.")
- [WriteEventAdapter](WriteEventAdapter.html "Facility to convert to specialised data models, as may be required by specialized persistence Journals.")
c[akka](../../index.html).[persistence](../index.html).[journal](index.html)

# SingleEventSeq[**](../../../akka/persistence/journal/SingleEventSeq.html "Permalink")

### 

#### final  case class SingleEventSeq(event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [EventSeq](EventSeq.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[EventAdapter.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/journal/EventAdapter.scala#L102)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [EventSeq](EventSeq.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SingleEventSeq
2. Serializable
3. Product
4. Equals
5. EventSeq
6. AnyRef
7. Any
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

1. [**](../../../akka/persistence/journal/SingleEventSeq.html#<init>(event:Any):akka.persistence.journal.SingleEventSeq "Permalink")  new SingleEventSeq(event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))
### Value Members

1. [**](../../../akka/persistence/journal/SingleEventSeq.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/journal/SingleEventSeq.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/journal/SingleEventSeq.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SingleEventSeq toany2stringadd\[SingleEventSeq] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/journal/SingleEventSeq.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SingleEventSeq, B)ImplicitThis member is added by an implicit conversion from SingleEventSeq toArrowAssoc\[SingleEventSeq] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/journal/SingleEventSeq.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/journal/SingleEventSeq.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/journal/SingleEventSeq.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/journal/SingleEventSeq.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SingleEventSeq) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SingleEventSeqImplicitThis member is added by an implicit conversion from SingleEventSeq toEnsuring\[SingleEventSeq] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/journal/SingleEventSeq.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SingleEventSeq) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SingleEventSeqImplicitThis member is added by an implicit conversion from SingleEventSeq toEnsuring\[SingleEventSeq] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/journal/SingleEventSeq.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SingleEventSeqImplicitThis member is added by an implicit conversion from SingleEventSeq toEnsuring\[SingleEventSeq] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/journal/SingleEventSeq.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SingleEventSeqImplicitThis member is added by an implicit conversion from SingleEventSeq toEnsuring\[SingleEventSeq] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/journal/SingleEventSeq.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/journal/SingleEventSeq.html#event:Any "Permalink")  val event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)
14. [**](../../../akka/persistence/journal/SingleEventSeq.html#events:Seq[Any] "Permalink")  val events: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesSingleEventSeq → [EventSeq](EventSeq.html)
15. [**](../../../akka/persistence/journal/SingleEventSeq.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/journal/SingleEventSeq.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/persistence/journal/SingleEventSeq.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/persistence/journal/SingleEventSeq.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/persistence/journal/SingleEventSeq.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/journal/SingleEventSeq.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../akka/persistence/journal/SingleEventSeq.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/persistence/journal/SingleEventSeq.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesSingleEventSeq → AnyRef → Any
23. [**](../../../akka/persistence/journal/SingleEventSeq.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/persistence/journal/SingleEventSeq.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/persistence/journal/SingleEventSeq.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/journal/SingleEventSeq.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/journal/SingleEventSeq.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SingleEventSeq toStringFormat\[SingleEventSeq] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/journal/SingleEventSeq.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SingleEventSeq, B)ImplicitThis member is added by an implicit conversion from SingleEventSeq toArrowAssoc\[SingleEventSeq] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [EventSeq](EventSeq.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSingleEventSeq to any2stringadd\[SingleEventSeq]

### Inherited by implicit conversion StringFormat fromSingleEventSeq to StringFormat\[SingleEventSeq]

### Inherited by implicit conversion Ensuring fromSingleEventSeq to Ensuring\[SingleEventSeq]

### Inherited by implicit conversion ArrowAssoc fromSingleEventSeq to ArrowAssoc\[SingleEventSeq]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/journal/SingleEventSeq.html](https://doc.akka.io/api/akka/current/akka/persistence/journal/SingleEventSeq.html)*