---
description: Akka 2.10.17 - akka.stream.Attributes.LogLevels
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:33:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/Attributes$$LogLevels$.html
title: Akka 2.10.17 - akka.stream.Attributes.LogLevels
---

# Akka 2.10.17 - akka.stream.Attributes.LogLevels

> **Summary:** Akka 2.10.17 - akka.stream.Attributes.LogLevels

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/Attributes$.html "Permalink")  object [Attributes](Attributes$.html "Note that more attributes for the Materializer are defined in ActorAttributes.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Note that more attributes for the [Materializer](Materializer.html) are defined in [ActorAttributes](ActorAttributes$.html).

Note that more attributes for the [Materializer](Materializer.html) are defined in [ActorAttributes](ActorAttributes$.html).

Definition Classes[stream](index.html)
- [AsyncBoundary](Attributes$$AsyncBoundary$.html)
- [Attribute](Attributes$$Attribute.html)
- [CancellationStrategy](Attributes$$CancellationStrategy.html "Cancellation strategies provide a way to configure the behavior of a stage when cancelStage is called.")
- [InputBuffer](Attributes$$InputBuffer.html "Each asynchronous piece of a materialized stream topology is executed by one Actor that manages an input buffer for all inlets of its shape.")
- [LogLevels](Attributes$$LogLevels.html)
- [MandatoryAttribute](Attributes$$MandatoryAttribute.html "Attributes that are always present (is defined with default values by the materializer)")
- [Name](Attributes$$Name.html)
- [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html "Nested materialization cancellation strategy provides a way to configure the cancellation behavior of stages that materialize a nested flow.")
- [SourceLocation](Attributes$$SourceLocation.html "Attribute that contains the source location of for example a lambda passed to an operator, useful for example for debugging.")
[o](Attributes$$LogLevels.html "See companion class")[akka](../index.html).[stream](index.html).[Attributes](Attributes$.html)

# [LogLevels](Attributes$$LogLevels.html "See companion class")[**](../../akka/stream/Attributes$$LogLevels$.html "Permalink")

### Companion [class LogLevels](Attributes$$LogLevels.html "See companion class")

#### object LogLevels extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[Attributes.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/Attributes.scala#L660)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LogLevels
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/stream/Attributes$$LogLevels$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/Attributes$$LogLevels$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/Attributes$$LogLevels$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/stream/Attributes$$LogLevels$.html#Debug:akka.event.Logging.LogLevel "Permalink") final  val Debug: [LogLevel](../event/Logging$$LogLevel.html)Use to enable logging at DEBUG level for certain operations when configuring [Attributes\#logLevels](Attributes$.html#logLevels(onElement:akka.event.Logging.LogLevel,onFinish:akka.event.Logging.LogLevel,onFailure:akka.event.Logging.LogLevel):akka.stream.Attributes)
5. [**](../../akka/stream/Attributes$$LogLevels$.html#Error:akka.event.Logging.LogLevel "Permalink") final  val Error: [LogLevel](../event/Logging$$LogLevel.html)Use to enable logging at ERROR level for certain operations when configuring [Attributes\#logLevels](Attributes$.html#logLevels(onElement:akka.event.Logging.LogLevel,onFinish:akka.event.Logging.LogLevel,onFailure:akka.event.Logging.LogLevel):akka.stream.Attributes)
6. [**](../../akka/stream/Attributes$$LogLevels$.html#Info:akka.event.Logging.LogLevel "Permalink") final  val Info: [LogLevel](../event/Logging$$LogLevel.html)Use to enable logging at INFO level for certain operations when configuring [Attributes\#logLevels](Attributes$.html#logLevels(onElement:akka.event.Logging.LogLevel,onFinish:akka.event.Logging.LogLevel,onFailure:akka.event.Logging.LogLevel):akka.stream.Attributes)
7. [**](../../akka/stream/Attributes$$LogLevels$.html#Off:akka.event.Logging.LogLevel "Permalink") final  val Off: [LogLevel](../event/Logging$$LogLevel.html)Use to disable logging on certain operations when configuring [Attributes\#logLevels](Attributes$.html#logLevels(onElement:akka.event.Logging.LogLevel,onFinish:akka.event.Logging.LogLevel,onFailure:akka.event.Logging.LogLevel):akka.stream.Attributes)
8. [**](../../akka/stream/Attributes$$LogLevels$.html#Warning:akka.event.Logging.LogLevel "Permalink") final  val Warning: [LogLevel](../event/Logging$$LogLevel.html)Use to enable logging at WARNING level for certain operations when configuring [Attributes\#logLevels](Attributes$.html#logLevels(onElement:akka.event.Logging.LogLevel,onFinish:akka.event.Logging.LogLevel,onFailure:akka.event.Logging.LogLevel):akka.stream.Attributes)
9. [**](../../akka/stream/Attributes$$LogLevels$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../akka/stream/Attributes$$LogLevels$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/stream/Attributes$$LogLevels$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/stream/Attributes$$LogLevels$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
13. [**](../../akka/stream/Attributes$$LogLevels$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/stream/Attributes$$LogLevels$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/stream/Attributes$$LogLevels$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/stream/Attributes$$LogLevels$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/stream/Attributes$$LogLevels$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/stream/Attributes$$LogLevels$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/stream/Attributes$$LogLevels$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../akka/stream/Attributes$$LogLevels$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../akka/stream/Attributes$$LogLevels$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/stream/Attributes$$LogLevels$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/stream/Attributes$$LogLevels$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/Attributes$$LogLevels$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/event/Logging$$LogLevel.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$AsyncBoundary$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$Attribute.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$InputBuffer.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$LogLevels$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$LogLevels.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$MandatoryAttribute.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$Name.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$SourceLocation$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$SourceLocation.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/Attributes$$LogLevels$.html](https://doc.akka.io/api/akka/current/akka/stream/Attributes$$LogLevels$.html)*