---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
title: NotUsed
---

# NotUsed

## Content

Package [akka](package-summary.html)
## Class NotUsed

- java.lang.Object
- - akka.NotUsed

- Direct Known Subclasses:
`[NotUsed$](NotUsed$.html "class in akka")`

---

```
public abstract class NotUsed
extends java.lang.Object
```

This type is used in generic type signatures wherever the actual value is of no importance.
 It is a combination of Scala\&rsquo;s `Unit` and Java\&rsquo;s `Void`, which both have different issues when
 used from the other language. An example use\-case is the materialized value of an Akka Stream for cases
 where no result shall be returned from materialization.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NotUsed](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [NotUsed](NotUsed.html "class in akka")` | `[getInstance](#getInstance())()` | Java API: the singleton instance |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [NotUsed](NotUsed.html "class in akka")` | `[notUsed](#notUsed())()` | Java API: the singleton instance |
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
	
	
	
		- #### NotUsed
		
		
		
		```
		public NotUsed()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [NotUsed](NotUsed.html "class in akka") getInstance()
		```
		
		Java API: the singleton instance
		- #### notUsed
		
		
		
		```
		public static [NotUsed](NotUsed.html "class in akka") notUsed()
		```
		
		Java API: the singleton instance
		 
		 This is equivalent to `NotUsed.getInstance`, but can be used with static import.
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

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html](https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html)*