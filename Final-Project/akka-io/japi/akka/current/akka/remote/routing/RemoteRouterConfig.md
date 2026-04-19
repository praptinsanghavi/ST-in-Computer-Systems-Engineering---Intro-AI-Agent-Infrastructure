---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/routing/RemoteRouterConfig.html
title: RemoteRouterConfig
---

# RemoteRouterConfig

## Content

Package [akka.remote.routing](package-summary.html)
## Class RemoteRouterConfig

- java.lang.Object
- - akka.remote.routing.RemoteRouterConfig

- All Implemented Interfaces:
`[Pool](../../routing/Pool.html "interface in akka.routing")`, `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class RemoteRouterConfig
extends java.lang.Object
implements [Pool](../../routing/Pool.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

[`RouterConfig`](../../routing/RouterConfig.html "interface in akka.routing") implementation for remote deployment on defined
 target nodes. Delegates other duties to the local [`Pool`](../../routing/Pool.html "interface in akka.routing"),
 which makes it possible to mix this with the built\-in routers such as
 [`RoundRobinGroup`](../../routing/RoundRobinGroup.html "class in akka.routing") or custom routers.

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.routing.RemoteRouterConfig)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteRouterConfig](#%3Cinit%3E(akka.routing.Pool,akka.actor.Address%5B%5D))​([Pool](../../routing/Pool.html "interface in akka.routing") local,  [Address](../../actor/Address.html "class in akka.actor")[] nodes)` |  |
	| `[RemoteRouterConfig](#%3Cinit%3E(akka.routing.Pool,java.lang.Iterable))​([Pool](../../routing/Pool.html "interface in akka.routing") local,  java.lang.Iterable<[Address](../../actor/Address.html "class in akka.actor")> nodes)` |  |
	| `[RemoteRouterConfig](#%3Cinit%3E(akka.routing.Pool,scala.collection.Iterable))​([Pool](../../routing/Pool.html "interface in akka.routing") local,  scala.collection.Iterable<[Address](../../actor/Address.html "class in akka.actor")> nodes)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RemoteRouterConfig](RemoteRouterConfig.html "class in akka.remote.routing")` | `[apply](#apply(akka.routing.Pool,scala.collection.Iterable))​([Pool](../../routing/Pool.html "interface in akka.routing") local,  scala.collection.Iterable<[Address](../../actor/Address.html "class in akka.actor")> nodes)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[RemoteRouterConfig](RemoteRouterConfig.html "class in akka.remote.routing")` | `[copy](#copy(akka.routing.Pool,scala.collection.Iterable))​([Pool](../../routing/Pool.html "interface in akka.routing") local,  scala.collection.Iterable<[Address](../../actor/Address.html "class in akka.actor")> nodes)` |  |
	| `[Pool](../../routing/Pool.html "interface in akka.routing")` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.collection.Iterable<[Address](../../actor/Address.html "class in akka.actor")>` | `[copy$default$2](#copy$default$2())()` |  |
	| `[Router](../../routing/Router.html "class in akka.routing")` | `[createRouter](#createRouter(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Create the actual router, responsible for routing messages to routees. |
	| `akka.routing.RouterActor` | `[createRouterActor](#createRouterActor())()` | INTERNAL API |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[Pool](../../routing/Pool.html "interface in akka.routing")` | `[local](#local())()` |  |
	| `[Routee](../../routing/Routee.html "interface in akka.routing")` | `[newRoutee](#newRoutee(akka.actor.Props,akka.actor.ActorContext))​([Props](../../actor/Props.html "class in akka.actor") routeeProps,  [ActorContext](../../actor/ActorContext.html "interface in akka.actor") context)` | INTERNAL API |
	| `scala.collection.Iterable<[Address](../../actor/Address.html "class in akka.actor")>` | `[nodes](#nodes())()` |  |
	| `int` | `[nrOfInstances](#nrOfInstances(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") sys)` | Initial number of routee instances |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.Option<[Resizer](../../routing/Resizer.html "interface in akka.routing")>` | `[resizer](#resizer())()` | Pool with dynamically resizable number of routees return the [`Resizer`](../../routing/Resizer.html "interface in akka.routing")  to use. |
	| `java.lang.String` | `[routerDispatcher](#routerDispatcher())()` | Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles  supervision, death watch and router management messages |
	| `[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor")` | `[supervisorStrategy](#supervisorStrategy())()` | SupervisorStrategy for the head actor, i.e. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[Pool](../../routing/Pool.html "interface in akka.routing"),​scala.collection.Iterable<[Address](../../actor/Address.html "class in akka.actor")>>>` | `[unapply](#unapply(akka.remote.routing.RemoteRouterConfig))​([RemoteRouterConfig](RemoteRouterConfig.html "class in akka.remote.routing") x$0)` |  |
	| `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")` | `[withFallback](#withFallback(akka.routing.RouterConfig))​([RouterConfig](../../routing/RouterConfig.html "interface in akka.routing") other)` | Overridable merge strategy, by default completely prefers `this` (i.e. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.routing.[Pool](../../routing/Pool.html "interface in akka.routing")
		
		
		`[enrichWithPoolDispatcher](../../routing/Pool.html#enrichWithPoolDispatcher(akka.actor.Props,akka.actor.ActorContext)), [props](../../routing/Pool.html#props(akka.actor.Props)), [stopRouterWhenAllRouteesRemoved](../../routing/Pool.html#stopRouterWhenAllRouteesRemoved()), [usePoolDispatcher](../../routing/Pool.html#usePoolDispatcher())`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.routing.[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")
		
		
		`[isManagementMessage](../../routing/RouterConfig.html#isManagementMessage(java.lang.Object)), [routingLogicController](../../routing/RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [verifyConfig](../../routing/RouterConfig.html#verifyConfig(akka.actor.ActorPath))`

- - ### Constructor Detail
	
	
	
		- #### RemoteRouterConfig
		
		
		
		```
		public RemoteRouterConfig​([Pool](../../routing/Pool.html "interface in akka.routing") local,
		                          scala.collection.Iterable<[Address](../../actor/Address.html "class in akka.actor")> nodes)
		```
		- #### RemoteRouterConfig
		
		
		
		```
		public RemoteRouterConfig​([Pool](../../routing/Pool.html "interface in akka.routing") local,
		                          java.lang.Iterable<[Address](../../actor/Address.html "class in akka.actor")> nodes)
		```
		- #### RemoteRouterConfig
		
		
		
		```
		public RemoteRouterConfig​([Pool](../../routing/Pool.html "interface in akka.routing") local,
		                          [Address](../../actor/Address.html "class in akka.actor")[] nodes)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [RemoteRouterConfig](RemoteRouterConfig.html "class in akka.remote.routing") apply​([Pool](../../routing/Pool.html "interface in akka.routing") local,
		                                       scala.collection.Iterable<[Address](../../actor/Address.html "class in akka.actor")> nodes)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[Pool](../../routing/Pool.html "interface in akka.routing"),​scala.collection.Iterable<[Address](../../actor/Address.html "class in akka.actor")>>> unapply​([RemoteRouterConfig](RemoteRouterConfig.html "class in akka.remote.routing") x$0)
		```
		- #### local
		
		
		
		```
		public [Pool](../../routing/Pool.html "interface in akka.routing") local()
		```
		- #### nodes
		
		
		
		```
		public scala.collection.Iterable<[Address](../../actor/Address.html "class in akka.actor")> nodes()
		```
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
		- #### nrOfInstances
		
		
		
		```
		public int nrOfInstances​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") sys)
		```
		
		Description copied from interface: `[Pool](../../routing/Pool.html#nrOfInstances(akka.actor.ActorSystem))`
		Initial number of routee instances
		
		Specified by:
		`[nrOfInstances](../../routing/Pool.html#nrOfInstances(akka.actor.ActorSystem))` in interface `[Pool](../../routing/Pool.html "interface in akka.routing")`
		- #### newRoutee
		
		
		
		```
		public [Routee](../../routing/Routee.html "interface in akka.routing") newRoutee​([Props](../../actor/Props.html "class in akka.actor") routeeProps,
		                        [ActorContext](../../actor/ActorContext.html "interface in akka.actor") context)
		```
		
		Description copied from interface: `[Pool](../../routing/Pool.html#newRoutee(akka.actor.Props,akka.actor.ActorContext))`
		INTERNAL API
		
		Specified by:
		`[newRoutee](../../routing/Pool.html#newRoutee(akka.actor.Props,akka.actor.ActorContext))` in interface `[Pool](../../routing/Pool.html "interface in akka.routing")`
		- #### createRouterActor
		
		
		
		```
		public akka.routing.RouterActor createRouterActor()
		```
		
		Description copied from interface: `[Pool](../../routing/Pool.html#createRouterActor())`
		INTERNAL API
		
		Specified by:
		`[createRouterActor](../../routing/Pool.html#createRouterActor())` in interface `[Pool](../../routing/Pool.html "interface in akka.routing")`
		Specified by:
		`[createRouterActor](../../routing/RouterConfig.html#createRouterActor())` in interface `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`
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
		public [RemoteRouterConfig](RemoteRouterConfig.html "class in akka.remote.routing") copy​([Pool](../../routing/Pool.html "interface in akka.routing") local,
		                               scala.collection.Iterable<[Address](../../actor/Address.html "class in akka.actor")> nodes)
		```
		- #### copy$default$1
		
		
		
		```
		public [Pool](../../routing/Pool.html "interface in akka.routing") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.collection.Iterable<[Address](../../actor/Address.html "class in akka.actor")> copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/remote/routing/RemoteRouterConfig.html
- https://doc.akka.io/japi/akka/current/akka/remote/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/routing/Pool.html
- https://doc.akka.io/japi/akka/current/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka/current/akka/routing/RoundRobinGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/Routee.html
- https://doc.akka.io/japi/akka/current/akka/routing/Router.html
- https://doc.akka.io/japi/akka/current/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/routing/RemoteRouterConfig.html](https://doc.akka.io/japi/akka/current/akka/remote/routing/RemoteRouterConfig.html)*