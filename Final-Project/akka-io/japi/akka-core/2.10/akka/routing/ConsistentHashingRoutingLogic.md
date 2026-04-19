---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRoutingLogic.html
title: ConsistentHashingRoutingLogic
---

# ConsistentHashingRoutingLogic

## Content

Package [akka.routing](package-summary.html)
## Class ConsistentHashingRoutingLogic

- java.lang.Object
- - akka.routing.ConsistentHashingRoutingLogic

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[RoutingLogic](RoutingLogic.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ConsistentHashingRoutingLogic
extends java.lang.Object
implements [RoutingLogic](RoutingLogic.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.ConsistentHashingRoutingLogic)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConsistentHashingRoutingLogic](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Java API |
	| `[ConsistentHashingRoutingLogic](#%3Cinit%3E(akka.actor.ActorSystem,int,scala.PartialFunction))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  int virtualNodesFactor,  scala.PartialFunction<java.lang.Object,​java.lang.Object> hashMapping)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` | Uses consistent hashing to select a routee based on the sent message. |
	| `static scala.PartialFunction<java.lang.Object,​java.lang.Object>` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static [ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing")` | `[apply](#apply(akka.actor.ActorSystem,int,scala.PartialFunction))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  int virtualNodesFactor,  scala.PartialFunction<java.lang.Object,​java.lang.Object> hashMapping)` | Uses consistent hashing to select a routee based on the sent message. |
	| `static int` | `[apply$default$2](#apply$default$2())()` |  |
	| `static scala.PartialFunction<java.lang.Object,​java.lang.Object>` | `[apply$default$3](#apply$default$3())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing")` | `[copy](#copy(akka.actor.ActorSystem,int,scala.PartialFunction))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  int virtualNodesFactor,  scala.PartialFunction<java.lang.Object,​java.lang.Object> hashMapping)` |  |
	| `[ActorSystem](../actor/ActorSystem.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `int` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.PartialFunction<java.lang.Object,​java.lang.Object>` | `[copy$default$3](#copy$default$3())()` |  |
	| `static [Address](../actor/Address.html "class in akka.actor")` | `[defaultAddress](#defaultAddress(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.PartialFunction<java.lang.Object,​java.lang.Object>` | `[hashMapping](#hashMapping())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Routee](Routee.html "interface in akka.routing")` | `[select](#select(java.lang.Object,scala.collection.immutable.IndexedSeq))​(java.lang.Object message,  scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` | Pick the destination for a given message. |
	| `[ActorSystem](../actor/ActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<[ActorSystem](../actor/ActorSystem.html "class in akka.actor"),​java.lang.Object,​scala.PartialFunction<java.lang.Object,​java.lang.Object>>>` | `[unapply](#unapply(akka.routing.ConsistentHashingRoutingLogic))​([ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing") x$0)` |  |
	| `int` | `[virtualNodesFactor](#virtualNodesFactor())()` |  |
	| `int` | `[vnodes](#vnodes())()` |  |
	| `[ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing")` | `[withHashMapper](#withHashMapper(akka.routing.ConsistentHashingRouter.ConsistentHashMapper))​([ConsistentHashingRouter.ConsistentHashMapper](ConsistentHashingRouter.ConsistentHashMapper.html "interface in akka.routing") mapper)` | Java API: Setting the mapping from message to the data to use for the consistent hash key. |
	| `[ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing")` | `[withVirtualNodesFactor](#withVirtualNodesFactor(int))​(int vnodes)` | Setting the number of virtual nodes per node, used in [`ConsistentHash`](ConsistentHash.html "class in akka.routing") |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ConsistentHashingRoutingLogic
		
		
		
		```
		public ConsistentHashingRoutingLogic​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                     int virtualNodesFactor,
		                                     scala.PartialFunction<java.lang.Object,​java.lang.Object> hashMapping)
		```
		- #### ConsistentHashingRoutingLogic
		
		
		
		```
		public ConsistentHashingRoutingLogic​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API
		
		Parameters:
		`system` \- the actor system hosting this router

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static int $lessinit$greater$default$2()
		```
		
		Uses consistent hashing to select a routee based on the sent message.
		 
		 There is 3 ways to define what data to use for the consistent hash key.
		 
		
		
		 1\. You can define `hashMapping` / `withHashMapper`
		 of the router to map incoming messages to their consistent hash key.
		 This makes the decision transparent for the sender.
		 
		
		
		 2\. The messages may implement [`ConsistentHashingRouter.ConsistentHashable`](ConsistentHashingRouter.ConsistentHashable.html "interface in akka.routing").
		 The key is part of the message and it's convenient to define it together
		 with the message definition.
		 
		
		
		 3\. The messages can be wrapped in a [`ConsistentHashingRouter.ConsistentHashableEnvelope`](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing")
		 to define what data to use for the consistent hash key. The sender knows
		 the key to use.
		 
		
		
		 These ways to define the consistent hash key can be use together and at
		 the same time for one router. The `hashMapping` is tried first.
		 
		
		
		
		Parameters:
		`virtualNodesFactor` \- number of virtual nodes per node, used in [`ConsistentHash`](ConsistentHash.html "class in akka.routing")
		
		`hashMapping` \- partial function from message to the data to
		 use for the consistent hash key
		 
		`system` \- the actor system hosting this router
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static scala.PartialFunction<java.lang.Object,​java.lang.Object> $lessinit$greater$default$3()
		```
		- #### defaultAddress
		
		
		
		```
		public static [Address](../actor/Address.html "class in akka.actor") defaultAddress​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static [ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing") apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                                  int virtualNodesFactor,
		                                                  scala.PartialFunction<java.lang.Object,​java.lang.Object> hashMapping)
		```
		
		Uses consistent hashing to select a routee based on the sent message.
		 
		 There is 3 ways to define what data to use for the consistent hash key.
		 
		
		
		 1\. You can define `hashMapping` / `withHashMapper`
		 of the router to map incoming messages to their consistent hash key.
		 This makes the decision transparent for the sender.
		 
		
		
		 2\. The messages may implement [`ConsistentHashingRouter.ConsistentHashable`](ConsistentHashingRouter.ConsistentHashable.html "interface in akka.routing").
		 The key is part of the message and it's convenient to define it together
		 with the message definition.
		 
		
		
		 3\. The messages can be wrapped in a [`ConsistentHashingRouter.ConsistentHashableEnvelope`](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing")
		 to define what data to use for the consistent hash key. The sender knows
		 the key to use.
		 
		
		
		 These ways to define the consistent hash key can be use together and at
		 the same time for one router. The `hashMapping` is tried first.
		 
		
		
		
		Parameters:
		`virtualNodesFactor` \- number of virtual nodes per node, used in [`ConsistentHash`](ConsistentHash.html "class in akka.routing")
		
		`hashMapping` \- partial function from message to the data to
		 use for the consistent hash key
		 
		`system` \- the actor system hosting this router
		- #### apply$default$2
		
		
		
		```
		public static int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static scala.PartialFunction<java.lang.Object,​java.lang.Object> apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<[ActorSystem](../actor/ActorSystem.html "class in akka.actor"),​java.lang.Object,​scala.PartialFunction<java.lang.Object,​java.lang.Object>>> unapply​([ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing") x$0)
		```
		- #### system
		
		
		
		```
		public [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system()
		```
		- #### virtualNodesFactor
		
		
		
		```
		public int virtualNodesFactor()
		```
		- #### hashMapping
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​java.lang.Object> hashMapping()
		```
		- #### vnodes
		
		
		
		```
		public int vnodes()
		```
		- #### withVirtualNodesFactor
		
		
		
		```
		public [ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing") withVirtualNodesFactor​(int vnodes)
		```
		
		Setting the number of virtual nodes per node, used in [`ConsistentHash`](ConsistentHash.html "class in akka.routing")
		- #### withHashMapper
		
		
		
		```
		public [ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing") withHashMapper​([ConsistentHashingRouter.ConsistentHashMapper](ConsistentHashingRouter.ConsistentHashMapper.html "interface in akka.routing") mapper)
		```
		
		Java API: Setting the mapping from message to the data to use for the consistent hash key.
		- #### select
		
		
		
		```
		public [Routee](Routee.html "interface in akka.routing") select​(java.lang.Object message,
		                     scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		
		Description copied from interface: `[RoutingLogic](RoutingLogic.html#select(java.lang.Object,scala.collection.immutable.IndexedSeq))`
		Pick the destination for a given message. Normally it picks one of the
		 passed `routees`, but in the end it is up to the implementation to
		 return whatever [`Routee`](Routee.html "interface in akka.routing") to use for sending a specific message.
		 
		 When implemented from Java it can be good to know that
		 `routees.apply(index)` can be used to get an element
		 from the `IndexedSeq`.
		
		
		
		Specified by:
		`[select](RoutingLogic.html#select(java.lang.Object,scala.collection.immutable.IndexedSeq))` in interface `[RoutingLogic](RoutingLogic.html "interface in akka.routing")`
		- #### copy
		
		
		
		```
		public [ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing") copy​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                          int virtualNodesFactor,
		                                          scala.PartialFunction<java.lang.Object,​java.lang.Object> hashMapping)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorSystem](../actor/ActorSystem.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public int copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​java.lang.Object> copy$default$3()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRouter.ConsistentHashMapper.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRouter.ConsistentHashable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRoutingLogic.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRoutingLogic.html)*