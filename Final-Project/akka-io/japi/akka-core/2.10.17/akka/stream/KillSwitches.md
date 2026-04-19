---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:27:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/KillSwitches.UniqueKillSwitchStage$.html
title: KillSwitches.UniqueKillSwitchStage$
---

# KillSwitches.UniqueKillSwitchStage$

## Content

Package [akka.stream](package-summary.html)
## Class KillSwitches.UniqueKillSwitchStage$

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<[FlowShape](FlowShape.html "class in akka.stream")\<java.lang.Object,​java.lang.Object\>,​[UniqueKillSwitch](UniqueKillSwitch.html "class in akka.stream")\>
	- - akka.stream.KillSwitches.UniqueKillSwitchStage$

- All Implemented Interfaces:
`[Graph](Graph.html "interface in akka.stream")<[FlowShape](FlowShape.html "class in akka.stream")<java.lang.Object,​java.lang.Object>,​[UniqueKillSwitch](UniqueKillSwitch.html "class in akka.stream")>`

Enclosing class:
[KillSwitches](KillSwitches.html "class in akka.stream")

---

```
public static class KillSwitches.UniqueKillSwitchStage$
extends [GraphStageWithMaterializedValue](stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FlowShape](FlowShape.html "class in akka.stream")<java.lang.Object,​java.lang.Object>,​[UniqueKillSwitch](UniqueKillSwitch.html "class in akka.stream")>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](Graph.GraphMapMatVal.html "class in akka.stream")<[S](Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](Shape.html "class in akka.stream"),​[M](Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [KillSwitches.UniqueKillSwitchStage$](KillSwitches.UniqueKillSwitchStage$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UniqueKillSwitchStage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Tuple2<[KillSwitches.KillableGraphStageLogic](KillSwitches.KillableGraphStageLogic.html "class in akka.stream"),​[UniqueKillSwitch](UniqueKillSwitch.html "class in akka.stream")>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes))​([Attributes](Attributes.html "class in akka.stream") attr)` |  |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[FlowShape](FlowShape.html "class in akka.stream")<java.lang.Object,​java.lang.Object>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](Graph.html "interface in akka.stream")
		
		
		`[addAttributes](Graph.html#addAttributes(akka.stream.Attributes)), [async](Graph.html#async()), [async](Graph.html#async(java.lang.String)), [async](Graph.html#async(java.lang.String,int)), [getAttributes](Graph.html#getAttributes()), [named](Graph.html#named(java.lang.String))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [KillSwitches.UniqueKillSwitchStage$](KillSwitches.UniqueKillSwitchStage$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UniqueKillSwitchStage$
		
		
		
		```
		public UniqueKillSwitchStage$()
		```

	- ### Method Detail
	
	
	
		- #### initialAttributes
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FlowShape](FlowShape.html "class in akka.stream")<java.lang.Object,​java.lang.Object>,​[UniqueKillSwitch](UniqueKillSwitch.html "class in akka.stream")>`
		- #### shape
		
		
		
		```
		public [FlowShape](FlowShape.html "class in akka.stream")<java.lang.Object,​java.lang.Object> shape()
		```
		
		Description copied from interface: `[Graph](Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### createLogicAndMaterializedValue
		
		
		
		```
		public scala.Tuple2<[KillSwitches.KillableGraphStageLogic](KillSwitches.KillableGraphStageLogic.html "class in akka.stream"),​[UniqueKillSwitch](UniqueKillSwitch.html "class in akka.stream")> createLogicAndMaterializedValue​([Attributes](Attributes.html "class in akka.stream") attr)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/KillSwitches.KillableGraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/KillSwitches.UniqueKillSwitchStage$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/KillSwitches.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/UniqueKillSwitch.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/KillSwitches.UniqueKillSwitchStage$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/KillSwitches.UniqueKillSwitchStage$.html)*