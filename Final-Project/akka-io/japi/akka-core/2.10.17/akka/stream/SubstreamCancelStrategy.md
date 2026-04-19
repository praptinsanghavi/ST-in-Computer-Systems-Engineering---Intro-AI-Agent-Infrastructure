---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:28:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SubstreamCancelStrategy.html
title: SubstreamCancelStrategy
---

# SubstreamCancelStrategy

## Content

Package [akka.stream](package-summary.html)
## Class SubstreamCancelStrategy

- java.lang.Object
- - akka.stream.SubstreamCancelStrategy

- Direct Known Subclasses:
`[SubstreamCancelStrategies.Drain$](SubstreamCancelStrategies.Drain$.html "class in akka.stream")`, `[SubstreamCancelStrategies.Propagate$](SubstreamCancelStrategies.Propagate$.html "class in akka.stream")`

---

```
public abstract class SubstreamCancelStrategy
extends java.lang.Object
```

Represents a strategy that decides how to deal with substream events.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SubstreamCancelStrategy](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SubstreamCancelStrategy](SubstreamCancelStrategy.html "class in akka.stream")` | `[drain](#drain())()` | Drain substream on cancellation in order to prevent stalling of the stream of streams. |
	| `static [SubstreamCancelStrategy](SubstreamCancelStrategy.html "class in akka.stream")` | `[propagate](#propagate())()` | Cancel the stream of streams if any substream is cancelled. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SubstreamCancelStrategy
		
		
		
		```
		public SubstreamCancelStrategy()
		```

	- ### Method Detail
	
	
	
		- #### propagate
		
		
		
		```
		public static [SubstreamCancelStrategy](SubstreamCancelStrategy.html "class in akka.stream") propagate()
		```
		
		Cancel the stream of streams if any substream is cancelled.
		- #### drain
		
		
		
		```
		public static [SubstreamCancelStrategy](SubstreamCancelStrategy.html "class in akka.stream") drain()
		```
		
		Drain substream on cancellation in order to prevent stalling of the stream of streams.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SubstreamCancelStrategies.Drain$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SubstreamCancelStrategies.Propagate$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SubstreamCancelStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SubstreamCancelStrategy.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SubstreamCancelStrategy.html)*