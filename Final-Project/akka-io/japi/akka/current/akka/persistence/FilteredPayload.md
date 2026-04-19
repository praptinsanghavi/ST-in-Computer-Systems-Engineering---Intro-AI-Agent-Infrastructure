---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:22:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/FilteredPayload.html
title: FilteredPayload
---

# FilteredPayload

## Content

Package [akka.persistence](package-summary.html)
## Class FilteredPayload

- java.lang.Object
- - akka.persistence.FilteredPayload

- ---

```
public class FilteredPayload
extends java.lang.Object
```

In some use cases with projections and events by slice filtered events needs to be stored in the journal
 to keep the sequence numbers for a given persistence id gap free. This placeholder payload is used for those
 cases and serialized down to a 0\-byte representation when stored in the database.
 
 This payload is not in general expected to show up for users but in some scenarios/queries it may.
 

 In the typed queries `EventEnvelope` this should be flagged as `filtered` and turned into a non\-present payload
 by the query plugin implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FilteredPayload](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
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
	
	
	
		- #### FilteredPayload
		
		
		
		```
		public FilteredPayload()
		```

	- ### Method Detail
	
	
	
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

- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/FilteredPayload.html](https://doc.akka.io/japi/akka/current/akka/persistence/FilteredPayload.html)*