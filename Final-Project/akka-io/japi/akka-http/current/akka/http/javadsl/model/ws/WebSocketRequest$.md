---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/WebSocketRequest$.html
title: WebSocketRequest$
---

# WebSocketRequest$

## Content

Package [akka.http.javadsl.model.ws](package-summary.html)
## Class WebSocketRequest$

- java.lang.Object
- - akka.http.javadsl.model.ws.WebSocketRequest$

- ---

```
public class WebSocketRequest$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WebSocketRequest$](WebSocketRequest$.html "class in akka.http.javadsl.model.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WebSocketRequest$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws")` | `[create](#create(akka.http.javadsl.model.Uri))​([Uri](../Uri.html "class in akka.http.javadsl.model") uri)` | Creates a WebSocketRequest to a target URI. |
	| `[WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws")` | `[create](#create(java.lang.String))​(java.lang.String uriString)` | Creates a WebSocketRequest to a target URI. |
	| `[WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws")` | `[wrap](#wrap(akka.http.scaladsl.model.ws.WebSocketRequest))​([WebSocketRequest](../../../scaladsl/model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") scalaRequest)` | Wraps a Scala version of WebSocketRequest. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WebSocketRequest$](WebSocketRequest$.html "class in akka.http.javadsl.model.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WebSocketRequest$
		
		
		
		```
		public WebSocketRequest$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws") create​([Uri](../Uri.html "class in akka.http.javadsl.model") uri)
		```
		
		Creates a WebSocketRequest to a target URI. Use the methods on `WebSocketRequest`
		 to specify further details.
		
		Parameters:
		`uri` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws") create​(java.lang.String uriString)
		```
		
		Creates a WebSocketRequest to a target URI. Use the methods on `WebSocketRequest`
		 to specify further details.
		
		Parameters:
		`uriString` \- (undocumented)
		Returns:
		(undocumented)
		- #### wrap
		
		
		
		```
		public [WebSocketRequest](WebSocketRequest.html "class in akka.http.javadsl.model.ws") wrap​([WebSocketRequest](../../../scaladsl/model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") scalaRequest)
		```
		
		Wraps a Scala version of WebSocketRequest.
		
		Parameters:
		`scalaRequest` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/WebSocketRequest$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/WebSocketRequest$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/WebSocketRequest$.html)*