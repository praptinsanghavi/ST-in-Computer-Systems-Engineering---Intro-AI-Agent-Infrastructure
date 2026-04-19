---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:22:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/RecoveryCompleted$.html
title: RecoveryCompleted$
---

# RecoveryCompleted$

## Content

Package [akka.persistence](package-summary.html)
## Class RecoveryCompleted$

- java.lang.Object
- - [akka.persistence.RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence")
	- - akka.persistence.RecoveryCompleted$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class RecoveryCompleted$
extends [RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence")
implements scala.Product, java.io.Serializable
```

Sent to a [`PersistentActor`](PersistentActor.html "interface in akka.persistence") when the journal replay has been finished.

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.RecoveryCompleted$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecoveryCompleted$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence")
		
		
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
		public static final [RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RecoveryCompleted$
		
		
		
		```
		public RecoveryCompleted$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence") getInstance()
		```
		
		Java API: get the singleton instance
		
		Overrides:
		`[getInstance](RecoveryCompleted.html#getInstance())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](RecoveryCompleted.html#productPrefix())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](RecoveryCompleted.html#productArity())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](RecoveryCompleted.html#productElement(int))` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](RecoveryCompleted.html#productIterator())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](RecoveryCompleted.html#canEqual(java.lang.Object))` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](RecoveryCompleted.html#hashCode())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](RecoveryCompleted.html#toString())` in class `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/RecoveryCompleted$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/RecoveryCompleted.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/RecoveryCompleted$.html](https://doc.akka.io/japi/akka/current/akka/persistence/RecoveryCompleted$.html)*