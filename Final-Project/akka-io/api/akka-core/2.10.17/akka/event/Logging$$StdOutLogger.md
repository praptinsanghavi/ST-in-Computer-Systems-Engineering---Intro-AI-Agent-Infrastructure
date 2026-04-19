---
description: Akka 2.10.17 - akka.event.Logging.StdOutLogger
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:25:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/Logging$$StdOutLogger.html
title: Akka 2.10.17 - akka.event.Logging.StdOutLogger
---

# Akka 2.10.17 - akka.event.Logging.StdOutLogger

> **Summary:** Akka 2.10.17 - akka.event.Logging.StdOutLogger

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/Logging$.html "Permalink")  object [Logging](Logging$.html "Main entry point for Akka logging: log levels and message types (aka channels) defined for the main transport medium, the main event bus.")Main entry point for Akka logging: log levels and message types (aka
channels) defined for the main transport medium, the main event bus.

Main entry point for Akka logging: log levels and message types (aka
channels) defined for the main transport medium, the main event bus. The
recommended use is to obtain an implementation of the Logging trait with
suitable and efficient methods for generating log events:

```

val log = Logging(<bus>, <source object>)
...
log.info("hello world!")

```
The source object is used in two fashions: its `Class[_]` will be part of
all log events produced by this logger, plus a string representation is
generated which may contain per\-instance information, see `apply` or `create`
below.

Loggers are attached to the level\-specific channels `Error`,
`Warning`, `Info` and `Debug` as
appropriate for the configured (or set) log level. If you want to implement
your own, make sure to handle these four event types plus the `InitializeLogger`
message which is sent before actually attaching it to the logging bus.

Logging is configured by setting (some of) the following:

```

akka {
  loggers = ["akka.slf4j.Slf4jLogger"] # for example
  loglevel = "INFO"        # used when normal logging ("loggers") has been started
  stdout-loglevel = "WARN" # used during application start-up until normal logging is available
}

```

Definition Classes[event](index.html)
- [Debug](Logging$$Debug.html "For DEBUG Logging")
- [Debug2](Logging$$Debug2.html)
- [Debug3](Logging$$Debug3.html)
- [DefaultLogger](Logging$$DefaultLogger.html "Actor wrapper around the standard output logger.")
- [Error](Logging$$Error.html "For ERROR Logging")
- [Error2](Logging$$Error2.html)
- [Error3](Logging$$Error3.html)
- [Info](Logging$$Info.html "For INFO Logging")
- [Info2](Logging$$Info2.html)
- [Info3](Logging$$Info3.html)
- [InitializeLogger](Logging$$InitializeLogger.html "Message which is sent to each default logger (i.e.")
- [LogEvent](Logging$$LogEvent.html "Base type of LogEvents")
- [LogEventException](Logging$$LogEventException.html "Exception that wraps a LogEvent.")
- [LogEventWithCause](Logging$$LogEventWithCause.html)
- [LogEventWithMarker](Logging$$LogEventWithMarker.html "INTERNAL API, Marker interface for LogEvents containing Markers, which can be set for example on an slf4j logger")
- [LogLevel](Logging$$LogLevel.html "Marker trait for annotating LogLevel, which must be Int after erasure.")
- [LoggerException](Logging$$LoggerException.html "Artificial exception injected into Error events if no Throwable is supplied; used for getting a stack dump of error locations.")
- [LoggerInitializationException](Logging$$LoggerInitializationException.html "LoggerInitializationException is thrown to indicate that there was a problem initializing a logger")
- [LoggerInitialized](Logging$$LoggerInitialized.html "Response message each logger must send within 1 second after receiving the InitializeLogger request.")
- [StandardOutLogger](Logging$$StandardOutLogger.html "Actor-less logging implementation for synchronous logging to standard output.")
- StdOutLogger
- [Warning](Logging$$Warning.html "For WARNING Logging")
- [Warning2](Logging$$Warning2.html)
- [Warning3](Logging$$Warning3.html)
- [Warning4](Logging$$Warning4.html)
[t](Logging$$StdOutLogger$.html "See companion object")[akka](../index.html).[event](index.html).[Logging](Logging$.html)

# [StdOutLogger](Logging$$StdOutLogger$.html "See companion object")[**](../../akka/event/Logging$$StdOutLogger.html "Permalink")

### Companion [object StdOutLogger](Logging$$StdOutLogger$.html "See companion object")

#### trait StdOutLogger extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[Logging.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/Logging.scala#L980)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[DefaultLogger](Logging$$DefaultLogger.html), [StandardOutLogger](Logging$$StandardOutLogger.html), [TestEventListener](../testkit/TestEventListener.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StdOutLogger
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

1. [**](../../akka/event/Logging$$StdOutLogger.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/event/Logging$$StdOutLogger.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/event/Logging$$StdOutLogger.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StdOutLogger toany2stringadd\[StdOutLogger] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/event/Logging$$StdOutLogger.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StdOutLogger, B)ImplicitThis member is added by an implicit conversion from StdOutLogger toArrowAssoc\[StdOutLogger] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/event/Logging$$StdOutLogger.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/event/Logging$$StdOutLogger.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/event/Logging$$StdOutLogger.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/event/Logging$$StdOutLogger.html#debug(event:akka.event.Logging.Debug):Unit "Permalink")  def debug(event: [Debug](Logging$$Debug.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
9. [**](../../akka/event/Logging$$StdOutLogger.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StdOutLogger) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StdOutLoggerImplicitThis member is added by an implicit conversion from StdOutLogger toEnsuring\[StdOutLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/event/Logging$$StdOutLogger.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StdOutLogger) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StdOutLoggerImplicitThis member is added by an implicit conversion from StdOutLogger toEnsuring\[StdOutLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/event/Logging$$StdOutLogger.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StdOutLoggerImplicitThis member is added by an implicit conversion from StdOutLogger toEnsuring\[StdOutLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/event/Logging$$StdOutLogger.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StdOutLoggerImplicitThis member is added by an implicit conversion from StdOutLogger toEnsuring\[StdOutLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/event/Logging$$StdOutLogger.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/event/Logging$$StdOutLogger.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/event/Logging$$StdOutLogger.html#error(event:akka.event.Logging.Error):Unit "Permalink")  def error(event: [Error](Logging$$Error.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
16. [**](../../akka/event/Logging$$StdOutLogger.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/event/Logging$$StdOutLogger.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/event/Logging$$StdOutLogger.html#info(event:akka.event.Logging.Info):Unit "Permalink")  def info(event: [Info](Logging$$Info.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
19. [**](../../akka/event/Logging$$StdOutLogger.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../akka/event/Logging$$StdOutLogger.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/event/Logging$$StdOutLogger.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/event/Logging$$StdOutLogger.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/event/Logging$$StdOutLogger.html#print(event:Any):Unit "Permalink")  def print(event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
24. [**](../../akka/event/Logging$$StdOutLogger.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/event/Logging$$StdOutLogger.html#timestamp(event:akka.event.Logging.LogEvent):String "Permalink")  def timestamp(event: [LogEvent](Logging$$LogEvent.html)): String
26. [**](../../akka/event/Logging$$StdOutLogger.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../akka/event/Logging$$StdOutLogger.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../akka/event/Logging$$StdOutLogger.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../akka/event/Logging$$StdOutLogger.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../akka/event/Logging$$StdOutLogger.html#warning(event:akka.event.Logging.Warning):Unit "Permalink")  def warning(event: [Warning](Logging$$Warning.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
### Deprecated Value Members

1. [**](../../akka/event/Logging$$StdOutLogger.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/event/Logging$$StdOutLogger.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StdOutLogger toStringFormat\[StdOutLogger] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/event/Logging$$StdOutLogger.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StdOutLogger, B)ImplicitThis member is added by an implicit conversion from StdOutLogger toArrowAssoc\[StdOutLogger] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStdOutLogger to any2stringadd\[StdOutLogger]

### Inherited by implicit conversion StringFormat fromStdOutLogger to StringFormat\[StdOutLogger]

### Inherited by implicit conversion Ensuring fromStdOutLogger to Ensuring\[StdOutLogger]

### Inherited by implicit conversion ArrowAssoc fromStdOutLogger to ArrowAssoc\[StdOutLogger]

### Ungrouped

## Code Examples

### Example 1: Packages

```text
val log = Logging(<bus>, <source object>)
...
log.info("hello world!")
```

### Example 2: Packages

```text
akka {
  loggers = ["akka.slf4j.Slf4jLogger"] # for example
  loglevel = "INFO"        # used when normal logging ("loggers") has been started
  stdout-loglevel = "WARN" # used during application start-up until normal logging is available
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Debug$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Debug.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Debug2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Debug3.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$DefaultLogger.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Error$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Error.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Error2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Error3.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Info$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Info.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Info2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Info3.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$InitializeLogger.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogEvent$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogEventException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogEventWithCause.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogEventWithMarker.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogLevel.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LoggerException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LoggerInitializationException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LoggerInitialized$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LoggerInitialized.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$StandardOutLogger.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$StdOutLogger$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$StdOutLogger.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Warning$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Warning.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Warning2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Warning3.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Warning4.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestEventListener.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$StdOutLogger.html](https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$StdOutLogger.html)*