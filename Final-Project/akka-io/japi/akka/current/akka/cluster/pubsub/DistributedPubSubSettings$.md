---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubSettings$.html
title: DistributedPubSubSettings$
---

# DistributedPubSubSettings$

## Content

Package [akka.cluster.pubsub](package-summary.html)
## Class DistributedPubSubSettings$

- java.lang.Object
- - akka.cluster.pubsub.DistributedPubSubSettings$

- ---

```
public class DistributedPubSubSettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DistributedPubSubSettings$](DistributedPubSubSettings$.html "class in akka.cluster.pubsub")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DistributedPubSubSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Create settings from the default configuration  `akka.cluster.pub-sub`. |
	| `[DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a configuration with the same layout as  the default configuration `akka.cluster.pub-sub`. |
	| `[DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Java API: Create settings from the default configuration  `akka.cluster.pub-sub`. |
	| `[DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Create settings from a configuration with the same layout as  the default configuration `akka.cluster.pub-sub`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DistributedPubSubSettings$](DistributedPubSubSettings$.html "class in akka.cluster.pubsub") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DistributedPubSubSettings$
		
		
		
		```
		public DistributedPubSubSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Create settings from the default configuration
		 `akka.cluster.pub-sub`.
		- #### apply
		
		
		
		```
		public [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") apply​(com.typesafe.config.Config config)
		```
		
		Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.pub-sub`.
		- #### create
		
		
		
		```
		public [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") create​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API: Create settings from the default configuration
		 `akka.cluster.pub-sub`.
		- #### create
		
		
		
		```
		public [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") create​(com.typesafe.config.Config config)
		```
		
		Java API: Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.pub-sub`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubSettings$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubSettings$.html](https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubSettings$.html)*