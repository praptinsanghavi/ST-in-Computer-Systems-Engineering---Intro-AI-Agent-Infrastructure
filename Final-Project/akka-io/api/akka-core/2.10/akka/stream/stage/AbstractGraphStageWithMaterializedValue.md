---
description: Akka 2.10.17 - akka.stream.stage.AbstractGraphStageWithMaterializedValue
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:08:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/stage/AbstractGraphStageWithMaterializedValue.html
title: Akka 2.10.17 - akka.stream.stage.AbstractGraphStageWithMaterializedValue
---

# Akka 2.10.17 - akka.stream.stage.AbstractGraphStageWithMaterializedValue

> **Summary:** Akka 2.10.17 - akka.stream.stage.AbstractGraphStageWithMaterializedValue

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/stage/index.html "Permalink")  package [stage](index.html)Definition Classes[stream](../index.html)
- AbstractGraphStageWithMaterializedValue
- [AbstractInHandler](AbstractInHandler.html "Java API: callbacks for an input port where termination logic is predefined (completing when upstream completes, failing when upstream fails).")
- [AbstractInOutHandler](AbstractInOutHandler.html "Java API: callback combination for output and input ports where termination logic is predefined (completing when upstream completes, failing when upstream fails, completing when downstream cancels).")
- [AbstractOutHandler](AbstractOutHandler.html "Java API: callbacks for an output port where termination logic is predefined (completing when downstream cancels).")
- [AsyncCallback](AsyncCallback.html "An asynchronous callback holder that is attached to a GraphStageLogic.")
- [GraphStage](GraphStage.html "A GraphStage represents a reusable graph stream processing operator.")
- [GraphStageLogic](GraphStageLogic.html "Represents the processing logic behind a GraphStage.")
- [GraphStageLogicWithLogging](GraphStageLogicWithLogging.html "Java API: GraphStageLogic with StageLogging.")
- [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html "Scala API: A GraphStage represents a reusable graph stream processing operator.")
- [InHandler](InHandler.html "Collection of callbacks for an input port of a GraphStage")
- [OutHandler](OutHandler.html "Collection of callbacks for an output port of a GraphStage")
- [StageLogging](StageLogging.html "Simple way to obtain a akka.event.LoggingAdapter when used together with an akka.stream.Materializer.")
- [TimerGraphStageLogic](TimerGraphStageLogic.html "Provides timer related facilities to a GraphStageLogic.")
- [TimerGraphStageLogicWithLogging](TimerGraphStageLogicWithLogging.html "Java API: TimerGraphStageLogic with StageLogging.")
c[akka](../../index.html).[stream](../index.html).[stage](index.html)

# AbstractGraphStageWithMaterializedValue[**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html "Permalink")

### 

#### abstract  class AbstractGraphStageWithMaterializedValue\[\+S \<: [Shape](../Shape.html), M] extends [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html)\[S, M]

Java API: A GraphStage represents a reusable graph stream processing operator.

Extend this `AbstractGraphStageWithMaterializedValue` if you want to provide a materialized value,
represented by the type parameter `M`. If your GraphStage does not need to provide a materialized
value you can instead extend [GraphStage](GraphStage.html) which materializes a [NotUsed](../../NotUsed.html) value.

A GraphStage consists of a [Shape](#Shape=S@scala.annotation.unchecked.uncheckedVariance) which describes its input and output ports and a factory function that
creates a [GraphStageLogic](GraphStageLogic.html) which implements the processing logic that ties the ports together.

See also [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html) for Scala DSL for this operator.

Source[GraphStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/stage/GraphStage.scala#L92)Linear Supertypes[GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html)\[S, M], [Graph](../Graph.html)\[S, M], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AbstractGraphStageWithMaterializedValue
2. GraphStageWithMaterializedValue
3. Graph
4. AnyRef
5. Any
Implicitly  
1. by GraphMapMatVal
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#<init>():akka.stream.stage.AbstractGraphStageWithMaterializedValue[S,M] "Permalink")  new AbstractGraphStageWithMaterializedValue()
### Type Members

1. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#Shape=S@scala.annotation.unchecked.uncheckedVariance "Permalink")  type Shape \= SType\-level accessor for the shape parameter of this graph.

Type\-level accessor for the shape parameter of this graph.

Definition Classes[Graph](../Graph.html)
### Abstract Value Members

1. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#createLogicAndMaterializedValuePair(inheritedAttributes:akka.stream.Attributes):akka.japi.Pair[akka.stream.stage.GraphStageLogic,M] "Permalink") abstract  def createLogicAndMaterializedValuePair(inheritedAttributes: [Attributes](../Attributes.html)): [Pair](../../japi/Pair.html)\[[GraphStageLogic](GraphStageLogic.html), M]Annotations@throws(classOf\[Exception])
2. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#shape:S "Permalink") abstract  def shape: SThe shape of a graph is all that is externally visible: its inlets and outlets.

The shape of a graph is all that is externally visible: its inlets and outlets.

Definition Classes[Graph](../Graph.html)
### Concrete Value Members

1. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AbstractGraphStageWithMaterializedValue\[S, M] toany2stringadd\[AbstractGraphStageWithMaterializedValue\[S, M]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AbstractGraphStageWithMaterializedValue\[S, M], B)ImplicitThis member is added by an implicit conversion from AbstractGraphStageWithMaterializedValue\[S, M] toArrowAssoc\[AbstractGraphStageWithMaterializedValue\[S, M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#addAttributes(attr:akka.stream.Attributes):akka.stream.Graph[S,M] "Permalink")  def addAttributes(attr: [Attributes](../Attributes.html)): [Graph](../Graph.html)\[S, M]Add the given attributes to this [Graph](../Graph.html).

Add the given attributes to this [Graph](../Graph.html). If the specific attribute was already present
on this graph this means the added attribute will be more specific than the existing one.
If this Source is a composite of multiple graphs, new attributes on the composite will be
less specific than attributes set directly on the individual graphs of the composite.

Definition Classes[Graph](../Graph.html)
7. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String, inputBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Graph](../Graph.html)\[S, M]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

inputBufferSizeSet the input buffer to this size for the graph

Definition Classes[Graph](../Graph.html)
9. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#async(dispatcher:String):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String): [Graph](../Graph.html)\[S, M]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

Definition Classes[Graph](../Graph.html)
10. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#async:akka.stream.Graph[S,M] "Permalink")  def async: [Graph](../Graph.html)\[S, M]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

Definition Classes[Graph](../Graph.html)
11. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#createLogicAndMaterializedValue(inheritedAttributes:akka.stream.Attributes):(akka.stream.stage.GraphStageLogic,M) "Permalink") final  def createLogicAndMaterializedValue(inheritedAttributes: [Attributes](../Attributes.html)): ([GraphStageLogic](GraphStageLogic.html), M)Definition ClassesAbstractGraphStageWithMaterializedValue → [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html)Annotations@throws(classOf\[Exception])
13. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AbstractGraphStageWithMaterializedValue\[S, M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractGraphStageWithMaterializedValue\[S, M]ImplicitThis member is added by an implicit conversion from AbstractGraphStageWithMaterializedValue\[S, M] toEnsuring\[AbstractGraphStageWithMaterializedValue\[S, M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AbstractGraphStageWithMaterializedValue\[S, M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractGraphStageWithMaterializedValue\[S, M]ImplicitThis member is added by an implicit conversion from AbstractGraphStageWithMaterializedValue\[S, M] toEnsuring\[AbstractGraphStageWithMaterializedValue\[S, M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractGraphStageWithMaterializedValue\[S, M]ImplicitThis member is added by an implicit conversion from AbstractGraphStageWithMaterializedValue\[S, M] toEnsuring\[AbstractGraphStageWithMaterializedValue\[S, M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractGraphStageWithMaterializedValue\[S, M]ImplicitThis member is added by an implicit conversion from AbstractGraphStageWithMaterializedValue\[S, M] toEnsuring\[AbstractGraphStageWithMaterializedValue\[S, M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: [Attributes](../Attributes.html)Definition Classes[Graph](../Graph.html)
20. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#initialAttributes:akka.stream.Attributes "Permalink")  def initialAttributes: [Attributes](../Attributes.html)Attributesprotected Definition Classes[GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html)
23. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#mapMaterializedValue[M2](f:M=>M2):akka.stream.Graph[S,M2] "Permalink")  def mapMaterializedValue\[M2](f: (M) \=\> M2): [Graph](../Graph.html)\[S, M2]Transform the materialized value of this Graph, leaving all other properties as they were.

Transform the materialized value of this Graph, leaving all other properties as they were.

ffunction to map the graph's materialized value

ImplicitThis member is added by an implicit conversion from AbstractGraphStageWithMaterializedValue\[S, M] to[GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[S, M] performed by method GraphMapMatVal in [akka.stream.Graph](../Graph$.html).This conversion will take place only if S is a subclass of stream.Shape (S \<: [stream.Shape](../Shape.html)).Definition Classes[GraphMapMatVal](../Graph$$GraphMapMatVal.html)
25. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#named(name:String):akka.stream.Graph[S,M] "Permalink")  def named(name: String): [Graph](../Graph.html)\[S, M]Specifies the name of the Graph.

Specifies the name of the Graph.
If the name is null or empty the name is ignored, i.e. \#none is returned.

Definition Classes[Graph](../Graph.html)
26. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#withAttributes(attr:akka.stream.Attributes):akka.stream.Graph[S,M] "Permalink") final  def withAttributes(attr: [Attributes](../Attributes.html)): [Graph](../Graph.html)\[S, M]Replace the attributes of this Flow with the given ones.

Replace the attributes of this Flow with the given ones. If this Flow is a composite
of multiple graphs, new attributes on the composite will be less specific than attributes
set directly on the individual graphs of the composite.

Definition Classes[GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html) → [Graph](../Graph.html)
### Deprecated Value Members

1. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AbstractGraphStageWithMaterializedValue\[S, M] toStringFormat\[AbstractGraphStageWithMaterializedValue\[S, M]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/stage/AbstractGraphStageWithMaterializedValue.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AbstractGraphStageWithMaterializedValue\[S, M], B)ImplicitThis member is added by an implicit conversion from AbstractGraphStageWithMaterializedValue\[S, M] toArrowAssoc\[AbstractGraphStageWithMaterializedValue\[S, M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html)\[S, M]

### Inherited from [Graph](../Graph.html)\[S, M]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion GraphMapMatVal fromAbstractGraphStageWithMaterializedValue\[S, M] to [GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[S, M]

### Inherited by implicit conversion any2stringadd fromAbstractGraphStageWithMaterializedValue\[S, M] to any2stringadd\[AbstractGraphStageWithMaterializedValue\[S, M]]

### Inherited by implicit conversion StringFormat fromAbstractGraphStageWithMaterializedValue\[S, M] to StringFormat\[AbstractGraphStageWithMaterializedValue\[S, M]]

### Inherited by implicit conversion Ensuring fromAbstractGraphStageWithMaterializedValue\[S, M] to Ensuring\[AbstractGraphStageWithMaterializedValue\[S, M]]

### Inherited by implicit conversion ArrowAssoc fromAbstractGraphStageWithMaterializedValue\[S, M] to ArrowAssoc\[AbstractGraphStageWithMaterializedValue\[S, M]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Pair.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph$$GraphMapMatVal.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AbstractGraphStageWithMaterializedValue.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AbstractInHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AbstractInOutHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AbstractOutHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AsyncCallback.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogicWithLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/InHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/OutHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/StageLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/TimerGraphStageLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/TimerGraphStageLogicWithLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AbstractGraphStageWithMaterializedValue.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AbstractGraphStageWithMaterializedValue.html)*