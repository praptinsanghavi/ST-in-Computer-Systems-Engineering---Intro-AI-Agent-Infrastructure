---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sbr/SplitBrainResolverProvider.html
title: SplitBrainResolverProvider
---

# SplitBrainResolverProvider

## Content

Package [akka.cluster.sbr](package-summary.html)
## Class SplitBrainResolverProvider

- java.lang.Object
- - [akka.cluster.DowningProvider](../DowningProvider.html "class in akka.cluster")
	- - akka.cluster.sbr.SplitBrainResolverProvider

- ---

```
public final class SplitBrainResolverProvider
extends [DowningProvider](../DowningProvider.html "class in akka.cluster")
```

See reference documentation: https://doc.akka.io/libraries/akka\-core/current/split\-brain\-resolver.html
 
 Enabled with configuration:
 

```

 akka.cluster.downing-provider-class = "akka.cluster.sbr.SplitBrainResolverProvider"
 
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SplitBrainResolverProvider](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[Props](../../actor/Props.html "class in akka.actor")>` | `[downingActorProps](#downingActorProps())()` | If a props is returned it is created as a child of the core cluster daemon on cluster startup. |
	| `scala.concurrent.duration.FiniteDuration` | `[downRemovalMargin](#downRemovalMargin())()` | Time margin after which shards or singletons that belonged to a downed/removed  partition are created in surviving partition. |
	
	
		- ### Methods inherited from class akka.cluster.[DowningProvider](../DowningProvider.html "class in akka.cluster")
		
		
		`[load](../DowningProvider.html#load(java.lang.String,akka.actor.ActorSystem))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SplitBrainResolverProvider
		
		
		
		```
		public SplitBrainResolverProvider​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### downRemovalMargin
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration downRemovalMargin()
		```
		
		Description copied from class: `[DowningProvider](../DowningProvider.html#downRemovalMargin())`
		Time margin after which shards or singletons that belonged to a downed/removed
		 partition are created in surviving partition. The purpose of this margin is that
		 in case of a network partition the persistent actors in the non\-surviving partitions
		 must be stopped before corresponding persistent actors are started somewhere else.
		 This is useful if you implement downing strategies that handle network partitions,
		 e.g. by keeping the larger side of the partition and shutting down the smaller side.
		
		Specified by:
		`[downRemovalMargin](../DowningProvider.html#downRemovalMargin())` in class `[DowningProvider](../DowningProvider.html "class in akka.cluster")`
		- #### downingActorProps
		
		
		
		```
		public scala.Option<[Props](../../actor/Props.html "class in akka.actor")> downingActorProps()
		```
		
		Description copied from class: `[DowningProvider](../DowningProvider.html#downingActorProps())`
		If a props is returned it is created as a child of the core cluster daemon on cluster startup.
		 It should then handle downing using the regular [`Cluster`](../Cluster.html "class in akka.cluster") APIs.
		 The actor will run on the same dispatcher as the cluster actor if dispatcher not configured.
		 
		 May throw an exception which will then immediately lead to Cluster stopping, as the downing
		 provider is vital to a working cluster.
		
		
		
		Specified by:
		`[downingActorProps](../DowningProvider.html#downingActorProps())` in class `[DowningProvider](../DowningProvider.html "class in akka.cluster")`

## Code Examples

### Example 1: Class SplitBrainResolverProvider

```text
akka.cluster.downing-provider-class = "akka.cluster.sbr.SplitBrainResolverProvider"
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/DowningProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sbr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sbr/SplitBrainResolverProvider.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sbr/SplitBrainResolverProvider.html)*