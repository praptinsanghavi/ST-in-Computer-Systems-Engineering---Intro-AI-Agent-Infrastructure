---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/NoRouter.html
title: NoRouter
---

# NoRouter

## Content

Package [akka.routing](package-summary.html)
## Class NoRouter

- java.lang.Object
- - akka.routing.NoRouter

- All Implemented Interfaces:
`[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`

Direct Known Subclasses:
`[NoRouter$](NoRouter$.html "class in akka.routing")`

---

```
public abstract class NoRouter
extends java.lang.Object
implements [RouterConfig](RouterConfig.html "interface in akka.routing")
```

Routing configuration that indicates no routing; this is also the default
 value which hence overrides the merge strategy in order to accept values
 from lower\-precedence sources. The decision whether or not to create a
 router is taken in the LocalActorRefProvider based on Props.

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.NoRouter)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoRouter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static [Router](Router.html "class in akka.routing")` | `[createRouter](#createRouter(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [NoRouter$](NoRouter$.html "class in akka.routing")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static boolean` | `[isManagementMessage](#isManagementMessage(java.lang.Object))​(java.lang.Object msg)` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static [Props](../actor/Props.html "class in akka.actor")` | `[props](#props(akka.actor.Props))​([Props](../actor/Props.html "class in akka.actor") routeeProps)` |  |
	| `static java.lang.String` | `[routerDispatcher](#routerDispatcher())()` |  |
	| `static scala.Option<[Props](../actor/Props.html "class in akka.actor")>` | `[routingLogicController](#routingLogicController(akka.routing.RoutingLogic))​([RoutingLogic](RoutingLogic.html "interface in akka.routing") routingLogic)` |  |
	| `static boolean` | `[stopRouterWhenAllRouteesRemoved](#stopRouterWhenAllRouteesRemoved())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static void` | `[verifyConfig](#verifyConfig(akka.actor.ActorPath))​([ActorPath](../actor/ActorPath.html "interface in akka.actor") path)` |  |
	| `static [RouterConfig](RouterConfig.html "interface in akka.routing")` | `[withFallback](#withFallback(akka.routing.RouterConfig))​([RouterConfig](RouterConfig.html "interface in akka.routing") other)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.routing.[RouterConfig](RouterConfig.html "interface in akka.routing")
		
		
		`[createRouter](RouterConfig.html#createRouter(akka.actor.ActorSystem)), [createRouterActor](RouterConfig.html#createRouterActor()), [isManagementMessage](RouterConfig.html#isManagementMessage(java.lang.Object)), [routerDispatcher](RouterConfig.html#routerDispatcher()), [routingLogicController](RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [stopRouterWhenAllRouteesRemoved](RouterConfig.html#stopRouterWhenAllRouteesRemoved()), [verifyConfig](RouterConfig.html#verifyConfig(akka.actor.ActorPath)), [withFallback](RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Constructor Detail
	
	
	
		- #### NoRouter
		
		
		
		```
		public NoRouter()
		```

	- ### Method Detail
	
	
	
		- #### createRouter
		
		
		
		```
		public static [Router](Router.html "class in akka.routing") createRouter​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### routerDispatcher
		
		
		
		```
		public static java.lang.String routerDispatcher()
		```
		- #### withFallback
		
		
		
		```
		public static [RouterConfig](RouterConfig.html "interface in akka.routing") withFallback​([RouterConfig](RouterConfig.html "interface in akka.routing") other)
		```
		- #### getInstance
		
		
		
		```
		public static [NoRouter$](NoRouter$.html "class in akka.routing") getInstance()
		```
		
		Java API: get the singleton instance
		- #### props
		
		
		
		```
		public static [Props](../actor/Props.html "class in akka.actor") props​([Props](../actor/Props.html "class in akka.actor") routeeProps)
		```
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### hashCode
		
		
		
		```
		public static int hashCode()
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### routingLogicController
		
		
		
		```
		public static scala.Option<[Props](../actor/Props.html "class in akka.actor")> routingLogicController​([RoutingLogic](RoutingLogic.html "interface in akka.routing") routingLogic)
		```
		- #### isManagementMessage
		
		
		
		```
		public static boolean isManagementMessage​(java.lang.Object msg)
		```
		- #### stopRouterWhenAllRouteesRemoved
		
		
		
		```
		public static boolean stopRouterWhenAllRouteesRemoved()
		```
		- #### verifyConfig
		
		
		
		```
		public static void verifyConfig​([ActorPath](../actor/ActorPath.html "interface in akka.actor") path)
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object that)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/NoRouter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/NoRouter.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/NoRouter.html)*