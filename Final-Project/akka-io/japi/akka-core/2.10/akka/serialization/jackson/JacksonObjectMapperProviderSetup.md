---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
title: JacksonObjectMapperProviderSetup
---

# JacksonObjectMapperProviderSetup

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class JacksonObjectMapperProviderSetup

- java.lang.Object
- - [akka.actor.setup.Setup](../../actor/setup/Setup.html "class in akka.actor.setup")
	- - akka.serialization.jackson.JacksonObjectMapperProviderSetup

- ---

```
public final class JacksonObjectMapperProviderSetup
extends [Setup](../../actor/setup/Setup.html "class in akka.actor.setup")
```

Setup for defining a `JacksonObjectMapperProvider` that can be passed in when ActorSystem
 is created rather than creating one from configured class name. Create a subclass of
 [`JacksonObjectMapperFactory`](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") and override the methods to amend the defaults.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JacksonObjectMapperProviderSetup](#%3Cinit%3E(akka.serialization.jackson.JacksonObjectMapperFactory))​([JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") factory)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson")` | `[apply](#apply(akka.serialization.jackson.JacksonObjectMapperFactory))​([JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") factory)` | Scala API: factory for defining a `JacksonObjectMapperProvider` that is passed in when ActorSystem  is created rather than creating one from configured class name. |
	| `static [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson")` | `[create](#create(akka.serialization.jackson.JacksonObjectMapperFactory))​([JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") factory)` | Java API: factory for defining a `JacksonObjectMapperProvider` that is passed in when ActorSystem  is created rather than creating one from configured class name. |
	| `[JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson")` | `[factory](#factory())()` |  |
	
	
		- ### Methods inherited from class akka.actor.setup.[Setup](../../actor/setup/Setup.html "class in akka.actor.setup")
		
		
		`[and](../../actor/setup/Setup.html#and(akka.actor.setup.Setup))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JacksonObjectMapperProviderSetup
		
		
		
		```
		public JacksonObjectMapperProviderSetup​([JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") factory)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson") apply​([JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") factory)
		```
		
		Scala API: factory for defining a `JacksonObjectMapperProvider` that is passed in when ActorSystem
		 is created rather than creating one from configured class name.
		- #### create
		
		
		
		```
		public static [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson") create​([JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") factory)
		```
		
		Java API: factory for defining a `JacksonObjectMapperProvider` that is passed in when ActorSystem
		 is created rather than creating one from configured class name.
		- #### factory
		
		
		
		```
		public [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") factory()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html)*