---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:29:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/persistence/ThrowOverflowExceptionStrategy.html
title: ThrowOverflowExceptionStrategy
---

# ThrowOverflowExceptionStrategy

## Content

Package [akka.persistence](package-summary.html)
## Class ThrowOverflowExceptionStrategy

- java.lang.Object
- - akka.persistence.ThrowOverflowExceptionStrategy

- ---

```
public class ThrowOverflowExceptionStrategy
extends java.lang.Object
```

Throw [`StashOverflowException`](../actor/StashOverflowException.html "class in akka.actor"), hence the persistent actor will starting recovery
 if guarded by default supervisor strategy.
 Be carefully if used together with persist/persistAll or has many messages needed
 to replay.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThrowOverflowExceptionStrategy](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [ThrowOverflowExceptionStrategy$](ThrowOverflowExceptionStrategy$.html "class in akka.persistence")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ThrowOverflowExceptionStrategy
		
		
		
		```
		public ThrowOverflowExceptionStrategy()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [ThrowOverflowExceptionStrategy$](ThrowOverflowExceptionStrategy$.html "class in akka.persistence") getInstance()
		```
		
		Java API: get the singleton instance
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

- https://doc.akka.io/japi/akka/2.8/akka/actor/StashOverflowException.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/ThrowOverflowExceptionStrategy$.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/persistence/ThrowOverflowExceptionStrategy.html](https://doc.akka.io/japi/akka/2.8/akka/persistence/ThrowOverflowExceptionStrategy.html)*