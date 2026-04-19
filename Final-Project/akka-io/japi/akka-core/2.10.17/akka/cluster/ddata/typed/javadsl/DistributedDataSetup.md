---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:55:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html
title: DistributedDataSetup
---

# DistributedDataSetup

## Content

Package [akka.cluster.ddata.typed.javadsl](package-summary.html)
## Class DistributedDataSetup

- java.lang.Object
- - [akka.actor.setup.Setup](../../../../actor/setup/Setup.html "class in akka.actor.setup")
	- - [akka.actor.typed.ExtensionSetup](../../../../actor/typed/ExtensionSetup.html "class in akka.actor.typed")\<[DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")\>
		- - akka.cluster.ddata.typed.javadsl.DistributedDataSetup

- ---

```
public final class DistributedDataSetup
extends [ExtensionSetup](../../../../actor/typed/ExtensionSetup.html "class in akka.actor.typed")<[DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")>
```

Can be used in [`ActorSystemSetup`](../../../../actor/setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the `ActorSystem`
 to replace the default implementation of the [`DistributedData`](DistributedData.html "class in akka.cluster.ddata.typed.javadsl") extension. Intended
 for tests that need to replace extension with stub/mock implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DistributedDataSetup](#%3Cinit%3E(java.util.function.Function))​(java.util.function.Function<[ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")> createExtension)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T extends [Extension](../../../../actor/typed/Extension.html "interface in akka.actor.typed")>[DistributedDataSetup](DistributedDataSetup.html "class in akka.cluster.ddata.typed.javadsl")` | `[apply](#apply(scala.Function1))​(scala.Function1<[ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")> createExtension)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionSetup](../../../../actor/typed/ExtensionSetup.html "class in akka.actor.typed")
		
		
		`[createExtension](../../../../actor/typed/ExtensionSetup.html#createExtension()), [extId](../../../../actor/typed/ExtensionSetup.html#extId())`
		- ### Methods inherited from class akka.actor.setup.[Setup](../../../../actor/setup/Setup.html "class in akka.actor.setup")
		
		
		`[and](../../../../actor/setup/Setup.html#and(akka.actor.setup.Setup))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DistributedDataSetup
		
		
		
		```
		public DistributedDataSetup​(java.util.function.Function<[ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")> createExtension)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T extends [Extension](../../../../actor/typed/Extension.html "interface in akka.actor.typed")> [DistributedDataSetup](DistributedDataSetup.html "class in akka.cluster.ddata.typed.javadsl") apply​(scala.Function1<[ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")> createExtension)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/DistributedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html)*