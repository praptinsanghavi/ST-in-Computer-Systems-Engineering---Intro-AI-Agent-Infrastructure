---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider.html
title: ClusterShardingInstrumentationProvider
---

# ClusterShardingInstrumentationProvider

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class ClusterShardingInstrumentationProvider

- java.lang.Object
- - akka.cluster.sharding.internal.ClusterShardingInstrumentationProvider

- All Implemented Interfaces:
`[Extension](../../../actor/Extension.html "interface in akka.actor")`

---

```
public class ClusterShardingInstrumentationProvider
extends java.lang.Object
implements [Extension](../../../actor/Extension.html "interface in akka.actor")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterShardingInstrumentationProvider](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "class in akka.cluster.sharding.internal")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "class in akka.cluster.sharding.internal")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "class in akka.cluster.sharding.internal")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `[ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal")` | `[instrumentation](#instrumentation())()` |  |
	| `static [ClusterShardingInstrumentationProvider$](ClusterShardingInstrumentationProvider$.html "class in akka.cluster.sharding.internal")` | `[lookup](#lookup())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterShardingInstrumentationProvider
		
		
		
		```
		public ClusterShardingInstrumentationProvider​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "class in akka.cluster.sharding.internal") get​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "class in akka.cluster.sharding.internal") get​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [ClusterShardingInstrumentationProvider$](ClusterShardingInstrumentationProvider$.html "class in akka.cluster.sharding.internal") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "class in akka.cluster.sharding.internal") createExtension​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
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
		- #### instrumentation
		
		
		
		```
		public [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal") instrumentation()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider.html)*