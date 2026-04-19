---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:39:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionSetup.html
title: ExtensionSetup
---

# ExtensionSetup

## Content

Package [akka.actor.typed](package-summary.html)
## Class ExtensionSetup\<T extends [Extension](Extension.html "interface in akka.actor.typed")\>

- java.lang.Object
- - [akka.actor.setup.Setup](../setup/Setup.html "class in akka.actor.setup")
	- - akka.actor.typed.ExtensionSetup\<T\>

- Direct Known Subclasses:
`[AbstractExtensionSetup](AbstractExtensionSetup.html "class in akka.actor.typed")`, `[ActorRefResolverSetup](ActorRefResolverSetup.html "class in akka.actor.typed")`, `[ClusterSetup](../../cluster/typed/ClusterSetup.html "class in akka.cluster.typed")`, `[ClusterShardingSetup](../../cluster/sharding/typed/scaladsl/ClusterShardingSetup.html "class in akka.cluster.sharding.typed.scaladsl")`, `[ClusterSingletonSetup](../../cluster/typed/ClusterSingletonSetup.html "class in akka.cluster.typed")`, `[DistributedDataSetup](../../cluster/ddata/typed/javadsl/DistributedDataSetup.html "class in akka.cluster.ddata.typed.javadsl")`, `[ReceptionistSetup](receptionist/ReceptionistSetup.html "class in akka.actor.typed.receptionist")`

---

```
public abstract class ExtensionSetup<T extends [Extension](Extension.html "interface in akka.actor.typed")>
extends [Setup](../setup/Setup.html "class in akka.actor.setup")
```

Each extension typically provide a concrete `ExtensionSetup` that can be used in
 [`ActorSystemSetup`](../setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") to replace the default
 implementation of the extension. Intended for tests that need to replace
 extension with stub/mock implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExtensionSetup](#%3Cinit%3E(akka.actor.typed.ExtensionId,java.util.function.Function))​([ExtensionId](ExtensionId.html "class in akka.actor.typed")<[T](ExtensionSetup.html "type parameter in ExtensionSetup")> extId,  java.util.function.Function<[ActorSystem](ActorSystem.html "class in akka.actor.typed")<?>,​[T](ExtensionSetup.html "type parameter in ExtensionSetup")> createExtension)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.function.Function<[ActorSystem](ActorSystem.html "class in akka.actor.typed")<?>,​[T](ExtensionSetup.html "type parameter in ExtensionSetup")>` | `[createExtension](#createExtension())()` |  |
	| `[ExtensionId](ExtensionId.html "class in akka.actor.typed")<[T](ExtensionSetup.html "type parameter in ExtensionSetup")>` | `[extId](#extId())()` |  |
	
	
		- ### Methods inherited from class akka.actor.setup.[Setup](../setup/Setup.html "class in akka.actor.setup")
		
		
		`[and](../setup/Setup.html#and(akka.actor.setup.Setup))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ExtensionSetup
		
		
		
		```
		public ExtensionSetup​([ExtensionId](ExtensionId.html "class in akka.actor.typed")<[T](ExtensionSetup.html "type parameter in ExtensionSetup")> extId,
		                      java.util.function.Function<[ActorSystem](ActorSystem.html "class in akka.actor.typed")<?>,​[T](ExtensionSetup.html "type parameter in ExtensionSetup")> createExtension)
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public java.util.function.Function<[ActorSystem](ActorSystem.html "class in akka.actor.typed")<?>,​[T](ExtensionSetup.html "type parameter in ExtensionSetup")> createExtension()
		```
		- #### extId
		
		
		
		```
		public [ExtensionId](ExtensionId.html "class in akka.actor.typed")<[T](ExtensionSetup.html "type parameter in ExtensionSetup")> extId()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka/current/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/AbstractExtensionSetup.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRefResolverSetup.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ReceptionistSetup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSetup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingletonSetup.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionSetup.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionSetup.html)*