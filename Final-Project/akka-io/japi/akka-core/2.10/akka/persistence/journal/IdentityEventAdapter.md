---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:08:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/IdentityEventAdapter.html
title: IdentityEventAdapter
---

# IdentityEventAdapter

## Content

Package [akka.persistence.journal](package-summary.html)
## Class IdentityEventAdapter

- java.lang.Object
- - akka.persistence.journal.IdentityEventAdapter

- ---

```
public class IdentityEventAdapter
extends java.lang.Object
```

No\-op model adapter which passes through the incoming events as\-is.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IdentityEventAdapter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[fromJournal](#fromJournal(java.lang.Object,java.lang.String))​(java.lang.Object event,  java.lang.String manifest)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static java.lang.String` | `[manifest](#manifest(java.lang.Object))​(java.lang.Object event)` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.Object` | `[toJournal](#toJournal(java.lang.Object))​(java.lang.Object event)` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### IdentityEventAdapter
		
		
		
		```
		public IdentityEventAdapter()
		```

	- ### Method Detail
	
	
	
		- #### toJournal
		
		
		
		```
		public static java.lang.Object toJournal​(java.lang.Object event)
		```
		- #### fromJournal
		
		
		
		```
		public static [EventSeq](EventSeq.html "class in akka.persistence.journal") fromJournal​(java.lang.Object event,
		                                   java.lang.String manifest)
		```
		- #### manifest
		
		
		
		```
		public static java.lang.String manifest​(java.lang.Object event)
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

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/IdentityEventAdapter.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/IdentityEventAdapter.html)*