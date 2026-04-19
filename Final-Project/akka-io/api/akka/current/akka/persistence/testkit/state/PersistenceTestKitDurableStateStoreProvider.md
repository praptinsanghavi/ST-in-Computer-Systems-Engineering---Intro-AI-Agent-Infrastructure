---
description: Akka 2.10.17 - akka.persistence.testkit.state.PersistenceTestKitDurableStateStoreProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:51:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html
title: Akka 2.10.17 - akka.persistence.testkit.state.PersistenceTestKitDurableStateStoreProvider
---

# Akka 2.10.17 - akka.persistence.testkit.state.PersistenceTestKitDurableStateStoreProvider

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.state.PersistenceTestKitDurableStateStoreProvider

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/state/index.html "Permalink")  package [state](index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/persistence/testkit/state/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[state](index.html)
- [**](../../../../akka/persistence/testkit/state/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[state](index.html)
- PersistenceTestKitDurableStateStoreProvider
c[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[state](index.html)

# PersistenceTestKitDurableStateStoreProvider[**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html "Permalink")

### 

#### class PersistenceTestKitDurableStateStoreProvider extends [DurableStateStoreProvider](../../state/DurableStateStoreProvider.html)

Source[PersistenceTestKitDurableStateStoreProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.scala#L16)Linear Supertypes[DurableStateStoreProvider](../../state/DurableStateStoreProvider.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistenceTestKitDurableStateStoreProvider
2. DurableStateStoreProvider
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

1. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#<init>(system:akka.actor.ExtendedActorSystem):akka.persistence.testkit.state.PersistenceTestKitDurableStateStoreProvider "Permalink")  new PersistenceTestKitDurableStateStoreProvider(system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStoreProvider toany2stringadd\[PersistenceTestKitDurableStateStoreProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistenceTestKitDurableStateStoreProvider, B)ImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStoreProvider toArrowAssoc\[PersistenceTestKitDurableStateStoreProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistenceTestKitDurableStateStoreProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceTestKitDurableStateStoreProviderImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStoreProvider toEnsuring\[PersistenceTestKitDurableStateStoreProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistenceTestKitDurableStateStoreProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceTestKitDurableStateStoreProviderImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStoreProvider toEnsuring\[PersistenceTestKitDurableStateStoreProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceTestKitDurableStateStoreProviderImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStoreProvider toEnsuring\[PersistenceTestKitDurableStateStoreProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceTestKitDurableStateStoreProviderImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStoreProvider toEnsuring\[PersistenceTestKitDurableStateStoreProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#javadslDurableStateStore():akka.persistence.state.javadsl.DurableStateStore[AnyRef] "Permalink")  def javadslDurableStateStore(): [DurableStateStore](../../state/javadsl/DurableStateStore.html)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]The `DurableStateStore` implementation for the Java API.

The `DurableStateStore` implementation for the Java API.
This corresponds to the instance that is returned by DurableStateStoreRegistry\#getDurableStateStoreFor.

Definition ClassesPersistenceTestKitDurableStateStoreProvider → [DurableStateStoreProvider](../../state/DurableStateStoreProvider.html)
18. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#scaladslDurableStateStore():akka.persistence.state.scaladsl.DurableStateStore[Any] "Permalink")  def scaladslDurableStateStore(): [DurableStateStore](../../state/scaladsl/DurableStateStore.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]The `DurableStateStore` implementation for the Scala API.

The `DurableStateStore` implementation for the Scala API.
This corresponds to the instance that is returned by DurableStateStoreRegistry\#durableStateStoreFor.

Definition ClassesPersistenceTestKitDurableStateStoreProvider → [DurableStateStoreProvider](../../state/DurableStateStoreProvider.html)
22. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStoreProvider toStringFormat\[PersistenceTestKitDurableStateStoreProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistenceTestKitDurableStateStoreProvider, B)ImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStoreProvider toArrowAssoc\[PersistenceTestKitDurableStateStoreProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DurableStateStoreProvider](../../state/DurableStateStoreProvider.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistenceTestKitDurableStateStoreProvider to any2stringadd\[PersistenceTestKitDurableStateStoreProvider]

### Inherited by implicit conversion StringFormat fromPersistenceTestKitDurableStateStoreProvider to StringFormat\[PersistenceTestKitDurableStateStoreProvider]

### Inherited by implicit conversion Ensuring fromPersistenceTestKitDurableStateStoreProvider to Ensuring\[PersistenceTestKitDurableStateStoreProvider]

### Inherited by implicit conversion ArrowAssoc fromPersistenceTestKitDurableStateStoreProvider to ArrowAssoc\[PersistenceTestKitDurableStateStoreProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/DurableStateStoreProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/scaladsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html)*