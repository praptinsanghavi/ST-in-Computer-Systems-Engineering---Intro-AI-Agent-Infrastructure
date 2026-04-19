---
description: Akka 2.10.17 - akka.AkkaVersion
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:37:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/AkkaVersion$.html
title: Akka 2.10.17 - akka.AkkaVersion
---

# Akka 2.10.17 - akka.AkkaVersion

> **Summary:** Akka 2.10.17 - akka.AkkaVersion

## Content

Akka2\.10\.17 \< Back****# Packages

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
- AkkaVersion
- [ConfigurationException](ConfigurationException.html "This exception is thrown when Akka detects a problem with the provided configuration")
- [Done](Done.html "Typically used together with Future to signal completion but there is no actual value completed.")
- [NotUsed](NotUsed.html "This type is used in generic type signatures wherever the actual value is of no importance.")
- [OnlyCauseStackTrace](OnlyCauseStackTrace.html "Mix in this trait to suppress the StackTrace for the instance of the exception but not the cause, scala.util.control.NoStackTrace suppresses all the StackTraces.")
- [UnsupportedAkkaVersion](UnsupportedAkkaVersion.html)
- [Version](Version$.html)
o[akka](index.html)

# AkkaVersion[**](../akka/AkkaVersion$.html "Permalink")

### 

#### object AkkaVersion

Source[AkkaVersion.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/AkkaVersion.scala#L11)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AkkaVersion
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../akka/AkkaVersion$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../akka/AkkaVersion$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../akka/AkkaVersion$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../akka/AkkaVersion$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../akka/AkkaVersion$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../akka/AkkaVersion$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../akka/AkkaVersion$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../akka/AkkaVersion$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../akka/AkkaVersion$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../akka/AkkaVersion$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../akka/AkkaVersion$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../akka/AkkaVersion$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../akka/AkkaVersion$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../akka/AkkaVersion$.html#require(libraryName:String,requiredVersion:String):Unit "Permalink")  def require(libraryName: String, requiredVersion: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check that the version of Akka is a specific patch version or higher and throw an [UnsupportedAkkaVersion](UnsupportedAkkaVersion.html)
exception if the version requirement is not fulfilled.

Check that the version of Akka is a specific patch version or higher and throw an [UnsupportedAkkaVersion](UnsupportedAkkaVersion.html)
exception if the version requirement is not fulfilled.

For example: `require("my-library", "2.5.4")` would fail if used with Akka 2\.4\.19 and 2\.5\.3, but succeed with 2\.5\.4
and 2\.6\.1

libraryNameThe name of the library or component requiring the Akka version, used in the error message.

requiredVersionMinimal version that this library works with
15. [**](../akka/AkkaVersion$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../akka/AkkaVersion$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../akka/AkkaVersion$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../akka/AkkaVersion$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../akka/AkkaVersion$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../akka/AkkaVersion$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/AkkaException.html
- https://doc.akka.io/api/akka/current/akka/AkkaVersion$.html
- https://doc.akka.io/api/akka/current/akka/ConfigurationException.html
- https://doc.akka.io/api/akka/current/akka/Done$.html
- https://doc.akka.io/api/akka/current/akka/Done.html
- https://doc.akka.io/api/akka/current/akka/NotUsed$.html
- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/OnlyCauseStackTrace.html
- https://doc.akka.io/api/akka/current/akka/UnsupportedAkkaVersion.html
- https://doc.akka.io/api/akka/current/akka/Version$.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/annotation/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/coordination/index.html
- https://doc.akka.io/api/akka/current/akka/discovery/index.html
- https://doc.akka.io/api/akka/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka/current/akka/event/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/index.html
- https://doc.akka.io/api/akka/current/akka/japi/index.html
- https://doc.akka.io/api/akka/current/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka/current/akka/pattern/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/pki/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/routing/index.html
- https://doc.akka.io/api/akka/current/akka/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/util/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/AkkaVersion$.html](https://doc.akka.io/api/akka/current/akka/AkkaVersion$.html)*