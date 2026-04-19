---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/FromConfig.html
title: FromConfig
---

# FromConfig

## Content

Package [akka.routing](package-summary.html)
## Class FromConfig

- java.lang.Object
- - akka.routing.FromConfig

- All Implemented Interfaces:
`[Pool](Pool.html "interface in akka.routing")`, `[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`

Direct Known Subclasses:
`[FromConfig$](FromConfig$.html "class in akka.routing")`

---

```
public class FromConfig
extends java.lang.Object
implements [Pool](Pool.html "interface in akka.routing")
```

Java API: Wraps a [`Props`](../actor/Props.html "class in akka.actor") to mark the actor as externally configurable to be used with a router.
 If a [`Props`](../actor/Props.html "class in akka.actor") is not wrapped with [`FromConfig`](FromConfig.html "class in akka.routing") then the actor will ignore the router part of the deployment section
 in the configuration.
 
 This can be used when the dispatcher to be used for the head Router needs to be configured
 (defaults to default\-dispatcher).

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.FromConfig)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FromConfig](#%3Cinit%3E())()` |  |
	| `[FromConfig](#%3Cinit%3E(scala.Option,akka.actor.SupervisorStrategy,java.lang.String))​(scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [FromConfig](FromConfig.html "class in akka.routing")` | `[apply](#apply(scala.Option,akka.actor.SupervisorStrategy,java.lang.String))​(scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher)` |  |
	| `static scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[apply$default$1](#apply$default$1())()` |  |
	| `static [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[apply$default$2](#apply$default$2())()` |  |
	| `static java.lang.String` | `[apply$default$3](#apply$default$3())()` |  |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Router](Router.html "class in akka.routing")` | `[createRouter](#createRouter(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Create the actual router, responsible for routing messages to routees. |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [FromConfig$](FromConfig$.html "class in akka.routing")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static boolean` | `[isManagementMessage](#isManagementMessage(java.lang.Object))​(java.lang.Object msg)` |  |
	| `int` | `[nrOfInstances](#nrOfInstances(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") sys)` | Initial number of routee instances |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props())()` | [`Props`](../actor/Props.html "class in akka.actor") for a group router based on the settings defined by  this instance. |
	| `scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[resizer](#resizer())()` | Pool with dynamically resizable number of routees return the [`Resizer`](Resizer.html "interface in akka.routing")  to use. |
	| `java.lang.String` | `[routerDispatcher](#routerDispatcher())()` | Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles  supervision, death watch and router management messages |
	| `static scala.Option<[Props](../actor/Props.html "class in akka.actor")>` | `[routingLogicController](#routingLogicController(akka.routing.RoutingLogic))​([RoutingLogic](RoutingLogic.html "interface in akka.routing") routingLogic)` |  |
	| `static boolean` | `[stopRouterWhenAllRouteesRemoved](#stopRouterWhenAllRouteesRemoved())()` |  |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[supervisorStrategy](#supervisorStrategy())()` | SupervisorStrategy for the head actor, i.e. |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.String>` | `[unapply](#unapply(akka.routing.FromConfig))​([FromConfig](FromConfig.html "class in akka.routing") fc)` |  |
	| `static boolean` | `[usePoolDispatcher](#usePoolDispatcher())()` |  |
	| `void` | `[verifyConfig](#verifyConfig(akka.actor.ActorPath))​([ActorPath](../actor/ActorPath.html "interface in akka.actor") path)` | Check that everything is there which is needed. |
	| `[FromConfig](FromConfig.html "class in akka.routing")` | `[withDispatcher](#withDispatcher(java.lang.String))​(java.lang.String dispatcherId)` | Setting the dispatcher to be used for the router head actor, which handles  supervision, death watch and router management messages. |
	| `static [RouterConfig](RouterConfig.html "interface in akka.routing")` | `[withFallback](#withFallback(akka.routing.RouterConfig))​([RouterConfig](RouterConfig.html "interface in akka.routing") other)` |  |
	| `[FromConfig](FromConfig.html "class in akka.routing")` | `[withResizer](#withResizer(akka.routing.Resizer))​([Resizer](Resizer.html "interface in akka.routing") resizer)` | Setting the resizer to be used. |
	| `[FromConfig](FromConfig.html "class in akka.routing")` | `[withSupervisorStrategy](#withSupervisorStrategy(akka.actor.SupervisorStrategy))​([SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") strategy)` | Setting the supervisor strategy to be used for the \&ldquo;head\&rdquo; Router actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.routing.[Pool](Pool.html "interface in akka.routing")
		
		
		`[enrichWithPoolDispatcher](Pool.html#enrichWithPoolDispatcher(akka.actor.Props,akka.actor.ActorContext)), [newRoutee](Pool.html#newRoutee(akka.actor.Props,akka.actor.ActorContext)), [props](Pool.html#props(akka.actor.Props)), [stopRouterWhenAllRouteesRemoved](Pool.html#stopRouterWhenAllRouteesRemoved()), [usePoolDispatcher](Pool.html#usePoolDispatcher())`
		- ### Methods inherited from interface akka.routing.[RouterConfig](RouterConfig.html "interface in akka.routing")
		
		
		`[isManagementMessage](RouterConfig.html#isManagementMessage(java.lang.Object)), [routingLogicController](RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [withFallback](RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Constructor Detail
	
	
	
		- #### FromConfig
		
		
		
		```
		public FromConfig​(scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,
		                  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                  java.lang.String routerDispatcher)
		```
		- #### FromConfig
		
		
		
		```
		public FromConfig()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [FromConfig$](FromConfig$.html "class in akka.routing") getInstance()
		```
		
		Java API: get the singleton instance
		- #### apply
		
		
		
		```
		public static final [FromConfig](FromConfig.html "class in akka.routing") apply​(scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,
		                                     [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                                     java.lang.String routerDispatcher)
		```
		- #### apply$default$1
		
		
		
		```
		public static final scala.Option<[Resizer](Resizer.html "interface in akka.routing")> apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public static final [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static final java.lang.String apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public static final scala.Option<java.lang.String> unapply​([FromConfig](FromConfig.html "class in akka.routing") fc)
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
		- #### withFallback
		
		
		
		```
		public static [RouterConfig](RouterConfig.html "interface in akka.routing") withFallback​([RouterConfig](RouterConfig.html "interface in akka.routing") other)
		```
		- #### usePoolDispatcher
		
		
		
		```
		public static boolean usePoolDispatcher()
		```
		- #### stopRouterWhenAllRouteesRemoved
		
		
		
		```
		public static boolean stopRouterWhenAllRouteesRemoved()
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
		- #### verifyConfig
		
		
		
		```
		public void verifyConfig​([ActorPath](../actor/ActorPath.html "interface in akka.actor") path)
		```
		
		Description copied from interface: `[RouterConfig](RouterConfig.html#verifyConfig(akka.actor.ActorPath))`
		Check that everything is there which is needed. Called in constructor of RoutedActorRef to fail early.
		
		Specified by:
		`[verifyConfig](RouterConfig.html#verifyConfig(akka.actor.ActorPath))` in interface `[RouterConfig](RouterConfig.html "interface in akka.routing")`
		- #### withSupervisorStrategy
		
		
		
		```
		public [FromConfig](FromConfig.html "class in akka.routing") withSupervisorStrategy​([SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") strategy)
		```
		
		Setting the supervisor strategy to be used for the \&ldquo;head\&rdquo; Router actor.
		- #### withResizer
		
		
		
		```
		public [FromConfig](FromConfig.html "class in akka.routing") withResizer​([Resizer](Resizer.html "interface in akka.routing") resizer)
		```
		
		Setting the resizer to be used.
		- #### withDispatcher
		
		
		
		```
		public [FromConfig](FromConfig.html "class in akka.routing") withDispatcher​(java.lang.String dispatcherId)
		```
		
		Setting the dispatcher to be used for the router head actor, which handles
		 supervision, death watch and router management messages.
		- #### nrOfInstances
		
		
		
		```
		public int nrOfInstances​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") sys)
		```
		
		Description copied from interface: `[Pool](Pool.html#nrOfInstances(akka.actor.ActorSystem))`
		Initial number of routee instances
		
		Specified by:
		`[nrOfInstances](Pool.html#nrOfInstances(akka.actor.ActorSystem))` in interface `[Pool](Pool.html "interface in akka.routing")`
		- #### props
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") props()
		```
		
		[`Props`](../actor/Props.html "class in akka.actor") for a group router based on the settings defined by
		 this instance.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/routing/FromConfig$.html
- https://doc.akka.io/japi/akka/current/akka/routing/FromConfig.html
- https://doc.akka.io/japi/akka/current/akka/routing/Pool.html
- https://doc.akka.io/japi/akka/current/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka/current/akka/routing/Router.html
- https://doc.akka.io/japi/akka/current/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka/current/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/FromConfig.html](https://doc.akka.io/japi/akka/current/akka/routing/FromConfig.html)*