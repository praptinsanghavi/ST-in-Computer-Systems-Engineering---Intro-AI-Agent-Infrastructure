---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:52:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/setup/Setup.html
title: Setup
---

# Setup

## Content

Package [akka.actor.setup](package-summary.html)
## Class Setup

- java.lang.Object
- - akka.actor.setup.Setup

- Direct Known Subclasses:
`[BootstrapSetup](../BootstrapSetup.html "class in akka.actor")`, `[ExtensionSetup](../typed/ExtensionSetup.html "class in akka.actor.typed")`, `[JacksonObjectMapperProviderSetup](../../serialization/jackson/JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson")`, `[SerializationSetup](../../serialization/SerializationSetup.html "class in akka.serialization")`, `[SSLEngineProviderSetup](../../remote/artery/tcp/SSLEngineProviderSetup.html "class in akka.remote.artery.tcp")`

---

```
public abstract class Setup
extends java.lang.Object
```

Marker supertype for a setup part that can be put inside [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup"), if a specific concrete setup
 is not specified in the actor system setup that means defaults are used (usually from the config file) \- no concrete
 setup instance should be mandatory in the [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") that an actor system is created with.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Setup](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup")` | `[and](#and(akka.actor.setup.Setup))​([Setup](Setup.html "class in akka.actor.setup") other)` | Construct an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") with this setup combined with another one. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Setup
		
		
		
		```
		public Setup()
		```

	- ### Method Detail
	
	
	
		- #### and
		
		
		
		```
		public final [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup") and​([Setup](Setup.html "class in akka.actor.setup") other)
		```
		
		Construct an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") with this setup combined with another one. Allows for
		 fluent creation of settings. If `other` is a setting of the same concrete [`Setup`](Setup.html "class in akka.actor.setup") as this
		 it will replace this.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/BootstrapSetup.html
- https://doc.akka.io/japi/akka/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka/current/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka/current/akka/actor/setup/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SSLEngineProviderSetup.html
- https://doc.akka.io/japi/akka/current/akka/serialization/SerializationSetup.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/setup/Setup.html](https://doc.akka.io/japi/akka/current/akka/actor/setup/Setup.html)*