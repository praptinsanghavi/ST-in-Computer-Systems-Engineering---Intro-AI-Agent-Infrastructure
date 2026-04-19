---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:45:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PoisonPill$.html
title: PoisonPill$
---

# PoisonPill$

## Content

Package [akka.actor](package-summary.html)
## Class PoisonPill$

- java.lang.Object
- - [akka.actor.PoisonPill](PoisonPill.html "class in akka.actor")
	- - akka.actor.PoisonPill$

- All Implemented Interfaces:
`[AutoReceivedMessage](AutoReceivedMessage.html "interface in akka.actor")`, `[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor")`, `[PossiblyHarmful](PossiblyHarmful.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class PoisonPill$
extends [PoisonPill](PoisonPill.html "class in akka.actor")
implements scala.Product, java.io.Serializable
```

A message all Actors will understand, that when processed will terminate the Actor permanently.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.PoisonPill$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PoisonPill$](PoisonPill$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PoisonPill$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[PoisonPill$](PoisonPill$.html "class in akka.actor")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.actor.[PoisonPill](PoisonPill.html "class in akka.actor")
		
		
		`[equals](PoisonPill.html#equals(java.lang.Object)), [productElementName](PoisonPill.html#productElementName(int)), [productElementNames](PoisonPill.html#productElementNames())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PoisonPill$](PoisonPill$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PoisonPill$
		
		
		
		```
		public PoisonPill$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [PoisonPill$](PoisonPill$.html "class in akka.actor") getInstance()
		```
		
		Java API: get the singleton instance
		
		Overrides:
		`[getInstance](PoisonPill.html#getInstance())` in class `[PoisonPill](PoisonPill.html "class in akka.actor")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](PoisonPill.html#productPrefix())` in class `[PoisonPill](PoisonPill.html "class in akka.actor")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](PoisonPill.html#productArity())` in class `[PoisonPill](PoisonPill.html "class in akka.actor")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](PoisonPill.html#productElement(int))` in class `[PoisonPill](PoisonPill.html "class in akka.actor")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](PoisonPill.html#productIterator())` in class `[PoisonPill](PoisonPill.html "class in akka.actor")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](PoisonPill.html#canEqual(java.lang.Object))` in class `[PoisonPill](PoisonPill.html "class in akka.actor")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](PoisonPill.html#hashCode())` in class `[PoisonPill](PoisonPill.html "class in akka.actor")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](PoisonPill.html#toString())` in class `[PoisonPill](PoisonPill.html "class in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AutoReceivedMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PoisonPill$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PossiblyHarmful.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PoisonPill$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PoisonPill$.html)*