---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:48:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/SubstreamCancelStrategy$.html
title: SubstreamCancelStrategy$
---

# SubstreamCancelStrategy$

## Content

Package [akka.stream](package-summary.html)
## Class SubstreamCancelStrategy$

- java.lang.Object
- - akka.stream.SubstreamCancelStrategy$

- ---

```
public class SubstreamCancelStrategy$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SubstreamCancelStrategy$](SubstreamCancelStrategy$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SubstreamCancelStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SubstreamCancelStrategy](SubstreamCancelStrategy.html "class in akka.stream")` | `[drain](#drain())()` | Drain substream on cancellation in order to prevent stalling of the stream of streams. |
	| `[SubstreamCancelStrategy](SubstreamCancelStrategy.html "class in akka.stream")` | `[propagate](#propagate())()` | Cancel the stream of streams if any substream is cancelled. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SubstreamCancelStrategy$](SubstreamCancelStrategy$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SubstreamCancelStrategy$
		
		
		
		```
		public SubstreamCancelStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### propagate
		
		
		
		```
		public [SubstreamCancelStrategy](SubstreamCancelStrategy.html "class in akka.stream") propagate()
		```
		
		Cancel the stream of streams if any substream is cancelled.
		- #### drain
		
		
		
		```
		public [SubstreamCancelStrategy](SubstreamCancelStrategy.html "class in akka.stream") drain()
		```
		
		Drain substream on cancellation in order to prevent stalling of the stream of streams.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/SubstreamCancelStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/stream/SubstreamCancelStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/SubstreamCancelStrategy$.html](https://doc.akka.io/japi/akka/current/akka/stream/SubstreamCancelStrategy$.html)*