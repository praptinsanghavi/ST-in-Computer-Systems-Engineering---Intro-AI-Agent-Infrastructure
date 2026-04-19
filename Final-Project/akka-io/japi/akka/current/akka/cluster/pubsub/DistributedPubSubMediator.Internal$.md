---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:41:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.ValueHolder$.html
title: DistributedPubSubMediator.Internal$.ValueHolder$
---

# DistributedPubSubMediator.Internal$.ValueHolder$

## Content

Package [akka.cluster.pubsub](package-summary.html)
## Class DistributedPubSubMediator.Internal$.ValueHolder$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Option\<[ActorRef](../../actor/ActorRef.html "class in akka.actor")\>,​akka.cluster.pubsub.DistributedPubSubMediator.Internal.ValueHolder\>
	- - akka.cluster.pubsub.DistributedPubSubMediator.Internal$.ValueHolder$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.Object,​scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>,​akka.cluster.pubsub.DistributedPubSubMediator.Internal.ValueHolder>`

Enclosing class:
[DistributedPubSubMediator.Internal$](DistributedPubSubMediator.Internal$.html "class in akka.cluster.pubsub")

---

```
public class DistributedPubSubMediator.Internal$.ValueHolder$
extends scala.runtime.AbstractFunction2<java.lang.Object,​scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>,​akka.cluster.pubsub.DistributedPubSubMediator.Internal.ValueHolder>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.pubsub.DistributedPubSubMediator.Internal$.ValueHolder$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DistributedPubSubMediator.Internal$.ValueHolder$](DistributedPubSubMediator.Internal$.ValueHolder$.html "class in akka.cluster.pubsub")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ValueHolder$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.pubsub.DistributedPubSubMediator.Internal.ValueHolder` | `[apply](#apply(long,scala.Option))​(long version,  scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> ref)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>>>` | `[unapply](#unapply(akka.cluster.pubsub.DistributedPubSubMediator.Internal.ValueHolder))​(akka.cluster.pubsub.DistributedPubSubMediator.Internal.ValueHolder x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DistributedPubSubMediator.Internal$.ValueHolder$](DistributedPubSubMediator.Internal$.ValueHolder$.html "class in akka.cluster.pubsub") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ValueHolder$
		
		
		
		```
		public ValueHolder$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.Object,​scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>,​akka.cluster.pubsub.DistributedPubSubMediator.Internal.ValueHolder>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.Object,​scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>,​akka.cluster.pubsub.DistributedPubSubMediator.Internal.ValueHolder>`
		- #### apply
		
		
		
		```
		public akka.cluster.pubsub.DistributedPubSubMediator.Internal.ValueHolder apply​(long version,
		                                                                                scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> ref)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>>> unapply​(akka.cluster.pubsub.DistributedPubSubMediator.Internal.ValueHolder x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.ValueHolder$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.ValueHolder$.html](https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.ValueHolder$.html)*