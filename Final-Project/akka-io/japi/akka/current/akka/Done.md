---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/Done.html
title: Done
---

# Done

## Content

Package [akka](package-summary.html)
## Class Done

- java.lang.Object
- - akka.Done

- All Implemented Interfaces:
`java.io.Serializable`

Direct Known Subclasses:
`[Done$](Done$.html "class in akka")`

---

```
public abstract class Done
extends java.lang.Object
implements java.io.Serializable
```

Typically used together with `Future` to signal completion
 but there is no actual value completed. More clearly signals intent
 than `Unit` and is available both from Scala and Java (which `Unit` is not).

See Also:
[Serialized Form](../serialized-form.html#akka.Done)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Done](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static [Done](Done.html "class in akka")` | `[done](#done())()` | Java API: the singleton instance |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [Done](Done.html "class in akka")` | `[getInstance](#getInstance())()` | Java API: the singleton instance |
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
	
	
	
		- #### Done
		
		
		
		```
		public Done()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [Done](Done.html "class in akka") getInstance()
		```
		
		Java API: the singleton instance
		- #### done
		
		
		
		```
		public static [Done](Done.html "class in akka") done()
		```
		
		Java API: the singleton instance
		 
		 This is equivalent to `Done.getInstance`, but can be used with static import.
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

- https://doc.akka.io/japi/akka/current/akka/Done$.html
- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/Done.html](https://doc.akka.io/japi/akka/current/akka/Done.html)*