---
description: Akka 2.10.17 - akka.event.slf4j.SLF4JLogging
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:25:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/slf4j/SLF4JLogging.html
title: Akka 2.10.17 - akka.event.slf4j.SLF4JLogging
---

# Akka 2.10.17 - akka.event.slf4j.SLF4JLogging

> **Summary:** Akka 2.10.17 - akka.event.slf4j.SLF4JLogging

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/event/index.html "Permalink")  package [event](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/event/slf4j/index.html "Permalink")  package [slf4j](index.html)Definition Classes[event](../index.html)
- [Logger](Logger$.html "Logger is a factory for obtaining SLF4J-Loggers")
- SLF4JLogging
- [Slf4jLogMarker](Slf4jLogMarker.html "Wraps org.slf4j.Marker")
- [Slf4jLogger](Slf4jLogger.html "SLF4J logger.")
- [Slf4jLoggingFilter](Slf4jLoggingFilter.html "akka.event.LoggingFilter that uses the log level defined in the SLF4J backend configuration (e.g.")
t[akka](../../index.html).[event](../index.html).[slf4j](index.html)

# SLF4JLogging[**](../../../akka/event/slf4j/SLF4JLogging.html "Permalink")

### 

#### trait SLF4JLogging extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Base trait for all classes that wants to be able use the SLF4J logging infrastructure.

Source[Slf4jLogger.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-slf4j/src/main/scala/akka/event/slf4j/Slf4jLogger.scala#L20)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Slf4jLogger](Slf4jLogger.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SLF4JLogging
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
### Value Members

1. [**](../../../akka/event/slf4j/SLF4JLogging.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/event/slf4j/SLF4JLogging.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/event/slf4j/SLF4JLogging.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SLF4JLogging toany2stringadd\[SLF4JLogging] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/event/slf4j/SLF4JLogging.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SLF4JLogging, B)ImplicitThis member is added by an implicit conversion from SLF4JLogging toArrowAssoc\[SLF4JLogging] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/event/slf4j/SLF4JLogging.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/event/slf4j/SLF4JLogging.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/event/slf4j/SLF4JLogging.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/event/slf4j/SLF4JLogging.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SLF4JLogging) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SLF4JLoggingImplicitThis member is added by an implicit conversion from SLF4JLogging toEnsuring\[SLF4JLogging] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/event/slf4j/SLF4JLogging.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SLF4JLogging) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SLF4JLoggingImplicitThis member is added by an implicit conversion from SLF4JLogging toEnsuring\[SLF4JLogging] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/event/slf4j/SLF4JLogging.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SLF4JLoggingImplicitThis member is added by an implicit conversion from SLF4JLogging toEnsuring\[SLF4JLogging] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/event/slf4j/SLF4JLogging.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SLF4JLoggingImplicitThis member is added by an implicit conversion from SLF4JLogging toEnsuring\[SLF4JLogging] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/event/slf4j/SLF4JLogging.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/event/slf4j/SLF4JLogging.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/event/slf4j/SLF4JLogging.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/event/slf4j/SLF4JLogging.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/event/slf4j/SLF4JLogging.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/event/slf4j/SLF4JLogging.html#log:org.slf4j.Logger "Permalink")  lazy val log: org.slf4j.LoggerAnnotations@transient()
18. [**](../../../akka/event/slf4j/SLF4JLogging.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/event/slf4j/SLF4JLogging.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/event/slf4j/SLF4JLogging.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/event/slf4j/SLF4JLogging.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/event/slf4j/SLF4JLogging.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../akka/event/slf4j/SLF4JLogging.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/event/slf4j/SLF4JLogging.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/event/slf4j/SLF4JLogging.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/event/slf4j/SLF4JLogging.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/event/slf4j/SLF4JLogging.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SLF4JLogging toStringFormat\[SLF4JLogging] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/event/slf4j/SLF4JLogging.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SLF4JLogging, B)ImplicitThis member is added by an implicit conversion from SLF4JLogging toArrowAssoc\[SLF4JLogging] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSLF4JLogging to any2stringadd\[SLF4JLogging]

### Inherited by implicit conversion StringFormat fromSLF4JLogging to StringFormat\[SLF4JLogging]

### Inherited by implicit conversion Ensuring fromSLF4JLogging to Ensuring\[SLF4JLogging]

### Inherited by implicit conversion ArrowAssoc fromSLF4JLogging to ArrowAssoc\[SLF4JLogging]

### Ungrouped

## Related Pages (Internal Links)

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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/SLF4JLogging.html](https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/SLF4JLogging.html)*