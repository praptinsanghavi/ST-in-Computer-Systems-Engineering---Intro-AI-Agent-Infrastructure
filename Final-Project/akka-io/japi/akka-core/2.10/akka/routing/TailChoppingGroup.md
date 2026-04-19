---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:17:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingGroup.html
title: TailChoppingGroup
---

# TailChoppingGroup

## Content

Package [akka.routing](package-summary.html)
## Class TailChoppingGroup

- java.lang.Object
- - akka.routing.TailChoppingGroup

- All Implemented Interfaces:
`[Group](Group.html "interface in akka.routing")`, `[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class TailChoppingGroup
extends java.lang.Object
implements [Group](Group.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

A router group with retry logic, intended for cases where a return message is expected in
 response to a message sent to the routee. As each message is sent to the routing group, the
 routees are randomly ordered. The message is sent to the first routee. If no response is received
 before the `interval` has passed, the same message is sent to the next routee. This process repeats
 until either a response is received from some routee, the routees in the group are exhausted, or
 the `within` duration has passed since the first send. If no routee sends
 a response in time, a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor") wrapping a [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern")
 is sent to the sender.
 
 Refer to [`TailChoppingRoutingLogic`](TailChoppingRoutingLogic.html "class in akka.routing") for comments regarding the goal of this
 routing algorithm.
 

 The configuration parameter trumps the constructor arguments. This means that
 if you provide `paths` during instantiation they will be ignored if
 the router is defined in the configuration file for the actor being used.
 

 param: paths string representation of the actor paths of the routees, messages are
 sent with [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor") to these paths
 

 param: within expecting at least one reply within this duration, otherwise
 it will reply with [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern") in a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")

 param: interval duration after which the message will be sent to the next routee
 

 param: routerDispatcher dispatcher to use for the router head actor, which handles
 router management messages

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.TailChoppingGroup)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TailChoppingGroup](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `[TailChoppingGroup](#%3Cinit%3E(java.lang.Iterable,java.time.Duration,java.time.Duration))​(java.lang.Iterable<java.lang.String> routeePaths,  java.time.Duration within,  java.time.Duration interval)` | Java API |
	| `[TailChoppingGroup](#%3Cinit%3E(java.lang.Iterable,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(java.lang.Iterable<java.lang.String> routeePaths,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval)` | Java API |
	| `[TailChoppingGroup](#%3Cinit%3E(scala.collection.immutable.Iterable,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.String))​(scala.collection.immutable.Iterable<java.lang.String> paths,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  java.lang.String routerDispatcher)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `static [TailChoppingGroup](TailChoppingGroup.html "class in akka.routing")` | `[apply](#apply(scala.collection.immutable.Iterable,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.String))​(scala.collection.immutable.Iterable<java.lang.String> paths,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  java.lang.String routerDispatcher)` |  |
	| `static java.lang.String` | `[apply$default$4](#apply$default$4())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[TailChoppingGroup](TailChoppingGroup.html "class in akka.routing")` | `[copy](#copy(scala.collection.immutable.Iterable,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.String))​(scala.collection.immutable.Iterable<java.lang.String> paths,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  java.lang.String routerDispatcher)` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[copy$default$3](#copy$default$3())()` |  |
	| `java.lang.String` | `[copy$default$4](#copy$default$4())()` |  |
	| `[Router](Router.html "class in akka.routing")` | `[createRouter](#createRouter(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Create the actual router, responsible for routing messages to routees. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[interval](#interval())()` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[paths](#paths())()` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[paths](#paths(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[routerDispatcher](#routerDispatcher())()` | Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles  supervision, death watch and router management messages |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple4<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.String>>` | `[unapply](#unapply(akka.routing.TailChoppingGroup))​([TailChoppingGroup](TailChoppingGroup.html "class in akka.routing") x$0)` |  |
	| `[TailChoppingGroup](TailChoppingGroup.html "class in akka.routing")` | `[withDispatcher](#withDispatcher(java.lang.String))​(java.lang.String dispatcherId)` | Setting the dispatcher to be used for the router head actor, which handles  router management messages |
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
	
	
	
		- #### TailChoppingGroup
		
		
		
		```
		public TailChoppingGroup​(scala.collection.immutable.Iterable<java.lang.String> paths,
		                         scala.concurrent.duration.FiniteDuration within,
		                         scala.concurrent.duration.FiniteDuration interval,
		                         java.lang.String routerDispatcher)
		```
		- #### TailChoppingGroup
		
		
		
		```
		public TailChoppingGroup​(com.typesafe.config.Config config)
		```
		- #### TailChoppingGroup
		
		
		
		```
		public TailChoppingGroup​(java.lang.Iterable<java.lang.String> routeePaths,
		                         scala.concurrent.duration.FiniteDuration within,
		                         scala.concurrent.duration.FiniteDuration interval)
		```
		
		Java API
		
		Parameters:
		`routeePaths` \- string representation of the actor paths of the routees, messages are
		 sent with [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor") to these paths
		`within` \- expecting at least one reply within this duration, otherwise
		 it will reply with [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern") in a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")
		`interval` \- duration after which next routee will be picked
		- #### TailChoppingGroup
		
		
		
		```
		public TailChoppingGroup​(java.lang.Iterable<java.lang.String> routeePaths,
		                         java.time.Duration within,
		                         java.time.Duration interval)
		```
		
		Java API
		
		Parameters:
		`routeePaths` \- string representation of the actor paths of the routees, messages are
		 sent with [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor") to these paths
		`within` \- expecting at least one reply within this duration, otherwise
		 it will reply with [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern") in a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")
		`interval` \- duration after which next routee will be picked

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$4
		
		
		
		```
		public static java.lang.String $lessinit$greater$default$4()
		```
		- #### apply
		
		
		
		```
		public static [TailChoppingGroup](TailChoppingGroup.html "class in akka.routing") apply​(scala.collection.immutable.Iterable<java.lang.String> paths,
		                                      scala.concurrent.duration.FiniteDuration within,
		                                      scala.concurrent.duration.FiniteDuration interval,
		                                      java.lang.String routerDispatcher)
		```
		- #### apply$default$4
		
		
		
		```
		public static java.lang.String apply$default$4()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple4<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.String>> unapply​([TailChoppingGroup](TailChoppingGroup.html "class in akka.routing") x$0)
		```
		- #### paths
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> paths()
		```
		- #### within
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration within()
		```
		- #### interval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration interval()
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
		- #### paths
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> paths​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		
		Specified by:
		`[paths](Group.html#paths(akka.actor.ActorSystem))` in interface `[Group](Group.html "interface in akka.routing")`
		- #### withDispatcher
		
		
		
		```
		public [TailChoppingGroup](TailChoppingGroup.html "class in akka.routing") withDispatcher​(java.lang.String dispatcherId)
		```
		
		Setting the dispatcher to be used for the router head actor, which handles
		 router management messages
		- #### copy
		
		
		
		```
		public [TailChoppingGroup](TailChoppingGroup.html "class in akka.routing") copy​(scala.collection.immutable.Iterable<java.lang.String> paths,
		                              scala.concurrent.duration.FiniteDuration within,
		                              scala.concurrent.duration.FiniteDuration interval,
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
		public scala.concurrent.duration.FiniteDuration copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public java.lang.String copy$default$4()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingGroup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingGroup.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingGroup.html)*