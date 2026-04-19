---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:50:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocket.html
title: WebSocket
---

# WebSocket

## Content

Package [akka.http.javadsl.model.ws](package-summary.html)
## Class WebSocket

- java.lang.Object
- - akka.http.javadsl.model.ws.WebSocket

- ---

```
public class WebSocket
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WebSocket](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpResponse](../HttpResponse.html "class in akka.http.javadsl.model")` | `[handleWebSocketRequestWith](#handleWebSocketRequestWith(akka.http.javadsl.model.HttpRequest,akka.stream.javadsl.Flow))​([HttpRequest](../HttpRequest.html "class in akka.http.javadsl.model") request,  akka.stream.javadsl.Flow<[Message](Message.html "class in akka.http.javadsl.model.ws"),​[Message](Message.html "class in akka.http.javadsl.model.ws"),​?> handler)` | If a given request is a WebSocket request a response accepting the request is returned using the given handler to  handle the WebSocket message stream. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### WebSocket
		
		
		
		```
		public WebSocket()
		```

	- ### Method Detail
	
	
	
		- #### handleWebSocketRequestWith
		
		
		
		```
		public static [HttpResponse](../HttpResponse.html "class in akka.http.javadsl.model") handleWebSocketRequestWith​([HttpRequest](../HttpRequest.html "class in akka.http.javadsl.model") request,
		                                                      akka.stream.javadsl.Flow<[Message](Message.html "class in akka.http.javadsl.model.ws"),​[Message](Message.html "class in akka.http.javadsl.model.ws"),​?> handler)
		```
		
		If a given request is a WebSocket request a response accepting the request is returned using the given handler to
		 handle the WebSocket message stream. If the request wasn't a WebSocket request a response with status code 400 is
		 returned.
		
		Parameters:
		`request` \- (undocumented)
		`handler` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocket.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocket.html)*