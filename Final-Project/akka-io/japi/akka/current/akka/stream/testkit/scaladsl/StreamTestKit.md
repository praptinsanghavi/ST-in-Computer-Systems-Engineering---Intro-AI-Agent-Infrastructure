---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:47:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/StreamTestKit.html
title: StreamTestKit
---

# StreamTestKit

## Content

Package [akka.stream.testkit.scaladsl](package-summary.html)
## Class StreamTestKit

- java.lang.Object
- - akka.stream.testkit.scaladsl.StreamTestKit

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
	| `static <T> T` | `[assertAllStagesStopped](#assertAllStagesStopped(scala.Function0,akka.stream.Materializer))​(scala.Function0<T> block,  [Materializer](../../Materializer.html "class in akka.stream") materializer)` | Asserts that after the given code block is ran, no stages are left over  that were created by the given materializer. |
	
	
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
		public static <T> T assertAllStagesStopped​(scala.Function0<T> block,
		                                           [Materializer](../../Materializer.html "class in akka.stream") materializer)
		```
		
		Asserts that after the given code block is ran, no stages are left over
		 that were created by the given materializer.
		 
		 This assertion is useful to check that all of the stages have
		 terminated successfully.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/StreamTestKit.html](https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/StreamTestKit.html)*