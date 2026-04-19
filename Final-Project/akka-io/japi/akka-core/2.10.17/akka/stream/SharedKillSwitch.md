---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:28:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SharedKillSwitch.html
title: SharedKillSwitch
---

# SharedKillSwitch

## Content

Package [akka.stream](package-summary.html)
## Class SharedKillSwitch

- java.lang.Object
- - akka.stream.SharedKillSwitch

- All Implemented Interfaces:
`[KillSwitch](KillSwitch.html "interface in akka.stream")`

---

```
public final class SharedKillSwitch
extends java.lang.Object
implements [KillSwitch](KillSwitch.html "interface in akka.stream")
```

A [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") is a provider for [`Graph`](Graph.html "interface in akka.stream")s of [`FlowShape`](FlowShape.html "class in akka.stream") that can be completed or failed from the outside.
 A [`Graph`](Graph.html "interface in akka.stream") returned by the switch can be materialized arbitrary amount of times: every newly materialized [`Graph`](Graph.html "interface in akka.stream")
 belongs to the switch from which it was acquired. Multiple [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") instances are isolated from each other,
 shutting down or aborting on instance does not affect the [`Graph`](Graph.html "interface in akka.stream")s provided by another instance.
 
 After calling [`shutdown()`](#shutdown()) all materialized, running instances of all [`Graph`](Graph.html "interface in akka.stream")s provided by the
 [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") will complete their downstreams and cancel their upstreams (unless if finished or failed already in which
 case the command is ignored). Subsequent invocations of [`shutdown()`](#shutdown()) and [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) will be
 ignored.
 

 After calling [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) all materialized, running instances of all [`Graph`](Graph.html "interface in akka.stream")s provided by the
 [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") will fail their downstreams with the provided exception and cancel their upstreams
 (unless it finished or failed already in which case the command is ignored). Subsequent invocations of
 [`shutdown()`](#shutdown()) and [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) will be ignored.
 

 The [`Graph`](Graph.html "interface in akka.stream")s provided by the [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") do not modify the passed through elements in any way or affect
 backpressure in the stream. All provided [`Graph`](Graph.html "interface in akka.stream")s provide the parent [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") as materialized value.
 

 This class is thread\-safe, the instance can be passed safely among threads and its methods may be invoked concurrently.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[abort](#abort(java.lang.Throwable))​(java.lang.Throwable reason)` | After calling [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) all materialized, running instances of all [`Graph`](Graph.html "interface in akka.stream")s provided by the  [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") will fail their downstreams with the provided exception and cancel their upstreams  (unless it finished or failed already in which case the command is ignored). |
	| `<T> [Graph](Graph.html "interface in akka.stream")<[FlowShape](FlowShape.html "class in akka.stream")<T,​T>,​[SharedKillSwitch](SharedKillSwitch.html "class in akka.stream")>` | `[flow](#flow())()` | Returns a typed Flow of a requested type that will be linked to this [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") instance. |
	| `java.lang.String` | `[name](#name())()` |  |
	| `void` | `[shutdown](#shutdown())()` | After calling [`shutdown()`](#shutdown()) all materialized, running instances of all [`Graph`](Graph.html "interface in akka.stream")s provided by the  [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") will complete their downstreams and cancel their upstreams (unless if finished or failed already in which  case the command is ignored). |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### abort
		
		
		
		```
		public void abort​(java.lang.Throwable reason)
		```
		
		After calling [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) all materialized, running instances of all [`Graph`](Graph.html "interface in akka.stream")s provided by the
		 [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") will fail their downstreams with the provided exception and cancel their upstreams
		 (unless it finished or failed already in which case the command is ignored). Subsequent invocations of
		 [`shutdown()`](#shutdown()) and [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) will be ignored.
		 
		 These provided [`Graph`](Graph.html "interface in akka.stream")s materialize to their owning switch. This might make certain integrations simpler than
		 passing around the switch instance itself.
		 
		
		
		
		Specified by:
		`[abort](KillSwitch.html#abort(java.lang.Throwable))` in interface `[KillSwitch](KillSwitch.html "interface in akka.stream")`
		Parameters:
		`reason` \- The exception to be used for failing the linked [`Graph`](Graph.html "interface in akka.stream")s
		- #### flow
		
		
		
		```
		public <T> [Graph](Graph.html "interface in akka.stream")<[FlowShape](FlowShape.html "class in akka.stream")<T,​T>,​[SharedKillSwitch](SharedKillSwitch.html "class in akka.stream")> flow()
		```
		
		Returns a typed Flow of a requested type that will be linked to this [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") instance. By invoking
		 [`shutdown()`](#shutdown()) or [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) all running instances of all provided [`Graph`](Graph.html "interface in akka.stream")s by this
		 switch will be stopped normally or failed.
		 
		
		Returns:
		A reusable [`Graph`](Graph.html "interface in akka.stream") that is linked with the switch. The materialized value provided is this switch itself.
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### shutdown
		
		
		
		```
		public void shutdown()
		```
		
		After calling [`shutdown()`](#shutdown()) all materialized, running instances of all [`Graph`](Graph.html "interface in akka.stream")s provided by the
		 [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") will complete their downstreams and cancel their upstreams (unless if finished or failed already in which
		 case the command is ignored). Subsequent invocations of [`shutdown()`](#shutdown()) and [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) will be
		 ignored.
		
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
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SharedKillSwitch.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SharedKillSwitch.html)*