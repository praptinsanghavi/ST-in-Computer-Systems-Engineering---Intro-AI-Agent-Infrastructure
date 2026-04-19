---
description: Akka Projection 1.6.20 - akka.projection.eventsourced.EventEnvelope
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/EventEnvelope.html
title: Akka Projection 1.6.20 - akka.projection.eventsourced.EventEnvelope
---

# Akka Projection 1.6.20 - akka.projection.eventsourced.EventEnvelope

> **Summary:** Akka Projection 1.6.20 - akka.projection.eventsourced.EventEnvelope

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/eventsourced/index.html "Permalink")  package [eventsourced](index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/eventsourced/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[eventsourced](index.html)
- [**](../../../akka/projection/eventsourced/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[eventsourced](index.html)
- EventEnvelope
[c](EventEnvelope$.html "See companion object")[akka](../../index.html).[projection](../index.html).[eventsourced](index.html)

# [EventEnvelope](EventEnvelope$.html "See companion object")[**](../../../akka/projection/eventsourced/EventEnvelope.html "Permalink")

### Companion [object EventEnvelope](EventEnvelope$.html "See companion object")

#### final  class EventEnvelope\[Event] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[EventEnvelope.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-eventsourced/src/main/scala/akka/projection/eventsourced/EventEnvelope.scala#L45)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventEnvelope
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/projection/eventsourced/EventEnvelope.html#<init>(offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Event,timestamp:Long):akka.projection.eventsourced.EventEnvelope[Event] "Permalink")  new EventEnvelope(offset: [Offset](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/Offset.html#akka.persistence.query.Offset), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), event: Event, timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))
### Value Members

1. [**](../../../akka/projection/eventsourced/EventEnvelope.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/projection/eventsourced/EventEnvelope.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/projection/eventsourced/EventEnvelope.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/projection/eventsourced/EventEnvelope.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/projection/eventsourced/EventEnvelope.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../akka/projection/eventsourced/EventEnvelope.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/projection/eventsourced/EventEnvelope.html#equals(other:Any):Boolean "Permalink")  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesEventEnvelope → AnyRef → Any
8. [**](../../../akka/projection/eventsourced/EventEnvelope.html#event:Event "Permalink")  val event: Event
9. [**](../../../akka/projection/eventsourced/EventEnvelope.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../akka/projection/eventsourced/EventEnvelope.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesEventEnvelope → AnyRef → Any
11. [**](../../../akka/projection/eventsourced/EventEnvelope.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/projection/eventsourced/EventEnvelope.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/projection/eventsourced/EventEnvelope.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../akka/projection/eventsourced/EventEnvelope.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
15. [**](../../../akka/projection/eventsourced/EventEnvelope.html#offset:akka.persistence.query.Offset "Permalink")  val offset: [Offset](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/Offset.html#akka.persistence.query.Offset)
16. [**](../../../akka/projection/eventsourced/EventEnvelope.html#persistenceId:String "Permalink")  val persistenceId: String
17. [**](../../../akka/projection/eventsourced/EventEnvelope.html#sequenceNr:Long "Permalink")  val sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
18. [**](../../../akka/projection/eventsourced/EventEnvelope.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../akka/projection/eventsourced/EventEnvelope.html#timestamp:Long "Permalink")  val timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
20. [**](../../../akka/projection/eventsourced/EventEnvelope.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../akka/projection/eventsourced/EventEnvelope.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/projection/eventsourced/EventEnvelope.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../akka/projection/eventsourced/EventEnvelope.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/projection/eventsourced/EventEnvelope.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/EventEnvelope$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/EventEnvelope.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/EventEnvelope.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/EventEnvelope.html)*