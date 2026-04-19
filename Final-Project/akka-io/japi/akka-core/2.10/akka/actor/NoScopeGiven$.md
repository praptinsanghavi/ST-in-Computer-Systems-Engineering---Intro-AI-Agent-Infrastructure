---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:57:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoScopeGiven$.html
title: NoScopeGiven$
---

# NoScopeGiven$

## Content

Package [akka.actor](package-summary.html)
## Class NoScopeGiven$

- java.lang.Object
- - [akka.actor.NoScopeGiven](NoScopeGiven.html "class in akka.actor")
	- - akka.actor.NoScopeGiven$

- All Implemented Interfaces:
`[Scope](Scope.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class NoScopeGiven$
extends [NoScopeGiven](NoScopeGiven.html "class in akka.actor")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.NoScopeGiven$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoScopeGiven$](NoScopeGiven$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoScopeGiven$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[NoScopeGiven$](NoScopeGiven$.html "class in akka.actor")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[Scope](Scope.html "interface in akka.actor")` | `[withFallback](#withFallback(akka.actor.Scope))​([Scope](Scope.html "interface in akka.actor") other)` |  |
	
	
		- ### Methods inherited from class akka.actor.[NoScopeGiven](NoScopeGiven.html "class in akka.actor")
		
		
		`[equals](NoScopeGiven.html#equals(java.lang.Object)), [productElementName](NoScopeGiven.html#productElementName(int)), [productElementNames](NoScopeGiven.html#productElementNames())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`
		- ### Methods inherited from interface akka.actor.[Scope](Scope.html "interface in akka.actor")
		
		
		`[withFallback](Scope.html#withFallback(akka.actor.Scope))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoScopeGiven$](NoScopeGiven$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoScopeGiven$
		
		
		
		```
		public NoScopeGiven$()
		```

	- ### Method Detail
	
	
	
		- #### withFallback
		
		
		
		```
		public [Scope](Scope.html "interface in akka.actor") withFallback​([Scope](Scope.html "interface in akka.actor") other)
		```
		
		
		Overrides:
		`[withFallback](NoScopeGiven.html#withFallback(akka.actor.Scope))` in class `[NoScopeGiven](NoScopeGiven.html "class in akka.actor")`
		- #### getInstance
		
		
		
		```
		public [NoScopeGiven$](NoScopeGiven$.html "class in akka.actor") getInstance()
		```
		
		Java API: get the singleton instance
		
		Overrides:
		`[getInstance](NoScopeGiven.html#getInstance())` in class `[NoScopeGiven](NoScopeGiven.html "class in akka.actor")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](NoScopeGiven.html#productPrefix())` in class `[NoScopeGiven](NoScopeGiven.html "class in akka.actor")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](NoScopeGiven.html#productArity())` in class `[NoScopeGiven](NoScopeGiven.html "class in akka.actor")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](NoScopeGiven.html#productElement(int))` in class `[NoScopeGiven](NoScopeGiven.html "class in akka.actor")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](NoScopeGiven.html#productIterator())` in class `[NoScopeGiven](NoScopeGiven.html "class in akka.actor")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](NoScopeGiven.html#canEqual(java.lang.Object))` in class `[NoScopeGiven](NoScopeGiven.html "class in akka.actor")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](NoScopeGiven.html#hashCode())` in class `[NoScopeGiven](NoScopeGiven.html "class in akka.actor")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](NoScopeGiven.html#toString())` in class `[NoScopeGiven](NoScopeGiven.html "class in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoScopeGiven$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoScopeGiven.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoScopeGiven$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoScopeGiven$.html)*