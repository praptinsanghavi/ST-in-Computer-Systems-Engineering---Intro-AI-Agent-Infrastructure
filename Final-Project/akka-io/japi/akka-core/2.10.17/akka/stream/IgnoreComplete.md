---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:27:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/IgnoreComplete.html
title: IgnoreComplete
---

# IgnoreComplete

## Content

Package [akka.stream](package-summary.html)
## Class IgnoreComplete

- java.lang.Object
- - [akka.stream.TLSClosing](TLSClosing.html "class in akka.stream")
	- - akka.stream.IgnoreComplete

- Direct Known Subclasses:
`[IgnoreComplete$](IgnoreComplete$.html "class in akka.stream")`

---

```
public abstract class IgnoreComplete
extends [TLSClosing](TLSClosing.html "class in akka.stream")
```

see [`TLSClosing`](TLSClosing.html "class in akka.stream")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IgnoreComplete](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[ignoreCancel](#ignoreCancel())()` |  |
	| `boolean` | `[ignoreComplete](#ignoreComplete())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[TLSClosing](TLSClosing.html "class in akka.stream")
		
		
		`[eagerClose](TLSClosing.html#eagerClose()), [ignoreBoth](TLSClosing.html#ignoreBoth())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### IgnoreComplete
		
		
		
		```
		public IgnoreComplete()
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
		- #### ignoreCancel
		
		
		
		```
		public boolean ignoreCancel()
		```
		
		
		Specified by:
		`[ignoreCancel](TLSClosing.html#ignoreCancel())` in class `[TLSClosing](TLSClosing.html "class in akka.stream")`
		- #### ignoreComplete
		
		
		
		```
		public boolean ignoreComplete()
		```
		
		
		Specified by:
		`[ignoreComplete](TLSClosing.html#ignoreComplete())` in class `[TLSClosing](TLSClosing.html "class in akka.stream")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/IgnoreComplete$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/TLSClosing.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/IgnoreComplete.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/IgnoreComplete.html)*