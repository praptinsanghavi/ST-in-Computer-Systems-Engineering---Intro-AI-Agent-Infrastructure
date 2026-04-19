---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:59:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/DistributedData.html
title: DistributedData
---

# DistributedData

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class DistributedData

- java.lang.Object
- - akka.cluster.ddata.DistributedData

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`

---

```
public class DistributedData
extends java.lang.Object
implements [Extension](../../actor/Extension.html "interface in akka.actor")
```

Akka extension for convenient configuration and use of the
 [`Replicator`](Replicator.html "class in akka.cluster.ddata"). Configuration settings are defined in the
 `akka.cluster.ddata` section, see `reference.conf`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DistributedData](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [DistributedData](DistributedData.html "class in akka.cluster.ddata")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [DistributedData](DistributedData.html "class in akka.cluster.ddata")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [DistributedData](DistributedData.html "class in akka.cluster.ddata")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isTerminated](#isTerminated())()` | Returns true if this member is not tagged with the role configured for the  replicas. |
	| `static [DistributedData$](DistributedData$.html "class in akka.cluster.ddata")` | `[lookup](#lookup())()` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[replicator](#replicator())()` | `ActorRef` of the [`Replicator`](Replicator.html "class in akka.cluster.ddata") . |
	| `[SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata")` | `[selfUniqueAddress](#selfUniqueAddress())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DistributedData
		
		
		
		```
		public DistributedData​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [DistributedData](DistributedData.html "class in akka.cluster.ddata") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [DistributedData](DistributedData.html "class in akka.cluster.ddata") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [DistributedData$](DistributedData$.html "class in akka.cluster.ddata") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [DistributedData](DistributedData.html "class in akka.cluster.ddata") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### selfUniqueAddress
		
		
		
		```
		public [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") selfUniqueAddress()
		```
		- #### replicator
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") replicator()
		```
		
		`ActorRef` of the [`Replicator`](Replicator.html "class in akka.cluster.ddata") .
		- #### isTerminated
		
		
		
		```
		public boolean isTerminated()
		```
		
		Returns true if this member is not tagged with the role configured for the
		 replicas.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/DistributedData$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/SelfUniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/DistributedData.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/DistributedData.html)*