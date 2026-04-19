---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:47:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSinkStage$.html
title: TestSinkStage$
---

# TestSinkStage$

## Content

Package [akka.stream.testkit](package-summary.html)
## Class TestSinkStage$

- java.lang.Object
- - akka.stream.testkit.TestSinkStage$

- ---

```
public class TestSinkStage$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestSinkStage$](TestSinkStage$.html "class in akka.stream.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestSinkStage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T,​M>[Sink](../scaladsl/Sink.html "class in akka.stream.scaladsl")<T,​M>` | `[apply](#apply(akka.stream.stage.GraphStageWithMaterializedValue,akka.testkit.TestProbe))​([GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[SinkShape](../SinkShape.html "class in akka.stream")<T>,​M> stageUnderTest,  [TestProbe](../../testkit/TestProbe.html "class in akka.testkit") probe)` | Creates a sink out of the `stageUnderTest` that will inform the `probe`  of operator events and callbacks by sending it the various messages found under  [`GraphStageMessages`](GraphStageMessages.html "class in akka.stream.testkit"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestSinkStage$](TestSinkStage$.html "class in akka.stream.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestSinkStage$
		
		
		
		```
		public TestSinkStage$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T,​M> [Sink](../scaladsl/Sink.html "class in akka.stream.scaladsl")<T,​M> apply​([GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[SinkShape](../SinkShape.html "class in akka.stream")<T>,​M> stageUnderTest,
		                                         [TestProbe](../../testkit/TestProbe.html "class in akka.testkit") probe)
		```
		
		Creates a sink out of the `stageUnderTest` that will inform the `probe`
		 of operator events and callbacks by sending it the various messages found under
		 [`GraphStageMessages`](GraphStageMessages.html "class in akka.stream.testkit").
		 
		 This allows for creation of a "normal" stream ending with the sink while still being
		 able to assert internal events.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/GraphStageMessages.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSinkStage$.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestProbe.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSinkStage$.html](https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSinkStage$.html)*