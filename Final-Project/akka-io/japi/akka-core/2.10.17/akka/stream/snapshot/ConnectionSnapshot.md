---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:55:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/ConnectionSnapshot.html
title: ConnectionSnapshot
---

# ConnectionSnapshot

## Content

Package [akka.stream.snapshot](package-summary.html)
## Interface ConnectionSnapshot

- ---

```
public interface ConnectionSnapshot
```

Not for user extension

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[ConnectionSnapshot.Closed$](ConnectionSnapshot.Closed$.html "class in akka.stream.snapshot")` |  |
	| `static interface` | `[ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot")` | Not for user extension |
	| `static class` | `[ConnectionSnapshot.ShouldPull$](ConnectionSnapshot.ShouldPull$.html "class in akka.stream.snapshot")` |  |
	| `static class` | `[ConnectionSnapshot.ShouldPush$](ConnectionSnapshot.ShouldPush$.html "class in akka.stream.snapshot")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")` | `[in](#in())()` |  |
	| `[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")` | `[out](#out())()` |  |
	| `[ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot")` | `[state](#state())()` |  |

- - ### Method Detail
	
	
	
		- #### in
		
		
		
		```
		[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot") in()
		```
		- #### out
		
		
		
		```
		[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot") out()
		```
		- #### state
		
		
		
		```
		[ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot") state()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/ConnectionSnapshot.Closed$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/ConnectionSnapshot.ConnectionState.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/ConnectionSnapshot.ShouldPull$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/ConnectionSnapshot.ShouldPush$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/LogicSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/ConnectionSnapshot.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/ConnectionSnapshot.html)*