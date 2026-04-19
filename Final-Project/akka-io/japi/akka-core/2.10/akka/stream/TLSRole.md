---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:10:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/TLSRole.html
title: TLSRole
---

# TLSRole

## Content

Package [akka.stream](package-summary.html)
## Class TLSRole

- java.lang.Object
- - akka.stream.TLSRole

- Direct Known Subclasses:
`[Client](Client.html "class in akka.stream")`, `[Server](Server.html "class in akka.stream")`

---

```
public abstract class TLSRole
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TLSRole](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TLSRole](TLSRole.html "class in akka.stream")` | `[client](#client())()` | Java API: obtain the [`Client`](Client.html "class in akka.stream") singleton value. |
	| `static [TLSRole](TLSRole.html "class in akka.stream")` | `[server](#server())()` | Java API: obtain the [`Server`](Server.html "class in akka.stream") singleton value. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TLSRole
		
		
		
		```
		public TLSRole()
		```

	- ### Method Detail
	
	
	
		- #### client
		
		
		
		```
		public static [TLSRole](TLSRole.html "class in akka.stream") client()
		```
		
		Java API: obtain the [`Client`](Client.html "class in akka.stream") singleton value.
		- #### server
		
		
		
		```
		public static [TLSRole](TLSRole.html "class in akka.stream") server()
		```
		
		Java API: obtain the [`Server`](Server.html "class in akka.stream") singleton value.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Client.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Server.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/TLSRole.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/TLSRole.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/TLSRole.html)*