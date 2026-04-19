---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testkit/Direction.Receive$.html
title: Direction.Receive$
---

# Direction.Receive$

## Content

Package [akka.remote.testkit](package-summary.html)
## Class Direction.Receive$

- java.lang.Object
- - akka.remote.testkit.Direction.Receive$

- All Implemented Interfaces:
`[Direction](Direction.html "interface in akka.remote.testkit")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[Direction](Direction.html "interface in akka.remote.testkit")

---

```
public static class Direction.Receive$
extends java.lang.Object
implements [Direction](Direction.html "interface in akka.remote.testkit"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testkit.Direction.Receive$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.remote.testkit.[Direction](Direction.html "interface in akka.remote.testkit")
		
		
		`[Direction.Both$](Direction.Both$.html "class in akka.remote.testkit"), [Direction.Receive$](Direction.Receive$.html "class in akka.remote.testkit"), [Direction.Send$](Direction.Send$.html "class in akka.remote.testkit")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Direction.Receive$](Direction.Receive$.html "class in akka.remote.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Receive$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Direction](Direction.html "interface in akka.remote.testkit")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[includes](#includes(akka.remote.testkit.Direction))​([Direction](Direction.html "interface in akka.remote.testkit") other)` |  |
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
		public static final [Direction.Receive$](Direction.Receive$.html "class in akka.remote.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Receive$
		
		
		
		```
		public Receive$()
		```

	- ### Method Detail
	
	
	
		- #### includes
		
		
		
		```
		public boolean includes​([Direction](Direction.html "interface in akka.remote.testkit") other)
		```
		
		
		Specified by:
		`[includes](Direction.html#includes(akka.remote.testkit.Direction))` in interface `[Direction](Direction.html "interface in akka.remote.testkit")`
		- #### getInstance
		
		
		
		```
		public [Direction](Direction.html "interface in akka.remote.testkit") getInstance()
		```
		
		Java API: get the singleton instance
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

- https://doc.akka.io/japi/akka/current/akka/remote/testkit/Direction.Both$.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/Direction.Receive$.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/Direction.Send$.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/Direction.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testkit/Direction.Receive$.html](https://doc.akka.io/japi/akka/current/akka/remote/testkit/Direction.Receive$.html)*