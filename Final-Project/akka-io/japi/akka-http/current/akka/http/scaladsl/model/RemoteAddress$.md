---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:32:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress$.html
title: RemoteAddress$
---

# RemoteAddress$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class RemoteAddress$

- java.lang.Object
- - akka.http.scaladsl.model.RemoteAddress$

- ---

```
public class RemoteAddress$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RemoteAddress$](RemoteAddress$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteAddress$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model")` | `[apply](#apply(byte%5B%5D))​(byte[] bytes)` |  |
	| `[RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.net.InetAddress,scala.Option))​(java.net.InetAddress a,  scala.Option<java.lang.Object> port)` |  |
	| `[RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.net.InetSocketAddress))​(java.net.InetSocketAddress a)` |  |
	| `java.lang.Object` | `[renderWithoutPort](#renderWithoutPort())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RemoteAddress$](RemoteAddress$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RemoteAddress$
		
		
		
		```
		public RemoteAddress$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model") apply​(java.net.InetAddress a,
		                              scala.Option<java.lang.Object> port)
		```
		- #### apply
		
		
		
		```
		public [RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model") apply​(java.net.InetSocketAddress a)
		```
		- #### apply
		
		
		
		```
		public [RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model") apply​(byte[] bytes)
		```
		- #### renderWithoutPort
		
		
		
		```
		public java.lang.Object renderWithoutPort()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.IP.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress$.html)*