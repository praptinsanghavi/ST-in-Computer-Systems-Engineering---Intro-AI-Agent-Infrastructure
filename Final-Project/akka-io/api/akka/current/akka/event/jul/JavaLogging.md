---
description: Akka 2.10.17 - akka.event.jul.JavaLogging
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:25:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/jul/JavaLogging.html
title: Akka 2.10.17 - akka.event.jul.JavaLogging
---

# Akka 2.10.17 - akka.event.jul.JavaLogging

> **Summary:** Akka 2.10.17 - akka.event.jul.JavaLogging

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/event/index.html "Permalink")  package [event](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/event/jul/index.html "Permalink")  package [jul](index.html)Definition Classes[event](../index.html)
- [JavaLogger](JavaLogger.html "java.util.logging logger.")
- JavaLogging
- [JavaLoggingFilter](JavaLoggingFilter.html "akka.event.LoggingFilter that uses the log level defined in the JUL backend configuration to filter log events before publishing the log events to the eventStream.")
- [Logger](Logger$.html "Logger is a factory for obtaining JUL Loggers")
t[akka](../../index.html).[event](../index.html).[jul](index.html)

# JavaLogging[**](../../../akka/event/jul/JavaLogging.html "Permalink")

### 

#### trait JavaLogging extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Base trait for all classes that wants to be able use the JUL logging infrastructure.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use SLF4J or direct java.util.logging instead.

Source[JavaLogger.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/jul/JavaLogger.scala#L54)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JavaLogging
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

1. [**](../../../akka/event/jul/JavaLogging.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/event/jul/JavaLogging.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/event/jul/JavaLogging.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from JavaLogging toany2stringadd\[JavaLogging] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/event/jul/JavaLogging.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (JavaLogging, B)ImplicitThis member is added by an implicit conversion from JavaLogging toArrowAssoc\[JavaLogging] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/event/jul/JavaLogging.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/event/jul/JavaLogging.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/event/jul/JavaLogging.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/event/jul/JavaLogging.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (JavaLogging) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JavaLoggingImplicitThis member is added by an implicit conversion from JavaLogging toEnsuring\[JavaLogging] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/event/jul/JavaLogging.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (JavaLogging) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JavaLoggingImplicitThis member is added by an implicit conversion from JavaLogging toEnsuring\[JavaLogging] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/event/jul/JavaLogging.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JavaLoggingImplicitThis member is added by an implicit conversion from JavaLogging toEnsuring\[JavaLogging] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/event/jul/JavaLogging.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JavaLoggingImplicitThis member is added by an implicit conversion from JavaLogging toEnsuring\[JavaLogging] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/event/jul/JavaLogging.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/event/jul/JavaLogging.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/event/jul/JavaLogging.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/event/jul/JavaLogging.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/event/jul/JavaLogging.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/event/jul/JavaLogging.html#log:java.util.logging.Logger "Permalink")  lazy val log: [java.util.logging.Logger](https://docs.oracle.com/en/java/javase/11/docs/api/java.logging/java/util/logging/Logger.html#java.util.logging.Logger)Annotations@transient()
18. [**](../../../akka/event/jul/JavaLogging.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/event/jul/JavaLogging.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/event/jul/JavaLogging.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/event/jul/JavaLogging.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/event/jul/JavaLogging.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../akka/event/jul/JavaLogging.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/event/jul/JavaLogging.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/event/jul/JavaLogging.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/event/jul/JavaLogging.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/event/jul/JavaLogging.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from JavaLogging toStringFormat\[JavaLogging] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/event/jul/JavaLogging.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (JavaLogging, B)ImplicitThis member is added by an implicit conversion from JavaLogging toArrowAssoc\[JavaLogging] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromJavaLogging to any2stringadd\[JavaLogging]

### Inherited by implicit conversion StringFormat fromJavaLogging to StringFormat\[JavaLogging]

### Inherited by implicit conversion Ensuring fromJavaLogging to Ensuring\[JavaLogging]

### Inherited by implicit conversion ArrowAssoc fromJavaLogging to ArrowAssoc\[JavaLogging]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/event/index.html
- https://doc.akka.io/api/akka/current/akka/event/jul/JavaLogger.html
- https://doc.akka.io/api/akka/current/akka/event/jul/JavaLogging.html
- https://doc.akka.io/api/akka/current/akka/event/jul/JavaLoggingFilter.html
- https://doc.akka.io/api/akka/current/akka/event/jul/Logger$.html
- https://doc.akka.io/api/akka/current/akka/event/jul/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/event/jul/JavaLogging.html](https://doc.akka.io/api/akka/current/akka/event/jul/JavaLogging.html)*