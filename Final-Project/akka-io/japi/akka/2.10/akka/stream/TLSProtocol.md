---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:04:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/TLSProtocol.SessionTruncated$.html
title: TLSProtocol.SessionTruncated$
---

# TLSProtocol.SessionTruncated$

## Content

Package [akka.stream](package-summary.html)
## Class TLSProtocol.SessionTruncated$

- java.lang.Object
- - [akka.stream.TLSProtocol.SessionTruncated](TLSProtocol.SessionTruncated.html "class in akka.stream")
	- - akka.stream.TLSProtocol.SessionTruncated$

- All Implemented Interfaces:
`[TLSProtocol.SslTlsInbound](TLSProtocol.SslTlsInbound.html "interface in akka.stream")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[TLSProtocol](TLSProtocol.html "class in akka.stream")

---

```
public static class TLSProtocol.SessionTruncated$
extends [TLSProtocol.SessionTruncated](TLSProtocol.SessionTruncated.html "class in akka.stream")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.TLSProtocol.SessionTruncated$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TLSProtocol.SessionTruncated$](TLSProtocol.SessionTruncated$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SessionTruncated$](#%3Cinit%3E())()` |  |

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

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TLSProtocol.SessionTruncated$](TLSProtocol.SessionTruncated$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SessionTruncated$
		
		
		
		```
		public SessionTruncated$()
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

- https://doc.akka.io/japi/akka/2.10/akka/stream/TLSProtocol.SessionTruncated$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/TLSProtocol.SessionTruncated.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/TLSProtocol.SslTlsInbound.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/TLSProtocol.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/TLSProtocol.SessionTruncated$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/TLSProtocol.SessionTruncated$.html)*