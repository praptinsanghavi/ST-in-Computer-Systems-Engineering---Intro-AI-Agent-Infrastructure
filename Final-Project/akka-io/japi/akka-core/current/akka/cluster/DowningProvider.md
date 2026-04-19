---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:51:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/DowningProvider.html
title: DowningProvider
---

# DowningProvider

## Content

Package [akka.cluster](package-summary.html)
## Class DowningProvider

- java.lang.Object
- - akka.cluster.DowningProvider

- Direct Known Subclasses:
`[NoDowning](NoDowning.html "class in akka.cluster")`, `[SplitBrainResolverProvider](sbr/SplitBrainResolverProvider.html "class in akka.cluster.sbr")`

---

```
public abstract class DowningProvider
extends java.lang.Object
```

API for plugins that will handle downing of cluster nodes. Concrete plugins must subclass and
 have a public one argument constructor accepting an [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor").
 
 A custom `DowningProvider` can be configured with `akka.cluster.downing-provider-class`

 When implementing a downing provider you should make sure that it will not split the cluster into
 several separate clusters in case of network problems or system overload (long GC pauses). This
 is much more difficult than it might be perceived at first, so carefully read the concerns and scenarios
 described in https://doc.akka.io/libraries/akka\-core/current/split\-brain\-resolver.html

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DowningProvider](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract scala.Option<[Props](../actor/Props.html "class in akka.actor")>` | `[downingActorProps](#downingActorProps())()` | If a props is returned it is created as a child of the core cluster daemon on cluster startup. |
	| `abstract scala.concurrent.duration.FiniteDuration` | `[downRemovalMargin](#downRemovalMargin())()` | Time margin after which shards or singletons that belonged to a downed/removed  partition are created in surviving partition. |
	| `static [DowningProvider](DowningProvider.html "class in akka.cluster")` | `[load](#load(java.lang.String,akka.actor.ActorSystem))​(java.lang.String fqcn,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DowningProvider
		
		
		
		```
		public DowningProvider()
		```

	- ### Method Detail
	
	
	
		- #### load
		
		
		
		```
		public static [DowningProvider](DowningProvider.html "class in akka.cluster") load​(java.lang.String fqcn,
		                                   [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		
		Parameters:
		`fqcn` \- Fully qualified class name of the implementation to be loaded.
		`system` \- Actor system used to load the implemntation
		Returns:
		the provider or throws a [`ConfigurationException`](../ConfigurationException.html "class in akka") if loading it fails
		- #### downRemovalMargin
		
		
		
		```
		public abstract scala.concurrent.duration.FiniteDuration downRemovalMargin()
		```
		
		Time margin after which shards or singletons that belonged to a downed/removed
		 partition are created in surviving partition. The purpose of this margin is that
		 in case of a network partition the persistent actors in the non\-surviving partitions
		 must be stopped before corresponding persistent actors are started somewhere else.
		 This is useful if you implement downing strategies that handle network partitions,
		 e.g. by keeping the larger side of the partition and shutting down the smaller side.
		- #### downingActorProps
		
		
		
		```
		public abstract scala.Option<[Props](../actor/Props.html "class in akka.actor")> downingActorProps()
		```
		
		If a props is returned it is created as a child of the core cluster daemon on cluster startup.
		 It should then handle downing using the regular [`Cluster`](Cluster.html "class in akka.cluster") APIs.
		 The actor will run on the same dispatcher as the cluster actor if dispatcher not configured.
		 
		 May throw an exception which will then immediately lead to Cluster stopping, as the downing
		 provider is vital to a working cluster.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/ConfigurationException.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/DowningProvider.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/NoDowning.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sbr/SplitBrainResolverProvider.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/DowningProvider.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/DowningProvider.html)*