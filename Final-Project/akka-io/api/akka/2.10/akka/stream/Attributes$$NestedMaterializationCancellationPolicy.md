---
description: Akka 2.10.17 - akka.stream.Attributes.NestedMaterializationCancellationPolicy
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:16:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html
title: Akka 2.10.17 - akka.stream.Attributes.NestedMaterializationCancellationPolicy
---

# Akka 2.10.17 - akka.stream.Attributes.NestedMaterializationCancellationPolicy

> **Summary:** Akka 2.10.17 - akka.stream.Attributes.NestedMaterializationCancellationPolicy

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
- NestedMaterializationCancellationPolicy
- [SourceLocation](Attributes$$SourceLocation.html "Attribute that contains the source location of for example a lambda passed to an operator, useful for example for debugging.")
[c](Attributes$$NestedMaterializationCancellationPolicy$.html "See companion object")[akka](../index.html).[stream](index.html).[Attributes](Attributes$.html)

# [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy$.html "See companion object")[**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html "Permalink")

### Companion [object NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy$.html "See companion object")

#### final  class NestedMaterializationCancellationPolicy extends [MandatoryAttribute](Attributes$$MandatoryAttribute.html)

Nested materialization cancellation strategy provides a way to configure the cancellation behavior of stages that materialize a nested flow.

When cancelled before materializing their nested flows, these stages can either immediately cancel (default behaviour) without materializing the nested flow
or wait for the nested flow to materialize and then propagate the cancellation signal through it.

This applies to [akka.stream.scaladsl.FlowOps.flatMapPrefix](scaladsl/FlowOps.html#flatMapPrefix[Out2,Mat2](n:Int)(f:Seq[Out]=>akka.stream.scaladsl.Flow[Out,Out2,Mat2]):FlowOps.this.Repr[Out2]), [akka.stream.scaladsl.Flow.futureFlow](scaladsl/Flow$.html#futureFlow[I,O,M](flow:scala.concurrent.Future[akka.stream.scaladsl.Flow[I,O,M]]):akka.stream.scaladsl.Flow[I,O,scala.concurrent.Future[M]]) (and derivations such as [akka.stream.scaladsl.Flow.lazyFutureFlow](scaladsl/Flow$.html#lazyFutureFlow[I,O,M](create:()=>scala.concurrent.Future[akka.stream.scaladsl.Flow[I,O,M]]):akka.stream.scaladsl.Flow[I,O,scala.concurrent.Future[M]])).
These operators either delay the nested flow's materialization or wait for a future to complete before doing so,
in this period of time they may receive a downstream cancellation signal. When this happens these operators will behave according to
this [Attribute](Attributes$$Attribute.html): when set to true they will 'stash' the signal and later deliver it to the materialized nested flow
, otherwise these stages will immediately cancel without materializing the nested flow.

Source[Attributes.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/Attributes.scala#L599)Linear Supertypes[MandatoryAttribute](Attributes$$MandatoryAttribute.html), [Attribute](Attributes$$Attribute.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NestedMaterializationCancellationPolicy
2. MandatoryAttribute
3. Attribute
4. AnyRef
5. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NestedMaterializationCancellationPolicy toany2stringadd\[NestedMaterializationCancellationPolicy] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NestedMaterializationCancellationPolicy, B)ImplicitThis member is added by an implicit conversion from NestedMaterializationCancellationPolicy toArrowAssoc\[NestedMaterializationCancellationPolicy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NestedMaterializationCancellationPolicy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NestedMaterializationCancellationPolicyImplicitThis member is added by an implicit conversion from NestedMaterializationCancellationPolicy toEnsuring\[NestedMaterializationCancellationPolicy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NestedMaterializationCancellationPolicy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NestedMaterializationCancellationPolicyImplicitThis member is added by an implicit conversion from NestedMaterializationCancellationPolicy toEnsuring\[NestedMaterializationCancellationPolicy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NestedMaterializationCancellationPolicyImplicitThis member is added by an implicit conversion from NestedMaterializationCancellationPolicy toEnsuring\[NestedMaterializationCancellationPolicy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NestedMaterializationCancellationPolicyImplicitThis member is added by an implicit conversion from NestedMaterializationCancellationPolicy toEnsuring\[NestedMaterializationCancellationPolicy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#propagateToNestedMaterialization:Boolean "Permalink")  val propagateToNestedMaterialization: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
21. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#toString():String "Permalink")  def toString(): StringDefinition ClassesNestedMaterializationCancellationPolicy → AnyRef → Any
23. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NestedMaterializationCancellationPolicy toStringFormat\[NestedMaterializationCancellationPolicy] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NestedMaterializationCancellationPolicy, B)ImplicitThis member is added by an implicit conversion from NestedMaterializationCancellationPolicy toArrowAssoc\[NestedMaterializationCancellationPolicy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [MandatoryAttribute](Attributes$$MandatoryAttribute.html)

### Inherited from [Attribute](Attributes$$Attribute.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromNestedMaterializationCancellationPolicy to any2stringadd\[NestedMaterializationCancellationPolicy]

### Inherited by implicit conversion StringFormat fromNestedMaterializationCancellationPolicy to StringFormat\[NestedMaterializationCancellationPolicy]

### Inherited by implicit conversion Ensuring fromNestedMaterializationCancellationPolicy to Ensuring\[NestedMaterializationCancellationPolicy]

### Inherited by implicit conversion ArrowAssoc fromNestedMaterializationCancellationPolicy to ArrowAssoc\[NestedMaterializationCancellationPolicy]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$AsyncBoundary$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$Attribute.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$CancellationStrategy$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$CancellationStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$InputBuffer.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$LogLevels$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$LogLevels.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$MandatoryAttribute.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$Name.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$SourceLocation$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$SourceLocation.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html](https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html)*