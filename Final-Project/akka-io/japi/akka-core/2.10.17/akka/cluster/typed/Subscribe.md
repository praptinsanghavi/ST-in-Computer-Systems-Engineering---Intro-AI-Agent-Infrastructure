---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Subscribe.html
title: Subscribe
---

# Subscribe

## Content

Package [akka.cluster.typed](package-summary.html)
## Class Subscribe\<A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")\>

- java.lang.Object
- - akka.cluster.typed.Subscribe\<A\>

- All Implemented Interfaces:
`[ClusterStateSubscription](ClusterStateSubscription.html "interface in akka.cluster.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Subscribe<A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")>
extends java.lang.Object
implements [ClusterStateSubscription](ClusterStateSubscription.html "interface in akka.cluster.typed"), scala.Product, java.io.Serializable
```

Subscribe to cluster state changes. The initial state of the cluster will be sent as
 a "replay" of the subscribed events.
 
 param: subscriber A subscriber that will receive events until it is unsubscribed or stops
 param: eventClass The type of events to subscribe to, can be individual event types such as
 `ReachabilityEvent` or one of the common supertypes, such as `MemberEvent` to get
 all the subtypes of events.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.Subscribe)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Subscribe](#%3Cinit%3E(akka.actor.typed.ActorRef,java.lang.Class))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[A](Subscribe.html "type parameter in Subscribe")> subscriber,  java.lang.Class<[A](Subscribe.html "type parameter in Subscribe")> eventClass)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")>[Subscribe](Subscribe.html "class in akka.cluster.typed")<A>` | `[apply](#apply(akka.actor.typed.ActorRef,java.lang.Class))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A> subscriber,  java.lang.Class<A> eventClass)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")>[Subscribe](Subscribe.html "class in akka.cluster.typed")<A>` | `[copy](#copy(akka.actor.typed.ActorRef,java.lang.Class))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A> subscriber,  java.lang.Class<A> eventClass)` |  |
	| `<A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")>[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>` | `[copy$default$1](#copy$default$1())()` |  |
	| `<A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")>java.lang.Class<A>` | `[copy$default$2](#copy$default$2())()` |  |
	| `static <A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")>[Subscribe](Subscribe.html "class in akka.cluster.typed")<A>` | `[create](#create(akka.actor.typed.ActorRef,java.lang.Class))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A> subscriber,  java.lang.Class<A> eventClass)` | Java API |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Class<[A](Subscribe.html "type parameter in Subscribe")>` | `[eventClass](#eventClass())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[A](Subscribe.html "type parameter in Subscribe")>` | `[subscriber](#subscriber())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")>scala.Option<scala.Tuple2<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​java.lang.Class<A>>>` | `[unapply](#unapply(akka.cluster.typed.Subscribe))​([Subscribe](Subscribe.html "class in akka.cluster.typed")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Subscribe
		
		
		
		```
		public Subscribe​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[A](Subscribe.html "type parameter in Subscribe")> subscriber,
		                 java.lang.Class<[A](Subscribe.html "type parameter in Subscribe")> eventClass)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")> [Subscribe](Subscribe.html "class in akka.cluster.typed")<A> create​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A> subscriber,
		                                                                              java.lang.Class<A> eventClass)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public static <A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")> [Subscribe](Subscribe.html "class in akka.cluster.typed")<A> apply​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A> subscriber,
		                                                                             java.lang.Class<A> eventClass)
		```
		- #### unapply
		
		
		
		```
		public static <A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")> scala.Option<scala.Tuple2<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​java.lang.Class<A>>> unapply​([Subscribe](Subscribe.html "class in akka.cluster.typed")<A> x$0)
		```
		- #### subscriber
		
		
		
		```
		public [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[A](Subscribe.html "type parameter in Subscribe")> subscriber()
		```
		- #### eventClass
		
		
		
		```
		public java.lang.Class<[A](Subscribe.html "type parameter in Subscribe")> eventClass()
		```
		- #### copy
		
		
		
		```
		public <A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")> [Subscribe](Subscribe.html "class in akka.cluster.typed")<A> copy​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A> subscriber,
		                                                                     java.lang.Class<A> eventClass)
		```
		- #### copy$default$1
		
		
		
		```
		public <A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")> [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")> java.lang.Class<A> copy$default$2()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.ClusterDomainEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterStateSubscription.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Subscribe.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Subscribe.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Subscribe.html)*