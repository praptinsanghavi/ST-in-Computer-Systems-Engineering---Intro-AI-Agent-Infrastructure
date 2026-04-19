---
description: Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:57:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/Attributes$$CancellationStrategy.html
title: Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy
---

# Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy

> **Summary:** Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy

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
- CancellationStrategy
- [InputBuffer](Attributes$$InputBuffer.html "Each asynchronous piece of a materialized stream topology is executed by one Actor that manages an input buffer for all inlets of its shape.")
- [LogLevels](Attributes$$LogLevels.html)
- [MandatoryAttribute](Attributes$$MandatoryAttribute.html "Attributes that are always present (is defined with default values by the materializer)")
- [Name](Attributes$$Name.html)
- [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html "Nested materialization cancellation strategy provides a way to configure the cancellation behavior of stages that materialize a nested flow.")
- [SourceLocation](Attributes$$SourceLocation.html "Attribute that contains the source location of for example a lambda passed to an operator, useful for example for debugging.")
[c](Attributes$$CancellationStrategy$.html "See companion object")[akka](../index.html).[stream](index.html).[Attributes](Attributes$.html)

# [CancellationStrategy](Attributes$$CancellationStrategy$.html "See companion object")[**](../../akka/stream/Attributes$$CancellationStrategy.html "Permalink")

### Companion [object CancellationStrategy](Attributes$$CancellationStrategy$.html "See companion object")

#### final  case class CancellationStrategy(strategy: [Strategy](Attributes$$CancellationStrategy$$Strategy.html)) extends [MandatoryAttribute](Attributes$$MandatoryAttribute.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Cancellation strategies provide a way to configure the behavior of a stage when `cancelStage` is called.

It is only relevant for stream components that have more than one output and do not define a custom cancellation
behavior by overriding `onDownstreamFinish`. In those cases, if the first output is cancelled, the default behavior
is to call `cancelStage` which shuts down the stage completely. The given strategy will allow customization of how
the shutdown procedure should be done precisely.

Source[Attributes.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/Attributes.scala#L410)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [MandatoryAttribute](Attributes$$MandatoryAttribute.html), [Attribute](Attributes$$Attribute.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CancellationStrategy
2. Serializable
3. Product
4. Equals
5. MandatoryAttribute
6. Attribute
7. AnyRef
8. Any
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

1. [**](../../akka/stream/Attributes$$CancellationStrategy.html#<init>(strategy:akka.stream.Attributes.CancellationStrategy.Strategy):akka.stream.Attributes.CancellationStrategy "Permalink")  new CancellationStrategy(strategy: [Strategy](Attributes$$CancellationStrategy$$Strategy.html))
### Value Members

1. [**](../../akka/stream/Attributes$$CancellationStrategy.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/Attributes$$CancellationStrategy.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/Attributes$$CancellationStrategy.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CancellationStrategy toany2stringadd\[CancellationStrategy] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/Attributes$$CancellationStrategy.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CancellationStrategy, B)ImplicitThis member is added by an implicit conversion from CancellationStrategy toArrowAssoc\[CancellationStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/Attributes$$CancellationStrategy.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/Attributes$$CancellationStrategy.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/Attributes$$CancellationStrategy.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/Attributes$$CancellationStrategy.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CancellationStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CancellationStrategyImplicitThis member is added by an implicit conversion from CancellationStrategy toEnsuring\[CancellationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/stream/Attributes$$CancellationStrategy.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CancellationStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CancellationStrategyImplicitThis member is added by an implicit conversion from CancellationStrategy toEnsuring\[CancellationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/Attributes$$CancellationStrategy.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CancellationStrategyImplicitThis member is added by an implicit conversion from CancellationStrategy toEnsuring\[CancellationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/Attributes$$CancellationStrategy.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CancellationStrategyImplicitThis member is added by an implicit conversion from CancellationStrategy toEnsuring\[CancellationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/Attributes$$CancellationStrategy.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/stream/Attributes$$CancellationStrategy.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/stream/Attributes$$CancellationStrategy.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../akka/stream/Attributes$$CancellationStrategy.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/stream/Attributes$$CancellationStrategy.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/stream/Attributes$$CancellationStrategy.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/stream/Attributes$$CancellationStrategy.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
19. [**](../../akka/stream/Attributes$$CancellationStrategy.html#strategy:akka.stream.Attributes.CancellationStrategy.Strategy "Permalink")  val strategy: [Strategy](Attributes$$CancellationStrategy$$Strategy.html)
20. [**](../../akka/stream/Attributes$$CancellationStrategy.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/stream/Attributes$$CancellationStrategy.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/stream/Attributes$$CancellationStrategy.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/stream/Attributes$$CancellationStrategy.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/Attributes$$CancellationStrategy.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/Attributes$$CancellationStrategy.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CancellationStrategy toStringFormat\[CancellationStrategy] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/Attributes$$CancellationStrategy.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CancellationStrategy, B)ImplicitThis member is added by an implicit conversion from CancellationStrategy toArrowAssoc\[CancellationStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [MandatoryAttribute](Attributes$$MandatoryAttribute.html)

### Inherited from [Attribute](Attributes$$Attribute.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCancellationStrategy to any2stringadd\[CancellationStrategy]

### Inherited by implicit conversion StringFormat fromCancellationStrategy to StringFormat\[CancellationStrategy]

### Inherited by implicit conversion Ensuring fromCancellationStrategy to Ensuring\[CancellationStrategy]

### Inherited by implicit conversion ArrowAssoc fromCancellationStrategy to ArrowAssoc\[CancellationStrategy]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$AsyncBoundary$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$Attribute.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$CancellationStrategy$$Strategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$CancellationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$CancellationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$InputBuffer.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$LogLevels$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$LogLevels.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$MandatoryAttribute.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$Name.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$SourceLocation$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$SourceLocation.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$CancellationStrategy.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$CancellationStrategy.html)*