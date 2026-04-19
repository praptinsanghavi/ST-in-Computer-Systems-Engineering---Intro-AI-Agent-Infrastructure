---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Tcp.ServerBinding.html
title: Tcp.ServerBinding
---

# Tcp.ServerBinding

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Tcp.ServerBinding

- java.lang.Object
- - akka.stream.scaladsl.Tcp.ServerBinding

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Tcp](Tcp.html "class in akka.stream.scaladsl")

---

```
public static final class Tcp.ServerBinding
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Represents a successful TCP server binding.
 
 Not indented for user construction
 

 param: localAddress The address the server was bound to
 param: unbindAction a function that will trigger unbind of the server
 param: whenUnbound A future that is completed when the server is unbound, or failed if the server binding fails

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.scaladsl.Tcp.ServerBinding)

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")` | `[copy](#copy(java.net.InetSocketAddress,scala.Function0,scala.concurrent.Future))​(java.net.InetSocketAddress localAddress,  scala.Function0<scala.concurrent.Future<scala.runtime.BoxedUnit>> unbindAction,  scala.concurrent.Future<[Done](../../Done.html "class in akka")> whenUnbound)` |  |
	| `java.net.InetSocketAddress` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.net.InetSocketAddress` | `[localAddress](#localAddress())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[unbind](#unbind())()` |  |
	| `scala.concurrent.Future<[Done](../../Done.html "class in akka")>` | `[whenUnbound](#whenUnbound())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Method Detail
	
	
	
		- #### localAddress
		
		
		
		```
		public java.net.InetSocketAddress localAddress()
		```
		- #### whenUnbound
		
		
		
		```
		public scala.concurrent.Future<[Done](../../Done.html "class in akka")> whenUnbound()
		```
		- #### unbind
		
		
		
		```
		public scala.concurrent.Future<scala.runtime.BoxedUnit> unbind()
		```
		- #### copy
		
		
		
		```
		public [Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl") copy​(java.net.InetSocketAddress localAddress,
		                              scala.Function0<scala.concurrent.Future<scala.runtime.BoxedUnit>> unbindAction,
		                              scala.concurrent.Future<[Done](../../Done.html "class in akka")> whenUnbound)
		```
		- #### copy$default$1
		
		
		
		```
		public java.net.InetSocketAddress copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Tcp.ServerBinding.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Tcp.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Tcp.ServerBinding.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Tcp.ServerBinding.html)*