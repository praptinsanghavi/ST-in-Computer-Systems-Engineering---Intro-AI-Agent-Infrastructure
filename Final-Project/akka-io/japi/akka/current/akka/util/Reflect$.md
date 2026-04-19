---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/Reflect$.html
title: Reflect$
---

# Reflect$

## Content

Package [akka.util](package-summary.html)
## Class Reflect$

- java.lang.Object
- - akka.util.Reflect$

- ---

```
public class Reflect$
extends java.lang.Object
```

Collection of internal reflection utilities which may or may not be
 available (most services specific to HotSpot, but fails gracefully).
 
 INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Reflect$](Reflect$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Reflect$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.reflect.Type` | `[findMarker](#findMarker(java.lang.Class,java.lang.Class))​(java.lang.Class<?> root,  java.lang.Class<?> marker)` |  |
	| `scala.Option<scala.Function1<java.lang.Object,​java.lang.Class<?>>>` | `[getCallerClass](#getCallerClass())()` | This optionally holds a function which looks N levels above itself  on the call stack and returns the `Class[_]` object for the code  executing in that stack frame. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Reflect$](Reflect$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Reflect$
		
		
		
		```
		public Reflect$()
		```

	- ### Method Detail
	
	
	
		- #### getCallerClass
		
		
		
		```
		public scala.Option<scala.Function1<java.lang.Object,​java.lang.Class<?>>> getCallerClass()
		```
		
		This optionally holds a function which looks N levels above itself
		 on the call stack and returns the `Class[_]` object for the code
		 executing in that stack frame. Implemented using
		 `sun.reflect.Reflection.getCallerClass` if available, None otherwise.
		 
		 Hint: when comparing to Thread.currentThread().getStackTrace, add two levels.
		- #### findMarker
		
		
		
		```
		public java.lang.reflect.Type findMarker​(java.lang.Class<?> root,
		                                         java.lang.Class<?> marker)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/Reflect$.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/Reflect$.html](https://doc.akka.io/japi/akka/current/akka/util/Reflect$.html)*