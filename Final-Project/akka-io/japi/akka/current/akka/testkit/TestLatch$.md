---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestLatch$.html
title: TestLatch$
---

# TestLatch$

## Content

Package [akka.testkit](package-summary.html)
## Class TestLatch$

- java.lang.Object
- - akka.testkit.TestLatch$

- ---

```
public class TestLatch$
extends java.lang.Object
```

A count down latch wrapper for use in testing.
 It always uses a timeout when waiting and timeouts are specified as durations.
 There's a default timeout of 5 seconds and the default count is 1\.
 Timeouts will always throw an exception (no need to wrap in assert in tests).
 Timeouts are multiplied by the testing time factor for Jenkins builds.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestLatch$](TestLatch$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestLatch$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `[TestLatch](TestLatch.html "class in akka.testkit")` | `[apply](#apply(int,akka.actor.ActorSystem))​(int count,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `int` | `[apply$default$1](#apply$default$1())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[DefaultTimeout](#DefaultTimeout())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestLatch$](TestLatch$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestLatch$
		
		
		
		```
		public TestLatch$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public int $lessinit$greater$default$1()
		```
		- #### DefaultTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration DefaultTimeout()
		```
		- #### apply
		
		
		
		```
		public [TestLatch](TestLatch.html "class in akka.testkit") apply​(int count,
		                       [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply$default$1
		
		
		
		```
		public int apply$default$1()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestLatch$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestLatch.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestLatch$.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestLatch$.html)*