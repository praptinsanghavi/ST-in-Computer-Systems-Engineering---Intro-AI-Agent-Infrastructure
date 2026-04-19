---
description: Akka 2.10.17 - akka.stream.stage.GraphStageLogic.SubSourceOutlet
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:56:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/stage/GraphStageLogic$SubSourceOutlet.html
title: Akka 2.10.17 - akka.stream.stage.GraphStageLogic.SubSourceOutlet
---

# Akka 2.10.17 - akka.stream.stage.GraphStageLogic.SubSourceOutlet

> **Summary:** Akka 2.10.17 - akka.stream.stage.GraphStageLogic.SubSourceOutlet

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/stage/index.html "Permalink")  package [stage](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/stage/GraphStageLogic.html "Permalink") abstract  class [GraphStageLogic](GraphStageLogic.html "Represents the processing logic behind a GraphStage.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents the processing logic behind a [GraphStage](GraphStage.html).

Represents the processing logic behind a [GraphStage](GraphStage.html). Roughly speaking, a subclass of [GraphStageLogic](GraphStageLogic.html) is a
collection of the following parts:
 \* A set of [InHandler](InHandler.html) and [OutHandler](OutHandler.html) instances and their assignments to the [Inlet](../Inlet.html)s and [Outlet](../Outlet.html)s
 of the enclosing [GraphStage](GraphStage.html)
 \* Possible mutable state, accessible from the [InHandler](InHandler.html) and [OutHandler](OutHandler.html) callbacks, but not from anywhere
 else (as such access would not be thread\-safe)
 \* The lifecycle hooks [preStart](GraphStageLogic.html#preStart():Unit) and [postStop](GraphStageLogic.html#postStop():Unit)
 \* Methods for performing stream processing actions, like pulling or pushing elements

The operator logic is completed once all its input and output ports have been closed. This can be changed by
setting `setKeepGoing` to true.

The `postStop` lifecycle hook on the logic itself is called once all ports are closed. This is the only tear down
callback that is guaranteed to happen, if the actor system or the materializer is terminated the handlers may never
see any callbacks to `onUpstreamFailure`, `onUpstreamFinish` or `onDownstreamFinish`. Therefore operator resource
cleanup should always be done in `postStop`.

Definition Classes[stage](index.html)
- [SubSinkInlet](GraphStageLogic$SubSinkInlet.html "INTERNAL API")
- SubSourceOutlet
c[akka](../../index.html).[stream](../index.html).[stage](index.html).[GraphStageLogic](GraphStageLogic.html)

# SubSourceOutlet[**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html "Permalink")

### 

#### class SubSourceOutlet\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

INTERNAL API

This allows the dynamic creation of an Outlet for a GraphStage which is
connected to a Source that is available for materialization (e.g. using
the `subFusingMaterializer`). Completion, cancellation and failure of the
parent operator is automatically delegated to instances of `SubSourceOutlet`
to avoid resource leaks.

Even so it is good practice to use the `timeout` method to cancel this
Outlet in case the corresponding Source is not materialized within a
given time limit, see e.g. ActorMaterializerSettings.

To be thread safe this method must only be called from either the constructor of the graph operator during
materialization or one of the methods invoked by the graph operator machinery, such as `onPush` and `onPull`.

Source[GraphStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/stage/GraphStage.scala#L1502)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SubSourceOutlet
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

1. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#<init>(name:String):GraphStageLogic.this.SubSourceOutlet[T] "Permalink")  new SubSourceOutlet(name: String)
### Value Members

1. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SubSourceOutlet\[T] toany2stringadd\[SubSourceOutlet\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SubSourceOutlet\[T], B)ImplicitThis member is added by an implicit conversion from SubSourceOutlet\[T] toArrowAssoc\[SubSourceOutlet\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#complete():Unit "Permalink")  def complete(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Complete this output port.
9. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SubSourceOutlet\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SubSourceOutlet\[T]ImplicitThis member is added by an implicit conversion from SubSourceOutlet\[T] toEnsuring\[SubSourceOutlet\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SubSourceOutlet\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SubSourceOutlet\[T]ImplicitThis member is added by an implicit conversion from SubSourceOutlet\[T] toEnsuring\[SubSourceOutlet\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SubSourceOutlet\[T]ImplicitThis member is added by an implicit conversion from SubSourceOutlet\[T] toEnsuring\[SubSourceOutlet\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SubSourceOutlet\[T]ImplicitThis member is added by an implicit conversion from SubSourceOutlet\[T] toEnsuring\[SubSourceOutlet\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#fail(ex:Throwable):Unit "Permalink")  def fail(ex: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail this output port.
16. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#isAvailable:Boolean "Permalink")  def isAvailable: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns `true` if this output port can be pushed.
19. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#isClosed:Boolean "Permalink")  def isClosed: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns `true` if this output port is closed, but caution
THIS WORKS DIFFERENTLY THAN THE NORMAL isClosed(out).

Returns `true` if this output port is closed, but caution
THIS WORKS DIFFERENTLY THAN THE NORMAL isClosed(out).
Due to possibly asynchronous shutdown it may not return
`true` immediately after `complete()` or `fail()` have returned.
20. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#push(elem:T):Unit "Permalink")  def push(elem: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Push to this output port.
25. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#setHandler(handler:akka.stream.stage.OutHandler):Unit "Permalink")  def setHandler(handler: [OutHandler](OutHandler.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set OutHandler for this dynamic output port; this needs to be done before
the first substream callback can arrive.
26. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#source:akka.stream.Graph[akka.stream.SourceShape[T],akka.NotUsed] "Permalink")  def source: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], [NotUsed](../../NotUsed.html)]Get the Source for this dynamic output port.
27. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#timeout(d:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def timeout(d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set the source into timed\-out mode if it has not yet been materialized.
29. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesSubSourceOutlet → AnyRef → Any
30. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SubSourceOutlet\[T] toStringFormat\[SubSourceOutlet\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SubSourceOutlet\[T], B)ImplicitThis member is added by an implicit conversion from SubSourceOutlet\[T] toArrowAssoc\[SubSourceOutlet\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSubSourceOutlet\[T] to any2stringadd\[SubSourceOutlet\[T]]

### Inherited by implicit conversion StringFormat fromSubSourceOutlet\[T] to StringFormat\[SubSourceOutlet\[T]]

### Inherited by implicit conversion Ensuring fromSubSourceOutlet\[T] to Ensuring\[SubSourceOutlet\[T]]

### Inherited by implicit conversion ArrowAssoc fromSubSourceOutlet\[T] to ArrowAssoc\[SubSourceOutlet\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph.html
- https://doc.akka.io/api/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/api/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/api/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$SubSinkInlet.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$SubSourceOutlet.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/InHandler.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/OutHandler.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$SubSourceOutlet.html](https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$SubSourceOutlet.html)*