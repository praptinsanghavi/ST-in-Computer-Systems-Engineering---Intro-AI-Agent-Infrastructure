---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:47:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/KillSwitches$.html
title: KillSwitches$
---

# KillSwitches$

## Content

Package [akka.stream](package-summary.html)
## Class KillSwitches$

- java.lang.Object
- - akka.stream.KillSwitches$

- ---

```
public class KillSwitches$
extends java.lang.Object
```

Creates shared or single kill switches which can be used to control completion of graphs from the outside.
 \- The factory shared() returns a [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") which provides a [`Graph`](Graph.html "interface in akka.stream") of [`FlowShape`](FlowShape.html "class in akka.stream") that can be
 used in arbitrary number of graphs and materializations. The switch simultaneously
 controls completion in all of those graphs.
 \- The factory single() returns a [`Graph`](Graph.html "interface in akka.stream") of [`FlowShape`](FlowShape.html "class in akka.stream") that materializes to a [`UniqueKillSwitch`](UniqueKillSwitch.html "class in akka.stream")
 which is always unique
 to that materialized Flow itself.
 
 Creates a [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") that can be used to externally control the completion of various streams.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [KillSwitches$](KillSwitches$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[KillSwitches$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SharedKillSwitch](SharedKillSwitch.html "class in akka.stream")` | `[shared](#shared(java.lang.String))​(java.lang.String name)` | Creates a new [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") with the given name that can be used to control the completion of multiple  streams from the outside simultaneously. |
	| `<T> [Graph](Graph.html "interface in akka.stream")<[FlowShape](FlowShape.html "class in akka.stream")<T,​T>,​[UniqueKillSwitch](UniqueKillSwitch.html "class in akka.stream")>` | `[single](#single())()` | Creates a new [`Graph`](Graph.html "interface in akka.stream") of [`FlowShape`](FlowShape.html "class in akka.stream") that materializes to an external switch that allows external completion  of that unique materialization. |
	| `<T1,​T2>[Graph](Graph.html "interface in akka.stream")<[BidiShape](BidiShape.html "class in akka.stream")<T1,​T1,​T2,​T2>,​[UniqueKillSwitch](UniqueKillSwitch.html "class in akka.stream")>` | `[singleBidi](#singleBidi())()` | Creates a new [`Graph`](Graph.html "interface in akka.stream") of [`FlowShape`](FlowShape.html "class in akka.stream") that materializes to an external switch that allows external completion  of that unique materialization. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [KillSwitches$](KillSwitches$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### KillSwitches$
		
		
		
		```
		public KillSwitches$()
		```

	- ### Method Detail
	
	
	
		- #### shared
		
		
		
		```
		public [SharedKillSwitch](SharedKillSwitch.html "class in akka.stream") shared​(java.lang.String name)
		```
		
		Creates a new [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") with the given name that can be used to control the completion of multiple
		 streams from the outside simultaneously.
		 
		
		See Also:
		[`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream")
		- #### single
		
		
		
		```
		public <T> [Graph](Graph.html "interface in akka.stream")<[FlowShape](FlowShape.html "class in akka.stream")<T,​T>,​[UniqueKillSwitch](UniqueKillSwitch.html "class in akka.stream")> single()
		```
		
		Creates a new [`Graph`](Graph.html "interface in akka.stream") of [`FlowShape`](FlowShape.html "class in akka.stream") that materializes to an external switch that allows external completion
		 of that unique materialization. Different materializations result in different, independent switches.
		 
		 For a Bidi version see `KillSwitch#singleBidi`
		- #### singleBidi
		
		
		
		```
		public <T1,​T2> [Graph](Graph.html "interface in akka.stream")<[BidiShape](BidiShape.html "class in akka.stream")<T1,​T1,​T2,​T2>,​[UniqueKillSwitch](UniqueKillSwitch.html "class in akka.stream")> singleBidi()
		```
		
		Creates a new [`Graph`](Graph.html "interface in akka.stream") of [`FlowShape`](FlowShape.html "class in akka.stream") that materializes to an external switch that allows external completion
		 of that unique materialization. Different materializations result in different, independent switches.
		 
		 For a Flow version see `KillSwitch#single`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/BidiShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/KillSwitches$.html
- https://doc.akka.io/japi/akka/current/akka/stream/SharedKillSwitch.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniqueKillSwitch.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/KillSwitches$.html](https://doc.akka.io/japi/akka/current/akka/stream/KillSwitches$.html)*