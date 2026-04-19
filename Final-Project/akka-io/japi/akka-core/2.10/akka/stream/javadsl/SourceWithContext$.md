---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:52:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceWithContext$.html
title: SourceWithContext$
---

# SourceWithContext$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class SourceWithContext$

- java.lang.Object
- - akka.stream.javadsl.SourceWithContext$

- ---

```
public class SourceWithContext$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SourceWithContext$](SourceWithContext$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SourceWithContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Out,​CtxOut,​Mat>[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out,​CtxOut,​Mat>` | `[fromPairs](#fromPairs(akka.stream.javadsl.Source))​([Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<Out,​CtxOut>,​Mat> under)` | Creates a SourceWithContext from a regular flow that operates on `Pair` elements. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SourceWithContext$](SourceWithContext$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SourceWithContext$
		
		
		
		```
		public SourceWithContext$()
		```

	- ### Method Detail
	
	
	
		- #### fromPairs
		
		
		
		```
		public <Out,​CtxOut,​Mat> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out,​CtxOut,​Mat> fromPairs​([Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<Out,​CtxOut>,​Mat> under)
		```
		
		Creates a SourceWithContext from a regular flow that operates on `Pair` elements.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceWithContext$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceWithContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceWithContext$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceWithContext$.html)*