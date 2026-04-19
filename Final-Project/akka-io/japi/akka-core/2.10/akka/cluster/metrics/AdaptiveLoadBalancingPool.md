---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
title: AdaptiveLoadBalancingPool
---

# AdaptiveLoadBalancingPool

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class AdaptiveLoadBalancingPool

- java.lang.Object
- - akka.cluster.metrics.AdaptiveLoadBalancingPool

- All Implemented Interfaces:
`[Pool](../../routing/Pool.html "interface in akka.routing")`, `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class AdaptiveLoadBalancingPool
extends java.lang.Object
implements [Pool](../../routing/Pool.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

A router pool that performs load balancing of messages to cluster nodes based on
 cluster metric data.
 
 It uses random selection of routees based on probabilities derived from
 the remaining capacity of corresponding node.
 

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
 

 param: metricsSelector decides what probability to use for selecting a routee, based
 on remaining capacity as indicated by the node metrics
 

 param: nrOfInstances initial number of routees in the pool
 

 param: supervisorStrategy strategy for supervising the routees, see 'Supervision Setup'
 

 param: routerDispatcher dispatcher to use for the router head actor, which handles
 supervision, death watch and router management messages

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.AdaptiveLoadBalancingPool)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AdaptiveLoadBalancingPool](#%3Cinit%3E(akka.cluster.metrics.MetricsSelector,int))​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,  int nr)` | Java API |
	| `[AdaptiveLoadBalancingPool](#%3Cinit%3E(akka.cluster.metrics.MetricsSelector,int,akka.actor.SupervisorStrategy,java.lang.String,boolean))​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,  int nrOfInstances,  [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `[AdaptiveLoadBalancingPool](#%3Cinit%3E(com.typesafe.config.Config,akka.actor.DynamicAccess))​(com.typesafe.config.Config config,  [DynamicAccess](../../actor/DynamicAccess.html "class in akka.actor") dynamicAccess)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `static int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor")` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static java.lang.String` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `static boolean` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `static [AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")` | `[apply](#apply(akka.cluster.metrics.MetricsSelector,int,akka.actor.SupervisorStrategy,java.lang.String,boolean))​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,  int nrOfInstances,  [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `static [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[apply$default$1](#apply$default$1())()` |  |
	| `static int` | `[apply$default$2](#apply$default$2())()` |  |
	| `static [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor")` | `[apply$default$3](#apply$default$3())()` |  |
	| `static java.lang.String` | `[apply$default$4](#apply$default$4())()` |  |
	| `static boolean` | `[apply$default$5](#apply$default$5())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")` | `[copy](#copy(akka.cluster.metrics.MetricsSelector,int,akka.actor.SupervisorStrategy,java.lang.String,boolean))​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,  int nrOfInstances,  [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[copy$default$1](#copy$default$1())()` |  |
	| `int` | `[copy$default$2](#copy$default$2())()` |  |
	| `[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor")` | `[copy$default$3](#copy$default$3())()` |  |
	| `java.lang.String` | `[copy$default$4](#copy$default$4())()` |  |
	| `boolean` | `[copy$default$5](#copy$default$5())()` |  |
	| `[Router](../../routing/Router.html "class in akka.routing")` | `[createRouter](#createRouter(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Create the actual router, responsible for routing messages to routees. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[metricsSelector](#metricsSelector())()` |  |
	| `int` | `[nrOfInstances](#nrOfInstances())()` |  |
	| `int` | `[nrOfInstances](#nrOfInstances(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") sys)` | Initial number of routee instances |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.Option<[Resizer](../../routing/Resizer.html "interface in akka.routing")>` | `[resizer](#resizer())()` | Pool with dynamically resizable number of routees return the [`Resizer`](../../routing/Resizer.html "interface in akka.routing")  to use. |
	| `java.lang.String` | `[routerDispatcher](#routerDispatcher())()` | Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles  supervision, death watch and router management messages |
	| `scala.Option<[Props](../../actor/Props.html "class in akka.actor")>` | `[routingLogicController](#routingLogicController(akka.routing.RoutingLogic))​([RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing") routingLogic)` | Possibility to define an actor for controlling the routing  logic from external stimuli (e.g. |
	| `[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor")` | `[supervisorStrategy](#supervisorStrategy())()` | SupervisorStrategy for the head actor, i.e. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple5<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​java.lang.Object,​[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.metrics.AdaptiveLoadBalancingPool))​([AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") x$0)` |  |
	| `boolean` | `[usePoolDispatcher](#usePoolDispatcher())()` | Use a dedicated dispatcher for the routees of the pool. |
	| `[AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")` | `[withDispatcher](#withDispatcher(java.lang.String))​(java.lang.String dispatcherId)` | Setting the dispatcher to be used for the router head actor, which handles  supervision, death watch and router management messages. |
	| `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")` | `[withFallback](#withFallback(akka.routing.RouterConfig))​([RouterConfig](../../routing/RouterConfig.html "interface in akka.routing") other)` | Uses the supervisor strategy of the given RouterConfig  if this RouterConfig doesn't have one |
	| `[AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")` | `[withSupervisorStrategy](#withSupervisorStrategy(akka.actor.SupervisorStrategy))​([SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") strategy)` | Setting the supervisor strategy to be used for the \&ldquo;head\&rdquo; Router actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.routing.[Pool](../../routing/Pool.html "interface in akka.routing")
		
		
		`[createRouterActor](../../routing/Pool.html#createRouterActor()), [enrichWithPoolDispatcher](../../routing/Pool.html#enrichWithPoolDispatcher(akka.actor.Props,akka.actor.ActorContext)), [newRoutee](../../routing/Pool.html#newRoutee(akka.actor.Props,akka.actor.ActorContext)), [props](../../routing/Pool.html#props(akka.actor.Props)), [stopRouterWhenAllRouteesRemoved](../../routing/Pool.html#stopRouterWhenAllRouteesRemoved())`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.routing.[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")
		
		
		`[isManagementMessage](../../routing/RouterConfig.html#isManagementMessage(java.lang.Object)), [verifyConfig](../../routing/RouterConfig.html#verifyConfig(akka.actor.ActorPath))`

- - ### Constructor Detail
	
	
	
		- #### AdaptiveLoadBalancingPool
		
		
		
		```
		public AdaptiveLoadBalancingPool​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,
		                                 int nrOfInstances,
		                                 [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                                 java.lang.String routerDispatcher,
		                                 boolean usePoolDispatcher)
		```
		- #### AdaptiveLoadBalancingPool
		
		
		
		```
		public AdaptiveLoadBalancingPool​(com.typesafe.config.Config config,
		                                 [DynamicAccess](../../actor/DynamicAccess.html "class in akka.actor") dynamicAccess)
		```
		- #### AdaptiveLoadBalancingPool
		
		
		
		```
		public AdaptiveLoadBalancingPool​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,
		                                 int nr)
		```
		
		Java API
		
		Parameters:
		`metricsSelector` \- decides what probability to use for selecting a routee, based
		 on remaining capacity as indicated by the node metrics
		`nr` \- initial number of routees in the pool

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public static [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static int $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") $lessinit$greater$default$3()
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
		public static [AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") apply​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,
		                                              int nrOfInstances,
		                                              [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                                              java.lang.String routerDispatcher,
		                                              boolean usePoolDispatcher)
		```
		- #### apply$default$1
		
		
		
		```
		public static [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public static int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") apply$default$3()
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
		public static scala.Option<scala.Tuple5<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​java.lang.Object,​[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>> unapply​([AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") x$0)
		```
		- #### metricsSelector
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector()
		```
		- #### nrOfInstances
		
		
		
		```
		public int nrOfInstances()
		```
		- #### supervisorStrategy
		
		
		
		```
		public [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy()
		```
		
		Description copied from interface: `[Pool](../../routing/Pool.html#supervisorStrategy())`
		SupervisorStrategy for the head actor, i.e. for supervising the routees of the pool.
		
		Specified by:
		`[supervisorStrategy](../../routing/Pool.html#supervisorStrategy())` in interface `[Pool](../../routing/Pool.html "interface in akka.routing")`
		- #### routerDispatcher
		
		
		
		```
		public java.lang.String routerDispatcher()
		```
		
		Description copied from interface: `[RouterConfig](../../routing/RouterConfig.html#routerDispatcher())`
		Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles
		 supervision, death watch and router management messages
		
		Specified by:
		`[routerDispatcher](../../routing/RouterConfig.html#routerDispatcher())` in interface `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`
		- #### usePoolDispatcher
		
		
		
		```
		public boolean usePoolDispatcher()
		```
		
		Description copied from interface: `[Pool](../../routing/Pool.html#usePoolDispatcher())`
		Use a dedicated dispatcher for the routees of the pool.
		 The dispatcher is defined in 'pool\-dispatcher' configuration property in the
		 deployment section of the router.
		
		Specified by:
		`[usePoolDispatcher](../../routing/Pool.html#usePoolDispatcher())` in interface `[Pool](../../routing/Pool.html "interface in akka.routing")`
		- #### resizer
		
		
		
		```
		public scala.Option<[Resizer](../../routing/Resizer.html "interface in akka.routing")> resizer()
		```
		
		Description copied from interface: `[Pool](../../routing/Pool.html#resizer())`
		Pool with dynamically resizable number of routees return the [`Resizer`](../../routing/Resizer.html "interface in akka.routing")
		 to use. The resizer is invoked once when the router is created, before any messages can
		 be sent to it. Resize is also triggered when messages are sent to the routees, and the
		 resizer is invoked asynchronously, i.e. not necessarily before the message has been sent.
		
		Specified by:
		`[resizer](../../routing/Pool.html#resizer())` in interface `[Pool](../../routing/Pool.html "interface in akka.routing")`
		- #### nrOfInstances
		
		
		
		```
		public int nrOfInstances​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") sys)
		```
		
		Description copied from interface: `[Pool](../../routing/Pool.html#nrOfInstances(akka.actor.ActorSystem))`
		Initial number of routee instances
		
		Specified by:
		`[nrOfInstances](../../routing/Pool.html#nrOfInstances(akka.actor.ActorSystem))` in interface `[Pool](../../routing/Pool.html "interface in akka.routing")`
		- #### createRouter
		
		
		
		```
		public [Router](../../routing/Router.html "class in akka.routing") createRouter​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[RouterConfig](../../routing/RouterConfig.html#createRouter(akka.actor.ActorSystem))`
		Create the actual router, responsible for routing messages to routees.
		 
		
		Specified by:
		`[createRouter](../../routing/RouterConfig.html#createRouter(akka.actor.ActorSystem))` in interface `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`
		Parameters:
		`system` \- the ActorSystem this router belongs to
		- #### routingLogicController
		
		
		
		```
		public scala.Option<[Props](../../actor/Props.html "class in akka.actor")> routingLogicController​([RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing") routingLogic)
		```
		
		Description copied from interface: `[RouterConfig](../../routing/RouterConfig.html#routingLogicController(akka.routing.RoutingLogic))`
		Possibility to define an actor for controlling the routing
		 logic from external stimuli (e.g. monitoring metrics).
		 This actor will be a child of the router "head" actor.
		 Management messages not handled by the "head" actor are
		 delegated to this controller actor.
		
		Specified by:
		`[routingLogicController](../../routing/RouterConfig.html#routingLogicController(akka.routing.RoutingLogic))` in interface `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`
		- #### withSupervisorStrategy
		
		
		
		```
		public [AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") withSupervisorStrategy​([SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") strategy)
		```
		
		Setting the supervisor strategy to be used for the \&ldquo;head\&rdquo; Router actor.
		- #### withDispatcher
		
		
		
		```
		public [AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") withDispatcher​(java.lang.String dispatcherId)
		```
		
		Setting the dispatcher to be used for the router head actor, which handles
		 supervision, death watch and router management messages.
		- #### withFallback
		
		
		
		```
		public [RouterConfig](../../routing/RouterConfig.html "interface in akka.routing") withFallback​([RouterConfig](../../routing/RouterConfig.html "interface in akka.routing") other)
		```
		
		Uses the supervisor strategy of the given RouterConfig
		 if this RouterConfig doesn't have one
		
		Specified by:
		`[withFallback](../../routing/RouterConfig.html#withFallback(akka.routing.RouterConfig))` in interface `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`
		- #### copy
		
		
		
		```
		public [AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") copy​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,
		                                      int nrOfInstances,
		                                      [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                                      java.lang.String routerDispatcher,
		                                      boolean usePoolDispatcher)
		```
		- #### copy$default$1
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public int copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") copy$default$3()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Pool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool.html)*