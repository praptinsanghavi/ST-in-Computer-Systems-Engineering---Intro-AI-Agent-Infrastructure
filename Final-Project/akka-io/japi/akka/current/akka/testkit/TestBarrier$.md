---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestBarrier$.html
title: TestBarrier$
---

# TestBarrier$

## Content

Package [akka.testkit](package-summary.html)
## Class TestBarrier$

- java.lang.Object
- - akka.testkit.TestBarrier$

- ---

```
public class TestBarrier$
extends java.lang.Object
```

A cyclic barrier wrapper for use in testing.
 It always uses a timeout when waiting and timeouts are specified as durations.
 Timeouts will always throw an exception. The default timeout is 5 seconds.
 Timeouts are multiplied by the testing time factor for Jenkins builds.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestBarrier$](TestBarrier$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestBarrier$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestBarrier](TestBarrier.html "class in akka.testkit")` | `[apply](#apply(int))​(int count)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[DefaultTimeout](#DefaultTimeout())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestBarrier$](TestBarrier$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestBarrier$
		
		
		
		```
		public TestBarrier$()
		```

	- ### Method Detail
	
	
	
		- #### DefaultTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration DefaultTimeout()
		```
		- #### apply
		
		
		
		```
		public [TestBarrier](TestBarrier.html "class in akka.testkit") apply​(int count)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/testkit/TestBarrier$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestBarrier.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestBarrier$.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestBarrier$.html)*