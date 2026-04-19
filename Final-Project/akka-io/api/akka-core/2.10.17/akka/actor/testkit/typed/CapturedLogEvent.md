---
description: Akka 2.10.17 - akka.actor.testkit.typed.CapturedLogEvent
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/CapturedLogEvent.html
title: Akka 2.10.17 - akka.actor.testkit.typed.CapturedLogEvent
---

# Akka 2.10.17 - akka.actor.testkit.typed.CapturedLogEvent

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.CapturedLogEvent

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
- CapturedLogEvent
- [Effect](Effect.html "All tracked effects for the akka.actor.testkit.typed.scaladsl.BehaviorTestKit and akka.actor.testkit.typed.javadsl.BehaviorTestKit must extend this type.")
- [FishingOutcome](FishingOutcome.html "Not for user extension.")
- [LoggingEvent](LoggingEvent.html "Representation of logging event when testing with akka.actor.testkit.typed.scaladsl.LoggingTestKit or akka.actor.testkit.typed.javadsl.LoggingTestKit.")
- [TestException](TestException.html "A predefined exception that can be used in tests.")
- [TestKitSettings](TestKitSettings.html)
[c](CapturedLogEvent$.html "See companion object")[akka](../../../index.html).[actor](../../index.html).[testkit](../index.html).[typed](index.html)

# [CapturedLogEvent](CapturedLogEvent$.html "See companion object")[**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html "Permalink")

### Companion [object CapturedLogEvent](CapturedLogEvent$.html "See companion object")

#### final  case class CapturedLogEvent(level: Level, message: String, cause: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable], marker: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Marker]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Representation of a Log Event issued by a [akka.actor.typed.Behavior](../../typed/Behavior.html)
when testing with [akka.actor.testkit.typed.scaladsl.BehaviorTestKit](scaladsl/BehaviorTestKit.html)
or [akka.actor.testkit.typed.javadsl.BehaviorTestKit](javadsl/BehaviorTestKit.html).

Source[CapturedLogEvent.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/CapturedLogEvent.scala#L22)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CapturedLogEvent
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

1. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#<init>(level:org.slf4j.event.Level,message:String,errorCause:Throwable,marker:org.slf4j.Marker):akka.actor.testkit.typed.CapturedLogEvent "Permalink")  new CapturedLogEvent(level: Level, message: String, errorCause: Throwable, marker: Marker)Constructor for Java API
2. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#<init>(level:org.slf4j.event.Level,message:String,marker:org.slf4j.Marker):akka.actor.testkit.typed.CapturedLogEvent "Permalink")  new CapturedLogEvent(level: Level, message: String, marker: Marker)Constructor for Java API
3. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#<init>(level:org.slf4j.event.Level,message:String,errorCause:Throwable):akka.actor.testkit.typed.CapturedLogEvent "Permalink")  new CapturedLogEvent(level: Level, message: String, errorCause: Throwable)Constructor for Java API
4. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#<init>(level:org.slf4j.event.Level,message:String):akka.actor.testkit.typed.CapturedLogEvent "Permalink")  new CapturedLogEvent(level: Level, message: String)Constructor for Java API
5. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#<init>(level:org.slf4j.event.Level,message:String,errorCause:java.util.Optional[Throwable],marker:java.util.Optional[org.slf4j.Marker],mdc:java.util.Map[String,Any]):akka.actor.testkit.typed.CapturedLogEvent "Permalink")  new CapturedLogEvent(level: Level, message: String, errorCause: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable], marker: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Marker], mdc: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)])Constructor for Java API
6. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#<init>(level:org.slf4j.event.Level,message:String,cause:Option[Throwable],marker:Option[org.slf4j.Marker]):akka.actor.testkit.typed.CapturedLogEvent "Permalink")  new CapturedLogEvent(level: Level, message: String, cause: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable], marker: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Marker])
### Value Members

1. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CapturedLogEvent toany2stringadd\[CapturedLogEvent] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CapturedLogEvent, B)ImplicitThis member is added by an implicit conversion from CapturedLogEvent toArrowAssoc\[CapturedLogEvent] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#cause:Option[Throwable] "Permalink")  val cause: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable]
8. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CapturedLogEvent) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CapturedLogEventImplicitThis member is added by an implicit conversion from CapturedLogEvent toEnsuring\[CapturedLogEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CapturedLogEvent) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CapturedLogEventImplicitThis member is added by an implicit conversion from CapturedLogEvent toEnsuring\[CapturedLogEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CapturedLogEventImplicitThis member is added by an implicit conversion from CapturedLogEvent toEnsuring\[CapturedLogEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CapturedLogEventImplicitThis member is added by an implicit conversion from CapturedLogEvent toEnsuring\[CapturedLogEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#getErrorCause:java.util.Optional[Throwable] "Permalink")  def getErrorCause: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]
16. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#getMarker:java.util.Optional[org.slf4j.Marker] "Permalink")  def getMarker: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Marker]
17. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#level:org.slf4j.event.Level "Permalink")  val level: Level
19. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#marker:Option[org.slf4j.Marker] "Permalink")  val marker: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Marker]
20. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#message:String "Permalink")  val message: String
21. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
25. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CapturedLogEvent toStringFormat\[CapturedLogEvent] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CapturedLogEvent, B)ImplicitThis member is added by an implicit conversion from CapturedLogEvent toArrowAssoc\[CapturedLogEvent] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCapturedLogEvent to any2stringadd\[CapturedLogEvent]

### Inherited by implicit conversion StringFormat fromCapturedLogEvent to StringFormat\[CapturedLogEvent]

### Inherited by implicit conversion Ensuring fromCapturedLogEvent to Ensuring\[CapturedLogEvent]

### Inherited by implicit conversion ArrowAssoc fromCapturedLogEvent to ArrowAssoc\[CapturedLogEvent]

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
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent.html)*