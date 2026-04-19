---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:43:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/EmptyEventSeq.html
title: EmptyEventSeq
---

# EmptyEventSeq

## Content

Package [akka.persistence.typed](package-summary.html)
## Class EmptyEventSeq

- java.lang.Object
- - akka.persistence.typed.EmptyEventSeq

- ---

```
public class EmptyEventSeq
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EmptyEventSeq](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static scala.collection.immutable.Seq<scala.runtime.Nothing$>` | `[events](#events())()` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static boolean` | `[isEmpty](#isEmpty())()` |  |
	| `static boolean` | `[nonEmpty](#nonEmpty())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static int` | `[size](#size())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EmptyEventSeq
		
		
		
		```
		public EmptyEventSeq()
		```

	- ### Method Detail
	
	
	
		- #### events
		
		
		
		```
		public static scala.collection.immutable.Seq<scala.runtime.Nothing$> events()
		```
		- #### size
		
		
		
		```
		public static int size()
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
		- #### isEmpty
		
		
		
		```
		public static boolean isEmpty()
		```
		- #### nonEmpty
		
		
		
		```
		public static boolean nonEmpty()
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

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/EmptyEventSeq.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/EmptyEventSeq.html)*