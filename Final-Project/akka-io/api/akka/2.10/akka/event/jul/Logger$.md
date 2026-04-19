---
description: Akka 2.10.17 - akka.event.jul.Logger
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:05:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/jul/Logger$.html
title: Akka 2.10.17 - akka.event.jul.Logger
---

# Akka 2.10.17 - akka.event.jul.Logger

> **Summary:** Akka 2.10.17 - akka.event.jul.Logger

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/event/index.html "Permalink")  package [event](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/event/jul/index.html "Permalink")  package [jul](index.html)Definition Classes[event](../index.html)
- [JavaLogger](JavaLogger.html "java.util.logging logger.")
- [JavaLogging](JavaLogging.html "Base trait for all classes that wants to be able use the JUL logging infrastructure.")
- [JavaLoggingFilter](JavaLoggingFilter.html "akka.event.LoggingFilter that uses the log level defined in the JUL backend configuration to filter log events before publishing the log events to the eventStream.")
- Logger
o[akka](../../index.html).[event](../index.html).[jul](index.html)

# Logger[**](../../../akka/event/jul/Logger$.html "Permalink")

### 

#### object Logger

Logger is a factory for obtaining JUL Loggers

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use SLF4J or direct java.util.logging instead.

Source[JavaLogger.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/jul/JavaLogger.scala#L63)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Logger
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/event/jul/Logger$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/event/jul/Logger$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/event/jul/Logger$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/event/jul/Logger$.html#apply(logClass:Class[_],logSource:String):java.util.logging.Logger "Permalink")  def apply(logClass: Class\[\_], logSource: String): [java.util.logging.Logger](https://docs.oracle.com/en/java/javase/11/docs/api/java.logging/java/util/logging/Logger.html#java.util.logging.Logger)logClass\- the class to log for

logSource\- the textual representation of the source of this log stream

returnsa Logger for the specified parameters
5. [**](../../../akka/event/jul/Logger$.html#apply(logger:String):java.util.logging.Logger "Permalink")  def apply(logger: String): [java.util.logging.Logger](https://docs.oracle.com/en/java/javase/11/docs/api/java.logging/java/util/logging/Logger.html#java.util.logging.Logger)logger\- which logger

returnsa Logger that corresponds for the given logger name
6. [**](../../../akka/event/jul/Logger$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/event/jul/Logger$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/event/jul/Logger$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/event/jul/Logger$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../akka/event/jul/Logger$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/event/jul/Logger$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/event/jul/Logger$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../akka/event/jul/Logger$.html#mapLevel(level:akka.event.Logging.LogLevel):java.util.logging.Level "Permalink")  def mapLevel(level: [LogLevel](../Logging$$LogLevel.html)): [Level](https://docs.oracle.com/en/java/javase/11/docs/api/java.logging/java/util/logging/Level.html#java.util.logging.Level)
14. [**](../../../akka/event/jul/Logger$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/event/jul/Logger$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/event/jul/Logger$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/event/jul/Logger$.html#root:java.util.logging.Logger "Permalink")  def root: [java.util.logging.Logger](https://docs.oracle.com/en/java/javase/11/docs/api/java.logging/java/util/logging/Logger.html#java.util.logging.Logger)Returns the JUL Root Logger
18. [**](../../../akka/event/jul/Logger$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../akka/event/jul/Logger$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../akka/event/jul/Logger$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/event/jul/Logger$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../akka/event/jul/Logger$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/event/jul/Logger$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/event/Logging$$LogLevel.html
- https://doc.akka.io/api/akka/2.10/akka/event/index.html
- https://doc.akka.io/api/akka/2.10/akka/event/jul/JavaLogger.html
- https://doc.akka.io/api/akka/2.10/akka/event/jul/JavaLogging.html
- https://doc.akka.io/api/akka/2.10/akka/event/jul/JavaLoggingFilter.html
- https://doc.akka.io/api/akka/2.10/akka/event/jul/Logger$.html
- https://doc.akka.io/api/akka/2.10/akka/event/jul/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/event/jul/Logger$.html](https://doc.akka.io/api/akka/2.10/akka/event/jul/Logger$.html)*