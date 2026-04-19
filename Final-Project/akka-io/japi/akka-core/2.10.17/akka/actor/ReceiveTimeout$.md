---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:45:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ReceiveTimeout$.html
title: ReceiveTimeout$
---

# ReceiveTimeout$

## Content

Package [akka.actor](package-summary.html)
## Class ReceiveTimeout$

- java.lang.Object
- - [akka.actor.ReceiveTimeout](ReceiveTimeout.html "class in akka.actor")
	- - akka.actor.ReceiveTimeout$

- All Implemented Interfaces:
`[PossiblyHarmful](PossiblyHarmful.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class ReceiveTimeout$
extends [ReceiveTimeout](ReceiveTimeout.html "class in akka.actor")
implements scala.Product, java.io.Serializable
```

When using ActorContext.setReceiveTimeout, the singleton instance of ReceiveTimeout will be sent
 to the Actor when there hasn't been any message for that long.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ReceiveTimeout$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReceiveTimeout$](ReceiveTimeout$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReceiveTimeout$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ReceiveTimeout$](ReceiveTimeout$.html "class in akka.actor")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.actor.[ReceiveTimeout](ReceiveTimeout.html "class in akka.actor")
		
		
		`[equals](ReceiveTimeout.html#equals(java.lang.Object)), [productElementName](ReceiveTimeout.html#productElementName(int)), [productElementNames](ReceiveTimeout.html#productElementNames())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReceiveTimeout$](ReceiveTimeout$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReceiveTimeout$
		
		
		
		```
		public ReceiveTimeout$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [ReceiveTimeout$](ReceiveTimeout$.html "class in akka.actor") getInstance()
		```
		
		Java API: get the singleton instance
		
		Overrides:
		`[getInstance](ReceiveTimeout.html#getInstance())` in class `[ReceiveTimeout](ReceiveTimeout.html "class in akka.actor")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](ReceiveTimeout.html#productPrefix())` in class `[ReceiveTimeout](ReceiveTimeout.html "class in akka.actor")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](ReceiveTimeout.html#productArity())` in class `[ReceiveTimeout](ReceiveTimeout.html "class in akka.actor")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](ReceiveTimeout.html#productElement(int))` in class `[ReceiveTimeout](ReceiveTimeout.html "class in akka.actor")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](ReceiveTimeout.html#productIterator())` in class `[ReceiveTimeout](ReceiveTimeout.html "class in akka.actor")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](ReceiveTimeout.html#canEqual(java.lang.Object))` in class `[ReceiveTimeout](ReceiveTimeout.html "class in akka.actor")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](ReceiveTimeout.html#hashCode())` in class `[ReceiveTimeout](ReceiveTimeout.html "class in akka.actor")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](ReceiveTimeout.html#toString())` in class `[ReceiveTimeout](ReceiveTimeout.html "class in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PossiblyHarmful.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ReceiveTimeout$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ReceiveTimeout.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ReceiveTimeout$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ReceiveTimeout$.html)*