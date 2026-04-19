---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:05:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterPool.html
title: ClusterRouterPool
---

# ClusterRouterPool

## Content

Package [akka.cluster.routing](package-summary.html)
## Class ClusterRouterPool

- java.lang.Object
- - akka.cluster.routing.ClusterRouterPool

- All Implemented Interfaces:
`[ClusterRouterConfigBase](ClusterRouterConfigBase.html "interface in akka.cluster.routing")`, `[Pool](../../routing/Pool.html "interface in akka.routing")`, `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ClusterRouterPool
extends java.lang.Object
implements [Pool](../../routing/Pool.html "interface in akka.routing"), [ClusterRouterConfigBase](ClusterRouterConfigBase.html "interface in akka.cluster.routing"), scala.Product, java.io.Serializable
```

[`RouterConfig`](../../routing/RouterConfig.html "interface in akka.routing") implementation for deployment on cluster nodes.
 Delegates other duties to the local [`RouterConfig`](../../routing/RouterConfig.html "interface in akka.routing"),
 which makes it possible to mix this with the built\-in routers such as
 [`RoundRobinGroup`](../../routing/RoundRobinGroup.html "class in akka.routing") or custom routers.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.routing.ClusterRouterPool)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterRouterPool](#%3Cinit%3E(akka.routing.Pool,akka.cluster.routing.ClusterRouterPoolSettings))​([Pool](../../routing/Pool.html "interface in akka.routing") local,  [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing")` | `[apply](#apply(akka.routing.Pool,akka.cluster.routing.ClusterRouterPoolSettings))​([Pool](../../routing/Pool.html "interface in akka.routing") local,  [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing")` | `[copy](#copy(akka.routing.Pool,akka.cluster.routing.ClusterRouterPoolSettings))​([Pool](../../routing/Pool.html "interface in akka.routing") local,  [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings)` |  |
	| `[Pool](../../routing/Pool.html "interface in akka.routing")` | `[copy$default$1](#copy$default$1())()` |  |
	| `[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[Pool](../../routing/Pool.html "interface in akka.routing")` | `[local](#local())()` |  |
	| `int` | `[nrOfInstances](#nrOfInstances(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") sys)` | Initial number of routee instances |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.Option<[Resizer](../../routing/Resizer.html "interface in akka.routing")>` | `[resizer](#resizer())()` | Pool with dynamically resizable number of routees return the [`Resizer`](../../routing/Resizer.html "interface in akka.routing")  to use. |
	| `[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[settings](#settings())()` |  |
	| `[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor")` | `[supervisorStrategy](#supervisorStrategy())()` | SupervisorStrategy for the head actor, i.e. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[Pool](../../routing/Pool.html "interface in akka.routing"),​[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")>>` | `[unapply](#unapply(akka.cluster.routing.ClusterRouterPool))​([ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing") x$0)` |  |
	| `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")` | `[withFallback](#withFallback(akka.routing.RouterConfig))​([RouterConfig](../../routing/RouterConfig.html "interface in akka.routing") other)` | Overridable merge strategy, by default completely prefers `this` (i.e. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.cluster.routing.[ClusterRouterConfigBase](ClusterRouterConfigBase.html "interface in akka.cluster.routing")
		
		
		`[createRouter](ClusterRouterConfigBase.html#createRouter(akka.actor.ActorSystem)), [isManagementMessage](ClusterRouterConfigBase.html#isManagementMessage(java.lang.Object)), [routerDispatcher](ClusterRouterConfigBase.html#routerDispatcher()), [routingLogicController](ClusterRouterConfigBase.html#routingLogicController(akka.routing.RoutingLogic)), [stopRouterWhenAllRouteesRemoved](ClusterRouterConfigBase.html#stopRouterWhenAllRouteesRemoved()), [super$isManagementMessage](ClusterRouterConfigBase.html#super$isManagementMessage(java.lang.Object))`
		- ### Methods inherited from interface akka.routing.[Pool](../../routing/Pool.html "interface in akka.routing")
		
		
		`[enrichWithPoolDispatcher](../../routing/Pool.html#enrichWithPoolDispatcher(akka.actor.Props,akka.actor.ActorContext)), [props](../../routing/Pool.html#props(akka.actor.Props)), [stopRouterWhenAllRouteesRemoved](../../routing/Pool.html#stopRouterWhenAllRouteesRemoved()), [usePoolDispatcher](../../routing/Pool.html#usePoolDispatcher())`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.routing.[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")
		
		
		`[verifyConfig](../../routing/RouterConfig.html#verifyConfig(akka.actor.ActorPath))`

- - ### Constructor Detail
	
	
	
		- #### ClusterRouterPool
		
		
		
		```
		public ClusterRouterPool​([Pool](../../routing/Pool.html "interface in akka.routing") local,
		                         [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing") apply​([Pool](../../routing/Pool.html "interface in akka.routing") local,
		                                      [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[Pool](../../routing/Pool.html "interface in akka.routing"),​[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")>> unapply​([ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing") x$0)
		```
		- #### local
		
		
		
		```
		public [Pool](../../routing/Pool.html "interface in akka.routing") local()
		```
		
		
		Specified by:
		`[local](ClusterRouterConfigBase.html#local())` in interface `[ClusterRouterConfigBase](ClusterRouterConfigBase.html "interface in akka.cluster.routing")`
		- #### settings
		
		
		
		```
		public [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings()
		```
		
		
		Specified by:
		`[settings](ClusterRouterConfigBase.html#settings())` in interface `[ClusterRouterConfigBase](ClusterRouterConfigBase.html "interface in akka.cluster.routing")`
		- #### nrOfInstances
		
		
		
		```
		public int nrOfInstances​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") sys)
		```
		
		Initial number of routee instances
		
		Specified by:
		`[nrOfInstances](../../routing/Pool.html#nrOfInstances(akka.actor.ActorSystem))` in interface `[Pool](../../routing/Pool.html "interface in akka.routing")`
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
		- #### supervisorStrategy
		
		
		
		```
		public [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy()
		```
		
		Description copied from interface: `[Pool](../../routing/Pool.html#supervisorStrategy())`
		SupervisorStrategy for the head actor, i.e. for supervising the routees of the pool.
		
		Specified by:
		`[supervisorStrategy](../../routing/Pool.html#supervisorStrategy())` in interface `[Pool](../../routing/Pool.html "interface in akka.routing")`
		- #### withFallback
		
		
		
		```
		public [RouterConfig](../../routing/RouterConfig.html "interface in akka.routing") withFallback​([RouterConfig](../../routing/RouterConfig.html "interface in akka.routing") other)
		```
		
		Description copied from interface: `[RouterConfig](../../routing/RouterConfig.html#withFallback(akka.routing.RouterConfig))`
		Overridable merge strategy, by default completely prefers `this` (i.e. no merge).
		
		Specified by:
		`[withFallback](../../routing/RouterConfig.html#withFallback(akka.routing.RouterConfig))` in interface `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`
		- #### copy
		
		
		
		```
		public [ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing") copy​([Pool](../../routing/Pool.html "interface in akka.routing") local,
		                              [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings)
		```
		- #### copy$default$1
		
		
		
		```
		public [Pool](../../routing/Pool.html "interface in akka.routing") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") copy$default$2()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterConfigBase.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterPool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterPoolSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Pool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoundRobinGroup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterPool.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterPool.html)*