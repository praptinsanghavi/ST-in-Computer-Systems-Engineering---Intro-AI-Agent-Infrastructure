---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:28:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SourceRef$.html
title: SourceRef$
---

# SourceRef$

## Content

Package [akka.stream](package-summary.html)
## Class SourceRef$

- java.lang.Object
- - akka.stream.SourceRef$

- ---

```
public class SourceRef$
extends java.lang.Object
```

See full documentation on [`SourceRef`](SourceRef.html "interface in akka.stream").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SourceRef$](SourceRef$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SourceRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Source](scaladsl/Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../NotUsed.html "class in akka")>` | `[convertRefToSource](#convertRefToSource(akka.stream.SourceRef))​([SourceRef](SourceRef.html "interface in akka.stream")<T> ref)` | Implicitly converts a SourceRef to a Source. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SourceRef$](SourceRef$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SourceRef$
		
		
		
		```
		public SourceRef$()
		```

	- ### Method Detail
	
	
	
		- #### convertRefToSource
		
		
		
		```
		public <T> [Source](scaladsl/Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../NotUsed.html "class in akka")> convertRefToSource​([SourceRef](SourceRef.html "interface in akka.stream")<T> ref)
		```
		
		Implicitly converts a SourceRef to a Source. The same can be achieved by calling \`.source\` on the SourceRef itself.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SourceRef$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SourceRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SourceRef$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SourceRef$.html)*