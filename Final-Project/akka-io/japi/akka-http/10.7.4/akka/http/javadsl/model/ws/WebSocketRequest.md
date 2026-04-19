---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:47:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketRequest.html
title: WebSocketRequest
---

# WebSocketRequest

## Content

Package [akka.http.javadsl.model.ws](package-summary.html)
## Class WebSocketRequest

- java.lang.Object
- - akka.http.javadsl.model.ws.WebSocketRequest

- ---

```
public abstract class WebSocketRequest
extends java.lang.Object
```

Represents a WebSocket request. Use `WebSocketRequest.create` to create a request
 for a target URI and then use `addHeader` or `requestSubprotocol` to set optional
 details.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WebSocketRequest](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws")` | `[addHeader](#addHeader(akka.http.javadsl.model.HttpHeader))​([HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model") header)` | Return a copy of this request that contains the given additional header. |
	| `abstract [WebSocketRequest](../../../scaladsl/model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws")` | `[asScala](#asScala())()` |  |
	| `static [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws")` | `[create](#create(akka.http.javadsl.model.Uri))​([Uri](../Uri.html "class in akka.http.javadsl.model") uri)` | Creates a WebSocketRequest to a target URI. |
	| `static [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws")` | `[create](#create(java.lang.String))​(java.lang.String uriString)` | Creates a WebSocketRequest to a target URI. |
	| `abstract [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws")` | `[requestSubprotocol](#requestSubprotocol(java.lang.String))​(java.lang.String subprotocol)` | Return a copy of this request that will require that the server uses the  given WebSocket subprotocol. |
	| `static [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws")` | `[wrap](#wrap(akka.http.scaladsl.model.ws.WebSocketRequest))​([WebSocketRequest](../../../scaladsl/model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") scalaRequest)` | Wraps a Scala version of WebSocketRequest. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### WebSocketRequest
		
		
		
		```
		public WebSocketRequest()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws") create​([Uri](../Uri.html "class in akka.http.javadsl.model") uri)
		```
		
		Creates a WebSocketRequest to a target URI. Use the methods on `WebSocketRequest`
		 to specify further details.
		
		Parameters:
		`uri` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public static [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws") create​(java.lang.String uriString)
		```
		
		Creates a WebSocketRequest to a target URI. Use the methods on `WebSocketRequest`
		 to specify further details.
		
		Parameters:
		`uriString` \- (undocumented)
		Returns:
		(undocumented)
		- #### wrap
		
		
		
		```
		public static [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws") wrap​([WebSocketRequest](../../../scaladsl/model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") scalaRequest)
		```
		
		Wraps a Scala version of WebSocketRequest.
		
		Parameters:
		`scalaRequest` \- (undocumented)
		Returns:
		(undocumented)
		- #### addHeader
		
		
		
		```
		public abstract [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws") addHeader​([HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model") header)
		```
		
		Return a copy of this request that contains the given additional header.
		
		Parameters:
		`header` \- (undocumented)
		Returns:
		(undocumented)
		- #### requestSubprotocol
		
		
		
		```
		public abstract [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws") requestSubprotocol​(java.lang.String subprotocol)
		```
		
		Return a copy of this request that will require that the server uses the
		 given WebSocket subprotocol.
		
		Parameters:
		`subprotocol` \- (undocumented)
		Returns:
		(undocumented)
		- #### asScala
		
		
		
		```
		public abstract [WebSocketRequest](../../../scaladsl/model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") asScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketRequest.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketRequest.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketRequest.html)*