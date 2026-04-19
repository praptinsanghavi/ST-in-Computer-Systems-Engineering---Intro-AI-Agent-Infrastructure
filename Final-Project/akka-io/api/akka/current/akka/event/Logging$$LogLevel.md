---
description: Akka 2.10.17 - akka.event.Logging.LogLevel
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:53:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/Logging$$LogLevel.html
title: Akka 2.10.17 - akka.event.Logging.LogLevel
---

# Akka 2.10.17 - akka.event.Logging.LogLevel

> **Summary:** Akka 2.10.17 - akka.event.Logging.LogLevel

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
- LogLevel
- [LoggerException](Logging$$LoggerException.html "Artificial exception injected into Error events if no Throwable is supplied; used for getting a stack dump of error locations.")
- [LoggerInitializationException](Logging$$LoggerInitializationException.html "LoggerInitializationException is thrown to indicate that there was a problem initializing a logger")
- [LoggerInitialized](Logging$$LoggerInitialized.html "Response message each logger must send within 1 second after receiving the InitializeLogger request.")
- [StandardOutLogger](Logging$$StandardOutLogger.html "Actor-less logging implementation for synchronous logging to standard output.")
- [StdOutLogger](Logging$$StdOutLogger.html)
- [Warning](Logging$$Warning.html "For WARNING Logging")
- [Warning2](Logging$$Warning2.html)
- [Warning3](Logging$$Warning3.html)
- [Warning4](Logging$$Warning4.html)
c[akka](../index.html).[event](index.html).[Logging](Logging$.html)

# LogLevel[**](../../akka/event/Logging$$LogLevel.html "Permalink")

### 

#### final  case class LogLevel(asInt: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Marker trait for annotating LogLevel, which must be Int after erasure.

Source[Logging.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/Logging.scala#L473)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LogLevel
2. Serializable
3. Product
4. Equals
5. AnyVal
6. Any
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

1. [**](../../akka/event/Logging$$LogLevel.html#<init>(asInt:Int):akka.event.Logging.LogLevel "Permalink")  new LogLevel(asInt: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
### Value Members

1. [**](../../akka/event/Logging$$LogLevel.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../akka/event/Logging$$LogLevel.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../akka/event/Logging$$LogLevel.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LogLevel toany2stringadd\[LogLevel] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/event/Logging$$LogLevel.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LogLevel, B)ImplicitThis member is added by an implicit conversion from LogLevel toArrowAssoc\[LogLevel] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/event/Logging$$LogLevel.html#<(other:akka.event.Logging.LogLevel):Boolean "Permalink") final  def \<(other: LogLevel): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Annotations@inline()
6. [**](../../akka/event/Logging$$LogLevel.html#<=(other:akka.event.Logging.LogLevel):Boolean "Permalink") final  def \<\=(other: LogLevel): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Annotations@inline()
7. [**](../../akka/event/Logging$$LogLevel.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
8. [**](../../akka/event/Logging$$LogLevel.html#>(other:akka.event.Logging.LogLevel):Boolean "Permalink") final  def \>(other: LogLevel): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Annotations@inline()
9. [**](../../akka/event/Logging$$LogLevel.html#>=(other:akka.event.Logging.LogLevel):Boolean "Permalink") final  def \>\=(other: LogLevel): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Annotations@inline()
10. [**](../../akka/event/Logging$$LogLevel.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../akka/event/Logging$$LogLevel.html#asInt:Int "Permalink")  val asInt: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
12. [**](../../akka/event/Logging$$LogLevel.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LogLevel) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LogLevelImplicitThis member is added by an implicit conversion from LogLevel toEnsuring\[LogLevel] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/event/Logging$$LogLevel.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LogLevel) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LogLevelImplicitThis member is added by an implicit conversion from LogLevel toEnsuring\[LogLevel] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/event/Logging$$LogLevel.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LogLevelImplicitThis member is added by an implicit conversion from LogLevel toEnsuring\[LogLevel] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/event/Logging$$LogLevel.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LogLevelImplicitThis member is added by an implicit conversion from LogLevel toEnsuring\[LogLevel] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/event/Logging$$LogLevel.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
17. [**](../../akka/event/Logging$$LogLevel.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/event/Logging$$LogLevel.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
### Deprecated Value Members

1. [**](../../akka/event/Logging$$LogLevel.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LogLevel toStringFormat\[LogLevel] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../akka/event/Logging$$LogLevel.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LogLevel, B)ImplicitThis member is added by an implicit conversion from LogLevel toArrowAssoc\[LogLevel] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLogLevel to any2stringadd\[LogLevel]

### Inherited by implicit conversion StringFormat fromLogLevel to StringFormat\[LogLevel]

### Inherited by implicit conversion Ensuring fromLogLevel to Ensuring\[LogLevel]

### Inherited by implicit conversion ArrowAssoc fromLogLevel to ArrowAssoc\[LogLevel]

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

- https://doc.akka.io/api/akka/current/akka/event/Logging$$Debug$.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Debug.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Debug2.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Debug3.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$DefaultLogger.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Error$.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Error.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Error2.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Error3.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Info$.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Info.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Info2.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Info3.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$InitializeLogger.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$LogEvent$.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$LogEvent.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$LogEventException.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$LogEventWithCause.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$LogEventWithMarker.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$LogLevel.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$LoggerException.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$LoggerInitializationException.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$LoggerInitialized$.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$LoggerInitialized.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$StandardOutLogger.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$StdOutLogger$.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$StdOutLogger.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Warning$.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Warning.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Warning2.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Warning3.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$$Warning4.html
- https://doc.akka.io/api/akka/current/akka/event/Logging$.html
- https://doc.akka.io/api/akka/current/akka/event/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/event/Logging$$LogLevel.html](https://doc.akka.io/api/akka/current/akka/event/Logging$$LogLevel.html)*