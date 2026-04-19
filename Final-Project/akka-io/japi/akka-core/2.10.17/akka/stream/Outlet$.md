---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:27:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Outlet$.html
title: Outlet$
---

# Outlet$

## Content

Package [akka.stream](package-summary.html)
## Class Outlet$

- java.lang.Object
- - akka.stream.Outlet$

- ---

```
public class Outlet$
extends java.lang.Object
```

An Outlet is a typed output to a Shape. Its partner in the Module view
 is the OutPort (which does not bear an element type because Modules only
 express the internal structural hierarchy of stream topologies).

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Outlet$](Outlet$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Outlet$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Outlet](Outlet.html "class in akka.stream")<T>` | `[apply](#apply(java.lang.String))​(java.lang.String name)` | Scala API |
	| `<T> [Outlet](Outlet.html "class in akka.stream")<T>` | `[create](#create(java.lang.String))​(java.lang.String name)` | JAVA API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Outlet$](Outlet$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Outlet$
		
		
		
		```
		public Outlet$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Outlet](Outlet.html "class in akka.stream")<T> apply​(java.lang.String name)
		```
		
		Scala API
		 
		 Creates a new Outlet with the given name. The name will be used when
		 displaying debug information or error messages involving the port.
		- #### create
		
		
		
		```
		public <T> [Outlet](Outlet.html "class in akka.stream")<T> create​(java.lang.String name)
		```
		
		JAVA API
		 
		 Creates a new Outlet with the given name. The name will be used when
		 displaying debug information or error messages involving the port.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Outlet$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Outlet$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Outlet$.html)*