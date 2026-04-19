---
description: Akka 2.10.17 - akka.persistence.query.typed.EventsBySliceFirehoseReadJournalProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:51:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html
title: Akka 2.10.17 - akka.persistence.query.typed.EventsBySliceFirehoseReadJournalProvider
---

# Akka 2.10.17 - akka.persistence.query.typed.EventsBySliceFirehoseReadJournalProvider

> **Summary:** Akka 2.10.17 - akka.persistence.query.typed.EventsBySliceFirehoseReadJournalProvider

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
- EventsBySliceFirehoseReadJournalProvider
c[akka](../../../index.html).[persistence](../../index.html).[query](../index.html).[typed](index.html)

# EventsBySliceFirehoseReadJournalProvider[**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html "Permalink")

### 

#### final  class EventsBySliceFirehoseReadJournalProvider extends [ReadJournalProvider](../ReadJournalProvider.html)

Source[EventsBySliceFirehoseReadJournalProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.scala#L12)Linear Supertypes[ReadJournalProvider](../ReadJournalProvider.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventsBySliceFirehoseReadJournalProvider
2. ReadJournalProvider
3. AnyRef
4. Any
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

1. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#<init>(system:akka.actor.ExtendedActorSystem,config:com.typesafe.config.Config,cfgPath:String):akka.persistence.query.typed.EventsBySliceFirehoseReadJournalProvider "Permalink")  new EventsBySliceFirehoseReadJournalProvider(system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html), config: Config, cfgPath: String)
### Value Members

1. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseReadJournalProvider toany2stringadd\[EventsBySliceFirehoseReadJournalProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventsBySliceFirehoseReadJournalProvider, B)ImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseReadJournalProvider toArrowAssoc\[EventsBySliceFirehoseReadJournalProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventsBySliceFirehoseReadJournalProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventsBySliceFirehoseReadJournalProviderImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseReadJournalProvider toEnsuring\[EventsBySliceFirehoseReadJournalProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventsBySliceFirehoseReadJournalProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventsBySliceFirehoseReadJournalProviderImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseReadJournalProvider toEnsuring\[EventsBySliceFirehoseReadJournalProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventsBySliceFirehoseReadJournalProviderImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseReadJournalProvider toEnsuring\[EventsBySliceFirehoseReadJournalProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventsBySliceFirehoseReadJournalProviderImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseReadJournalProvider toEnsuring\[EventsBySliceFirehoseReadJournalProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#javadslReadJournal():akka.persistence.query.typed.javadsl.EventsBySliceFirehoseQuery "Permalink")  def javadslReadJournal(): [EventsBySliceFirehoseQuery](javadsl/EventsBySliceFirehoseQuery.html)The `ReadJournal` implementation for the Java API.

The `ReadJournal` implementation for the Java API.
This corresponds to the instance that is returned by [PersistenceQuery\#getReadJournalFor](../PersistenceQuery.html#getReadJournalFor[T<:akka.persistence.query.javadsl.ReadJournal](clazz:Class[T],readJournalPluginId:String):T).

Definition ClassesEventsBySliceFirehoseReadJournalProvider → [ReadJournalProvider](../ReadJournalProvider.html)
18. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#scaladslReadJournal():akka.persistence.query.typed.scaladsl.EventsBySliceFirehoseQuery "Permalink")  def scaladslReadJournal(): [EventsBySliceFirehoseQuery](scaladsl/EventsBySliceFirehoseQuery.html)The `ReadJournal` implementation for the Scala API.

The `ReadJournal` implementation for the Scala API.
This corresponds to the instance that is returned by [PersistenceQuery\#readJournalFor](../PersistenceQuery.html#readJournalFor[T<:akka.persistence.query.scaladsl.ReadJournal](readJournalPluginId:String):T).

Definition ClassesEventsBySliceFirehoseReadJournalProvider → [ReadJournalProvider](../ReadJournalProvider.html)
22. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseReadJournalProvider toStringFormat\[EventsBySliceFirehoseReadJournalProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventsBySliceFirehoseReadJournalProvider, B)ImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseReadJournalProvider toArrowAssoc\[EventsBySliceFirehoseReadJournalProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ReadJournalProvider](../ReadJournalProvider.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventsBySliceFirehoseReadJournalProvider to any2stringadd\[EventsBySliceFirehoseReadJournalProvider]

### Inherited by implicit conversion StringFormat fromEventsBySliceFirehoseReadJournalProvider to StringFormat\[EventsBySliceFirehoseReadJournalProvider]

### Inherited by implicit conversion Ensuring fromEventsBySliceFirehoseReadJournalProvider to Ensuring\[EventsBySliceFirehoseReadJournalProvider]

### Inherited by implicit conversion ArrowAssoc fromEventsBySliceFirehoseReadJournalProvider to ArrowAssoc\[EventsBySliceFirehoseReadJournalProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/EventEnvelope$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html](https://doc.akka.io/api/akka/current/akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html)*