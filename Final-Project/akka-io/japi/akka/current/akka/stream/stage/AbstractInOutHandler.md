---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/stage/AbstractInOutHandler.html
title: AbstractInOutHandler
---

# AbstractInOutHandler

## Content

Package [akka.stream.stage](package-summary.html)
## Class AbstractInOutHandler

- java.lang.Object
- - akka.stream.stage.AbstractInOutHandler

- All Implemented Interfaces:
`[InHandler](InHandler.html "interface in akka.stream.stage")`, `[OutHandler](OutHandler.html "interface in akka.stream.stage")`

---

```
public abstract class AbstractInOutHandler
extends java.lang.Object
implements [InHandler](InHandler.html "interface in akka.stream.stage"), [OutHandler](OutHandler.html "interface in akka.stream.stage")
```

Java API: callback combination for output and input ports where termination logic is predefined
 (completing when upstream completes, failing when upstream fails, completing when downstream cancels).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractInOutHandler](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.stage.[InHandler](InHandler.html "interface in akka.stream.stage")
		
		
		`[onPush](InHandler.html#onPush()), [onUpstreamFailure](InHandler.html#onUpstreamFailure(java.lang.Throwable)), [onUpstreamFinish](InHandler.html#onUpstreamFinish())`
		- ### Methods inherited from interface akka.stream.stage.[OutHandler](OutHandler.html "interface in akka.stream.stage")
		
		
		`[onDownstreamFinish](OutHandler.html#onDownstreamFinish()), [onDownstreamFinish](OutHandler.html#onDownstreamFinish(java.lang.Throwable)), [onPull](OutHandler.html#onPull())`

- - ### Constructor Detail
	
	
	
		- #### AbstractInOutHandler
		
		
		
		```
		public AbstractInOutHandler()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/stage/InHandler.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/OutHandler.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/stage/AbstractInOutHandler.html](https://doc.akka.io/japi/akka/current/akka/stream/stage/AbstractInOutHandler.html)*