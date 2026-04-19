---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestKit$.html
title: TestKit$
---

# TestKit$

## Content

Package [akka.testkit](package-summary.html)
## Class TestKit$

- java.lang.Object
- - akka.testkit.TestKit$

- ---

```
public class TestKit$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestKit$](TestKit$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestKit$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[awaitCond](#awaitCond(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,boolean))​(scala.Function0<java.lang.Object> p,  scala.concurrent.duration.Duration max,  scala.concurrent.duration.Duration interval,  boolean noThrow)` | Await until the given condition evaluates to `true` or the timeout  expires, whichever comes first. |
	| `scala.concurrent.duration.Duration` | `[awaitCond$default$3](#awaitCond$default$3())()` |  |
	| `boolean` | `[awaitCond$default$4](#awaitCond$default$4())()` |  |
	| `scala.concurrent.duration.Duration` | `[now](#now())()` | Obtain current timestamp as Duration for relative measurements (using System.nanoTime). |
	| `void` | `[shutdownActorSystem](#shutdownActorSystem(akka.actor.ActorSystem,scala.concurrent.duration.Duration,boolean))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") actorSystem,  scala.concurrent.duration.Duration duration,  boolean verifySystemShutdown)` | Shut down an actor system and wait for termination. |
	| `scala.concurrent.duration.Duration` | `[shutdownActorSystem$default$2](#shutdownActorSystem$default$2())()` |  |
	| `boolean` | `[shutdownActorSystem$default$3](#shutdownActorSystem$default$3())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestKit$](TestKit$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestKit$
		
		
		
		```
		public TestKit$()
		```

	- ### Method Detail
	
	
	
		- #### awaitCond
		
		
		
		```
		public boolean awaitCond​(scala.Function0<java.lang.Object> p,
		                         scala.concurrent.duration.Duration max,
		                         scala.concurrent.duration.Duration interval,
		                         boolean noThrow)
		```
		
		Await until the given condition evaluates to `true` or the timeout
		 expires, whichever comes first.
		- #### awaitCond$default$3
		
		
		
		```
		public scala.concurrent.duration.Duration awaitCond$default$3()
		```
		- #### awaitCond$default$4
		
		
		
		```
		public boolean awaitCond$default$4()
		```
		- #### now
		
		
		
		```
		public scala.concurrent.duration.Duration now()
		```
		
		Obtain current timestamp as Duration for relative measurements (using System.nanoTime).
		- #### shutdownActorSystem
		
		
		
		```
		public void shutdownActorSystem​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") actorSystem,
		                                scala.concurrent.duration.Duration duration,
		                                boolean verifySystemShutdown)
		```
		
		Shut down an actor system and wait for termination.
		 On failure debug output will be logged about the remaining actors in the system.
		 
		 The `duration` is dilated by the timefactor.
		 
		
		
		 If verifySystemShutdown is true, then an exception will be thrown on failure.
		- #### shutdownActorSystem$default$2
		
		
		
		```
		public scala.concurrent.duration.Duration shutdownActorSystem$default$2()
		```
		- #### shutdownActorSystem$default$3
		
		
		
		```
		public boolean shutdownActorSystem$default$3()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestKit$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestKit$.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestKit$.html)*