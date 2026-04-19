---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:48:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/TLSRole$.html
title: TLSRole$
---

# TLSRole$

## Content

Package [akka.stream](package-summary.html)
## Class TLSRole$

- java.lang.Object
- - akka.stream.TLSRole$

- ---

```
public class TLSRole$
extends java.lang.Object
```

Many protocols are asymmetric and distinguish between the client and the
 server, where the latter listens passively for messages and the former
 actively initiates the exchange.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TLSRole$](TLSRole$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TLSRole$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TLSRole](TLSRole.html "class in akka.stream")` | `[client](#client())()` | Java API: obtain the [`Client`](Client.html "class in akka.stream") singleton value. |
	| `[TLSRole](TLSRole.html "class in akka.stream")` | `[server](#server())()` | Java API: obtain the [`Server`](Server.html "class in akka.stream") singleton value. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TLSRole$](TLSRole$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TLSRole$
		
		
		
		```
		public TLSRole$()
		```

	- ### Method Detail
	
	
	
		- #### client
		
		
		
		```
		public [TLSRole](TLSRole.html "class in akka.stream") client()
		```
		
		Java API: obtain the [`Client`](Client.html "class in akka.stream") singleton value.
		- #### server
		
		
		
		```
		public [TLSRole](TLSRole.html "class in akka.stream") server()
		```
		
		Java API: obtain the [`Server`](Server.html "class in akka.stream") singleton value.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/Client.html
- https://doc.akka.io/japi/akka/current/akka/stream/Server.html
- https://doc.akka.io/japi/akka/current/akka/stream/TLSRole$.html
- https://doc.akka.io/japi/akka/current/akka/stream/TLSRole.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/TLSRole$.html](https://doc.akka.io/japi/akka/current/akka/stream/TLSRole$.html)*