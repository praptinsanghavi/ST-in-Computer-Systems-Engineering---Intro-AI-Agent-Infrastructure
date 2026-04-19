---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:03:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
title: Inlet
---

# Inlet

## Content

Package [akka.stream](package-summary.html)
## Class Inlet\<T\>

- java.lang.Object
- - [akka.stream.InPort](InPort.html "class in akka.stream")
	- - akka.stream.Inlet\<T\>

- ---

```
public final class Inlet<T>
extends [InPort](InPort.html "class in akka.stream")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Inlet](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Inlet](Inlet.html "class in akka.stream")<T>` | `[apply](#apply(java.lang.String))​(java.lang.String name)` | Scala API |
	| `<U> [Inlet](Inlet.html "class in akka.stream")<U>` | `[as](#as())()` | INTERNAL API. |
	| `[Inlet](Inlet.html "class in akka.stream")<[T](Inlet.html "type parameter in Inlet")>` | `[carbonCopy](#carbonCopy())()` |  |
	| `static <T> [Inlet](Inlet.html "class in akka.stream")<T>` | `[create](#create(java.lang.String))​(java.lang.String name)` | JAVA API |
	| `java.lang.String` | `[s](#s())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[InPort](InPort.html "class in akka.stream")
		
		
		`[equals](InPort.html#equals(java.lang.Object)), [hashCode](InPort.html#hashCode())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Inlet
		
		
		
		```
		public Inlet()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Inlet](Inlet.html "class in akka.stream")<T> apply​(java.lang.String name)
		```
		
		Scala API
		 
		 Creates a new Inlet with the given name. The name will be used when
		 displaying debug information or error messages involving the port.
		- #### create
		
		
		
		```
		public static <T> [Inlet](Inlet.html "class in akka.stream")<T> create​(java.lang.String name)
		```
		
		JAVA API
		 
		 Creates a new Inlet with the given name. The name will be used when
		 displaying debug information or error messages involving the port.
		- #### s
		
		
		
		```
		public java.lang.String s()
		```
		- #### carbonCopy
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T](Inlet.html "type parameter in Inlet")> carbonCopy()
		```
		- #### as
		
		
		
		```
		public <U> [Inlet](Inlet.html "class in akka.stream")<U> as()
		```
		
		INTERNAL API.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/InPort.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html](https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html)*