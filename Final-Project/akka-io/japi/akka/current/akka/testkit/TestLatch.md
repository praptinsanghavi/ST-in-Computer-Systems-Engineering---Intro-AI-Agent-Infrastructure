---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestLatch.html
title: TestLatch
---

# TestLatch

## Content

Package [akka.testkit](package-summary.html)
## Class TestLatch

- java.lang.Object
- - akka.testkit.TestLatch

- All Implemented Interfaces:
`scala.concurrent.Awaitable<scala.runtime.BoxedUnit>`

---

```
public class TestLatch
extends java.lang.Object
implements scala.concurrent.Awaitable<scala.runtime.BoxedUnit>
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestLatch](#%3Cinit%3E(int,akka.actor.ActorSystem))​(int count,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static int` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `static [TestLatch](TestLatch.html "class in akka.testkit")` | `[apply](#apply(int,akka.actor.ActorSystem))​(int count,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static int` | `[apply$default$1](#apply$default$1())()` |  |
	| `void` | `[countDown](#countDown())()` |  |
	| `static scala.concurrent.duration.FiniteDuration` | `[DefaultTimeout](#DefaultTimeout())()` |  |
	| `boolean` | `[isOpen](#isOpen())()` |  |
	| `void` | `[open](#open())()` |  |
	| `[TestLatch](TestLatch.html "class in akka.testkit")` | `[ready](#ready(scala.concurrent.duration.Duration,scala.concurrent.CanAwait))​(scala.concurrent.duration.Duration atMost,  scala.concurrent.CanAwait permit)` |  |
	| `void` | `[reset](#reset())()` |  |
	| `void` | `[result](#result(scala.concurrent.duration.Duration,scala.concurrent.CanAwait))​(scala.concurrent.duration.Duration atMost,  scala.concurrent.CanAwait permit)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestLatch
		
		
		
		```
		public TestLatch​(int count,
		                 [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public static int $lessinit$greater$default$1()
		```
		- #### DefaultTimeout
		
		
		
		```
		public static scala.concurrent.duration.FiniteDuration DefaultTimeout()
		```
		- #### apply
		
		
		
		```
		public static [TestLatch](TestLatch.html "class in akka.testkit") apply​(int count,
		                              [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply$default$1
		
		
		
		```
		public static int apply$default$1()
		```
		- #### countDown
		
		
		
		```
		public void countDown()
		```
		- #### isOpen
		
		
		
		```
		public boolean isOpen()
		```
		- #### open
		
		
		
		```
		public void open()
		```
		- #### reset
		
		
		
		```
		public void reset()
		```
		- #### ready
		
		
		
		```
		public [TestLatch](TestLatch.html "class in akka.testkit") ready​(scala.concurrent.duration.Duration atMost,
		                       scala.concurrent.CanAwait permit)
		                throws java.util.concurrent.TimeoutException
		```
		
		
		Specified by:
		`ready` in interface `scala.concurrent.Awaitable<scala.runtime.BoxedUnit>`
		Throws:
		`java.util.concurrent.TimeoutException`
		- #### result
		
		
		
		```
		public void result​(scala.concurrent.duration.Duration atMost,
		                   scala.concurrent.CanAwait permit)
		            throws java.lang.Exception
		```
		
		
		Specified by:
		`result` in interface `scala.concurrent.Awaitable<scala.runtime.BoxedUnit>`
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestLatch.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestLatch.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestLatch.html)*