---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:00:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterScope.html
title: ClusterScope
---

# ClusterScope

## Content

Package [akka.cluster](package-summary.html)
## Class ClusterScope

- java.lang.Object
- - akka.cluster.ClusterScope

- All Implemented Interfaces:
`[Scope](../actor/Scope.html "interface in akka.actor")`

Direct Known Subclasses:
`[ClusterScope$](ClusterScope$.html "class in akka.cluster")`

---

```
public abstract class ClusterScope
extends java.lang.Object
implements [Scope](../actor/Scope.html "interface in akka.actor")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterScope](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [ClusterScope$](ClusterScope$.html "class in akka.cluster")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static [Scope](../actor/Scope.html "interface in akka.actor")` | `[withFallback](#withFallback(akka.actor.Scope))​([Scope](../actor/Scope.html "interface in akka.actor") other)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Scope](../actor/Scope.html "interface in akka.actor")
		
		
		`[withFallback](../actor/Scope.html#withFallback(akka.actor.Scope))`

- - ### Constructor Detail
	
	
	
		- #### ClusterScope
		
		
		
		```
		public ClusterScope()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [ClusterScope$](ClusterScope$.html "class in akka.cluster") getInstance()
		```
		
		Java API: get the singleton instance
		- #### withFallback
		
		
		
		```
		public static [Scope](../actor/Scope.html "interface in akka.actor") withFallback​([Scope](../actor/Scope.html "interface in akka.actor") other)
		```
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### hashCode
		
		
		
		```
		public static int hashCode()
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object that)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterScope$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterScope.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterScope.html)*