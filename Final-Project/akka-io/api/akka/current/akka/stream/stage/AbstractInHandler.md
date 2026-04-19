---
description: Akka 2.10.17 - akka.stream.stage.AbstractInHandler
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:12:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/stage/AbstractInHandler.html
title: Akka 2.10.17 - akka.stream.stage.AbstractInHandler
---

# Akka 2.10.17 - akka.stream.stage.AbstractInHandler

> **Summary:** Akka 2.10.17 - akka.stream.stage.AbstractInHandler

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/stage/index.html "Permalink")  package [stage](index.html)Definition Classes[stream](../index.html)
- [AbstractGraphStageWithMaterializedValue](AbstractGraphStageWithMaterializedValue.html "Java API: A GraphStage represents a reusable graph stream processing operator.")
- AbstractInHandler
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

# AbstractInHandler[**](../../../akka/stream/stage/AbstractInHandler.html "Permalink")

### 

#### abstract  class AbstractInHandler extends [InHandler](InHandler.html)

Java API: callbacks for an input port where termination logic is predefined
(completing when upstream completes, failing when upstream fails).

Source[GraphStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/stage/GraphStage.scala#L1953)Linear Supertypes[InHandler](InHandler.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AbstractInHandler
2. InHandler
3. AnyRef
4. Any
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

1. [**](../../../akka/stream/stage/AbstractInHandler.html#<init>():akka.stream.stage.AbstractInHandler "Permalink")  new AbstractInHandler()
### Abstract Value Members

1. [**](../../../akka/stream/stage/AbstractInHandler.html#onPush():Unit "Permalink") abstract  def onPush(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the input port has a new element available.

Called when the input port has a new element available. The actual element can be retrieved via the
[GraphStageLogic.grab](GraphStageLogic.html#grab[T](in:akka.stream.Inlet[T]):T) method.

Definition Classes[InHandler](InHandler.html)Annotations@throws(classOf\[Exception])
### Concrete Value Members

1. [**](../../../akka/stream/stage/AbstractInHandler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/stage/AbstractInHandler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/stage/AbstractInHandler.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AbstractInHandler toany2stringadd\[AbstractInHandler] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/stage/AbstractInHandler.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AbstractInHandler, B)ImplicitThis member is added by an implicit conversion from AbstractInHandler toArrowAssoc\[AbstractInHandler] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/stage/AbstractInHandler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/stage/AbstractInHandler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/stage/AbstractInHandler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/stage/AbstractInHandler.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AbstractInHandler) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractInHandlerImplicitThis member is added by an implicit conversion from AbstractInHandler toEnsuring\[AbstractInHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/stream/stage/AbstractInHandler.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AbstractInHandler) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractInHandlerImplicitThis member is added by an implicit conversion from AbstractInHandler toEnsuring\[AbstractInHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/stage/AbstractInHandler.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractInHandlerImplicitThis member is added by an implicit conversion from AbstractInHandler toEnsuring\[AbstractInHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/stage/AbstractInHandler.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractInHandlerImplicitThis member is added by an implicit conversion from AbstractInHandler toEnsuring\[AbstractInHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/stage/AbstractInHandler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/stage/AbstractInHandler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/stream/stage/AbstractInHandler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/stage/AbstractInHandler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/stream/stage/AbstractInHandler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/stream/stage/AbstractInHandler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/stream/stage/AbstractInHandler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/stage/AbstractInHandler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/stream/stage/AbstractInHandler.html#onUpstreamFailure(ex:Throwable):Unit "Permalink")  def onUpstreamFailure(ex: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the input port has failed.

Called when the input port has failed. After this callback no other callbacks will be called for this port.

Definition Classes[InHandler](InHandler.html)Annotations@throws(classOf\[Exception])
21. [**](../../../akka/stream/stage/AbstractInHandler.html#onUpstreamFinish():Unit "Permalink")  def onUpstreamFinish(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the input port is finished.

Called when the input port is finished. After this callback no other callbacks will be called for this port.

Definition Classes[InHandler](InHandler.html)Annotations@throws(classOf\[Exception])
22. [**](../../../akka/stream/stage/AbstractInHandler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/stream/stage/AbstractInHandler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/stream/stage/AbstractInHandler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/stream/stage/AbstractInHandler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/stream/stage/AbstractInHandler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/stage/AbstractInHandler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/stage/AbstractInHandler.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AbstractInHandler toStringFormat\[AbstractInHandler] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/stage/AbstractInHandler.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AbstractInHandler, B)ImplicitThis member is added by an implicit conversion from AbstractInHandler toArrowAssoc\[AbstractInHandler] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [InHandler](InHandler.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAbstractInHandler to any2stringadd\[AbstractInHandler]

### Inherited by implicit conversion StringFormat fromAbstractInHandler to StringFormat\[AbstractInHandler]

### Inherited by implicit conversion Ensuring fromAbstractInHandler to Ensuring\[AbstractInHandler]

### Inherited by implicit conversion ArrowAssoc fromAbstractInHandler to ArrowAssoc\[AbstractInHandler]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/AbstractGraphStageWithMaterializedValue.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/AbstractInHandler.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/AbstractInOutHandler.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/AbstractOutHandler.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/AsyncCallback.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogicWithLogging.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/InHandler.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/OutHandler.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/StageLogging.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/TimerGraphStageLogic.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/TimerGraphStageLogicWithLogging.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/stage/AbstractInHandler.html](https://doc.akka.io/api/akka/current/akka/stream/stage/AbstractInHandler.html)*