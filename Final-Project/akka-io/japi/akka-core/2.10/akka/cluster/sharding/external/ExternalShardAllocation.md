---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocation.html
title: ExternalShardAllocation
---

# ExternalShardAllocation

## Content

Package [akka.cluster.sharding.external](package-summary.html)
## Class ExternalShardAllocation

- java.lang.Object
- - akka.cluster.sharding.external.ExternalShardAllocation

- All Implemented Interfaces:
`[Extension](../../../actor/Extension.html "interface in akka.actor")`

---

```
public final class ExternalShardAllocation
extends java.lang.Object
implements [Extension](../../../actor/Extension.html "interface in akka.actor")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExternalShardAllocation](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `[ExternalShardAllocationClient](scaladsl/ExternalShardAllocationClient.html "interface in akka.cluster.sharding.external.scaladsl")` | `[clientFor](#clientFor(java.lang.String))​(java.lang.String typeName)` | Scala API |
	| `static [ExternalShardAllocation](ExternalShardAllocation.html "class in akka.cluster.sharding.external")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [ExternalShardAllocation](ExternalShardAllocation.html "class in akka.cluster.sharding.external")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `[ExternalShardAllocationClient](javadsl/ExternalShardAllocationClient.html "interface in akka.cluster.sharding.external.javadsl")` | `[getClient](#getClient(java.lang.String))​(java.lang.String typeName)` | Java API |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ExternalShardAllocation$](ExternalShardAllocation$.html "class in akka.cluster.sharding.external")` | `[lookup](#lookup())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ExternalShardAllocation
		
		
		
		```
		public ExternalShardAllocation​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public static [ExternalShardAllocation](ExternalShardAllocation.html "class in akka.cluster.sharding.external") createExtension​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [ExternalShardAllocation$](ExternalShardAllocation$.html "class in akka.cluster.sharding.external") lookup()
		```
		- #### get
		
		
		
		```
		public static [ExternalShardAllocation](ExternalShardAllocation.html "class in akka.cluster.sharding.external") get​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### clientFor
		
		
		
		```
		public [ExternalShardAllocationClient](scaladsl/ExternalShardAllocationClient.html "interface in akka.cluster.sharding.external.scaladsl") clientFor​(java.lang.String typeName)
		```
		
		Scala API
		- #### getClient
		
		
		
		```
		public [ExternalShardAllocationClient](javadsl/ExternalShardAllocationClient.html "interface in akka.cluster.sharding.external.javadsl") getClient​(java.lang.String typeName)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocation$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/javadsl/ExternalShardAllocationClient.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocation.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocation.html)*