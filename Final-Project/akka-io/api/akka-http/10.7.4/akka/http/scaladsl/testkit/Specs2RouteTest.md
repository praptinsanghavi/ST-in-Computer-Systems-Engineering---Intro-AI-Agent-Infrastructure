---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.Specs2RouteTest
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:07:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2RouteTest.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.Specs2RouteTest
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.Specs2RouteTest

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.Specs2RouteTest

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[scaladsl](../index.html)
- [MarshallingTestUtils](MarshallingTestUtils.html)
- [RouteTest](RouteTest.html)
- [RouteTestResultComponent](RouteTestResultComponent.html)
- [RouteTestTimeout](RouteTestTimeout.html)
- [ScalatestRouteTest](ScalatestRouteTest.html)
- [ScalatestUtils](ScalatestUtils.html)
- [Specs2FrameworkInterface](Specs2FrameworkInterface$.html)
- Specs2RouteTest
- [Specs2Utils](Specs2Utils.html)
- [TestFrameworkInterface](TestFrameworkInterface.html)
- [WSProbe](WSProbe.html "A WSProbe is a probe that implements a Flow[Message, Message, Unit] for testing websocket code.")
- [WSTestRequestBuilding](WSTestRequestBuilding.html)
t[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[testkit](index.html)

# Specs2RouteTest[**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html "Permalink")

### 

#### trait Specs2RouteTest extends [RouteTest](RouteTest.html) with [Specs2](Specs2FrameworkInterface$$Specs2.html) with [Specs2Utils](Specs2Utils.html)

Source[Specs2Utils.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-testkit/src/main/scala/akka/http/scaladsl/testkit/Specs2Utils.scala#L34)Linear Supertypes[Specs2Utils](Specs2Utils.html), [Specs2](Specs2FrameworkInterface$$Specs2.html), [AfterAll](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/AfterAll.html#org.specs2.specification.AfterAll), [FragmentsFactory](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/create/FragmentsFactory.html#org.specs2.specification.create.FragmentsFactory), [SpecificationStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecificationStructure.html#org.specs2.specification.core.SpecificationStructure), [ContextualSpecificationStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/ContextualSpecificationStructure.html#org.specs2.specification.core.ContextualSpecificationStructure), [TestFrameworkInterface](TestFrameworkInterface.html), [RouteTest](RouteTest.html), [MarshallingTestUtils](MarshallingTestUtils.html), [RouteTestResultComponent](RouteTestResultComponent.html), [WSTestRequestBuilding](WSTestRequestBuilding.html), [RequestBuilding](../client/RequestBuilding.html), [TransformerPipelineSupport](../client/TransformerPipelineSupport.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Specs2RouteTest
2. Specs2Utils
3. Specs2
4. AfterAll
5. FragmentsFactory
6. SpecificationStructure
7. ContextualSpecificationStructure
8. TestFrameworkInterface
9. RouteTest
10. MarshallingTestUtils
11. RouteTestResultComponent
12. WSTestRequestBuilding
13. RequestBuilding
14. TransformerPipelineSupport
15. AnyRef
16. Any
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
4. [**](../../../../akka/http/scaladsl/testkit/RouteTest$DefaultHostInfo.html "Permalink")  case class [DefaultHostInfo](RouteTest$DefaultHostInfo.html)(host: [Host](../model/headers/Host.html), securedConnection: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableDefinition Classes[RouteTest](RouteTest.html)
5. [**](../../../../akka/http/scaladsl/testkit/RouteTest$TildeArrow.html "Permalink") abstract  class [TildeArrow](RouteTest$TildeArrow.html)\[A, B] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[RouteTest](RouteTest.html)
6. [**](../../../../akka/http/scaladsl/testkit/RouteTest$TildeBangArrow.html "Permalink") abstract  class [TildeBangArrow](RouteTest$TildeBangArrow.html)\[A, B] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[RouteTest](RouteTest.html)
7. [**](../../../../akka/http/scaladsl/testkit/RouteTest$WithTransformation2.html "Permalink") implicit  class [WithTransformation2](RouteTest$WithTransformation2.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[RouteTest](RouteTest.html)
8. [**](../../../../akka/http/scaladsl/testkit/RouteTestResultComponent$RouteTestResult.html "Permalink")  class [RouteTestResult](RouteTestResultComponent$RouteTestResult.html "A receptacle for the response or rejections created by a route.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A receptacle for the response or rejections created by a route.

A receptacle for the response or rejections created by a route.

Definition Classes[RouteTestResultComponent](RouteTestResultComponent.html)
9. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest "Permalink")  type RequestTransformer \= ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#is:org.specs2.specification.core.SpecStructure "Permalink") abstract  def is: [SpecStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecStructure.html#org.specs2.specification.core.SpecStructure)Definition ClassesSpecificationStructure
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/testkit/RouteTest$DefaultHostInfo$.html "Permalink")  object [DefaultHostInfo](RouteTest$DefaultHostInfo$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[RouteTest](RouteTest.html)
2. [**](../../../../akka/http/scaladsl/testkit/RouteTest$TildeArrow$.html "Permalink")  object [TildeArrow](RouteTest$TildeArrow$.html)Definition Classes[RouteTest](RouteTest.html)
3. [**](../../../../akka/http/scaladsl/testkit/RouteTest$TildeBangArrow$.html "Permalink")  object [TildeBangArrow](RouteTest$TildeBangArrow$.html)Definition Classes[RouteTest](RouteTest.html)
4. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
5. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Specs2RouteTest toany2stringadd\[Specs2RouteTest] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
7. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Specs2RouteTest, B)ImplicitThis member is added by an implicit conversion from Specs2RouteTest toArrowAssoc\[Specs2RouteTest] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
8. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#Delete:RequestBuilding.this.RequestBuilder "Permalink")  val Delete: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
10. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#Get:RequestBuilding.this.RequestBuilder "Permalink")  val Get: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
11. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#Head:RequestBuilding.this.RequestBuilder "Permalink")  val Head: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
12. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#Options:RequestBuilding.this.RequestBuilder "Permalink")  val Options: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
13. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#Patch:RequestBuilding.this.RequestBuilder "Permalink")  val Patch: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
14. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#Post:RequestBuilding.this.RequestBuilder "Permalink")  val Post: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
15. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#Put:RequestBuilding.this.RequestBuilder "Permalink")  val Put: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
16. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#WS(uri:akka.http.scaladsl.model.Uri,clientSideHandler:akka.stream.scaladsl.Flow[akka.http.scaladsl.model.ws.Message,akka.http.scaladsl.model.ws.Message,Any],subprotocols:Seq[String])(implicitmaterializer:akka.stream.Materializer):akka.http.scaladsl.model.HttpRequest "Permalink")  def WS(uri: [Uri](../model/Uri.html), clientSideHandler: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[Message](../model/ws/Message.html), [Message](../model/ws/Message.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], subprotocols: Seq\[String] \= Nil)(implicit materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [HttpRequest](../model/HttpRequest.html)Definition Classes[WSTestRequestBuilding](WSTestRequestBuilding.html)Annotations@nowarn()
17. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#actorSystemNameFrom(clazz:Class[_]):String "Permalink")  def actorSystemNameFrom(clazz: Class\[\_]): StringDefinition Classes[RouteTest](RouteTest.html)
18. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#addAttribute[T](key:akka.http.scaladsl.model.AttributeKey[T],value:T):RequestBuilding.this.RequestTransformer "Permalink")  def addAttribute\[T](key: [AttributeKey](../model/AttributeKey.html)\[T], value: T): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
19. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#addCredentials(credentials:akka.http.scaladsl.model.headers.HttpCredentials):RequestBuilding.this.RequestTransformer "Permalink")  def addCredentials(credentials: [HttpCredentials](../model/headers/HttpCredentials.html)): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
20. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#addHeader(headerName:String,headerValue:String):RequestBuilding.this.RequestTransformer "Permalink")  def addHeader(headerName: String, headerValue: String): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
21. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#addHeader(header:akka.http.scaladsl.model.HttpHeader):RequestBuilding.this.RequestTransformer "Permalink")  def addHeader(header: [HttpHeader](../model/HttpHeader.html)): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
22. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#addHeaders(first:akka.http.scaladsl.model.HttpHeader,more:akka.http.scaladsl.model.HttpHeader*):RequestBuilding.this.RequestTransformer "Permalink")  def addHeaders(first: [HttpHeader](../model/HttpHeader.html), more: [HttpHeader](../model/HttpHeader.html)\*): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
23. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#afterAll():Unit "Permalink")  def afterAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[Specs2](Specs2FrameworkInterface$$Specs2.html) → AfterAll
24. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
25. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#charset:akka.http.scaladsl.model.HttpCharset "Permalink")  def charset: [HttpCharset](../model/HttpCharset.html)Definition Classes[RouteTest](RouteTest.html)
26. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#charsetOption:Option[akka.http.scaladsl.model.HttpCharset] "Permalink")  def charsetOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[HttpCharset](../model/HttpCharset.html)]Definition Classes[RouteTest](RouteTest.html)
27. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#check[T](body:=>T):RouteTest.this.RouteTestResult=>T "Permalink")  def check\[T](body: \=\> T): ([RouteTestResult](#RouteTestResultextendsAnyRef)) \=\> TDefinition Classes[RouteTest](RouteTest.html)
28. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#chunks:Seq[akka.http.scaladsl.model.HttpEntity.ChunkStreamPart] "Permalink")  def chunks: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ChunkStreamPart](../model/HttpEntity$$ChunkStreamPart.html)]Definition Classes[RouteTest](RouteTest.html)
29. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#chunksStream:akka.stream.scaladsl.Source[akka.http.scaladsl.model.HttpEntity.ChunkStreamPart,Any] "Permalink")  def chunksStream: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ChunkStreamPart](../model/HttpEntity$$ChunkStreamPart.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition Classes[RouteTest](RouteTest.html)
30. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#cleanUp():Unit "Permalink")  def cleanUp(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[RouteTest](RouteTest.html)
31. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
32. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#closingExtension:String "Permalink")  def closingExtension: StringDefinition Classes[RouteTest](RouteTest.html)
33. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#contentType:akka.http.scaladsl.model.ContentType "Permalink")  def contentType: [ContentType](../model/ContentType.html)Definition Classes[RouteTest](RouteTest.html)
34. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#createActorSystem():akka.actor.ActorSystem "Permalink")  def createActorSystem(): [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)Override to supply a custom ActorSystem

Override to supply a custom ActorSystem

Attributesprotected Definition Classes[RouteTest](RouteTest.html)
35. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#decorate(is:org.specs2.specification.core.SpecStructure,env:org.specs2.specification.core.Env):org.specs2.specification.core.SpecStructure "Permalink")  def decorate(is: [SpecStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecStructure.html#org.specs2.specification.core.SpecStructure), env: [Env](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Env.html#org.specs2.specification.core.Env)): [SpecStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecStructure.html#org.specs2.specification.core.SpecStructure)Definition ClassesSpecificationStructure
36. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Specs2RouteTest) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Specs2RouteTestImplicitThis member is added by an implicit conversion from Specs2RouteTest toEnsuring\[Specs2RouteTest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
37. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Specs2RouteTest) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Specs2RouteTestImplicitThis member is added by an implicit conversion from Specs2RouteTest toEnsuring\[Specs2RouteTest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
38. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Specs2RouteTestImplicitThis member is added by an implicit conversion from Specs2RouteTest toEnsuring\[Specs2RouteTest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
39. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Specs2RouteTestImplicitThis member is added by an implicit conversion from Specs2RouteTest toEnsuring\[Specs2RouteTest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
40. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#entityAs[T](implicitevidence$1:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T],implicitevidence$2:scala.reflect.ClassTag[T],implicittimeout:scala.concurrent.duration.Duration):T "Permalink")  def entityAs\[T](implicit arg0: [FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T], arg1: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], timeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 1\.second): TDefinition Classes[RouteTest](RouteTest.html)
41. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
42. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
43. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#evaluateTo[T](value:T)(implicitee:org.specs2.concurrent.ExecutionEnv):org.specs2.matcher.Matcher[scala.concurrent.Future[T]] "Permalink")  def evaluateTo\[T](value: T)(implicit ee: [ExecutionEnv](https://javadoc.io/page/org.specs2/specs2-common_2.13/4.10.6/org/specs2/concurrent/ExecutionEnv.html#org.specs2.concurrent.ExecutionEnv)): [Matcher](https://javadoc.io/page/org.specs2/specs2-matcher_2.13/4.10.6/org/specs2/matcher/Matcher.html#org.specs2.matcher.Matcher)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]]Definition Classes[Specs2Utils](Specs2Utils.html)
44. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#executor:scala.concurrent.ExecutionContextExecutor "Permalink") implicit  def executor: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)Definition Classes[RouteTest](RouteTest.html)
45. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#expectWebSocketUpgradeWithProtocol(body:String=>Unit):Unit "Permalink")  def expectWebSocketUpgradeWithProtocol(body: (String) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Asserts that the received response is a WebSocket upgrade response and the extracts
the chosen subprotocol and passes it to the handler.

Asserts that the received response is a WebSocket upgrade response and the extracts
the chosen subprotocol and passes it to the handler.

Definition Classes[RouteTest](RouteTest.html)
46. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#failTest(msg:String):Nothing "Permalink")  def failTest(msg: String): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition Classes[Specs2](Specs2FrameworkInterface$$Specs2.html) → [TestFrameworkInterface](TestFrameworkInterface.html)
47. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#fragmentFactory:org.specs2.specification.create.FragmentFactory "Permalink")  def fragmentFactory: [FragmentFactory](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/create/FragmentFactory.html#org.specs2.specification.create.FragmentFactory)Attributesprotected Definition ClassesFragmentsFactory
48. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#fragments:org.specs2.specification.core.Env=>org.specs2.specification.core.Fragments "Permalink")  def fragments: ([Env](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Env.html#org.specs2.specification.core.Env)) \=\> [Fragments](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Fragments.html#org.specs2.specification.core.Fragments)Definition ClassesContextualSpecificationStructure
49. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
50. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#handled:Boolean "Permalink")  def handled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[RouteTest](RouteTest.html)
51. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
52. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#haveFailedWith(t:Throwable)(implicitee:org.specs2.concurrent.ExecutionEnv):org.specs2.matcher.Matcher[scala.concurrent.Future[_]] "Permalink")  def haveFailedWith(t: Throwable)(implicit ee: [ExecutionEnv](https://javadoc.io/page/org.specs2/specs2-common_2.13/4.10.6/org/specs2/concurrent/ExecutionEnv.html#org.specs2.concurrent.ExecutionEnv)): [Matcher](https://javadoc.io/page/org.specs2/specs2-matcher_2.13/4.10.6/org/specs2/matcher/Matcher.html#org.specs2.matcher.Matcher)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[\_]]Definition Classes[Specs2Utils](Specs2Utils.html)
53. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#header(name:String):Option[akka.http.scaladsl.model.HttpHeader] "Permalink")  def header(name: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[HttpHeader](../model/HttpHeader.html)]Definition Classes[RouteTest](RouteTest.html)
54. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#header[T>:Null<:akka.http.scaladsl.model.HttpHeader](implicitevidence$5:scala.reflect.ClassTag[T]):Option[T] "Permalink")  def header\[T \>: Null \<: [HttpHeader](../model/HttpHeader.html)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]Definition Classes[RouteTest](RouteTest.html)
55. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#header2AddHeader(header:akka.http.scaladsl.model.HttpHeader):RequestBuilding.this.RequestTransformer "Permalink") implicit  def header2AddHeader(header: [HttpHeader](../model/HttpHeader.html)): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
56. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#headers:Seq[akka.http.scaladsl.model.HttpHeader] "Permalink")  def headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]Definition Classes[RouteTest](RouteTest.html)
57. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
58. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#isWebSocketUpgrade:Boolean "Permalink")  def isWebSocketUpgrade: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[RouteTest](RouteTest.html)
59. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#logRequest(logFun:akka.http.scaladsl.model.HttpRequest=>Unit):akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest "Permalink")  def logRequest(logFun: ([HttpRequest](../model/HttpRequest.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
60. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#logRequest(log:akka.event.LoggingAdapter,level:akka.event.Logging.LogLevel):akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest "Permalink")  def logRequest(log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), level: LogLevel \= [Logging.DebugLevel](../../../index.html)): ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
61. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#logValue[T](logFun:T=>Unit):T=>T "Permalink")  def logValue\[T](logFun: (T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): (T) \=\> TDefinition Classes[TransformerPipelineSupport](../client/TransformerPipelineSupport.html)
62. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#logValue[T](log:akka.event.LoggingAdapter,level:akka.event.Logging.LogLevel):T=>T "Permalink")  def logValue\[T](log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), level: LogLevel \= [Logging.DebugLevel](../../../index.html)): (T) \=\> TDefinition Classes[TransformerPipelineSupport](../client/TransformerPipelineSupport.html)
63. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#map(fs:=>org.specs2.specification.core.Fragments):org.specs2.specification.core.Fragments "Permalink")  def map(fs: \=\> [Fragments](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Fragments.html#org.specs2.specification.core.Fragments)): [Fragments](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Fragments.html#org.specs2.specification.core.Fragments)Definition ClassesAfterAll → SpecificationStructure
64. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#map(fs:=>org.specs2.specification.core.Fragments,env:org.specs2.specification.core.Env):org.specs2.specification.core.Fragments "Permalink")  def map(fs: \=\> [Fragments](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Fragments.html#org.specs2.specification.core.Fragments), env: [Env](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Env.html#org.specs2.specification.core.Env)): [Fragments](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Fragments.html#org.specs2.specification.core.Fragments)Definition ClassesSpecificationStructure
65. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#map(structure:org.specs2.specification.core.SpecStructure):org.specs2.specification.core.SpecStructure "Permalink")  def map(structure: [SpecStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecStructure.html#org.specs2.specification.core.SpecStructure)): [SpecStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecStructure.html#org.specs2.specification.core.SpecStructure)Definition ClassesSpecificationStructure
66. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#mapHeaders(f:Seq[akka.http.scaladsl.model.HttpHeader]=>Seq[akka.http.scaladsl.model.HttpHeader]):RequestBuilding.this.RequestTransformer "Permalink")  def mapHeaders(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]) \=\> [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
67. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#marshal[T](value:T)(implicitevidence$1:akka.http.scaladsl.marshalling.ToEntityMarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def marshal\[T](value: T)(implicit arg0: [ToEntityMarshaller](../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Strict](../model/HttpEntity$$Strict.html)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
68. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#marshalToResponse[T](value:T,request:akka.http.scaladsl.model.HttpRequest)(implicitevidence$3:akka.http.scaladsl.marshalling.ToResponseMarshaller[T],implicitec:scala.concurrent.ExecutionContext):akka.http.scaladsl.model.HttpResponse "Permalink")  def marshalToResponse\[T](value: T, request: [HttpRequest](../model/HttpRequest.html) \= [HttpRequest()](../../../index.html))(implicit arg0: [ToResponseMarshaller](../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [HttpResponse](../model/HttpResponse.html)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
69. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#marshalToResponseForRequestAccepting[T](value:T,mediaRanges:akka.http.scaladsl.model.MediaRange*)(implicitevidence$2:akka.http.scaladsl.marshalling.ToResponseMarshaller[T],implicitec:scala.concurrent.ExecutionContext):akka.http.scaladsl.model.HttpResponse "Permalink")  def marshalToResponseForRequestAccepting\[T](value: T, mediaRanges: [MediaRange](../model/MediaRange.html)\*)(implicit arg0: [ToResponseMarshaller](../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [HttpResponse](../model/HttpResponse.html)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
70. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#marshallingTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  def marshallingTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
71. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#materializer:akka.stream.Materializer "Permalink") implicit  val materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)Definition Classes[RouteTest](RouteTest.html)
72. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#mediaType:akka.http.scaladsl.model.MediaType "Permalink")  def mediaType: [MediaType](../model/MediaType.html)Definition Classes[RouteTest](RouteTest.html)
73. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
74. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
75. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
76. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#rejection:akka.http.scaladsl.server.Rejection "Permalink")  def rejection: [Rejection](../server/Rejection.html)Definition Classes[RouteTest](RouteTest.html)
77. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#rejections:Seq[akka.http.scaladsl.server.Rejection] "Permalink")  def rejections: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](../server/Rejection.html)]Definition Classes[RouteTest](RouteTest.html)
78. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#removeHeader(clazz:Class[_]):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeader(clazz: Class\[\_]): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
79. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#removeHeader[T<:akka.http.scaladsl.model.HttpHeader](implicitevidence$1:scala.reflect.ClassTag[T]):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeader\[T \<: [HttpHeader](../model/HttpHeader.html)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
80. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#removeHeader(headerName:String):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeader(headerName: String): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
81. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#removeHeaders(names:String*):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeaders(names: String\*): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](../client/RequestBuilding.html)
82. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#response:akka.http.scaladsl.model.HttpResponse "Permalink")  def response: [HttpResponse](../model/HttpResponse.html)Definition Classes[RouteTest](RouteTest.html)
83. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#responseAs[T](implicitevidence$3:akka.http.scaladsl.unmarshalling.FromResponseUnmarshaller[T],implicitevidence$4:scala.reflect.ClassTag[T],implicittimeout:scala.concurrent.duration.Duration):T "Permalink")  def responseAs\[T](implicit arg0: [FromResponseUnmarshaller](../unmarshalling/index.html#FromResponseUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpResponse,T])\[T], arg1: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], timeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 1\.second): TDefinition Classes[RouteTest](RouteTest.html)
84. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#responseEntity:akka.http.scaladsl.model.HttpEntity "Permalink")  def responseEntity: [HttpEntity](../model/HttpEntity.html)Definition Classes[RouteTest](RouteTest.html)
85. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#runRoute:RouteTest.this.RouteTestResult=>RouteTest.this.RouteTestResult "Permalink")  def runRoute: ([RouteTestResult](#RouteTestResultextendsAnyRef)) \=\> [RouteTestResult](#RouteTestResultextendsAnyRef)A dummy that can be used as `~> runRoute` to run the route but without blocking for the result.

A dummy that can be used as `~> runRoute` to run the route but without blocking for the result.
The result of the pipeline is the result that can later be checked with `check`. See the
"separate running route from checking" example from ScalatestRouteTestSpec.scala.

Definition Classes[RouteTest](RouteTest.html)
86. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#status:akka.http.scaladsl.model.StatusCode "Permalink")  def status: [StatusCode](../model/StatusCode.html)Definition Classes[RouteTest](RouteTest.html)
87. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#structure:org.specs2.specification.core.Env=>org.specs2.specification.core.SpecStructure "Permalink")  def structure: ([Env](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Env.html#org.specs2.specification.core.Env)) \=\> [SpecStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecStructure.html#org.specs2.specification.core.SpecStructure)Definition ClassesSpecificationStructure → ContextualSpecificationStructure
88. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
89. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#system:akka.actor.ActorSystem "Permalink") implicit  val system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)Definition Classes[RouteTest](RouteTest.html)
90. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#testConfig:com.typesafe.config.Config "Permalink")  def testConfig: [Config](https://javadoc.io/page/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config)Definition Classes[RouteTest](RouteTest.html) → [MarshallingTestUtils](MarshallingTestUtils.html)
91. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#testConfigSource:String "Permalink")  def testConfigSource: StringDefinition Classes[RouteTest](RouteTest.html)
92. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#testExceptionHandler:akka.http.scaladsl.server.ExceptionHandler "Permalink")  val testExceptionHandler: [ExceptionHandler](../server/ExceptionHandler.html)Definition Classes[Specs2](Specs2FrameworkInterface$$Specs2.html) → [TestFrameworkInterface](TestFrameworkInterface.html)
93. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
94. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#trailer:Seq[akka.http.scaladsl.model.HttpHeader] "Permalink")  def trailer: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]Definition Classes[RouteTest](RouteTest.html)
95. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#unmarshal[T](entity:akka.http.scaladsl.model.HttpEntity)(implicitevidence$5:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):scala.util.Try[T] "Permalink")  def unmarshal\[T](entity: [HttpEntity](../model/HttpEntity.html))(implicit arg0: [FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T]Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
96. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#unmarshalTo[T](value:scala.util.Try[T])(implicitevidence$2:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):org.specs2.matcher.Matcher[akka.http.scaladsl.model.HttpEntity] "Permalink")  def unmarshalTo\[T](value: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T])(implicit arg0: [FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Matcher](https://javadoc.io/page/org.specs2/specs2-matcher_2.13/4.10.6/org/specs2/matcher/Matcher.html#org.specs2.matcher.Matcher)\[[HttpEntity](../model/HttpEntity.html)]Definition Classes[Specs2Utils](Specs2Utils.html)
97. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#unmarshalToValue[T](value:T)(implicitevidence$1:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):org.specs2.matcher.Matcher[akka.http.scaladsl.model.HttpEntity] "Permalink")  def unmarshalToValue\[T](value: T)(implicit arg0: [FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Matcher](https://javadoc.io/page/org.specs2/specs2-matcher_2.13/4.10.6/org/specs2/matcher/Matcher.html#org.specs2.matcher.Matcher)\[[HttpEntity](../model/HttpEntity.html)]Definition Classes[Specs2Utils](Specs2Utils.html)
98. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#unmarshalValue[T](entity:akka.http.scaladsl.model.HttpEntity)(implicitevidence$4:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):T "Permalink")  def unmarshalValue\[T](entity: [HttpEntity](../model/HttpEntity.html))(implicit arg0: [FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): TDefinition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
99. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
100. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
101. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#~>[B](f:A=>B):B "Permalink")  def \~\>\[B](f: (Specs2RouteTest) \=\> B): BImplicitThis member is added by an implicit conversion from Specs2RouteTest to[client.RequestBuilding.WithTransformation](../client/RequestBuilding$.html#WithTransformation[A]extendsAnyRef)\[Specs2RouteTest] performed by method WithTransformation in [akka.http.scaladsl.client.TransformerPipelineSupport](../client/TransformerPipelineSupport.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(specs2RouteTest: client.RequestBuilding.WithTransformation[Specs2RouteTest]).~>(f)
```
Definition Classes[WithTransformation](../client/TransformerPipelineSupport$WithTransformation.html)
2. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#~>[B](f:A=>B):B "Permalink")  def \~\>\[B](f: (Specs2RouteTest) \=\> B): BImplicitThis member is added by an implicit conversion from Specs2RouteTest to[client.TransformerPipelineSupport.WithTransformation](../client/TransformerPipelineSupport$.html#WithTransformation[A]extendsAnyRef)\[Specs2RouteTest] performed by method WithTransformation in [akka.http.scaladsl.client.TransformerPipelineSupport](../client/TransformerPipelineSupport.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(specs2RouteTest: client.TransformerPipelineSupport.WithTransformation[Specs2RouteTest]).~>(f)
```
Definition Classes[WithTransformation](../client/TransformerPipelineSupport$WithTransformation.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Specs2RouteTest toStringFormat\[Specs2RouteTest] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Specs2RouteTest, B)ImplicitThis member is added by an implicit conversion from Specs2RouteTest toArrowAssoc\[Specs2RouteTest] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Specs2Utils](Specs2Utils.html)

### Inherited from [Specs2](Specs2FrameworkInterface$$Specs2.html)

### Inherited from [AfterAll](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/AfterAll.html#org.specs2.specification.AfterAll)

### Inherited from [FragmentsFactory](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/create/FragmentsFactory.html#org.specs2.specification.create.FragmentsFactory)

### Inherited from [SpecificationStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecificationStructure.html#org.specs2.specification.core.SpecificationStructure)

### Inherited from [ContextualSpecificationStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/ContextualSpecificationStructure.html#org.specs2.specification.core.ContextualSpecificationStructure)

### Inherited from [TestFrameworkInterface](TestFrameworkInterface.html)

### Inherited from [RouteTest](RouteTest.html)

### Inherited from [MarshallingTestUtils](MarshallingTestUtils.html)

### Inherited from [RouteTestResultComponent](RouteTestResultComponent.html)

### Inherited from [WSTestRequestBuilding](WSTestRequestBuilding.html)

### Inherited from [RequestBuilding](../client/RequestBuilding.html)

### Inherited from [TransformerPipelineSupport](../client/TransformerPipelineSupport.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion WithTransformation fromSpecs2RouteTest to [client.RequestBuilding.WithTransformation](../client/RequestBuilding$.html#WithTransformation[A]extendsAnyRef)\[Specs2RouteTest]

### Inherited by implicit conversion WithTransformation fromSpecs2RouteTest to [client.TransformerPipelineSupport.WithTransformation](../client/TransformerPipelineSupport$.html#WithTransformation[A]extendsAnyRef)\[Specs2RouteTest]

### Inherited by implicit conversion any2stringadd fromSpecs2RouteTest to any2stringadd\[Specs2RouteTest]

### Inherited by implicit conversion StringFormat fromSpecs2RouteTest to StringFormat\[Specs2RouteTest]

### Inherited by implicit conversion Ensuring fromSpecs2RouteTest to Ensuring\[Specs2RouteTest]

### Inherited by implicit conversion ArrowAssoc fromSpecs2RouteTest to ArrowAssoc\[Specs2RouteTest]

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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2RouteTest.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2RouteTest.html)*