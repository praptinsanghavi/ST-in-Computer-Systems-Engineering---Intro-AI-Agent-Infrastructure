---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/NoRouter$.html
title: NoRouter$
---

# NoRouter$

## Content

Package [akka.routing](package-summary.html)
## Class NoRouter$

- java.lang.Object
- - [akka.routing.NoRouter](NoRouter.html "class in akka.routing")
	- - akka.routing.NoRouter$

- All Implemented Interfaces:
`[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class NoRouter$
extends [NoRouter](NoRouter.html "class in akka.routing")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.NoRouter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoRouter$](NoRouter$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoRouter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Router](Router.html "class in akka.routing")` | `[createRouter](#createRouter(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `[NoRouter$](NoRouter$.html "class in akka.routing")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props(akka.actor.Props))​([Props](../actor/Props.html "class in akka.actor") routeeProps)` |  |
	| `java.lang.String` | `[routerDispatcher](#routerDispatcher())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[RouterConfig](RouterConfig.html "interface in akka.routing")` | `[withFallback](#withFallback(akka.routing.RouterConfig))​([RouterConfig](RouterConfig.html "interface in akka.routing") other)` |  |
	
	
		- ### Methods inherited from class akka.routing.[NoRouter](NoRouter.html "class in akka.routing")
		
		
		`[equals](NoRouter.html#equals(java.lang.Object)), [isManagementMessage](NoRouter.html#isManagementMessage(java.lang.Object)), [productElementName](NoRouter.html#productElementName(int)), [productElementNames](NoRouter.html#productElementNames()), [routingLogicController](NoRouter.html#routingLogicController(akka.routing.RoutingLogic)), [stopRouterWhenAllRouteesRemoved](NoRouter.html#stopRouterWhenAllRouteesRemoved()), [verifyConfig](NoRouter.html#verifyConfig(akka.actor.ActorPath))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`
		- ### Methods inherited from interface akka.routing.[RouterConfig](RouterConfig.html "interface in akka.routing")
		
		
		`[createRouter](RouterConfig.html#createRouter(akka.actor.ActorSystem)), [createRouterActor](RouterConfig.html#createRouterActor()), [isManagementMessage](RouterConfig.html#isManagementMessage(java.lang.Object)), [routerDispatcher](RouterConfig.html#routerDispatcher()), [routingLogicController](RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [stopRouterWhenAllRouteesRemoved](RouterConfig.html#stopRouterWhenAllRouteesRemoved()), [verifyConfig](RouterConfig.html#verifyConfig(akka.actor.ActorPath)), [withFallback](RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoRouter$](NoRouter$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoRouter$
		
		
		
		```
		public NoRouter$()
		```

	- ### Method Detail
	
	
	
		- #### createRouter
		
		
		
		```
		public [Router](Router.html "class in akka.routing") createRouter​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		
		Overrides:
		`[createRouter](NoRouter.html#createRouter(akka.actor.ActorSystem))` in class `[NoRouter](NoRouter.html "class in akka.routing")`
		- #### routerDispatcher
		
		
		
		```
		public java.lang.String routerDispatcher()
		```
		
		
		Overrides:
		`[routerDispatcher](NoRouter.html#routerDispatcher())` in class `[NoRouter](NoRouter.html "class in akka.routing")`
		- #### withFallback
		
		
		
		```
		public [RouterConfig](RouterConfig.html "interface in akka.routing") withFallback​([RouterConfig](RouterConfig.html "interface in akka.routing") other)
		```
		
		
		Overrides:
		`[withFallback](NoRouter.html#withFallback(akka.routing.RouterConfig))` in class `[NoRouter](NoRouter.html "class in akka.routing")`
		- #### getInstance
		
		
		
		```
		public [NoRouter$](NoRouter$.html "class in akka.routing") getInstance()
		```
		
		Java API: get the singleton instance
		
		Overrides:
		`[getInstance](NoRouter.html#getInstance())` in class `[NoRouter](NoRouter.html "class in akka.routing")`
		- #### props
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") props​([Props](../actor/Props.html "class in akka.actor") routeeProps)
		```
		
		
		Overrides:
		`[props](NoRouter.html#props(akka.actor.Props))` in class `[NoRouter](NoRouter.html "class in akka.routing")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](NoRouter.html#productPrefix())` in class `[NoRouter](NoRouter.html "class in akka.routing")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](NoRouter.html#productArity())` in class `[NoRouter](NoRouter.html "class in akka.routing")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](NoRouter.html#productElement(int))` in class `[NoRouter](NoRouter.html "class in akka.routing")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](NoRouter.html#productIterator())` in class `[NoRouter](NoRouter.html "class in akka.routing")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](NoRouter.html#canEqual(java.lang.Object))` in class `[NoRouter](NoRouter.html "class in akka.routing")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](NoRouter.html#hashCode())` in class `[NoRouter](NoRouter.html "class in akka.routing")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](NoRouter.html#toString())` in class `[NoRouter](NoRouter.html "class in akka.routing")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/NoRouter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/NoRouter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/NoRouter$.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/NoRouter$.html)*