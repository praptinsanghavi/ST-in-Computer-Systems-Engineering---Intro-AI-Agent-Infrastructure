---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSetup.html
title: ClusterSingletonSetup
---

# ClusterSingletonSetup

## Content

Package [akka.cluster.typed](package-summary.html)
## Class ClusterSingletonSetup

- java.lang.Object
- - [akka.actor.setup.Setup](../../actor/setup/Setup.html "class in akka.actor.setup")
	- - [akka.actor.typed.ExtensionSetup](../../actor/typed/ExtensionSetup.html "class in akka.actor.typed")\<[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")\>
		- - akka.cluster.typed.ClusterSingletonSetup

- ---

```
public final class ClusterSingletonSetup
extends [ExtensionSetup](../../actor/typed/ExtensionSetup.html "class in akka.actor.typed")<[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")>
```

Can be used in [`ActorSystemSetup`](../../actor/setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the `ActorSystem`
 to replace the default implementation of the [`ClusterSingleton`](ClusterSingleton.html "class in akka.cluster.typed") extension. Intended
 for tests that need to replace extension with stub/mock implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingletonSetup](#%3Cinit%3E(java.util.function.Function))​(java.util.function.Function<[ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")> createExtension)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T extends [Extension](../../actor/typed/Extension.html "interface in akka.actor.typed")>[ClusterSingletonSetup](ClusterSingletonSetup.html "class in akka.cluster.typed")` | `[apply](#apply(scala.Function1))​(scala.Function1<[ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")> createExtension)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionSetup](../../actor/typed/ExtensionSetup.html "class in akka.actor.typed")
		
		
		`[createExtension](../../actor/typed/ExtensionSetup.html#createExtension()), [extId](../../actor/typed/ExtensionSetup.html#extId())`
		- ### Methods inherited from class akka.actor.setup.[Setup](../../actor/setup/Setup.html "class in akka.actor.setup")
		
		
		`[and](../../actor/setup/Setup.html#and(akka.actor.setup.Setup))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterSingletonSetup
		
		
		
		```
		public ClusterSingletonSetup​(java.util.function.Function<[ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")> createExtension)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T extends [Extension](../../actor/typed/Extension.html "interface in akka.actor.typed")> [ClusterSingletonSetup](ClusterSingletonSetup.html "class in akka.cluster.typed") apply​(scala.Function1<[ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")> createExtension)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSetup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSetup.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSetup.html)*