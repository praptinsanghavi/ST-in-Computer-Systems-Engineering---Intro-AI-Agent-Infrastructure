---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html
title: AdaptiveLoadBalancingGroup
---

# AdaptiveLoadBalancingGroup

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class AdaptiveLoadBalancingGroup

- java.lang.Object
- - akka.cluster.metrics.AdaptiveLoadBalancingGroup

- All Implemented Interfaces:
`[Group](../../routing/Group.html "interface in akka.routing")`, `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class AdaptiveLoadBalancingGroup
extends java.lang.Object
implements [Group](../../routing/Group.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

A router group that performs load balancing of messages to cluster nodes based on
 cluster metric data.
 
 It uses random selection of routees based on probabilities derived from
 the remaining capacity of corresponding node.
 

 The configuration parameter trumps the constructor arguments. This means that
 if you provide `paths` during instantiation they will be ignored if
 the router is defined in the configuration file for the actor being used.
 

 param: metricsSelector decides what probability to use for selecting a routee, based
 on remaining capacity as indicated by the node metrics
 

 param: paths string representation of the actor paths of the routees, messages are
 sent with [`ActorSelection`](../../actor/ActorSelection.html "class in akka.actor") to these paths
 

 param: routerDispatcher dispatcher to use for the router head actor, which handles
 router management messages

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.AdaptiveLoadBalancingGroup)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AdaptiveLoadBalancingGroup](#%3Cinit%3E(akka.cluster.metrics.MetricsSelector,java.lang.Iterable))​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,  java.lang.Iterable<java.lang.String> routeesPaths)` | Java API |
	| `[AdaptiveLoadBalancingGroup](#%3Cinit%3E(akka.cluster.metrics.MetricsSelector,scala.collection.immutable.Iterable,java.lang.String))​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,  scala.collection.immutable.Iterable<java.lang.String> paths,  java.lang.String routerDispatcher)` |  |
	| `[AdaptiveLoadBalancingGroup](#%3Cinit%3E(com.typesafe.config.Config,akka.actor.DynamicAccess))​(com.typesafe.config.Config config,  [DynamicAccess](../../actor/DynamicAccess.html "class in akka.actor") dynamicAccess)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `static scala.collection.immutable.Iterable<java.lang.String>` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static java.lang.String` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static [AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")` | `[apply](#apply(akka.cluster.metrics.MetricsSelector,scala.collection.immutable.Iterable,java.lang.String))​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,  scala.collection.immutable.Iterable<java.lang.String> paths,  java.lang.String routerDispatcher)` |  |
	| `static [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[apply$default$1](#apply$default$1())()` |  |
	| `static scala.collection.immutable.Iterable<java.lang.String>` | `[apply$default$2](#apply$default$2())()` |  |
	| `static java.lang.String` | `[apply$default$3](#apply$default$3())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")` | `[copy](#copy(akka.cluster.metrics.MetricsSelector,scala.collection.immutable.Iterable,java.lang.String))​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,  scala.collection.immutable.Iterable<java.lang.String> paths,  java.lang.String routerDispatcher)` |  |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[copy$default$2](#copy$default$2())()` |  |
	| `java.lang.String` | `[copy$default$3](#copy$default$3())()` |  |
	| `[Router](../../routing/Router.html "class in akka.routing")` | `[createRouter](#createRouter(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Create the actual router, responsible for routing messages to routees. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[metricsSelector](#metricsSelector())()` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[paths](#paths())()` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[paths](#paths(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[routerDispatcher](#routerDispatcher())()` | Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles  supervision, death watch and router management messages |
	| `scala.Option<[Props](../../actor/Props.html "class in akka.actor")>` | `[routingLogicController](#routingLogicController(akka.routing.RoutingLogic))​([RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing") routingLogic)` | Possibility to define an actor for controlling the routing  logic from external stimuli (e.g. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​scala.collection.immutable.Iterable<java.lang.String>,​java.lang.String>>` | `[unapply](#unapply(akka.cluster.metrics.AdaptiveLoadBalancingGroup))​([AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics") x$0)` |  |
	| `[AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")` | `[withDispatcher](#withDispatcher(java.lang.String))​(java.lang.String dispatcherId)` | Setting the dispatcher to be used for the router head actor, which handles  router management messages |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.routing.[Group](../../routing/Group.html "interface in akka.routing")
		
		
		`[createRouterActor](../../routing/Group.html#createRouterActor()), [props](../../routing/Group.html#props()), [routeeFor](../../routing/Group.html#routeeFor(java.lang.String,akka.actor.ActorContext))`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.routing.[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")
		
		
		`[isManagementMessage](../../routing/RouterConfig.html#isManagementMessage(java.lang.Object)), [stopRouterWhenAllRouteesRemoved](../../routing/RouterConfig.html#stopRouterWhenAllRouteesRemoved()), [verifyConfig](../../routing/RouterConfig.html#verifyConfig(akka.actor.ActorPath)), [withFallback](../../routing/RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Constructor Detail
	
	
	
		- #### AdaptiveLoadBalancingGroup
		
		
		
		```
		public AdaptiveLoadBalancingGroup​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,
		                                  scala.collection.immutable.Iterable<java.lang.String> paths,
		                                  java.lang.String routerDispatcher)
		```
		- #### AdaptiveLoadBalancingGroup
		
		
		
		```
		public AdaptiveLoadBalancingGroup​(com.typesafe.config.Config config,
		                                  [DynamicAccess](../../actor/DynamicAccess.html "class in akka.actor") dynamicAccess)
		```
		- #### AdaptiveLoadBalancingGroup
		
		
		
		```
		public AdaptiveLoadBalancingGroup​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,
		                                  java.lang.Iterable<java.lang.String> routeesPaths)
		```
		
		Java API
		
		Parameters:
		`metricsSelector` \- decides what probability to use for selecting a routee, based
		 on remaining capacity as indicated by the node metrics
		`routeesPaths` \- string representation of the actor paths of the routees, messages are
		 sent with [`ActorSelection`](../../actor/ActorSelection.html "class in akka.actor") to these paths

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public static [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static scala.collection.immutable.Iterable<java.lang.String> $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static java.lang.String $lessinit$greater$default$3()
		```
		- #### apply
		
		
		
		```
		public static [AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics") apply​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,
		                                               scala.collection.immutable.Iterable<java.lang.String> paths,
		                                               java.lang.String routerDispatcher)
		```
		- #### apply$default$1
		
		
		
		```
		public static [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public static scala.collection.immutable.Iterable<java.lang.String> apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static java.lang.String apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​scala.collection.immutable.Iterable<java.lang.String>,​java.lang.String>> unapply​([AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics") x$0)
		```
		- #### metricsSelector
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector()
		```
		- #### paths
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> paths()
		```
		- #### routerDispatcher
		
		
		
		```
		public java.lang.String routerDispatcher()
		```
		
		Description copied from interface: `[RouterConfig](../../routing/RouterConfig.html#routerDispatcher())`
		Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles
		 supervision, death watch and router management messages
		
		Specified by:
		`[routerDispatcher](../../routing/RouterConfig.html#routerDispatcher())` in interface `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`
		- #### paths
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> paths​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		
		Specified by:
		`[paths](../../routing/Group.html#paths(akka.actor.ActorSystem))` in interface `[Group](../../routing/Group.html "interface in akka.routing")`
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
		- #### withDispatcher
		
		
		
		```
		public [AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics") withDispatcher​(java.lang.String dispatcherId)
		```
		
		Setting the dispatcher to be used for the router head actor, which handles
		 router management messages
		- #### copy
		
		
		
		```
		public [AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics") copy​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,
		                                       scala.collection.immutable.Iterable<java.lang.String> paths,
		                                       java.lang.String routerDispatcher)
		```
		- #### copy$default$1
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public java.lang.String copy$default$3()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Group.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html)*