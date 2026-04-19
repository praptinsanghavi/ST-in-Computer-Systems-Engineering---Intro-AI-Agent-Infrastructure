---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:47:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/Inlet$.html
title: Inlet$
---

# Inlet$

## Content

Package [akka.stream](package-summary.html)
## Class Inlet$

- java.lang.Object
- - akka.stream.Inlet$

- ---

```
public class Inlet$
extends java.lang.Object
```

An Inlet is a typed input to a Shape. Its partner in the Module view
 is the InPort (which does not bear an element type because Modules only
 express the internal structural hierarchy of stream topologies).

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Inlet$](Inlet$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Inlet$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Inlet](Inlet.html "class in akka.stream")<T>` | `[apply](#apply(java.lang.String))​(java.lang.String name)` | Scala API |
	| `<T> [Inlet](Inlet.html "class in akka.stream")<T>` | `[create](#create(java.lang.String))​(java.lang.String name)` | JAVA API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Inlet$](Inlet$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Inlet$
		
		
		
		```
		public Inlet$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Inlet](Inlet.html "class in akka.stream")<T> apply​(java.lang.String name)
		```
		
		Scala API
		 
		 Creates a new Inlet with the given name. The name will be used when
		 displaying debug information or error messages involving the port.
		- #### create
		
		
		
		```
		public <T> [Inlet](Inlet.html "class in akka.stream")<T> create​(java.lang.String name)
		```
		
		JAVA API
		 
		 Creates a new Inlet with the given name. The name will be used when
		 displaying debug information or error messages involving the port.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/Inlet$.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/Inlet$.html](https://doc.akka.io/japi/akka/current/akka/stream/Inlet$.html)*