---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:47:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/Server.html
title: Server
---

# Server

## Content

Package [akka.stream](package-summary.html)
## Class Server

- java.lang.Object
- - [akka.stream.TLSRole](TLSRole.html "class in akka.stream")
	- - akka.stream.Server

- Direct Known Subclasses:
`[Server$](Server$.html "class in akka.stream")`

---

```
public abstract class Server
extends [TLSRole](TLSRole.html "class in akka.stream")
```

The server is usually the side the provides the service to its interlocutor.
 The precise interpretation of this role is protocol specific.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Server](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[TLSRole](TLSRole.html "class in akka.stream")
		
		
		`[client](TLSRole.html#client()), [server](TLSRole.html#server())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Server
		
		
		
		```
		public Server()
		```

	- ### Method Detail
	
	
	
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### hashCode
		
		
		
		```
		public static int hashCode()
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object that)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/Server$.html
- https://doc.akka.io/japi/akka/current/akka/stream/TLSRole.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/Server.html](https://doc.akka.io/japi/akka/current/akka/stream/Server.html)*