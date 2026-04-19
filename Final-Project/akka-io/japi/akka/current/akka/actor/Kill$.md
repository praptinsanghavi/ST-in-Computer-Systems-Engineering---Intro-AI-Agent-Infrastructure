---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/Kill$.html
title: Kill$
---

# Kill$

## Content

Package [akka.actor](package-summary.html)
## Class Kill$

- java.lang.Object
- - [akka.actor.Kill](Kill.html "class in akka.actor")
	- - akka.actor.Kill$

- All Implemented Interfaces:
`[AutoReceivedMessage](AutoReceivedMessage.html "interface in akka.actor")`, `[PossiblyHarmful](PossiblyHarmful.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class Kill$
extends [Kill](Kill.html "class in akka.actor")
implements scala.Product, java.io.Serializable
```

A message all Actors will understand, that when processed will make the Actor throw an ActorKilledException,
 which will trigger supervision.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Kill$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Kill$](Kill$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Kill$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Kill$](Kill$.html "class in akka.actor")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.actor.[Kill](Kill.html "class in akka.actor")
		
		
		`[equals](Kill.html#equals(java.lang.Object)), [productElementName](Kill.html#productElementName(int)), [productElementNames](Kill.html#productElementNames())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Kill$](Kill$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Kill$
		
		
		
		```
		public Kill$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [Kill$](Kill$.html "class in akka.actor") getInstance()
		```
		
		Java API: get the singleton instance
		
		Overrides:
		`[getInstance](Kill.html#getInstance())` in class `[Kill](Kill.html "class in akka.actor")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](Kill.html#productPrefix())` in class `[Kill](Kill.html "class in akka.actor")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](Kill.html#productArity())` in class `[Kill](Kill.html "class in akka.actor")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](Kill.html#productElement(int))` in class `[Kill](Kill.html "class in akka.actor")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](Kill.html#productIterator())` in class `[Kill](Kill.html "class in akka.actor")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](Kill.html#canEqual(java.lang.Object))` in class `[Kill](Kill.html "class in akka.actor")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](Kill.html#hashCode())` in class `[Kill](Kill.html "class in akka.actor")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](Kill.html#toString())` in class `[Kill](Kill.html "class in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/AutoReceivedMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/Kill$.html
- https://doc.akka.io/japi/akka/current/akka/actor/Kill.html
- https://doc.akka.io/japi/akka/current/akka/actor/PossiblyHarmful.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/Kill$.html](https://doc.akka.io/japi/akka/current/akka/actor/Kill$.html)*