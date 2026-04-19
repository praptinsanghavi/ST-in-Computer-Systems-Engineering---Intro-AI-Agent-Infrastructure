---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:17:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/TcpOutgoingConnection$.html
title: TcpOutgoingConnection$
---

# TcpOutgoingConnection$

## Content

Package [akka.io](package-summary.html)
## Class TcpOutgoingConnection$

- java.lang.Object
- - akka.io.TcpOutgoingConnection$

- ---

```
public class TcpOutgoingConnection$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TcpOutgoingConnection$](TcpOutgoingConnection$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TcpOutgoingConnection$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.net.ConnectException` | `[connectTimeoutExpired](#connectTimeoutExpired(scala.Option))​(scala.Option<scala.concurrent.duration.FiniteDuration> timeout)` |  |
	| `java.net.ConnectException` | `[FinishConnectNeverReturnedTrueException](#FinishConnectNeverReturnedTrueException())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TcpOutgoingConnection$](TcpOutgoingConnection$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TcpOutgoingConnection$
		
		
		
		```
		public TcpOutgoingConnection$()
		```

	- ### Method Detail
	
	
	
		- #### FinishConnectNeverReturnedTrueException
		
		
		
		```
		public java.net.ConnectException FinishConnectNeverReturnedTrueException()
		```
		- #### connectTimeoutExpired
		
		
		
		```
		public java.net.ConnectException connectTimeoutExpired​(scala.Option<scala.concurrent.duration.FiniteDuration> timeout)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/TcpOutgoingConnection$.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/TcpOutgoingConnection$.html](https://doc.akka.io/japi/akka/current/akka/io/TcpOutgoingConnection$.html)*