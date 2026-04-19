---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:22:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/DiscardToDeadLetterStrategy.html
title: DiscardToDeadLetterStrategy
---

# DiscardToDeadLetterStrategy

## Content

Package [akka.persistence](package-summary.html)
## Class DiscardToDeadLetterStrategy

- java.lang.Object
- - akka.persistence.DiscardToDeadLetterStrategy

- ---

```
public class DiscardToDeadLetterStrategy
extends java.lang.Object
```

Discard the message to [`DeadLetter`](../actor/DeadLetter.html "class in akka.actor").

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DiscardToDeadLetterStrategy](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [DiscardToDeadLetterStrategy$](DiscardToDeadLetterStrategy$.html "class in akka.persistence")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
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
	
	
	
		- #### DiscardToDeadLetterStrategy
		
		
		
		```
		public DiscardToDeadLetterStrategy()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [DiscardToDeadLetterStrategy$](DiscardToDeadLetterStrategy$.html "class in akka.persistence") getInstance()
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

- https://doc.akka.io/japi/akka/current/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/DiscardToDeadLetterStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/DiscardToDeadLetterStrategy.html](https://doc.akka.io/japi/akka/current/akka/persistence/DiscardToDeadLetterStrategy.html)*