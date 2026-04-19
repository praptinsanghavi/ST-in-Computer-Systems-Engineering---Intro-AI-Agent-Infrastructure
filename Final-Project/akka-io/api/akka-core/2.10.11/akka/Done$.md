---
description: Akka 2.10.11 - akka.Done
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:21:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/Done$.html
title: Akka 2.10.11 - akka.Done
---

# Akka 2.10.11 - akka.Done

> **Summary:** Akka 2.10.11 - akka.Done

## Content

Akka2\.10\.11 \< Back****# Packages

- [**](../index.html "Permalink")  package [root](../index.html)Definition Classes[root](../index.html)
- [**](../akka/index.html "Permalink")  package [akka](index.html)Definition Classes[root](../index.html)
- [**](../akka/actor/index.html "Permalink")  package [actor](actor/index.html)Definition Classes[akka](index.html)
- [**](../akka/annotation/index.html "Permalink")  package [annotation](annotation/index.html)Definition Classes[akka](index.html)
- [**](../akka/cluster/index.html "Permalink")  package [cluster](cluster/index.html)Definition Classes[akka](index.html)
- [**](../akka/coordination/index.html "Permalink")  package [coordination](coordination/index.html)Definition Classes[akka](index.html)
- [**](../akka/discovery/index.html "Permalink")  package [discovery](discovery/index.html)Definition Classes[akka](index.html)
- [**](../akka/dispatch/index.html "Permalink")  package [dispatch](dispatch/index.html)Definition Classes[akka](index.html)
- [**](../akka/event/index.html "Permalink")  package [event](event/index.html)Definition Classes[akka](index.html)
- [**](../akka/io/index.html "Permalink")  package [io](io/index.html)Definition Classes[akka](index.html)
- [**](../akka/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[akka](index.html)
- [**](../akka/pattern/index.html "Permalink")  package [pattern](pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](index.html)
- [**](../akka/persistence/index.html "Permalink")  package [persistence](persistence/index.html)Definition Classes[akka](index.html)
- [**](../akka/pki/index.html "Permalink")  package [pki](pki/index.html)Definition Classes[akka](index.html)
- [**](../akka/remote/index.html "Permalink")  package [remote](remote/index.html)Definition Classes[akka](index.html)
- [**](../akka/routing/index.html "Permalink")  package [routing](routing/index.html)Definition Classes[akka](index.html)
- [**](../akka/serialization/index.html "Permalink")  package [serialization](serialization/index.html)Definition Classes[akka](index.html)
- [**](../akka/stream/index.html "Permalink")  package [stream](stream/index.html)Definition Classes[akka](index.html)
- [**](../akka/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[akka](index.html)
- [**](../akka/util/index.html "Permalink")  package [util](util/index.html)Definition Classes[akka](index.html)
- [AkkaException](AkkaException.html "Akka base Exception.")
- [AkkaVersion](AkkaVersion$.html)
- [ConfigurationException](ConfigurationException.html "This exception is thrown when Akka detects a problem with the provided configuration")
- [Done](Done.html "Typically used together with Future to signal completion but there is no actual value completed.")
- [NotUsed](NotUsed.html "This type is used in generic type signatures wherever the actual value is of no importance.")
- [OnlyCauseStackTrace](OnlyCauseStackTrace.html "Mix in this trait to suppress the StackTrace for the instance of the exception but not the cause, scala.util.control.NoStackTrace suppresses all the StackTraces.")
- [UnsupportedAkkaVersion](UnsupportedAkkaVersion.html)
- [Version](Version$.html)
[o](Done.html "See companion class")[akka](index.html)

# [Done](Done.html "See companion class")[**](../akka/Done$.html "Permalink")

### Companion [class Done](Done.html "See companion class")

#### case object Done extends [Done](Done.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[Done.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/Done.scala#L18)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Done](Done.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Done
2. Product
3. Equals
4. Done
5. Serializable
6. AnyRef
7. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../akka/Done$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../akka/Done$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../akka/Done$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../akka/Done$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../akka/Done$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../akka/Done$.html#done():akka.Done "Permalink")  def done(): [Done](Done.html)Java API: the singleton instance

Java API: the singleton instance

This is equivalent to [Done.getInstance](#getInstance():akka.Done), but can be used with static import.
7. [**](../akka/Done$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../akka/Done$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../akka/Done$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../akka/Done$.html#getInstance():akka.Done "Permalink")  def getInstance(): [Done](Done.html)Java API: the singleton instance
11. [**](../akka/Done$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../akka/Done$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../akka/Done$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../akka/Done$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../akka/Done$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
16. [**](../akka/Done$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
17. [**](../akka/Done$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../akka/Done$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../akka/Done$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../akka/Done$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../akka/Done$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Done](Done.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/AkkaException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/AkkaVersion$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/ConfigurationException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/Done$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/OnlyCauseStackTrace.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/UnsupportedAkkaVersion.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/Version$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pki/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/index.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/Done$.html](https://doc.akka.io/api/akka-core/2.10.11/akka/Done$.html)*