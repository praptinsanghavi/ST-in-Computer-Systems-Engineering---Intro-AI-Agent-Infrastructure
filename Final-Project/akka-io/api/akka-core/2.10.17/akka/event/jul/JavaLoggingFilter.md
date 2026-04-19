---
description: Akka 2.10.17 - akka.event.jul.JavaLoggingFilter
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:25:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/jul/JavaLoggingFilter.html
title: Akka 2.10.17 - akka.event.jul.JavaLoggingFilter
---

# Akka 2.10.17 - akka.event.jul.JavaLoggingFilter

> **Summary:** Akka 2.10.17 - akka.event.jul.JavaLoggingFilter

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/event/index.html "Permalink")  package [event](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/event/jul/index.html "Permalink")  package [jul](index.html)Definition Classes[event](../index.html)
- [JavaLogger](JavaLogger.html "java.util.logging logger.")
- [JavaLogging](JavaLogging.html "Base trait for all classes that wants to be able use the JUL logging infrastructure.")
- JavaLoggingFilter
- [Logger](Logger$.html "Logger is a factory for obtaining JUL Loggers")
c[akka](../../index.html).[event](../index.html).[jul](index.html)

# JavaLoggingFilter[**](../../../akka/event/jul/JavaLoggingFilter.html "Permalink")

### 

#### class JavaLoggingFilter extends [LoggingFilter](../LoggingFilter.html)

[akka.event.LoggingFilter](../LoggingFilter.html) that uses the log level defined in the JUL
backend configuration to filter log events before publishing
the log events to the `eventStream`.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Slf4jLoggingFilter instead.

Source[JavaLogger.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/jul/JavaLogger.scala#L101)Linear Supertypes[LoggingFilter](../LoggingFilter.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JavaLoggingFilter
2. LoggingFilter
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

1. [**](../../../akka/event/jul/JavaLoggingFilter.html#<init>(settings:akka.actor.ActorSystem.Settings,eventStream:akka.event.EventStream):akka.event.jul.JavaLoggingFilter "Permalink")  new JavaLoggingFilter(settings: [Settings](../../actor/ActorSystem$$Settings.html), eventStream: [EventStream](../EventStream.html))
### Value Members

1. [**](../../../akka/event/jul/JavaLoggingFilter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/event/jul/JavaLoggingFilter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/event/jul/JavaLoggingFilter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from JavaLoggingFilter toany2stringadd\[JavaLoggingFilter] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/event/jul/JavaLoggingFilter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (JavaLoggingFilter, B)ImplicitThis member is added by an implicit conversion from JavaLoggingFilter toArrowAssoc\[JavaLoggingFilter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/event/jul/JavaLoggingFilter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/event/jul/JavaLoggingFilter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/event/jul/JavaLoggingFilter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/event/jul/JavaLoggingFilter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (JavaLoggingFilter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JavaLoggingFilterImplicitThis member is added by an implicit conversion from JavaLoggingFilter toEnsuring\[JavaLoggingFilter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/event/jul/JavaLoggingFilter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (JavaLoggingFilter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JavaLoggingFilterImplicitThis member is added by an implicit conversion from JavaLoggingFilter toEnsuring\[JavaLoggingFilter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/event/jul/JavaLoggingFilter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JavaLoggingFilterImplicitThis member is added by an implicit conversion from JavaLoggingFilter toEnsuring\[JavaLoggingFilter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/event/jul/JavaLoggingFilter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JavaLoggingFilterImplicitThis member is added by an implicit conversion from JavaLoggingFilter toEnsuring\[JavaLoggingFilter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/event/jul/JavaLoggingFilter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/event/jul/JavaLoggingFilter.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/event/jul/JavaLoggingFilter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/event/jul/JavaLoggingFilter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/event/jul/JavaLoggingFilter.html#isDebugEnabled(logClass:Class[_],logSource:String):Boolean "Permalink")  def isDebugEnabled(logClass: Class\[\_], logSource: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesJavaLoggingFilter → [LoggingFilter](../LoggingFilter.html)
17. [**](../../../akka/event/jul/JavaLoggingFilter.html#isErrorEnabled(logClass:Class[_],logSource:String):Boolean "Permalink")  def isErrorEnabled(logClass: Class\[\_], logSource: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesJavaLoggingFilter → [LoggingFilter](../LoggingFilter.html)
18. [**](../../../akka/event/jul/JavaLoggingFilter.html#isInfoEnabled(logClass:Class[_],logSource:String):Boolean "Permalink")  def isInfoEnabled(logClass: Class\[\_], logSource: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesJavaLoggingFilter → [LoggingFilter](../LoggingFilter.html)
19. [**](../../../akka/event/jul/JavaLoggingFilter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../akka/event/jul/JavaLoggingFilter.html#isWarningEnabled(logClass:Class[_],logSource:String):Boolean "Permalink")  def isWarningEnabled(logClass: Class\[\_], logSource: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesJavaLoggingFilter → [LoggingFilter](../LoggingFilter.html)
21. [**](../../../akka/event/jul/JavaLoggingFilter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/event/jul/JavaLoggingFilter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/event/jul/JavaLoggingFilter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/event/jul/JavaLoggingFilter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/event/jul/JavaLoggingFilter.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../akka/event/jul/JavaLoggingFilter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/event/jul/JavaLoggingFilter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/event/jul/JavaLoggingFilter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/event/jul/JavaLoggingFilter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/event/jul/JavaLoggingFilter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from JavaLoggingFilter toStringFormat\[JavaLoggingFilter] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/event/jul/JavaLoggingFilter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (JavaLoggingFilter, B)ImplicitThis member is added by an implicit conversion from JavaLoggingFilter toArrowAssoc\[JavaLoggingFilter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [LoggingFilter](../LoggingFilter.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromJavaLoggingFilter to any2stringadd\[JavaLoggingFilter]

### Inherited by implicit conversion StringFormat fromJavaLoggingFilter to StringFormat\[JavaLoggingFilter]

### Inherited by implicit conversion Ensuring fromJavaLoggingFilter to Ensuring\[JavaLoggingFilter]

### Inherited by implicit conversion ArrowAssoc fromJavaLoggingFilter to ArrowAssoc\[JavaLoggingFilter]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem$$Settings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LoggingFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/jul/JavaLogger.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/jul/JavaLogging.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/jul/JavaLoggingFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/jul/Logger$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/jul/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/event/jul/JavaLoggingFilter.html](https://doc.akka.io/api/akka-core/2.10.17/akka/event/jul/JavaLoggingFilter.html)*