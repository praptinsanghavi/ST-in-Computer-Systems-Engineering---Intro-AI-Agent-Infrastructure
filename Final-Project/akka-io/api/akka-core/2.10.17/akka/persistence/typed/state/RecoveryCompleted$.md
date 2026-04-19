---
description: Akka 2.10.17 - akka.persistence.typed.state.RecoveryCompleted
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:52:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/RecoveryCompleted$.html
title: Akka 2.10.17 - akka.persistence.typed.state.RecoveryCompleted
---

# Akka 2.10.17 - akka.persistence.typed.state.RecoveryCompleted

> **Summary:** Akka 2.10.17 - akka.persistence.typed.state.RecoveryCompleted

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/state/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[state](index.html)
- [**](../../../../akka/persistence/typed/state/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[state](index.html)
- [DurableStateSignal](DurableStateSignal.html "Supertype for all DurableStateBehavior specific signals")
- [RecoveryCompleted](RecoveryCompleted.html)
- [RecoveryFailed](RecoveryFailed.html)
[o](RecoveryCompleted.html "See companion class")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[state](index.html)

# [RecoveryCompleted](RecoveryCompleted.html "See companion class")[**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html "Permalink")

### Companion [class RecoveryCompleted](RecoveryCompleted.html "See companion class")

#### case object RecoveryCompleted extends [RecoveryCompleted](RecoveryCompleted.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[DurableStateSignal.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/state/DurableStateSignal.scala#L19)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [RecoveryCompleted](RecoveryCompleted.html), [DurableStateSignal](DurableStateSignal.html), [Signal](../../../actor/typed/Signal.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RecoveryCompleted
2. Serializable
3. Product
4. Equals
5. RecoveryCompleted
6. DurableStateSignal
7. Signal
8. AnyRef
9. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#instance:akka.persistence.typed.state.RecoveryCompleted "Permalink")  def instance: [RecoveryCompleted](RecoveryCompleted.html)
10. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
15. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
16. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [RecoveryCompleted](RecoveryCompleted.html)

### Inherited from [DurableStateSignal](DurableStateSignal.html)

### Inherited from [Signal](../../../actor/typed/Signal.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/DurableStateSignal.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/RecoveryFailed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted$.html)*