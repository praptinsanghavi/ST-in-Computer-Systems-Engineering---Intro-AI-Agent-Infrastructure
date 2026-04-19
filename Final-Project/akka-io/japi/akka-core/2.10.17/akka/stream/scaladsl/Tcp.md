---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:54:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Tcp.ServerBinding$.html
title: Tcp.ServerBinding$
---

# Tcp.ServerBinding$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Tcp.ServerBinding$

- java.lang.Object
- - akka.stream.scaladsl.Tcp.ServerBinding$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[Tcp](Tcp.html "class in akka.stream.scaladsl")

---

```
public static class Tcp.ServerBinding$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.scaladsl.Tcp.ServerBinding$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Tcp.ServerBinding$](Tcp.ServerBinding$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServerBinding$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")` | `[apply](#apply(java.net.InetSocketAddress,scala.Function0,scala.concurrent.Future))​(java.net.InetSocketAddress localAddress,  scala.Function0<scala.concurrent.Future<scala.runtime.BoxedUnit>> unbindAction,  scala.concurrent.Future<[Done](../../Done.html "class in akka")> whenUnbound)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.net.InetSocketAddress>` | `[unapply](#unapply(akka.stream.scaladsl.Tcp.ServerBinding))​([Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Tcp.ServerBinding$](Tcp.ServerBinding$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ServerBinding$
		
		
		
		```
		public ServerBinding$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public [Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl") apply​(java.net.InetSocketAddress localAddress,
		                               scala.Function0<scala.concurrent.Future<scala.runtime.BoxedUnit>> unbindAction,
		                               scala.concurrent.Future<[Done](../../Done.html "class in akka")> whenUnbound)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.net.InetSocketAddress> unapply​([Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Tcp.ServerBinding$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Tcp.ServerBinding.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Tcp.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Tcp.ServerBinding$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Tcp.ServerBinding$.html)*