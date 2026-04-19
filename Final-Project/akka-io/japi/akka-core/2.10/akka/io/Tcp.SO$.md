---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:09:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.SO$.TcpNoDelay.html
title: Tcp.SO$.TcpNoDelay
---

# Tcp.SO$.TcpNoDelay

## Content

Package [akka.io](package-summary.html)
## Class Tcp.SO$.TcpNoDelay

- java.lang.Object
- - akka.io.Tcp.SO$.TcpNoDelay

- All Implemented Interfaces:
`[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Tcp.SO$](Tcp.SO$.html "class in akka.io")

---

```
public final class Tcp.SO$.TcpNoDelay
extends java.lang.Object
implements [Inet.SocketOption](Inet.SocketOption.html "interface in akka.io"), scala.Product, java.io.Serializable
```

[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable TCP\_NODELAY
 (disable or enable Nagle's algorithm)
 
 Please note, that TCP\_NODELAY is enabled by default.
 

 For more information see `java.net.Socket.setTcpNoDelay`

See Also:
[Serialized Form](../../serialized-form.html#akka.io.Tcp.SO$.TcpNoDelay)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TcpNoDelay](#%3Cinit%3E(boolean))​(boolean on)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[afterConnect](#afterConnect(java.net.Socket))​(java.net.Socket s)` | Action to be taken for this option after connect returned. |
	| `static akka.io.Tcp.SO.TcpNoDelay` | `[apply](#apply(boolean))​(boolean on)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `akka.io.Tcp.SO.TcpNoDelay` | `[copy](#copy(boolean))​(boolean on)` |  |
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
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.io.Tcp.SO.TcpNoDelay))​(akka.io.Tcp.SO.TcpNoDelay x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.io.[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")
		
		
		`[beforeConnect](Inet.SocketOption.html#beforeConnect(java.net.Socket)), [beforeDatagramBind](Inet.SocketOption.html#beforeDatagramBind(java.net.DatagramSocket)), [beforeServerSocketBind](Inet.SocketOption.html#beforeServerSocketBind(java.net.ServerSocket))`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### TcpNoDelay
		
		
		
		```
		public TcpNoDelay​(boolean on)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static akka.io.Tcp.SO.TcpNoDelay apply​(boolean on)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​(akka.io.Tcp.SO.TcpNoDelay x$0)
		```
		- #### on
		
		
		
		```
		public boolean on()
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
		public akka.io.Tcp.SO.TcpNoDelay copy​(boolean on)
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

- https://doc.akka.io/japi/akka-core/2.10/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.SO$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.SO$.TcpNoDelay.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.SO$.TcpNoDelay.html)*