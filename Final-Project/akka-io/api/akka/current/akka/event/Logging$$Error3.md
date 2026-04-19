---
description: Akka 2.10.17 - akka.event.Logging.Error3
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:23:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/Logging$$Error3.html
title: Akka 2.10.17 - akka.event.Logging.Error3
---

# Akka 2.10.17 - akka.event.Logging.Error3

> **Summary:** Akka 2.10.17 - akka.event.Logging.Error3

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
- Error3
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
- [StdOutLogger](Logging$$StdOutLogger.html)
- [Warning](Logging$$Warning.html "For WARNING Logging")
- [Warning2](Logging$$Warning2.html)
- [Warning3](Logging$$Warning3.html)
- [Warning4](Logging$$Warning4.html)
c[akka](../index.html).[event](index.html).[Logging](Logging$.html)

# Error3[**](../../akka/event/Logging$$Error3.html "Permalink")

### 

#### class Error3 extends [Error2](Logging$$Error2.html) with [LogEventWithMarker](Logging$$LogEventWithMarker.html)

Source[Logging.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/Logging.scala#L814)Linear Supertypes[LogEventWithMarker](Logging$$LogEventWithMarker.html), [Error2](Logging$$Error2.html), [Error](Logging$$Error.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [LogEventWithCause](Logging$$LogEventWithCause.html), [LogEvent](Logging$$LogEvent.html), [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Error3
2. LogEventWithMarker
3. Error2
4. Error
5. Serializable
6. Product
7. Equals
8. LogEventWithCause
9. LogEvent
10. NoSerializationVerificationNeeded
11. AnyRef
12. Any
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

1. [**](../../akka/event/Logging$$Error3.html#<init>(logSource:String,logClass:Class[_],message:Any,mdc:akka.event.Logging.MDC,marker:akka.event.LogMarker):akka.event.Logging.Error3 "Permalink")  new Error3(logSource: String, logClass: Class\[\_], message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), mdc: [MDC](Logging$.html#MDC=Map[String,Any]), marker: [LogMarker](LogMarker.html))
2. [**](../../akka/event/Logging$$Error3.html#<init>(cause:Throwable,logSource:String,logClass:Class[_],message:Any,mdc:akka.event.Logging.MDC,marker:akka.event.LogMarker):akka.event.Logging.Error3 "Permalink")  new Error3(cause: Throwable, logSource: String, logClass: Class\[\_], message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), mdc: [MDC](Logging$.html#MDC=Map[String,Any]), marker: [LogMarker](LogMarker.html))
### Value Members

1. [**](../../akka/event/Logging$$Error3.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/event/Logging$$Error3.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/event/Logging$$Error3.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Error3 toany2stringadd\[Error3] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/event/Logging$$Error3.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Error3, B)ImplicitThis member is added by an implicit conversion from Error3 toArrowAssoc\[Error3] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/event/Logging$$Error3.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/event/Logging$$Error3.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/event/Logging$$Error3.html#cause:Throwable "Permalink")  val cause: ThrowableDefinition ClassesError3 → [Error2](Logging$$Error2.html) → [Error](Logging$$Error.html) → [LogEventWithCause](Logging$$LogEventWithCause.html)
8. [**](../../akka/event/Logging$$Error3.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/event/Logging$$Error3.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Error3) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Error3ImplicitThis member is added by an implicit conversion from Error3 toEnsuring\[Error3] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/event/Logging$$Error3.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Error3) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Error3ImplicitThis member is added by an implicit conversion from Error3 toEnsuring\[Error3] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/event/Logging$$Error3.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Error3ImplicitThis member is added by an implicit conversion from Error3 toEnsuring\[Error3] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/event/Logging$$Error3.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Error3ImplicitThis member is added by an implicit conversion from Error3 toEnsuring\[Error3] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/event/Logging$$Error3.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/event/Logging$$Error3.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/event/Logging$$Error3.html#getMDC:java.util.Map[String,Any] "Permalink")  def getMDC: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Java API: Retrieve the contents of the MDC.

Java API: Retrieve the contents of the MDC.

Definition Classes[LogEvent](Logging$$LogEvent.html)
16. [**](../../akka/event/Logging$$Error3.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/event/Logging$$Error3.html#level:akka.event.Logging.LogLevel "Permalink")  def level: [LogLevel](Logging$$LogLevel.html)The LogLevel of this LogEvent

The LogLevel of this LogEvent

Definition Classes[Error](Logging$$Error.html) → [LogEvent](Logging$$LogEvent.html)
18. [**](../../akka/event/Logging$$Error3.html#logClass:Class[_] "Permalink")  val logClass: Class\[\_]The class of the source of this event

The class of the source of this event

Definition Classes[Error](Logging$$Error.html) → [LogEvent](Logging$$LogEvent.html)
19. [**](../../akka/event/Logging$$Error3.html#logSource:String "Permalink")  val logSource: StringThe source of this event

The source of this event

Definition Classes[Error](Logging$$Error.html) → [LogEvent](Logging$$LogEvent.html)
20. [**](../../akka/event/Logging$$Error3.html#marker:akka.event.LogMarker "Permalink")  val marker: [LogMarker](LogMarker.html)Marker attribute is nullable due to backward binary compatibility in the class `Warning4`

Marker attribute is nullable due to backward binary compatibility in the class `Warning4`

Definition ClassesError3 → [LogEventWithMarker](Logging$$LogEventWithMarker.html)
21. [**](../../akka/event/Logging$$Error3.html#mdc:akka.event.Logging.MDC "Permalink")  val mdc: [MDC](Logging$.html#MDC=Map[String,Any])Extra values for adding to MDC

Extra values for adding to MDC

Definition ClassesError3 → [Error2](Logging$$Error2.html) → [LogEvent](Logging$$LogEvent.html)
22. [**](../../akka/event/Logging$$Error3.html#message:Any "Permalink")  val message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)The message, may be any object or null.

The message, may be any object or null.

Definition Classes[Error](Logging$$Error.html) → [LogEvent](Logging$$LogEvent.html)
23. [**](../../akka/event/Logging$$Error3.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/event/Logging$$Error3.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/event/Logging$$Error3.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/event/Logging$$Error3.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
27. [**](../../akka/event/Logging$$Error3.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../akka/event/Logging$$Error3.html#thread:Thread "Permalink")  val thread: [Thread](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Thread.html#java.lang.Thread)The thread that created this log event

The thread that created this log event

Definition Classes[LogEvent](Logging$$LogEvent.html)Annotations@transient()
29. [**](../../akka/event/Logging$$Error3.html#timestamp:Long "Permalink")  val timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)When this LogEvent was created according to System.currentTimeMillis

When this LogEvent was created according to System.currentTimeMillis

Definition Classes[LogEvent](Logging$$LogEvent.html)
30. [**](../../akka/event/Logging$$Error3.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Appends the marker to the Debug/Info/Warning/Error toString representations

Appends the marker to the Debug/Info/Warning/Error toString representations

Definition Classes[LogEventWithMarker](Logging$$LogEventWithMarker.html) → AnyRef → Any
31. [**](../../akka/event/Logging$$Error3.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../akka/event/Logging$$Error3.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../akka/event/Logging$$Error3.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/event/Logging$$Error3.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/event/Logging$$Error3.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Error3 toStringFormat\[Error3] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/event/Logging$$Error3.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Error3, B)ImplicitThis member is added by an implicit conversion from Error3 toArrowAssoc\[Error3] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [LogEventWithMarker](Logging$$LogEventWithMarker.html)

### Inherited from [Error2](Logging$$Error2.html)

### Inherited from [Error](Logging$$Error.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [LogEventWithCause](Logging$$LogEventWithCause.html)

### Inherited from [LogEvent](Logging$$LogEvent.html)

### Inherited from [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromError3 to any2stringadd\[Error3]

### Inherited by implicit conversion StringFormat fromError3 to StringFormat\[Error3]

### Inherited by implicit conversion Ensuring fromError3 to Ensuring\[Error3]

### Inherited by implicit conversion ArrowAssoc fromError3 to ArrowAssoc\[Error3]

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

- https://doc.akka.io/api/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka/current/akka/event/LogMarker.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/event/Logging$$Error3.html](https://doc.akka.io/api/akka/current/akka/event/Logging$$Error3.html)*