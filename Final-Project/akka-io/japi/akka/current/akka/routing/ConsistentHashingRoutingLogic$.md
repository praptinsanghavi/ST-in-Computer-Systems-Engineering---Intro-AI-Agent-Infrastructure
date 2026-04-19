---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHashingRoutingLogic$.html
title: ConsistentHashingRoutingLogic$
---

# ConsistentHashingRoutingLogic$

## Content

Package [akka.routing](package-summary.html)
## Class ConsistentHashingRoutingLogic$

- java.lang.Object
- - akka.routing.ConsistentHashingRoutingLogic$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ConsistentHashingRoutingLogic$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.ConsistentHashingRoutingLogic$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConsistentHashingRoutingLogic$](ConsistentHashingRoutingLogic$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConsistentHashingRoutingLogic$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` | Uses consistent hashing to select a routee based on the sent message. |
	| `scala.PartialFunction<java.lang.Object,​java.lang.Object>` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `[ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing")` | `[apply](#apply(akka.actor.ActorSystem,int,scala.PartialFunction))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  int virtualNodesFactor,  scala.PartialFunction<java.lang.Object,​java.lang.Object> hashMapping)` | Uses consistent hashing to select a routee based on the sent message. |
	| `int` | `[apply$default$2](#apply$default$2())()` |  |
	| `scala.PartialFunction<java.lang.Object,​java.lang.Object>` | `[apply$default$3](#apply$default$3())()` |  |
	| `[Address](../actor/Address.html "class in akka.actor")` | `[defaultAddress](#defaultAddress(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `scala.Option<scala.Tuple3<[ActorSystem](../actor/ActorSystem.html "class in akka.actor"),​java.lang.Object,​scala.PartialFunction<java.lang.Object,​java.lang.Object>>>` | `[unapply](#unapply(akka.routing.ConsistentHashingRoutingLogic))​([ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConsistentHashingRoutingLogic$](ConsistentHashingRoutingLogic$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ConsistentHashingRoutingLogic$
		
		
		
		```
		public ConsistentHashingRoutingLogic$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public int $lessinit$greater$default$2()
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
		public scala.PartialFunction<java.lang.Object,​java.lang.Object> $lessinit$greater$default$3()
		```
		- #### defaultAddress
		
		
		
		```
		public [Address](../actor/Address.html "class in akka.actor") defaultAddress​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public [ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing") apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
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
		public int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​java.lang.Object> apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[ActorSystem](../actor/ActorSystem.html "class in akka.actor"),​java.lang.Object,​scala.PartialFunction<java.lang.Object,​java.lang.Object>>> unapply​([ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHash.html
- https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHashingRouter.ConsistentHashable.html
- https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHashingRoutingLogic$.html
- https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHashingRoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHashingRoutingLogic$.html](https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHashingRoutingLogic$.html)*