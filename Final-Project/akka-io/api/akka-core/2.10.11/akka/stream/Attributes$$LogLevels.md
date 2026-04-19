---
description: Akka 2.10.11 - akka.stream.Attributes.LogLevels
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:28:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/Attributes$$LogLevels.html
title: Akka 2.10.11 - akka.stream.Attributes.LogLevels
---

# Akka 2.10.11 - akka.stream.Attributes.LogLevels

> **Summary:** Akka 2.10.11 - akka.stream.Attributes.LogLevels

## Content

Akka2\.10\.11 \< Back****# Packages

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
- LogLevels
- [MandatoryAttribute](Attributes$$MandatoryAttribute.html "Attributes that are always present (is defined with default values by the materializer)")
- [Name](Attributes$$Name.html)
- [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html "Nested materialization cancellation strategy provides a way to configure the cancellation behavior of stages that materialize a nested flow.")
- [SourceLocation](Attributes$$SourceLocation.html "Attribute that contains the source location of for example a lambda passed to an operator, useful for example for debugging.")
[c](Attributes$$LogLevels$.html "See companion object")[akka](../index.html).[stream](index.html).[Attributes](Attributes$.html)

# [LogLevels](Attributes$$LogLevels$.html "See companion object")[**](../../akka/stream/Attributes$$LogLevels.html "Permalink")

### Companion [object LogLevels](Attributes$$LogLevels$.html "See companion object")

#### final  case class LogLevels(onElement: [LogLevel](../event/Logging$$LogLevel.html), onFinish: [LogLevel](../event/Logging$$LogLevel.html), onFailure: [LogLevel](../event/Logging$$LogLevel.html)) extends [Attribute](Attributes$$Attribute.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[Attributes.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-stream/src/main/scala/akka/stream/Attributes.scala#L398)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Attribute](Attributes$$Attribute.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LogLevels
2. Serializable
3. Product
4. Equals
5. Attribute
6. AnyRef
7. Any
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

1. [**](../../akka/stream/Attributes$$LogLevels.html#<init>(onElement:akka.event.Logging.LogLevel,onFinish:akka.event.Logging.LogLevel,onFailure:akka.event.Logging.LogLevel):akka.stream.Attributes.LogLevels "Permalink")  new LogLevels(onElement: [LogLevel](../event/Logging$$LogLevel.html), onFinish: [LogLevel](../event/Logging$$LogLevel.html), onFailure: [LogLevel](../event/Logging$$LogLevel.html))
### Value Members

1. [**](../../akka/stream/Attributes$$LogLevels.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/Attributes$$LogLevels.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/Attributes$$LogLevels.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LogLevels toany2stringadd\[LogLevels] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/Attributes$$LogLevels.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LogLevels, B)ImplicitThis member is added by an implicit conversion from LogLevels toArrowAssoc\[LogLevels] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/Attributes$$LogLevels.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/Attributes$$LogLevels.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/Attributes$$LogLevels.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/Attributes$$LogLevels.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LogLevels) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LogLevelsImplicitThis member is added by an implicit conversion from LogLevels toEnsuring\[LogLevels] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/stream/Attributes$$LogLevels.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LogLevels) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LogLevelsImplicitThis member is added by an implicit conversion from LogLevels toEnsuring\[LogLevels] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/Attributes$$LogLevels.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LogLevelsImplicitThis member is added by an implicit conversion from LogLevels toEnsuring\[LogLevels] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/Attributes$$LogLevels.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LogLevelsImplicitThis member is added by an implicit conversion from LogLevels toEnsuring\[LogLevels] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/Attributes$$LogLevels.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/stream/Attributes$$LogLevels.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/stream/Attributes$$LogLevels.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../akka/stream/Attributes$$LogLevels.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/stream/Attributes$$LogLevels.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/stream/Attributes$$LogLevels.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/stream/Attributes$$LogLevels.html#onElement:akka.event.Logging.LogLevel "Permalink")  val onElement: [LogLevel](../event/Logging$$LogLevel.html)
19. [**](../../akka/stream/Attributes$$LogLevels.html#onFailure:akka.event.Logging.LogLevel "Permalink")  val onFailure: [LogLevel](../event/Logging$$LogLevel.html)
20. [**](../../akka/stream/Attributes$$LogLevels.html#onFinish:akka.event.Logging.LogLevel "Permalink")  val onFinish: [LogLevel](../event/Logging$$LogLevel.html)
21. [**](../../akka/stream/Attributes$$LogLevels.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../akka/stream/Attributes$$LogLevels.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/stream/Attributes$$LogLevels.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/stream/Attributes$$LogLevels.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/stream/Attributes$$LogLevels.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/Attributes$$LogLevels.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/Attributes$$LogLevels.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LogLevels toStringFormat\[LogLevels] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/Attributes$$LogLevels.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LogLevels, B)ImplicitThis member is added by an implicit conversion from LogLevels toArrowAssoc\[LogLevels] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Attribute](Attributes$$Attribute.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLogLevels to any2stringadd\[LogLevels]

### Inherited by implicit conversion StringFormat fromLogLevels to StringFormat\[LogLevels]

### Inherited by implicit conversion Ensuring fromLogLevels to Ensuring\[LogLevels]

### Inherited by implicit conversion ArrowAssoc fromLogLevels to ArrowAssoc\[LogLevels]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/Logging$$LogLevel.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$AsyncBoundary$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$Attribute.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$CancellationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$CancellationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$InputBuffer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$LogLevels$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$LogLevels.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$MandatoryAttribute.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$Name.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$SourceLocation$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$SourceLocation.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$LogLevels.html](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$LogLevels.html)*