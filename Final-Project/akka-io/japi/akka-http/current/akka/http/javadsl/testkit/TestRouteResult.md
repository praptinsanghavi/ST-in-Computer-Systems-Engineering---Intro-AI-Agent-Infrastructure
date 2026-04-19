---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/TestRouteResult.html
title: TestRouteResult
---

# TestRouteResult

## Content

Package [akka.http.javadsl.testkit](package-summary.html)
## Class TestRouteResult

- java.lang.Object
- - akka.http.javadsl.testkit.TestRouteResult

- ---

```
public abstract class TestRouteResult
extends java.lang.Object
```

A wrapper for route results.
 
 To support the testkit API, a third\-party testing library needs to implement this class and provide
 implementations for the abstract assertion methods.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestRouteResult](#%3Cinit%3E(scala.concurrent.Future,scala.concurrent.duration.FiniteDuration,scala.concurrent.ExecutionContext,akka.stream.Materializer))​(scala.concurrent.Future<[RouteResult](../server/RouteResult.html "interface in akka.http.javadsl.server")> _result,  scala.concurrent.duration.FiniteDuration awaitAtMost,  scala.concurrent.ExecutionContext ec,  akka.stream.Materializer materializer)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertContentType](#assertContentType(akka.http.javadsl.model.ContentType))​([ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") expected)` | Assert on the content type of the response. |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertContentType](#assertContentType(java.lang.String))​(java.lang.String expected)` | Assert on the content type of the response. |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertEntity](#assertEntity(java.lang.String))​(java.lang.String expected)` | Assert on the response entity to be a UTF8 representation of the given string. |
	| `<T> [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertEntityAs](#assertEntityAs(akka.http.javadsl.unmarshalling.Unmarshaller,T))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​T> unmarshaller,  T expected)` | Assert on the response entity to equal the given object after applying an [`Unmarshaller`](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling"). |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertEntityBytes](#assertEntityBytes(akka.util.ByteString))​(akka.util.ByteString expected)` | Assert on the response entity to equal the given bytes. |
	| `protected abstract void` | `[assertEquals](#assertEquals(int,int,java.lang.String))​(int expected,  int actual,  java.lang.String message)` |  |
	| `protected abstract void` | `[assertEquals](#assertEquals(java.lang.Object,java.lang.Object,java.lang.String))​(java.lang.Object expected,  java.lang.Object actual,  java.lang.String message)` |  |
	| `protected [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertEqualsKind](#assertEqualsKind(int,int,java.lang.String))​(int expected,  int actual,  java.lang.String kind)` |  |
	| `protected [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertEqualsKind](#assertEqualsKind(java.lang.Object,java.lang.Object,java.lang.String))​(java.lang.Object expected,  java.lang.Object actual,  java.lang.String kind)` |  |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertHeaderExists](#assertHeaderExists(akka.http.javadsl.model.HttpHeader))​([HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model") expected)` | Assert that a given header instance exists in the response. |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertHeaderExists](#assertHeaderExists(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` | Assert that a header of the given name and value exists. |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertHeaderKindExists](#assertHeaderKindExists(java.lang.String))​(java.lang.String name)` | Assert that a header of the given type exists. |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertHeaderKindNotExists](#assertHeaderKindNotExists(java.lang.String))​(java.lang.String name)` | Assert that a header of the given type does not exist. |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertMediaType](#assertMediaType(akka.http.javadsl.model.MediaType))​([MediaType](../model/MediaType.html "interface in akka.http.javadsl.model") expected)` | Assert on the media type of the response. |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertMediaType](#assertMediaType(java.lang.String))​(java.lang.String expected)` | Assert on the media type of the response. |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertRejections](#assertRejections(akka.http.javadsl.server.Rejection...))​([Rejection](../server/Rejection.html "interface in akka.http.javadsl.server")... expectedRejections)` | Assert that a given header instance exists in the response. |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertRejections](#assertRejections(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Rejection](../server/Rejection.html "interface in akka.http.javadsl.server")> expectedRejections)` |  |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertStatusCode](#assertStatusCode(int))​(int expected)` | Assert on the numeric status code. |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[assertStatusCode](#assertStatusCode(akka.http.javadsl.model.StatusCode))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") expected)` | Assert on the status code. |
	| `protected abstract void` | `[assertTrue](#assertTrue(boolean,java.lang.String))​(boolean predicate,  java.lang.String message)` |  |
	| `[ContentType](../model/ContentType.html "interface in akka.http.javadsl.model")` | `[contentType](#contentType())()` | Returns the response's content\-type |
	| `java.lang.String` | `[contentTypeString](#contentTypeString())()` | Returns a string representation of the response's content\-type |
	| `[HttpEntity.Strict](../model/HttpEntity.Strict.html "interface in akka.http.javadsl.model")` | `[entity](#entity())()` |  |
	| `<T> T` | `[entity](#entity(akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​T> unmarshaller)` | Returns the entity of the response unmarshalled with the given Unmarshaller. |
	| `akka.util.ByteString` | `[entityBytes](#entityBytes())()` | Returns the bytes of the response entity |
	| `java.lang.String` | `[entityString](#entityString())()` | Returns the entity of the response interpreted as an UTF\-8 encoded string. |
	| `protected abstract void` | `[fail](#fail(java.lang.String))​(java.lang.String message)` |  |
	| `<T extends [HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")>T` | `[header](#header(java.lang.Class))​(java.lang.Class<T> clazz)` | Returns the first header of the response which is of the given class. |
	| `[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")` | `[mediaType](#mediaType())()` | Returns the media\-type of the the response's content\-type |
	| `java.lang.String` | `[mediaTypeString](#mediaTypeString())()` | Returns a string representation of the media\-type of the response's content\-type |
	| `[Rejection](../server/Rejection.html "interface in akka.http.javadsl.server")` | `[rejection](#rejection())()` | Expects the route to have been rejected with a single rejection. |
	| `java.util.List<[Rejection](../server/Rejection.html "interface in akka.http.javadsl.server")>` | `[rejections](#rejections())()` | Expects the route to have been rejected, returning the list of rejections, or empty list if the route  was rejected with an empty rejection list. |
	| `[HttpResponse](../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")` | `[response](#response())()` |  |
	| `[StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model")` | `[status](#status())()` | Returns the [`StatusCode`](../model/StatusCode.html "class in akka.http.javadsl.model") of the response. |
	| `int` | `[statusCode](#statusCode())()` | Returns the numeric status code of the response. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestRouteResult
		
		
		
		```
		public TestRouteResult​(scala.concurrent.Future<[RouteResult](../server/RouteResult.html "interface in akka.http.javadsl.server")> _result,
		                       scala.concurrent.duration.FiniteDuration awaitAtMost,
		                       scala.concurrent.ExecutionContext ec,
		                       akka.stream.Materializer materializer)
		```

	- ### Method Detail
	
	
	
		- #### assertContentType
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertContentType​(java.lang.String expected)
		```
		
		Assert on the content type of the response.
		
		Parameters:
		`expected` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertContentType
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertContentType​([ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") expected)
		```
		
		Assert on the content type of the response.
		
		Parameters:
		`expected` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertEntity
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertEntity​(java.lang.String expected)
		```
		
		Assert on the response entity to be a UTF8 representation of the given string.
		
		Parameters:
		`expected` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertEntityAs
		
		
		
		```
		public <T> [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertEntityAs​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​T> unmarshaller,
		                                          T expected)
		```
		
		Assert on the response entity to equal the given object after applying an [`Unmarshaller`](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling").
		
		Parameters:
		`unmarshaller` \- (undocumented)
		`expected` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertEntityBytes
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertEntityBytes​(akka.util.ByteString expected)
		```
		
		Assert on the response entity to equal the given bytes.
		
		Parameters:
		`expected` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertEquals
		
		
		
		```
		protected abstract void assertEquals​(java.lang.Object expected,
		                                     java.lang.Object actual,
		                                     java.lang.String message)
		```
		- #### assertEquals
		
		
		
		```
		protected abstract void assertEquals​(int expected,
		                                     int actual,
		                                     java.lang.String message)
		```
		- #### assertEqualsKind
		
		
		
		```
		protected [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertEqualsKind​(java.lang.Object expected,
		                                           java.lang.Object actual,
		                                           java.lang.String kind)
		```
		- #### assertEqualsKind
		
		
		
		```
		protected [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertEqualsKind​(int expected,
		                                           int actual,
		                                           java.lang.String kind)
		```
		- #### assertHeaderExists
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertHeaderExists​(java.lang.String name,
		                                          java.lang.String value)
		```
		
		Assert that a header of the given name and value exists.
		
		Parameters:
		`name` \- (undocumented)
		`value` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertHeaderExists
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertHeaderExists​([HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model") expected)
		```
		
		Assert that a given header instance exists in the response.
		
		Parameters:
		`expected` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertHeaderKindExists
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertHeaderKindExists​(java.lang.String name)
		```
		
		Assert that a header of the given type exists.
		
		Parameters:
		`name` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertHeaderKindNotExists
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertHeaderKindNotExists​(java.lang.String name)
		```
		
		Assert that a header of the given type does not exist.
		
		Parameters:
		`name` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertMediaType
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertMediaType​(java.lang.String expected)
		```
		
		Assert on the media type of the response.
		
		Parameters:
		`expected` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertMediaType
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertMediaType​([MediaType](../model/MediaType.html "interface in akka.http.javadsl.model") expected)
		```
		
		Assert on the media type of the response.
		
		Parameters:
		`expected` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertRejections
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertRejections​([Rejection](../server/Rejection.html "interface in akka.http.javadsl.server")... expectedRejections)
		```
		
		Assert that a given header instance exists in the response.
		
		Parameters:
		`expectedRejections` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertRejections
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertRejections​(scala.collection.immutable.Seq<[Rejection](../server/Rejection.html "interface in akka.http.javadsl.server")> expectedRejections)
		```
		- #### assertStatusCode
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertStatusCode​(int expected)
		```
		
		Assert on the numeric status code.
		
		Parameters:
		`expected` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertStatusCode
		
		
		
		```
		public [TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") assertStatusCode​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") expected)
		```
		
		Assert on the status code.
		
		Parameters:
		`expected` \- (undocumented)
		Returns:
		(undocumented)
		- #### assertTrue
		
		
		
		```
		protected abstract void assertTrue​(boolean predicate,
		                                   java.lang.String message)
		```
		- #### contentType
		
		
		
		```
		public [ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") contentType()
		```
		
		Returns the response's content\-type
		
		Returns:
		(undocumented)
		- #### contentTypeString
		
		
		
		```
		public java.lang.String contentTypeString()
		```
		
		Returns a string representation of the response's content\-type
		
		Returns:
		(undocumented)
		- #### entity
		
		
		
		```
		public [HttpEntity.Strict](../model/HttpEntity.Strict.html "interface in akka.http.javadsl.model") entity()
		```
		- #### entity
		
		
		
		```
		public <T> T entity​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​T> unmarshaller)
		```
		
		Returns the entity of the response unmarshalled with the given Unmarshaller.
		
		Parameters:
		`unmarshaller` \- (undocumented)
		Returns:
		(undocumented)
		- #### entityBytes
		
		
		
		```
		public akka.util.ByteString entityBytes()
		```
		
		Returns the bytes of the response entity
		
		Returns:
		(undocumented)
		- #### entityString
		
		
		
		```
		public java.lang.String entityString()
		```
		
		Returns the entity of the response interpreted as an UTF\-8 encoded string.
		
		Returns:
		(undocumented)
		- #### fail
		
		
		
		```
		protected abstract void fail​(java.lang.String message)
		```
		- #### header
		
		
		
		```
		public <T extends [HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> T header​(java.lang.Class<T> clazz)
		```
		
		Returns the first header of the response which is of the given class.
		
		Parameters:
		`clazz` \- (undocumented)
		Returns:
		(undocumented)
		- #### mediaType
		
		
		
		```
		public [MediaType](../model/MediaType.html "interface in akka.http.javadsl.model") mediaType()
		```
		
		Returns the media\-type of the the response's content\-type
		
		Returns:
		(undocumented)
		- #### mediaTypeString
		
		
		
		```
		public java.lang.String mediaTypeString()
		```
		
		Returns a string representation of the media\-type of the response's content\-type
		
		Returns:
		(undocumented)
		- #### rejection
		
		
		
		```
		public [Rejection](../server/Rejection.html "interface in akka.http.javadsl.server") rejection()
		```
		
		Expects the route to have been rejected with a single rejection.
		 Fails the test if the route completes with a response, or is rejected with 0 or \>1 rejections.
		
		Returns:
		(undocumented)
		- #### rejections
		
		
		
		```
		public java.util.List<[Rejection](../server/Rejection.html "interface in akka.http.javadsl.server")> rejections()
		```
		
		Expects the route to have been rejected, returning the list of rejections, or empty list if the route
		 was rejected with an empty rejection list.
		 Fails the test if the route completes with a response rather than having been rejected.
		
		Returns:
		(undocumented)
		- #### response
		
		
		
		```
		public [HttpResponse](../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") response()
		```
		- #### status
		
		
		
		```
		public [StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status()
		```
		
		Returns the [`StatusCode`](../model/StatusCode.html "class in akka.http.javadsl.model") of the response.
		
		Returns:
		(undocumented)
		- #### statusCode
		
		
		
		```
		public int statusCode()
		```
		
		Returns the numeric status code of the response.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/TestRouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/TestRouteResult.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/TestRouteResult.html)*