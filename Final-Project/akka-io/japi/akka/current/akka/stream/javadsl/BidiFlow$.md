---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/BidiFlow$.html
title: BidiFlow$
---

# BidiFlow$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class BidiFlow$

- java.lang.Object
- - akka.stream.javadsl.BidiFlow$

- ---

```
public class BidiFlow$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BidiFlow$](BidiFlow$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BidiFlow$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<I,​O>[BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<I,​I,​O,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[bidirectionalIdleTimeout](#bidirectionalIdleTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the time between two processed elements \*in any direction\* exceed the provided timeout, the stream is failed  with a [`StreamIdleTimeoutException`](../StreamIdleTimeoutException.html "class in akka.stream"). |
	| `<I1,​O1,​I2,​O2,​M1,​M2>[BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<I1,​O1,​I2,​O2,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromFlows](#fromFlows(akka.stream.Graph,akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I1,​O1>,​M1> flow1,  [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I2,​O2>,​M2> flow2)` | Wraps two Flows to create a ''BidiFlow''. |
	| `<I1,​O1,​I2,​O2,​M1,​M2,​M>[BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<I1,​O1,​I2,​O2,​M>` | `[fromFlowsMat](#fromFlowsMat(akka.stream.Graph,akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I1,​O1>,​M1> flow1,  [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I2,​O2>,​M2> flow2,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> combine)` | Wraps two Flows to create a ''BidiFlow''. |
	| `<I1,​O1,​I2,​O2>[BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<I1,​O1,​I2,​O2,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromFunctions](#fromFunctions(akka.japi.function.Function,akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<I1,​O1> top,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<I2,​O2> bottom)` | Create a BidiFlow where the top and bottom flows are just one simple mapping  operator each, expressed by the two functions. |
	| `<I1,​O1,​I2,​O2,​M>[BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<I1,​O1,​I2,​O2,​M>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<I1,​O1,​I2,​O2>,​M> g)` | A graph with the shape of a BidiFlow logically is a BidiFlow, this method makes  it so also in type. |
	| `<A,​B>[BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<A,​A,​B,​B,​[NotUsed](../../NotUsed.html "class in akka")>` | `[identity](#identity())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BidiFlow$](BidiFlow$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BidiFlow$
		
		
		
		```
		public BidiFlow$()
		```

	- ### Method Detail
	
	
	
		- #### identity
		
		
		
		```
		public <A,​B> [BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<A,​A,​B,​B,​[NotUsed](../../NotUsed.html "class in akka")> identity()
		```
		- #### fromGraph
		
		
		
		```
		public <I1,​O1,​I2,​O2,​M> [BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<I1,​O1,​I2,​O2,​M> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<I1,​O1,​I2,​O2>,​M> g)
		```
		
		A graph with the shape of a BidiFlow logically is a BidiFlow, this method makes
		 it so also in type.
		- #### fromFlowsMat
		
		
		
		```
		public <I1,​O1,​I2,​O2,​M1,​M2,​M> [BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<I1,​O1,​I2,​O2,​M> fromFlowsMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I1,​O1>,​M1> flow1,
		                                                                                                                              [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I2,​O2>,​M2> flow2,
		                                                                                                                              [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> combine)
		```
		
		Wraps two Flows to create a ''BidiFlow''. The materialized value of the resulting BidiFlow is determined
		 by the combiner function passed in the second argument list.
		 
		
		
		
		```
		
		     +----------------------------+
		     | Resulting BidiFlow         |
		     |                            |
		     |  +----------------------+  |
		 I1 ~~> |        Flow1         | ~~> O1
		     |  +----------------------+  |
		     |                            |
		     |  +----------------------+  |
		 O2 <~~ |        Flow2         | <~~ I2
		     |  +----------------------+  |
		     +----------------------------+
		 
		```
		- #### fromFlows
		
		
		
		```
		public <I1,​O1,​I2,​O2,​M1,​M2> [BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<I1,​O1,​I2,​O2,​[NotUsed](../../NotUsed.html "class in akka")> fromFlows​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I1,​O1>,​M1> flow1,
		                                                                                                                         [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I2,​O2>,​M2> flow2)
		```
		
		Wraps two Flows to create a ''BidiFlow''. The materialized value of the resulting BidiFlow is NotUsed.
		 
		
		
		
		```
		
		     +----------------------------+
		     | Resulting BidiFlow         |
		     |                            |
		     |  +----------------------+  |
		 I1 ~~> |        Flow1         | ~~> O1
		     |  +----------------------+  |
		     |                            |
		     |  +----------------------+  |
		 O2 <~~ |        Flow2         | <~~ I2
		     |  +----------------------+  |
		     +----------------------------+
		 
		```
		- #### fromFunctions
		
		
		
		```
		public <I1,​O1,​I2,​O2> [BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<I1,​O1,​I2,​O2,​[NotUsed](../../NotUsed.html "class in akka")> fromFunctions​([Function](../../japi/function/Function.html "interface in akka.japi.function")<I1,​O1> top,
		                                                                                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<I2,​O2> bottom)
		```
		
		Create a BidiFlow where the top and bottom flows are just one simple mapping
		 operator each, expressed by the two functions.
		- #### bidirectionalIdleTimeout
		
		
		
		```
		public <I,​O> [BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<I,​I,​O,​O,​[NotUsed](../../NotUsed.html "class in akka")> bidirectionalIdleTimeout​(java.time.Duration timeout)
		```
		
		If the time between two processed elements \*in any direction\* exceed the provided timeout, the stream is failed
		 with a [`StreamIdleTimeoutException`](../StreamIdleTimeoutException.html "class in akka.stream").
		 
		 There is a difference between this operator and having two idleTimeout Flows assembled into a BidiStage.
		 If the timeout is configured to be 1 seconds, then this operator will not fail even though there are elements flowing
		 every second in one direction, but no elements are flowing in the other direction. I.e. this operator considers
		 the \*joint\* frequencies of the elements in both directions.

## Code Examples

### Example 1: fromFlowsMat

```text
+----------------------------+
     | Resulting BidiFlow         |
     |                            |
     |  +----------------------+  |
 I1 ~~> |        Flow1         | ~~> O1
     |  +----------------------+  |
     |                            |
     |  +----------------------+  |
 O2 <~~ |        Flow2         | <~~ I2
     |  +----------------------+  |
     +----------------------------+
```

### Example 2: fromFlows

```text
+----------------------------+
     | Resulting BidiFlow         |
     |                            |
     |  +----------------------+  |
 I1 ~~> |        Flow1         | ~~> O1
     |  +----------------------+  |
     |                            |
     |  +----------------------+  |
 O2 <~~ |        Flow2         | <~~ I2
     |  +----------------------+  |
     +----------------------------+
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/current/akka/stream/BidiShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamIdleTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/BidiFlow$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/BidiFlow$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/BidiFlow$.html)*