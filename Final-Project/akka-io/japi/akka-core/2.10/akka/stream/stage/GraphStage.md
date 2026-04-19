---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
title: GraphStage
---

# GraphStage

## Content

Package [akka.stream.stage](package-summary.html)
## Class GraphStage\<S extends [Shape](../Shape.html "class in akka.stream")\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - akka.stream.stage.GraphStage\<S\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<S,​[NotUsed](../../NotUsed.html "class in akka")>`

Direct Known Subclasses:
`[Balance](../scaladsl/Balance.html "class in akka.stream.scaladsl")`, `[Broadcast](../scaladsl/Broadcast.html "class in akka.stream.scaladsl")`, `[Concat](../scaladsl/Concat.html "class in akka.stream.scaladsl")`, `[Interleave](../scaladsl/Interleave.html "class in akka.stream.scaladsl")`, `[Merge](../scaladsl/Merge.html "class in akka.stream.scaladsl")`, `[MergeLatest](../scaladsl/MergeLatest.html "class in akka.stream.scaladsl")`, `[MergePreferred](../scaladsl/MergePreferred.html "class in akka.stream.scaladsl")`, `[MergePrioritized](../scaladsl/MergePrioritized.html "class in akka.stream.scaladsl")`, `[MergeSequence](../scaladsl/MergeSequence.html "class in akka.stream.scaladsl")`, `[MergeSorted](../scaladsl/MergeSorted.html "class in akka.stream.scaladsl")`, `[Partition](../scaladsl/Partition.html "class in akka.stream.scaladsl")`, `[RestartWithBackoffFlow](../scaladsl/RestartWithBackoffFlow.html "class in akka.stream.scaladsl")`, `[RestartWithBackoffSink](../scaladsl/RestartWithBackoffSink.html "class in akka.stream.scaladsl")`, `[RestartWithBackoffSource](../scaladsl/RestartWithBackoffSource.html "class in akka.stream.scaladsl")`, `[UnzipWith10](../scaladsl/UnzipWith10.html "class in akka.stream.scaladsl")`, `[UnzipWith11](../scaladsl/UnzipWith11.html "class in akka.stream.scaladsl")`, `[UnzipWith12](../scaladsl/UnzipWith12.html "class in akka.stream.scaladsl")`, `[UnzipWith13](../scaladsl/UnzipWith13.html "class in akka.stream.scaladsl")`, `[UnzipWith14](../scaladsl/UnzipWith14.html "class in akka.stream.scaladsl")`, `[UnzipWith15](../scaladsl/UnzipWith15.html "class in akka.stream.scaladsl")`, `[UnzipWith16](../scaladsl/UnzipWith16.html "class in akka.stream.scaladsl")`, `[UnzipWith17](../scaladsl/UnzipWith17.html "class in akka.stream.scaladsl")`, `[UnzipWith18](../scaladsl/UnzipWith18.html "class in akka.stream.scaladsl")`, `[UnzipWith19](../scaladsl/UnzipWith19.html "class in akka.stream.scaladsl")`, `[UnzipWith2](../scaladsl/UnzipWith2.html "class in akka.stream.scaladsl")`, `[UnzipWith20](../scaladsl/UnzipWith20.html "class in akka.stream.scaladsl")`, `[UnzipWith21](../scaladsl/UnzipWith21.html "class in akka.stream.scaladsl")`, `[UnzipWith22](../scaladsl/UnzipWith22.html "class in akka.stream.scaladsl")`, `[UnzipWith3](../scaladsl/UnzipWith3.html "class in akka.stream.scaladsl")`, `[UnzipWith4](../scaladsl/UnzipWith4.html "class in akka.stream.scaladsl")`, `[UnzipWith5](../scaladsl/UnzipWith5.html "class in akka.stream.scaladsl")`, `[UnzipWith6](../scaladsl/UnzipWith6.html "class in akka.stream.scaladsl")`, `[UnzipWith7](../scaladsl/UnzipWith7.html "class in akka.stream.scaladsl")`, `[UnzipWith8](../scaladsl/UnzipWith8.html "class in akka.stream.scaladsl")`, `[UnzipWith9](../scaladsl/UnzipWith9.html "class in akka.stream.scaladsl")`, `[ZipLatestWith10](../scaladsl/ZipLatestWith10.html "class in akka.stream.scaladsl")`, `[ZipLatestWith11](../scaladsl/ZipLatestWith11.html "class in akka.stream.scaladsl")`, `[ZipLatestWith12](../scaladsl/ZipLatestWith12.html "class in akka.stream.scaladsl")`, `[ZipLatestWith13](../scaladsl/ZipLatestWith13.html "class in akka.stream.scaladsl")`, `[ZipLatestWith14](../scaladsl/ZipLatestWith14.html "class in akka.stream.scaladsl")`, `[ZipLatestWith15](../scaladsl/ZipLatestWith15.html "class in akka.stream.scaladsl")`, `[ZipLatestWith16](../scaladsl/ZipLatestWith16.html "class in akka.stream.scaladsl")`, `[ZipLatestWith17](../scaladsl/ZipLatestWith17.html "class in akka.stream.scaladsl")`, `[ZipLatestWith18](../scaladsl/ZipLatestWith18.html "class in akka.stream.scaladsl")`, `[ZipLatestWith19](../scaladsl/ZipLatestWith19.html "class in akka.stream.scaladsl")`, `[ZipLatestWith2](../scaladsl/ZipLatestWith2.html "class in akka.stream.scaladsl")`, `[ZipLatestWith20](../scaladsl/ZipLatestWith20.html "class in akka.stream.scaladsl")`, `[ZipLatestWith21](../scaladsl/ZipLatestWith21.html "class in akka.stream.scaladsl")`, `[ZipLatestWith22](../scaladsl/ZipLatestWith22.html "class in akka.stream.scaladsl")`, `[ZipLatestWith3](../scaladsl/ZipLatestWith3.html "class in akka.stream.scaladsl")`, `[ZipLatestWith4](../scaladsl/ZipLatestWith4.html "class in akka.stream.scaladsl")`, `[ZipLatestWith5](../scaladsl/ZipLatestWith5.html "class in akka.stream.scaladsl")`, `[ZipLatestWith6](../scaladsl/ZipLatestWith6.html "class in akka.stream.scaladsl")`, `[ZipLatestWith7](../scaladsl/ZipLatestWith7.html "class in akka.stream.scaladsl")`, `[ZipLatestWith8](../scaladsl/ZipLatestWith8.html "class in akka.stream.scaladsl")`, `[ZipLatestWith9](../scaladsl/ZipLatestWith9.html "class in akka.stream.scaladsl")`, `[ZipWith10](../scaladsl/ZipWith10.html "class in akka.stream.scaladsl")`, `[ZipWith11](../scaladsl/ZipWith11.html "class in akka.stream.scaladsl")`, `[ZipWith12](../scaladsl/ZipWith12.html "class in akka.stream.scaladsl")`, `[ZipWith13](../scaladsl/ZipWith13.html "class in akka.stream.scaladsl")`, `[ZipWith14](../scaladsl/ZipWith14.html "class in akka.stream.scaladsl")`, `[ZipWith15](../scaladsl/ZipWith15.html "class in akka.stream.scaladsl")`, `[ZipWith16](../scaladsl/ZipWith16.html "class in akka.stream.scaladsl")`, `[ZipWith17](../scaladsl/ZipWith17.html "class in akka.stream.scaladsl")`, `[ZipWith18](../scaladsl/ZipWith18.html "class in akka.stream.scaladsl")`, `[ZipWith19](../scaladsl/ZipWith19.html "class in akka.stream.scaladsl")`, `[ZipWith2](../scaladsl/ZipWith2.html "class in akka.stream.scaladsl")`, `[ZipWith20](../scaladsl/ZipWith20.html "class in akka.stream.scaladsl")`, `[ZipWith21](../scaladsl/ZipWith21.html "class in akka.stream.scaladsl")`, `[ZipWith22](../scaladsl/ZipWith22.html "class in akka.stream.scaladsl")`, `[ZipWith3](../scaladsl/ZipWith3.html "class in akka.stream.scaladsl")`, `[ZipWith4](../scaladsl/ZipWith4.html "class in akka.stream.scaladsl")`, `[ZipWith5](../scaladsl/ZipWith5.html "class in akka.stream.scaladsl")`, `[ZipWith6](../scaladsl/ZipWith6.html "class in akka.stream.scaladsl")`, `[ZipWith7](../scaladsl/ZipWith7.html "class in akka.stream.scaladsl")`, `[ZipWith8](../scaladsl/ZipWith8.html "class in akka.stream.scaladsl")`, `[ZipWith9](../scaladsl/ZipWith9.html "class in akka.stream.scaladsl")`, `[ZipWithN](../scaladsl/ZipWithN.html "class in akka.stream.scaladsl")`

---

```
public abstract class GraphStage<S extends [Shape](../Shape.html "class in akka.stream")>
extends [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html "class in akka.stream.stage")<S,​[NotUsed](../../NotUsed.html "class in akka")>
```

A GraphStage represents a reusable graph stream processing operator.
 
 A GraphStage consists of a `Shape` which describes its input and output ports and a factory function that
 creates a [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage") which implements the processing logic that ties the ports together.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GraphStage](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `scala.Tuple2<[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[initialAttributes](GraphStageWithMaterializedValue.html#initialAttributes()), [withAttributes](GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String)), [shape](../Graph.html#shape())`

- - ### Constructor Detail
	
	
	
		- #### GraphStage
		
		
		
		```
		public GraphStage()
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public abstract [GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		                                     throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`
		- #### createLogicAndMaterializedValue
		
		
		
		```
		public final scala.Tuple2<[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage"),​[NotUsed](../../NotUsed.html "class in akka")> createLogicAndMaterializedValue​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogicAndMaterializedValue](GraphStageWithMaterializedValue.html#createLogicAndMaterializedValue(akka.stream.Attributes))` in class `[GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[S](GraphStage.html "type parameter in GraphStage") extends [Shape](../Shape.html "class in akka.stream"),​[NotUsed](../../NotUsed.html "class in akka")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Balance.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Broadcast.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Concat.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Interleave.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Merge.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/MergeLatest.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/MergePreferred.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/MergePrioritized.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/MergeSequence.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/MergeSorted.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Partition.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/RestartWithBackoffFlow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/RestartWithBackoffSink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/RestartWithBackoffSource.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith10.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith11.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith12.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith13.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith14.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith15.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith16.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith17.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith18.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith19.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith2.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith20.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith21.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith22.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith3.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith4.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith5.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith6.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith7.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith8.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith9.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith10.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith11.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith12.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith13.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith14.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith15.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith16.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith17.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith18.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith19.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html)*