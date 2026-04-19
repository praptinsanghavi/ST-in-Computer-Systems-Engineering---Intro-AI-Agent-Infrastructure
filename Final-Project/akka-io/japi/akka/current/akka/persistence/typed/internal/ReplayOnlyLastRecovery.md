---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplayOnlyLastRecovery.html
title: ReplayOnlyLastRecovery
---

# ReplayOnlyLastRecovery

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class ReplayOnlyLastRecovery

- java.lang.Object
- - akka.persistence.typed.internal.ReplayOnlyLastRecovery

- ---

```
public class ReplayOnlyLastRecovery
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplayOnlyLastRecovery](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Recovery](../javadsl/Recovery.html "class in akka.persistence.typed.javadsl")` | `[asJava](#asJava())()` |  |
	| `static [Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl")` | `[asScala](#asScala())()` |  |
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
	
	
	
		- #### ReplayOnlyLastRecovery
		
		
		
		```
		public ReplayOnlyLastRecovery()
		```

	- ### Method Detail
	
	
	
		- #### asScala
		
		
		
		```
		public static [Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl") asScala()
		```
		- #### asJava
		
		
		
		```
		public static [Recovery](../javadsl/Recovery.html "class in akka.persistence.typed.javadsl") asJava()
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

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/Recovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Recovery.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplayOnlyLastRecovery.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplayOnlyLastRecovery.html)*