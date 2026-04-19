---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:54:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/TailChoppingPool.html
title: TailChoppingPool
---

# TailChoppingPool

## Content

Package [akka.routing](package-summary.html)
## Class TailChoppingPool

- java.lang.Object
- - akka.routing.TailChoppingPool

- All Implemented Interfaces:
`[Pool](Pool.html "interface in akka.routing")`, `[PoolOverrideUnsetConfig](PoolOverrideUnsetConfig.html "interface in akka.routing")<[TailChoppingPool](TailChoppingPool.html "class in akka.routing")>`, `[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class TailChoppingPool
extends java.lang.Object
implements [Pool](Pool.html "interface in akka.routing"), [PoolOverrideUnsetConfig](PoolOverrideUnsetConfig.html "interface in akka.routing")<[TailChoppingPool](TailChoppingPool.html "class in akka.routing")>, scala.Product, java.io.Serializable
```

A router pool with retry logic, intended for cases where a return message is expected in
 response to a message sent to the routee. As each message is sent to the routing pool, the
 routees are randomly ordered. The message is sent to the first routee. If no response is received
 before the `interval` has passed, the same message is sent to the next routee. This process repeats
 until either a response is received from some routee, the routees in the pool are exhausted, or
 the `within` duration has passed since the first send. If no routee sends
 a response in time, a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor") wrapping a [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern")
 is sent to the sender.
 
 Refer to [`TailChoppingRoutingLogic`](TailChoppingRoutingLogic.html "class in akka.routing") for comments regarding the goal of this
 routing algorithm.
 

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
 

 param: within expecting at least one reply within this duration, otherwise
 it will reply with [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern") in a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")

 param: interval duration after which the message will be sent to the next routee
 

 param: supervisorStrategy strategy for supervising the routees, see 'Supervision Setup'
 

 param: routerDispatcher dispatcher to use for the router head actor, which handles
 supervision, death watch and router management messages

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.TailChoppingPool)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TailChoppingPool](#%3Cinit%3E(int,java.time.Duration,java.time.Duration))​(int nr,  java.time.Duration within,  java.time.Duration interval)` | Java API |
	| `[TailChoppingPool](#%3Cinit%3E(int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(int nr,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval)` | Java API |
	| `[TailChoppingPool](#%3Cinit%3E(int,scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.SupervisorStrategy,java.lang.String,boolean))​(int nrOfInstances,  scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `[TailChoppingPool](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `static java.lang.String` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `static boolean` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `static [TailChoppingPool](TailChoppingPool.html "class in akka.routing")` | `[apply](#apply(int,scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.SupervisorStrategy,java.lang.String,boolean))​(int nrOfInstances,  scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `static scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[apply$default$2](#apply$default$2())()` |  |
	| `static [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[apply$default$5](#apply$default$5())()` |  |
	| `static java.lang.String` | `[apply$default$6](#apply$default$6())()` |  |
	| `static boolean` | `[apply$default$7](#apply$default$7())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[TailChoppingPool](TailChoppingPool.html "class in akka.routing")` | `[copy](#copy(int,scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.SupervisorStrategy,java.lang.String,boolean))​(int nrOfInstances,  scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[copy$default$3](#copy$default$3())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[copy$default$4](#copy$default$4())()` |  |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[copy$default$5](#copy$default$5())()` |  |
	| `java.lang.String` | `[copy$default$6](#copy$default$6())()` |  |
	| `boolean` | `[copy$default$7](#copy$default$7())()` |  |
	| `[Router](Router.html "class in akka.routing")` | `[createRouter](#createRouter(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Create the actual router, responsible for routing messages to routees. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[interval](#interval())()` |  |
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
	| `static scala.Option<scala.Tuple7<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.routing.TailChoppingPool))​([TailChoppingPool](TailChoppingPool.html "class in akka.routing") x$0)` |  |
	| `boolean` | `[usePoolDispatcher](#usePoolDispatcher())()` | Use a dedicated dispatcher for the routees of the pool. |
	| `[TailChoppingPool](TailChoppingPool.html "class in akka.routing")` | `[withDispatcher](#withDispatcher(java.lang.String))​(java.lang.String dispatcherId)` | Setting the dispatcher to be used for the router head actor, which handles  supervision, death watch and router management messages. |
	| `[RouterConfig](RouterConfig.html "interface in akka.routing")` | `[withFallback](#withFallback(akka.routing.RouterConfig))​([RouterConfig](RouterConfig.html "interface in akka.routing") other)` | Uses the resizer and/or the supervisor strategy of the given RouterConfig  if this RouterConfig doesn't have one, i.e. |
	| `scala.concurrent.duration.FiniteDuration` | `[within](#within())()` |  |
	| `[TailChoppingPool](TailChoppingPool.html "class in akka.routing")` | `[withResizer](#withResizer(akka.routing.Resizer))​([Resizer](Resizer.html "interface in akka.routing") resizer)` | Setting the resizer to be used. |
	| `[TailChoppingPool](TailChoppingPool.html "class in akka.routing")` | `[withSupervisorStrategy](#withSupervisorStrategy(akka.actor.SupervisorStrategy))​([SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") strategy)` | Setting the supervisor strategy to be used for the \&ldquo;head\&rdquo; Router actor. |
	
	
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
	
	
	
		- #### TailChoppingPool
		
		
		
		```
		public TailChoppingPool​(int nrOfInstances,
		                        scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,
		                        scala.concurrent.duration.FiniteDuration within,
		                        scala.concurrent.duration.FiniteDuration interval,
		                        [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                        java.lang.String routerDispatcher,
		                        boolean usePoolDispatcher)
		```
		- #### TailChoppingPool
		
		
		
		```
		public TailChoppingPool​(com.typesafe.config.Config config)
		```
		- #### TailChoppingPool
		
		
		
		```
		public TailChoppingPool​(int nr,
		                        scala.concurrent.duration.FiniteDuration within,
		                        scala.concurrent.duration.FiniteDuration interval)
		```
		
		Java API
		
		Parameters:
		`nr` \- initial number of routees in the pool
		`within` \- expecting at least one reply within this duration, otherwise
		 it will reply with [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern") in a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")
		`interval` \- duration after which next routee will be picked
		- #### TailChoppingPool
		
		
		
		```
		public TailChoppingPool​(int nr,
		                        java.time.Duration within,
		                        java.time.Duration interval)
		```
		
		Java API
		
		Parameters:
		`nr` \- initial number of routees in the pool
		`within` \- expecting at least one reply within this duration, otherwise
		 it will reply with [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern") in a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")
		`interval` \- duration after which next routee will be picked

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static scala.Option<[Resizer](Resizer.html "interface in akka.routing")> $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public static [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") $lessinit$greater$default$5()
		```
		- #### $lessinit$greater$default$6
		
		
		
		```
		public static java.lang.String $lessinit$greater$default$6()
		```
		- #### $lessinit$greater$default$7
		
		
		
		```
		public static boolean $lessinit$greater$default$7()
		```
		- #### apply
		
		
		
		```
		public static [TailChoppingPool](TailChoppingPool.html "class in akka.routing") apply​(int nrOfInstances,
		                                     scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,
		                                     scala.concurrent.duration.FiniteDuration within,
		                                     scala.concurrent.duration.FiniteDuration interval,
		                                     [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                                     java.lang.String routerDispatcher,
		                                     boolean usePoolDispatcher)
		```
		- #### apply$default$2
		
		
		
		```
		public static scala.Option<[Resizer](Resizer.html "interface in akka.routing")> apply$default$2()
		```
		- #### apply$default$5
		
		
		
		```
		public static [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public static java.lang.String apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public static boolean apply$default$7()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple7<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>> unapply​([TailChoppingPool](TailChoppingPool.html "class in akka.routing") x$0)
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
		- #### within
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration within()
		```
		- #### interval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration interval()
		```
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
		public [TailChoppingPool](TailChoppingPool.html "class in akka.routing") withSupervisorStrategy​([SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") strategy)
		```
		
		Setting the supervisor strategy to be used for the \&ldquo;head\&rdquo; Router actor.
		
		Specified by:
		`[withSupervisorStrategy](PoolOverrideUnsetConfig.html#withSupervisorStrategy(akka.actor.SupervisorStrategy))` in interface `[PoolOverrideUnsetConfig](PoolOverrideUnsetConfig.html "interface in akka.routing")<[TailChoppingPool](TailChoppingPool.html "class in akka.routing")>`
		- #### withResizer
		
		
		
		```
		public [TailChoppingPool](TailChoppingPool.html "class in akka.routing") withResizer​([Resizer](Resizer.html "interface in akka.routing") resizer)
		```
		
		Setting the resizer to be used.
		
		Specified by:
		`[withResizer](PoolOverrideUnsetConfig.html#withResizer(akka.routing.Resizer))` in interface `[PoolOverrideUnsetConfig](PoolOverrideUnsetConfig.html "interface in akka.routing")<[TailChoppingPool](TailChoppingPool.html "class in akka.routing")>`
		- #### withDispatcher
		
		
		
		```
		public [TailChoppingPool](TailChoppingPool.html "class in akka.routing") withDispatcher​(java.lang.String dispatcherId)
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
		public [TailChoppingPool](TailChoppingPool.html "class in akka.routing") copy​(int nrOfInstances,
		                             scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,
		                             scala.concurrent.duration.FiniteDuration within,
		                             scala.concurrent.duration.FiniteDuration interval,
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
		public scala.concurrent.duration.FiniteDuration copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public java.lang.String copy$default$6()
		```
		- #### copy$default$7
		
		
		
		```
		public boolean copy$default$7()
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
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Pool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/PoolOverrideUnsetConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/TailChoppingPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/TailChoppingRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/TailChoppingPool.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/TailChoppingPool.html)*