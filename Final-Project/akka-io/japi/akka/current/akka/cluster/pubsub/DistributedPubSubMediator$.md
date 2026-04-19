---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$.html
title: DistributedPubSubMediator$
---

# DistributedPubSubMediator$

## Content

Package [akka.cluster.pubsub](package-summary.html)
## Class DistributedPubSubMediator$

- java.lang.Object
- - akka.cluster.pubsub.DistributedPubSubMediator$

- ---

```
public class DistributedPubSubMediator$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DistributedPubSubMediator$](DistributedPubSubMediator$.html "class in akka.cluster.pubsub")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DistributedPubSubMediator$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DistributedPubSubMediator.Count](DistributedPubSubMediator.Count.html "class in akka.cluster.pubsub")` | `[getCountInstance](#getCountInstance())()` | Java API: Send this message to the mediator and it will reply with an `Integer` of  the number of subscribers. |
	| `[DistributedPubSubMediator.GetTopics](DistributedPubSubMediator.GetTopics.html "class in akka.cluster.pubsub")` | `[getTopicsInstance](#getTopicsInstance())()` | Java API: Send this message to the mediator and it will reply with  [`DistributedPubSubMediator.CurrentTopics`](DistributedPubSubMediator.CurrentTopics.html "class in akka.cluster.pubsub") containing the names of the (currently known)  registered topic names. |
	| `[Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(akka.cluster.pubsub.DistributedPubSubSettings))​([DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") settings)` | Scala API: Factory method for `DistributedPubSubMediator` [`Props`](../../actor/Props.html "class in akka.actor"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DistributedPubSubMediator$](DistributedPubSubMediator$.html "class in akka.cluster.pubsub") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DistributedPubSubMediator$
		
		
		
		```
		public DistributedPubSubMediator$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../actor/Props.html "class in akka.actor") props​([DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") settings)
		```
		
		Scala API: Factory method for `DistributedPubSubMediator` [`Props`](../../actor/Props.html "class in akka.actor").
		- #### getTopicsInstance
		
		
		
		```
		public [DistributedPubSubMediator.GetTopics](DistributedPubSubMediator.GetTopics.html "class in akka.cluster.pubsub") getTopicsInstance()
		```
		
		Java API: Send this message to the mediator and it will reply with
		 [`DistributedPubSubMediator.CurrentTopics`](DistributedPubSubMediator.CurrentTopics.html "class in akka.cluster.pubsub") containing the names of the (currently known)
		 registered topic names.
		- #### getCountInstance
		
		
		
		```
		public [DistributedPubSubMediator.Count](DistributedPubSubMediator.Count.html "class in akka.cluster.pubsub") getCountInstance()
		```
		
		Java API: Send this message to the mediator and it will reply with an `Integer` of
		 the number of subscribers.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.Count.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.CurrentTopics.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.GetTopics.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$.html](https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$.html)*