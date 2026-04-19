---
description: Akka 2.10.17 - akka.routing.ConsistentHashingRouter.emptyConsistentHashMapping
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html
title: Akka 2.10.17 - akka.routing.ConsistentHashingRouter.emptyConsistentHashMapping
---

# Akka 2.10.17 - akka.routing.ConsistentHashingRouter.emptyConsistentHashMapping

> **Summary:** Akka 2.10.17 - akka.routing.ConsistentHashingRouter.emptyConsistentHashMapping

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/ConsistentHashingRouter$.html "Permalink")  object [ConsistentHashingRouter](ConsistentHashingRouter$.html)Definition Classes[routing](index.html)
- [ConsistentHashMapper](ConsistentHashingRouter$$ConsistentHashMapper.html "JAVA API Mapping from message to the data to use for the consistent hash key.")
- [ConsistentHashable](ConsistentHashingRouter$$ConsistentHashable.html "If you don't define the hashMapping when constructing the akka.routing.ConsistentHashingRouter the messages need to implement this interface to define what data to use for the consistent hash key.")
- [ConsistentHashableEnvelope](ConsistentHashingRouter$$ConsistentHashableEnvelope.html "If you don't define the hashMapping when constructing the akka.routing.ConsistentHashingRouter and messages can't implement akka.routing.ConsistentHashingRouter.ConsistentHashable themselves they can we wrapped by this envelope instead.")
- emptyConsistentHashMapping
o[akka](../index.html).[routing](index.html).[ConsistentHashingRouter](ConsistentHashingRouter$.html)

# emptyConsistentHashMapping[**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html "Permalink")

### 

#### object emptyConsistentHashMapping extends [ConsistentHashMapping](ConsistentHashingRouter$.html#ConsistentHashMapping=PartialFunction[Any,Any])

Annotations@SerialVersionUID() Source[ConsistentHashing.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/routing/ConsistentHashing.scala#L79)Linear Supertypes[PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. emptyConsistentHashMapping
2. PartialFunction
3. Function1
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#andThen[C](k:PartialFunction[B,C]):PartialFunction[A,C] "Permalink")  def andThen\[C](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), C]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), C]Definition ClassesPartialFunction
5. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#andThen[C](k:B=>C):PartialFunction[A,C] "Permalink")  def andThen\[C](k: ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> C): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), C]Definition ClassesPartialFunction → Function1
6. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#apply(x:Any):Nothing "Permalink")  def apply(x: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesemptyConsistentHashMapping → Function1
7. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#applyOrElse[A1<:A,B1>:B](x:A1,default:A1=>B1):B1 "Permalink")  def applyOrElse\[A1 \<: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), B1 \>: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)](x: A1, default: (A1) \=\> B1): B1Definition ClassesPartialFunction
8. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#compose[R](k:PartialFunction[R,A]):PartialFunction[R,B] "Permalink")  def compose\[R](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesPartialFunction
11. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): (A) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesFunction1Annotations@unspecialized()
12. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#elementWise:PartialFunction.ElementWiseExtractor[A,B] "Permalink")  def elementWise: ElementWiseExtractor\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesPartialFunction
13. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#isDefinedAt(x:Any):Boolean "Permalink")  def isDefinedAt(x: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesemptyConsistentHashMapping → PartialFunction
18. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#lift:A=>Option[B] "Permalink")  def lift: ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesPartialFunction
20. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#orElse[A1<:A,B1>:B](that:PartialFunction[A1,B1]):PartialFunction[A1,B1] "Permalink")  def orElse\[A1 \<: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), B1 \>: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)](that: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]Definition ClassesPartialFunction
24. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#runWith[U](action:B=>U):A=>Boolean "Permalink")  def runWith\[U](action: ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> U): ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPartialFunction
25. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
27. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#unapply(a:A):Option[B] "Permalink")  def unapply(a: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesPartialFunction
28. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]

### Inherited from ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$ConsistentHashMapper.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$ConsistentHashable.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$.html
- https://doc.akka.io/api/akka/current/akka/routing/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html](https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html)*