---
description: Akka 2.10.17 - akka.event.Logging.Info
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:26:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/Logging$$Info$.html
title: Akka 2.10.17 - akka.event.Logging.Info
---

# Akka 2.10.17 - akka.event.Logging.Info

> **Summary:** Akka 2.10.17 - akka.event.Logging.Info

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
- [StdOutLogger](Logging$$StdOutLogger.html)
- [Warning](Logging$$Warning.html "For WARNING Logging")
- [Warning2](Logging$$Warning2.html)
- [Warning3](Logging$$Warning3.html)
- [Warning4](Logging$$Warning4.html)
[o](Logging$$Info.html "See companion class")[akka](../index.html).[event](index.html).[Logging](Logging$.html)

# [Info](Logging$$Info.html "See companion class")[**](../../akka/event/Logging$$Info$.html "Permalink")

### Companion [class Info](Logging$$Info.html "See companion class")

#### object Info extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[Logging.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/Logging.scala#L902)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Info
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/event/Logging$$Info$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/event/Logging$$Info$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/event/Logging$$Info$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/event/Logging$$Info$.html#apply(logSource:String,logClass:Class[_],message:Any,mdc:akka.event.Logging.MDC,marker:akka.event.LogMarker):akka.event.Logging.Info3 "Permalink")  def apply(logSource: String, logClass: Class\[\_], message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), mdc: [MDC](Logging$.html#MDC=Map[String,Any]), marker: [LogMarker](LogMarker.html)): [Info3](Logging$$Info3.html)
5. [**](../../akka/event/Logging$$Info$.html#apply(logSource:String,logClass:Class[_],message:Any,mdc:akka.event.Logging.MDC):akka.event.Logging.Info2 "Permalink")  def apply(logSource: String, logClass: Class\[\_], message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), mdc: [MDC](Logging$.html#MDC=Map[String,Any])): [Info2](Logging$$Info2.html)
6. [**](../../akka/event/Logging$$Info$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/event/Logging$$Info$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/event/Logging$$Info$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../akka/event/Logging$$Info$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../akka/event/Logging$$Info$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/event/Logging$$Info$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/event/Logging$$Info$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../akka/event/Logging$$Info$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/event/Logging$$Info$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/event/Logging$$Info$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/event/Logging$$Info$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../akka/event/Logging$$Info$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../akka/event/Logging$$Info$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../akka/event/Logging$$Info$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../akka/event/Logging$$Info$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/event/Logging$$Info$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

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
*Source: [https://doc.akka.io/api/akka/current/akka/event/Logging$$Info$.html](https://doc.akka.io/api/akka/current/akka/event/Logging$$Info$.html)*