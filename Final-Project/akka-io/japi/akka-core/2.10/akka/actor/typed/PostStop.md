---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html
title: PostStop
---

# PostStop

## Content

Package [akka.actor.typed](package-summary.html)
## Class PostStop

- java.lang.Object
- - akka.actor.typed.PostStop

- All Implemented Interfaces:
`[Signal](Signal.html "interface in akka.actor.typed")`

Direct Known Subclasses:
`[PostStop$](PostStop$.html "class in akka.actor.typed")`

---

```
public abstract class PostStop
extends java.lang.Object
implements [Signal](Signal.html "interface in akka.actor.typed")
```

Lifecycle signal that is fired after this actor and all its child actors
 (transitively) have terminated. The [`Terminated`](Terminated.html "class in akka.actor.typed") signal is only sent to
 registered watchers after this signal has been processed.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PostStop](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [PostStop](PostStop.html "class in akka.actor.typed")` | `[instance](#instance())()` |  |
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
	
	
	
		- #### PostStop
		
		
		
		```
		public PostStop()
		```

	- ### Method Detail
	
	
	
		- #### instance
		
		
		
		```
		public static [PostStop](PostStop.html "class in akka.actor.typed") instance()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html)*