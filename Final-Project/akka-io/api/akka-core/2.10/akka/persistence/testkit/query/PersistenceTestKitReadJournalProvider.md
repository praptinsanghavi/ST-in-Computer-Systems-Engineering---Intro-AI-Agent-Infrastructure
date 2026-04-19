---
description: Akka 2.10.17 - akka.persistence.testkit.query.PersistenceTestKitReadJournalProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:21:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html
title: Akka 2.10.17 - akka.persistence.testkit.query.PersistenceTestKitReadJournalProvider
---

# Akka 2.10.17 - akka.persistence.testkit.query.PersistenceTestKitReadJournalProvider

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.query.PersistenceTestKitReadJournalProvider

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/query/index.html "Permalink")  package [query](index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/persistence/testkit/query/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[query](index.html)
- [**](../../../../akka/persistence/testkit/query/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[query](index.html)
- PersistenceTestKitReadJournalProvider
c[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[query](index.html)

# PersistenceTestKitReadJournalProvider[**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html "Permalink")

### 

#### class PersistenceTestKitReadJournalProvider extends [ReadJournalProvider](../../query/ReadJournalProvider.html)

Source[PersistenceTestKitReadJournalProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.scala#L11)Linear Supertypes[ReadJournalProvider](../../query/ReadJournalProvider.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistenceTestKitReadJournalProvider
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

1. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#<init>(system:akka.actor.ExtendedActorSystem,config:com.typesafe.config.Config,configPath:String):akka.persistence.testkit.query.PersistenceTestKitReadJournalProvider "Permalink")  new PersistenceTestKitReadJournalProvider(system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html), config: Config, configPath: String)
### Value Members

1. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournalProvider toany2stringadd\[PersistenceTestKitReadJournalProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistenceTestKitReadJournalProvider, B)ImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournalProvider toArrowAssoc\[PersistenceTestKitReadJournalProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistenceTestKitReadJournalProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceTestKitReadJournalProviderImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournalProvider toEnsuring\[PersistenceTestKitReadJournalProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistenceTestKitReadJournalProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceTestKitReadJournalProviderImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournalProvider toEnsuring\[PersistenceTestKitReadJournalProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceTestKitReadJournalProviderImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournalProvider toEnsuring\[PersistenceTestKitReadJournalProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceTestKitReadJournalProviderImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournalProvider toEnsuring\[PersistenceTestKitReadJournalProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#javadslReadJournal():akka.persistence.testkit.query.javadsl.PersistenceTestKitReadJournal "Permalink")  def javadslReadJournal(): [PersistenceTestKitReadJournal](javadsl/PersistenceTestKitReadJournal.html)The `ReadJournal` implementation for the Java API.

The `ReadJournal` implementation for the Java API.
This corresponds to the instance that is returned by PersistenceQuery\#getReadJournalFor.

Definition ClassesPersistenceTestKitReadJournalProvider → [ReadJournalProvider](../../query/ReadJournalProvider.html)
18. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#scaladslReadJournal():akka.persistence.testkit.query.scaladsl.PersistenceTestKitReadJournal "Permalink")  def scaladslReadJournal(): [PersistenceTestKitReadJournal](scaladsl/PersistenceTestKitReadJournal.html)The `ReadJournal` implementation for the Scala API.

The `ReadJournal` implementation for the Scala API.
This corresponds to the instance that is returned by PersistenceQuery\#readJournalFor.

Definition ClassesPersistenceTestKitReadJournalProvider → [ReadJournalProvider](../../query/ReadJournalProvider.html)
22. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournalProvider toStringFormat\[PersistenceTestKitReadJournalProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistenceTestKitReadJournalProvider, B)ImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournalProvider toArrowAssoc\[PersistenceTestKitReadJournalProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ReadJournalProvider](../../query/ReadJournalProvider.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistenceTestKitReadJournalProvider to any2stringadd\[PersistenceTestKitReadJournalProvider]

### Inherited by implicit conversion StringFormat fromPersistenceTestKitReadJournalProvider to StringFormat\[PersistenceTestKitReadJournalProvider]

### Inherited by implicit conversion Ensuring fromPersistenceTestKitReadJournalProvider to Ensuring\[PersistenceTestKitReadJournalProvider]

### Inherited by implicit conversion ArrowAssoc fromPersistenceTestKitReadJournalProvider to ArrowAssoc\[PersistenceTestKitReadJournalProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/query/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/query/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html)*