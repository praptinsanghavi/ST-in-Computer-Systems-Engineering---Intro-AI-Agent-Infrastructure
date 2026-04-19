---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.RouteTest
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:07:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTest.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.RouteTest
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.RouteTest

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.RouteTest

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[scaladsl](../index.html)
- [MarshallingTestUtils](MarshallingTestUtils.html)
- RouteTest
- [RouteTestResultComponent](RouteTestResultComponent.html)
- [RouteTestTimeout](RouteTestTimeout.html)
- [ScalatestRouteTest](ScalatestRouteTest.html)
- [ScalatestUtils](ScalatestUtils.html)
- [Specs2FrameworkInterface](Specs2FrameworkInterface$.html)
- [Specs2RouteTest](Specs2RouteTest.html)
- [Specs2Utils](Specs2Utils.html)
- [TestFrameworkInterface](TestFrameworkInterface.html)
- [WSProbe](WSProbe.html "A WSProbe is a probe that implements a Flow[Message, Message, Unit] for testing websocket code.")
- [WSTestRequestBuilding](WSTestRequestBuilding.html)
[t](RouteTest$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[testkit](index.html)

# [RouteTest](RouteTest$.html "See companion object")[**](../../../../akka/http/scaladsl/testkit/RouteTest.html "Permalink")

### Companion [object RouteTest](RouteTest$.html "See companion object")

#### trait RouteTest extends [RequestBuilding](../client/RequestBuilding.html) with [WSTestRequestBuilding](WSTestRequestBuilding.html) with [RouteTestResultComponent](RouteTestResultComponent.html) with [MarshallingTestUtils](MarshallingTestUtils.html)

Self TypeRouteTest with [TestFrameworkInterface](TestFrameworkInterface.html)Source[RouteTest.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-testkit/src/main/scala/akka/http/scaladsl/testkit/RouteTest.scala#L31)Linear Supertypes[MarshallingTestUtils](MarshallingTestUtils.html), [RouteTestResultComponent](RouteTestResultComponent.html), [WSTestRequestBuilding](WSTestRequestBuilding.html), [RequestBuilding](../client/RequestBuilding.html), [TransformerPipelineSupport](../client/TransformerPipelineSupport.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ScalatestRouteTest](ScalatestRouteTest.html), [Specs2RouteTest](Specs2RouteTest.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RouteTest
2. MarshallingTestUtils
3. RouteTestResultComponent
4. WSTestRequestBuilding
5. RequestBuilding
6. TransformerPipelineSupport
7. AnyRef
8. Any
Implicitly  
1. by WithTransformation
2. by WithTransformation
3. by any2stringadd
4. by StringFormat
5. by Ensuring
6. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/client/RequestBuilding$RequestBuilder.html "Permalink")  class [RequestBuilder](../client/RequestBuilding$RequestBuilder.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
2. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformation.html "Permalink") implicit  class [WithTransformation](../client/TransformerPipelineSupport$WithTransformation.html)\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[TransformerPipelineSupport](../client/TransformerPipelineSupport.html)
3. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformerConcatenation.html "Permalink") implicit  class [WithTransformerConcatenation](../client/TransformerPipelineSupport$WithTransformerConcatenation.html)\[A, B] extends (A) \=\> BDefinition Classes[TransformerPipelineSupport](../client/TransformerPipelineSupport.html)
4. [**](../../../../akka/http/scaladsl/testkit/RouteTest$DefaultHostInfo.html "Permalink")  case class [DefaultHostInfo](RouteTest$DefaultHostInfo.html)(host: [Host](../model/headers/Host.html), securedConnection: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
5. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest "Permalink")  type RequestTransformer \= ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
6. [**](../../../../akka/http/scaladsl/testkit/RouteTest$TildeArrow.html "Permalink") abstract  class [TildeArrow](RouteTest$TildeArrow.html)\[A, B] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
7. [**](../../../../akka/http/scaladsl/testkit/RouteTest$TildeBangArrow.html "Permalink") abstract  class [TildeBangArrow](RouteTest$TildeBangArrow.html)\[A, B] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
8. [**](../../../../akka/http/scaladsl/testkit/RouteTest$WithTransformation2.html "Permalink") implicit  class [WithTransformation2](RouteTest$WithTransformation2.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
9. [**](../../../../akka/http/scaladsl/testkit/RouteTestResultComponent$RouteTestResult.html "Permalink")  class [RouteTestResult](RouteTestResultComponent$RouteTestResult.html "A receptacle for the response or rejections created by a route.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A receptacle for the response or rejections created by a route.

A receptacle for the response or rejections created by a route.

Definition Classes[RouteTestResultComponent](RouteTestResultComponent.html)
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#failTest(msg:String):Nothing "Permalink") abstract  def failTest(msg: String): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition Classes[RouteTestResultComponent](RouteTestResultComponent.html)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RouteTest toany2stringadd\[RouteTest] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RouteTest, B)ImplicitThis member is added by an implicit conversion from RouteTest toArrowAssoc\[RouteTest] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#Delete:RequestBuilding.this.RequestBuilder "Permalink")  val Delete: (RouteTest.this)\#RequestBuilderDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
7. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#Get:RequestBuilding.this.RequestBuilder "Permalink")  val Get: (RouteTest.this)\#RequestBuilderDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
8. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#Head:RequestBuilding.this.RequestBuilder "Permalink")  val Head: (RouteTest.this)\#RequestBuilderDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
9. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#Options:RequestBuilding.this.RequestBuilder "Permalink")  val Options: (RouteTest.this)\#RequestBuilderDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
10. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#Patch:RequestBuilding.this.RequestBuilder "Permalink")  val Patch: (RouteTest.this)\#RequestBuilderDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
11. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#Post:RequestBuilding.this.RequestBuilder "Permalink")  val Post: (RouteTest.this)\#RequestBuilderDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
12. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#Put:RequestBuilding.this.RequestBuilder "Permalink")  val Put: (RouteTest.this)\#RequestBuilderDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
13. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#WS(uri:akka.http.scaladsl.model.Uri,clientSideHandler:akka.stream.scaladsl.Flow[akka.http.scaladsl.model.ws.Message,akka.http.scaladsl.model.ws.Message,Any],subprotocols:Seq[String])(implicitmaterializer:akka.stream.Materializer):akka.http.scaladsl.model.HttpRequest "Permalink")  def WS(uri: [Uri](../model/Uri.html), clientSideHandler: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[Message](../model/ws/Message.html), [Message](../model/ws/Message.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], subprotocols: Seq\[String] \= Nil)(implicit materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [HttpRequest](../model/HttpRequest.html)Definition Classes[WSTestRequestBuilding](WSTestRequestBuilding.html)Annotations@nowarn()
14. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#actorSystemNameFrom(clazz:Class[_]):String "Permalink")  def actorSystemNameFrom(clazz: Class\[\_]): String
15. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#addAttribute[T](key:akka.http.scaladsl.model.AttributeKey[T],value:T):RequestBuilding.this.RequestTransformer "Permalink")  def addAttribute\[T](key: [AttributeKey](../model/AttributeKey.html)\[T], value: T): (RouteTest.this)\#RequestTransformerDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
16. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#addCredentials(credentials:akka.http.scaladsl.model.headers.HttpCredentials):RequestBuilding.this.RequestTransformer "Permalink")  def addCredentials(credentials: [HttpCredentials](../model/headers/HttpCredentials.html)): (RouteTest.this)\#RequestTransformerDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
17. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#addHeader(headerName:String,headerValue:String):RequestBuilding.this.RequestTransformer "Permalink")  def addHeader(headerName: String, headerValue: String): (RouteTest.this)\#RequestTransformerDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
18. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#addHeader(header:akka.http.scaladsl.model.HttpHeader):RequestBuilding.this.RequestTransformer "Permalink")  def addHeader(header: [HttpHeader](../model/HttpHeader.html)): (RouteTest.this)\#RequestTransformerDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
19. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#addHeaders(first:akka.http.scaladsl.model.HttpHeader,more:akka.http.scaladsl.model.HttpHeader*):RequestBuilding.this.RequestTransformer "Permalink")  def addHeaders(first: [HttpHeader](../model/HttpHeader.html), more: [HttpHeader](../model/HttpHeader.html)\*): (RouteTest.this)\#RequestTransformerDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
20. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
21. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#charset:akka.http.scaladsl.model.HttpCharset "Permalink")  def charset: [HttpCharset](../model/HttpCharset.html)
22. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#charsetOption:Option[akka.http.scaladsl.model.HttpCharset] "Permalink")  def charsetOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[HttpCharset](../model/HttpCharset.html)]
23. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#check[T](body:=>T):RouteTest.this.RouteTestResult=>T "Permalink")  def check\[T](body: \=\> T): ((RouteTest.this)\#RouteTestResult) \=\> T
24. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#chunks:Seq[akka.http.scaladsl.model.HttpEntity.ChunkStreamPart] "Permalink")  def chunks: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ChunkStreamPart](../model/HttpEntity$$ChunkStreamPart.html)]
25. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#chunksStream:akka.stream.scaladsl.Source[akka.http.scaladsl.model.HttpEntity.ChunkStreamPart,Any] "Permalink")  def chunksStream: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ChunkStreamPart](../model/HttpEntity$$ChunkStreamPart.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
26. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#cleanUp():Unit "Permalink")  def cleanUp(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
27. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#closingExtension:String "Permalink")  def closingExtension: String
29. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#contentType:akka.http.scaladsl.model.ContentType "Permalink")  def contentType: [ContentType](../model/ContentType.html)
30. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#createActorSystem():akka.actor.ActorSystem "Permalink")  def createActorSystem(): [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)Override to supply a custom ActorSystem

Override to supply a custom ActorSystem

Attributesprotected
31. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RouteTest) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RouteTestImplicitThis member is added by an implicit conversion from RouteTest toEnsuring\[RouteTest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
32. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RouteTest) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RouteTestImplicitThis member is added by an implicit conversion from RouteTest toEnsuring\[RouteTest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
33. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RouteTestImplicitThis member is added by an implicit conversion from RouteTest toEnsuring\[RouteTest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
34. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RouteTestImplicitThis member is added by an implicit conversion from RouteTest toEnsuring\[RouteTest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
35. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#entityAs[T](implicitevidence$1:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T],implicitevidence$2:scala.reflect.ClassTag[T],implicittimeout:scala.concurrent.duration.Duration):T "Permalink")  def entityAs\[T](implicit arg0: [FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T], arg1: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], timeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 1\.second): T
36. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
37. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
38. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#executor:scala.concurrent.ExecutionContextExecutor "Permalink") implicit  def executor: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)
39. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#expectWebSocketUpgradeWithProtocol(body:String=>Unit):Unit "Permalink")  def expectWebSocketUpgradeWithProtocol(body: (String) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Asserts that the received response is a WebSocket upgrade response and the extracts
the chosen subprotocol and passes it to the handler.
40. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
41. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#handled:Boolean "Permalink")  def handled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
42. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
43. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#header(name:String):Option[akka.http.scaladsl.model.HttpHeader] "Permalink")  def header(name: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[HttpHeader](../model/HttpHeader.html)]
44. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#header[T>:Null<:akka.http.scaladsl.model.HttpHeader](implicitevidence$5:scala.reflect.ClassTag[T]):Option[T] "Permalink")  def header\[T \>: Null \<: [HttpHeader](../model/HttpHeader.html)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]
45. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#header2AddHeader(header:akka.http.scaladsl.model.HttpHeader):RequestBuilding.this.RequestTransformer "Permalink") implicit  def header2AddHeader(header: [HttpHeader](../model/HttpHeader.html)): (RouteTest.this)\#RequestTransformerDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
46. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#headers:Seq[akka.http.scaladsl.model.HttpHeader] "Permalink")  def headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]
47. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
48. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#isWebSocketUpgrade:Boolean "Permalink")  def isWebSocketUpgrade: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
49. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#logRequest(logFun:akka.http.scaladsl.model.HttpRequest=>Unit):akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest "Permalink")  def logRequest(logFun: ([HttpRequest](../model/HttpRequest.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
50. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#logRequest(log:akka.event.LoggingAdapter,level:akka.event.Logging.LogLevel):akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest "Permalink")  def logRequest(log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), level: LogLevel \= [Logging.DebugLevel](../../../index.html)): ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
51. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#logValue[T](logFun:T=>Unit):T=>T "Permalink")  def logValue\[T](logFun: (T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): (T) \=\> TDefinition Classes[TransformerPipelineSupport](../client/TransformerPipelineSupport.html)
52. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#logValue[T](log:akka.event.LoggingAdapter,level:akka.event.Logging.LogLevel):T=>T "Permalink")  def logValue\[T](log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), level: LogLevel \= [Logging.DebugLevel](../../../index.html)): (T) \=\> TDefinition Classes[TransformerPipelineSupport](../client/TransformerPipelineSupport.html)
53. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#mapHeaders(f:Seq[akka.http.scaladsl.model.HttpHeader]=>Seq[akka.http.scaladsl.model.HttpHeader]):RequestBuilding.this.RequestTransformer "Permalink")  def mapHeaders(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]) \=\> [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]): (RouteTest.this)\#RequestTransformerDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
54. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#marshal[T](value:T)(implicitevidence$1:akka.http.scaladsl.marshalling.ToEntityMarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def marshal\[T](value: T)(implicit arg0: [ToEntityMarshaller](../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Strict](../model/HttpEntity$$Strict.html)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
55. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#marshalToResponse[T](value:T,request:akka.http.scaladsl.model.HttpRequest)(implicitevidence$3:akka.http.scaladsl.marshalling.ToResponseMarshaller[T],implicitec:scala.concurrent.ExecutionContext):akka.http.scaladsl.model.HttpResponse "Permalink")  def marshalToResponse\[T](value: T, request: [HttpRequest](../model/HttpRequest.html) \= [HttpRequest()](../../../index.html))(implicit arg0: [ToResponseMarshaller](../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [HttpResponse](../model/HttpResponse.html)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
56. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#marshalToResponseForRequestAccepting[T](value:T,mediaRanges:akka.http.scaladsl.model.MediaRange*)(implicitevidence$2:akka.http.scaladsl.marshalling.ToResponseMarshaller[T],implicitec:scala.concurrent.ExecutionContext):akka.http.scaladsl.model.HttpResponse "Permalink")  def marshalToResponseForRequestAccepting\[T](value: T, mediaRanges: [MediaRange](../model/MediaRange.html)\*)(implicit arg0: [ToResponseMarshaller](../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [HttpResponse](../model/HttpResponse.html)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
57. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#marshallingTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  def marshallingTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
58. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#materializer:akka.stream.Materializer "Permalink") implicit  val materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)
59. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#mediaType:akka.http.scaladsl.model.MediaType "Permalink")  def mediaType: [MediaType](../model/MediaType.html)
60. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
61. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
62. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
63. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#rejection:akka.http.scaladsl.server.Rejection "Permalink")  def rejection: [Rejection](../server/Rejection.html)
64. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#rejections:Seq[akka.http.scaladsl.server.Rejection] "Permalink")  def rejections: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](../server/Rejection.html)]
65. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#removeHeader(clazz:Class[_]):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeader(clazz: Class\[\_]): (RouteTest.this)\#RequestTransformerDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
66. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#removeHeader[T<:akka.http.scaladsl.model.HttpHeader](implicitevidence$1:scala.reflect.ClassTag[T]):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeader\[T \<: [HttpHeader](../model/HttpHeader.html)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): (RouteTest.this)\#RequestTransformerDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
67. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#removeHeader(headerName:String):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeader(headerName: String): (RouteTest.this)\#RequestTransformerDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
68. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#removeHeaders(names:String*):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeaders(names: String\*): (RouteTest.this)\#RequestTransformerDefinition Classes[RequestBuilding](../client/RequestBuilding.html)
69. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#response:akka.http.scaladsl.model.HttpResponse "Permalink")  def response: [HttpResponse](../model/HttpResponse.html)
70. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#responseAs[T](implicitevidence$3:akka.http.scaladsl.unmarshalling.FromResponseUnmarshaller[T],implicitevidence$4:scala.reflect.ClassTag[T],implicittimeout:scala.concurrent.duration.Duration):T "Permalink")  def responseAs\[T](implicit arg0: [FromResponseUnmarshaller](../unmarshalling/index.html#FromResponseUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpResponse,T])\[T], arg1: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], timeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 1\.second): T
71. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#responseEntity:akka.http.scaladsl.model.HttpEntity "Permalink")  def responseEntity: [HttpEntity](../model/HttpEntity.html)
72. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#runRoute:RouteTest.this.RouteTestResult=>RouteTest.this.RouteTestResult "Permalink")  def runRoute: ((RouteTest.this)\#RouteTestResult) \=\> (RouteTest.this)\#RouteTestResultA dummy that can be used as `~> runRoute` to run the route but without blocking for the result.

A dummy that can be used as `~> runRoute` to run the route but without blocking for the result.
The result of the pipeline is the result that can later be checked with `check`. See the
"separate running route from checking" example from ScalatestRouteTestSpec.scala.
73. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#status:akka.http.scaladsl.model.StatusCode "Permalink")  def status: [StatusCode](../model/StatusCode.html)
74. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
75. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#system:akka.actor.ActorSystem "Permalink") implicit  val system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)
76. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#testConfig:com.typesafe.config.Config "Permalink")  def testConfig: [Config](https://javadoc.io/page/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config)Definition ClassesRouteTest → [MarshallingTestUtils](MarshallingTestUtils.html)
77. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#testConfigSource:String "Permalink")  def testConfigSource: String
78. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
79. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#trailer:Seq[akka.http.scaladsl.model.HttpHeader] "Permalink")  def trailer: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]
80. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#unmarshal[T](entity:akka.http.scaladsl.model.HttpEntity)(implicitevidence$5:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):scala.util.Try[T] "Permalink")  def unmarshal\[T](entity: [HttpEntity](../model/HttpEntity.html))(implicit arg0: [FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T]Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
81. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#unmarshalValue[T](entity:akka.http.scaladsl.model.HttpEntity)(implicitevidence$4:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):T "Permalink")  def unmarshalValue\[T](entity: [HttpEntity](../model/HttpEntity.html))(implicit arg0: [FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): TDefinition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
82. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
83. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
84. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
85. [**](../../../../akka/http/scaladsl/testkit/RouteTest$DefaultHostInfo$.html "Permalink")  object [DefaultHostInfo](RouteTest$DefaultHostInfo$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
86. [**](../../../../akka/http/scaladsl/testkit/RouteTest$TildeArrow$.html "Permalink")  object [TildeArrow](RouteTest$TildeArrow$.html)
87. [**](../../../../akka/http/scaladsl/testkit/RouteTest$TildeBangArrow$.html "Permalink")  object [TildeBangArrow](RouteTest$TildeBangArrow$.html)
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#~>[B](f:A=>B):B "Permalink")  def \~\>\[B](f: (RouteTest) \=\> B): BImplicitThis member is added by an implicit conversion from RouteTest to[client.RequestBuilding.WithTransformation](../client/RequestBuilding$.html#WithTransformation[A]extendsAnyRef)\[RouteTest] performed by method WithTransformation in [akka.http.scaladsl.client.TransformerPipelineSupport](../client/TransformerPipelineSupport.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(routeTest: client.RequestBuilding.WithTransformation[RouteTest]).~>(f)
```
Definition Classes[WithTransformation](../client/TransformerPipelineSupport$WithTransformation.html)
2. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#~>[B](f:A=>B):B "Permalink")  def \~\>\[B](f: (RouteTest) \=\> B): BImplicitThis member is added by an implicit conversion from RouteTest to[client.TransformerPipelineSupport.WithTransformation](../client/TransformerPipelineSupport$.html#WithTransformation[A]extendsAnyRef)\[RouteTest] performed by method WithTransformation in [akka.http.scaladsl.client.TransformerPipelineSupport](../client/TransformerPipelineSupport.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(routeTest: client.TransformerPipelineSupport.WithTransformation[RouteTest]).~>(f)
```
Definition Classes[WithTransformation](../client/TransformerPipelineSupport$WithTransformation.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RouteTest toStringFormat\[RouteTest] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RouteTest, B)ImplicitThis member is added by an implicit conversion from RouteTest toArrowAssoc\[RouteTest] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [MarshallingTestUtils](MarshallingTestUtils.html)

### Inherited from [RouteTestResultComponent](RouteTestResultComponent.html)

### Inherited from [WSTestRequestBuilding](WSTestRequestBuilding.html)

### Inherited from [RequestBuilding](../client/RequestBuilding.html)

### Inherited from [TransformerPipelineSupport](../client/TransformerPipelineSupport.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion WithTransformation fromRouteTest to [client.RequestBuilding.WithTransformation](../client/RequestBuilding$.html#WithTransformation[A]extendsAnyRef)\[RouteTest]

### Inherited by implicit conversion WithTransformation fromRouteTest to [client.TransformerPipelineSupport.WithTransformation](../client/TransformerPipelineSupport$.html#WithTransformation[A]extendsAnyRef)\[RouteTest]

### Inherited by implicit conversion any2stringadd fromRouteTest to any2stringadd\[RouteTest]

### Inherited by implicit conversion StringFormat fromRouteTest to StringFormat\[RouteTest]

### Inherited by implicit conversion Ensuring fromRouteTest to Ensuring\[RouteTest]

### Inherited by implicit conversion ArrowAssoc fromRouteTest to ArrowAssoc\[RouteTest]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/RequestBuilding$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/RequestBuilding$RequestBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/RequestBuilding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/TransformerPipelineSupport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformation.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformerConcatenation.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/TransformerPipelineSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$ChunkStreamPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/MarshallingTestUtils.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest$DefaultHostInfo$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest$DefaultHostInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest$TildeArrow$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest$TildeArrow.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest$TildeBangArrow$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest$TildeBangArrow.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest$WithTransformation2.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTestResultComponent$RouteTestResult.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTestResultComponent.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTestTimeout$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTestTimeout.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/ScalatestRouteTest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/ScalatestUtils.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2FrameworkInterface$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2RouteTest.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest.html)*