---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest.html
title: WebSocketRequest
---

# WebSocketRequest

## Content

Package [akka.http.scaladsl.model.ws](package-summary.html)
## Class WebSocketRequest

- java.lang.Object
- - akka.http.scaladsl.model.ws.WebSocketRequest

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class WebSocketRequest
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Represents a WebSocket request.
 param: uri The target URI to connect to.
 param: extraHeaders Extra headers to add to the WebSocket request.
 param: subprotocol WebSocket subprotocols (comma separated) if required.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.ws.WebSocketRequest)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WebSocketRequest](#%3Cinit%3E(akka.http.scaladsl.model.Uri,scala.collection.immutable.Seq,scala.Option))​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,  scala.collection.immutable.Seq<[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")> extraHeaders,  scala.Option<java.lang.String> subprotocol)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws")` | `[apply](#apply(akka.http.scaladsl.model.Uri,scala.collection.immutable.Seq,scala.collection.immutable.Seq))​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,  scala.collection.immutable.Seq<[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")> extraHeaders,  scala.collection.immutable.Seq<java.lang.String> subprotocols)` |  |
	| `scala.collection.immutable.Seq<[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")>` | `[extraHeaders](#extraHeaders())()` |  |
	| `static [WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws")` | `[fromTargetUri](#fromTargetUri(akka.http.scaladsl.model.Uri))​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri)` |  |
	| `static [WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws")` | `[fromTargetUriString](#fromTargetUriString(java.lang.String))​(java.lang.String uriString)` |  |
	| `scala.Option<java.lang.String>` | `[subprotocol](#subprotocol())()` |  |
	| `[Uri](../Uri.html "class in akka.http.scaladsl.model")` | `[uri](#uri())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### WebSocketRequest
		
		
		
		```
		public WebSocketRequest​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,
		                        scala.collection.immutable.Seq<[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")> extraHeaders,
		                        scala.Option<java.lang.String> subprotocol)
		```

	- ### Method Detail
	
	
	
		- #### fromTargetUri
		
		
		
		```
		public static [WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws") fromTargetUri​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri)
		```
		- #### fromTargetUriString
		
		
		
		```
		public static [WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws") fromTargetUriString​(java.lang.String uriString)
		```
		- #### apply
		
		
		
		```
		public static [WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws") apply​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,
		                                     scala.collection.immutable.Seq<[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")> extraHeaders,
		                                     scala.collection.immutable.Seq<java.lang.String> subprotocols)
		```
		- #### uri
		
		
		
		```
		public [Uri](../Uri.html "class in akka.http.scaladsl.model") uri()
		```
		- #### extraHeaders
		
		
		
		```
		public scala.collection.immutable.Seq<[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")> extraHeaders()
		```
		- #### subprotocol
		
		
		
		```
		public scala.Option<java.lang.String> subprotocol()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest.html)*