---
description: Akka 2.10.17 - akka.event.slf4j.Slf4jLogMarker
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:25:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/slf4j/Slf4jLogMarker.html
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
- Slf4jLogMarker
- [Slf4jLogger](Slf4jLogger.html "SLF4J logger.")
- [Slf4jLoggingFilter](Slf4jLoggingFilter.html "akka.event.LoggingFilter that uses the log level defined in the SLF4J backend configuration (e.g.")
[c](Slf4jLogMarker$.html "See companion object")[akka](../../index.html).[event](../index.html).[slf4j](index.html)

# [Slf4jLogMarker](Slf4jLogMarker$.html "See companion object")[**](../../../akka/event/slf4j/Slf4jLogMarker.html "Permalink")

### Companion [object Slf4jLogMarker](Slf4jLogMarker$.html "See companion object")

#### final  class Slf4jLogMarker extends [LogMarker](../LogMarker.html)

Wraps org.slf4j.Marker

Source[Slf4jLogger.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-slf4j/src/main/scala/akka/event/slf4j/Slf4jLogger.scala#L203)Linear Supertypes[LogMarker](../LogMarker.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Slf4jLogMarker
2. LogMarker
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

1. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#<init>(marker:org.slf4j.Marker):akka.event.slf4j.Slf4jLogMarker "Permalink")  new Slf4jLogMarker(marker: Marker)
### Value Members

1. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/event/slf4j/Slf4jLogMarker.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Slf4jLogMarker toany2stringadd\[Slf4jLogMarker] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Slf4jLogMarker, B)ImplicitThis member is added by an implicit conversion from Slf4jLogMarker toArrowAssoc\[Slf4jLogMarker] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Slf4jLogMarker) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Slf4jLogMarkerImplicitThis member is added by an implicit conversion from Slf4jLogMarker toEnsuring\[Slf4jLogMarker] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Slf4jLogMarker) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Slf4jLogMarkerImplicitThis member is added by an implicit conversion from Slf4jLogMarker toEnsuring\[Slf4jLogMarker] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Slf4jLogMarkerImplicitThis member is added by an implicit conversion from Slf4jLogMarker toEnsuring\[Slf4jLogMarker] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Slf4jLogMarkerImplicitThis member is added by an implicit conversion from Slf4jLogMarker toEnsuring\[Slf4jLogMarker] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#getProperties:java.util.Map[String,Object] "Permalink")  def getProperties: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Java API

Java API

Definition Classes[LogMarker](../LogMarker.html)
16. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#marker:org.slf4j.Marker "Permalink")  val marker: Marker
19. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#name:String "Permalink")  val name: StringDefinition Classes[LogMarker](../LogMarker.html)
20. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#properties:Map[String,Any] "Permalink")  val properties: Map\[String, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition Classes[LogMarker](../LogMarker.html)
24. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#toString():String "Permalink")  def toString(): StringDefinition Classes[LogMarker](../LogMarker.html) → AnyRef → Any
26. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Slf4jLogMarker toStringFormat\[Slf4jLogMarker] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/event/slf4j/Slf4jLogMarker.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Slf4jLogMarker, B)ImplicitThis member is added by an implicit conversion from Slf4jLogMarker toArrowAssoc\[Slf4jLogMarker] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [LogMarker](../LogMarker.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSlf4jLogMarker to any2stringadd\[Slf4jLogMarker]

### Inherited by implicit conversion StringFormat fromSlf4jLogMarker to StringFormat\[Slf4jLogMarker]

### Inherited by implicit conversion Ensuring fromSlf4jLogMarker to Ensuring\[Slf4jLogMarker]

### Inherited by implicit conversion ArrowAssoc fromSlf4jLogMarker to ArrowAssoc\[Slf4jLogMarker]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LogMarker.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/Logger$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/SLF4JLogging.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/Slf4jLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/Slf4jLogMarker.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/Slf4jLogger.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/Slf4jLoggingFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/Slf4jLogMarker.html](https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/Slf4jLogMarker.html)*