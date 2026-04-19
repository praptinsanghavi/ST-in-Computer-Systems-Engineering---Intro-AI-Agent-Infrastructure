---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest$.html
title: WebSocketRequest$
---

# WebSocketRequest$

## Content

Package [akka.http.scaladsl.model.ws](package-summary.html)
## Class WebSocketRequest$

- java.lang.Object
- - akka.http.scaladsl.model.ws.WebSocketRequest$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class WebSocketRequest$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.ws.WebSocketRequest$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WebSocketRequest$](WebSocketRequest$.html "class in akka.http.scaladsl.model.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WebSocketRequest$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws")` | `[apply](#apply(akka.http.scaladsl.model.Uri,scala.collection.immutable.Seq,scala.collection.immutable.Seq))​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,  scala.collection.immutable.Seq<[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")> extraHeaders,  scala.collection.immutable.Seq<java.lang.String> subprotocols)` |  |
	| `[WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws")` | `[fromTargetUri](#fromTargetUri(akka.http.scaladsl.model.Uri))​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri)` |  |
	| `[WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws")` | `[fromTargetUriString](#fromTargetUriString(java.lang.String))​(java.lang.String uriString)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WebSocketRequest$](WebSocketRequest$.html "class in akka.http.scaladsl.model.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WebSocketRequest$
		
		
		
		```
		public WebSocketRequest$()
		```

	- ### Method Detail
	
	
	
		- #### fromTargetUri
		
		
		
		```
		public [WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws") fromTargetUri​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri)
		```
		- #### fromTargetUriString
		
		
		
		```
		public [WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws") fromTargetUriString​(java.lang.String uriString)
		```
		- #### apply
		
		
		
		```
		public [WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws") apply​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,
		                              scala.collection.immutable.Seq<[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")> extraHeaders,
		                              scala.collection.immutable.Seq<java.lang.String> subprotocols)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest$.html)*