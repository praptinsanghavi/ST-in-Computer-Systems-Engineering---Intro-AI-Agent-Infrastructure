---
description: Akka 2.10.17 - akka.actor.testkit.typed.LoggingEvent
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/LoggingEvent.html
title: Akka 2.10.17 - akka.actor.testkit.typed.LoggingEvent
---

# Akka 2.10.17 - akka.actor.testkit.typed.LoggingEvent

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.LoggingEvent

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/actor/testkit/typed/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/actor/testkit/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[typed](index.html)
- [CapturedLogEvent](CapturedLogEvent.html "Representation of a Log Event issued by a akka.actor.typed.Behavior when testing with akka.actor.testkit.typed.scaladsl.BehaviorTestKit or akka.actor.testkit.typed.javadsl.BehaviorTestKit.")
- [Effect](Effect.html "All tracked effects for the akka.actor.testkit.typed.scaladsl.BehaviorTestKit and akka.actor.testkit.typed.javadsl.BehaviorTestKit must extend this type.")
- [FishingOutcome](FishingOutcome.html "Not for user extension.")
- LoggingEvent
- [TestException](TestException.html "A predefined exception that can be used in tests.")
- [TestKitSettings](TestKitSettings.html)
[c](LoggingEvent$.html "See companion object")[akka](../../../index.html).[actor](../../index.html).[testkit](../index.html).[typed](index.html)

# [LoggingEvent](LoggingEvent$.html "See companion object")[**](../../../../akka/actor/testkit/typed/LoggingEvent.html "Permalink")

### Companion [object LoggingEvent](LoggingEvent$.html "See companion object")

#### final  case class LoggingEvent(level: Level, loggerName: String, threadName: String, message: String, timeStamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), marker: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Marker], throwable: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable], mdc: Map\[String, String]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Representation of logging event when testing with [akka.actor.testkit.typed.scaladsl.LoggingTestKit](scaladsl/LoggingTestKit.html)
or [akka.actor.testkit.typed.javadsl.LoggingTestKit](javadsl/LoggingTestKit.html).

Source[LoggingEvent.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/LoggingEvent.scala#L49)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LoggingEvent
2. Serializable
3. Product
4. Equals
5. AnyRef
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

1. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#<init>(level:org.slf4j.event.Level,loggerName:String,threadName:String,message:String,timeStamp:Long,marker:Option[org.slf4j.Marker],throwable:Option[Throwable],mdc:Map[String,String]):akka.actor.testkit.typed.LoggingEvent "Permalink")  new LoggingEvent(level: Level, loggerName: String, threadName: String, message: String, timeStamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), marker: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Marker], throwable: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable], mdc: Map\[String, String])
### Value Members

1. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LoggingEvent toany2stringadd\[LoggingEvent] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LoggingEvent, B)ImplicitThis member is added by an implicit conversion from LoggingEvent toArrowAssoc\[LoggingEvent] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LoggingEvent) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LoggingEventImplicitThis member is added by an implicit conversion from LoggingEvent toEnsuring\[LoggingEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LoggingEvent) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoggingEventImplicitThis member is added by an implicit conversion from LoggingEvent toEnsuring\[LoggingEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LoggingEventImplicitThis member is added by an implicit conversion from LoggingEvent toEnsuring\[LoggingEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoggingEventImplicitThis member is added by an implicit conversion from LoggingEvent toEnsuring\[LoggingEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#getMarker:java.util.Optional[org.slf4j.Marker] "Permalink")  def getMarker: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Marker]Java API
15. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#getMdc:java.util.Map[String,String] "Permalink")  def getMdc: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String]Java API
16. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#getThrowable:java.util.Optional[Throwable] "Permalink")  def getThrowable: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]Java API
17. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#level:org.slf4j.event.Level "Permalink")  val level: Level
19. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#loggerName:String "Permalink")  val loggerName: String
20. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#marker:Option[org.slf4j.Marker] "Permalink")  val marker: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Marker]
21. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#mdc:Map[String,String] "Permalink")  val mdc: Map\[String, String]
22. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#message:String "Permalink")  val message: String
23. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
27. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#threadName:String "Permalink")  val threadName: String
29. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#throwable:Option[Throwable] "Permalink")  val throwable: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable]
30. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#timeStamp:Long "Permalink")  val timeStamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
31. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LoggingEvent toStringFormat\[LoggingEvent] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LoggingEvent, B)ImplicitThis member is added by an implicit conversion from LoggingEvent toArrowAssoc\[LoggingEvent] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLoggingEvent to any2stringadd\[LoggingEvent]

### Inherited by implicit conversion StringFormat fromLoggingEvent to StringFormat\[LoggingEvent]

### Inherited by implicit conversion Ensuring fromLoggingEvent to Ensuring\[LoggingEvent]

### Inherited by implicit conversion ArrowAssoc fromLoggingEvent to ArrowAssoc\[LoggingEvent]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/LoggingEvent$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/LoggingEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/TestException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/TestKitSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/LoggingEvent.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/LoggingEvent.html)*