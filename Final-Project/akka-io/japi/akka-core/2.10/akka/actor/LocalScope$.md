---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:57:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/LocalScope$.html
title: LocalScope$
---

# LocalScope$

## Content

Package [akka.actor](package-summary.html)
## Class LocalScope$

- java.lang.Object
- - [akka.actor.LocalScope](LocalScope.html "class in akka.actor")
	- - akka.actor.LocalScope$

- All Implemented Interfaces:
`[Scope](Scope.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class LocalScope$
extends [LocalScope](LocalScope.html "class in akka.actor")
implements scala.Product, java.io.Serializable
```

The Local Scope is the default one, which is assumed on all deployments
 which do not set a different scope. It is also the only scope handled by
 the LocalActorRefProvider.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.LocalScope$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LocalScope$](LocalScope$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LocalScope$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[LocalScope$](LocalScope$.html "class in akka.actor")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[Scope](Scope.html "interface in akka.actor")` | `[withFallback](#withFallback(akka.actor.Scope))​([Scope](Scope.html "interface in akka.actor") other)` |  |
	
	
		- ### Methods inherited from class akka.actor.[LocalScope](LocalScope.html "class in akka.actor")
		
		
		`[equals](LocalScope.html#equals(java.lang.Object)), [productElementName](LocalScope.html#productElementName(int)), [productElementNames](LocalScope.html#productElementNames())`
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
		public static final [LocalScope$](LocalScope$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LocalScope$
		
		
		
		```
		public LocalScope$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [LocalScope$](LocalScope$.html "class in akka.actor") getInstance()
		```
		
		Java API: get the singleton instance
		
		Overrides:
		`[getInstance](LocalScope.html#getInstance())` in class `[LocalScope](LocalScope.html "class in akka.actor")`
		- #### withFallback
		
		
		
		```
		public [Scope](Scope.html "interface in akka.actor") withFallback​([Scope](Scope.html "interface in akka.actor") other)
		```
		
		
		Overrides:
		`[withFallback](LocalScope.html#withFallback(akka.actor.Scope))` in class `[LocalScope](LocalScope.html "class in akka.actor")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](LocalScope.html#productPrefix())` in class `[LocalScope](LocalScope.html "class in akka.actor")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](LocalScope.html#productArity())` in class `[LocalScope](LocalScope.html "class in akka.actor")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](LocalScope.html#productElement(int))` in class `[LocalScope](LocalScope.html "class in akka.actor")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](LocalScope.html#productIterator())` in class `[LocalScope](LocalScope.html "class in akka.actor")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](LocalScope.html#canEqual(java.lang.Object))` in class `[LocalScope](LocalScope.html "class in akka.actor")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](LocalScope.html#hashCode())` in class `[LocalScope](LocalScope.html "class in akka.actor")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](LocalScope.html#toString())` in class `[LocalScope](LocalScope.html "class in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/LocalScope$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/LocalScope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/LocalScope$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/LocalScope$.html)*