---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:04:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptStageTerminationException.html
title: AbruptStageTerminationException
---

# AbruptStageTerminationException

## Content

Package [akka.stream](package-summary.html)
## Class AbruptStageTerminationException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.stream.AbruptStreamTerminationException](AbruptStreamTerminationException.html "class in akka.stream")
				- - akka.stream.AbruptStageTerminationException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public final class AbruptStageTerminationException
extends [AbruptStreamTerminationException](AbruptStreamTerminationException.html "class in akka.stream")
```

Signal that the operator was abruptly terminated, usually seen as a call to `postStop` of the `GraphStageLogic` without
 any of the handler callbacks seeing completion or failure from upstream or cancellation from downstream. This can happen when
 the actor running the graph is killed, which happens when the materializer or actor system is terminated.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.AbruptStageTerminationException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbruptStageTerminationException](#%3Cinit%3E(akka.stream.stage.GraphStageLogic))​([GraphStageLogic](stage/GraphStageLogic.html "class in akka.stream.stage") logic)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### AbruptStageTerminationException
		
		
		
		```
		public AbruptStageTerminationException​([GraphStageLogic](stage/GraphStageLogic.html "class in akka.stream.stage") logic)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptStreamTerminationException.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptStageTerminationException.html](https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptStageTerminationException.html)*