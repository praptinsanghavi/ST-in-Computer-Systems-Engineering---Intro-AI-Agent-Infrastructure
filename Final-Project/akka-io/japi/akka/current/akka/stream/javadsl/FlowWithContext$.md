---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/FlowWithContext$.html
title: FlowWithContext$
---

# FlowWithContext$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class FlowWithContext$

- java.lang.Object
- - akka.stream.javadsl.FlowWithContext$

- ---

```
public class FlowWithContext$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FlowWithContext$](FlowWithContext$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlowWithContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<In,​Ctx>[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<In,​Ctx,​In,​Ctx,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create())()` |  |
	| `<In,​CtxIn,​Out,​CtxOut,​Mat>[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<In,​CtxIn,​Out,​CtxOut,​Mat>` | `[fromPairs](#fromPairs(akka.stream.javadsl.Flow))​([Flow](Flow.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<In,​CtxIn>,​[Pair](../../japi/Pair.html "class in akka.japi")<Out,​CtxOut>,​Mat> under)` | Creates a FlowWithContext from a regular flow that operates on `Pair` elements. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FlowWithContext$](FlowWithContext$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FlowWithContext$
		
		
		
		```
		public FlowWithContext$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <In,​Ctx> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<In,​Ctx,​In,​Ctx,​[NotUsed](../../NotUsed.html "class in akka")> create()
		```
		- #### fromPairs
		
		
		
		```
		public <In,​CtxIn,​Out,​CtxOut,​Mat> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<In,​CtxIn,​Out,​CtxOut,​Mat> fromPairs​([Flow](Flow.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<In,​CtxIn>,​[Pair](../../japi/Pair.html "class in akka.japi")<Out,​CtxOut>,​Mat> under)
		```
		
		Creates a FlowWithContext from a regular flow that operates on `Pair` elements.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/FlowWithContext$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/FlowWithContext$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/FlowWithContext$.html)*