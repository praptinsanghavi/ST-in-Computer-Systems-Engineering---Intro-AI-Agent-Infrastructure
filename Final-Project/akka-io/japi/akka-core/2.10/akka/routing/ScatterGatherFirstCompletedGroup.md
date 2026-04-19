---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/ScatterGatherFirstCompletedGroup.html
title: ScatterGatherFirstCompletedGroup
---

# ScatterGatherFirstCompletedGroup

## Content

Package [akka.routing](package-summary.html)
## Class ScatterGatherFirstCompletedGroup

- java.lang.Object
- - akka.routing.ScatterGatherFirstCompletedGroup

- All Implemented Interfaces:
`[Group](Group.html "interface in akka.routing")`, `[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ScatterGatherFirstCompletedGroup
extends java.lang.Object
implements [Group](Group.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

A router group that broadcasts the message to all routees, and replies with the first response.
 
 The configuration parameter trumps the constructor arguments. This means that
 if you provide `paths` during instantiation they will be ignored if
 the router is defined in the configuration file for the actor being used.
 

 param: paths string representation of the actor paths of the routees, messages are
 sent with [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor") to these paths
 

 param: within expecting at least one reply within this duration, otherwise
 it will reply with [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern") in a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")

 param: routerDispatcher dispatcher to use for the router head actor, which handles
 router management messages

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.ScatterGatherFirstCompletedGroup)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ScatterGatherFirstCompletedGroup](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `[ScatterGatherFirstCompletedGroup](#%3Cinit%3E(java.lang.Iterable,java.time.Duration))​(java.lang.Iterable<java.lang.String> routeePaths,  java.time.Duration within)` | Java API |
	| `[ScatterGatherFirstCompletedGroup](#%3Cinit%3E(java.lang.Iterable,scala.concurrent.duration.FiniteDuration))​(java.lang.Iterable<java.lang.String> routeePaths,  scala.concurrent.duration.FiniteDuration within)` | Java API |
	| `[ScatterGatherFirstCompletedGroup](#%3Cinit%3E(scala.collection.immutable.Iterable,scala.concurrent.duration.FiniteDuration,java.lang.String))​(scala.collection.immutable.Iterable<java.lang.String> paths,  scala.concurrent.duration.FiniteDuration within,  java.lang.String routerDispatcher)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static [ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing")` | `[apply](#apply(scala.collection.immutable.Iterable,scala.concurrent.duration.FiniteDuration,java.lang.String))​(scala.collection.immutable.Iterable<java.lang.String> paths,  scala.concurrent.duration.FiniteDuration within,  java.lang.String routerDispatcher)` |  |
	| `static java.lang.String` | `[apply$default$3](#apply$default$3())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing")` | `[copy](#copy(scala.collection.immutable.Iterable,scala.concurrent.duration.FiniteDuration,java.lang.String))​(scala.collection.immutable.Iterable<java.lang.String> paths,  scala.concurrent.duration.FiniteDuration within,  java.lang.String routerDispatcher)` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[copy$default$2](#copy$default$2())()` |  |
	| `java.lang.String` | `[copy$default$3](#copy$default$3())()` |  |
	| `[Router](Router.html "class in akka.routing")` | `[createRouter](#createRouter(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Create the actual router, responsible for routing messages to routees. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[paths](#paths())()` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[paths](#paths(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[routerDispatcher](#routerDispatcher())()` | Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles  supervision, death watch and router management messages |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​java.lang.String>>` | `[unapply](#unapply(akka.routing.ScatterGatherFirstCompletedGroup))​([ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing") x$0)` |  |
	| `[ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing")` | `[withDispatcher](#withDispatcher(java.lang.String))​(java.lang.String dispatcherId)` | Setting the dispatcher to be used for the router head actor, which handles  router management messages |
	| `scala.concurrent.duration.FiniteDuration` | `[within](#within())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.routing.[Group](Group.html "interface in akka.routing")
		
		
		`[createRouterActor](Group.html#createRouterActor()), [props](Group.html#props()), [routeeFor](Group.html#routeeFor(java.lang.String,akka.actor.ActorContext))`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.routing.[RouterConfig](RouterConfig.html "interface in akka.routing")
		
		
		`[isManagementMessage](RouterConfig.html#isManagementMessage(java.lang.Object)), [routingLogicController](RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [stopRouterWhenAllRouteesRemoved](RouterConfig.html#stopRouterWhenAllRouteesRemoved()), [verifyConfig](RouterConfig.html#verifyConfig(akka.actor.ActorPath)), [withFallback](RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Constructor Detail
	
	
	
		- #### ScatterGatherFirstCompletedGroup
		
		
		
		```
		public ScatterGatherFirstCompletedGroup​(scala.collection.immutable.Iterable<java.lang.String> paths,
		                                        scala.concurrent.duration.FiniteDuration within,
		                                        java.lang.String routerDispatcher)
		```
		- #### ScatterGatherFirstCompletedGroup
		
		
		
		```
		public ScatterGatherFirstCompletedGroup​(com.typesafe.config.Config config)
		```
		- #### ScatterGatherFirstCompletedGroup
		
		
		
		```
		public ScatterGatherFirstCompletedGroup​(java.lang.Iterable<java.lang.String> routeePaths,
		                                        scala.concurrent.duration.FiniteDuration within)
		```
		
		Java API
		
		Parameters:
		`routeePaths` \- string representation of the actor paths of the routees, messages are
		 sent with [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor") to these paths
		`within` \- expecting at least one reply within this duration, otherwise
		 it will reply with [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern") in a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")
		- #### ScatterGatherFirstCompletedGroup
		
		
		
		```
		public ScatterGatherFirstCompletedGroup​(java.lang.Iterable<java.lang.String> routeePaths,
		                                        java.time.Duration within)
		```
		
		Java API
		
		Parameters:
		`routeePaths` \- string representation of the actor paths of the routees, messages are
		 sent with [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor") to these paths
		`within` \- expecting at least one reply within this duration, otherwise
		 it will reply with [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern") in a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static java.lang.String $lessinit$greater$default$3()
		```
		- #### apply
		
		
		
		```
		public static [ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing") apply​(scala.collection.immutable.Iterable<java.lang.String> paths,
		                                                     scala.concurrent.duration.FiniteDuration within,
		                                                     java.lang.String routerDispatcher)
		```
		- #### apply$default$3
		
		
		
		```
		public static java.lang.String apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​java.lang.String>> unapply​([ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing") x$0)
		```
		- #### paths
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> paths()
		```
		- #### within
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration within()
		```
		- #### routerDispatcher
		
		
		
		```
		public java.lang.String routerDispatcher()
		```
		
		Description copied from interface: `[RouterConfig](RouterConfig.html#routerDispatcher())`
		Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles
		 supervision, death watch and router management messages
		
		Specified by:
		`[routerDispatcher](RouterConfig.html#routerDispatcher())` in interface `[RouterConfig](RouterConfig.html "interface in akka.routing")`
		- #### paths
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> paths​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		
		Specified by:
		`[paths](Group.html#paths(akka.actor.ActorSystem))` in interface `[Group](Group.html "interface in akka.routing")`
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
		- #### withDispatcher
		
		
		
		```
		public [ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing") withDispatcher​(java.lang.String dispatcherId)
		```
		
		Setting the dispatcher to be used for the router head actor, which handles
		 router management messages
		- #### copy
		
		
		
		```
		public [ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing") copy​(scala.collection.immutable.Iterable<java.lang.String> paths,
		                                             scala.concurrent.duration.FiniteDuration within,
		                                             java.lang.String routerDispatcher)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration copy$default$2()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Group.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ScatterGatherFirstCompletedGroup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/ScatterGatherFirstCompletedGroup.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/ScatterGatherFirstCompletedGroup.html)*