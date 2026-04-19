---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKeys$.html
title: AttributeKeys$
---

# AttributeKeys$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class AttributeKeys$

- java.lang.Object
- - akka.http.scaladsl.model.AttributeKeys$

- ---

```
public class AttributeKeys$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AttributeKeys$](AttributeKeys$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AttributeKeys$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<[RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model")>` | `[remoteAddress](#remoteAddress())()` |  |
	| `[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<[SslSessionInfo](SslSessionInfo.html "class in akka.http.scaladsl.model")>` | `[sslSession](#sslSession())()` |  |
	| `[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<[Trailer](Trailer.html "class in akka.http.scaladsl.model")>` | `[trailer](#trailer())()` |  |
	| `[AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<[WebSocketUpgrade](ws/WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")>` | `[webSocketUpgrade](#webSocketUpgrade())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AttributeKeys$](AttributeKeys$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AttributeKeys$
		
		
		
		```
		public AttributeKeys$()
		```

	- ### Method Detail
	
	
	
		- #### remoteAddress
		
		
		
		```
		public [AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<[RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model")> remoteAddress()
		```
		- #### webSocketUpgrade
		
		
		
		```
		public [AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<[WebSocketUpgrade](ws/WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")> webSocketUpgrade()
		```
		- #### sslSession
		
		
		
		```
		public [AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<[SslSessionInfo](SslSessionInfo.html "class in akka.http.scaladsl.model")> sslSession()
		```
		- #### trailer
		
		
		
		```
		public [AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<[Trailer](Trailer.html "class in akka.http.scaladsl.model")> trailer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKeys$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/SslSessionInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Trailer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgrade.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKeys$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKeys$.html)*