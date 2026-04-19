---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:54:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/SmallestMailboxPool.html
title: SmallestMailboxPool
---

# SmallestMailboxPool

## Content

Package [akka.routing](package-summary.html)
## Class SmallestMailboxPool

- java.lang.Object
- - akka.routing.SmallestMailboxPool

- All Implemented Interfaces:
`[Pool](Pool.html "interface in akka.routing")`, `[PoolOverrideUnsetConfig](PoolOverrideUnsetConfig.html "interface in akka.routing")<[SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing")>`, `[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SmallestMailboxPool
extends java.lang.Object
implements [Pool](Pool.html "interface in akka.routing"), [PoolOverrideUnsetConfig](PoolOverrideUnsetConfig.html "interface in akka.routing")<[SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing")>, scala.Product, java.io.Serializable
```

A router pool that tries to send to the non\-suspended routee with fewest messages in mailbox.
 The selection is done in this order:
 
	- pick any idle routee (not processing message) with empty mailbox
	- pick any routee with empty mailbox
	- pick routee with fewest pending messages in mailbox
	- pick any remote routee, remote actors are consider lowest priority,
	 since their mailbox size is unknown

 The configuration parameter trumps the constructor arguments. This means that
 if you provide `nrOfInstances` during instantiation they will be ignored if
 the router is defined in the configuration file for the actor being used.
 

# Supervision Setup

 Any routees that are created by a router will be created as the router's children.
 The router is therefore also the children's supervisor.
 

 The supervision strategy of the router actor can be configured with
 [`withSupervisorStrategy(akka.actor.SupervisorStrategy)`](#withSupervisorStrategy(akka.actor.SupervisorStrategy)). If no strategy is provided, routers default to
 a strategy of \&ldquo;always escalate\&rdquo;. This means that errors are passed up to the
 router's supervisor for handling.
 

 The router's supervisor will treat the error as an error with the router itself.
 Therefore a directive to stop or restart will cause the router itself to stop or
 restart. The router, in turn, will cause its children to stop and restart.
 

 param: nrOfInstances initial number of routees in the pool
 

 param: resizer optional resizer that dynamically adjust the pool size
 

 param: supervisorStrategy strategy for supervising the routees, see 'Supervision Setup'
 

 param: routerDispatcher dispatcher to use for the router head actor, which handles
 supervision, death watch and router management messages

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.SmallestMailboxPool)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SmallestMailboxPool](#%3Cinit%3E(int))​(int nr)` | Java API |
	| `[SmallestMailboxPool](#%3Cinit%3E(int,scala.Option,akka.actor.SupervisorStrategy,java.lang.String,boolean))​(int nrOfInstances,  scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `[SmallestMailboxPool](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static java.lang.String` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `static boolean` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `static [SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing")` | `[apply](#apply(int,scala.Option,akka.actor.SupervisorStrategy,java.lang.String,boolean))​(int nrOfInstances,  scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `static scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[apply$default$2](#apply$default$2())()` |  |
	| `static [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[apply$default$3](#apply$default$3())()` |  |
	| `static java.lang.String` | `[apply$default$4](#apply$default$4())()` |  |
	| `static boolean` | `[apply$default$5](#apply$default$5())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing")` | `[copy](#copy(int,scala.Option,akka.actor.SupervisorStrategy,java.lang.String,boolean))​(int nrOfInstances,  scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[copy$default$2](#copy$default$2())()` |  |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[copy$default$3](#copy$default$3())()` |  |
	| `java.lang.String` | `[copy$default$4](#copy$default$4())()` |  |
	| `boolean` | `[copy$default$5](#copy$default$5())()` |  |
	| `[Router](Router.html "class in akka.routing")` | `[createRouter](#createRouter(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Create the actual router, responsible for routing messages to routees. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[nrOfInstances](#nrOfInstances())()` |  |
	| `int` | `[nrOfInstances](#nrOfInstances(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") sys)` | Initial number of routee instances |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[resizer](#resizer())()` | Pool with dynamically resizable number of routees return the [`Resizer`](Resizer.html "interface in akka.routing")  to use. |
	| `java.lang.String` | `[routerDispatcher](#routerDispatcher())()` | Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles  supervision, death watch and router management messages |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[supervisorStrategy](#supervisorStrategy())()` | SupervisorStrategy for the head actor, i.e. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple5<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.routing.SmallestMailboxPool))​([SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing") x$0)` |  |
	| `boolean` | `[usePoolDispatcher](#usePoolDispatcher())()` | Use a dedicated dispatcher for the routees of the pool. |
	| `[SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing")` | `[withDispatcher](#withDispatcher(java.lang.String))​(java.lang.String dispatcherId)` | Setting the dispatcher to be used for the router head actor, which handles  supervision, death watch and router management messages. |
	| `[RouterConfig](RouterConfig.html "interface in akka.routing")` | `[withFallback](#withFallback(akka.routing.RouterConfig))​([RouterConfig](RouterConfig.html "interface in akka.routing") other)` | Uses the resizer and/or the supervisor strategy of the given RouterConfig  if this RouterConfig doesn't have one, i.e. |
	| `[SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing")` | `[withResizer](#withResizer(akka.routing.Resizer))​([Resizer](Resizer.html "interface in akka.routing") resizer)` | Setting the resizer to be used. |
	| `[SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing")` | `[withSupervisorStrategy](#withSupervisorStrategy(akka.actor.SupervisorStrategy))​([SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") strategy)` | Setting the supervisor strategy to be used for the \&ldquo;head\&rdquo; Router actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.routing.[Pool](Pool.html "interface in akka.routing")
		
		
		`[createRouterActor](Pool.html#createRouterActor()), [enrichWithPoolDispatcher](Pool.html#enrichWithPoolDispatcher(akka.actor.Props,akka.actor.ActorContext)), [newRoutee](Pool.html#newRoutee(akka.actor.Props,akka.actor.ActorContext)), [props](Pool.html#props(akka.actor.Props)), [stopRouterWhenAllRouteesRemoved](Pool.html#stopRouterWhenAllRouteesRemoved())`
		- ### Methods inherited from interface akka.routing.[PoolOverrideUnsetConfig](PoolOverrideUnsetConfig.html "interface in akka.routing")
		
		
		`[overrideUnsetConfig](PoolOverrideUnsetConfig.html#overrideUnsetConfig(akka.routing.RouterConfig))`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.routing.[RouterConfig](RouterConfig.html "interface in akka.routing")
		
		
		`[isManagementMessage](RouterConfig.html#isManagementMessage(java.lang.Object)), [routingLogicController](RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [verifyConfig](RouterConfig.html#verifyConfig(akka.actor.ActorPath))`

- - ### Constructor Detail
	
	
	
		- #### SmallestMailboxPool
		
		
		
		```
		public SmallestMailboxPool​(int nrOfInstances,
		                           scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,
		                           [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                           java.lang.String routerDispatcher,
		                           boolean usePoolDispatcher)
		```
		- #### SmallestMailboxPool
		
		
		
		```
		public SmallestMailboxPool​(com.typesafe.config.Config config)
		```
		- #### SmallestMailboxPool
		
		
		
		```
		public SmallestMailboxPool​(int nr)
		```
		
		Java API
		
		Parameters:
		`nr` \- initial number of routees in the pool

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static scala.Option<[Resizer](Resizer.html "interface in akka.routing")> $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public static java.lang.String $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public static boolean $lessinit$greater$default$5()
		```
		- #### apply
		
		
		
		```
		public static [SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing") apply​(int nrOfInstances,
		                                        scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,
		                                        [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                                        java.lang.String routerDispatcher,
		                                        boolean usePoolDispatcher)
		```
		- #### apply$default$2
		
		
		
		```
		public static scala.Option<[Resizer](Resizer.html "interface in akka.routing")> apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public static java.lang.String apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public static boolean apply$default$5()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple5<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>> unapply​([SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing") x$0)
		```
		- #### nrOfInstances
		
		
		
		```
		public int nrOfInstances()
		```
		- #### resizer
		
		
		
		```
		public scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer()
		```
		
		Description copied from interface: `[Pool](Pool.html#resizer())`
		Pool with dynamically resizable number of routees return the [`Resizer`](Resizer.html "interface in akka.routing")
		 to use. The resizer is invoked once when the router is created, before any messages can
		 be sent to it. Resize is also triggered when messages are sent to the routees, and the
		 resizer is invoked asynchronously, i.e. not necessarily before the message has been sent.
		
		Specified by:
		`[resizer](Pool.html#resizer())` in interface `[Pool](Pool.html "interface in akka.routing")`
		- #### supervisorStrategy
		
		
		
		```
		public [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy()
		```
		
		Description copied from interface: `[Pool](Pool.html#supervisorStrategy())`
		SupervisorStrategy for the head actor, i.e. for supervising the routees of the pool.
		
		Specified by:
		`[supervisorStrategy](Pool.html#supervisorStrategy())` in interface `[Pool](Pool.html "interface in akka.routing")`
		- #### routerDispatcher
		
		
		
		```
		public java.lang.String routerDispatcher()
		```
		
		Description copied from interface: `[RouterConfig](RouterConfig.html#routerDispatcher())`
		Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles
		 supervision, death watch and router management messages
		
		Specified by:
		`[routerDispatcher](RouterConfig.html#routerDispatcher())` in interface `[RouterConfig](RouterConfig.html "interface in akka.routing")`
		- #### usePoolDispatcher
		
		
		
		```
		public boolean usePoolDispatcher()
		```
		
		Description copied from interface: `[Pool](Pool.html#usePoolDispatcher())`
		Use a dedicated dispatcher for the routees of the pool.
		 The dispatcher is defined in 'pool\-dispatcher' configuration property in the
		 deployment section of the router.
		
		Specified by:
		`[usePoolDispatcher](Pool.html#usePoolDispatcher())` in interface `[Pool](Pool.html "interface in akka.routing")`
		- #### createRouter
		
		
		
		```
		public [Router](Router.html "class in akka.routing") createRouter​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[RouterConfig](RouterConfig.html#createRouter(akka.actor.ActorSystem))`
		Create the actual router, responsible for routing messages to routees.
		 
		
		Specified by:
		`[createRouter](RouterConfig.html#createRouter(akka.actor.ActorSystem))` in interface `[RouterConfig](RouterConfig.html "interface in akka.routing")`
		Parameters:
		`system` \- the ActorSystem this router belongs to
		- #### nrOfInstances
		
		
		
		```
		public int nrOfInstances​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") sys)
		```
		
		Description copied from interface: `[Pool](Pool.html#nrOfInstances(akka.actor.ActorSystem))`
		Initial number of routee instances
		
		Specified by:
		`[nrOfInstances](Pool.html#nrOfInstances(akka.actor.ActorSystem))` in interface `[Pool](Pool.html "interface in akka.routing")`
		- #### withSupervisorStrategy
		
		
		
		```
		public [SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing") withSupervisorStrategy​([SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") strategy)
		```
		
		Setting the supervisor strategy to be used for the \&ldquo;head\&rdquo; Router actor.
		
		Specified by:
		`[withSupervisorStrategy](PoolOverrideUnsetConfig.html#withSupervisorStrategy(akka.actor.SupervisorStrategy))` in interface `[PoolOverrideUnsetConfig](PoolOverrideUnsetConfig.html "interface in akka.routing")<[SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing")>`
		- #### withResizer
		
		
		
		```
		public [SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing") withResizer​([Resizer](Resizer.html "interface in akka.routing") resizer)
		```
		
		Setting the resizer to be used.
		
		Specified by:
		`[withResizer](PoolOverrideUnsetConfig.html#withResizer(akka.routing.Resizer))` in interface `[PoolOverrideUnsetConfig](PoolOverrideUnsetConfig.html "interface in akka.routing")<[SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing")>`
		- #### withDispatcher
		
		
		
		```
		public [SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing") withDispatcher​(java.lang.String dispatcherId)
		```
		
		Setting the dispatcher to be used for the router head actor, which handles
		 supervision, death watch and router management messages.
		- #### withFallback
		
		
		
		```
		public [RouterConfig](RouterConfig.html "interface in akka.routing") withFallback​([RouterConfig](RouterConfig.html "interface in akka.routing") other)
		```
		
		Uses the resizer and/or the supervisor strategy of the given RouterConfig
		 if this RouterConfig doesn't have one, i.e. the resizer defined in code is used if
		 resizer was not defined in config.
		
		Specified by:
		`[withFallback](RouterConfig.html#withFallback(akka.routing.RouterConfig))` in interface `[RouterConfig](RouterConfig.html "interface in akka.routing")`
		- #### copy
		
		
		
		```
		public [SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing") copy​(int nrOfInstances,
		                                scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,
		                                [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                                java.lang.String routerDispatcher,
		                                boolean usePoolDispatcher)
		```
		- #### copy$default$1
		
		
		
		```
		public int copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.Option<[Resizer](Resizer.html "interface in akka.routing")> copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public java.lang.String copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public boolean copy$default$5()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Pool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/PoolOverrideUnsetConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/SmallestMailboxPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/SmallestMailboxPool.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/SmallestMailboxPool.html)*