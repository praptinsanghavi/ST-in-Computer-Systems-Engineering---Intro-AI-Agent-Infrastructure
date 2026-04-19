---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestBarrier.html
title: TestBarrier
---

# TestBarrier

## Content

Package [akka.testkit](package-summary.html)
## Class TestBarrier

- java.lang.Object
- - akka.testkit.TestBarrier

- ---

```
public class TestBarrier
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestBarrier](#%3Cinit%3E(int))​(int count)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TestBarrier](TestBarrier.html "class in akka.testkit")` | `[apply](#apply(int))​(int count)` |  |
	| `void` | `[await](#await(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `void` | `[await](#await(scala.concurrent.duration.FiniteDuration,akka.actor.ActorSystem))​(scala.concurrent.duration.FiniteDuration timeout,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static scala.concurrent.duration.FiniteDuration` | `[DefaultTimeout](#DefaultTimeout())()` |  |
	| `void` | `[reset](#reset())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestBarrier
		
		
		
		```
		public TestBarrier​(int count)
		```

	- ### Method Detail
	
	
	
		- #### DefaultTimeout
		
		
		
		```
		public static scala.concurrent.duration.FiniteDuration DefaultTimeout()
		```
		- #### apply
		
		
		
		```
		public static [TestBarrier](TestBarrier.html "class in akka.testkit") apply​(int count)
		```
		- #### await
		
		
		
		```
		public void await​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### await
		
		
		
		```
		public void await​(scala.concurrent.duration.FiniteDuration timeout,
		                  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### reset
		
		
		
		```
		public void reset()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestBarrier.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestBarrier.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestBarrier.html)*