---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContext$.html
title: FlowWithContext$
---

# FlowWithContext$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class FlowWithContext$

- java.lang.Object
- - akka.stream.scaladsl.FlowWithContext$

- ---

```
public class FlowWithContext$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FlowWithContext$](FlowWithContext$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlowWithContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<In,​Ctx>[FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<In,​Ctx,​In,​Ctx,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply())()` | Creates an "empty" FlowWithContext that passes elements through with their context unchanged. |
	| `<In,​CtxIn,​Out,​CtxOut,​Mat>[FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<In,​CtxIn,​Out,​CtxOut,​Mat>` | `[fromTuples](#fromTuples(akka.stream.scaladsl.Flow))​([Flow](Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<In,​CtxIn>,​scala.Tuple2<Out,​CtxOut>,​Mat> flow)` | Creates a FlowWithContext from a regular flow that operates on a tuple of `(data, context)` elements. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FlowWithContext$](FlowWithContext$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FlowWithContext$
		
		
		
		```
		public FlowWithContext$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <In,​Ctx> [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<In,​Ctx,​In,​Ctx,​[NotUsed](../../NotUsed.html "class in akka")> apply()
		```
		
		Creates an "empty" FlowWithContext that passes elements through with their context unchanged.
		- #### fromTuples
		
		
		
		```
		public <In,​CtxIn,​Out,​CtxOut,​Mat> [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<In,​CtxIn,​Out,​CtxOut,​Mat> fromTuples​([Flow](Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<In,​CtxIn>,​scala.Tuple2<Out,​CtxOut>,​Mat> flow)
		```
		
		Creates a FlowWithContext from a regular flow that operates on a tuple of `(data, context)` elements.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContext$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContext$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContext$.html)*