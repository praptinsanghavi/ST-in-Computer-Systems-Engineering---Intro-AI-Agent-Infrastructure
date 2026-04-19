---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/Subscribe$.html
title: Subscribe$
---

# Subscribe$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class Subscribe$

- java.lang.Object
- - akka.cluster.typed.Subscribe$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Subscribe$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.Subscribe$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Subscribe$](Subscribe$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Subscribe$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")>[Subscribe](Subscribe.html "class in akka.cluster.typed")<A>` | `[apply](#apply(akka.actor.typed.ActorRef,java.lang.Class))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A> subscriber,  java.lang.Class<A> eventClass)` |  |
	| `<A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")>[Subscribe](Subscribe.html "class in akka.cluster.typed")<A>` | `[create](#create(akka.actor.typed.ActorRef,java.lang.Class))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A> subscriber,  java.lang.Class<A> eventClass)` | Java API |
	| `<A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")>scala.Option<scala.Tuple2<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​java.lang.Class<A>>>` | `[unapply](#unapply(akka.cluster.typed.Subscribe))​([Subscribe](Subscribe.html "class in akka.cluster.typed")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Subscribe$](Subscribe$.html "class in akka.cluster.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Subscribe$
		
		
		
		```
		public Subscribe$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")> [Subscribe](Subscribe.html "class in akka.cluster.typed")<A> create​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A> subscriber,
		                                                                       java.lang.Class<A> eventClass)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public <A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")> [Subscribe](Subscribe.html "class in akka.cluster.typed")<A> apply​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A> subscriber,
		                                                                      java.lang.Class<A> eventClass)
		```
		- #### unapply
		
		
		
		```
		public <A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")> scala.Option<scala.Tuple2<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​java.lang.Class<A>>> unapply​([Subscribe](Subscribe.html "class in akka.cluster.typed")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ClusterEvent.ClusterDomainEvent.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/Subscribe$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/Subscribe.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/Subscribe$.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/Subscribe$.html)*