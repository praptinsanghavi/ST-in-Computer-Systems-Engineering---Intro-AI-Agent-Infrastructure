---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Srv$.html
title: DnsProtocol.Srv$
---

# DnsProtocol.Srv$

## Content

Package [akka.io.dns](package-summary.html)
## Class DnsProtocol.Srv$

- java.lang.Object
- - akka.io.dns.DnsProtocol.Srv$

- All Implemented Interfaces:
`[DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[DnsProtocol](DnsProtocol.html "class in akka.io.dns")

---

```
public static class DnsProtocol.Srv$
extends java.lang.Object
implements [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.io.dns.DnsProtocol.Srv$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DnsProtocol.Srv$](DnsProtocol.Srv$.html "class in akka.io.dns")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Srv$](#%3Cinit%3E())()` |  |

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
		public static final [DnsProtocol.Srv$](DnsProtocol.Srv$.html "class in akka.io.dns") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Srv$
		
		
		
		```
		public Srv$()
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

- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.RequestType.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Srv$.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Srv$.html](https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Srv$.html)*