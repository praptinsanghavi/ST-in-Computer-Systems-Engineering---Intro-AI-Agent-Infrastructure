---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html
title: DistributedPubSub
---

# DistributedPubSub

## Content

Package [akka.cluster.pubsub](package-summary.html)
## Class DistributedPubSub

- java.lang.Object
- - akka.cluster.pubsub.DistributedPubSub

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`

---

```
public class DistributedPubSub
extends java.lang.Object
implements [Extension](../../actor/Extension.html "interface in akka.actor")
```

Extension that starts a [`DistributedPubSubMediator`](DistributedPubSubMediator.html "class in akka.cluster.pubsub") actor
 with settings defined in config section `akka.cluster.pub-sub`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DistributedPubSub](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [DistributedPubSub](DistributedPubSub.html "class in akka.cluster.pubsub")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [DistributedPubSub](DistributedPubSub.html "class in akka.cluster.pubsub")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [DistributedPubSub](DistributedPubSub.html "class in akka.cluster.pubsub")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isTerminated](#isTerminated())()` | Returns true if this member is not tagged with the role configured for the  mediator. |
	| `static [DistributedPubSub$](DistributedPubSub$.html "class in akka.cluster.pubsub")` | `[lookup](#lookup())()` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[mediator](#mediator())()` | The [`DistributedPubSubMediator`](DistributedPubSubMediator.html "class in akka.cluster.pubsub") |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DistributedPubSub
		
		
		
		```
		public DistributedPubSub​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [DistributedPubSub](DistributedPubSub.html "class in akka.cluster.pubsub") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [DistributedPubSub](DistributedPubSub.html "class in akka.cluster.pubsub") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [DistributedPubSub$](DistributedPubSub$.html "class in akka.cluster.pubsub") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [DistributedPubSub](DistributedPubSub.html "class in akka.cluster.pubsub") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
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
		- #### isTerminated
		
		
		
		```
		public boolean isTerminated()
		```
		
		Returns true if this member is not tagged with the role configured for the
		 mediator.
		- #### mediator
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") mediator()
		```
		
		The [`DistributedPubSubMediator`](DistributedPubSubMediator.html "class in akka.cluster.pubsub")

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html)*