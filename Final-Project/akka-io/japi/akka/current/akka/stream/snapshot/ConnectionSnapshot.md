---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/snapshot/ConnectionSnapshot.ShouldPush$.html
title: ConnectionSnapshot.ShouldPush$
---

# ConnectionSnapshot.ShouldPush$

## Content

Package [akka.stream.snapshot](package-summary.html)
## Class ConnectionSnapshot.ShouldPush$

- java.lang.Object
- - akka.stream.snapshot.ConnectionSnapshot.ShouldPush$

- All Implemented Interfaces:
`[ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[ConnectionSnapshot](ConnectionSnapshot.html "interface in akka.stream.snapshot")

---

```
public static class ConnectionSnapshot.ShouldPush$
extends java.lang.Object
implements [ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.snapshot.ConnectionSnapshot.ShouldPush$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConnectionSnapshot.ShouldPush$](ConnectionSnapshot.ShouldPush$.html "class in akka.stream.snapshot")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShouldPush$](#%3Cinit%3E())()` |  |

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
		public static final [ConnectionSnapshot.ShouldPush$](ConnectionSnapshot.ShouldPush$.html "class in akka.stream.snapshot") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShouldPush$
		
		
		
		```
		public ShouldPush$()
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

- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/ConnectionSnapshot.ConnectionState.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/ConnectionSnapshot.ShouldPush$.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/ConnectionSnapshot.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/snapshot/ConnectionSnapshot.ShouldPush$.html](https://doc.akka.io/japi/akka/current/akka/stream/snapshot/ConnectionSnapshot.ShouldPush$.html)*