---
description: Akka 2.10.17 - akka.persistence.query.typed.EventEnvelope
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:45:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/typed/EventEnvelope$.html
title: Akka 2.10.17 - akka.persistence.query.typed.EventEnvelope
---

# Akka 2.10.17 - akka.persistence.query.typed.EventEnvelope

> **Summary:** Akka 2.10.17 - akka.persistence.query.typed.EventEnvelope

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/query/index.html "Permalink")  package [query](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/persistence/query/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[typed](index.html)
- [EventEnvelope](EventEnvelope.html "Event wrapper adding meta data for the events in the result stream of akka.persistence.query.typed.scaladsl.EventsBySliceQuery query, or similar queries.")
- [EventsBySliceFirehoseReadJournalProvider](EventsBySliceFirehoseReadJournalProvider.html)
[o](EventEnvelope.html "See companion class")[akka](../../../index.html).[persistence](../../index.html).[query](../index.html).[typed](index.html)

# [EventEnvelope](EventEnvelope.html "See companion class")[**](../../../../akka/persistence/query/typed/EventEnvelope$.html "Permalink")

### Companion [class EventEnvelope](EventEnvelope.html "See companion class")

#### object EventEnvelope

Source[EventEnvelope.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/typed/EventEnvelope.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventEnvelope
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#apply[Event](offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Event,timestamp:Long,entityType:String,slice:Int):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  def apply\[Event](offset: [Offset](../Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), event: Event, timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), entityType: String, slice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [EventEnvelope](EventEnvelope.html)\[Event]
5. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#apply[Event](offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Event,timestamp:Long,entityType:String,slice:Int,filtered:Boolean,source:String):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  def apply\[Event](offset: [Offset](../Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), event: Event, timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), entityType: String, slice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), filtered: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), source: String): [EventEnvelope](EventEnvelope.html)\[Event]
6. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#apply[Event](offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Event,timestamp:Long,entityType:String,slice:Int,filtered:Boolean,source:String,tags:Set[String]):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  def apply\[Event](offset: [Offset](../Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), event: Event, timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), entityType: String, slice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), filtered: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), source: String, tags: Set\[String]): [EventEnvelope](EventEnvelope.html)\[Event]
7. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#create[Event](offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Event,timestamp:Long,entityType:String,slice:Int):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  def create\[Event](offset: [Offset](../Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), event: Event, timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), entityType: String, slice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [EventEnvelope](EventEnvelope.html)\[Event]
10. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#create[Event](offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Event,timestamp:Long,entityType:String,slice:Int,filtered:Boolean,source:String):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  def create\[Event](offset: [Offset](../Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), event: Event, timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), entityType: String, slice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), filtered: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), source: String): [EventEnvelope](EventEnvelope.html)\[Event]
11. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#create[Event](offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Event,timestamp:Long,entityType:String,slice:Int,filtered:Boolean,source:String,tags:java.util.Set[String]):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  def create\[Event](offset: [Offset](../Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), event: Event, timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), entityType: String, slice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), filtered: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), source: String, tags: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]): [EventEnvelope](EventEnvelope.html)\[Event]
12. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#unapply[Event](arg:akka.persistence.query.typed.EventEnvelope[Event]):Option[(akka.persistence.query.Offset,String,Long,Option[Event],Long)] "Permalink")  def unapply\[Event](arg: [EventEnvelope](EventEnvelope.html)\[Event]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[([Offset](../Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Event], [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))]
23. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventEnvelope$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventEnvelope$.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventEnvelope$.html)*