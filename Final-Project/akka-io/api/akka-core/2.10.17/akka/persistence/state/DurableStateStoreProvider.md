---
description: Akka 2.10.17 - akka.persistence.state.DurableStateStoreProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:47:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/state/DurableStateStoreProvider.html
title: Akka 2.10.17 - akka.persistence.state.DurableStateStoreProvider
---

# Akka 2.10.17 - akka.persistence.state.DurableStateStoreProvider

> **Summary:** Akka 2.10.17 - akka.persistence.state.DurableStateStoreProvider

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/state/index.html "Permalink")  package [state](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/state/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[state](index.html)
- [**](../../../akka/persistence/state/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[state](index.html)
- DurableStateStoreProvider
- [DurableStateStoreRegistry](DurableStateStoreRegistry.html)
t[akka](../../index.html).[persistence](../index.html).[state](index.html)

# DurableStateStoreProvider[**](../../../akka/persistence/state/DurableStateStoreProvider.html "Permalink")

### 

#### trait DurableStateStoreProvider extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A durable state store plugin must implement a class that implements this trait.
It provides the concrete implementations for the Java and Scala APIs.

A durable state store plugin plugin must provide implementations for both
`akka.persistence.state.scaladsl.DurableStateStore` and `akka.persistence.state.javadsl.DurableStateStore`.
One of the implementations can delegate to the other.

Source[DurableStateStoreProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/state/DurableStateStoreProvider.scala#L15)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[PersistenceTestKitDurableStateStoreProvider](../testkit/state/PersistenceTestKitDurableStateStoreProvider.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateStoreProvider
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
### Abstract Value Members

1. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#javadslDurableStateStore():akka.persistence.state.javadsl.DurableStateStore[AnyRef] "Permalink") abstract  def javadslDurableStateStore(): [DurableStateStore](javadsl/DurableStateStore.html)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]The `DurableStateStore` implementation for the Java API.

The `DurableStateStore` implementation for the Java API.
This corresponds to the instance that is returned by [DurableStateStoreRegistry\#getDurableStateStoreFor](DurableStateStoreRegistry.html#getDurableStateStoreFor[T<:akka.persistence.state.javadsl.DurableStateStore[_]](clazz:Class[T],pluginId:String):T).
2. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#scaladslDurableStateStore():akka.persistence.state.scaladsl.DurableStateStore[Any] "Permalink") abstract  def scaladslDurableStateStore(): [DurableStateStore](scaladsl/DurableStateStore.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]The `DurableStateStore` implementation for the Scala API.

The `DurableStateStore` implementation for the Scala API.
This corresponds to the instance that is returned by [DurableStateStoreRegistry\#durableStateStoreFor](DurableStateStoreRegistry.html#durableStateStoreFor[T<:akka.persistence.state.scaladsl.DurableStateStore[_]](pluginId:String):T).
### Concrete Value Members

1. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/state/DurableStateStoreProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DurableStateStoreProvider toany2stringadd\[DurableStateStoreProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DurableStateStoreProvider, B)ImplicitThis member is added by an implicit conversion from DurableStateStoreProvider toArrowAssoc\[DurableStateStoreProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DurableStateStoreProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateStoreProviderImplicitThis member is added by an implicit conversion from DurableStateStoreProvider toEnsuring\[DurableStateStoreProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DurableStateStoreProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateStoreProviderImplicitThis member is added by an implicit conversion from DurableStateStoreProvider toEnsuring\[DurableStateStoreProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateStoreProviderImplicitThis member is added by an implicit conversion from DurableStateStoreProvider toEnsuring\[DurableStateStoreProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateStoreProviderImplicitThis member is added by an implicit conversion from DurableStateStoreProvider toEnsuring\[DurableStateStoreProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DurableStateStoreProvider toStringFormat\[DurableStateStoreProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/state/DurableStateStoreProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DurableStateStoreProvider, B)ImplicitThis member is added by an implicit conversion from DurableStateStoreProvider toArrowAssoc\[DurableStateStoreProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDurableStateStoreProvider to any2stringadd\[DurableStateStoreProvider]

### Inherited by implicit conversion StringFormat fromDurableStateStoreProvider to StringFormat\[DurableStateStoreProvider]

### Inherited by implicit conversion Ensuring fromDurableStateStoreProvider to Ensuring\[DurableStateStoreProvider]

### Inherited by implicit conversion ArrowAssoc fromDurableStateStoreProvider to ArrowAssoc\[DurableStateStoreProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/DurableStateStoreProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/DurableStateStoreProvider.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/DurableStateStoreProvider.html)*