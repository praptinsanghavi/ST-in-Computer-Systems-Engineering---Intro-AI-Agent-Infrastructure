---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:43:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SO$.TrafficClass.html
title: Inet.SO$.TrafficClass
---

# Inet.SO$.TrafficClass

## Content

Package [akka.io](package-summary.html)
## Class Inet.SO$.TrafficClass

- java.lang.Object
- - akka.io.Inet.SO$.TrafficClass

- All Implemented Interfaces:
`[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Inet.SO$](Inet.SO$.html "class in akka.io")

---

```
public final class Inet.SO$.TrafficClass
extends java.lang.Object
implements [Inet.SocketOption](Inet.SocketOption.html "interface in akka.io"), scala.Product, java.io.Serializable
```

[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the traffic class or
 type\-of\-service octet in the IP header for packets sent from this
 socket.
 
 For more information see `Socket.setTrafficClass(int)`

See Also:
[Serialized Form](../../serialized-form.html#akka.io.Inet.SO$.TrafficClass)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TrafficClass](#%3Cinit%3E(int))​(int tc)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[afterConnect](#afterConnect(java.net.Socket))​(java.net.Socket s)` | Action to be taken for this option after connect returned. |
	| `static akka.io.Inet.SO.TrafficClass` | `[apply](#apply(int))​(int tc)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `akka.io.Inet.SO.TrafficClass` | `[copy](#copy(int))​(int tc)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `int` | `[tc](#tc())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.io.Inet.SO.TrafficClass))​(akka.io.Inet.SO.TrafficClass x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.io.[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")
		
		
		`[beforeConnect](Inet.SocketOption.html#beforeConnect(java.net.Socket)), [beforeDatagramBind](Inet.SocketOption.html#beforeDatagramBind(java.net.DatagramSocket)), [beforeServerSocketBind](Inet.SocketOption.html#beforeServerSocketBind(java.net.ServerSocket))`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### TrafficClass
		
		
		
		```
		public TrafficClass​(int tc)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static akka.io.Inet.SO.TrafficClass apply​(int tc)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​(akka.io.Inet.SO.TrafficClass x$0)
		```
		- #### tc
		
		
		
		```
		public int tc()
		```
		- #### afterConnect
		
		
		
		```
		public void afterConnect​(java.net.Socket s)
		```
		
		Description copied from interface: `[Inet.SocketOption](Inet.SocketOption.html#afterConnect(java.net.Socket))`
		Action to be taken for this option after connect returned.
		
		Specified by:
		`[afterConnect](Inet.SocketOption.html#afterConnect(java.net.Socket))` in interface `[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")`
		- #### copy
		
		
		
		```
		public akka.io.Inet.SO.TrafficClass copy​(int tc)
		```
		- #### copy$default$1
		
		
		
		```
		public int copy$default$1()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SO$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SO$.TrafficClass.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SO$.TrafficClass.html)*