---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/javadsl/TestKit$.html
title: TestKit$
---

# TestKit$

## Content

Package [akka.testkit.javadsl](package-summary.html)
## Class TestKit$

- java.lang.Object
- - akka.testkit.javadsl.TestKit$

- ---

```
public class TestKit$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestKit$](TestKit$.html "class in akka.testkit.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestKit$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[shutdownActorSystem](#shutdownActorSystem(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem)` | Shut down an actor system and wait for termination. |
	| `void` | `[shutdownActorSystem](#shutdownActorSystem(akka.actor.ActorSystem,boolean))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem,  boolean verifySystemShutdown)` | Shut down an actor system and wait for termination. |
	| `void` | `[shutdownActorSystem](#shutdownActorSystem(akka.actor.ActorSystem,scala.concurrent.duration.Duration))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem,  scala.concurrent.duration.Duration duration)` | Shut down an actor system and wait for termination. |
	| `void` | `[shutdownActorSystem](#shutdownActorSystem(akka.actor.ActorSystem,scala.concurrent.duration.Duration,boolean))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem,  scala.concurrent.duration.Duration duration,  boolean verifySystemShutdown)` | Shut down an actor system and wait for termination. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestKit$](TestKit$.html "class in akka.testkit.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestKit$
		
		
		
		```
		public TestKit$()
		```

	- ### Method Detail
	
	
	
		- #### shutdownActorSystem
		
		
		
		```
		public void shutdownActorSystem​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem,
		                                scala.concurrent.duration.Duration duration,
		                                boolean verifySystemShutdown)
		```
		
		Shut down an actor system and wait for termination.
		 On failure debug output will be logged about the remaining actors in the system.
		 
		 If verifySystemShutdown is true, then an exception will be thrown on failure.
		- #### shutdownActorSystem
		
		
		
		```
		public void shutdownActorSystem​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem)
		```
		
		Shut down an actor system and wait for termination.
		 On failure debug output will be logged about the remaining actors in the system.
		- #### shutdownActorSystem
		
		
		
		```
		public void shutdownActorSystem​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem,
		                                scala.concurrent.duration.Duration duration)
		```
		
		Shut down an actor system and wait for termination.
		 On failure debug output will be logged about the remaining actors in the system.
		- #### shutdownActorSystem
		
		
		
		```
		public void shutdownActorSystem​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem,
		                                boolean verifySystemShutdown)
		```
		
		Shut down an actor system and wait for termination.
		 On failure debug output will be logged about the remaining actors in the system.
		 
		 If verifySystemShutdown is true, then an exception will be thrown on failure.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/testkit/javadsl/TestKit$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/javadsl/TestKit$.html](https://doc.akka.io/japi/akka/current/akka/testkit/javadsl/TestKit$.html)*