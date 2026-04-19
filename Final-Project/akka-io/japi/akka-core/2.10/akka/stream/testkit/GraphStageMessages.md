---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/GraphStageMessages.html
title: GraphStageMessages
---

# GraphStageMessages

## Content

Package [akka.stream.testkit](package-summary.html)
## Class GraphStageMessages

- java.lang.Object
- - akka.stream.testkit.GraphStageMessages

- ---

```
public class GraphStageMessages
extends java.lang.Object
```

Messages emitted after the corresponding `stageUnderTest` methods has been invoked.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[GraphStageMessages.DownstreamFinish$](GraphStageMessages.DownstreamFinish$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[GraphStageMessages.Failure](GraphStageMessages.Failure.html "class in akka.stream.testkit")` |  |
	| `static class` | `[GraphStageMessages.Failure$](GraphStageMessages.Failure$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[GraphStageMessages.Pull$](GraphStageMessages.Pull$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[GraphStageMessages.Push$](GraphStageMessages.Push$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[GraphStageMessages.StageFailure](GraphStageMessages.StageFailure.html "class in akka.stream.testkit")` | Sent to the probe when the operator callback threw an exception  param: operation The operation that failed |
	| `static class` | `[GraphStageMessages.StageFailure$](GraphStageMessages.StageFailure$.html "class in akka.stream.testkit")` |  |
	| `static interface` | `[GraphStageMessages.StageMessage](GraphStageMessages.StageMessage.html "interface in akka.stream.testkit")` |  |
	| `static class` | `[GraphStageMessages.UpstreamFinish$](GraphStageMessages.UpstreamFinish$.html "class in akka.stream.testkit")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GraphStageMessages](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### GraphStageMessages
		
		
		
		```
		public GraphStageMessages()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/GraphStageMessages.DownstreamFinish$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/GraphStageMessages.Failure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/GraphStageMessages.Failure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/GraphStageMessages.Pull$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/GraphStageMessages.Push$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/GraphStageMessages.StageFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/GraphStageMessages.StageFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/GraphStageMessages.StageMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/GraphStageMessages.UpstreamFinish$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/GraphStageMessages.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/GraphStageMessages.html)*