---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.ResumeReading$.html
title: UdpConnected.ResumeReading$
---

# UdpConnected.ResumeReading$

## Content

Package [akka.io](package-summary.html)
## Class UdpConnected.ResumeReading$

- java.lang.Object
- - akka.io.UdpConnected.ResumeReading$

- All Implemented Interfaces:
`akka.io.SelectionHandler.HasFailureMessage`, `[UdpConnected.Command](UdpConnected.Command.html "interface in akka.io")`, `[UdpConnected.Message](UdpConnected.Message.html "interface in akka.io")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[UdpConnected](UdpConnected.html "class in akka.io")

---

```
public static class UdpConnected.ResumeReading$
extends java.lang.Object
implements [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io"), scala.Product, java.io.Serializable
```

This message must be sent to the listener actor to re\-enable reading from
 the socket after a `SuspendReading` command.

See Also:
[Serialized Form](../../serialized-form.html#akka.io.UdpConnected.ResumeReading$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UdpConnected.ResumeReading$](UdpConnected.ResumeReading$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResumeReading$](#%3Cinit%3E())()` |  |

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
		public static final [UdpConnected.ResumeReading$](UdpConnected.ResumeReading$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ResumeReading$
		
		
		
		```
		public ResumeReading$()
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

- https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.Command.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.Message.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.ResumeReading$.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.ResumeReading$.html](https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.ResumeReading$.html)*