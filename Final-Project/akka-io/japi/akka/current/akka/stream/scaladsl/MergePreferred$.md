---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergePreferred$.html
title: MergePreferred$
---

# MergePreferred$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class MergePreferred$

- java.lang.Object
- - akka.stream.scaladsl.MergePreferred$

- ---

```
public class MergePreferred$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MergePreferred$](MergePreferred$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergePreferred$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [MergePreferred](MergePreferred.html "class in akka.stream.scaladsl")<T>` | `[apply](#apply(int,boolean))​(int secondaryPorts,  boolean eagerComplete)` | Create a new `MergePreferred` with the specified number of secondary input ports. |
	| `<T> boolean` | `[apply$default$2](#apply$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MergePreferred$](MergePreferred$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MergePreferred$
		
		
		
		```
		public MergePreferred$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [MergePreferred](MergePreferred.html "class in akka.stream.scaladsl")<T> apply​(int secondaryPorts,
		                                   boolean eagerComplete)
		```
		
		Create a new `MergePreferred` with the specified number of secondary input ports.
		 
		
		Parameters:
		`secondaryPorts` \- number of secondary input ports
		`eagerComplete` \- if true, the merge will complete as soon as one of its inputs completes.
		- #### apply$default$2
		
		
		
		```
		public <T> boolean apply$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergePreferred$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergePreferred.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergePreferred$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergePreferred$.html)*