---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted$.html
title: RecoveryCompleted$
---

# RecoveryCompleted$

## Content

Package [akka.persistence.typed.state](package-summary.html)
## Class RecoveryCompleted$

- java.lang.Object
- - [akka.persistence.typed.state.RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")
	- - akka.persistence.typed.state.RecoveryCompleted$

- All Implemented Interfaces:
`[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")`, `[DurableStateSignal](DurableStateSignal.html "interface in akka.persistence.typed.state")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class RecoveryCompleted$
extends [RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.state.RecoveryCompleted$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence.typed.state")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecoveryCompleted$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")` | `[instance](#instance())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.typed.state.[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")
		
		
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
		public static final [RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence.typed.state") MODULE$
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
		public [RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state") instance()
		```
		
		
		Overrides:
		`[instance](RecoveryCompleted.html#instance())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](RecoveryCompleted.html#productPrefix())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](RecoveryCompleted.html#productArity())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](RecoveryCompleted.html#productElement(int))` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](RecoveryCompleted.html#productIterator())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](RecoveryCompleted.html#canEqual(java.lang.Object))` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](RecoveryCompleted.html#hashCode())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](RecoveryCompleted.html#toString())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/DurableStateSignal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted$.html)*