---
description: Akka 2.10.17 - akka.stream.javadsl.GraphDSL.Builder
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:34:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/GraphDSL$$Builder.html
title: Akka 2.10.17 - akka.stream.javadsl.GraphDSL.Builder
---

# Akka 2.10.17 - akka.stream.javadsl.GraphDSL.Builder

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.GraphDSL.Builder

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/javadsl/GraphDSL$.html "Permalink")  object [GraphDSL](GraphDSL$.html) extends GraphCreateDefinition Classes[javadsl](index.html)
- Builder
c[akka](../../index.html).[stream](../index.html).[javadsl](index.html).[GraphDSL](GraphDSL$.html)

# Builder[**](../../../akka/stream/javadsl/GraphDSL$$Builder.html "Permalink")

### 

#### final  class Builder\[\+Mat] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Self TypeBuilder\[Mat]Source[Graph.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/Graph.scala#L638)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Builder
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

1. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#<init>()(implicitdelegate:akka.stream.scaladsl.GraphDSL.Builder[Mat]):akka.stream.javadsl.GraphDSL.Builder[Mat] "Permalink")  new Builder()(implicit delegate: [scaladsl.GraphDSL.Builder](../scaladsl/GraphDSL$$Builder.html)\[Mat])
### Type Members

1. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html "Permalink") final  class [ForwardOps](GraphDSL$$Builder$ForwardOps.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ReverseOps.html "Permalink") final  class [ReverseOps](GraphDSL$$Builder$ReverseOps.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Builder\[Mat] toany2stringadd\[Builder\[Mat]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Builder\[Mat], B)ImplicitThis member is added by an implicit conversion from Builder\[Mat] toArrowAssoc\[Builder\[Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#add[S<:akka.stream.Shape](graph:akka.stream.Graph[S,_]):S "Permalink")  def add\[S \<: [Shape](../Shape.html)](graph: [Graph](../Graph.html)\[S, \_]): SImport a graph into this module, performing a deep copy, discarding its
materialized value and returning the copied Ports that are now to be
connected.
7. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Builder\[Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Builder\[Mat]ImplicitThis member is added by an implicit conversion from Builder\[Mat] toEnsuring\[Builder\[Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Builder\[Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Builder\[Mat]ImplicitThis member is added by an implicit conversion from Builder\[Mat] toEnsuring\[Builder\[Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Builder\[Mat]ImplicitThis member is added by an implicit conversion from Builder\[Mat] toEnsuring\[Builder\[Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Builder\[Mat]ImplicitThis member is added by an implicit conversion from Builder\[Mat] toEnsuring\[Builder\[Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#from[I,O](j:akka.stream.UniformFanOutShape[I,O]):Builder.this.ForwardOps[O] "Permalink")  def from\[I, O](j: [UniformFanOutShape](../UniformFanOutShape.html)\[I, O]): [ForwardOps](GraphDSL$$Builder$ForwardOps.html)\[O]
16. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#from[I,O](j:akka.stream.UniformFanInShape[I,O]):Builder.this.ForwardOps[O] "Permalink")  def from\[I, O](j: [UniformFanInShape](../UniformFanInShape.html)\[I, O]): [ForwardOps](GraphDSL$$Builder$ForwardOps.html)\[O]
17. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#from[I,O](f:akka.stream.FlowShape[I,O]):Builder.this.ForwardOps[O] "Permalink")  def from\[I, O](f: [FlowShape](../FlowShape.html)\[I, O]): [ForwardOps](GraphDSL$$Builder$ForwardOps.html)\[O]
18. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#from[T](src:akka.stream.SourceShape[T]):Builder.this.ForwardOps[T] "Permalink")  def from\[T](src: [SourceShape](../SourceShape.html)\[T]): [ForwardOps](GraphDSL$$Builder$ForwardOps.html)\[T]
19. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#from[T](out:akka.stream.Outlet[T]):Builder.this.ForwardOps[T] "Permalink")  def from\[T](out: [Outlet](../Outlet.html)\[T]): [ForwardOps](GraphDSL$$Builder$ForwardOps.html)\[T]
20. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#materializedValue:akka.stream.Outlet[Mat@scala.annotation.unchecked.uncheckedVariance] "Permalink")  def materializedValue: [Outlet](../Outlet.html)\[Mat]Returns an [Outlet](../Outlet.html) that gives access to the materialized value of this graph.

Returns an [Outlet](../Outlet.html) that gives access to the materialized value of this graph. Once the graph is materialized
this outlet will emit exactly one element which is the materialized value. It is possible to expose this
outlet as an externally accessible outlet of a [Source](Source.html), [Sink](Sink.html), [Flow](Flow.html) or [BidiFlow](BidiFlow.html).

It is possible to call this method multiple times to get multiple [Outlet](../Outlet.html) instances if necessary. All of
the outlets will emit the materialized value.

Be careful to not to feed the result of this outlet to a operator that produces the materialized value itself (for
example to a [Sink\#fold](Sink$.html#fold[U,In](zero:U,f:akka.japi.function.Function2[U,In,U]):akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[U]]) that contributes to the materialized value) since that might lead to an unresolvable
dependency cycle.

returnsThe outlet that will emit the materialized value.
24. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#to[I,O](j:akka.stream.UniformFanOutShape[I,O]):Builder.this.ReverseOps[I] "Permalink")  def to\[I, O](j: [UniformFanOutShape](../UniformFanOutShape.html)\[I, O]): [ReverseOps](GraphDSL$$Builder$ReverseOps.html)\[I]
29. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#to[I,O](j:akka.stream.UniformFanInShape[I,O]):Builder.this.ReverseOps[I] "Permalink")  def to\[I, O](j: [UniformFanInShape](../UniformFanInShape.html)\[I, O]): [ReverseOps](GraphDSL$$Builder$ReverseOps.html)\[I]
30. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#to[I,O](f:akka.stream.FlowShape[I,O]):Builder.this.ReverseOps[I] "Permalink")  def to\[I, O](f: [FlowShape](../FlowShape.html)\[I, O]): [ReverseOps](GraphDSL$$Builder$ReverseOps.html)\[I]
31. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#to[T](dst:akka.stream.SinkShape[T]):Builder.this.ReverseOps[T] "Permalink")  def to\[T](dst: [SinkShape](../SinkShape.html)\[T]): [ReverseOps](GraphDSL$$Builder$ReverseOps.html)\[T]
32. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#to[T](in:akka.stream.Inlet[T]):Builder.this.ReverseOps[T] "Permalink")  def to\[T](in: [Inlet](../Inlet.html)\[T]): [ReverseOps](GraphDSL$$Builder$ReverseOps.html)\[T]
33. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
34. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Builder\[Mat] toStringFormat\[Builder\[Mat]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Builder\[Mat], B)ImplicitThis member is added by an implicit conversion from Builder\[Mat] toArrowAssoc\[Builder\[Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBuilder\[Mat] to any2stringadd\[Builder\[Mat]]

### Inherited by implicit conversion StringFormat fromBuilder\[Mat] to StringFormat\[Builder\[Mat]]

### Inherited by implicit conversion Ensuring fromBuilder\[Mat] to Ensuring\[Builder\[Mat]]

### Inherited by implicit conversion ArrowAssoc fromBuilder\[Mat] to ArrowAssoc\[Builder\[Mat]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph.html
- https://doc.akka.io/api/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/api/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/api/akka/current/akka/stream/Shape.html
- https://doc.akka.io/api/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/api/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/api/akka/current/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$$Builder$ReverseOps.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$$Builder.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Sink$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Sink.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Builder.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$$Builder.html](https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$$Builder.html)*