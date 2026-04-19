---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:45:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/FlowMonitor.html
title: FlowMonitor
---

# FlowMonitor

## Content

Package [akka.stream](package-summary.html)
## Interface FlowMonitor\<T\>

- Type Parameters:
`T` \- Type of messages passed by the stream

---

```
public interface FlowMonitor<T>
```

Used to monitor the state of a stream

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<[T](FlowMonitor.html "type parameter in FlowMonitor")>` | `[state](#state())()` |  |

- - ### Method Detail
	
	
	
		- #### state
		
		
		
		```
		[FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<[T](FlowMonitor.html "type parameter in FlowMonitor")> state()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/FlowMonitor.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowMonitorState.StreamState.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/FlowMonitor.html](https://doc.akka.io/japi/akka/current/akka/stream/FlowMonitor.html)*