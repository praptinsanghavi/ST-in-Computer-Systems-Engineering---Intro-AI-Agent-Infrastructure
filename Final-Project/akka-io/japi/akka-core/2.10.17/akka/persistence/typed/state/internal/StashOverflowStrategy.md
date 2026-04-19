---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:50:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/internal/StashOverflowStrategy.Drop$.html
title: StashOverflowStrategy.Drop$
---

# StashOverflowStrategy.Drop$

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class StashOverflowStrategy.Drop$

- java.lang.Object
- - akka.persistence.typed.state.internal.StashOverflowStrategy.Drop$

- All Implemented Interfaces:
`[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.state.internal")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.state.internal")

---

```
public static class StashOverflowStrategy.Drop$
extends java.lang.Object
implements [StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.state.internal"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.persistence.typed.state.internal.StashOverflowStrategy.Drop$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.persistence.typed.state.internal.[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.state.internal")
		
		
		`[StashOverflowStrategy.Drop$](StashOverflowStrategy.Drop$.html "class in akka.persistence.typed.state.internal"), [StashOverflowStrategy.Fail$](StashOverflowStrategy.Fail$.html "class in akka.persistence.typed.state.internal")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StashOverflowStrategy.Drop$](StashOverflowStrategy.Drop$.html "class in akka.persistence.typed.state.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Drop$](#%3Cinit%3E())()` |  |

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
		public static final [StashOverflowStrategy.Drop$](StashOverflowStrategy.Drop$.html "class in akka.persistence.typed.state.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Drop$
		
		
		
		```
		public Drop$()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/internal/StashOverflowStrategy.Drop$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/internal/StashOverflowStrategy.Fail$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/internal/StashOverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/internal/StashOverflowStrategy.Drop$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/internal/StashOverflowStrategy.Drop$.html)*