---
description: Akka 2.9.8 - akka.persistence.query.typed.EventEnvelope
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/query/typed/EventEnvelope.html
title: Akka 2.9.8 - akka.persistence.query.typed.EventEnvelope
---

# Akka 2.9.8 - akka.persistence.query.typed.EventEnvelope

> **Summary:** Akka 2.9.8 - akka.persistence.query.typed.EventEnvelope

## Content

Akka2\.9\.8 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/query/index.html "Permalink")  package [query](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/persistence/query/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[typed](index.html)
- EventEnvelope
- [EventsBySliceFirehoseReadJournalProvider](EventsBySliceFirehoseReadJournalProvider.html)
[c](EventEnvelope$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[query](../index.html).[typed](index.html)

# [EventEnvelope](EventEnvelope$.html "See companion object")[**](../../../../akka/persistence/query/typed/EventEnvelope.html "Permalink")

### Companion [object EventEnvelope](EventEnvelope$.html "See companion object")

#### final  class EventEnvelope\[Event] extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)

Event wrapper adding meta data for the events in the result stream of
[akka.persistence.query.typed.scaladsl.EventsBySliceQuery](scaladsl/EventsBySliceQuery.html) query, or similar queries.

If the `event` is not defined it has not been loaded yet. It can be loaded with
[akka.persistence.query.typed.scaladsl.LoadEventQuery](scaladsl/LoadEventQuery.html).

The `timestamp` is the time the event was stored, in milliseconds since midnight, January 1, 1970 UTC (same as
`System.currentTimeMillis`).

It is an improved `EventEnvelope` compared to [akka.persistence.query.EventEnvelope](../EventEnvelope.html).

Source[EventEnvelope.scala](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-query/src/main/scala/akka/persistence/query/typed/EventEnvelope.scala#L123)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventEnvelope
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

1. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#<init>(offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,eventOption:Option[Event],timestamp:Long,eventMetadata:Option[Any],entityType:String,slice:Int):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  new EventEnvelope(offset: [Offset](../Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), eventOption: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[Event], timestamp: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), eventMetadata: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)], entityType: String, slice: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int))
2. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#<init>(offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,eventOption:Option[Event],timestamp:Long,eventMetadata:Option[Any],entityType:String,slice:Int,filtered:Boolean,source:String):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  new EventEnvelope(offset: [Offset](../Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), eventOption: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[Event], timestamp: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), eventMetadata: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)], entityType: String, slice: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int), filtered: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), source: String)
3. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#<init>(offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,eventOption:Option[Event],timestamp:Long,eventMetadata:Option[Any],entityType:String,slice:Int,filtered:Boolean,source:String,tags:Set[String]):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  new EventEnvelope(offset: [Offset](../Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), eventOption: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[Event], timestamp: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), eventMetadata: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)], entityType: String, slice: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int), filtered: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), source: String, tags: Set\[String])
### Value Members

1. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/query/typed/EventEnvelope.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventEnvelope\[Event] toany2stringadd\[EventEnvelope\[Event]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventEnvelope\[Event], B)ImplicitThis member is added by an implicit conversion from EventEnvelope\[Event] toArrowAssoc\[EventEnvelope\[Event]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventEnvelope\[Event]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): EventEnvelope\[Event]ImplicitThis member is added by an implicit conversion from EventEnvelope\[Event] toEnsuring\[EventEnvelope\[Event]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventEnvelope\[Event]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)): EventEnvelope\[Event]ImplicitThis member is added by an implicit conversion from EventEnvelope\[Event] toEnsuring\[EventEnvelope\[Event]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): EventEnvelope\[Event]ImplicitThis member is added by an implicit conversion from EventEnvelope\[Event] toEnsuring\[EventEnvelope\[Event]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)): EventEnvelope\[Event]ImplicitThis member is added by an implicit conversion from EventEnvelope\[Event] toEnsuring\[EventEnvelope\[Event]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#entityType:String "Permalink")  val entityType: String
13. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesEventEnvelope → AnyRef → Any
15. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#event:Event "Permalink")  def event: Event
16. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#eventMetadata:Option[Any] "Permalink")  val eventMetadata: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)]
17. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#eventOption:Option[Event] "Permalink")  val eventOption: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[Event]
18. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#filtered:Boolean "Permalink")  val filtered: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)
19. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#getEvent():Event "Permalink")  def getEvent(): EventJava API
21. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#getEventMetaData():java.util.Optional[AnyRef] "Permalink")  def getEventMetaData(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)]Java API
22. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#getOptionalEvent():java.util.Optional[Event] "Permalink")  def getOptionalEvent(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Event]Java API
23. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#getTags():java.util.Set[String] "Permalink")  def getTags(): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Java API:
24. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesEventEnvelope → AnyRef → Any
25. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#offset:akka.persistence.query.Offset "Permalink")  val offset: [Offset](../Offset.html)
30. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#persistenceId:String "Permalink")  val persistenceId: String
31. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#sequenceNr:Long "Permalink")  val sequenceNr: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long)
32. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#slice:Int "Permalink")  val slice: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)
33. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#source:String "Permalink")  val source: String
34. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
35. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#tags:Set[String] "Permalink")  val tags: Set\[String]
36. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#timestamp:Long "Permalink")  val timestamp: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long)
37. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#toString():String "Permalink")  def toString(): StringDefinition ClassesEventEnvelope → AnyRef → Any
38. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
39. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
40. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#withEvent(event:Event):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  def withEvent(event: Event): EventEnvelope\[Event]
42. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#withEventOption(eventOption:Option[Event]):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  def withEventOption(eventOption: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[Event]): EventEnvelope\[Event]
43. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#withMetadata(metadata:Any):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  def withMetadata(metadata: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): EventEnvelope\[Event]
44. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#withPersistenceId(persistenceId:String,entityType:String,slice:Int):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  def withPersistenceId(persistenceId: String, entityType: String, slice: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)): EventEnvelope\[Event]`entityType` and `slice` should be derived from the `persistenceId`, but must be explicitly defined
when changing the `persistenceId` of the envelope.

`entityType` and `slice` should be derived from the `persistenceId`, but must be explicitly defined
when changing the `persistenceId` of the envelope.
The `slice` should be calculated with [akka.persistence.Persistence.sliceForPersistenceId](../../Persistence.html#sliceForPersistenceId(persistenceId:String):Int) for
the given `persistenceId`.
The `entityType` should be extracted from the `persistenceId` with
`akka.persistence.typed.PersistenceId.extractEntityType`.
45. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#withTags(tags:Set[String]):akka.persistence.query.typed.EventEnvelope[Event] "Permalink")  def withTags(tags: Set\[String]): EventEnvelope\[Event]
### Deprecated Value Members

1. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventEnvelope\[Event] toStringFormat\[EventEnvelope\[Event]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/query/typed/EventEnvelope.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventEnvelope\[Event], B)ImplicitThis member is added by an implicit conversion from EventEnvelope\[Event] toArrowAssoc\[EventEnvelope\[Event]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventEnvelope\[Event] to any2stringadd\[EventEnvelope\[Event]]

### Inherited by implicit conversion StringFormat fromEventEnvelope\[Event] to StringFormat\[EventEnvelope\[Event]]

### Inherited by implicit conversion Ensuring fromEventEnvelope\[Event] to Ensuring\[EventEnvelope\[Event]]

### Inherited by implicit conversion ArrowAssoc fromEventEnvelope\[Event] to ArrowAssoc\[EventEnvelope\[Event]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.9/akka/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/Persistence.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/typed/EventEnvelope$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/typed/scaladsl/LoadEventQuery.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.9/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/typed/EventEnvelope.html](https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/typed/EventEnvelope.html)*