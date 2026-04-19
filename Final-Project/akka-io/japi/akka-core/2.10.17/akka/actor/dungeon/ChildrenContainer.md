---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:29:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/dungeon/ChildrenContainer.Termination$.html
title: ChildrenContainer.Termination$
---

# ChildrenContainer.Termination$

## Content

Package [akka.actor.dungeon](package-summary.html)
## Class ChildrenContainer.Termination$

- java.lang.Object
- - akka.actor.dungeon.ChildrenContainer.Termination$

- All Implemented Interfaces:
`[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon")

---

```
public static class ChildrenContainer.Termination$
extends java.lang.Object
implements [ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.dungeon.ChildrenContainer.Termination$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ChildrenContainer.Termination$](ChildrenContainer.Termination$.html "class in akka.actor.dungeon")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Termination$](#%3Cinit%3E())()` |  |

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
		public static final [ChildrenContainer.Termination$](ChildrenContainer.Termination$.html "class in akka.actor.dungeon") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Termination$
		
		
		
		```
		public Termination$()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/dungeon/ChildrenContainer.SuspendReason.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/dungeon/ChildrenContainer.Termination$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/dungeon/ChildrenContainer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/dungeon/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/dungeon/ChildrenContainer.Termination$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/dungeon/ChildrenContainer.Termination$.html)*