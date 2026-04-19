---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:47:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/testkit/javadsl/StreamTestKit.html
title: StreamTestKit
---

# StreamTestKit

## Content

Package [akka.stream.testkit.javadsl](package-summary.html)
## Class StreamTestKit

- java.lang.Object
- - akka.stream.testkit.javadsl.StreamTestKit

- ---

```
public class StreamTestKit
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamTestKit](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[assertAllStagesStopped](#assertAllStagesStopped(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Assert that there are no stages running under a given system's materializer. |
	| `static void` | `[assertAllStagesStopped](#assertAllStagesStopped(akka.stream.Materializer))​([Materializer](../../Materializer.html "class in akka.stream") mat)` | Assert that there are no stages running under a given materializer. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StreamTestKit
		
		
		
		```
		public StreamTestKit()
		```

	- ### Method Detail
	
	
	
		- #### assertAllStagesStopped
		
		
		
		```
		public static void assertAllStagesStopped​([Materializer](../../Materializer.html "class in akka.stream") mat)
		```
		
		Assert that there are no stages running under a given materializer.
		 Usually this assertion is run after a test\-case to check that all of the
		 stages have terminated successfully.
		- #### assertAllStagesStopped
		
		
		
		```
		public static void assertAllStagesStopped​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Assert that there are no stages running under a given system's materializer.
		 Usually this assertion is run after a test\-case to check that all of the
		 stages have terminated successfully.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/testkit/javadsl/StreamTestKit.html](https://doc.akka.io/japi/akka/current/akka/stream/testkit/javadsl/StreamTestKit.html)*