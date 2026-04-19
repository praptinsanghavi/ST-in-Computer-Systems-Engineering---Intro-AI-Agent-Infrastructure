---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedRoutingLogic.html
title: ScatterGatherFirstCompletedRoutingLogic
---

# ScatterGatherFirstCompletedRoutingLogic

## Content

Package [akka.routing](package-summary.html)
## Class ScatterGatherFirstCompletedRoutingLogic

- java.lang.Object
- - akka.routing.ScatterGatherFirstCompletedRoutingLogic

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[RoutingLogic](RoutingLogic.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ScatterGatherFirstCompletedRoutingLogic
extends java.lang.Object
implements [RoutingLogic](RoutingLogic.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

Broadcasts the message to all routees, and replies with the first response.
 
 param: within expecting at least one reply within this duration, otherwise
 it will reply with [`AskTimeoutException`](../pattern/AskTimeoutException.html "class in akka.pattern") in a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.ScatterGatherFirstCompletedRoutingLogic)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ScatterGatherFirstCompletedRoutingLogic](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration within)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ScatterGatherFirstCompletedRoutingLogic](ScatterGatherFirstCompletedRoutingLogic.html "class in akka.routing")` | `[apply](#apply(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration within)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ScatterGatherFirstCompletedRoutingLogic](ScatterGatherFirstCompletedRoutingLogic.html "class in akka.routing")` | `[copy](#copy(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration within)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Routee](Routee.html "interface in akka.routing")` | `[select](#select(java.lang.Object,scala.collection.immutable.IndexedSeq))​(java.lang.Object message,  scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` | Pick the destination for a given message. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.concurrent.duration.FiniteDuration>` | `[unapply](#unapply(akka.routing.ScatterGatherFirstCompletedRoutingLogic))​([ScatterGatherFirstCompletedRoutingLogic](ScatterGatherFirstCompletedRoutingLogic.html "class in akka.routing") x$0)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[within](#within())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ScatterGatherFirstCompletedRoutingLogic
		
		
		
		```
		public ScatterGatherFirstCompletedRoutingLogic​(scala.concurrent.duration.FiniteDuration within)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ScatterGatherFirstCompletedRoutingLogic](ScatterGatherFirstCompletedRoutingLogic.html "class in akka.routing") apply​(scala.concurrent.duration.FiniteDuration within)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.concurrent.duration.FiniteDuration> unapply​([ScatterGatherFirstCompletedRoutingLogic](ScatterGatherFirstCompletedRoutingLogic.html "class in akka.routing") x$0)
		```
		- #### within
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration within()
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
		public [ScatterGatherFirstCompletedRoutingLogic](ScatterGatherFirstCompletedRoutingLogic.html "class in akka.routing") copy​(scala.concurrent.duration.FiniteDuration within)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka/current/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka/current/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/routing/Routee.html
- https://doc.akka.io/japi/akka/current/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedRoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedRoutingLogic.html](https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedRoutingLogic.html)*