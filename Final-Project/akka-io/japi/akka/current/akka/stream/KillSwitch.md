---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:45:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/KillSwitch.html
title: KillSwitch
---

# KillSwitch

## Content

Package [akka.stream](package-summary.html)
## Interface KillSwitch

- All Known Implementing Classes:
`[SharedKillSwitch](SharedKillSwitch.html "class in akka.stream")`, `[UniqueKillSwitch](UniqueKillSwitch.html "class in akka.stream")`

---

```
public interface KillSwitch
```

A [`KillSwitch`](KillSwitch.html "interface in akka.stream") allows completion of [`Graph`](Graph.html "interface in akka.stream")s from the outside by completing [`Graph`](Graph.html "interface in akka.stream")s of [`FlowShape`](FlowShape.html "class in akka.stream") linked
 to the switch. Depending on whether the [`KillSwitch`](KillSwitch.html "interface in akka.stream") is a [`UniqueKillSwitch`](UniqueKillSwitch.html "class in akka.stream") or a [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") one or
 multiple streams might be linked with the switch. For details see the documentation of the concrete subclasses of
 this interface.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[abort](#abort(java.lang.Throwable))​(java.lang.Throwable ex)` | After calling [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) the linked [`Graph`](Graph.html "interface in akka.stream")s of [`FlowShape`](FlowShape.html "class in akka.stream") are failed. |
	| `void` | `[shutdown](#shutdown())()` | After calling [`shutdown()`](#shutdown()) the linked [`Graph`](Graph.html "interface in akka.stream")s of [`FlowShape`](FlowShape.html "class in akka.stream") are completed normally. |

- - ### Method Detail
	
	
	
		- #### abort
		
		
		
		```
		void abort​(java.lang.Throwable ex)
		```
		
		After calling [`abort(java.lang.Throwable)`](#abort(java.lang.Throwable)) the linked [`Graph`](Graph.html "interface in akka.stream")s of [`FlowShape`](FlowShape.html "class in akka.stream") are failed.
		- #### shutdown
		
		
		
		```
		void shutdown()
		```
		
		After calling [`shutdown()`](#shutdown()) the linked [`Graph`](Graph.html "interface in akka.stream")s of [`FlowShape`](FlowShape.html "class in akka.stream") are completed normally.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/KillSwitch.html
- https://doc.akka.io/japi/akka/current/akka/stream/SharedKillSwitch.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniqueKillSwitch.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/KillSwitch.html](https://doc.akka.io/japi/akka/current/akka/stream/KillSwitch.html)*