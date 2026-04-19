---
description: Akka 2.10.17 - akka.stream.QueueOfferResult.QueueClosed
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:18:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/QueueOfferResult$$QueueClosed$.html
title: Akka 2.10.17 - akka.stream.QueueOfferResult.QueueClosed
---

# Akka 2.10.17 - akka.stream.QueueOfferResult.QueueClosed

> **Summary:** Akka 2.10.17 - akka.stream.QueueOfferResult.QueueClosed

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/QueueOfferResult$.html "Permalink")  object [QueueOfferResult](QueueOfferResult$.html "Contains types that is used as return types for streams Source queues")Contains types that is used as return types for streams Source queues

Contains types that is used as return types for streams Source queues

Definition Classes[stream](index.html)
- [Dropped](QueueOfferResult$$Dropped$.html "Type is used to indicate that stream is dropped an element")
- [Enqueued](QueueOfferResult$$Enqueued$.html "Type is used to indicate that stream is successfully enqueued an element")
- [Failure](QueueOfferResult$$Failure.html "Type is used to indicate that stream is failed before or during call to the stream")
- QueueClosed
o[akka](../index.html).[stream](index.html).[QueueOfferResult](QueueOfferResult$.html)

# QueueClosed[**](../../akka/stream/QueueOfferResult$$QueueClosed$.html "Permalink")

### 

#### case object QueueClosed extends [QueueCompletionResult](QueueCompletionResult.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Type is used to indicate that stream is completed before call

Source[QueueOfferResult.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/QueueOfferResult.scala#L67)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [QueueCompletionResult](QueueCompletionResult.html), [QueueOfferResult](QueueOfferResult.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. QueueClosed
2. Serializable
3. Product
4. Equals
5. QueueCompletionResult
6. QueueOfferResult
7. AnyRef
8. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#isEnqueued:Boolean "Permalink")  def isEnqueued: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Return ture if the element was already enqueued, otherwise false.

Return ture if the element was already enqueued, otherwise false.

Definition ClassesQueueClosed → [QueueOfferResult](QueueOfferResult.html)
10. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
15. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
16. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/QueueOfferResult$$QueueClosed$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [QueueCompletionResult](QueueCompletionResult.html)

### Inherited from [QueueOfferResult](QueueOfferResult.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/QueueCompletionResult.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/QueueOfferResult$$Dropped$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/QueueOfferResult$$Enqueued$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/QueueOfferResult$$Failure.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/QueueOfferResult$$QueueClosed$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/QueueOfferResult$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/QueueOfferResult.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/QueueOfferResult$$QueueClosed$.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/QueueOfferResult$$QueueClosed$.html)*