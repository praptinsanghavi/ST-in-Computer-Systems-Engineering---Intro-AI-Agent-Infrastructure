---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:38:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck$.html
title: DistributedPubSubMediator.UnsubscribeAck$
---

# DistributedPubSubMediator.UnsubscribeAck$

## Content

Package [akka.cluster.pubsub](package-summary.html)
## Class DistributedPubSubMediator.UnsubscribeAck$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub"),​[DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub")\>
	- - akka.cluster.pubsub.DistributedPubSubMediator.UnsubscribeAck$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub"),​[DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub")>`

Enclosing class:
[DistributedPubSubMediator](DistributedPubSubMediator.html "class in akka.cluster.pubsub")

---

```
public static class DistributedPubSubMediator.UnsubscribeAck$
extends scala.runtime.AbstractFunction1<[DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub"),​[DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.pubsub.DistributedPubSubMediator.UnsubscribeAck$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DistributedPubSubMediator.UnsubscribeAck$](DistributedPubSubMediator.UnsubscribeAck$.html "class in akka.cluster.pubsub")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnsubscribeAck$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub")` | `[apply](#apply(akka.cluster.pubsub.DistributedPubSubMediator.Unsubscribe))​([DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub") unsubscribe)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub")>` | `[unapply](#unapply(akka.cluster.pubsub.DistributedPubSubMediator.UnsubscribeAck))​([DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DistributedPubSubMediator.UnsubscribeAck$](DistributedPubSubMediator.UnsubscribeAck$.html "class in akka.cluster.pubsub") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UnsubscribeAck$
		
		
		
		```
		public UnsubscribeAck$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub"),​[DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub"),​[DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub")>`
		- #### apply
		
		
		
		```
		public [DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub") apply​([DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub") unsubscribe)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub"),​[DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub")> unapply​([DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator.Unsubscribe.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck$.html)*