---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:01:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/Outlet.html
title: Outlet
---

# Outlet

## Content

Package [akka.stream](package-summary.html)
## Class Outlet\<T\>

- java.lang.Object
- - [akka.stream.OutPort](OutPort.html "class in akka.stream")
	- - akka.stream.Outlet\<T\>

- ---

```
public final class Outlet<T>
extends [OutPort](OutPort.html "class in akka.stream")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Outlet](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Outlet](Outlet.html "class in akka.stream")<T>` | `[apply](#apply(java.lang.String))​(java.lang.String name)` | Scala API |
	| `<U> [Outlet](Outlet.html "class in akka.stream")<U>` | `[as](#as())()` | INTERNAL API. |
	| `[Outlet](Outlet.html "class in akka.stream")<[T](Outlet.html "type parameter in Outlet")>` | `[carbonCopy](#carbonCopy())()` |  |
	| `static <T> [Outlet](Outlet.html "class in akka.stream")<T>` | `[create](#create(java.lang.String))​(java.lang.String name)` | JAVA API |
	| `java.lang.String` | `[s](#s())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[OutPort](OutPort.html "class in akka.stream")
		
		
		`[equals](OutPort.html#equals(java.lang.Object)), [hashCode](OutPort.html#hashCode())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Outlet
		
		
		
		```
		public Outlet()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Outlet](Outlet.html "class in akka.stream")<T> apply​(java.lang.String name)
		```
		
		Scala API
		 
		 Creates a new Outlet with the given name. The name will be used when
		 displaying debug information or error messages involving the port.
		- #### create
		
		
		
		```
		public static <T> [Outlet](Outlet.html "class in akka.stream")<T> create​(java.lang.String name)
		```
		
		JAVA API
		 
		 Creates a new Outlet with the given name. The name will be used when
		 displaying debug information or error messages involving the port.
		- #### s
		
		
		
		```
		public java.lang.String s()
		```
		- #### carbonCopy
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[T](Outlet.html "type parameter in Outlet")> carbonCopy()
		```
		- #### as
		
		
		
		```
		public <U> [Outlet](Outlet.html "class in akka.stream")<U> as()
		```
		
		INTERNAL API.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/OutPort.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/Outlet.html](https://doc.akka.io/japi/akka-core/current/akka/stream/Outlet.html)*