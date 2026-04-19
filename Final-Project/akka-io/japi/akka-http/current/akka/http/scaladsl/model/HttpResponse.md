---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
title: HttpResponse
---

# HttpResponse

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpResponse

- java.lang.Object
- - [akka.http.javadsl.model.HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")
	- - akka.http.scaladsl.model.HttpResponse

- All Implemented Interfaces:
`[HttpMessage](../../javadsl/model/HttpMessage.html "interface in akka.http.javadsl.model")`, `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")>`, `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`

---

```
public final class HttpResponse
extends [HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")
implements [HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")
```

The immutable HTTP response model.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[HttpMessage](../../javadsl/model/HttpMessage.html "interface in akka.http.javadsl.model")
		
		
		`[HttpMessage.DiscardedEntity](../../javadsl/model/HttpMessage.DiscardedEntity.html "interface in akka.http.javadsl.model"), [HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[Self](../../javadsl/model/HttpMessage.MessageTransformations.html "type parameter in HttpMessage.MessageTransformations")>`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.model.[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")
		
		
		`[HttpMessage.DiscardedEntity](HttpMessage.DiscardedEntity.html "class in akka.http.scaladsl.model"), [HttpMessage.HttpMessageScalaDSLSugar](HttpMessage.HttpMessageScalaDSLSugar.html "class in akka.http.scaladsl.model"), [HttpMessage.HttpMessageScalaDSLSugar$](HttpMessage.HttpMessageScalaDSLSugar$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpResponse](#%3Cinit%3E(akka.http.scaladsl.model.StatusCode,scala.collection.immutable.Seq,akka.http.scaladsl.model.ResponseEntity,akka.http.scaladsl.model.HttpProtocol))​([StatusCode](StatusCode.html "class in akka.http.scaladsl.model") status,  scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity,  [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)` | Deprecated. use the constructor that includes an attributes parameter instead. |
	| `[HttpResponse](#%3Cinit%3E(akka.http.scaladsl.model.StatusCode,scala.collection.immutable.Seq,scala.collection.immutable.Map,akka.http.scaladsl.model.ResponseEntity,akka.http.scaladsl.model.HttpProtocol))​([StatusCode](StatusCode.html "class in akka.http.scaladsl.model") status,  scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  scala.collection.immutable.Map<[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> attributes,  [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity,  [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[StatusCode](StatusCode.html "class in akka.http.scaladsl.model")` | `[_1](#_1())()` |  |
	| `scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")>` | `[_2](#_2())()` |  |
	| `[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model")` | `[_3](#_3())()` |  |
	| `[HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model")` | `[_4](#_4())()` |  |
	| `static [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.StatusCode,scala.collection.immutable.Seq,akka.http.scaladsl.model.ResponseEntity,akka.http.scaladsl.model.HttpProtocol))​([StatusCode](StatusCode.html "class in akka.http.scaladsl.model") status,  scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity,  [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)` |  |
	| `scala.collection.immutable.Map<[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object>` | `[attributes](#attributes())()` |  |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[copy](#copy(akka.http.scaladsl.model.StatusCode,scala.collection.immutable.Seq,akka.http.scaladsl.model.ResponseEntity,akka.http.scaladsl.model.HttpProtocol))​([StatusCode](StatusCode.html "class in akka.http.scaladsl.model") status,  scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity,  [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)` | Deprecated. Use the \`withXYZ\` methods instead. |
	| `[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model")` | `[entity](#entity())()` | Returns the entity of this response. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")>` | `[headers](#headers())()` |  |
	| `boolean` | `[isRequest](#isRequest())()` | Is this instance a request. |
	| `boolean` | `[isResponse](#isResponse())()` | Is this instance a response. |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[mapEntity](#mapEntity(scala.Function1))​(scala.Function1<[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model"),​[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model")> f)` |  |
	| `[HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model")` | `[protocol](#protocol())()` | The protocol of this message. |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[self](#self())()` |  |
	| `[StatusCode](StatusCode.html "class in akka.http.scaladsl.model")` | `[status](#status())()` | Returns the status\-code of this response. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[transformEntityDataBytes](#transformEntityDataBytes(akka.stream.Graph))​(akka.stream.Graph<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>,​T> transformer)` | Returns a copy of Self message after applying the given transformation |
	| `static [OptHttpResponse](OptHttpResponse.html "class in akka.http.scaladsl.model")` | `[unapply](#unapply(akka.http.scaladsl.model.HttpResponse))​([HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") any)` |  |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[withAttributes](#withAttributes(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> attributes)` | Returns a copy of this message with the attributes set to the given ones. |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[withEntity](#withEntity(akka.http.javadsl.model.RequestEntity))​([RequestEntity](../../javadsl/model/RequestEntity.html "interface in akka.http.javadsl.model") entity)` | Returns a copy of Self message with a new entity. |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[withEntity](#withEntity(akka.http.javadsl.model.ResponseEntity))​([ResponseEntity](../../javadsl/model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)` | Returns a copy of this instance with a new entity. |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[withEntity](#withEntity(akka.http.scaladsl.model.RequestEntity))​([RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity)` | Returns a copy of this message with the entity set to the given one. |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[withHeaders](#withHeaders(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers)` | Returns a copy of this message with the list of headers set to the given ones. |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[withHeadersAndEntity](#withHeadersAndEntity(scala.collection.immutable.Seq,akka.http.scaladsl.model.RequestEntity))​(scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity)` | Returns a copy of this message with the entity and headers set to the given ones. |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[withHeadersAndEntity](#withHeadersAndEntity(scala.collection.immutable.Seq,akka.http.scaladsl.model.ResponseEntity))​(scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity)` |  |
	| `[HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")` | `[withProtocol](#withProtocol(akka.http.javadsl.model.HttpProtocol))​([HttpProtocol](../../javadsl/model/HttpProtocol.html "class in akka.http.javadsl.model") protocol)` | Returns a copy of this message with a new protocol. |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[withProtocol](#withProtocol(akka.http.scaladsl.model.HttpProtocol))​([HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)` |  |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[withStatus](#withStatus(int))​(int statusCode)` | Returns a copy of this instance with a new status\-code. |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[withStatus](#withStatus(akka.http.javadsl.model.StatusCode))​([StatusCode](../../javadsl/model/StatusCode.html "class in akka.http.javadsl.model") statusCode)` | Returns a copy of this instance with a new status\-code. |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.[HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")
		
		
		`[create](../../javadsl/model/HttpResponse.html#create()), [encoding](../../javadsl/model/HttpResponse.html#encoding())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.model.[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")
		
		
		`[addAttribute](HttpMessage.html#addAttribute(akka.http.javadsl.model.AttributeKey,T)), [addCredentials](HttpMessage.html#addCredentials(akka.http.javadsl.model.headers.HttpCredentials)), [addHeader](HttpMessage.html#addHeader(akka.http.javadsl.model.HttpHeader)), [addHeaders](HttpMessage.html#addHeaders(java.lang.Iterable)), [attribute](HttpMessage.html#attribute(akka.http.javadsl.model.AttributeKey,akka.http.impl.util.JavaMapping)), [connectionCloseExpected](HttpMessage.html#connectionCloseExpected()), [discardEntityBytes](HttpMessage.html#discardEntityBytes(akka.actor.ClassicActorSystemProvider)), [discardEntityBytes](HttpMessage.html#discardEntityBytes(akka.stream.Materializer)), [encoding](HttpMessage.html#encoding()), [getAttribute](HttpMessage.html#getAttribute(akka.http.javadsl.model.AttributeKey)), [getHeader](HttpMessage.html#getHeader(java.lang.Class)), [getHeader](HttpMessage.html#getHeader(java.lang.String)), [getHeaders](HttpMessage.html#getHeaders()), [getHeaders](HttpMessage.html#getHeaders(java.lang.Class)), [header](HttpMessage.html#header(java.lang.String)), [header](HttpMessage.html#header(scala.reflect.ClassTag)), [headers](HttpMessage.html#headers(scala.reflect.ClassTag)), [mapAttributes](HttpMessage.html#mapAttributes(scala.Function1)), [mapHeaders](HttpMessage.html#mapHeaders(scala.Function1)), [removeAttribute](HttpMessage.html#removeAttribute(akka.http.javadsl.model.AttributeKey)), [removeHeader](HttpMessage.html#removeHeader(java.lang.String)), [toStrict](HttpMessage.html#toStrict(long,long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpMessage.html#toStrict(long,long,java.util.concurrent.Executor,akka.stream.Materializer)), [toStrict](HttpMessage.html#toStrict(long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpMessage.html#toStrict(long,java.util.concurrent.Executor,akka.stream.Materializer)), [toStrict](HttpMessage.html#toStrict(scala.concurrent.duration.FiniteDuration,long,scala.concurrent.ExecutionContext,akka.stream.Materializer)), [toStrict](HttpMessage.html#toStrict(scala.concurrent.duration.FiniteDuration,scala.concurrent.ExecutionContext,akka.stream.Materializer)), [withDefaultHeaders](HttpMessage.html#withDefaultHeaders(akka.http.scaladsl.model.HttpHeader,scala.collection.immutable.Seq)), [withDefaultHeaders](HttpMessage.html#withDefaultHeaders(scala.collection.immutable.Seq)), [withEntity](HttpMessage.html#withEntity(byte%5B%5D)), [withEntity](HttpMessage.html#withEntity(akka.http.javadsl.model.ContentType.NonBinary,java.lang.String)), [withEntity](HttpMessage.html#withEntity(akka.http.javadsl.model.ContentType,byte%5B%5D)), [withEntity](HttpMessage.html#withEntity(akka.http.javadsl.model.ContentType,akka.util.ByteString)), [withEntity](HttpMessage.html#withEntity(akka.http.javadsl.model.ContentType,java.io.File)), [withEntity](HttpMessage.html#withEntity(akka.http.javadsl.model.ContentType,java.nio.file.Path)), [withEntity](HttpMessage.html#withEntity(akka.util.ByteString)), [withEntity](HttpMessage.html#withEntity(java.lang.String)), [withHeaders](HttpMessage.html#withHeaders(akka.http.scaladsl.model.HttpHeader,scala.collection.immutable.Seq)), [withHeaders](HttpMessage.html#withHeaders(java.lang.Iterable))`
		- ### Methods inherited from interface akka.http.javadsl.model.[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")
		
		
		`[addAttribute](../../javadsl/model/HttpMessage.MessageTransformations.html#addAttribute(akka.http.javadsl.model.AttributeKey,T)), [addCredentials](../../javadsl/model/HttpMessage.MessageTransformations.html#addCredentials(akka.http.javadsl.model.headers.HttpCredentials)), [addHeader](../../javadsl/model/HttpMessage.MessageTransformations.html#addHeader(akka.http.javadsl.model.HttpHeader)), [addHeaders](../../javadsl/model/HttpMessage.MessageTransformations.html#addHeaders(java.lang.Iterable)), [removeAttribute](../../javadsl/model/HttpMessage.MessageTransformations.html#removeAttribute(akka.http.javadsl.model.AttributeKey)), [removeHeader](../../javadsl/model/HttpMessage.MessageTransformations.html#removeHeader(java.lang.String)), [toStrict](../../javadsl/model/HttpMessage.MessageTransformations.html#toStrict(long,long,akka.actor.ClassicActorSystemProvider)), [toStrict](../../javadsl/model/HttpMessage.MessageTransformations.html#toStrict(long,long,java.util.concurrent.Executor,akka.stream.Materializer)), [toStrict](../../javadsl/model/HttpMessage.MessageTransformations.html#toStrict(long,akka.actor.ClassicActorSystemProvider)), [toStrict](../../javadsl/model/HttpMessage.MessageTransformations.html#toStrict(long,java.util.concurrent.Executor,akka.stream.Materializer)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(byte%5B%5D)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType.NonBinary,java.lang.String)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,byte%5B%5D)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,akka.util.ByteString)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,java.io.File)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,java.nio.file.Path)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.util.ByteString)), [withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(java.lang.String)), [withHeaders](../../javadsl/model/HttpMessage.MessageTransformations.html#withHeaders(java.lang.Iterable))`

- - ### Constructor Detail
	
	
	
		- #### HttpResponse
		
		
		
		```
		public HttpResponse​([StatusCode](StatusCode.html "class in akka.http.scaladsl.model") status,
		                    scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                    scala.collection.immutable.Map<[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> attributes,
		                    [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity,
		                    [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)
		```
		- #### HttpResponse
		
		
		
		```
		public HttpResponse​([StatusCode](StatusCode.html "class in akka.http.scaladsl.model") status,
		                    scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                    [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity,
		                    [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)
		```
		
		Deprecated.
		use the constructor that includes an attributes parameter instead. Since 10\.2\.0\.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") apply​([StatusCode](StatusCode.html "class in akka.http.scaladsl.model") status,
		                                 scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                                 [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity,
		                                 [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)
		```
		- #### unapply
		
		
		
		```
		public static [OptHttpResponse](OptHttpResponse.html "class in akka.http.scaladsl.model") unapply​([HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") any)
		```
		- #### status
		
		
		
		```
		public [StatusCode](StatusCode.html "class in akka.http.scaladsl.model") status()
		```
		
		Description copied from class: `[HttpResponse](../../javadsl/model/HttpResponse.html#status())`
		Returns the status\-code of this response.
		
		Specified by:
		`[status](../../javadsl/model/HttpResponse.html#status())` in class `[HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")`
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
		public [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity()
		```
		
		Description copied from class: `[HttpResponse](../../javadsl/model/HttpResponse.html#entity())`
		Returns the entity of this response.
		
		Specified by:
		`[entity](../../javadsl/model/HttpMessage.html#entity())` in interface `[HttpMessage](../../javadsl/model/HttpMessage.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[entity](HttpMessage.html#entity())` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[entity](../../javadsl/model/HttpResponse.html#entity())` in class `[HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")`
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
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") self()
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
		- #### withHeaders
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") withHeaders​(scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers)
		```
		
		Description copied from interface: `[HttpMessage](HttpMessage.html#withHeaders(scala.collection.immutable.Seq))`
		Returns a copy of this message with the list of headers set to the given ones.
		
		Specified by:
		`[withHeaders](HttpMessage.html#withHeaders(scala.collection.immutable.Seq))` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### withAttributes
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") withAttributes​(scala.collection.immutable.Map<[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> attributes)
		```
		
		Description copied from interface: `[HttpMessage](HttpMessage.html#withAttributes(scala.collection.immutable.Map))`
		Returns a copy of this message with the attributes set to the given ones.
		
		Specified by:
		`[withAttributes](HttpMessage.html#withAttributes(scala.collection.immutable.Map))` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### withProtocol
		
		
		
		```
		public [HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model") withProtocol​([HttpProtocol](../../javadsl/model/HttpProtocol.html "class in akka.http.javadsl.model") protocol)
		```
		
		Description copied from interface: `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html#withProtocol(akka.http.javadsl.model.HttpProtocol))`
		Returns a copy of this message with a new protocol.
		
		Specified by:
		`[withProtocol](../../javadsl/model/HttpMessage.MessageTransformations.html#withProtocol(akka.http.javadsl.model.HttpProtocol))` in interface `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")>`
		- #### withProtocol
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") withProtocol​([HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)
		```
		- #### withStatus
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") withStatus​(int statusCode)
		```
		
		Description copied from class: `[HttpResponse](../../javadsl/model/HttpResponse.html#withStatus(int))`
		Returns a copy of this instance with a new status\-code.
		
		Specified by:
		`[withStatus](../../javadsl/model/HttpResponse.html#withStatus(int))` in class `[HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")`
		- #### withStatus
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") withStatus​([StatusCode](../../javadsl/model/StatusCode.html "class in akka.http.javadsl.model") statusCode)
		```
		
		Description copied from class: `[HttpResponse](../../javadsl/model/HttpResponse.html#withStatus(akka.http.javadsl.model.StatusCode))`
		Returns a copy of this instance with a new status\-code.
		
		Specified by:
		`[withStatus](../../javadsl/model/HttpResponse.html#withStatus(akka.http.javadsl.model.StatusCode))` in class `[HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")`
		- #### withHeadersAndEntity
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") withHeadersAndEntity​(scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                                         [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity)
		```
		
		Description copied from interface: `[HttpMessage](HttpMessage.html#withHeadersAndEntity(scala.collection.immutable.Seq,akka.http.scaladsl.model.RequestEntity))`
		Returns a copy of this message with the entity and headers set to the given ones.
		
		Specified by:
		`[withHeadersAndEntity](HttpMessage.html#withHeadersAndEntity(scala.collection.immutable.Seq,akka.http.scaladsl.model.RequestEntity))` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### withHeadersAndEntity
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") withHeadersAndEntity​(scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                                         [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity)
		```
		- #### withEntity
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") withEntity​([ResponseEntity](../../javadsl/model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Description copied from class: `[HttpResponse](../../javadsl/model/HttpResponse.html#withEntity(akka.http.javadsl.model.ResponseEntity))`
		Returns a copy of this instance with a new entity.
		
		Specified by:
		`[withEntity](../../javadsl/model/HttpResponse.html#withEntity(akka.http.javadsl.model.ResponseEntity))` in class `[HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")`
		- #### withEntity
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") withEntity​([RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity)
		```
		
		Description copied from interface: `[HttpMessage](HttpMessage.html#withEntity(akka.http.scaladsl.model.RequestEntity))`
		Returns a copy of this message with the entity set to the given one.
		
		Specified by:
		`[withEntity](HttpMessage.html#withEntity(akka.http.scaladsl.model.RequestEntity))` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		- #### withEntity
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") withEntity​([RequestEntity](../../javadsl/model/RequestEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Description copied from interface: `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.RequestEntity))`
		Returns a copy of Self message with a new entity.
		
		Specified by:
		`[withEntity](../../javadsl/model/HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.RequestEntity))` in interface `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")>`
		- #### mapEntity
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") mapEntity​(scala.Function1<[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model"),​[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model")> f)
		```
		- #### transformEntityDataBytes
		
		
		
		```
		public <T> [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") transformEntityDataBytes​(akka.stream.Graph<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>,​T> transformer)
		```
		
		Description copied from interface: `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html#transformEntityDataBytes(akka.stream.Graph))`
		Returns a copy of Self message after applying the given transformation
		
		Specified by:
		`[transformEntityDataBytes](HttpMessage.html#transformEntityDataBytes(akka.stream.Graph))` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[transformEntityDataBytes](../../javadsl/model/HttpMessage.MessageTransformations.html#transformEntityDataBytes(akka.stream.Graph))` in interface `[HttpMessage.MessageTransformations](../../javadsl/model/HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")>`
		- #### copy
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") copy​([StatusCode](StatusCode.html "class in akka.http.scaladsl.model") status,
		                         scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                         [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity,
		                         [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)
		```
		
		Deprecated.
		Use the \`withXYZ\` methods instead. Since 10\.2\.0\.
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### \_1
		
		
		
		```
		public [StatusCode](StatusCode.html "class in akka.http.scaladsl.model") _1()
		```
		- #### \_2
		
		
		
		```
		public scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> _2()
		```
		- #### \_3
		
		
		
		```
		public [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") _3()
		```
		- #### \_4
		
		
		
		```
		public [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") _4()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.MessageTransformations.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.HttpMessageScalaDSLSugar$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.HttpMessageScalaDSLSugar.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/OptHttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html)*