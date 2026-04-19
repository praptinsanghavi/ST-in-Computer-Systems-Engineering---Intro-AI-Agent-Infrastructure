---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RemoteAddress.html
title: RemoteAddress
---

# RemoteAddress

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class RemoteAddress

- java.lang.Object
- - akka.http.javadsl.model.RemoteAddress

- Direct Known Subclasses:
`[RemoteAddress](../../scaladsl/model/RemoteAddress.html "class in akka.http.scaladsl.model")`

---

```
public abstract class RemoteAddress
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteAddress](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RemoteAddress](RemoteAddress.html "class in akka.http.javadsl.model")` | `[create](#create(byte%5B%5D))​(byte[] address)` |  |
	| `static [RemoteAddress](RemoteAddress.html "class in akka.http.javadsl.model")` | `[create](#create(java.net.InetAddress))​(java.net.InetAddress address)` |  |
	| `static [RemoteAddress](RemoteAddress.html "class in akka.http.javadsl.model")` | `[create](#create(java.net.InetSocketAddress))​(java.net.InetSocketAddress address)` |  |
	| `abstract java.util.Optional<java.net.InetAddress>` | `[getAddress](#getAddress())()` |  |
	| `abstract int` | `[getPort](#getPort())()` | Returns a port if defined or 0 otherwise. |
	| `abstract boolean` | `[isUnknown](#isUnknown())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RemoteAddress
		
		
		
		```
		public RemoteAddress()
		```

	- ### Method Detail
	
	
	
		- #### isUnknown
		
		
		
		```
		public abstract boolean isUnknown()
		```
		- #### getAddress
		
		
		
		```
		public abstract java.util.Optional<java.net.InetAddress> getAddress()
		```
		- #### getPort
		
		
		
		```
		public abstract int getPort()
		```
		
		Returns a port if defined or 0 otherwise.
		- #### create
		
		
		
		```
		public static [RemoteAddress](RemoteAddress.html "class in akka.http.javadsl.model") create​(java.net.InetAddress address)
		```
		- #### create
		
		
		
		```
		public static [RemoteAddress](RemoteAddress.html "class in akka.http.javadsl.model") create​(java.net.InetSocketAddress address)
		```
		- #### create
		
		
		
		```
		public static [RemoteAddress](RemoteAddress.html "class in akka.http.javadsl.model") create​(byte[] address)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RemoteAddress.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RemoteAddress.html)*