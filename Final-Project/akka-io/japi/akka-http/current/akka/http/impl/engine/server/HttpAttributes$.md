---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpAttributes$.html
title: HttpAttributes$
---

# HttpAttributes$

## Content

Package [akka.http.impl.engine.server](package-summary.html)
## Class HttpAttributes$

- java.lang.Object
- - akka.http.impl.engine.server.HttpAttributes$

- ---

```
public class HttpAttributes$
extends java.lang.Object
```

INTERNAL API
 Internally used attributes set in the HTTP pipeline.
 May potentially be opened up in the future.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpAttributes$](HttpAttributes$.html "class in akka.http.impl.engine.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpAttributes$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.Attributes` | `[empty](#empty())()` |  |
	| `akka.stream.Attributes` | `[remoteAddress](#remoteAddress(java.net.InetSocketAddress))​(java.net.InetSocketAddress address)` |  |
	| `akka.stream.Attributes` | `[remoteAddress](#remoteAddress(scala.Option))​(scala.Option<java.net.InetSocketAddress> address)` |  |
	| `akka.stream.Attributes` | `[tlsSessionInfo](#tlsSessionInfo(javax.net.ssl.SSLSession))​(javax.net.ssl.SSLSession session)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpAttributes$](HttpAttributes$.html "class in akka.http.impl.engine.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpAttributes$
		
		
		
		```
		public HttpAttributes$()
		```

	- ### Method Detail
	
	
	
		- #### remoteAddress
		
		
		
		```
		public akka.stream.Attributes remoteAddress​(scala.Option<java.net.InetSocketAddress> address)
		```
		- #### remoteAddress
		
		
		
		```
		public akka.stream.Attributes remoteAddress​(java.net.InetSocketAddress address)
		```
		- #### tlsSessionInfo
		
		
		
		```
		public akka.stream.Attributes tlsSessionInfo​(javax.net.ssl.SSLSession session)
		```
		- #### empty
		
		
		
		```
		public akka.stream.Attributes empty()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpAttributes$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpAttributes$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpAttributes$.html)*