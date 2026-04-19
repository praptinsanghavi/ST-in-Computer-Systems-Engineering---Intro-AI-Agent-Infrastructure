---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/LocalScope.html
title: LocalScope
---

# LocalScope

## Content

Package [akka.actor](package-summary.html)
## Class LocalScope

- java.lang.Object
- - akka.actor.LocalScope

- All Implemented Interfaces:
`[Scope](Scope.html "interface in akka.actor")`

Direct Known Subclasses:
`[LocalScope$](LocalScope$.html "class in akka.actor")`

---

```
public abstract class LocalScope
extends java.lang.Object
implements [Scope](Scope.html "interface in akka.actor")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LocalScope](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [LocalScope$](LocalScope$.html "class in akka.actor")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static [Scope](Scope.html "interface in akka.actor")` | `[withFallback](#withFallback(akka.actor.Scope))​([Scope](Scope.html "interface in akka.actor") other)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Scope](Scope.html "interface in akka.actor")
		
		
		`[withFallback](Scope.html#withFallback(akka.actor.Scope))`

- - ### Constructor Detail
	
	
	
		- #### LocalScope
		
		
		
		```
		public LocalScope()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [LocalScope$](LocalScope$.html "class in akka.actor") getInstance()
		```
		
		Java API: get the singleton instance
		- #### withFallback
		
		
		
		```
		public static [Scope](Scope.html "interface in akka.actor") withFallback​([Scope](Scope.html "interface in akka.actor") other)
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

- https://doc.akka.io/japi/akka/current/akka/actor/LocalScope$.html
- https://doc.akka.io/japi/akka/current/akka/actor/Scope.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/LocalScope.html](https://doc.akka.io/japi/akka/current/akka/actor/LocalScope.html)*