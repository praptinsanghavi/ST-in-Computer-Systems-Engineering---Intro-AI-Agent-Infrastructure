---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/AkkaException.html
title: AkkaException
---

# AkkaException

## Content

Package [akka](package-summary.html)
## Class AkkaException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.AkkaException

- All Implemented Interfaces:
`java.io.Serializable`

Direct Known Subclasses:
`[ActorInitializationException](actor/ActorInitializationException.html "class in akka.actor")`, `[ActorInterruptedException](actor/ActorInterruptedException.html "class in akka.actor")`, `[ActorKilledException](actor/ActorKilledException.html "class in akka.actor")`, `[AsyncReplayTimeoutException](persistence/journal/AsyncReplayTimeoutException.html "class in akka.persistence.journal")`, `[CircuitBreakerOpenException](pattern/CircuitBreakerOpenException.html "class in akka.pattern")`, `[ClusterSingletonManagerIsStuck](cluster/singleton/ClusterSingletonManagerIsStuck.html "class in akka.cluster.singleton")`, `[ConfigurationException](ConfigurationException.html "class in akka")`, `[DeathPactException](actor/DeathPactException.html "class in akka.actor")`, `[IllegalActorStateException](actor/IllegalActorStateException.html "class in akka.actor")`, `[InvalidActorNameException](actor/InvalidActorNameException.html "class in akka.actor")`, `[InvalidMessageException](actor/InvalidMessageException.html "class in akka.actor")`, `[Logging.LoggerException](event/Logging.LoggerException.html "class in akka.event")`, `[Logging.LoggerInitializationException](event/Logging.LoggerInitializationException.html "class in akka.event")`, `[RemoteTransportException](remote/RemoteTransportException.html "class in akka.remote")`, `[ResizerInitializationException](routing/ResizerInitializationException.html "class in akka.routing")`, `[SchedulerException](actor/SchedulerException.html "class in akka.actor")`, `[SerializationCheckFailedException](actor/dungeon/SerializationCheckFailedException.html "class in akka.actor.dungeon")`, `[StashOverflowException](actor/StashOverflowException.html "class in akka.actor")`

---

```
public class AkkaException
extends java.lang.RuntimeException
implements java.io.Serializable
```

Akka base Exception.

See Also:
[Serialized Form](../serialized-form.html#akka.AkkaException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AkkaException](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |
	| `[AkkaException](#%3Cinit%3E(java.lang.String,java.lang.Throwable))​(java.lang.String message,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AkkaException
		
		
		
		```
		public AkkaException​(java.lang.String message,
		                     java.lang.Throwable cause)
		```
		- #### AkkaException
		
		
		
		```
		public AkkaException​(java.lang.String msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/ConfigurationException.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorInitializationException.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorInterruptedException.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorKilledException.html
- https://doc.akka.io/japi/akka/current/akka/actor/DeathPactException.html
- https://doc.akka.io/japi/akka/current/akka/actor/IllegalActorStateException.html
- https://doc.akka.io/japi/akka/current/akka/actor/InvalidActorNameException.html
- https://doc.akka.io/japi/akka/current/akka/actor/InvalidMessageException.html
- https://doc.akka.io/japi/akka/current/akka/actor/SchedulerException.html
- https://doc.akka.io/japi/akka/current/akka/actor/StashOverflowException.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/SerializationCheckFailedException.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.LoggerException.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.LoggerInitializationException.html
- https://doc.akka.io/japi/akka/current/akka/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncReplayTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/remote/RemoteTransportException.html
- https://doc.akka.io/japi/akka/current/akka/routing/ResizerInitializationException.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/AkkaException.html](https://doc.akka.io/japi/akka/current/akka/AkkaException.html)*