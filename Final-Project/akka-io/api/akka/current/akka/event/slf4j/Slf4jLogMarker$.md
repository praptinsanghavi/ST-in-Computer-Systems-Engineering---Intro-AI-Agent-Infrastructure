---
description: Akka 2.10.17 - akka.event.slf4j.Slf4jLogMarker
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:25:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/slf4j/Slf4jLogMarker$.html
title: Akka 2.10.17 - akka.event.slf4j.Slf4jLogMarker
---

# Akka 2.10.17 - akka.event.slf4j.Slf4jLogMarker

> **Summary:** Akka 2.10.17 - akka.event.slf4j.Slf4jLogMarker

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/event/index.html "Permalink")  package [event](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/event/slf4j/index.html "Permalink")  package [slf4j](index.html)Definition Classes[event](../index.html)
- [Logger](Logger$.html "Logger is a factory for obtaining SLF4J-Loggers")
- [SLF4JLogging](SLF4JLogging.html "Base trait for all classes that wants to be able use the SLF4J logging infrastructure.")
- [Slf4jLogMarker](Slf4jLogMarker.html "Wraps org.slf4j.Marker")
- [Slf4jLogger](Slf4jLogger.html "SLF4J logger.")
- [Slf4jLoggingFilter](Slf4jLoggingFilter.html "akka.event.LoggingFilter that uses the log level defined in the SLF4J backend configuration (e.g.")
[o](Slf4jLogMarker.html "See companion class")[akka](../../index.html).[event](../index.html).[slf4j](index.html)

# [Slf4jLogMarker](Slf4jLogMarker.html "See companion class")[**](../../../akka/event/slf4j/Slf4jLogMarker$.html "Permalink")

### Companion [class Slf4jLogMarker](Slf4jLogMarker.html "See companion class")

#### object Slf4jLogMarker

Factory for creating [LogMarker](../LogMarker.html) that wraps org.slf4j.Marker

Source[Slf4jLogger.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-slf4j/src/main/scala/akka/event/slf4j/Slf4jLogger.scala#L206)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Slf4jLogMarker
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#apply(marker:org.slf4j.Marker):akka.event.slf4j.Slf4jLogMarker "Permalink")  def apply(marker: Marker): [Slf4jLogMarker](Slf4jLogMarker.html)
5. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#create(marker:org.slf4j.Marker):akka.event.slf4j.Slf4jLogMarker "Permalink")  def create(marker: Marker): [Slf4jLogMarker](Slf4jLogMarker.html)Java API
8. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/event/LogMarker.html
- https://doc.akka.io/api/akka/current/akka/event/index.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/Logger$.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/SLF4JLogging.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/Slf4jLogMarker$.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/Slf4jLogMarker.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/Slf4jLogger.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/Slf4jLoggingFilter.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/event/slf4j/Slf4jLogMarker$.html](https://doc.akka.io/api/akka/current/akka/event/slf4j/Slf4jLogMarker$.html)*