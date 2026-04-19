---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/FromConfig$.html
title: FromConfig$
---

# FromConfig$

## Content

Package [akka.routing](package-summary.html)
## Class FromConfig$

- java.lang.Object
- - [akka.routing.FromConfig](FromConfig.html "class in akka.routing")
	- - akka.routing.FromConfig$

- All Implemented Interfaces:
`[Pool](Pool.html "interface in akka.routing")`, `[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class FromConfig$
extends [FromConfig](FromConfig.html "class in akka.routing")
implements scala.Product, java.io.Serializable
```

Wraps a [`Props`](../actor/Props.html "class in akka.actor") to mark the actor as externally configurable to be used with a router.
 If a [`Props`](../actor/Props.html "class in akka.actor") is not wrapped with [`FromConfig`](FromConfig.html "class in akka.routing") then the actor will ignore the router part of the deployment section
 in the configuration.

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.FromConfig$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FromConfig$](FromConfig$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FromConfig$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[FromConfig](FromConfig.html "class in akka.routing")` | `[apply](#apply(scala.Option,akka.actor.SupervisorStrategy,java.lang.String))​(scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher)` |  |
	| `scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[apply$default$1](#apply$default$1())()` |  |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[apply$default$2](#apply$default$2())()` |  |
	| `java.lang.String` | `[apply$default$3](#apply$default$3())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[FromConfig$](FromConfig$.html "class in akka.routing")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.String>` | `[unapply](#unapply(akka.routing.FromConfig))​([FromConfig](FromConfig.html "class in akka.routing") fc)` |  |
	
	
		- ### Methods inherited from class akka.routing.[FromConfig](FromConfig.html "class in akka.routing")
		
		
		`[createRouter](FromConfig.html#createRouter(akka.actor.ActorSystem)), [equals](FromConfig.html#equals(java.lang.Object)), [isManagementMessage](FromConfig.html#isManagementMessage(java.lang.Object)), [nrOfInstances](FromConfig.html#nrOfInstances(akka.actor.ActorSystem)), [productElementName](FromConfig.html#productElementName(int)), [productElementNames](FromConfig.html#productElementNames()), [props](FromConfig.html#props()), [resizer](FromConfig.html#resizer()), [routerDispatcher](FromConfig.html#routerDispatcher()), [routingLogicController](FromConfig.html#routingLogicController(akka.routing.RoutingLogic)), [stopRouterWhenAllRouteesRemoved](FromConfig.html#stopRouterWhenAllRouteesRemoved()), [supervisorStrategy](FromConfig.html#supervisorStrategy()), [usePoolDispatcher](FromConfig.html#usePoolDispatcher()), [verifyConfig](FromConfig.html#verifyConfig(akka.actor.ActorPath)), [withDispatcher](FromConfig.html#withDispatcher(java.lang.String)), [withFallback](FromConfig.html#withFallback(akka.routing.RouterConfig)), [withResizer](FromConfig.html#withResizer(akka.routing.Resizer)), [withSupervisorStrategy](FromConfig.html#withSupervisorStrategy(akka.actor.SupervisorStrategy))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface akka.routing.[Pool](Pool.html "interface in akka.routing")
		
		
		`[enrichWithPoolDispatcher](Pool.html#enrichWithPoolDispatcher(akka.actor.Props,akka.actor.ActorContext)), [newRoutee](Pool.html#newRoutee(akka.actor.Props,akka.actor.ActorContext)), [props](Pool.html#props(akka.actor.Props)), [stopRouterWhenAllRouteesRemoved](Pool.html#stopRouterWhenAllRouteesRemoved()), [usePoolDispatcher](Pool.html#usePoolDispatcher())`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`
		- ### Methods inherited from interface akka.routing.[RouterConfig](RouterConfig.html "interface in akka.routing")
		
		
		`[isManagementMessage](RouterConfig.html#isManagementMessage(java.lang.Object)), [routingLogicController](RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [withFallback](RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FromConfig$](FromConfig$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FromConfig$
		
		
		
		```
		public FromConfig$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [FromConfig$](FromConfig$.html "class in akka.routing") getInstance()
		```
		
		Java API: get the singleton instance
		
		Overrides:
		`[getInstance](FromConfig.html#getInstance())` in class `[FromConfig](FromConfig.html "class in akka.routing")`
		- #### apply
		
		
		
		```
		public final [FromConfig](FromConfig.html "class in akka.routing") apply​(scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,
		                              [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                              java.lang.String routerDispatcher)
		```
		
		
		Overrides:
		`[apply](FromConfig.html#apply(scala.Option,akka.actor.SupervisorStrategy,java.lang.String))` in class `[FromConfig](FromConfig.html "class in akka.routing")`
		- #### apply$default$1
		
		
		
		```
		public final scala.Option<[Resizer](Resizer.html "interface in akka.routing")> apply$default$1()
		```
		
		
		Overrides:
		`[apply$default$1](FromConfig.html#apply$default$1())` in class `[FromConfig](FromConfig.html "class in akka.routing")`
		- #### apply$default$2
		
		
		
		```
		public final [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") apply$default$2()
		```
		
		
		Overrides:
		`[apply$default$2](FromConfig.html#apply$default$2())` in class `[FromConfig](FromConfig.html "class in akka.routing")`
		- #### apply$default$3
		
		
		
		```
		public final java.lang.String apply$default$3()
		```
		
		
		Overrides:
		`[apply$default$3](FromConfig.html#apply$default$3())` in class `[FromConfig](FromConfig.html "class in akka.routing")`
		- #### unapply
		
		
		
		```
		public final scala.Option<java.lang.String> unapply​([FromConfig](FromConfig.html "class in akka.routing") fc)
		```
		
		
		Overrides:
		`[unapply](FromConfig.html#unapply(akka.routing.FromConfig))` in class `[FromConfig](FromConfig.html "class in akka.routing")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](FromConfig.html#productPrefix())` in class `[FromConfig](FromConfig.html "class in akka.routing")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](FromConfig.html#productArity())` in class `[FromConfig](FromConfig.html "class in akka.routing")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](FromConfig.html#productElement(int))` in class `[FromConfig](FromConfig.html "class in akka.routing")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](FromConfig.html#productIterator())` in class `[FromConfig](FromConfig.html "class in akka.routing")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](FromConfig.html#canEqual(java.lang.Object))` in class `[FromConfig](FromConfig.html "class in akka.routing")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](FromConfig.html#hashCode())` in class `[FromConfig](FromConfig.html "class in akka.routing")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](FromConfig.html#toString())` in class `[FromConfig](FromConfig.html "class in akka.routing")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/FromConfig$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/FromConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Pool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/FromConfig$.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/FromConfig$.html)*