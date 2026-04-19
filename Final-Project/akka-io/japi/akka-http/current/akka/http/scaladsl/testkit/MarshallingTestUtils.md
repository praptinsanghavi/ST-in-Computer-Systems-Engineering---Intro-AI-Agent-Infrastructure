---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/MarshallingTestUtils.html
title: MarshallingTestUtils
---

# MarshallingTestUtils

## Content

Package [akka.http.scaladsl.testkit](package-summary.html)
## Interface MarshallingTestUtils

- All Known Subinterfaces:
`[RouteTest](RouteTest.html "interface in akka.http.scaladsl.testkit")`, `[ScalatestRouteTest](ScalatestRouteTest.html "interface in akka.http.scaladsl.testkit")`, `[ScalatestUtils](ScalatestUtils.html "interface in akka.http.scaladsl.testkit")`, `[Specs2RouteTest](Specs2RouteTest.html "interface in akka.http.scaladsl.testkit")`, `[Specs2Utils](Specs2Utils.html "interface in akka.http.scaladsl.testkit")`

---

```
public interface MarshallingTestUtils
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> [HttpEntity.Strict](../model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[marshal](#marshal(T,akka.http.scaladsl.marshalling.Marshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer))​(T value,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> evidence$1,  scala.concurrent.ExecutionContext ec,  akka.stream.Materializer mat)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[marshallingTimeout](#marshallingTimeout())()` |  |
	| `<T> [HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")` | `[marshalToResponse](#marshalToResponse(T,akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.marshalling.Marshaller,scala.concurrent.ExecutionContext))​(T value,  [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> evidence$3,  scala.concurrent.ExecutionContext ec)` |  |
	| `<T> [HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")` | `[marshalToResponseForRequestAccepting](#marshalToResponseForRequestAccepting(T,scala.collection.immutable.Seq,akka.http.scaladsl.marshalling.Marshaller,scala.concurrent.ExecutionContext))​(T value,  scala.collection.immutable.Seq<[MediaRange](../model/MediaRange.html "class in akka.http.scaladsl.model")> mediaRanges,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> evidence$2,  scala.concurrent.ExecutionContext ec)` |  |
	| `com.typesafe.config.Config` | `[testConfig](#testConfig())()` |  |
	| `<T> scala.util.Try<T>` | `[unmarshal](#unmarshal(akka.http.scaladsl.model.HttpEntity,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer))​([HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model") entity,  [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> evidence$5,  scala.concurrent.ExecutionContext ec,  akka.stream.Materializer mat)` |  |
	| `<T> T` | `[unmarshalValue](#unmarshalValue(akka.http.scaladsl.model.HttpEntity,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer))​([HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model") entity,  [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> evidence$4,  scala.concurrent.ExecutionContext ec,  akka.stream.Materializer mat)` |  |

- - ### Method Detail
	
	
	
		- #### marshal
		
		
		
		```
		<T> [HttpEntity.Strict](../model/HttpEntity.Strict.html "class in akka.http.scaladsl.model") marshal​(T value,
		                              [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> evidence$1,
		                              scala.concurrent.ExecutionContext ec,
		                              akka.stream.Materializer mat)
		```
		- #### marshalToResponse
		
		
		
		```
		<T> [HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model") marshalToResponse​(T value,
		                                   [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request,
		                                   [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> evidence$3,
		                                   scala.concurrent.ExecutionContext ec)
		```
		- #### marshalToResponseForRequestAccepting
		
		
		
		```
		<T> [HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model") marshalToResponseForRequestAccepting​(T value,
		                                                      scala.collection.immutable.Seq<[MediaRange](../model/MediaRange.html "class in akka.http.scaladsl.model")> mediaRanges,
		                                                      [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> evidence$2,
		                                                      scala.concurrent.ExecutionContext ec)
		```
		- #### marshallingTimeout
		
		
		
		```
		scala.concurrent.duration.FiniteDuration marshallingTimeout()
		```
		- #### testConfig
		
		
		
		```
		com.typesafe.config.Config testConfig()
		```
		- #### unmarshal
		
		
		
		```
		<T> scala.util.Try<T> unmarshal​([HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model") entity,
		                                [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> evidence$5,
		                                scala.concurrent.ExecutionContext ec,
		                                akka.stream.Materializer mat)
		```
		- #### unmarshalValue
		
		
		
		```
		<T> T unmarshalValue​([HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model") entity,
		                     [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> evidence$4,
		                     scala.concurrent.ExecutionContext ec,
		                     akka.stream.Materializer mat)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/ScalatestRouteTest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/ScalatestUtils.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/Specs2RouteTest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/Specs2Utils.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/MarshallingTestUtils.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/MarshallingTestUtils.html)*