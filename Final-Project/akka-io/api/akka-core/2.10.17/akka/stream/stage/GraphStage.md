---
description: Akka 2.10.17 - akka.stream.stage.GraphStage
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:30:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/stage/GraphStage.html
title: Akka 2.10.17 - akka.stream.stage.GraphStage
---

# Akka 2.10.17 - akka.stream.stage.GraphStage

> **Summary:** Akka 2.10.17 - akka.stream.stage.GraphStage

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/stage/index.html "Permalink")  package [stage](index.html)Definition Classes[stream](../index.html)
- [AbstractGraphStageWithMaterializedValue](AbstractGraphStageWithMaterializedValue.html "Java API: A GraphStage represents a reusable graph stream processing operator.")
- [AbstractInHandler](AbstractInHandler.html "Java API: callbacks for an input port where termination logic is predefined (completing when upstream completes, failing when upstream fails).")
- [AbstractInOutHandler](AbstractInOutHandler.html "Java API: callback combination for output and input ports where termination logic is predefined (completing when upstream completes, failing when upstream fails, completing when downstream cancels).")
- [AbstractOutHandler](AbstractOutHandler.html "Java API: callbacks for an output port where termination logic is predefined (completing when downstream cancels).")
- [AsyncCallback](AsyncCallback.html "An asynchronous callback holder that is attached to a GraphStageLogic.")
- GraphStage
- [GraphStageLogic](GraphStageLogic.html "Represents the processing logic behind a GraphStage.")
- [GraphStageLogicWithLogging](GraphStageLogicWithLogging.html "Java API: GraphStageLogic with StageLogging.")
- [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html "Scala API: A GraphStage represents a reusable graph stream processing operator.")
- [InHandler](InHandler.html "Collection of callbacks for an input port of a GraphStage")
- [OutHandler](OutHandler.html "Collection of callbacks for an output port of a GraphStage")
- [StageLogging](StageLogging.html "Simple way to obtain a akka.event.LoggingAdapter when used together with an akka.stream.Materializer.")
- [TimerGraphStageLogic](TimerGraphStageLogic.html "Provides timer related facilities to a GraphStageLogic.")
- [TimerGraphStageLogicWithLogging](TimerGraphStageLogicWithLogging.html "Java API: TimerGraphStageLogic with StageLogging.")
c[akka](../../index.html).[stream](../index.html).[stage](index.html)

# GraphStage[**](../../../akka/stream/stage/GraphStage.html "Permalink")

### 

#### abstract  class GraphStage\[S \<: [Shape](../Shape.html)] extends [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html)\[S, [NotUsed](../../NotUsed.html)]

A GraphStage represents a reusable graph stream processing operator.

A GraphStage consists of a [Shape](#Shape=S@scala.annotation.unchecked.uncheckedVariance) which describes its input and output ports and a factory function that
creates a [GraphStageLogic](GraphStageLogic.html) which implements the processing logic that ties the ports together.

Source[GraphStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/stage/GraphStage.scala#L109)Linear Supertypes[GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html)\[S, [NotUsed](../../NotUsed.html)], [Graph](../Graph.html)\[S, [NotUsed](../../NotUsed.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Balance](../scaladsl/Balance.html), [Broadcast](../scaladsl/Broadcast.html), [Concat](../scaladsl/Concat.html), [Interleave](../scaladsl/Interleave.html), [Merge](../scaladsl/Merge.html), [MergeLatest](../scaladsl/MergeLatest.html), [MergePreferred](../scaladsl/MergePreferred.html), [MergePrioritized](../scaladsl/MergePrioritized.html), [MergeSequence](../scaladsl/MergeSequence.html), [MergeSorted](../scaladsl/MergeSorted.html), [Partition](../scaladsl/Partition.html), [Unzip](../scaladsl/Unzip.html), [UnzipWith10](../scaladsl/UnzipWith10.html), [UnzipWith11](../scaladsl/UnzipWith11.html), [UnzipWith12](../scaladsl/UnzipWith12.html), [UnzipWith13](../scaladsl/UnzipWith13.html), [UnzipWith14](../scaladsl/UnzipWith14.html), [UnzipWith15](../scaladsl/UnzipWith15.html), [UnzipWith16](../scaladsl/UnzipWith16.html), [UnzipWith17](../scaladsl/UnzipWith17.html), [UnzipWith18](../scaladsl/UnzipWith18.html), [UnzipWith19](../scaladsl/UnzipWith19.html), [UnzipWith2](../scaladsl/UnzipWith2.html), [UnzipWith20](../scaladsl/UnzipWith20.html), [UnzipWith21](../scaladsl/UnzipWith21.html), [UnzipWith22](../scaladsl/UnzipWith22.html), [UnzipWith3](../scaladsl/UnzipWith3.html), [UnzipWith4](../scaladsl/UnzipWith4.html), [UnzipWith5](../scaladsl/UnzipWith5.html), [UnzipWith6](../scaladsl/UnzipWith6.html), [UnzipWith7](../scaladsl/UnzipWith7.html), [UnzipWith8](../scaladsl/UnzipWith8.html), [UnzipWith9](../scaladsl/UnzipWith9.html), [Zip](../scaladsl/Zip.html), [ZipLatest](../scaladsl/ZipLatest.html), [ZipLatestWith10](../scaladsl/ZipLatestWith10.html), [ZipLatestWith11](../scaladsl/ZipLatestWith11.html), [ZipLatestWith12](../scaladsl/ZipLatestWith12.html), [ZipLatestWith13](../scaladsl/ZipLatestWith13.html), [ZipLatestWith14](../scaladsl/ZipLatestWith14.html), [ZipLatestWith15](../scaladsl/ZipLatestWith15.html), [ZipLatestWith16](../scaladsl/ZipLatestWith16.html), [ZipLatestWith17](../scaladsl/ZipLatestWith17.html), [ZipLatestWith18](../scaladsl/ZipLatestWith18.html), [ZipLatestWith19](../scaladsl/ZipLatestWith19.html), [ZipLatestWith2](../scaladsl/ZipLatestWith2.html), [ZipLatestWith20](../scaladsl/ZipLatestWith20.html), [ZipLatestWith21](../scaladsl/ZipLatestWith21.html), [ZipLatestWith22](../scaladsl/ZipLatestWith22.html), [ZipLatestWith3](../scaladsl/ZipLatestWith3.html), [ZipLatestWith4](../scaladsl/ZipLatestWith4.html), [ZipLatestWith5](../scaladsl/ZipLatestWith5.html), [ZipLatestWith6](../scaladsl/ZipLatestWith6.html), [ZipLatestWith7](../scaladsl/ZipLatestWith7.html), [ZipLatestWith8](../scaladsl/ZipLatestWith8.html), [ZipLatestWith9](../scaladsl/ZipLatestWith9.html), [ZipN](../scaladsl/ZipN.html), [ZipWith10](../scaladsl/ZipWith10.html), [ZipWith11](../scaladsl/ZipWith11.html), [ZipWith12](../scaladsl/ZipWith12.html), [ZipWith13](../scaladsl/ZipWith13.html), [ZipWith14](../scaladsl/ZipWith14.html), [ZipWith15](../scaladsl/ZipWith15.html), [ZipWith16](../scaladsl/ZipWith16.html), [ZipWith17](../scaladsl/ZipWith17.html), [ZipWith18](../scaladsl/ZipWith18.html), [ZipWith19](../scaladsl/ZipWith19.html), [ZipWith2](../scaladsl/ZipWith2.html), [ZipWith20](../scaladsl/ZipWith20.html), [ZipWith21](../scaladsl/ZipWith21.html), [ZipWith22](../scaladsl/ZipWith22.html), [ZipWith3](../scaladsl/ZipWith3.html), [ZipWith4](../scaladsl/ZipWith4.html), [ZipWith5](../scaladsl/ZipWith5.html), [ZipWith6](../scaladsl/ZipWith6.html), [ZipWith7](../scaladsl/ZipWith7.html), [ZipWith8](../scaladsl/ZipWith8.html), [ZipWith9](../scaladsl/ZipWith9.html), [ZipWithN](../scaladsl/ZipWithN.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GraphStage
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

1. [**](../../../akka/stream/stage/GraphStage.html#<init>():akka.stream.stage.GraphStage[S] "Permalink")  new GraphStage()
### Type Members

1. [**](../../../akka/stream/stage/GraphStage.html#Shape=S@scala.annotation.unchecked.uncheckedVariance "Permalink")  type Shape \= SType\-level accessor for the shape parameter of this graph.

Type\-level accessor for the shape parameter of this graph.

Definition Classes[Graph](../Graph.html)
### Abstract Value Members

1. [**](../../../akka/stream/stage/GraphStage.html#createLogic(inheritedAttributes:akka.stream.Attributes):akka.stream.stage.GraphStageLogic "Permalink") abstract  def createLogic(inheritedAttributes: [Attributes](../Attributes.html)): [GraphStageLogic](GraphStageLogic.html)Annotations@throws(classOf\[Exception])
2. [**](../../../akka/stream/stage/GraphStage.html#shape:S "Permalink") abstract  def shape: SThe shape of a graph is all that is externally visible: its inlets and outlets.

The shape of a graph is all that is externally visible: its inlets and outlets.

Definition Classes[Graph](../Graph.html)
### Concrete Value Members

1. [**](../../../akka/stream/stage/GraphStage.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/stage/GraphStage.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/stage/GraphStage.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from GraphStage\[S] toany2stringadd\[GraphStage\[S]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/stage/GraphStage.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (GraphStage\[S], B)ImplicitThis member is added by an implicit conversion from GraphStage\[S] toArrowAssoc\[GraphStage\[S]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/stage/GraphStage.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/stage/GraphStage.html#addAttributes(attr:akka.stream.Attributes):akka.stream.Graph[S,M] "Permalink")  def addAttributes(attr: [Attributes](../Attributes.html)): [Graph](../Graph.html)\[S, [NotUsed](../../NotUsed.html)]Add the given attributes to this [Graph](../Graph.html).

Add the given attributes to this [Graph](../Graph.html). If the specific attribute was already present
on this graph this means the added attribute will be more specific than the existing one.
If this Source is a composite of multiple graphs, new attributes on the composite will be
less specific than attributes set directly on the individual graphs of the composite.

Definition Classes[Graph](../Graph.html)
7. [**](../../../akka/stream/stage/GraphStage.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/stage/GraphStage.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String, inputBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Graph](../Graph.html)\[S, [NotUsed](../../NotUsed.html)]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

inputBufferSizeSet the input buffer to this size for the graph

Definition Classes[Graph](../Graph.html)
9. [**](../../../akka/stream/stage/GraphStage.html#async(dispatcher:String):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String): [Graph](../Graph.html)\[S, [NotUsed](../../NotUsed.html)]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

Definition Classes[Graph](../Graph.html)
10. [**](../../../akka/stream/stage/GraphStage.html#async:akka.stream.Graph[S,M] "Permalink")  def async: [Graph](../Graph.html)\[S, [NotUsed](../../NotUsed.html)]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

Definition Classes[Graph](../Graph.html)
11. [**](../../../akka/stream/stage/GraphStage.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/stream/stage/GraphStage.html#createLogicAndMaterializedValue(inheritedAttributes:akka.stream.Attributes):(akka.stream.stage.GraphStageLogic,akka.NotUsed) "Permalink") final  def createLogicAndMaterializedValue(inheritedAttributes: [Attributes](../Attributes.html)): ([GraphStageLogic](GraphStageLogic.html), [NotUsed](../../NotUsed.html))Definition ClassesGraphStage → [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html)
13. [**](../../../akka/stream/stage/GraphStage.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (GraphStage\[S]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GraphStage\[S]ImplicitThis member is added by an implicit conversion from GraphStage\[S] toEnsuring\[GraphStage\[S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/stream/stage/GraphStage.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (GraphStage\[S]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GraphStage\[S]ImplicitThis member is added by an implicit conversion from GraphStage\[S] toEnsuring\[GraphStage\[S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/stream/stage/GraphStage.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GraphStage\[S]ImplicitThis member is added by an implicit conversion from GraphStage\[S] toEnsuring\[GraphStage\[S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/stream/stage/GraphStage.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GraphStage\[S]ImplicitThis member is added by an implicit conversion from GraphStage\[S] toEnsuring\[GraphStage\[S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/stream/stage/GraphStage.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/stream/stage/GraphStage.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../akka/stream/stage/GraphStage.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: [Attributes](../Attributes.html)Definition Classes[Graph](../Graph.html)
20. [**](../../../akka/stream/stage/GraphStage.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/stream/stage/GraphStage.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/stream/stage/GraphStage.html#initialAttributes:akka.stream.Attributes "Permalink")  def initialAttributes: [Attributes](../Attributes.html)Attributesprotected Definition Classes[GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html)
23. [**](../../../akka/stream/stage/GraphStage.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../akka/stream/stage/GraphStage.html#mapMaterializedValue[M2](f:M=>M2):akka.stream.Graph[S,M2] "Permalink")  def mapMaterializedValue\[M2](f: ([NotUsed](../../NotUsed.html)) \=\> M2): [Graph](../Graph.html)\[S, M2]Transform the materialized value of this Graph, leaving all other properties as they were.

Transform the materialized value of this Graph, leaving all other properties as they were.

ffunction to map the graph's materialized value

ImplicitThis member is added by an implicit conversion from GraphStage\[S] to[GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[S, [NotUsed](../../NotUsed.html)] performed by method GraphMapMatVal in [akka.stream.Graph](../Graph$.html).This conversion will take place only if S is a subclass of stream.Shape (S \<: [stream.Shape](../Shape.html)).Definition Classes[GraphMapMatVal](../Graph$$GraphMapMatVal.html)
25. [**](../../../akka/stream/stage/GraphStage.html#named(name:String):akka.stream.Graph[S,M] "Permalink")  def named(name: String): [Graph](../Graph.html)\[S, [NotUsed](../../NotUsed.html)]Specifies the name of the Graph.

Specifies the name of the Graph.
If the name is null or empty the name is ignored, i.e. \#none is returned.

Definition Classes[Graph](../Graph.html)
26. [**](../../../akka/stream/stage/GraphStage.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/stream/stage/GraphStage.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/stream/stage/GraphStage.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/stream/stage/GraphStage.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../akka/stream/stage/GraphStage.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../akka/stream/stage/GraphStage.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../akka/stream/stage/GraphStage.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../akka/stream/stage/GraphStage.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/stream/stage/GraphStage.html#withAttributes(attr:akka.stream.Attributes):akka.stream.Graph[S,M] "Permalink") final  def withAttributes(attr: [Attributes](../Attributes.html)): [Graph](../Graph.html)\[S, [NotUsed](../../NotUsed.html)]Replace the attributes of this Flow with the given ones.

Replace the attributes of this Flow with the given ones. If this Flow is a composite
of multiple graphs, new attributes on the composite will be less specific than attributes
set directly on the individual graphs of the composite.

Definition Classes[GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html) → [Graph](../Graph.html)
### Deprecated Value Members

1. [**](../../../akka/stream/stage/GraphStage.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/stage/GraphStage.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from GraphStage\[S] toStringFormat\[GraphStage\[S]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/stage/GraphStage.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (GraphStage\[S], B)ImplicitThis member is added by an implicit conversion from GraphStage\[S] toArrowAssoc\[GraphStage\[S]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html)\[S, [NotUsed](../../NotUsed.html)]

### Inherited from [Graph](../Graph.html)\[S, [NotUsed](../../NotUsed.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion GraphMapMatVal fromGraphStage\[S] to [GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[S, [NotUsed](../../NotUsed.html)]

### Inherited by implicit conversion any2stringadd fromGraphStage\[S] to any2stringadd\[GraphStage\[S]]

### Inherited by implicit conversion StringFormat fromGraphStage\[S] to StringFormat\[GraphStage\[S]]

### Inherited by implicit conversion Ensuring fromGraphStage\[S] to Ensuring\[GraphStage\[S]]

### Inherited by implicit conversion ArrowAssoc fromGraphStage\[S] to ArrowAssoc\[GraphStage\[S]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/Attributes.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/Graph$$GraphMapMatVal.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/Graph$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/Shape.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/Balance.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/Broadcast.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/Concat.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/Interleave.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/Merge.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/MergeLatest.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/MergePreferred.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/MergePrioritized.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/MergeSequence.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/MergeSorted.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/Partition.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/Unzip.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith10.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith11.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith12.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith13.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith14.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith15.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith16.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith17.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith18.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith19.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith20.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith21.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith22.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith3.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith4.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith5.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith6.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith7.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith8.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/UnzipWith9.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/Zip.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/ZipLatest.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/ZipLatestWith10.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/ZipLatestWith11.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/ZipLatestWith12.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/ZipLatestWith13.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/ZipLatestWith14.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/ZipLatestWith15.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/stream/scaladsl/ZipLatestWith16.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/stream/stage/GraphStage.html](https://doc.akka.io/api/akka-core/2.10.17/akka/stream/stage/GraphStage.html)*