---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:44:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Udp.SO$.Broadcast.html
title: Udp.SO$.Broadcast
---

# Udp.SO$.Broadcast

## Content

Package [akka.io](package-summary.html)
## Class Udp.SO$.Broadcast

- java.lang.Object
- - akka.io.Udp.SO$.Broadcast

- All Implemented Interfaces:
`[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Udp.SO$](Udp.SO$.html "class in akka.io")

---

```
public final class Udp.SO$.Broadcast
extends java.lang.Object
implements [Inet.SocketOption](Inet.SocketOption.html "interface in akka.io"), scala.Product, java.io.Serializable
```

[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_BROADCAST option
 
 For more information see `DatagramSocket.setBroadcast(boolean)`

See Also:
[Serialized Form](../../serialized-form.html#akka.io.Udp.SO$.Broadcast)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Broadcast](#%3Cinit%3E(boolean))​(boolean on)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.io.Udp.SO.Broadcast` | `[apply](#apply(boolean))​(boolean on)` |  |
	| `void` | `[beforeDatagramBind](#beforeDatagramBind(java.net.DatagramSocket))​(java.net.DatagramSocket s)` | Action to be taken for this option before bind() is called |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `akka.io.Udp.SO.Broadcast` | `[copy](#copy(boolean))​(boolean on)` |  |
	| `boolean` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[on](#on())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.io.Udp.SO.Broadcast))​(akka.io.Udp.SO.Broadcast x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.io.[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")
		
		
		`[afterConnect](Inet.SocketOption.html#afterConnect(java.net.Socket)), [beforeConnect](Inet.SocketOption.html#beforeConnect(java.net.Socket)), [beforeServerSocketBind](Inet.SocketOption.html#beforeServerSocketBind(java.net.ServerSocket))`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Broadcast
		
		
		
		```
		public Broadcast​(boolean on)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static akka.io.Udp.SO.Broadcast apply​(boolean on)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​(akka.io.Udp.SO.Broadcast x$0)
		```
		- #### on
		
		
		
		```
		public boolean on()
		```
		- #### beforeDatagramBind
		
		
		
		```
		public void beforeDatagramBind​(java.net.DatagramSocket s)
		```
		
		Description copied from interface: `[Inet.SocketOption](Inet.SocketOption.html#beforeDatagramBind(java.net.DatagramSocket))`
		Action to be taken for this option before bind() is called
		
		Specified by:
		`[beforeDatagramBind](Inet.SocketOption.html#beforeDatagramBind(java.net.DatagramSocket))` in interface `[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")`
		- #### copy
		
		
		
		```
		public akka.io.Udp.SO.Broadcast copy​(boolean on)
		```
		- #### copy$default$1
		
		
		
		```
		public boolean copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Udp.SO$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Udp.SO$.Broadcast.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Udp.SO$.Broadcast.html)*