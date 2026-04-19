---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:51:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterScope$.html
title: ClusterScope$
---

# ClusterScope$

## Content

Package [akka.cluster](package-summary.html)
## Class ClusterScope$

- java.lang.Object
- - [akka.cluster.ClusterScope](ClusterScope.html "class in akka.cluster")
	- - akka.cluster.ClusterScope$

- All Implemented Interfaces:
`[Scope](../actor/Scope.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class ClusterScope$
extends [ClusterScope](ClusterScope.html "class in akka.cluster")
implements scala.Product, java.io.Serializable
```

Cluster aware scope of a [`Deploy`](../actor/Deploy.html "class in akka.actor")

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.ClusterScope$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterScope$](ClusterScope$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterScope$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ClusterScope$](ClusterScope$.html "class in akka.cluster")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[Scope](../actor/Scope.html "interface in akka.actor")` | `[withFallback](#withFallback(akka.actor.Scope))​([Scope](../actor/Scope.html "interface in akka.actor") other)` |  |
	
	
		- ### Methods inherited from class akka.cluster.[ClusterScope](ClusterScope.html "class in akka.cluster")
		
		
		`[equals](ClusterScope.html#equals(java.lang.Object)), [productElementName](ClusterScope.html#productElementName(int)), [productElementNames](ClusterScope.html#productElementNames())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`
		- ### Methods inherited from interface akka.actor.[Scope](../actor/Scope.html "interface in akka.actor")
		
		
		`[withFallback](../actor/Scope.html#withFallback(akka.actor.Scope))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterScope$](ClusterScope$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterScope$
		
		
		
		```
		public ClusterScope$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [ClusterScope$](ClusterScope$.html "class in akka.cluster") getInstance()
		```
		
		Java API: get the singleton instance
		
		Overrides:
		`[getInstance](ClusterScope.html#getInstance())` in class `[ClusterScope](ClusterScope.html "class in akka.cluster")`
		- #### withFallback
		
		
		
		```
		public [Scope](../actor/Scope.html "interface in akka.actor") withFallback​([Scope](../actor/Scope.html "interface in akka.actor") other)
		```
		
		
		Overrides:
		`[withFallback](ClusterScope.html#withFallback(akka.actor.Scope))` in class `[ClusterScope](ClusterScope.html "class in akka.cluster")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](ClusterScope.html#productPrefix())` in class `[ClusterScope](ClusterScope.html "class in akka.cluster")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](ClusterScope.html#productArity())` in class `[ClusterScope](ClusterScope.html "class in akka.cluster")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](ClusterScope.html#productElement(int))` in class `[ClusterScope](ClusterScope.html "class in akka.cluster")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](ClusterScope.html#productIterator())` in class `[ClusterScope](ClusterScope.html "class in akka.cluster")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](ClusterScope.html#canEqual(java.lang.Object))` in class `[ClusterScope](ClusterScope.html "class in akka.cluster")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](ClusterScope.html#hashCode())` in class `[ClusterScope](ClusterScope.html "class in akka.cluster")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](ClusterScope.html#toString())` in class `[ClusterScope](ClusterScope.html "class in akka.cluster")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/Deploy.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/Scope.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterScope$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterScope.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterScope$.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterScope$.html)*