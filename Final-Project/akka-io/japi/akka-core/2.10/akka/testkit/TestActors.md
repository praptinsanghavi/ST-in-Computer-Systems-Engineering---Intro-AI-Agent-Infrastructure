---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActors.html
title: TestActors
---

# TestActors

## Content

Package [akka.testkit](package-summary.html)
## Class TestActors

- java.lang.Object
- - akka.testkit.TestActors

- ---

```
public class TestActors
extends java.lang.Object
```

A collection of common actor patterns used in tests.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[TestActors.BlackholeActor](TestActors.BlackholeActor.html "class in akka.testkit")` | BlackholeActor does nothing for incoming messages, its like a blackhole. |
	| `static class` | `[TestActors.EchoActor](TestActors.EchoActor.html "class in akka.testkit")` | EchoActor sends back received messages (unmodified). |
	| `static class` | `[TestActors.ForwardActor](TestActors.ForwardActor.html "class in akka.testkit")` | ForwardActor forwards all messages as\-is to specified ActorRef. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestActors](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Props](../actor/Props.html "class in akka.actor")` | `[blackholeProps](#blackholeProps())()` |  |
	| `static [Props](../actor/Props.html "class in akka.actor")` | `[echoActorProps](#echoActorProps())()` |  |
	| `static [Props](../actor/Props.html "class in akka.actor")` | `[forwardActorProps](#forwardActorProps(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestActors
		
		
		
		```
		public TestActors()
		```

	- ### Method Detail
	
	
	
		- #### echoActorProps
		
		
		
		```
		public static [Props](../actor/Props.html "class in akka.actor") echoActorProps()
		```
		- #### blackholeProps
		
		
		
		```
		public static [Props](../actor/Props.html "class in akka.actor") blackholeProps()
		```
		- #### forwardActorProps
		
		
		
		```
		public static [Props](../actor/Props.html "class in akka.actor") forwardActorProps​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActors.BlackholeActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActors.EchoActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActors.ForwardActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActors.html](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActors.html)*