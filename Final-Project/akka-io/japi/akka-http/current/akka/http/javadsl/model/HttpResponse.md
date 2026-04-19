---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
title: HttpResponse
---

# HttpResponse

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class HttpResponse

- java.lang.Object
- - akka.http.javadsl.model.HttpResponse

- All Implemented Interfaces:
`[HttpMessage](HttpMessage.html "interface in akka.http.javadsl.model")`, `[HttpMessage.MessageTransformations](HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpResponse](HttpResponse.html "class in akka.http.javadsl.model")>`

Direct Known Subclasses:
`[HttpResponse](../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")`

---

```
public abstract class HttpResponse
extends java.lang.Object
implements [HttpMessage](HttpMessage.html "interface in akka.http.javadsl.model"), [HttpMessage.MessageTransformations](HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[HttpResponse](HttpResponse.html "class in akka.http.javadsl.model")>
```

Represents an Http response.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[HttpMessage](HttpMessage.html "interface in akka.http.javadsl.model")
		
		
		`[HttpMessage.DiscardedEntity](HttpMessage.DiscardedEntity.html "interface in akka.http.javadsl.model"), [HttpMessage.MessageTransformations](HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")<[Self](HttpMessage.MessageTransformations.html "type parameter in HttpMessage.MessageTransformations")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpResponse](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpResponse](HttpResponse.html "class in akka.http.javadsl.model")` | `[create](#create())()` | Returns a default response to be changed using the \`withX\` methods. |
	| `abstract [HttpEncoding](headers/HttpEncoding.html "class in akka.http.javadsl.model.headers")` | `[encoding](#encoding())()` | Returns the content encoding as specified by the Content\-Encoding header. |
	| `abstract [ResponseEntity](ResponseEntity.html "interface in akka.http.javadsl.model")` | `[entity](#entity())()` | Returns the entity of this response. |
	| `abstract [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[status](#status())()` | Returns the status\-code of this response. |
	| `abstract [HttpResponse](HttpResponse.html "class in akka.http.javadsl.model")` | `[withEntity](#withEntity(akka.http.javadsl.model.ResponseEntity))​([ResponseEntity](ResponseEntity.html "interface in akka.http.javadsl.model") entity)` | Returns a copy of this instance with a new entity. |
	| `abstract [HttpResponse](HttpResponse.html "class in akka.http.javadsl.model")` | `[withStatus](#withStatus(int))​(int statusCode)` | Returns a copy of this instance with a new status\-code. |
	| `abstract [HttpResponse](HttpResponse.html "class in akka.http.javadsl.model")` | `[withStatus](#withStatus(akka.http.javadsl.model.StatusCode))​([StatusCode](StatusCode.html "class in akka.http.javadsl.model") statusCode)` | Returns a copy of this instance with a new status\-code. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.javadsl.model.[HttpMessage](HttpMessage.html "interface in akka.http.javadsl.model")
		
		
		`[discardEntityBytes](HttpMessage.html#discardEntityBytes(akka.actor.ClassicActorSystemProvider)), [discardEntityBytes](HttpMessage.html#discardEntityBytes(akka.stream.Materializer)), [getAttribute](HttpMessage.html#getAttribute(akka.http.javadsl.model.AttributeKey)), [getHeader](HttpMessage.html#getHeader(java.lang.Class)), [getHeader](HttpMessage.html#getHeader(java.lang.String)), [getHeaders](HttpMessage.html#getHeaders()), [getHeaders](HttpMessage.html#getHeaders(java.lang.Class)), [isRequest](HttpMessage.html#isRequest()), [isResponse](HttpMessage.html#isResponse()), [protocol](HttpMessage.html#protocol())`
		- ### Methods inherited from interface akka.http.javadsl.model.[HttpMessage.MessageTransformations](HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")
		
		
		`[addAttribute](HttpMessage.MessageTransformations.html#addAttribute(akka.http.javadsl.model.AttributeKey,T)), [addCredentials](HttpMessage.MessageTransformations.html#addCredentials(akka.http.javadsl.model.headers.HttpCredentials)), [addHeader](HttpMessage.MessageTransformations.html#addHeader(akka.http.javadsl.model.HttpHeader)), [addHeaders](HttpMessage.MessageTransformations.html#addHeaders(java.lang.Iterable)), [removeAttribute](HttpMessage.MessageTransformations.html#removeAttribute(akka.http.javadsl.model.AttributeKey)), [removeHeader](HttpMessage.MessageTransformations.html#removeHeader(java.lang.String)), [toStrict](HttpMessage.MessageTransformations.html#toStrict(long,long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpMessage.MessageTransformations.html#toStrict(long,long,java.util.concurrent.Executor,akka.stream.Materializer)), [toStrict](HttpMessage.MessageTransformations.html#toStrict(long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpMessage.MessageTransformations.html#toStrict(long,java.util.concurrent.Executor,akka.stream.Materializer)), [transformEntityDataBytes](HttpMessage.MessageTransformations.html#transformEntityDataBytes(akka.stream.Graph)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(byte%5B%5D)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType.NonBinary,java.lang.String)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,byte%5B%5D)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,akka.util.ByteString)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,java.io.File)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.ContentType,java.nio.file.Path)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.http.javadsl.model.RequestEntity)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(akka.util.ByteString)), [withEntity](HttpMessage.MessageTransformations.html#withEntity(java.lang.String)), [withHeaders](HttpMessage.MessageTransformations.html#withHeaders(java.lang.Iterable)), [withProtocol](HttpMessage.MessageTransformations.html#withProtocol(akka.http.javadsl.model.HttpProtocol))`

- - ### Constructor Detail
	
	
	
		- #### HttpResponse
		
		
		
		```
		public HttpResponse()
		```

	- ### Method Detail
	
	
	
		- #### status
		
		
		
		```
		public abstract [StatusCode](StatusCode.html "class in akka.http.javadsl.model") status()
		```
		
		Returns the status\-code of this response.
		- #### entity
		
		
		
		```
		public abstract [ResponseEntity](ResponseEntity.html "interface in akka.http.javadsl.model") entity()
		```
		
		Returns the entity of this response.
		
		Specified by:
		`[entity](HttpMessage.html#entity())` in interface `[HttpMessage](HttpMessage.html "interface in akka.http.javadsl.model")`
		- #### withStatus
		
		
		
		```
		public abstract [HttpResponse](HttpResponse.html "class in akka.http.javadsl.model") withStatus​([StatusCode](StatusCode.html "class in akka.http.javadsl.model") statusCode)
		```
		
		Returns a copy of this instance with a new status\-code.
		- #### withStatus
		
		
		
		```
		public abstract [HttpResponse](HttpResponse.html "class in akka.http.javadsl.model") withStatus​(int statusCode)
		```
		
		Returns a copy of this instance with a new status\-code.
		- #### withEntity
		
		
		
		```
		public abstract [HttpResponse](HttpResponse.html "class in akka.http.javadsl.model") withEntity​([ResponseEntity](ResponseEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Returns a copy of this instance with a new entity.
		- #### encoding
		
		
		
		```
		public abstract [HttpEncoding](headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding()
		```
		
		Returns the content encoding as specified by the Content\-Encoding header. If no Content\-Encoding header is present the
		 default value 'identity' is returned.
		- #### create
		
		
		
		```
		public static [HttpResponse](HttpResponse.html "class in akka.http.javadsl.model") create()
		```
		
		Returns a default response to be changed using the \`withX\` methods.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.MessageTransformations.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html)*