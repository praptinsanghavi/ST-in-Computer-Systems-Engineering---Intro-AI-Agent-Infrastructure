---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/ScalatestRouteTest.html
title: ScalatestRouteTest
---

# ScalatestRouteTest

## Content

Package [akka.http.scaladsl.testkit](package-summary.html)
## Interface ScalatestRouteTest

- All Superinterfaces:
`org.scalatest.BeforeAndAfterAll`, `[MarshallingTestUtils](MarshallingTestUtils.html "interface in akka.http.scaladsl.testkit")`, `[RequestBuilding](../client/RequestBuilding.html "interface in akka.http.scaladsl.client")`, `[RouteTest](RouteTest.html "interface in akka.http.scaladsl.testkit")`, `[RouteTestResultComponent](RouteTestResultComponent.html "interface in akka.http.scaladsl.testkit")`, `[ScalatestUtils](ScalatestUtils.html "interface in akka.http.scaladsl.testkit")`, `org.scalatest.SuiteMixin`, `[TestFrameworkInterface](TestFrameworkInterface.html "interface in akka.http.scaladsl.testkit")`, `[TestFrameworkInterface.Scalatest](TestFrameworkInterface.Scalatest.html "interface in akka.http.scaladsl.testkit")`, `[TransformerPipelineSupport](../client/TransformerPipelineSupport.html "interface in akka.http.scaladsl.client")`, `[WSTestRequestBuilding](WSTestRequestBuilding.html "interface in akka.http.scaladsl.testkit")`

---

```
public interface ScalatestRouteTest
extends [RouteTest](RouteTest.html "interface in akka.http.scaladsl.testkit"), [TestFrameworkInterface.Scalatest](TestFrameworkInterface.Scalatest.html "interface in akka.http.scaladsl.testkit"), [ScalatestUtils](ScalatestUtils.html "interface in akka.http.scaladsl.testkit")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.client.[RequestBuilding](../client/RequestBuilding.html "interface in akka.http.scaladsl.client")
		
		
		`[RequestBuilding.RequestBuilder](../client/RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.testkit.[RouteTest](RouteTest.html "interface in akka.http.scaladsl.testkit")
		
		
		`[RouteTest.DefaultHostInfo](RouteTest.DefaultHostInfo.html "class in akka.http.scaladsl.testkit"), [RouteTest.DefaultHostInfo$](RouteTest.DefaultHostInfo$.html "class in akka.http.scaladsl.testkit"), [RouteTest.TildeArrow](RouteTest.TildeArrow.html "class in akka.http.scaladsl.testkit")<[A](RouteTest.TildeArrow.html "type parameter in RouteTest.TildeArrow"),​[B](RouteTest.TildeArrow.html "type parameter in RouteTest.TildeArrow")>, [RouteTest.TildeArrow$](RouteTest.TildeArrow$.html "class in akka.http.scaladsl.testkit"), [RouteTest.TildeBangArrow](RouteTest.TildeBangArrow.html "class in akka.http.scaladsl.testkit")<[A](RouteTest.TildeBangArrow.html "type parameter in RouteTest.TildeBangArrow"),​[B](RouteTest.TildeBangArrow.html "type parameter in RouteTest.TildeBangArrow")>, [RouteTest.TildeBangArrow$](RouteTest.TildeBangArrow$.html "class in akka.http.scaladsl.testkit"), [RouteTest.WithTransformation2](RouteTest.WithTransformation2.html "class in akka.http.scaladsl.testkit")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.testkit.[RouteTestResultComponent](RouteTestResultComponent.html "interface in akka.http.scaladsl.testkit")
		
		
		`[RouteTestResultComponent.RouteTestResult](RouteTestResultComponent.RouteTestResult.html "class in akka.http.scaladsl.testkit")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.testkit.[TestFrameworkInterface](TestFrameworkInterface.html "interface in akka.http.scaladsl.testkit")
		
		
		`[TestFrameworkInterface.Scalatest](TestFrameworkInterface.Scalatest.html "interface in akka.http.scaladsl.testkit")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.client.[TransformerPipelineSupport](../client/TransformerPipelineSupport.html "interface in akka.http.scaladsl.client")
		
		
		`[TransformerPipelineSupport.WithTransformation](../client/TransformerPipelineSupport.WithTransformation.html "class in akka.http.scaladsl.client")<[A](../client/TransformerPipelineSupport.WithTransformation.html "type parameter in TransformerPipelineSupport.WithTransformation")>, [TransformerPipelineSupport.WithTransformerConcatenation](../client/TransformerPipelineSupport.WithTransformerConcatenation.html "class in akka.http.scaladsl.client")<[A](../client/TransformerPipelineSupport.WithTransformerConcatenation.html "type parameter in TransformerPipelineSupport.WithTransformerConcatenation"),​[B](../client/TransformerPipelineSupport.WithTransformerConcatenation.html "type parameter in TransformerPipelineSupport.WithTransformerConcatenation")>`

	- ### Method Summary
	
	
		- ### Methods inherited from interface org.scalatest.BeforeAndAfterAll
		
		
		`beforeAll, invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected, org$scalatest$BeforeAndAfterAll$_setter_$invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected_$eq, run`
		- ### Methods inherited from interface akka.http.scaladsl.testkit.[MarshallingTestUtils](MarshallingTestUtils.html "interface in akka.http.scaladsl.testkit")
		
		
		`[marshal](MarshallingTestUtils.html#marshal(T,akka.http.scaladsl.marshalling.Marshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer)), [marshallingTimeout](MarshallingTestUtils.html#marshallingTimeout()), [marshalToResponse](MarshallingTestUtils.html#marshalToResponse(T,akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.marshalling.Marshaller,scala.concurrent.ExecutionContext)), [marshalToResponseForRequestAccepting](MarshallingTestUtils.html#marshalToResponseForRequestAccepting(T,scala.collection.immutable.Seq,akka.http.scaladsl.marshalling.Marshaller,scala.concurrent.ExecutionContext)), [unmarshal](MarshallingTestUtils.html#unmarshal(akka.http.scaladsl.model.HttpEntity,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer)), [unmarshalValue](MarshallingTestUtils.html#unmarshalValue(akka.http.scaladsl.model.HttpEntity,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer))`
		- ### Methods inherited from interface akka.http.scaladsl.client.[RequestBuilding](../client/RequestBuilding.html "interface in akka.http.scaladsl.client")
		
		
		`[addAttribute](../client/RequestBuilding.html#addAttribute(akka.http.scaladsl.model.AttributeKey,T)), [addCredentials](../client/RequestBuilding.html#addCredentials(akka.http.scaladsl.model.headers.HttpCredentials)), [addHeader](../client/RequestBuilding.html#addHeader(akka.http.scaladsl.model.HttpHeader)), [addHeader](../client/RequestBuilding.html#addHeader(java.lang.String,java.lang.String)), [addHeaders](../client/RequestBuilding.html#addHeaders(akka.http.scaladsl.model.HttpHeader,scala.collection.immutable.Seq)), [Delete](../client/RequestBuilding.html#Delete()), [Get](../client/RequestBuilding.html#Get()), [Head](../client/RequestBuilding.html#Head()), [header2AddHeader](../client/RequestBuilding.html#header2AddHeader(akka.http.scaladsl.model.HttpHeader)), [logRequest](../client/RequestBuilding.html#logRequest(akka.event.LoggingAdapter,akka.event.Logging.LogLevel)), [logRequest](../client/RequestBuilding.html#logRequest(scala.Function1)), [mapHeaders](../client/RequestBuilding.html#mapHeaders(scala.Function1)), [Options](../client/RequestBuilding.html#Options()), [Patch](../client/RequestBuilding.html#Patch()), [Post](../client/RequestBuilding.html#Post()), [Put](../client/RequestBuilding.html#Put()), [removeHeader](../client/RequestBuilding.html#removeHeader(java.lang.Class)), [removeHeader](../client/RequestBuilding.html#removeHeader(java.lang.String)), [removeHeader](../client/RequestBuilding.html#removeHeader(scala.reflect.ClassTag)), [removeHeaders](../client/RequestBuilding.html#removeHeaders(scala.collection.immutable.Seq))`
		- ### Methods inherited from interface akka.http.scaladsl.testkit.[RouteTest](RouteTest.html "interface in akka.http.scaladsl.testkit")
		
		
		`[actorSystemNameFrom](RouteTest.html#actorSystemNameFrom(java.lang.Class)), [charset](RouteTest.html#charset()), [charsetOption](RouteTest.html#charsetOption()), [check](RouteTest.html#check(scala.Function0)), [chunks](RouteTest.html#chunks()), [chunksStream](RouteTest.html#chunksStream()), [cleanUp](RouteTest.html#cleanUp()), [closingExtension](RouteTest.html#closingExtension()), [contentType](RouteTest.html#contentType()), [createActorSystem](RouteTest.html#createActorSystem()), [DefaultHostInfo](RouteTest.html#DefaultHostInfo()), [entityAs](RouteTest.html#entityAs(akka.http.scaladsl.unmarshalling.Unmarshaller,scala.reflect.ClassTag,scala.concurrent.duration.Duration)), [executor](RouteTest.html#executor()), [expectWebSocketUpgradeWithProtocol](RouteTest.html#expectWebSocketUpgradeWithProtocol(scala.Function1)), [handled](RouteTest.html#handled()), [header](RouteTest.html#header(java.lang.String)), [header](RouteTest.html#header(scala.reflect.ClassTag)), [headers](RouteTest.html#headers()), [isWebSocketUpgrade](RouteTest.html#isWebSocketUpgrade()), [materializer](RouteTest.html#materializer()), [mediaType](RouteTest.html#mediaType()), [rawResponse](RouteTest.html#rawResponse()), [rejection](RouteTest.html#rejection()), [rejections](RouteTest.html#rejections()), [response](RouteTest.html#response()), [responseAs](RouteTest.html#responseAs(akka.http.scaladsl.unmarshalling.Unmarshaller,scala.reflect.ClassTag,scala.concurrent.duration.Duration)), [responseEntity](RouteTest.html#responseEntity()), [responseSafe](RouteTest.html#responseSafe()), [result](RouteTest.html#result()), [runRoute](RouteTest.html#runRoute()), [status](RouteTest.html#status()), [system](RouteTest.html#system()), [testConfig](RouteTest.html#testConfig()), [testConfigSource](RouteTest.html#testConfigSource()), [TildeArrow](RouteTest.html#TildeArrow()), [TildeBangArrow](RouteTest.html#TildeBangArrow()), [trailer](RouteTest.html#trailer())`
		- ### Methods inherited from interface akka.http.scaladsl.testkit.[RouteTestResultComponent](RouteTestResultComponent.html "interface in akka.http.scaladsl.testkit")
		
		
		`[failTest](RouteTestResultComponent.html#failTest(java.lang.String))`
		- ### Methods inherited from interface akka.http.scaladsl.testkit.[ScalatestUtils](ScalatestUtils.html "interface in akka.http.scaladsl.testkit")
		
		
		`[evaluateTo](ScalatestUtils.html#evaluateTo(T)), [haveFailedWith](ScalatestUtils.html#haveFailedWith(java.lang.Throwable)), [unmarshalTo](ScalatestUtils.html#unmarshalTo(scala.util.Try,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer)), [unmarshalToValue](ScalatestUtils.html#unmarshalToValue(T,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer))`
		- ### Methods inherited from interface org.scalatest.SuiteMixin
		
		
		`expectedTestCount, nestedSuites, rerunner, runNestedSuites, runTest, runTests, styleName, suiteId, suiteName, tags, testDataFor, testNames`
		- ### Methods inherited from interface akka.http.scaladsl.testkit.[TestFrameworkInterface](TestFrameworkInterface.html "interface in akka.http.scaladsl.testkit")
		
		
		`[cleanUp](TestFrameworkInterface.html#cleanUp())`
		- ### Methods inherited from interface akka.http.scaladsl.testkit.[TestFrameworkInterface.Scalatest](TestFrameworkInterface.Scalatest.html "interface in akka.http.scaladsl.testkit")
		
		
		`[afterAll](TestFrameworkInterface.Scalatest.html#afterAll()), [failTest](TestFrameworkInterface.Scalatest.html#failTest(java.lang.String)), [testExceptionHandler](TestFrameworkInterface.Scalatest.html#testExceptionHandler())`
		- ### Methods inherited from interface akka.http.scaladsl.client.[TransformerPipelineSupport](../client/TransformerPipelineSupport.html "interface in akka.http.scaladsl.client")
		
		
		`[logValue](../client/TransformerPipelineSupport.html#logValue(akka.event.LoggingAdapter,akka.event.Logging.LogLevel)), [logValue](../client/TransformerPipelineSupport.html#logValue(scala.Function1))`
		- ### Methods inherited from interface akka.http.scaladsl.testkit.[WSTestRequestBuilding](WSTestRequestBuilding.html "interface in akka.http.scaladsl.testkit")
		
		
		`[WS](WSTestRequestBuilding.html#WS(akka.http.scaladsl.model.Uri,akka.stream.scaladsl.Flow,scala.collection.immutable.Seq,akka.stream.Materializer))`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/RequestBuilding.RequestBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/RequestBuilding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport.WithTransformation.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport.WithTransformerConcatenation.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/MarshallingTestUtils.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest.DefaultHostInfo$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest.DefaultHostInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest.TildeArrow$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest.TildeArrow.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest.TildeBangArrow$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest.TildeBangArrow.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest.WithTransformation2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTestResultComponent.RouteTestResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTestResultComponent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/ScalatestUtils.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface.Scalatest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/ScalatestRouteTest.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/ScalatestRouteTest.html)*