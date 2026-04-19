---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:10:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.Start.html
title: ShardingProducerController.Start
---

# ShardingProducerController.Start

## Content

Package [akka.cluster.sharding.typed.delivery](package-summary.html)
## Class ShardingProducerController.Start\<A\>

- java.lang.Object
- - akka.cluster.sharding.typed.delivery.ShardingProducerController.Start\<A\>

- All Implemented Interfaces:
`[ShardingProducerControllerImpl.InternalCommand](internal/ShardingProducerControllerImpl.InternalCommand.html "interface in akka.cluster.sharding.typed.delivery.internal")`, `[ShardingProducerControllerImpl.UnsealedInternalCommand](internal/ShardingProducerControllerImpl.UnsealedInternalCommand.html "interface in akka.cluster.sharding.typed.delivery.internal")`, `[ShardingProducerController.Command](ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[ShardingProducerController](ShardingProducerController.html "class in akka.cluster.sharding.typed.delivery")

---

```
public static final class ShardingProducerController.Start<A>
extends java.lang.Object
implements [ShardingProducerController.Command](ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>, scala.Product, java.io.Serializable
```

Initial message from the producer actor. The `producer` is typically constructed
 as a message adapter to map the [`ShardingProducerController.RequestNext`](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery") to the protocol of the producer actor.
 
 If the producer is restarted it should send a new `Start` message to the
 `ShardingProducerController`.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.sharding.typed.delivery.ShardingProducerController.Start)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Start](#%3Cinit%3E(akka.actor.typed.ActorRef))​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<[A](ShardingProducerController.Start.html "type parameter in ShardingProducerController.Start")>> producer)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<A> [ShardingProducerController.Start](ShardingProducerController.Start.html "class in akka.cluster.sharding.typed.delivery")<A>` | `[copy](#copy(akka.actor.typed.ActorRef))​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<A>> producer)` |  |
	| `<A> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<A>>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<[A](ShardingProducerController.Start.html "type parameter in ShardingProducerController.Start")>>` | `[producer](#producer())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Start
		
		
		
		```
		public Start​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<[A](ShardingProducerController.Start.html "type parameter in ShardingProducerController.Start")>> producer)
		```

	- ### Method Detail
	
	
	
		- #### producer
		
		
		
		```
		public [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<[A](ShardingProducerController.Start.html "type parameter in ShardingProducerController.Start")>> producer()
		```
		- #### copy
		
		
		
		```
		public <A> [ShardingProducerController.Start](ShardingProducerController.Start.html "class in akka.cluster.sharding.typed.delivery")<A> copy​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<A>> producer)
		```
		- #### copy$default$1
		
		
		
		```
		public <A> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<A>> copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.RequestNext.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.Start.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingProducerControllerImpl.InternalCommand.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingProducerControllerImpl.UnsealedInternalCommand.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.Start.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.Start.html)*