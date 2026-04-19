---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor.Reset$.html
title: BackoffSupervisor.Reset$
---

# BackoffSupervisor.Reset$

## Content

Package [akka.pattern](package-summary.html)
## Class BackoffSupervisor.Reset$

- java.lang.Object
- - akka.pattern.BackoffSupervisor.Reset$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[BackoffSupervisor](BackoffSupervisor.html "class in akka.pattern")

---

```
public static class BackoffSupervisor.Reset$
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Send this message to the `BackoffSupervisor` and it will reset the back\-off.
 This should be used in conjunction with `withManualReset` in `BackoffOptions`.

See Also:
[Serialized Form](../../serialized-form.html#akka.pattern.BackoffSupervisor.Reset$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BackoffSupervisor.Reset$](BackoffSupervisor.Reset$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Reset$](#%3Cinit%3E())()` |  |

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
		public static final [BackoffSupervisor.Reset$](BackoffSupervisor.Reset$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Reset$
		
		
		
		```
		public Reset$()
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

- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor.Reset$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor.Reset$.html](https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor.Reset$.html)*