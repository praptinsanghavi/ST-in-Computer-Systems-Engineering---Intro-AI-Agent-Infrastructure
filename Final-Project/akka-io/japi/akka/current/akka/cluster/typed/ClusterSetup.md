---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSetup.html
title: ClusterSetup
---

# ClusterSetup

## Content

Package [akka.cluster.typed](package-summary.html)
## Class ClusterSetup

- java.lang.Object
- - [akka.actor.setup.Setup](../../actor/setup/Setup.html "class in akka.actor.setup")
	- - [akka.actor.typed.ExtensionSetup](../../actor/typed/ExtensionSetup.html "class in akka.actor.typed")\<[Cluster](Cluster.html "class in akka.cluster.typed")\>
		- - akka.cluster.typed.ClusterSetup

- ---

```
public final class ClusterSetup
extends [ExtensionSetup](../../actor/typed/ExtensionSetup.html "class in akka.actor.typed")<[Cluster](Cluster.html "class in akka.cluster.typed")>
```

Can be used in [`ActorSystemSetup`](../../actor/setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the `ActorSystem`
 to replace the default implementation of the [`Cluster`](Cluster.html "class in akka.cluster.typed") extension. Intended
 for tests that need to replace extension with stub/mock implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSetup](#%3Cinit%3E(java.util.function.Function))​(java.util.function.Function<[ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[Cluster](Cluster.html "class in akka.cluster.typed")> createExtension)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T extends [Extension](../../actor/typed/Extension.html "interface in akka.actor.typed")>[ClusterSetup](ClusterSetup.html "class in akka.cluster.typed")` | `[apply](#apply(scala.Function1))​(scala.Function1<[ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[Cluster](Cluster.html "class in akka.cluster.typed")> createExtension)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionSetup](../../actor/typed/ExtensionSetup.html "class in akka.actor.typed")
		
		
		`[createExtension](../../actor/typed/ExtensionSetup.html#createExtension()), [extId](../../actor/typed/ExtensionSetup.html#extId())`
		- ### Methods inherited from class akka.actor.setup.[Setup](../../actor/setup/Setup.html "class in akka.actor.setup")
		
		
		`[and](../../actor/setup/Setup.html#and(akka.actor.setup.Setup))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterSetup
		
		
		
		```
		public ClusterSetup​(java.util.function.Function<[ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[Cluster](Cluster.html "class in akka.cluster.typed")> createExtension)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T extends [Extension](../../actor/typed/Extension.html "interface in akka.actor.typed")> [ClusterSetup](ClusterSetup.html "class in akka.cluster.typed") apply​(scala.Function1<[ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[Cluster](Cluster.html "class in akka.cluster.typed")> createExtension)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka/current/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/Cluster.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSetup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSetup.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSetup.html)*