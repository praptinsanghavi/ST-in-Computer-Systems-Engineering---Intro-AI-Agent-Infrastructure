---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:44:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpConnected.SuspendReading$.html
title: UdpConnected.SuspendReading$
---

# UdpConnected.SuspendReading$

## Content

Package [akka.io](package-summary.html)
## Class UdpConnected.SuspendReading$

- java.lang.Object
- - akka.io.UdpConnected.SuspendReading$

- All Implemented Interfaces:
`akka.io.SelectionHandler.HasFailureMessage`, `[UdpConnected.Command](UdpConnected.Command.html "interface in akka.io")`, `[UdpConnected.Message](UdpConnected.Message.html "interface in akka.io")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[UdpConnected](UdpConnected.html "class in akka.io")

---

```
public static class UdpConnected.SuspendReading$
extends java.lang.Object
implements [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io"), scala.Product, java.io.Serializable
```

Send this message to a listener actor (which sent a [`Udp.Bound`](Udp.Bound.html "class in akka.io") message) to
 have it stop reading datagrams from the network. If the O/S kernel\&rsquo;s receive
 buffer runs full then subsequent datagrams will be silently discarded.
 Re\-enable reading from the socket using the `ResumeReading` command.

See Also:
[Serialized Form](../../serialized-form.html#akka.io.UdpConnected.SuspendReading$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UdpConnected.SuspendReading$](UdpConnected.SuspendReading$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SuspendReading$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`
		- ### Methods inherited from interface akka.io.[UdpConnected.Command](UdpConnected.Command.html "interface in akka.io")
		
		
		`[failureMessage](UdpConnected.Command.html#failureMessage())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UdpConnected.SuspendReading$](UdpConnected.SuspendReading$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SuspendReading$
		
		
		
		```
		public SuspendReading$()
		```

	- ### Method Detail
	
	
	
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Udp.Bound.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpConnected.Command.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpConnected.Message.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpConnected.SuspendReading$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpConnected.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpConnected.SuspendReading$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpConnected.SuspendReading$.html)*