---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:05:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterGroup.html
title: ClusterRouterGroup
---

# ClusterRouterGroup

## Content

Package [akka.cluster.routing](package-summary.html)
## Class ClusterRouterGroup

- java.lang.Object
- - akka.cluster.routing.ClusterRouterGroup

- All Implemented Interfaces:
`[ClusterRouterConfigBase](ClusterRouterConfigBase.html "interface in akka.cluster.routing")`, `[Group](../../routing/Group.html "interface in akka.routing")`, `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ClusterRouterGroup
extends java.lang.Object
implements [Group](../../routing/Group.html "interface in akka.routing"), [ClusterRouterConfigBase](ClusterRouterConfigBase.html "interface in akka.cluster.routing"), scala.Product, java.io.Serializable
```

[`RouterConfig`](../../routing/RouterConfig.html "interface in akka.routing") implementation for deployment on cluster nodes.
 Delegates other duties to the local [`RouterConfig`](../../routing/RouterConfig.html "interface in akka.routing"),
 which makes it possible to mix this with the built\-in routers such as
 [`RoundRobinGroup`](../../routing/RoundRobinGroup.html "class in akka.routing") or custom routers.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.routing.ClusterRouterGroup)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterRouterGroup](#%3Cinit%3E(akka.routing.Group,akka.cluster.routing.ClusterRouterGroupSettings))​([Group](../../routing/Group.html "interface in akka.routing") local,  [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") settings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing")` | `[apply](#apply(akka.routing.Group,akka.cluster.routing.ClusterRouterGroupSettings))​([Group](../../routing/Group.html "interface in akka.routing") local,  [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") settings)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing")` | `[copy](#copy(akka.routing.Group,akka.cluster.routing.ClusterRouterGroupSettings))​([Group](../../routing/Group.html "interface in akka.routing") local,  [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") settings)` |  |
	| `[Group](../../routing/Group.html "interface in akka.routing")` | `[copy$default$1](#copy$default$1())()` |  |
	| `[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing")` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[Group](../../routing/Group.html "interface in akka.routing")` | `[local](#local())()` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[paths](#paths(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing")` | `[settings](#settings())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[Group](../../routing/Group.html "interface in akka.routing"),​[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing")>>` | `[unapply](#unapply(akka.cluster.routing.ClusterRouterGroup))​([ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing") x$0)` |  |
	| `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")` | `[withFallback](#withFallback(akka.routing.RouterConfig))​([RouterConfig](../../routing/RouterConfig.html "interface in akka.routing") other)` | Overridable merge strategy, by default completely prefers `this` (i.e. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.cluster.routing.[ClusterRouterConfigBase](ClusterRouterConfigBase.html "interface in akka.cluster.routing")
		
		
		`[createRouter](ClusterRouterConfigBase.html#createRouter(akka.actor.ActorSystem)), [isManagementMessage](ClusterRouterConfigBase.html#isManagementMessage(java.lang.Object)), [routerDispatcher](ClusterRouterConfigBase.html#routerDispatcher()), [routingLogicController](ClusterRouterConfigBase.html#routingLogicController(akka.routing.RoutingLogic)), [stopRouterWhenAllRouteesRemoved](ClusterRouterConfigBase.html#stopRouterWhenAllRouteesRemoved()), [super$isManagementMessage](ClusterRouterConfigBase.html#super$isManagementMessage(java.lang.Object))`
		- ### Methods inherited from interface akka.routing.[Group](../../routing/Group.html "interface in akka.routing")
		
		
		`[props](../../routing/Group.html#props()), [routeeFor](../../routing/Group.html#routeeFor(java.lang.String,akka.actor.ActorContext))`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.routing.[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")
		
		
		`[verifyConfig](../../routing/RouterConfig.html#verifyConfig(akka.actor.ActorPath))`

- - ### Constructor Detail
	
	
	
		- #### ClusterRouterGroup
		
		
		
		```
		public ClusterRouterGroup​([Group](../../routing/Group.html "interface in akka.routing") local,
		                          [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") settings)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing") apply​([Group](../../routing/Group.html "interface in akka.routing") local,
		                                       [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") settings)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[Group](../../routing/Group.html "interface in akka.routing"),​[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing")>> unapply​([ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing") x$0)
		```
		- #### local
		
		
		
		```
		public [Group](../../routing/Group.html "interface in akka.routing") local()
		```
		
		
		Specified by:
		`[local](ClusterRouterConfigBase.html#local())` in interface `[ClusterRouterConfigBase](ClusterRouterConfigBase.html "interface in akka.cluster.routing")`
		- #### settings
		
		
		
		```
		public [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") settings()
		```
		
		
		Specified by:
		`[settings](ClusterRouterConfigBase.html#settings())` in interface `[ClusterRouterConfigBase](ClusterRouterConfigBase.html "interface in akka.cluster.routing")`
		- #### paths
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> paths​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		
		Specified by:
		`[paths](../../routing/Group.html#paths(akka.actor.ActorSystem))` in interface `[Group](../../routing/Group.html "interface in akka.routing")`
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
		public [ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing") copy​([Group](../../routing/Group.html "interface in akka.routing") local,
		                               [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") settings)
		```
		- #### copy$default$1
		
		
		
		```
		public [Group](../../routing/Group.html "interface in akka.routing") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") copy$default$2()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterConfigBase.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterGroup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterGroupSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Group.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoundRobinGroup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterGroup.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterGroup.html)*