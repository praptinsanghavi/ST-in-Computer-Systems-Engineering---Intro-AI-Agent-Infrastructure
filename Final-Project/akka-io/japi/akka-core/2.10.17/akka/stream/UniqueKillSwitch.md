---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:29:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/UniqueKillSwitch.html
title: UniqueKillSwitch
---

# UniqueKillSwitch

## Content

Package [akka.stream](package-summary.html)
## Class UniqueKillSwitch

- java.lang.Object
- - akka.stream.UniqueKillSwitch

- All Implemented Interfaces:
`[KillSwitch](KillSwitch.html "interface in akka.stream")`

---

```
public final class UniqueKillSwitch
extends java.lang.Object
implements [KillSwitch](KillSwitch.html "interface in akka.stream")
```

A [`UniqueKillSwitch`](UniqueKillSwitch.html "class in akka.stream") is always a result of a materialization (unlike [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") which is constructed
 before any materialization) and it always controls that graph and operator which yielded the materialized value.
 
 After calling [`shutdown()`](#shutdown()) the running instance of the [`Graph`](Graph.html "interface in akka.stream") of [`FlowShape`](FlowShape.html "class in akka.stream") that materialized to the
 [`UniqueKillSwitch`](UniqueKillSwitch.html "class in akka.stream") will complete its downstream and cancel its upstream (unless if finished or failed already in which
 case the command is ignored). Subsequent invocations of completion commands will be ignored.
 

 After calling [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) the running instance of the [`Graph`](Graph.html "interface in akka.stream") of [`FlowShape`](FlowShape.html "class in akka.stream") that materialized to the
 [`UniqueKillSwitch`](UniqueKillSwitch.html "class in akka.stream") will fail its downstream with the provided exception and cancel its upstream
 (unless if finished or failed already in which case the command is ignored). Subsequent invocations of
 completion commands will be ignored.
 

 It is also possible to individually cancel, complete or fail upstream and downstream parts by calling the corresponding
 methods.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[abort](#abort(java.lang.Throwable))​(java.lang.Throwable ex)` | After calling [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) the running instance of the [`Graph`](Graph.html "interface in akka.stream") of [`FlowShape`](FlowShape.html "class in akka.stream") that materialized to the  [`UniqueKillSwitch`](UniqueKillSwitch.html "class in akka.stream") will fail its downstream with the provided exception and cancel its upstream  (unless if finished or failed already in which case the command is ignored). |
	| `void` | `[shutdown](#shutdown())()` | After calling [`shutdown()`](#shutdown()) the running instance of the [`Graph`](Graph.html "interface in akka.stream") of [`FlowShape`](FlowShape.html "class in akka.stream") that materialized to the  [`UniqueKillSwitch`](UniqueKillSwitch.html "class in akka.stream") will complete its downstream and cancel its upstream (unless if finished or failed already in which  case the command is ignored). |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### abort
		
		
		
		```
		public void abort​(java.lang.Throwable ex)
		```
		
		After calling [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) the running instance of the [`Graph`](Graph.html "interface in akka.stream") of [`FlowShape`](FlowShape.html "class in akka.stream") that materialized to the
		 [`UniqueKillSwitch`](UniqueKillSwitch.html "class in akka.stream") will fail its downstream with the provided exception and cancel its upstream
		 (unless if finished or failed already in which case the command is ignored). Subsequent invocations of
		 completion commands will be ignored.
		
		Specified by:
		`[abort](KillSwitch.html#abort(java.lang.Throwable))` in interface `[KillSwitch](KillSwitch.html "interface in akka.stream")`
		- #### shutdown
		
		
		
		```
		public void shutdown()
		```
		
		After calling [`shutdown()`](#shutdown()) the running instance of the [`Graph`](Graph.html "interface in akka.stream") of [`FlowShape`](FlowShape.html "class in akka.stream") that materialized to the
		 [`UniqueKillSwitch`](UniqueKillSwitch.html "class in akka.stream") will complete its downstream and cancel its upstream (unless if finished or failed already in which
		 case the command is ignored). Subsequent invocations of completion commands will be ignored.
		
		Specified by:
		`[shutdown](KillSwitch.html#shutdown())` in interface `[KillSwitch](KillSwitch.html "interface in akka.stream")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/KillSwitch.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SharedKillSwitch.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/UniqueKillSwitch.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/UniqueKillSwitch.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/UniqueKillSwitch.html)*