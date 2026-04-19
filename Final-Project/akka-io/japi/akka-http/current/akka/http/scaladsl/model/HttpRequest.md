---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
title: HttpRequest
---

# HttpRequest

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpRequest

- java.lang.Object
- - [akka.http.javadsl.model.HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")
	- - akka.http.scaladsl.model.HttpRequest

- All Implemented Interfaces:
`[HttpMessage](../../javadsl/model/HttpMessage.html "interface in akka.http.javadsl.model")`, `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")>`, `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`

---

```
public final class HttpRequest
extends [HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")
implements [HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")
```

The immutable model HTTP request model.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[HttpMessage](../../javadsl/model/HttpMessage.html "interface in akka.http.javadsl.model")
		
		
		`[HttpMessage.DiscardedEntity](../../javadsl/model/HttpMessage.DiscardedEntity.html "interface in akka.http.javadsl.model"), [HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[Self](../../javadsl/model/HttpMessage.MessageTransformations.html "type parameter in HttpMessage.MessageTransformations")>`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.model.[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")
		
		
		`[HttpMessage.DiscardedEntity](HttpMessage.DiscardedEntity.html "class in akka.http.scaladsl.model"), [HttpMessage.HttpMessageScalaDSLSugar](HttpMessage.HttpMessageScalaDSLSugar.html "class in akka.http.scaladsl.model"), [HttpMessage.HttpMessageScalaDSLSugar$](HttpMessage.HttpMessageScalaDSLSugar$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpRequest](#%3Cinit%3E(akka.http.scaladsl.model.HttpMethod,akka.http.scaladsl.model.Uri,scala.collection.immutable.Seq,akka.http.scaladsl.model.RequestEntity,akka.http.scaladsl.model.HttpProtocol))​([HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") method,  [Uri](Uri.html "class in akka.http.scaladsl.model") uri,  scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity,  [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)` | Deprecated. use the constructor that includes an attributes parameter instead. |
	| `[HttpRequest](#%3Cinit%3E(akka.http.scaladsl.model.HttpMethod,akka.http.scaladsl.model.Uri,scala.collection.immutable.Seq,scala.collection.immutable.Map,akka.http.scaladsl.model.RequestEntity,akka.http.scaladsl.model.HttpProtocol))​([HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") method,  [Uri](Uri.html "class in akka.http.scaladsl.model") uri,  scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  scala.collection.immutable.Map<[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> attributes,  [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity,  [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[_1](#_1())()` |  |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[_2](#_2())()` |  |
	| `scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")>` | `[_3](#_3())()` |  |
	| `[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model")` | `[_4](#_4())()` |  |
	| `[HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model")` | `[_5](#_5())()` |  |
	| `static [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.HttpMethod,akka.http.scaladsl.model.Uri,scala.collection.immutable.Seq,akka.http.scaladsl.model.RequestEntity,akka.http.scaladsl.model.HttpProtocol))​([HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") method,  [Uri](Uri.html "class in akka.http.scaladsl.model") uri,  scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity,  [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)` |  |
	| `scala.collection.immutable.Map<[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object>` | `[attributes](#attributes())()` |  |
	| `boolean` | `[canBeRetried](#canBeRetried())()` | Determines whether this request can be safely retried, which is the case only of the request method is idempotent. |
	| `scala.collection.immutable.Seq<[HttpCookiePair](headers/HttpCookiePair.html "class in akka.http.scaladsl.model.headers")>` | `[cookies](#cookies())()` | All cookies provided by the client in one or more `Cookie` headers. |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[copy](#copy(akka.http.scaladsl.model.HttpMethod,akka.http.scaladsl.model.Uri,scala.collection.immutable.Seq,akka.http.scaladsl.model.RequestEntity,akka.http.scaladsl.model.HttpProtocol))​([HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") method,  [Uri](Uri.html "class in akka.http.scaladsl.model") uri,  scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity,  [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)` | Deprecated. Use the \`withXYZ\` methods instead. |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[effectiveUri](#effectiveUri(boolean,akka.http.scaladsl.model.headers.Host))​(boolean securedConnection,  [Host](headers/Host.html "class in akka.http.scaladsl.model.headers") defaultHostHeader)` | Resolve this request's URI according to the logic defined at  http://tools.ietf.org/html/rfc7230\#section\-5\.5 |
	| `[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model")` | `[entity](#entity())()` | Returns the entity of this request. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[getUri](#getUri())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")>` | `[headers](#headers())()` |  |
	| `boolean` | `[isRequest](#isRequest())()` | Is this instance a request. |
	| `boolean` | `[isResponse](#isResponse())()` | Is this instance a response. |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[mapEntity](#mapEntity(scala.Function1))​(scala.Function1<[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model"),​[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model")> f)` |  |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[method](#method())()` | Returns the Http method of this request. |
	| `[HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model")` | `[protocol](#protocol())()` | The protocol of this message. |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[self](#self())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<M> [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[transformEntityDataBytes](#transformEntityDataBytes(akka.stream.Graph))​(akka.stream.Graph<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>,​M> transformer)` | Returns a copy of Self message after applying the given transformation |
	| `static [OptHttpRequest](OptHttpRequest.html "class in akka.http.scaladsl.model")` | `[unapply](#unapply(akka.http.scaladsl.model.HttpRequest))​([HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") any)` |  |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[uri](#uri())()` |  |
	| `static void` | `[verifyUri](#verifyUri(akka.http.scaladsl.model.Uri))​([Uri](Uri.html "class in akka.http.scaladsl.model") uri)` | Verifies that the given [`Uri`](Uri.html "class in akka.http.scaladsl.model") is non\-empty and has either scheme `http`, `https`, `ws`, `wss` or no scheme at all. |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[withAttributes](#withAttributes(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> attributes)` | Returns a copy of this message with the attributes set to the given ones. |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[withEffectiveUri](#withEffectiveUri(boolean,akka.http.scaladsl.model.headers.Host))​(boolean securedConnection,  [Host](headers/Host.html "class in akka.http.scaladsl.model.headers") defaultHostHeader)` | Returns a copy of this request with the URI resolved according to the logic defined at  http://tools.ietf.org/html/rfc7230\#section\-5\.5 |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[withEntity](#withEntity(akka.http.javadsl.model.RequestEntity))​([RequestEntity](../../javadsl/model/RequestEntity.html "interface in akka.http.javadsl.model") entity)` | Returns a copy of this instance with a new entity. |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[withEntity](#withEntity(akka.http.scaladsl.model.RequestEntity))​([RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity)` | Returns a copy of this message with the entity set to the given one. |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[withHeaders](#withHeaders(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers)` | Returns a copy of this message with the list of headers set to the given ones. |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[withHeadersAndEntity](#withHeadersAndEntity(scala.collection.immutable.Seq,akka.http.scaladsl.model.RequestEntity))​(scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity)` | Returns a copy of this message with the entity and headers set to the given ones. |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[withMethod](#withMethod(akka.http.javadsl.model.HttpMethod))​([HttpMethod](../../javadsl/model/HttpMethod.html "class in akka.http.javadsl.model") method)` | Returns a copy of this instance with a new method. |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[withProtocol](#withProtocol(akka.http.javadsl.model.HttpProtocol))​([HttpProtocol](../../javadsl/model/HttpProtocol.html "class in akka.http.javadsl.model") protocol)` | Returns a copy of this message with a new protocol. |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[withUri](#withUri(akka.http.javadsl.model.Uri))​([Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") uri)` | Java API |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[withUri](#withUri(akka.http.scaladsl.model.Uri))​([Uri](Uri.html "class in akka.http.scaladsl.model") uri)` |  |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[withUri](#withUri(java.lang.String))​(java.lang.String path)` | Returns a copy of this instance with a new Uri. |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.[HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")
		
		
		`[create](../../javadsl/model/HttpRequest.html#create()), [create](../../javadsl/model/HttpRequest.html#create(java.lang.String)), [DELETE](../../javadsl/model/HttpRequest.html#DELETE(java.lang.String)), [GET](../../javadsl/model/HttpRequest.html#GET(java.lang.String)), [HEAD](../../javadsl/model/HttpRequest.html#HEAD(java.lang.String)), [OPTIONS](../../javadsl/model/HttpRequest.html#OPTIONS(java.lang.String)), [PATCH](../../javadsl/model/HttpRequest.html#PATCH(java.lang.String)), [POST](../../javadsl/model/HttpRequest.html#POST(java.lang.String)), [PUT](../../javadsl/model/HttpRequest.html#PUT(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.model.[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")
		
		
		`[addAttribute](HttpMessage.html#addAttribute(akka.http.javadsl.model.AttributeKey,T)), [addCredentials](HttpMessage.html#addCredentials(akka.http.javadsl.model.headers.HttpCredentials)), [addHeader](HttpMessage.html#addHeader(akka.http.javadsl.model.HttpHeader)), [addHeaders](HttpMessage.html#addHeaders(java.lang.Iterable)), [attribute](HttpMessage.html#attribute(akka.http.javadsl.model.AttributeKey,akka.http.impl.util.JavaMapping)), [connectionCloseExpected](HttpMessage.html#connectionCloseExpected()), [discardEntityBytes](HttpMessage.html#discardEntityBytes(akka.actor.ClassicActorSystemProvider)), [discardEntityBytes](HttpMessage.html#discardEntityBytes(akka.stream.Materializer)), [encoding](HttpMessage.html#encoding()), [getAttribute](HttpMessage.html#getAttribute(akka.http.javadsl.model.AttributeKey)), [getHeader](HttpMessage.html#getHeader(java.lang.Class)), [getHeader](HttpMessage.html#getHeader(java.lang.String)), [getHeaders](HttpMessage.html#getHeaders()), [getHeaders](HttpMessage.html#getHeaders(java.lang.Class)), [header](HttpMessage.html#header(java.lang.String)), [header](HttpMessage.html#header(scala.reflect.ClassTag)), [headers](HttpMessage.html#headers(scala.reflect.ClassTag)), [mapAttributes](HttpMessage.html#mapAttributes(scala.Function1)), [mapHeaders](HttpMessage.html#mapHeaders(scala.Function1)), [removeAttribute](HttpMessage.html#removeAttribute(akka.http.javadsl.model.AttributeKey)), [removeHeader](HttpMessage.html#removeHeader(java.lang.String)), [toStrict](HttpMessage.html#toStrict(long,long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpMessage.html#toStrict(long,long,java.util.concurrent.Executor,akka.stream.Materializer)), [toStrict](HttpMessage.html#toStrict(long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpMessage.html#toStrict(long,java.util.concurrent.Executor,akka.stream.Materializer)), [toStrict](HttpMessage.html#toStrict(scala.concurrent.duration.FiniteDuration,long,scala.concurrent.ExecutionContext,akka.stream.Materializer)), [toStrict](HttpMessage.html#toStrict(scala.concurrent.duration.FiniteDuration,scala.concurrent.ExecutionContext,akka.stream.Materializer)), [withDefaultHeaders](HttpMessage.html#withDefaultHeaders(akka.http.scaladsl.model.HttpHeader,scala.collection.immutable.Seq)), [withDefaultHeaders](HttpMessage.html#withDefaultHeaders(scala.collection.immutable.Seq)), [withEntity](HttpMessage.html#withEntity(byte%5B%5D)), [withEntity](HttpMessage.html#withEntity(akka.http.javadsl.model.ContentType.NonBinary,java.lang.String)), [withEntity](HttpMessage.html#withEntity(akka.http.javadsl.model.ContentType,byte%5B%5D)), [withEntity](HttpMessage.html#withEntity(akka.http.javadsl.model.ContentType,akka.util.ByteString)), [withEntity](HttpMessage.html#withEntity(akka.http.javadsl.model.ContentType,java.io.File)), [withEntity](HttpMessage.html#withEntity(akka.http.javadsl.model.ContentType,java.nio.file.Path)), [withEntity](HttpMessage.html#withEntity(akka.util.ByteString)), [withEntity](HttpMessage.html#withEntity(java.lang.String)), [withHeaders](HttpMessage.html#withHeaders(akka.http.scaladsl.model.HttpHeader,scala.collection.immutable.Seq)), [withHeaders](HttpMessage.html#withHeaders(java.lang.Iterable))`
		- ### Methods inherited from interface akka.http.javadsl.model.[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")
		
		
		`[addAttribute](../../javadsl/model/HttpMessage.MessageTransformations.html#addAttribute(akka.http.javadsl.model.AttributeKey,T)), [addCredentials](../../javadsl/model/HttpMessage.MessageTransformations.html#addCredentials(akka.http.javadsl.model.headers.HttpCredentials)), [addHeader](../../javadsl/model/HttpMessage.MessageTransformations.html#addHeader(akka.http.javadsl.model.HttpHeader)), [addHeaders](../../javadsl/model/HttpMessage.MessageTransformations.html#addHeaders(java.lang.Iterable)), [removeAttribute](../../javadsl/model/HttpMessage.MessageTransformations.html#removeAttribute(akka.http.javadsl.model.AttributeKey)), [removeHeader](../../javadsl/model/HttpMessage.MessageTransformations.html#removeHeader(java.lang.String)), [toStrict](../../javadsl/model/HttpMessage.MessageTransformations.html#toStrict(long,long,akka.actor.ClassicActorSystemProvider)), [toStrict](../../javadsl/model/HttpMessage.MessageTransformations.html#toStrict(long,long,java.util.concurrent.Executor,akka.stream.Materializer)), [toStrict](../../javadsl/model/HttpMessage.MessageTransformations.html#toStrict(long,akka.actor.ClassicActorSystemProvider)), [toStrict](../../javadsl/model/HttpMessage.MessageTransformations.html#toStrict(long,java.util.concurrent.Executor,akka.stream.Materializer)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(byte%5B%5D)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType.NonBinary,java.lang.String)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,byte%5B%5D)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,akka.util.ByteString)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,java.io.File)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,java.nio.file.Path)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.util.ByteString)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(java.lang.String)), [withHeaders](../../javadsl/model/HttpMessage.MessageTransformations.html#withHeaders(java.lang.Iterable))`

- - ### Constructor Detail
	
	
	
		- #### HttpRequest
		
		
		
		```
		public HttpRequest​([HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") method,
		                   [Uri](Uri.html "class in akka.http.scaladsl.model") uri,
		                   scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                   scala.collection.immutable.Map<[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> attributes,
		                   [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity,
		                   [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)
		```
		- #### HttpRequest
		
		
		
		```
		public HttpRequest​([HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") method,
		                   [Uri](Uri.html "class in akka.http.scaladsl.model") uri,
		                   scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                   [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity,
		                   [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)
		```
		
		Deprecated.
		use the constructor that includes an attributes parameter instead. Since 10\.2\.0\.

	- ### Method Detail
	
	
	
		- #### verifyUri
		
		
		
		```
		public static void verifyUri​([Uri](Uri.html "class in akka.http.scaladsl.model") uri)
		```
		
		Verifies that the given [`Uri`](Uri.html "class in akka.http.scaladsl.model") is non\-empty and has either scheme `http`, `https`, `ws`, `wss` or no scheme at all.
		 If any of these conditions is not met the method throws an [`IllegalUriException`](IllegalUriException.html "class in akka.http.scaladsl.model").
		
		Parameters:
		`uri` \- (undocumented)
		- #### apply
		
		
		
		```
		public static [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") apply​([HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") method,
		                                [Uri](Uri.html "class in akka.http.scaladsl.model") uri,
		                                scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                                [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity,
		                                [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)
		```
		- #### unapply
		
		
		
		```
		public static [OptHttpRequest](OptHttpRequest.html "class in akka.http.scaladsl.model") unapply​([HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") any)
		```
		- #### method
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") method()
		```
		
		Description copied from class: `[HttpRequest](../../javadsl/model/HttpRequest.html#method())`
		Returns the Http method of this request.
		
		Specified by:
		`[method](../../javadsl/model/HttpRequest.html#method())` in class `[HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")`
		- #### uri
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") uri()
		```
		- #### headers
		
		
		
		```
		public scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers()
		```
		
		
		Specified by:
		`[headers](HttpMessage.html#headers())` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### attributes
		
		
		
		```
		public scala.collection.immutable.Map<[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> attributes()
		```
		
		
		Specified by:
		`[attributes](HttpMessage.html#attributes())` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### entity
		
		
		
		```
		public [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity()
		```
		
		Description copied from class: `[HttpRequest](../../javadsl/model/HttpRequest.html#entity())`
		Returns the entity of this request.
		
		Specified by:
		`[entity](../../javadsl/model/HttpMessage.html#entity())` in interface `[HttpMessage](../../javadsl/model/HttpMessage.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[entity](HttpMessage.html#entity())` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[entity](../../javadsl/model/HttpRequest.html#entity())` in class `[HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")`
		- #### protocol
		
		
		
		```
		public [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol()
		```
		
		Description copied from interface: `[HttpMessage](../../javadsl/model/HttpMessage.html#protocol())`
		The protocol of this message.
		
		Specified by:
		`[protocol](../../javadsl/model/HttpMessage.html#protocol())` in interface `[HttpMessage](../../javadsl/model/HttpMessage.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[protocol](HttpMessage.html#protocol())` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### self
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") self()
		```
		
		
		Specified by:
		`[self](HttpMessage.html#self())` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### isRequest
		
		
		
		```
		public boolean isRequest()
		```
		
		Description copied from interface: `[HttpMessage](../../javadsl/model/HttpMessage.html#isRequest())`
		Is this instance a request.
		
		Specified by:
		`[isRequest](../../javadsl/model/HttpMessage.html#isRequest())` in interface `[HttpMessage](../../javadsl/model/HttpMessage.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[isRequest](HttpMessage.html#isRequest())` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### isResponse
		
		
		
		```
		public boolean isResponse()
		```
		
		Description copied from interface: `[HttpMessage](../../javadsl/model/HttpMessage.html#isResponse())`
		Is this instance a response.
		
		Specified by:
		`[isResponse](../../javadsl/model/HttpMessage.html#isResponse())` in interface `[HttpMessage](../../javadsl/model/HttpMessage.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[isResponse](HttpMessage.html#isResponse())` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### effectiveUri
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") effectiveUri​(boolean securedConnection,
		                        [Host](headers/Host.html "class in akka.http.scaladsl.model.headers") defaultHostHeader)
		```
		
		Resolve this request's URI according to the logic defined at
		 http://tools.ietf.org/html/rfc7230\#section\-5\.5
		 
		 Throws an [`IllegalUriException`](IllegalUriException.html "class in akka.http.scaladsl.model") if the URI is relative and the `headers` don't
		 include a valid [`Host`](headers/Host.html "class in akka.http.scaladsl.model.headers") header or if URI authority and [`Host`](headers/Host.html "class in akka.http.scaladsl.model.headers") header don't match.
		
		
		
		Parameters:
		`securedConnection` \- (undocumented)
		`defaultHostHeader` \- (undocumented)
		Returns:
		(undocumented)
		- #### withEffectiveUri
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") withEffectiveUri​(boolean securedConnection,
		                                    [Host](headers/Host.html "class in akka.http.scaladsl.model.headers") defaultHostHeader)
		```
		
		Returns a copy of this request with the URI resolved according to the logic defined at
		 http://tools.ietf.org/html/rfc7230\#section\-5\.5
		
		Parameters:
		`securedConnection` \- (undocumented)
		`defaultHostHeader` \- (undocumented)
		Returns:
		(undocumented)
		- #### cookies
		
		
		
		```
		public scala.collection.immutable.Seq<[HttpCookiePair](headers/HttpCookiePair.html "class in akka.http.scaladsl.model.headers")> cookies()
		```
		
		All cookies provided by the client in one or more `Cookie` headers.
		
		Returns:
		(undocumented)
		- #### canBeRetried
		
		
		
		```
		public boolean canBeRetried()
		```
		
		Determines whether this request can be safely retried, which is the case only of the request method is idempotent.
		
		Returns:
		(undocumented)
		- #### withHeaders
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") withHeaders​(scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers)
		```
		
		Description copied from interface: `[HttpMessage](HttpMessage.html#withHeaders(scala.collection.immutable.Seq))`
		Returns a copy of this message with the list of headers set to the given ones.
		
		Specified by:
		`[withHeaders](HttpMessage.html#withHeaders(scala.collection.immutable.Seq))` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### withAttributes
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") withAttributes​(scala.collection.immutable.Map<[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> attributes)
		```
		
		Description copied from interface: `[HttpMessage](HttpMessage.html#withAttributes(scala.collection.immutable.Map))`
		Returns a copy of this message with the attributes set to the given ones.
		
		Specified by:
		`[withAttributes](HttpMessage.html#withAttributes(scala.collection.immutable.Map))` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### withHeadersAndEntity
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") withHeadersAndEntity​(scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                                        [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity)
		```
		
		Description copied from interface: `[HttpMessage](HttpMessage.html#withHeadersAndEntity(scala.collection.immutable.Seq,akka.http.scaladsl.model.RequestEntity))`
		Returns a copy of this message with the entity and headers set to the given ones.
		
		Specified by:
		`[withHeadersAndEntity](HttpMessage.html#withHeadersAndEntity(scala.collection.immutable.Seq,akka.http.scaladsl.model.RequestEntity))` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### withEntity
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") withEntity​([RequestEntity](../../javadsl/model/RequestEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Description copied from class: `[HttpRequest](../../javadsl/model/HttpRequest.html#withEntity(akka.http.javadsl.model.RequestEntity))`
		Returns a copy of this instance with a new entity.
		
		Specified by:
		`[withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.RequestEntity))` in interface `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")>`
		Specified by:
		`[withEntity](../../javadsl/model/HttpRequest.html#withEntity(akka.http.javadsl.model.RequestEntity))` in class `[HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")`
		- #### withEntity
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") withEntity​([RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity)
		```
		
		Description copied from interface: `[HttpMessage](HttpMessage.html#withEntity(akka.http.scaladsl.model.RequestEntity))`
		Returns a copy of this message with the entity set to the given one.
		
		Specified by:
		`[withEntity](HttpMessage.html#withEntity(akka.http.scaladsl.model.RequestEntity))` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### mapEntity
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") mapEntity​(scala.Function1<[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model"),​[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model")> f)
		```
		- #### withMethod
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") withMethod​([HttpMethod](../../javadsl/model/HttpMethod.html "class in akka.http.javadsl.model") method)
		```
		
		Description copied from class: `[HttpRequest](../../javadsl/model/HttpRequest.html#withMethod(akka.http.javadsl.model.HttpMethod))`
		Returns a copy of this instance with a new method.
		
		Specified by:
		`[withMethod](../../javadsl/model/HttpRequest.html#withMethod(akka.http.javadsl.model.HttpMethod))` in class `[HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")`
		- #### withProtocol
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") withProtocol​([HttpProtocol](../../javadsl/model/HttpProtocol.html "class in akka.http.javadsl.model") protocol)
		```
		
		Description copied from interface: `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html#withProtocol(akka.http.javadsl.model.HttpProtocol))`
		Returns a copy of this message with a new protocol.
		
		Specified by:
		`[withProtocol](../../javadsl/model/HttpMessage.MessageTransformations.html#withProtocol(akka.http.javadsl.model.HttpProtocol))` in interface `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")>`
		- #### withUri
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") withUri​(java.lang.String path)
		```
		
		Description copied from class: `[HttpRequest](../../javadsl/model/HttpRequest.html#withUri(java.lang.String))`
		Returns a copy of this instance with a new Uri.
		
		Specified by:
		`[withUri](../../javadsl/model/HttpRequest.html#withUri(java.lang.String))` in class `[HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")`
		- #### withUri
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") withUri​([Uri](Uri.html "class in akka.http.scaladsl.model") uri)
		```
		- #### transformEntityDataBytes
		
		
		
		```
		public <M> [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") transformEntityDataBytes​(akka.stream.Graph<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>,​M> transformer)
		```
		
		Description copied from interface: `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html#transformEntityDataBytes(akka.stream.Graph))`
		Returns a copy of Self message after applying the given transformation
		
		Specified by:
		`[transformEntityDataBytes](HttpMessage.html#transformEntityDataBytes(akka.stream.Graph))` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[transformEntityDataBytes](../../javadsl/model/HttpMessage.MessageTransformations.html#transformEntityDataBytes(akka.stream.Graph))` in interface `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")>`
		- #### getUri
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") getUri()
		```
		
		Java API
		
		Specified by:
		`[getUri](../../javadsl/model/HttpRequest.html#getUri())` in class `[HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")`
		- #### withUri
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") withUri​([Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") uri)
		```
		
		Java API
		
		Specified by:
		`[withUri](../../javadsl/model/HttpRequest.html#withUri(akka.http.javadsl.model.Uri))` in class `[HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")`
		- #### copy
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") copy​([HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") method,
		                        [Uri](Uri.html "class in akka.http.scaladsl.model") uri,
		                        scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                        [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity,
		                        [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)
		```
		
		Deprecated.
		Use the \`withXYZ\` methods instead. Kept for binary compatibility. Since 10\.2\.0\.
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### \_1
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") _1()
		```
		- #### \_2
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") _2()
		```
		- #### \_3
		
		
		
		```
		public scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> _3()
		```
		- #### \_4
		
		
		
		```
		public [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") _4()
		```
		- #### \_5
		
		
		
		```
		public [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") _5()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.MessageTransformations.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.HttpMessageScalaDSLSugar$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.HttpMessageScalaDSLSugar.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalUriException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/OptHttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html)*