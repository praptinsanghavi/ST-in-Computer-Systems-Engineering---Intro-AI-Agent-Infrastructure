---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceWithContext$.html
title: SourceWithContext$
---

# SourceWithContext$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class SourceWithContext$

- java.lang.Object
- - akka.stream.scaladsl.SourceWithContext$

- ---

```
public class SourceWithContext$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SourceWithContext$](SourceWithContext$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SourceWithContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Out,​CtxOut,​Mat>[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<Out,​CtxOut,​Mat>` | `[fromTuples](#fromTuples(akka.stream.scaladsl.Source))​([Source](Source.html "class in akka.stream.scaladsl")<scala.Tuple2<Out,​CtxOut>,​Mat> source)` | Creates a SourceWithContext from a regular source that operates on a tuple of `(data, context)` elements. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SourceWithContext$](SourceWithContext$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SourceWithContext$
		
		
		
		```
		public SourceWithContext$()
		```

	- ### Method Detail
	
	
	
		- #### fromTuples
		
		
		
		```
		public <Out,​CtxOut,​Mat> [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<Out,​CtxOut,​Mat> fromTuples​([Source](Source.html "class in akka.stream.scaladsl")<scala.Tuple2<Out,​CtxOut>,​Mat> source)
		```
		
		Creates a SourceWithContext from a regular source that operates on a tuple of `(data, context)` elements.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceWithContext$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceWithContext$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceWithContext$.html)*