---
description: Akka 2.10.17 - akka.persistence.query.PersistenceQuery
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:46:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/PersistenceQuery.html
title: Akka 2.10.17 - akka.persistence.query.PersistenceQuery
---

# Akka 2.10.17 - akka.persistence.query.PersistenceQuery

> **Summary:** Akka 2.10.17 - akka.persistence.query.PersistenceQuery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/query/index.html "Permalink")  package [query](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/query/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[query](index.html)
- [**](../../../akka/persistence/query/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[query](index.html)
- [**](../../../akka/persistence/query/journal/index.html "Permalink")  package [journal](journal/index.html)Definition Classes[query](index.html)
- [**](../../../akka/persistence/query/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[query](index.html)
- [**](../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[query](index.html)
- [DeletedDurableState](DeletedDurableState.html)
- [DurableStateChange](DurableStateChange.html "The DurableStateStoreQuery stream elements for DurableStateStoreQuery.")
- [EventEnvelope](EventEnvelope.html "Event wrapper adding meta data for the events in the result stream of akka.persistence.query.scaladsl.EventsByTagQuery query, or similar queries.")
- [NoOffset](NoOffset$.html "Used when retrieving all events.")
- [Offset](Offset.html)
- PersistenceQuery
- [QueryCorrelationId](QueryCorrelationId$.html "(Optional) mechanism for query implementations to pick up a correlation id from the caller, to use in logging and error messages.")
- [ReadJournalProvider](ReadJournalProvider.html "A query plugin must implement a class that implements this trait.")
- [Sequence](Sequence.html "Corresponds to an ordered sequence number for the events.")
- [TimeBasedUUID](TimeBasedUUID.html "Corresponds to an ordered unique identifier of the events.")
- [TimestampOffset](TimestampOffset.html "Timestamp based offset.")
- [TimestampOffsetBySlice](TimestampOffsetBySlice.html "Timestamp-based offset by slice.")
- [UpdatedDurableState](UpdatedDurableState.html)
[c](PersistenceQuery$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[query](index.html)

# [PersistenceQuery](PersistenceQuery$.html "See companion object")[**](../../../akka/persistence/query/PersistenceQuery.html "Permalink")

### Companion [object PersistenceQuery](PersistenceQuery$.html "See companion object")

#### class PersistenceQuery extends PersistencePlugin\[[ReadJournal](scaladsl/ReadJournal.html), [ReadJournal](javadsl/ReadJournal.html), [ReadJournalProvider](ReadJournalProvider.html)] with [Extension](../../actor/Extension.html)

Source[PersistenceQuery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/PersistenceQuery.scala#L38)Linear Supertypes[Extension](../../actor/Extension.html), PersistencePlugin\[[ReadJournal](scaladsl/ReadJournal.html), [ReadJournal](javadsl/ReadJournal.html), [ReadJournalProvider](ReadJournalProvider.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistenceQuery
2. Extension
3. PersistencePlugin
4. AnyRef
5. Any
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

1. [**](../../../akka/persistence/query/PersistenceQuery.html#<init>(system:akka.actor.ExtendedActorSystem):akka.persistence.query.PersistenceQuery "Permalink")  new PersistenceQuery(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/persistence/query/PersistenceQuery.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/query/PersistenceQuery.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/query/PersistenceQuery.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistenceQuery toany2stringadd\[PersistenceQuery] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/query/PersistenceQuery.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistenceQuery, B)ImplicitThis member is added by an implicit conversion from PersistenceQuery toArrowAssoc\[PersistenceQuery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/query/PersistenceQuery.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/query/PersistenceQuery.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/query/PersistenceQuery.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/query/PersistenceQuery.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistenceQuery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceQueryImplicitThis member is added by an implicit conversion from PersistenceQuery toEnsuring\[PersistenceQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/query/PersistenceQuery.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistenceQuery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceQueryImplicitThis member is added by an implicit conversion from PersistenceQuery toEnsuring\[PersistenceQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/query/PersistenceQuery.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceQueryImplicitThis member is added by an implicit conversion from PersistenceQuery toEnsuring\[PersistenceQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/query/PersistenceQuery.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceQueryImplicitThis member is added by an implicit conversion from PersistenceQuery toEnsuring\[PersistenceQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/query/PersistenceQuery.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/query/PersistenceQuery.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/persistence/query/PersistenceQuery.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/query/PersistenceQuery.html#getReadJournalFor[T<:akka.persistence.query.javadsl.ReadJournal](clazz:Class[T],readJournalPluginId:String):T "Permalink") final  def getReadJournalFor\[T \<: [ReadJournal](javadsl/ReadJournal.html)](clazz: Class\[T], readJournalPluginId: String): T
16. [**](../../../akka/persistence/query/PersistenceQuery.html#getReadJournalFor[T<:akka.persistence.query.javadsl.ReadJournal](clazz:Class[T],readJournalPluginId:String,readJournalPluginConfig:com.typesafe.config.Config):T "Permalink") final  def getReadJournalFor\[T \<: [ReadJournal](javadsl/ReadJournal.html)](clazz: Class\[T], readJournalPluginId: String, readJournalPluginConfig: Config): TJava API: Returns the [akka.persistence.query.javadsl.ReadJournal](javadsl/ReadJournal.html) specified by the given
read journal configuration entry.
17. [**](../../../akka/persistence/query/PersistenceQuery.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/persistence/query/PersistenceQuery.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/persistence/query/PersistenceQuery.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/persistence/query/PersistenceQuery.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/persistence/query/PersistenceQuery.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/persistence/query/PersistenceQuery.html#pluginFor(pluginId:String,readJournalPluginConfig:com.typesafe.config.Config):akka.persistence.PersistencePlugin.PluginHolder[ScalaDsl,JavaDsl] "Permalink") final  def pluginFor(pluginId: String, readJournalPluginConfig: Config): PluginHolder\[[ReadJournal](scaladsl/ReadJournal.html), [ReadJournal](javadsl/ReadJournal.html)]Attributesprotected Definition ClassesPersistencePluginAnnotations@tailrec()
23. [**](../../../akka/persistence/query/PersistenceQuery.html#readJournalFor[T<:akka.persistence.query.scaladsl.ReadJournal](readJournalPluginId:String):T "Permalink") final  def readJournalFor\[T \<: [ReadJournal](scaladsl/ReadJournal.html)](readJournalPluginId: String): TScala API: Returns the [akka.persistence.query.scaladsl.ReadJournal](scaladsl/ReadJournal.html) specified by the given
read journal configuration entry.
24. [**](../../../akka/persistence/query/PersistenceQuery.html#readJournalFor[T<:akka.persistence.query.scaladsl.ReadJournal](readJournalPluginId:String,readJournalPluginConfig:com.typesafe.config.Config):T "Permalink") final  def readJournalFor\[T \<: [ReadJournal](scaladsl/ReadJournal.html)](readJournalPluginId: String, readJournalPluginConfig: Config): TScala API: Returns the [akka.persistence.query.scaladsl.ReadJournal](scaladsl/ReadJournal.html) specified by the given
read journal configuration entry.

Scala API: Returns the [akka.persistence.query.scaladsl.ReadJournal](scaladsl/ReadJournal.html) specified by the given
read journal configuration entry.

The provided readJournalPluginConfig will be used to configure the journal plugin instead of the actor system
config.
25. [**](../../../akka/persistence/query/PersistenceQuery.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../akka/persistence/query/PersistenceQuery.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../akka/persistence/query/PersistenceQuery.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/persistence/query/PersistenceQuery.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../akka/persistence/query/PersistenceQuery.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/query/PersistenceQuery.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/query/PersistenceQuery.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistenceQuery toStringFormat\[PersistenceQuery] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/query/PersistenceQuery.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistenceQuery, B)ImplicitThis member is added by an implicit conversion from PersistenceQuery toArrowAssoc\[PersistenceQuery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../actor/Extension.html)

### Inherited from PersistencePlugin\[[ReadJournal](scaladsl/ReadJournal.html), [ReadJournal](javadsl/ReadJournal.html), [ReadJournalProvider](ReadJournalProvider.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistenceQuery to any2stringadd\[PersistenceQuery]

### Inherited by implicit conversion StringFormat fromPersistenceQuery to StringFormat\[PersistenceQuery]

### Inherited by implicit conversion Ensuring fromPersistenceQuery to Ensuring\[PersistenceQuery]

### Inherited by implicit conversion ArrowAssoc fromPersistenceQuery to ArrowAssoc\[PersistenceQuery]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/DeletedDurableState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/EventEnvelope$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/NoOffset$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/Offset$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/PersistenceQuery$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/QueryCorrelationId$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/Sequence.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/TimeBasedUUID.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/TimestampOffset$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/TimestampOffsetBySlice$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/TimestampOffsetBySlice.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/UpdatedDurableState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/journal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/PersistenceQuery.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/PersistenceQuery.html)*