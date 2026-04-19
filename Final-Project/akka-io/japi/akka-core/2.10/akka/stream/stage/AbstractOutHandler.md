---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:49:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/AbstractOutHandler.html
title: AbstractOutHandler
---

# AbstractOutHandler

## Content

Package [akka.stream.stage](package-summary.html)
## Class AbstractOutHandler

- java.lang.Object
- - akka.stream.stage.AbstractOutHandler

- All Implemented Interfaces:
`[OutHandler](OutHandler.html "interface in akka.stream.stage")`

---

```
public abstract class AbstractOutHandler
extends java.lang.Object
implements [OutHandler](OutHandler.html "interface in akka.stream.stage")
```

Java API: callbacks for an output port where termination logic is predefined
 (completing when downstream cancels).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractOutHandler](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.stage.[OutHandler](OutHandler.html "interface in akka.stream.stage")
		
		
		`[onDownstreamFinish](OutHandler.html#onDownstreamFinish()), [onDownstreamFinish](OutHandler.html#onDownstreamFinish(java.lang.Throwable)), [onPull](OutHandler.html#onPull())`

- - ### Constructor Detail
	
	
	
		- #### AbstractOutHandler
		
		
		
		```
		public AbstractOutHandler()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/OutHandler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/AbstractOutHandler.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/AbstractOutHandler.html)*