---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:17:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingRoutingLogic.html
title: TailChoppingRoutingLogic
---

# TailChoppingRoutingLogic

## Content

Package [akka.routing](package-summary.html)
## Class TailChoppingRoutingLogic

- java.lang.Object
- - akka.routing.TailChoppingRoutingLogic

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[RoutingLogic](RoutingLogic.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class TailChoppingRoutingLogic
extends java.lang.Object
implements [RoutingLogic](RoutingLogic.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

As each message is sent to the router, the routees are randomly ordered. The message is sent to the
 first routee. If no response is received before the `interval` has passed, the same message is sent
 to the next routee. This process repeats until either a response is received from some routee, the
 routees in the pool are exhausted, or the `within` duration has passed since the first send. If no
 routee sends a response in time, a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor") wrapping a [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern")
 is sent to the sender.
 
 The goal of this routing algorithm is to decrease tail latencies ("chop off the tail latency") in situations
 where multiple routees can perform the same piece of work, and where a routee may occasionally respond
 more slowly than expected. In this case, sending the same work request (also known as a "backup request")
 to another actor results in decreased response time \- because it's less probable that multiple actors
 are under heavy load simultaneously. This technique is explained in depth in Jeff Dean's presentation on
 [Achieving Rapid Response Times in Large Online Services](https://static.googleusercontent.com/media/research.google.com/en//people/jeff/Berkeley-Latency-Mar2012.pdf).
 

 param: scheduler schedules sending messages to routees
 

 param: within expecting at least one reply within this duration, otherwise
 it will reply with [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern") in a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")

 param: interval duration after which the message will be sent to the next routee
 

 param: context execution context used by scheduler

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.TailChoppingRoutingLogic)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TailChoppingRoutingLogic](#%3Cinit%3E(akka.actor.Scheduler,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.ExecutionContext))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  scala.concurrent.ExecutionContext context)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing")` | `[apply](#apply(akka.actor.Scheduler,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.ExecutionContext))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  scala.concurrent.ExecutionContext context)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.concurrent.ExecutionContext` | `[context](#context())()` |  |
	| `[TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing")` | `[copy](#copy(akka.actor.Scheduler,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.ExecutionContext))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  scala.concurrent.ExecutionContext context)` |  |
	| `[Scheduler](../actor/Scheduler.html "interface in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[copy$default$3](#copy$default$3())()` |  |
	| `scala.concurrent.ExecutionContext` | `[copy$default$4](#copy$default$4())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[interval](#interval())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Scheduler](../actor/Scheduler.html "interface in akka.actor")` | `[scheduler](#scheduler())()` |  |
	| `[Routee](Routee.html "interface in akka.routing")` | `[select](#select(java.lang.Object,scala.collection.immutable.IndexedSeq))​(java.lang.Object message,  scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` | Pick the destination for a given message. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple4<[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.ExecutionContext>>` | `[unapply](#unapply(akka.routing.TailChoppingRoutingLogic))​([TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing") x$0)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[within](#within())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### TailChoppingRoutingLogic
		
		
		
		```
		public TailChoppingRoutingLogic​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                scala.concurrent.duration.FiniteDuration within,
		                                scala.concurrent.duration.FiniteDuration interval,
		                                scala.concurrent.ExecutionContext context)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing") apply​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                             scala.concurrent.duration.FiniteDuration within,
		                                             scala.concurrent.duration.FiniteDuration interval,
		                                             scala.concurrent.ExecutionContext context)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple4<[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.ExecutionContext>> unapply​([TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing") x$0)
		```
		- #### scheduler
		
		
		
		```
		public [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler()
		```
		- #### within
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration within()
		```
		- #### interval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration interval()
		```
		- #### context
		
		
		
		```
		public scala.concurrent.ExecutionContext context()
		```
		- #### select
		
		
		
		```
		public [Routee](Routee.html "interface in akka.routing") select​(java.lang.Object message,
		                     scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		
		Description copied from interface: `[RoutingLogic](RoutingLogic.html#select(java.lang.Object,scala.collection.immutable.IndexedSeq))`
		Pick the destination for a given message. Normally it picks one of the
		 passed `routees`, but in the end it is up to the implementation to
		 return whatever [`Routee`](Routee.html "interface in akka.routing") to use for sending a specific message.
		 
		 When implemented from Java it can be good to know that
		 `routees.apply(index)` can be used to get an element
		 from the `IndexedSeq`.
		
		
		
		Specified by:
		`[select](RoutingLogic.html#select(java.lang.Object,scala.collection.immutable.IndexedSeq))` in interface `[RoutingLogic](RoutingLogic.html "interface in akka.routing")`
		- #### copy
		
		
		
		```
		public [TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing") copy​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                     scala.concurrent.duration.FiniteDuration within,
		                                     scala.concurrent.duration.FiniteDuration interval,
		                                     scala.concurrent.ExecutionContext context)
		```
		- #### copy$default$1
		
		
		
		```
		public [Scheduler](../actor/Scheduler.html "interface in akka.actor") copy$default$1()
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
		public scala.concurrent.ExecutionContext copy$default$4()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingRoutingLogic.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingRoutingLogic.html)*