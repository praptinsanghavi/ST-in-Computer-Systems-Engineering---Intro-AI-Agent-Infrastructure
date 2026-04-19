---
description: Akka 2.10.17 - akka.stream.ActorAttributes.StreamSubscriptionTimeout
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:56:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html
title: Akka 2.10.17 - akka.stream.ActorAttributes.StreamSubscriptionTimeout
---

# Akka 2.10.17 - akka.stream.ActorAttributes.StreamSubscriptionTimeout

> **Summary:** Akka 2.10.17 - akka.stream.ActorAttributes.StreamSubscriptionTimeout

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
- [MaxFixedBufferSize](ActorAttributes$$MaxFixedBufferSize.html "Configure the maximum buffer size for which a FixedSizeBuffer will be preallocated.")
- [OutputBurstLimit](ActorAttributes$$OutputBurstLimit.html "Maximum number of elements emitted in batch if downstream signals large demand.")
- StreamSubscriptionTimeout
- [SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html)
- [SyncProcessingLimit](ActorAttributes$$SyncProcessingLimit.html "Limit for number of messages that can be processed synchronously in stream to substream communication.")
c[akka](../index.html).[stream](index.html).[ActorAttributes](ActorAttributes$.html)

# StreamSubscriptionTimeout[**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html "Permalink")

### 

#### final  case class StreamSubscriptionTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), mode: [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html)) extends [MandatoryAttribute](Attributes$$MandatoryAttribute.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Defines a timeout for stream subscription and what action to take when that hits.

Use factory method `streamSubscriptionTimeout` to create.

Source[Attributes.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/Attributes.scala#L877)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [MandatoryAttribute](Attributes$$MandatoryAttribute.html), [Attribute](Attributes$$Attribute.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StreamSubscriptionTimeout
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

1. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#<init>(timeout:scala.concurrent.duration.FiniteDuration,mode:akka.stream.StreamSubscriptionTimeoutTerminationMode):akka.stream.ActorAttributes.StreamSubscriptionTimeout "Permalink")  new StreamSubscriptionTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), mode: [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html))
### Value Members

1. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StreamSubscriptionTimeout toany2stringadd\[StreamSubscriptionTimeout] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StreamSubscriptionTimeout, B)ImplicitThis member is added by an implicit conversion from StreamSubscriptionTimeout toArrowAssoc\[StreamSubscriptionTimeout] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StreamSubscriptionTimeout) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StreamSubscriptionTimeoutImplicitThis member is added by an implicit conversion from StreamSubscriptionTimeout toEnsuring\[StreamSubscriptionTimeout] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StreamSubscriptionTimeout) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StreamSubscriptionTimeoutImplicitThis member is added by an implicit conversion from StreamSubscriptionTimeout toEnsuring\[StreamSubscriptionTimeout] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StreamSubscriptionTimeoutImplicitThis member is added by an implicit conversion from StreamSubscriptionTimeout toEnsuring\[StreamSubscriptionTimeout] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StreamSubscriptionTimeoutImplicitThis member is added by an implicit conversion from StreamSubscriptionTimeout toEnsuring\[StreamSubscriptionTimeout] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#mode:akka.stream.StreamSubscriptionTimeoutTerminationMode "Permalink")  val mode: [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html)
16. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#timeout:scala.concurrent.duration.FiniteDuration "Permalink")  val timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
22. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StreamSubscriptionTimeout toStringFormat\[StreamSubscriptionTimeout] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StreamSubscriptionTimeout, B)ImplicitThis member is added by an implicit conversion from StreamSubscriptionTimeout toArrowAssoc\[StreamSubscriptionTimeout] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [MandatoryAttribute](Attributes$$MandatoryAttribute.html)

### Inherited from [Attribute](Attributes$$Attribute.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStreamSubscriptionTimeout to any2stringadd\[StreamSubscriptionTimeout]

### Inherited by implicit conversion StringFormat fromStreamSubscriptionTimeout to StringFormat\[StreamSubscriptionTimeout]

### Inherited by implicit conversion Ensuring fromStreamSubscriptionTimeout to Ensuring\[StreamSubscriptionTimeout]

### Inherited by implicit conversion ArrowAssoc fromStreamSubscriptionTimeout to ArrowAssoc\[StreamSubscriptionTimeout]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$DebugLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$Dispatcher.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$FuzzingMode.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$MaxFixedBufferSize.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$OutputBurstLimit.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$SupervisionStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$SyncProcessingLimit.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$Attribute.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$$MandatoryAttribute.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/StreamSubscriptionTimeoutTerminationMode.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$StreamSubscriptionTimeout.html)*