---
description: Akka gRPC 2.5.10 - akka.grpc.internal.AbstractGrpcProtocol.GrpcFramingDecoderStage
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html
title: Akka gRPC 2.5.10 - akka.grpc.internal.AbstractGrpcProtocol.GrpcFramingDecoderStage
---

# Akka gRPC 2.5.10 - akka.grpc.internal.AbstractGrpcProtocol.GrpcFramingDecoderStage

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.internal.AbstractGrpcProtocol.GrpcFramingDecoderStage

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[grpc](../index.html)
- [**](../../../akka/grpc/internal/AbstractGrpcProtocol$.html "Permalink")  object [AbstractGrpcProtocol](AbstractGrpcProtocol$.html)Definition Classes[internal](index.html)
- GrpcFramingDecoderStage
c[akka](../../index.html).[grpc](../index.html).[internal](index.html).[AbstractGrpcProtocol](AbstractGrpcProtocol$.html)

# GrpcFramingDecoderStage[**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html "Permalink")

### 

#### class GrpcFramingDecoderStage extends ByteStringParser\[[Frame](../GrpcProtocol$$Frame.html)]

Source[AbstractGrpcProtocol.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/internal/AbstractGrpcProtocol.scala#L134)Linear SupertypesByteStringParser\[[Frame](../GrpcProtocol$$Frame.html)], GraphStage\[FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)]], GraphStageWithMaterializedValue\[FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)], NotUsed], Graph\[FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)], NotUsed], AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcFramingDecoderStage
2. ByteStringParser
3. GraphStage
4. GraphStageWithMaterializedValue
5. Graph
6. AnyRef
7. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#<init>(codec:akka.grpc.internal.Codec,deframe:(Int,akka.util.ByteString)=>akka.grpc.GrpcProtocol.Frame):akka.grpc.internal.AbstractGrpcProtocol.GrpcFramingDecoderStage "Permalink")  new GrpcFramingDecoderStage(codec: [Codec](Codec.html), deframe: (Int, ByteString) \=\> [Frame](../GrpcProtocol$$Frame.html))
### Type Members

1. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#ParsingLogicextendsGraphStageLogicwithInHandlerwithOutHandler "Permalink")  class ParsingLogic extends GraphStageLogic with InHandler with OutHandlerDefinition ClassesByteStringParser
2. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#Shape=S@scala.annotation.unchecked.uncheckedVariance "Permalink")  type Shape \= FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)]Definition ClassesGraph
### Value Members

1. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#addAttributes(attr:akka.stream.Attributes):akka.stream.Graph[S,M] "Permalink")  def addAttributes(attr: Attributes): Graph\[FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)], NotUsed]Definition ClassesGraph
5. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String, inputBufferSize: Int): Graph\[FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)], NotUsed]Definition ClassesGraph
7. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#async(dispatcher:String):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String): Graph\[FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)], NotUsed]Definition ClassesGraph
8. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#async:akka.stream.Graph[S,M] "Permalink")  def async: Graph\[FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)], NotUsed]Definition ClassesGraph
9. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
10. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#createLogic(inheritedAttributes:akka.stream.Attributes):akka.stream.stage.GraphStageLogic "Permalink")  def createLogic(inheritedAttributes: Attributes): GraphStageLogicDefinition ClassesGrpcFramingDecoderStage → GraphStage
11. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#createLogicAndMaterializedValue(inheritedAttributes:akka.stream.Attributes):(akka.stream.stage.GraphStageLogic,akka.NotUsed) "Permalink") final  def createLogicAndMaterializedValue(inheritedAttributes: Attributes): (GraphStageLogic, NotUsed)Definition ClassesGraphStage → GraphStageWithMaterializedValue
12. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
13. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
14. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: AttributesDefinition ClassesGraph
15. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
16. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
17. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#initialAttributes:akka.stream.Attributes "Permalink")  def initialAttributes: AttributesDefinition ClassesByteStringParser → GraphStageWithMaterializedValue
18. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
19. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#named(name:String):akka.stream.Graph[S,M] "Permalink")  def named(name: String): Graph\[FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)], NotUsed]Definition ClassesGraph
20. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
21. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
22. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
23. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#shape:akka.stream.FlowShape[akka.util.ByteString,T] "Permalink") final  val shape: FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)]Definition ClassesByteStringParser → Graph
24. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#withAttributes(attr:akka.stream.Attributes):akka.stream.Graph[S,M] "Permalink") final  def withAttributes(attr: Attributes): Graph\[FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)], NotUsed]Definition ClassesGraphStageWithMaterializedValue → Graph
### Deprecated Value Members

1. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from ByteStringParser\[[Frame](../GrpcProtocol$$Frame.html)]

### Inherited from GraphStage\[FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)]]

### Inherited from GraphStageWithMaterializedValue\[FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)], NotUsed]

### Inherited from Graph\[FlowShape\[ByteString, [Frame](../GrpcProtocol$$Frame.html)], NotUsed]

### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$Frame.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AbstractGrpcProtocol$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/Codec.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AbstractGrpcProtocol$$GrpcFramingDecoderStage.html)*