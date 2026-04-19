---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:56:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/RecoveryCompleted$.html
title: RecoveryCompleted$
---

# RecoveryCompleted$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class RecoveryCompleted$

- java.lang.Object
- - [akka.persistence.typed.RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")
	- - akka.persistence.typed.RecoveryCompleted$

- All Implemented Interfaces:
`[Signal](../../actor/typed/Signal.html "interface in akka.actor.typed")`, `[EventSourcedSignal](EventSourcedSignal.html "interface in akka.persistence.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class RecoveryCompleted$
extends [RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.RecoveryCompleted$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecoveryCompleted$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")` | `[instance](#instance())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.typed.[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")
		
		
		`[equals](RecoveryCompleted.html#equals(java.lang.Object)), [productElementName](RecoveryCompleted.html#productElementName(int)), [productElementNames](RecoveryCompleted.html#productElementNames())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RecoveryCompleted$
		
		
		
		```
		public RecoveryCompleted$()
		```

	- ### Method Detail
	
	
	
		- #### instance
		
		
		
		```
		public [RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed") instance()
		```
		
		
		Overrides:
		`[instance](RecoveryCompleted.html#instance())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](RecoveryCompleted.html#productPrefix())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](RecoveryCompleted.html#productArity())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](RecoveryCompleted.html#productElement(int))` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](RecoveryCompleted.html#productIterator())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](RecoveryCompleted.html#canEqual(java.lang.Object))` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](RecoveryCompleted.html#hashCode())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](RecoveryCompleted.html#toString())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/RecoveryCompleted$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/RecoveryCompleted.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/RecoveryCompleted$.html](https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/RecoveryCompleted$.html)*