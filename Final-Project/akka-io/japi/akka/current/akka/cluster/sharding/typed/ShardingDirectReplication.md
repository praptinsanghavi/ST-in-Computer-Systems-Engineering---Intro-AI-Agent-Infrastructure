---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingDirectReplication.VerifyStarted$.html
title: ShardingDirectReplication.VerifyStarted$
---

# ShardingDirectReplication.VerifyStarted$

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ShardingDirectReplication.VerifyStarted$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")\<[Done](../../../Done.html "class in akka")\>,​akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted\>
	- - akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>,​akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted>`

Enclosing class:
[ShardingDirectReplication](ShardingDirectReplication.html "class in akka.cluster.sharding.typed")

---

```
public static class ShardingDirectReplication.VerifyStarted$
extends scala.runtime.AbstractFunction1<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>,​akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingDirectReplication.VerifyStarted$](ShardingDirectReplication.VerifyStarted$.html "class in akka.cluster.sharding.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[VerifyStarted$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")> replyTo)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>>` | `[unapply](#unapply(akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted))​(akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingDirectReplication.VerifyStarted$](ShardingDirectReplication.VerifyStarted$.html "class in akka.cluster.sharding.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### VerifyStarted$
		
		
		
		```
		public VerifyStarted$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>,​akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>,​akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted>`
		- #### apply
		
		
		
		```
		public akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted apply​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")> replyTo)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>,​akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted>`
		- #### unapply
		
		
		
		```
		public scala.Option<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>> unapply​(akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingDirectReplication.VerifyStarted$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingDirectReplication.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingDirectReplication.VerifyStarted$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingDirectReplication.VerifyStarted$.html)*