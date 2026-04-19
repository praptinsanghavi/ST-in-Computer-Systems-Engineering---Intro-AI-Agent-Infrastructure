---
description: Akka 2.10.17 - akka.persistence.query.journal.leveldb.LeveldbReadJournalProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:51:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html
title: Akka 2.10.17 - akka.persistence.query.journal.leveldb.LeveldbReadJournalProvider
---

# Akka 2.10.17 - akka.persistence.query.journal.leveldb.LeveldbReadJournalProvider

> **Summary:** Akka 2.10.17 - akka.persistence.query.journal.leveldb.LeveldbReadJournalProvider

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/query/index.html "Permalink")  package [query](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/query/journal/index.html "Permalink")  package [journal](../index.html)Definition Classes[query](../../index.html)
- [**](../../../../../akka/persistence/query/journal/leveldb/index.html "Permalink")  package [leveldb](index.html)Definition Classes[journal](../index.html)
- [**](../../../../../akka/persistence/query/journal/leveldb/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[leveldb](index.html)
- [**](../../../../../akka/persistence/query/journal/leveldb/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[leveldb](index.html)
- LeveldbReadJournalProvider
c[akka](../../../../index.html).[persistence](../../../index.html).[query](../../index.html).[journal](../index.html).[leveldb](index.html)

# LeveldbReadJournalProvider[**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html "Permalink")

### 

#### class LeveldbReadJournalProvider extends [ReadJournalProvider](../../ReadJournalProvider.html)

Annotations@deprecated Deprecated*(Since version 2\.6\.15\)* Use another journal/query implementation

Source[LeveldbReadJournalProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.scala#L13)Linear Supertypes[ReadJournalProvider](../../ReadJournalProvider.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LeveldbReadJournalProvider
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

1. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#<init>(system:akka.actor.ExtendedActorSystem,config:com.typesafe.config.Config):akka.persistence.query.journal.leveldb.LeveldbReadJournalProvider "Permalink")  new LeveldbReadJournalProvider(system: [ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html), config: Config)
### Value Members

1. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LeveldbReadJournalProvider toany2stringadd\[LeveldbReadJournalProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LeveldbReadJournalProvider, B)ImplicitThis member is added by an implicit conversion from LeveldbReadJournalProvider toArrowAssoc\[LeveldbReadJournalProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LeveldbReadJournalProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeveldbReadJournalProviderImplicitThis member is added by an implicit conversion from LeveldbReadJournalProvider toEnsuring\[LeveldbReadJournalProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LeveldbReadJournalProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeveldbReadJournalProviderImplicitThis member is added by an implicit conversion from LeveldbReadJournalProvider toEnsuring\[LeveldbReadJournalProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeveldbReadJournalProviderImplicitThis member is added by an implicit conversion from LeveldbReadJournalProvider toEnsuring\[LeveldbReadJournalProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeveldbReadJournalProviderImplicitThis member is added by an implicit conversion from LeveldbReadJournalProvider toEnsuring\[LeveldbReadJournalProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#javaReadJournal:akka.persistence.query.journal.leveldb.javadsl.LeveldbReadJournal "Permalink")  val javaReadJournal: [LeveldbReadJournal](javadsl/LeveldbReadJournal.html)
18. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#javadslReadJournal():akka.persistence.query.javadsl.ReadJournal "Permalink")  def javadslReadJournal(): [ReadJournal](../../javadsl/ReadJournal.html)The `ReadJournal` implementation for the Java API.

The `ReadJournal` implementation for the Java API.
This corresponds to the instance that is returned by [PersistenceQuery\#getReadJournalFor](../../PersistenceQuery.html#getReadJournalFor[T<:akka.persistence.query.javadsl.ReadJournal](clazz:Class[T],readJournalPluginId:String):T).

Definition ClassesLeveldbReadJournalProvider → [ReadJournalProvider](../../ReadJournalProvider.html)
19. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#readJournal:akka.persistence.query.journal.leveldb.scaladsl.LeveldbReadJournal "Permalink")  val readJournal: [LeveldbReadJournal](scaladsl/LeveldbReadJournal.html)
23. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#scaladslReadJournal():akka.persistence.query.scaladsl.ReadJournal "Permalink")  def scaladslReadJournal(): [ReadJournal](../../scaladsl/ReadJournal.html)The `ReadJournal` implementation for the Scala API.

The `ReadJournal` implementation for the Scala API.
This corresponds to the instance that is returned by [PersistenceQuery\#readJournalFor](../../PersistenceQuery.html#readJournalFor[T<:akka.persistence.query.scaladsl.ReadJournal](readJournalPluginId:String):T).

Definition ClassesLeveldbReadJournalProvider → [ReadJournalProvider](../../ReadJournalProvider.html)
24. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LeveldbReadJournalProvider toStringFormat\[LeveldbReadJournalProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LeveldbReadJournalProvider, B)ImplicitThis member is added by an implicit conversion from LeveldbReadJournalProvider toArrowAssoc\[LeveldbReadJournalProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ReadJournalProvider](../../ReadJournalProvider.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLeveldbReadJournalProvider to any2stringadd\[LeveldbReadJournalProvider]

### Inherited by implicit conversion StringFormat fromLeveldbReadJournalProvider to StringFormat\[LeveldbReadJournalProvider]

### Inherited by implicit conversion Ensuring fromLeveldbReadJournalProvider to Ensuring\[LeveldbReadJournalProvider]

### Inherited by implicit conversion ArrowAssoc fromLeveldbReadJournalProvider to ArrowAssoc\[LeveldbReadJournalProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/journal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/journal/leveldb/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/journal/leveldb/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/journal/leveldb/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html](https://doc.akka.io/api/akka/current/akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html)*