---
description: Akka 2.10.17 - akka.stream.ActorAttributes.MaxFixedBufferSize
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:33:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/ActorAttributes$$MaxFixedBufferSize.html
title: Akka 2.10.17 - akka.stream.ActorAttributes.MaxFixedBufferSize
---

# Akka 2.10.17 - akka.stream.ActorAttributes.MaxFixedBufferSize

> **Summary:** Akka 2.10.17 - akka.stream.ActorAttributes.MaxFixedBufferSize

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/ActorAttributes$.html "Permalink")  object [ActorAttributes](ActorAttributes$.html "Attributes for the Materializer.")Attributes for the [Materializer](Materializer.html).

Attributes for the [Materializer](Materializer.html).
Note that more attributes defined in [Attributes](Attributes.html).

Definition Classes[stream](index.html)
- [DebugLogging](ActorAttributes$$DebugLogging.html "Enables additional low level troubleshooting logging at DEBUG log level")
- [Dispatcher](ActorAttributes$$Dispatcher.html "Configures the dispatcher to be used by streams.")
- [FuzzingMode](ActorAttributes$$FuzzingMode.html "Test utility: fuzzing mode means that GraphStage events are not processed in FIFO order within a fused subgraph, but randomized.")
- MaxFixedBufferSize
- [OutputBurstLimit](ActorAttributes$$OutputBurstLimit.html "Maximum number of elements emitted in batch if downstream signals large demand.")
- [StreamSubscriptionTimeout](ActorAttributes$$StreamSubscriptionTimeout.html "Defines a timeout for stream subscription and what action to take when that hits.")
- [SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html)
- [SyncProcessingLimit](ActorAttributes$$SyncProcessingLimit.html "Limit for number of messages that can be processed synchronously in stream to substream communication.")
c[akka](../index.html).[stream](index.html).[ActorAttributes](ActorAttributes$.html)

# MaxFixedBufferSize[**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html "Permalink")

### 

#### final  case class MaxFixedBufferSize(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [MandatoryAttribute](Attributes$$MandatoryAttribute.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Configure the maximum buffer size for which a FixedSizeBuffer will be preallocated.
This defaults to a large value because it is usually better to fail early when
system memory is not sufficient to hold the buffer.

Use factory method [\#maxFixedBufferSize](ActorAttributes$.html#maxFixedBufferSize(size:Int):akka.stream.Attributes) to create.

Source[Attributes.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/Attributes.scala#L927)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [MandatoryAttribute](Attributes$$MandatoryAttribute.html), [Attribute](Attributes$$Attribute.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MaxFixedBufferSize
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

1. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#<init>(size:Int):akka.stream.ActorAttributes.MaxFixedBufferSize "Permalink")  new MaxFixedBufferSize(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
### Value Members

1. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MaxFixedBufferSize toany2stringadd\[MaxFixedBufferSize] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MaxFixedBufferSize, B)ImplicitThis member is added by an implicit conversion from MaxFixedBufferSize toArrowAssoc\[MaxFixedBufferSize] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MaxFixedBufferSize) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MaxFixedBufferSizeImplicitThis member is added by an implicit conversion from MaxFixedBufferSize toEnsuring\[MaxFixedBufferSize] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MaxFixedBufferSize) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MaxFixedBufferSizeImplicitThis member is added by an implicit conversion from MaxFixedBufferSize toEnsuring\[MaxFixedBufferSize] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MaxFixedBufferSizeImplicitThis member is added by an implicit conversion from MaxFixedBufferSize toEnsuring\[MaxFixedBufferSize] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MaxFixedBufferSizeImplicitThis member is added by an implicit conversion from MaxFixedBufferSize toEnsuring\[MaxFixedBufferSize] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
19. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#size:Int "Permalink")  val size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
20. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MaxFixedBufferSize toStringFormat\[MaxFixedBufferSize] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/ActorAttributes$$MaxFixedBufferSize.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MaxFixedBufferSize, B)ImplicitThis member is added by an implicit conversion from MaxFixedBufferSize toArrowAssoc\[MaxFixedBufferSize] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [MandatoryAttribute](Attributes$$MandatoryAttribute.html)

### Inherited from [Attribute](Attributes$$Attribute.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMaxFixedBufferSize to any2stringadd\[MaxFixedBufferSize]

### Inherited by implicit conversion StringFormat fromMaxFixedBufferSize to StringFormat\[MaxFixedBufferSize]

### Inherited by implicit conversion Ensuring fromMaxFixedBufferSize to Ensuring\[MaxFixedBufferSize]

### Inherited by implicit conversion ArrowAssoc fromMaxFixedBufferSize to ArrowAssoc\[MaxFixedBufferSize]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$DebugLogging.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$Dispatcher.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$FuzzingMode.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$MaxFixedBufferSize.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$OutputBurstLimit.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$SupervisionStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$SyncProcessingLimit.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$Attribute.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$MandatoryAttribute.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$MaxFixedBufferSize.html](https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$MaxFixedBufferSize.html)*