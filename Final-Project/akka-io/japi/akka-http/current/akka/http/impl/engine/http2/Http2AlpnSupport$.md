---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2AlpnSupport$.html
title: Http2AlpnSupport$
---

# Http2AlpnSupport$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2AlpnSupport$

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2AlpnSupport$

- ---

```
public class Http2AlpnSupport$
extends java.lang.Object
```

INTERNAL API
 
 Will add support to an engine either using jetty alpn or using netty APIs (later).

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http2AlpnSupport$](Http2AlpnSupport$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2AlpnSupport$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[clientSetApplicationProtocols](#clientSetApplicationProtocols(javax.net.ssl.SSLEngine,java.lang.String%5B%5D))​(javax.net.ssl.SSLEngine engine,  java.lang.String[] protocols)` |  |
	| `javax.net.ssl.SSLEngine` | `[enableForServer](#enableForServer(javax.net.ssl.SSLEngine,scala.Function1))​(javax.net.ssl.SSLEngine engine,  scala.Function1<java.lang.String,​scala.runtime.BoxedUnit> setChosenProtocol)` | Enables server\-side Http/2 ALPN support for the given engine. |
	| `java.lang.String` | `[H2](#H2())()` |  |
	| `java.lang.String` | `[HTTP11](#HTTP11())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http2AlpnSupport$](Http2AlpnSupport$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Http2AlpnSupport$
		
		
		
		```
		public Http2AlpnSupport$()
		```

	- ### Method Detail
	
	
	
		- #### H2
		
		
		
		```
		public java.lang.String H2()
		```
		- #### HTTP11
		
		
		
		```
		public java.lang.String HTTP11()
		```
		- #### enableForServer
		
		
		
		```
		public javax.net.ssl.SSLEngine enableForServer​(javax.net.ssl.SSLEngine engine,
		                                               scala.Function1<java.lang.String,​scala.runtime.BoxedUnit> setChosenProtocol)
		```
		
		Enables server\-side Http/2 ALPN support for the given engine.
		
		Parameters:
		`engine` \- (undocumented)
		`setChosenProtocol` \- (undocumented)
		Returns:
		(undocumented)
		- #### clientSetApplicationProtocols
		
		
		
		```
		public void clientSetApplicationProtocols​(javax.net.ssl.SSLEngine engine,
		                                          java.lang.String[] protocols)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2AlpnSupport$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2AlpnSupport$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2AlpnSupport$.html)*