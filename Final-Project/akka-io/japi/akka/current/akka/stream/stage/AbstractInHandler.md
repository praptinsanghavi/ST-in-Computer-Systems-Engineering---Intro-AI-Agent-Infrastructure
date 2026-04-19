---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/stage/AbstractInHandler.html
title: AbstractInHandler
---

# AbstractInHandler

## Content

Package [akka.stream.stage](package-summary.html)
## Class AbstractInHandler

- java.lang.Object
- - akka.stream.stage.AbstractInHandler

- All Implemented Interfaces:
`[InHandler](InHandler.html "interface in akka.stream.stage")`

---

```
public abstract class AbstractInHandler
extends java.lang.Object
implements [InHandler](InHandler.html "interface in akka.stream.stage")
```

Java API: callbacks for an input port where termination logic is predefined
 (completing when upstream completes, failing when upstream fails).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractInHandler](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.stage.[InHandler](InHandler.html "interface in akka.stream.stage")
		
		
		`[onPush](InHandler.html#onPush()), [onUpstreamFailure](InHandler.html#onUpstreamFailure(java.lang.Throwable)), [onUpstreamFinish](InHandler.html#onUpstreamFinish())`

- - ### Constructor Detail
	
	
	
		- #### AbstractInHandler
		
		
		
		```
		public AbstractInHandler()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/stage/InHandler.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/stage/AbstractInHandler.html](https://doc.akka.io/japi/akka/current/akka/stream/stage/AbstractInHandler.html)*