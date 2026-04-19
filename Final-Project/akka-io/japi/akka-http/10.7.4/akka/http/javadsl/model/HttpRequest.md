---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
title: HttpRequest
---

# HttpRequest

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class HttpRequest

- java.lang.Object
- - akka.http.javadsl.model.HttpRequest

- All Implemented Interfaces:
`[HttpMessage](HttpMessage.html "interface in akka.http.javadsl.model")`, `[HttpMessage.MessageTransformations](HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")>`

Direct Known Subclasses:
`[HttpRequest](../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")`

---

```
public abstract class HttpRequest
extends java.lang.Object
implements [HttpMessage](HttpMessage.html "interface in akka.http.javadsl.model"), [HttpMessage.MessageTransformations](HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")>
```

Represents an Http request.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[HttpMessage](HttpMessage.html "interface in akka.http.javadsl.model")
		
		
		`[HttpMessage.DiscardedEntity](HttpMessage.DiscardedEntity.html "interface in akka.http.javadsl.model"), [HttpMessage.MessageTransformations](HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[Self](HttpMessage.MessageTransformations.html "type parameter in HttpMessage.MessageTransformations")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpRequest](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[create](#create())()` | Returns a default request to be modified using the \`withX\` methods. |
	| `static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[create](#create(java.lang.String))​(java.lang.String uri)` | Returns a default request to the specified URI to be modified using the \`withX\` methods. |
	| `static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[DELETE](#DELETE(java.lang.String))​(java.lang.String uri)` | A default DELETE request to be modified using the \`withX\` methods. |
	| `abstract [RequestEntity](RequestEntity.html "interface in akka.http.javadsl.model")` | `[entity](#entity())()` | Returns the entity of this request. |
	| `static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[GET](#GET(java.lang.String))​(java.lang.String uri)` | A default GET request to be modified using the \`withX\` methods. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[getUri](#getUri())()` | Returns the Uri of this request. |
	| `static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[HEAD](#HEAD(java.lang.String))​(java.lang.String uri)` | A default HEAD request to be modified using the \`withX\` methods. |
	| `abstract [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")` | `[method](#method())()` | Returns the Http method of this request. |
	| `static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[OPTIONS](#OPTIONS(java.lang.String))​(java.lang.String uri)` | A default OPTIONS request to be modified using the \`withX\` methods. |
	| `static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[PATCH](#PATCH(java.lang.String))​(java.lang.String uri)` | A default PATCH request to be modified using the \`withX\` methods. |
	| `static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[POST](#POST(java.lang.String))​(java.lang.String uri)` | A default POST request to be modified using the \`withX\` methods. |
	| `static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[PUT](#PUT(java.lang.String))​(java.lang.String uri)` | A default PUT request to be modified using the \`withX\` methods. |
	| `abstract [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[withEntity](#withEntity(akka.http.javadsl.model.RequestEntity))​([RequestEntity](RequestEntity.html "interface in akka.http.javadsl.model") entity)` | Returns a copy of this instance with a new entity. |
	| `abstract [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[withMethod](#withMethod(akka.http.javadsl.model.HttpMethod))​([HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") method)` | Returns a copy of this instance with a new method. |
	| `abstract [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[withUri](#withUri(akka.http.javadsl.model.Uri))​([Uri](Uri.html "class in akka.http.javadsl.model") relativeUri)` | Returns a copy of this instance with a new Uri. |
	| `abstract [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")` | `[withUri](#withUri(java.lang.String))​(java.lang.String path)` | Returns a copy of this instance with a new Uri. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.javadsl.model.[HttpMessage](HttpMessage.html "interface in akka.http.javadsl.model")
		
		
		`[discardEntityBytes](HttpMessage.html#discardEntityBytes(akka.actor.ClassicActorSystemProvider)), [discardEntityBytes](HttpMessage.html#discardEntityBytes(akka.stream.Materializer)), [getAttribute](HttpMessage.html#getAttribute(akka.http.javadsl.model.AttributeKey)), [getHeader](HttpMessage.html#getHeader(java.lang.Class)), [getHeader](HttpMessage.html#getHeader(java.lang.String)), [getHeaders](HttpMessage.html#getHeaders()), [getHeaders](HttpMessage.html#getHeaders(java.lang.Class)), [isRequest](HttpMessage.html#isRequest()), [isResponse](HttpMessage.html#isResponse()), [protocol](HttpMessage.html#protocol())`
		- ### Methods inherited from interface akka.http.javadsl.model.[HttpMessage.MessageTransformations](HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")
		
		
		`[addAttribute](HttpMessage.MessageTransformations.html#addAttribute(akka.http.javadsl.model.AttributeKey,T)), [addCredentials](HttpMessage.MessageTransformations.html#addCredentials(akka.http.javadsl.model.headers.HttpCredentials)), [addHeader](HttpMessage.MessageTransformations.html#addHeader(akka.http.javadsl.model.HttpHeader)), [addHeaders](HttpMessage.MessageTransformations.html#addHeaders(java.lang.Iterable)), [removeAttribute](HttpMessage.MessageTransformations.html#removeAttribute(akka.http.javadsl.model.AttributeKey)), [removeHeader](HttpMessage.MessageTransformations.html#removeHeader(java.lang.String)), [toStrict](HttpMessage.MessageTransformations.html#toStrict(long,long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpMessage.MessageTransformations.html#toStrict(long,long,java.util.concurrent.Executor,akka.stream.Materializer)), [toStrict](HttpMessage.MessageTransformations.html#toStrict(long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpMessage.MessageTransformations.html#toStrict(long,java.util.concurrent.Executor,akka.stream.Materializer)), [transformEntityDataBytes](HttpMessage.MessageTransformations.html#transformEntityDataBytes(akka.stream.Graph)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(byte%5B%5D)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType.NonBinary,java.lang.String)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,byte%5B%5D)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,akka.util.ByteString)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,java.io.File)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,java.nio.file.Path)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.util.ByteString)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(java.lang.String)), [withHeaders](HttpMessage.MessageTransformations.html#withHeaders(java.lang.Iterable)), [withProtocol](HttpMessage.MessageTransformations.html#withProtocol(akka.http.javadsl.model.HttpProtocol))`

- - ### Constructor Detail
	
	
	
		- #### HttpRequest
		
		
		
		```
		public HttpRequest()
		```

	- ### Method Detail
	
	
	
		- #### method
		
		
		
		```
		public abstract [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") method()
		```
		
		Returns the Http method of this request.
		- #### getUri
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") getUri()
		```
		
		Returns the Uri of this request.
		- #### entity
		
		
		
		```
		public abstract [RequestEntity](RequestEntity.html "interface in akka.http.javadsl.model") entity()
		```
		
		Returns the entity of this request.
		
		Specified by:
		`[entity](HttpMessage.html#entity())` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.javadsl.model")`
		- #### withMethod
		
		
		
		```
		public abstract [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") withMethod​([HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") method)
		```
		
		Returns a copy of this instance with a new method.
		- #### withUri
		
		
		
		```
		public abstract [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") withUri​([Uri](Uri.html "class in akka.http.javadsl.model") relativeUri)
		```
		
		Returns a copy of this instance with a new Uri.
		- #### withUri
		
		
		
		```
		public abstract [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") withUri​(java.lang.String path)
		```
		
		Returns a copy of this instance with a new Uri.
		- #### withEntity
		
		
		
		```
		public abstract [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") withEntity​([RequestEntity](RequestEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Returns a copy of this instance with a new entity.
		
		Specified by:
		`[withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.RequestEntity))` in interface `[HttpMessage.MessageTransformations](HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpRequest](HttpRequest.html "class in akka.http.javadsl.model")>`
		- #### create
		
		
		
		```
		public static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") create()
		```
		
		Returns a default request to be modified using the \`withX\` methods.
		- #### create
		
		
		
		```
		public static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") create​(java.lang.String uri)
		```
		
		Returns a default request to the specified URI to be modified using the \`withX\` methods.
		- #### GET
		
		
		
		```
		public static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") GET​(java.lang.String uri)
		```
		
		A default GET request to be modified using the \`withX\` methods.
		- #### POST
		
		
		
		```
		public static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") POST​(java.lang.String uri)
		```
		
		A default POST request to be modified using the \`withX\` methods.
		- #### PUT
		
		
		
		```
		public static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") PUT​(java.lang.String uri)
		```
		
		A default PUT request to be modified using the \`withX\` methods.
		- #### DELETE
		
		
		
		```
		public static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") DELETE​(java.lang.String uri)
		```
		
		A default DELETE request to be modified using the \`withX\` methods.
		- #### HEAD
		
		
		
		```
		public static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") HEAD​(java.lang.String uri)
		```
		
		A default HEAD request to be modified using the \`withX\` methods.
		- #### PATCH
		
		
		
		```
		public static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") PATCH​(java.lang.String uri)
		```
		
		A default PATCH request to be modified using the \`withX\` methods.
		- #### OPTIONS
		
		
		
		```
		public static [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") OPTIONS​(java.lang.String uri)
		```
		
		A default OPTIONS request to be modified using the \`withX\` methods.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMessage.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMessage.MessageTransformations.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html)*