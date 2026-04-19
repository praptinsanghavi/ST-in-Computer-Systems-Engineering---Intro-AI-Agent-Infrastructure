---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:52:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/Valid.html
title: Valid
---

# Valid

## Content

Package [akka.cluster](package-summary.html)
## Class Valid

- java.lang.Object
- - akka.cluster.Valid

- ---

```
public class Valid
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Valid](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.Product` | `[$plus$plus](#$plus$plus(akka.cluster.ConfigValidation))​([ConfigValidation](ConfigValidation.html "interface in akka.cluster") that)` |  |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static scala.Product` | `[concat](#concat(akka.cluster.ConfigValidation))​([ConfigValidation](ConfigValidation.html "interface in akka.cluster") that)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [Valid$](Valid$.html "class in akka.cluster")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
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
	
	
	
		- #### Valid
		
		
		
		```
		public Valid()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [Valid$](Valid$.html "class in akka.cluster") getInstance()
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
		- #### $plus$plus
		
		
		
		```
		public static scala.Product $plus$plus​([ConfigValidation](ConfigValidation.html "interface in akka.cluster") that)
		```
		- #### concat
		
		
		
		```
		public static scala.Product concat​([ConfigValidation](ConfigValidation.html "interface in akka.cluster") that)
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

- https://doc.akka.io/japi/akka-core/current/akka/cluster/ConfigValidation.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/Valid$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/Valid.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/Valid.html)*