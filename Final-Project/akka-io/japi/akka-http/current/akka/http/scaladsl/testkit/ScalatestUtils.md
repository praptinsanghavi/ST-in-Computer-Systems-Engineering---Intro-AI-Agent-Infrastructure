---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/ScalatestUtils.html
title: ScalatestUtils
---

# ScalatestUtils

## Content

Package [akka.http.scaladsl.testkit](package-summary.html)
## Interface ScalatestUtils

- All Superinterfaces:
`[MarshallingTestUtils](MarshallingTestUtils.html "interface in akka.http.scaladsl.testkit")`

All Known Subinterfaces:
`[ScalatestRouteTest](ScalatestRouteTest.html "interface in akka.http.scaladsl.testkit")`

---

```
public interface ScalatestUtils
extends [MarshallingTestUtils](MarshallingTestUtils.html "interface in akka.http.scaladsl.testkit")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> org.scalatest.matchers.Matcher<scala.concurrent.Future<T>>` | `[evaluateTo](#evaluateTo(T))​(T value)` |  |
	| `org.scalatest.matchers.Matcher<scala.concurrent.Future<?>>` | `[haveFailedWith](#haveFailedWith(java.lang.Throwable))​(java.lang.Throwable t)` |  |
	| `<T> org.scalatest.matchers.Matcher<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model")>` | `[unmarshalTo](#unmarshalTo(scala.util.Try,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer))​(scala.util.Try<T> value,  [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> evidence$2,  scala.concurrent.ExecutionContext ec,  akka.stream.Materializer mat)` |  |
	| `<T> org.scalatest.matchers.Matcher<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model")>` | `[unmarshalToValue](#unmarshalToValue(T,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer))​(T value,  [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> evidence$1,  scala.concurrent.ExecutionContext ec,  akka.stream.Materializer mat)` |  |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.testkit.[MarshallingTestUtils](MarshallingTestUtils.html "interface in akka.http.scaladsl.testkit")
		
		
		`[marshal](MarshallingTestUtils.html#marshal(T,akka.http.scaladsl.marshalling.Marshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer)), [marshallingTimeout](MarshallingTestUtils.html#marshallingTimeout()), [marshalToResponse](MarshallingTestUtils.html#marshalToResponse(T,akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.marshalling.Marshaller,scala.concurrent.ExecutionContext)), [marshalToResponseForRequestAccepting](MarshallingTestUtils.html#marshalToResponseForRequestAccepting(T,scala.collection.immutable.Seq,akka.http.scaladsl.marshalling.Marshaller,scala.concurrent.ExecutionContext)), [testConfig](MarshallingTestUtils.html#testConfig()), [unmarshal](MarshallingTestUtils.html#unmarshal(akka.http.scaladsl.model.HttpEntity,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer)), [unmarshalValue](MarshallingTestUtils.html#unmarshalValue(akka.http.scaladsl.model.HttpEntity,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer))`

- - ### Method Detail
	
	
	
		- #### evaluateTo
		
		
		
		```
		<T> org.scalatest.matchers.Matcher<scala.concurrent.Future<T>> evaluateTo​(T value)
		```
		- #### haveFailedWith
		
		
		
		```
		org.scalatest.matchers.Matcher<scala.concurrent.Future<?>> haveFailedWith​(java.lang.Throwable t)
		```
		- #### unmarshalTo
		
		
		
		```
		<T> org.scalatest.matchers.Matcher<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model")> unmarshalTo​(scala.util.Try<T> value,
		                                                           [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> evidence$2,
		                                                           scala.concurrent.ExecutionContext ec,
		                                                           akka.stream.Materializer mat)
		```
		- #### unmarshalToValue
		
		
		
		```
		<T> org.scalatest.matchers.Matcher<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model")> unmarshalToValue​(T value,
		                                                                [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> evidence$1,
		                                                                scala.concurrent.ExecutionContext ec,
		                                                                akka.stream.Materializer mat)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/MarshallingTestUtils.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/ScalatestRouteTest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/ScalatestUtils.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/ScalatestUtils.html)*