---
description: Akka 2.10.17 - akka.persistence.testkit.internal.InMemStorageExtension
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:04:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/internal/InMemStorageExtension.html
title: Akka 2.10.17 - akka.persistence.testkit.internal.InMemStorageExtension
---

# Akka 2.10.17 - akka.persistence.testkit.internal.InMemStorageExtension

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.internal.InMemStorageExtension

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[testkit](../index.html)
- [InMemStorage](InMemStorage.html "INTERNAL API")
- InMemStorageExtension
- [InternalReprSupport](InternalReprSupport.html "INTERNAL API")
- [PolicyOps](PolicyOps.html "INTERNAL API")
c[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[internal](index.html)

# InMemStorageExtension[**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html "Permalink")

### 

#### final  class InMemStorageExtension extends [Extension](../../../actor/Extension.html)

INTERNAL API

Annotations@[InternalApi](../../../annotation/InternalApi.html)() Source[InMemStorageExtension.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/internal/InMemStorageExtension.scala#L37)Linear Supertypes[Extension](../../../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. InMemStorageExtension
2. Extension
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

1. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#<init>(system:akka.actor.ExtendedActorSystem):akka.persistence.testkit.internal.InMemStorageExtension "Permalink")  new InMemStorageExtension(system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from InMemStorageExtension toany2stringadd\[InMemStorageExtension] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (InMemStorageExtension, B)ImplicitThis member is added by an implicit conversion from InMemStorageExtension toArrowAssoc\[InMemStorageExtension] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#currentPolicy:akka.persistence.testkit.ProcessingPolicy[akka.persistence.testkit.JournalOperation] "Permalink")  def currentPolicy: [ProcessingPolicy](../ProcessingPolicy.html)\[[JournalOperation](../JournalOperation.html)]
9. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#defaultStorage():akka.persistence.testkit.EventStorage "Permalink")  def defaultStorage(): EventStorage
10. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (InMemStorageExtension) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): InMemStorageExtensionImplicitThis member is added by an implicit conversion from InMemStorageExtension toEnsuring\[InMemStorageExtension] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (InMemStorageExtension) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): InMemStorageExtensionImplicitThis member is added by an implicit conversion from InMemStorageExtension toEnsuring\[InMemStorageExtension] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): InMemStorageExtensionImplicitThis member is added by an implicit conversion from InMemStorageExtension toEnsuring\[InMemStorageExtension] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): InMemStorageExtensionImplicitThis member is added by an implicit conversion from InMemStorageExtension toEnsuring\[InMemStorageExtension] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#resetPolicy():Unit "Permalink")  def resetPolicy(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
23. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#setPolicy(policy:akka.persistence.testkit.ProcessingPolicy[akka.persistence.testkit.JournalOperation]):Unit "Permalink")  def setPolicy(policy: [ProcessingPolicy](../ProcessingPolicy.html)\[[JournalOperation](../JournalOperation.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
24. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#storageFor(key:String):akka.persistence.testkit.EventStorage "Permalink")  def storageFor(key: String): EventStorage
25. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from InMemStorageExtension toStringFormat\[InMemStorageExtension] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/internal/InMemStorageExtension.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (InMemStorageExtension, B)ImplicitThis member is added by an implicit conversion from InMemStorageExtension toArrowAssoc\[InMemStorageExtension] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromInMemStorageExtension to any2stringadd\[InMemStorageExtension]

### Inherited by implicit conversion StringFormat fromInMemStorageExtension to StringFormat\[InMemStorageExtension]

### Inherited by implicit conversion Ensuring fromInMemStorageExtension to Ensuring\[InMemStorageExtension]

### Inherited by implicit conversion ArrowAssoc fromInMemStorageExtension to ArrowAssoc\[InMemStorageExtension]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/InMemStorage.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/InMemStorageExtension.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/InternalReprSupport.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/PolicyOps.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/InMemStorageExtension.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/InMemStorageExtension.html)*