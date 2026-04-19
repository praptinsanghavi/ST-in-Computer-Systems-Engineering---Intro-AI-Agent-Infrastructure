---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRefResolverSetup.html
title: ActorRefResolverSetup
---

# ActorRefResolverSetup

## Content

Package [akka.actor.typed](package-summary.html)
## Class ActorRefResolverSetup

- java.lang.Object
- - [akka.actor.setup.Setup](../setup/Setup.html "class in akka.actor.setup")
	- - [akka.actor.typed.ExtensionSetup](ExtensionSetup.html "class in akka.actor.typed")\<[ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")\>
		- - akka.actor.typed.ActorRefResolverSetup

- ---

```
public final class ActorRefResolverSetup
extends [ExtensionSetup](ExtensionSetup.html "class in akka.actor.typed")<[ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")>
```

Can be used in [`ActorSystemSetup`](../setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed")
 to replace the default implementation of the [`ActorRefResolver`](ActorRefResolver.html "class in akka.actor.typed") extension. Intended
 for tests that need to replace extension with stub/mock implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorRefResolverSetup](#%3Cinit%3E(java.util.function.Function))​(java.util.function.Function<[ActorSystem](ActorSystem.html "class in akka.actor.typed")<?>,​[ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")> createExtension)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T extends [Extension](Extension.html "interface in akka.actor.typed")>[ActorRefResolverSetup](ActorRefResolverSetup.html "class in akka.actor.typed")` | `[apply](#apply(scala.Function1))​(scala.Function1<[ActorSystem](ActorSystem.html "class in akka.actor.typed")<?>,​[ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")> createExtension)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionSetup](ExtensionSetup.html "class in akka.actor.typed")
		
		
		`[createExtension](ExtensionSetup.html#createExtension()), [extId](ExtensionSetup.html#extId())`
		- ### Methods inherited from class akka.actor.setup.[Setup](../setup/Setup.html "class in akka.actor.setup")
		
		
		`[and](../setup/Setup.html#and(akka.actor.setup.Setup))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorRefResolverSetup
		
		
		
		```
		public ActorRefResolverSetup​(java.util.function.Function<[ActorSystem](ActorSystem.html "class in akka.actor.typed")<?>,​[ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")> createExtension)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T extends [Extension](Extension.html "interface in akka.actor.typed")> [ActorRefResolverSetup](ActorRefResolverSetup.html "class in akka.actor.typed") apply​(scala.Function1<[ActorSystem](ActorSystem.html "class in akka.actor.typed")<?>,​[ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")> createExtension)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRefResolverSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRefResolverSetup.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRefResolverSetup.html)*