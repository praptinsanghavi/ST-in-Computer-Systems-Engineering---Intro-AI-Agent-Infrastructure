---
description: Akka 2.10.17 - akka.event.slf4j.Slf4jLoggingFilter
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:05:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/slf4j/Slf4jLoggingFilter.html
title: Akka 2.10.17 - akka.event.slf4j.Slf4jLoggingFilter
---

# Akka 2.10.17 - akka.event.slf4j.Slf4jLoggingFilter

> **Summary:** Akka 2.10.17 - akka.event.slf4j.Slf4jLoggingFilter

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
- Slf4jLoggingFilter
c[akka](../../index.html).[event](../index.html).[slf4j](index.html)

# Slf4jLoggingFilter[**](../../../akka/event/slf4j/Slf4jLoggingFilter.html "Permalink")

### 

#### class Slf4jLoggingFilter extends [LoggingFilterWithMarker](../LoggingFilterWithMarker.html)

[akka.event.LoggingFilter](../LoggingFilter.html) that uses the log level defined in the SLF4J
backend configuration (e.g. logback.xml) to filter log events before publishing
the log events to the `eventStream`.

Source[Slf4jLogger.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-slf4j/src/main/scala/akka/event/slf4j/Slf4jLogger.scala#L174)Linear Supertypes[LoggingFilterWithMarker](../LoggingFilterWithMarker.html), [LoggingFilter](../LoggingFilter.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Slf4jLoggingFilter
2. LoggingFilterWithMarker
3. LoggingFilter
4. AnyRef
5. Any
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

1. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#<init>(settings:akka.actor.ActorSystem.Settings,eventStream:akka.event.EventStream):akka.event.slf4j.Slf4jLoggingFilter "Permalink")  new Slf4jLoggingFilter(settings: [Settings](../../actor/ActorSystem$$Settings.html), eventStream: [EventStream](../EventStream.html))
### Value Members

1. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Slf4jLoggingFilter toany2stringadd\[Slf4jLoggingFilter] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Slf4jLoggingFilter, B)ImplicitThis member is added by an implicit conversion from Slf4jLoggingFilter toArrowAssoc\[Slf4jLoggingFilter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Slf4jLoggingFilter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Slf4jLoggingFilterImplicitThis member is added by an implicit conversion from Slf4jLoggingFilter toEnsuring\[Slf4jLoggingFilter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Slf4jLoggingFilter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Slf4jLoggingFilterImplicitThis member is added by an implicit conversion from Slf4jLoggingFilter toEnsuring\[Slf4jLoggingFilter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Slf4jLoggingFilterImplicitThis member is added by an implicit conversion from Slf4jLoggingFilter toEnsuring\[Slf4jLoggingFilter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Slf4jLoggingFilterImplicitThis member is added by an implicit conversion from Slf4jLoggingFilter toEnsuring\[Slf4jLoggingFilter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#isDebugEnabled(logClass:Class[_],logSource:String,marker:akka.event.LogMarker):Boolean "Permalink")  def isDebugEnabled(logClass: Class\[\_], logSource: String, marker: [LogMarker](../LogMarker.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSlf4jLoggingFilter → [LoggingFilterWithMarker](../LoggingFilterWithMarker.html)
17. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#isDebugEnabled(logClass:Class[_],logSource:String):Boolean "Permalink")  def isDebugEnabled(logClass: Class\[\_], logSource: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSlf4jLoggingFilter → [LoggingFilter](../LoggingFilter.html)
18. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#isErrorEnabled(logClass:Class[_],logSource:String,marker:akka.event.LogMarker):Boolean "Permalink")  def isErrorEnabled(logClass: Class\[\_], logSource: String, marker: [LogMarker](../LogMarker.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSlf4jLoggingFilter → [LoggingFilterWithMarker](../LoggingFilterWithMarker.html)
19. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#isErrorEnabled(logClass:Class[_],logSource:String):Boolean "Permalink")  def isErrorEnabled(logClass: Class\[\_], logSource: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSlf4jLoggingFilter → [LoggingFilter](../LoggingFilter.html)
20. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#isInfoEnabled(logClass:Class[_],logSource:String,marker:akka.event.LogMarker):Boolean "Permalink")  def isInfoEnabled(logClass: Class\[\_], logSource: String, marker: [LogMarker](../LogMarker.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSlf4jLoggingFilter → [LoggingFilterWithMarker](../LoggingFilterWithMarker.html)
21. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#isInfoEnabled(logClass:Class[_],logSource:String):Boolean "Permalink")  def isInfoEnabled(logClass: Class\[\_], logSource: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSlf4jLoggingFilter → [LoggingFilter](../LoggingFilter.html)
22. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#isWarningEnabled(logClass:Class[_],logSource:String,marker:akka.event.LogMarker):Boolean "Permalink")  def isWarningEnabled(logClass: Class\[\_], logSource: String, marker: [LogMarker](../LogMarker.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSlf4jLoggingFilter → [LoggingFilterWithMarker](../LoggingFilterWithMarker.html)
24. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#isWarningEnabled(logClass:Class[_],logSource:String):Boolean "Permalink")  def isWarningEnabled(logClass: Class\[\_], logSource: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSlf4jLoggingFilter → [LoggingFilter](../LoggingFilter.html)
25. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Slf4jLoggingFilter toStringFormat\[Slf4jLoggingFilter] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Slf4jLoggingFilter, B)ImplicitThis member is added by an implicit conversion from Slf4jLoggingFilter toArrowAssoc\[Slf4jLoggingFilter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [LoggingFilterWithMarker](../LoggingFilterWithMarker.html)

### Inherited from [LoggingFilter](../LoggingFilter.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSlf4jLoggingFilter to any2stringadd\[Slf4jLoggingFilter]

### Inherited by implicit conversion StringFormat fromSlf4jLoggingFilter to StringFormat\[Slf4jLoggingFilter]

### Inherited by implicit conversion Ensuring fromSlf4jLoggingFilter to Ensuring\[Slf4jLoggingFilter]

### Inherited by implicit conversion ArrowAssoc fromSlf4jLoggingFilter to ArrowAssoc\[Slf4jLoggingFilter]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem$$Settings.html
- https://doc.akka.io/api/akka/2.10/akka/event/EventStream.html
- https://doc.akka.io/api/akka/2.10/akka/event/LogMarker.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingFilter.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/api/akka/2.10/akka/event/index.html
- https://doc.akka.io/api/akka/2.10/akka/event/slf4j/Logger$.html
- https://doc.akka.io/api/akka/2.10/akka/event/slf4j/SLF4JLogging.html
- https://doc.akka.io/api/akka/2.10/akka/event/slf4j/Slf4jLogMarker$.html
- https://doc.akka.io/api/akka/2.10/akka/event/slf4j/Slf4jLogMarker.html
- https://doc.akka.io/api/akka/2.10/akka/event/slf4j/Slf4jLogger.html
- https://doc.akka.io/api/akka/2.10/akka/event/slf4j/Slf4jLoggingFilter.html
- https://doc.akka.io/api/akka/2.10/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/event/slf4j/Slf4jLoggingFilter.html](https://doc.akka.io/api/akka/2.10/akka/event/slf4j/Slf4jLoggingFilter.html)*