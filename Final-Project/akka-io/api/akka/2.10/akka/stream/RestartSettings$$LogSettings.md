---
description: Akka 2.10.17 - akka.stream.RestartSettings.LogSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:00:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/RestartSettings$$LogSettings.html
title: Akka 2.10.17 - akka.stream.RestartSettings.LogSettings
---

# Akka 2.10.17 - akka.stream.RestartSettings.LogSettings

> **Summary:** Akka 2.10.17 - akka.stream.RestartSettings.LogSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/RestartSettings$.html "Permalink")  object [RestartSettings](RestartSettings$.html)Definition Classes[stream](index.html)
- LogSettings
[c](RestartSettings$$LogSettings$.html "See companion object")[akka](../index.html).[stream](index.html).[RestartSettings](RestartSettings$.html)

# [LogSettings](RestartSettings$$LogSettings$.html "See companion object")[**](../../akka/stream/RestartSettings$$LogSettings.html "Permalink")

### Companion [object LogSettings](RestartSettings$$LogSettings$.html "See companion object")

#### final  class LogSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[RestartSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/RestartSettings.scala#L113)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LogSettings
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
### Instance Constructors

1. [**](../../akka/stream/RestartSettings$$LogSettings.html#<init>(logLevel:akka.event.Logging.LogLevel,criticalLogLevel:akka.event.Logging.LogLevel,criticalLogLevelAfter:Int):akka.stream.RestartSettings.LogSettings "Permalink")  new LogSettings(logLevel: [LogLevel](../event/Logging$$LogLevel.html), criticalLogLevel: [LogLevel](../event/Logging$$LogLevel.html), criticalLogLevelAfter: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
2. [**](../../akka/stream/RestartSettings$$LogSettings.html#<init>(logLevel:akka.event.Logging.LogLevel,criticalLogLevel:akka.event.Logging.LogLevel,criticalLogLevelAfter:Int,verboseLogsAfter:Option[Int]):akka.stream.RestartSettings.LogSettings "Permalink")  new LogSettings(logLevel: [LogLevel](../event/Logging$$LogLevel.html), criticalLogLevel: [LogLevel](../event/Logging$$LogLevel.html), criticalLogLevelAfter: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), verboseLogsAfter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)])
### Value Members

1. [**](../../akka/stream/RestartSettings$$LogSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/RestartSettings$$LogSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/RestartSettings$$LogSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LogSettings toany2stringadd\[LogSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/RestartSettings$$LogSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LogSettings, B)ImplicitThis member is added by an implicit conversion from LogSettings toArrowAssoc\[LogSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/RestartSettings$$LogSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/RestartSettings$$LogSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/RestartSettings$$LogSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/RestartSettings$$LogSettings.html#criticalLogLevel:akka.event.Logging.LogLevel "Permalink")  val criticalLogLevel: [LogLevel](../event/Logging$$LogLevel.html)
9. [**](../../akka/stream/RestartSettings$$LogSettings.html#criticalLogLevelAfter:Int "Permalink")  val criticalLogLevelAfter: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
10. [**](../../akka/stream/RestartSettings$$LogSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LogSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LogSettingsImplicitThis member is added by an implicit conversion from LogSettings toEnsuring\[LogSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/RestartSettings$$LogSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LogSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LogSettingsImplicitThis member is added by an implicit conversion from LogSettings toEnsuring\[LogSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/RestartSettings$$LogSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LogSettingsImplicitThis member is added by an implicit conversion from LogSettings toEnsuring\[LogSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/stream/RestartSettings$$LogSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LogSettingsImplicitThis member is added by an implicit conversion from LogSettings toEnsuring\[LogSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/stream/RestartSettings$$LogSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/stream/RestartSettings$$LogSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../akka/stream/RestartSettings$$LogSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/stream/RestartSettings$$LogSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/stream/RestartSettings$$LogSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/stream/RestartSettings$$LogSettings.html#logLevel:akka.event.Logging.LogLevel "Permalink")  val logLevel: [LogLevel](../event/Logging$$LogLevel.html)
20. [**](../../akka/stream/RestartSettings$$LogSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/stream/RestartSettings$$LogSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/stream/RestartSettings$$LogSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/stream/RestartSettings$$LogSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../akka/stream/RestartSettings$$LogSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../akka/stream/RestartSettings$$LogSettings.html#verboseLogsAfter:Option[Int] "Permalink")  val verboseLogsAfter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
26. [**](../../akka/stream/RestartSettings$$LogSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/stream/RestartSettings$$LogSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../akka/stream/RestartSettings$$LogSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../akka/stream/RestartSettings$$LogSettings.html#withCriticalLogLevel(criticalLevel:akka.event.Logging.LogLevel,afterErrors:Int):akka.stream.RestartSettings.LogSettings "Permalink")  def withCriticalLogLevel(criticalLevel: [LogLevel](../event/Logging$$LogLevel.html), afterErrors: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): LogSettingsPossibility to use another log level after a given number of errors.

Possibility to use another log level after a given number of errors.
The initial errors are logged at the level defined with [LogSettings.withLogLevel](#withLogLevel(level:akka.event.Logging.LogLevel):akka.stream.RestartSettings.LogSettings).
For example, the first 3 errors can be logged at INFO level and thereafter at ERROR level.

The counter (and log level) is reset after the [RestartSettings.maxRestartsWithin](RestartSettings.html#maxRestartsWithin:scala.concurrent.duration.FiniteDuration)
duration.
30. [**](../../akka/stream/RestartSettings$$LogSettings.html#withLogLevel(level:akka.event.Logging.LogLevel):akka.stream.RestartSettings.LogSettings "Permalink")  def withLogLevel(level: [LogLevel](../event/Logging$$LogLevel.html)): LogSettings
31. [**](../../akka/stream/RestartSettings$$LogSettings.html#withVerboseLogsAfter(afterErrors:Int):akka.stream.RestartSettings.LogSettings "Permalink")  def withVerboseLogsAfter(afterErrors: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): LogSettingsIf set, warning and error logs will use only the exception message up to `afterErrors` consecutive errors,
after reaching the number of consecutive errors, the entire exception with stacktrace is logged.

If set, warning and error logs will use only the exception message up to `afterErrors` consecutive errors,
after reaching the number of consecutive errors, the entire exception with stacktrace is logged.

The counter (and verbosity level) is reset after the [RestartSettings.maxRestartsWithin](RestartSettings.html#maxRestartsWithin:scala.concurrent.duration.FiniteDuration)
duration.
### Deprecated Value Members

1. [**](../../akka/stream/RestartSettings$$LogSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/RestartSettings$$LogSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LogSettings toStringFormat\[LogSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/RestartSettings$$LogSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LogSettings, B)ImplicitThis member is added by an implicit conversion from LogSettings toArrowAssoc\[LogSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLogSettings to any2stringadd\[LogSettings]

### Inherited by implicit conversion StringFormat fromLogSettings to StringFormat\[LogSettings]

### Inherited by implicit conversion Ensuring fromLogSettings to Ensuring\[LogSettings]

### Inherited by implicit conversion ArrowAssoc fromLogSettings to ArrowAssoc\[LogSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/event/Logging$$LogLevel.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/RestartSettings$$LogSettings$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/RestartSettings$$LogSettings.html
- https://doc.akka.io/api/akka/2.10/akka/stream/RestartSettings$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/RestartSettings.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/RestartSettings$$LogSettings.html](https://doc.akka.io/api/akka/2.10/akka/stream/RestartSettings$$LogSettings.html)*