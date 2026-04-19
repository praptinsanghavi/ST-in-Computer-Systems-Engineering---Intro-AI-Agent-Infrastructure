---
description: Akka 2.10.17 - akka.stream.javadsl.GraphDSL.Builder.ForwardOps
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html
title: Akka 2.10.17 - akka.stream.javadsl.GraphDSL.Builder.ForwardOps
---

# Akka 2.10.17 - akka.stream.javadsl.GraphDSL.Builder.ForwardOps

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.GraphDSL.Builder.ForwardOps

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/javadsl/GraphDSL$.html "Permalink")  object [GraphDSL](GraphDSL$.html) extends GraphCreateDefinition Classes[javadsl](index.html)
- [**](../../../akka/stream/javadsl/GraphDSL$$Builder.html "Permalink") final  class [Builder](GraphDSL$$Builder.html)\[\+Mat] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[GraphDSL](GraphDSL$.html)
- ForwardOps
- [ReverseOps](GraphDSL$$Builder$ReverseOps.html)
c[akka](../../index.html).[stream](../index.html).[javadsl](index.html).[GraphDSL](GraphDSL$.html).[Builder](GraphDSL$$Builder.html)

# ForwardOps[**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html "Permalink")

### 

#### final  class ForwardOps\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[Graph.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/Graph.scala#L676)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ForwardOps
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

1. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#<init>(_out:akka.stream.Outlet[T]):Builder.this.ForwardOps[T] "Permalink")  new ForwardOps(\_out: [Outlet](../Outlet.html)\[T])
### Value Members

1. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ForwardOps\[T] toany2stringadd\[ForwardOps\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ForwardOps\[T], B)ImplicitThis member is added by an implicit conversion from ForwardOps\[T] toArrowAssoc\[ForwardOps\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ForwardOps\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ForwardOps\[T]ImplicitThis member is added by an implicit conversion from ForwardOps\[T] toEnsuring\[ForwardOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ForwardOps\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ForwardOps\[T]ImplicitThis member is added by an implicit conversion from ForwardOps\[T] toEnsuring\[ForwardOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ForwardOps\[T]ImplicitThis member is added by an implicit conversion from ForwardOps\[T] toEnsuring\[ForwardOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ForwardOps\[T]ImplicitThis member is added by an implicit conversion from ForwardOps\[T] toEnsuring\[ForwardOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#out():akka.stream.Outlet[T] "Permalink")  def out(): [Outlet](../Outlet.html)\[T]
21. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#to(dst:akka.stream.SinkShape[_>:T]):akka.stream.javadsl.GraphDSL.Builder[Mat] "Permalink")  def to(dst: [SinkShape](../SinkShape.html)\[\_ \>: T]): [Builder](GraphDSL$$Builder.html)\[Mat]
23. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#toFanIn[U](j:akka.stream.UniformFanInShape[_>:T,U]):akka.stream.javadsl.GraphDSL.Builder[Mat] "Permalink")  def toFanIn\[U](j: [UniformFanInShape](../UniformFanInShape.html)\[\_ \>: T, U]): [Builder](GraphDSL$$Builder.html)\[Mat]
24. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#toFanOut[U](j:akka.stream.UniformFanOutShape[_>:T,U]):akka.stream.javadsl.GraphDSL.Builder[Mat] "Permalink")  def toFanOut\[U](j: [UniformFanOutShape](../UniformFanOutShape.html)\[\_ \>: T, U]): [Builder](GraphDSL$$Builder.html)\[Mat]
25. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#toInlet(in:akka.stream.Inlet[_>:T]):akka.stream.javadsl.GraphDSL.Builder[Mat] "Permalink")  def toInlet(in: [Inlet](../Inlet.html)\[\_ \>: T]): [Builder](GraphDSL$$Builder.html)\[Mat]
26. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#via[U](f:akka.stream.FlowShape[_>:T,U]):Builder.this.ForwardOps[U] "Permalink")  def via\[U](f: [FlowShape](../FlowShape.html)\[\_ \>: T, U]): ForwardOps\[U]
28. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#viaFanIn[U](j:akka.stream.UniformFanInShape[_>:T,U]):Builder.this.ForwardOps[U] "Permalink")  def viaFanIn\[U](j: [UniformFanInShape](../UniformFanInShape.html)\[\_ \>: T, U]): ForwardOps\[U]
29. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#viaFanOut[U](j:akka.stream.UniformFanOutShape[_>:T,U]):Builder.this.ForwardOps[U] "Permalink")  def viaFanOut\[U](j: [UniformFanOutShape](../UniformFanOutShape.html)\[\_ \>: T, U]): ForwardOps\[U]
30. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ForwardOps\[T] toStringFormat\[ForwardOps\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ForwardOps\[T], B)ImplicitThis member is added by an implicit conversion from ForwardOps\[T] toArrowAssoc\[ForwardOps\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromForwardOps\[T] to any2stringadd\[ForwardOps\[T]]

### Inherited by implicit conversion StringFormat fromForwardOps\[T] to StringFormat\[ForwardOps\[T]]

### Inherited by implicit conversion Ensuring fromForwardOps\[T] to Ensuring\[ForwardOps\[T]]

### Inherited by implicit conversion ArrowAssoc fromForwardOps\[T] to ArrowAssoc\[ForwardOps\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/api/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/api/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/api/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/api/akka/current/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$$Builder$ReverseOps.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$$Builder.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html](https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$$Builder$ForwardOps.html)*