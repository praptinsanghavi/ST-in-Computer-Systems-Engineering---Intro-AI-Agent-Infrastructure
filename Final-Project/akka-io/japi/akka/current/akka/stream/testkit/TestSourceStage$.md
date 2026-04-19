---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:47:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSourceStage$.html
title: TestSourceStage$
---

# TestSourceStage$

## Content

Package [akka.stream.testkit](package-summary.html)
## Class TestSourceStage$

- java.lang.Object
- - akka.stream.testkit.TestSourceStage$

- ---

```
public class TestSourceStage$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestSourceStage$](TestSourceStage$.html "class in akka.stream.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestSourceStage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T,​M>[Source](../scaladsl/Source.html "class in akka.stream.scaladsl")<T,​M>` | `[apply](#apply(akka.stream.stage.GraphStageWithMaterializedValue,akka.testkit.TestProbe))​([GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> stageUnderTest,  [TestProbe](../../testkit/TestProbe.html "class in akka.testkit") probe)` | Creates a source out of the `stageUnderTest` that will inform the `probe`  of operator events and callbacks by sending it the various messages found under  [`GraphStageMessages`](GraphStageMessages.html "class in akka.stream.testkit"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestSourceStage$](TestSourceStage$.html "class in akka.stream.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestSourceStage$
		
		
		
		```
		public TestSourceStage$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T,​M> [Source](../scaladsl/Source.html "class in akka.stream.scaladsl")<T,​M> apply​([GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> stageUnderTest,
		                                           [TestProbe](../../testkit/TestProbe.html "class in akka.testkit") probe)
		```
		
		Creates a source out of the `stageUnderTest` that will inform the `probe`
		 of operator events and callbacks by sending it the various messages found under
		 [`GraphStageMessages`](GraphStageMessages.html "class in akka.stream.testkit").
		 
		 This allows for creation of a "normal" stream starting with the source while still being
		 able to assert internal events.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/GraphStageMessages.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSourceStage$.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestProbe.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSourceStage$.html](https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSourceStage$.html)*