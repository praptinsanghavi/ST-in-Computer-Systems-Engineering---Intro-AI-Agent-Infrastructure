---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingSuccess.html
title: ProcessingSuccess
---

# ProcessingSuccess

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class ProcessingSuccess

- java.lang.Object
- - akka.persistence.testkit.ProcessingSuccess

- All Implemented Interfaces:
`[ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit")`

Direct Known Subclasses:
`[ProcessingSuccess$](ProcessingSuccess$.html "class in akka.persistence.testkit")`

---

```
public abstract class ProcessingSuccess
extends java.lang.Object
implements [ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ProcessingSuccess](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")` | `[getInstance](#getInstance())()` |  |
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
	
	
	
		- #### ProcessingSuccess
		
		
		
		```
		public ProcessingSuccess()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit") getInstance()
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

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingResult.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingSuccess$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingSuccess.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingSuccess.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingSuccess.html)*