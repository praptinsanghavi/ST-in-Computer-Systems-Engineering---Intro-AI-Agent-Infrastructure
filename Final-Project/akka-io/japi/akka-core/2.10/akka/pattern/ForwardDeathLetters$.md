---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:11:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ForwardDeathLetters$.html
title: ForwardDeathLetters$
---

# ForwardDeathLetters$

## Content

Package [akka.pattern](package-summary.html)
## Class ForwardDeathLetters$

- java.lang.Object
- - akka.pattern.ForwardDeathLetters$

- All Implemented Interfaces:
`[HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class ForwardDeathLetters$
extends java.lang.Object
implements [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.pattern.ForwardDeathLetters$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ForwardDeathLetters$](ForwardDeathLetters$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ForwardDeathLetters$](#%3Cinit%3E())()` |  |

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
		public static final [ForwardDeathLetters$](ForwardDeathLetters$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ForwardDeathLetters$
		
		
		
		```
		public ForwardDeathLetters$()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ForwardDeathLetters$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/HandlingWhileStopped.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ForwardDeathLetters$.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ForwardDeathLetters$.html)*