---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html
title: Router
---

# Router

## Content

Package [akka.routing](package-summary.html)
## Class Router

- java.lang.Object
- - akka.routing.Router

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Router
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

For each message that is sent through the router via the [`route(java.lang.Object, akka.actor.ActorRef)`](#route(java.lang.Object,akka.actor.ActorRef)) method the
 [`RoutingLogic`](RoutingLogic.html "interface in akka.routing") decides to which [`Routee`](Routee.html "interface in akka.routing") to send the message. The [`Routee`](Routee.html "interface in akka.routing") itself
 knows how to perform the actual sending. Normally the [`RoutingLogic`](RoutingLogic.html "interface in akka.routing") picks one of the
 contained `routees`, but that is up to the implementation of the [`RoutingLogic`](RoutingLogic.html "interface in akka.routing").
 
 A `Router` is immutable and the [`RoutingLogic`](RoutingLogic.html "interface in akka.routing") must be thread safe.

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.Router)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Router](#%3Cinit%3E(akka.routing.RoutingLogic))​([RoutingLogic](RoutingLogic.html "interface in akka.routing") logic)` | Java API |
	| `[Router](#%3Cinit%3E(akka.routing.RoutingLogic,java.lang.Iterable))​([RoutingLogic](RoutingLogic.html "interface in akka.routing") logic,  java.lang.Iterable<[Routee](Routee.html "interface in akka.routing")> routees)` | Java API |
	| `[Router](#%3Cinit%3E(akka.routing.RoutingLogic,scala.collection.immutable.IndexedSeq))​([RoutingLogic](RoutingLogic.html "interface in akka.routing") logic,  scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[Router](Router.html "class in akka.routing")` | `[addRoutee](#addRoutee(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` | Create a new instance with one more [`ActorRefRoutee`](ActorRefRoutee.html "class in akka.routing") for the  specified [`ActorRef`](../actor/ActorRef.html "class in akka.actor") and the same [`RoutingLogic`](RoutingLogic.html "interface in akka.routing"). |
	| `[Router](Router.html "class in akka.routing")` | `[addRoutee](#addRoutee(akka.actor.ActorSelection))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") sel)` | Create a new instance with one more [`ActorSelectionRoutee`](ActorSelectionRoutee.html "class in akka.routing") for the  specified [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor") and the same [`RoutingLogic`](RoutingLogic.html "interface in akka.routing"). |
	| `[Router](Router.html "class in akka.routing")` | `[addRoutee](#addRoutee(akka.routing.Routee))​([Routee](Routee.html "interface in akka.routing") routee)` | Create a new instance with one more routee and the same [`RoutingLogic`](RoutingLogic.html "interface in akka.routing"). |
	| `static [Router](Router.html "class in akka.routing")` | `[apply](#apply(akka.routing.RoutingLogic,scala.collection.immutable.IndexedSeq))​([RoutingLogic](RoutingLogic.html "interface in akka.routing") logic,  scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` |  |
	| `static scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>` | `[apply$default$2](#apply$default$2())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Router](Router.html "class in akka.routing")` | `[copy](#copy(akka.routing.RoutingLogic,scala.collection.immutable.IndexedSeq))​([RoutingLogic](RoutingLogic.html "interface in akka.routing") logic,  scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` |  |
	| `[RoutingLogic](RoutingLogic.html "interface in akka.routing")` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[RoutingLogic](RoutingLogic.html "interface in akka.routing")` | `[logic](#logic())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Router](Router.html "class in akka.routing")` | `[removeRoutee](#removeRoutee(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` | Create a new instance without the [`ActorRefRoutee`](ActorRefRoutee.html "class in akka.routing") for the specified  [`ActorRef`](../actor/ActorRef.html "class in akka.actor"). |
	| `[Router](Router.html "class in akka.routing")` | `[removeRoutee](#removeRoutee(akka.actor.ActorSelection))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") sel)` | Create a new instance without the [`ActorSelectionRoutee`](ActorSelectionRoutee.html "class in akka.routing") for the specified  [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor"). |
	| `[Router](Router.html "class in akka.routing")` | `[removeRoutee](#removeRoutee(akka.routing.Routee))​([Routee](Routee.html "interface in akka.routing") routee)` | Create a new instance without the specified routee. |
	| `void` | `[route](#route(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` | Send the message to the destination [`Routee`](Routee.html "interface in akka.routing") selected by the [`RoutingLogic`](RoutingLogic.html "interface in akka.routing"). |
	| `scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>` | `[routees](#routees())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[RoutingLogic](RoutingLogic.html "interface in akka.routing"),​scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>>>` | `[unapply](#unapply(akka.routing.Router))​([Router](Router.html "class in akka.routing") x$0)` |  |
	| `[Router](Router.html "class in akka.routing")` | `[withRoutees](#withRoutees(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> rs)` | Create a new instance with the specified routees and the same [`RoutingLogic`](RoutingLogic.html "interface in akka.routing"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Router
		
		
		
		```
		public Router​([RoutingLogic](RoutingLogic.html "interface in akka.routing") logic,
		              scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		- #### Router
		
		
		
		```
		public Router​([RoutingLogic](RoutingLogic.html "interface in akka.routing") logic)
		```
		
		Java API
		- #### Router
		
		
		
		```
		public Router​([RoutingLogic](RoutingLogic.html "interface in akka.routing") logic,
		              java.lang.Iterable<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		
		Java API

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> $lessinit$greater$default$2()
		```
		- #### apply
		
		
		
		```
		public static [Router](Router.html "class in akka.routing") apply​([RoutingLogic](RoutingLogic.html "interface in akka.routing") logic,
		                           scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		- #### apply$default$2
		
		
		
		```
		public static scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> apply$default$2()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[RoutingLogic](RoutingLogic.html "interface in akka.routing"),​scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>>> unapply​([Router](Router.html "class in akka.routing") x$0)
		```
		- #### logic
		
		
		
		```
		public [RoutingLogic](RoutingLogic.html "interface in akka.routing") logic()
		```
		- #### routees
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees()
		```
		- #### route
		
		
		
		```
		public void route​(java.lang.Object message,
		                  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		Send the message to the destination [`Routee`](Routee.html "interface in akka.routing") selected by the [`RoutingLogic`](RoutingLogic.html "interface in akka.routing").
		 If the message is a [`RouterEnvelope`](RouterEnvelope.html "interface in akka.routing") it will be unwrapped
		 before sent to the destinations.
		 Messages wrapped in a [`Broadcast`](Broadcast.html "class in akka.routing") envelope are always sent to all `routees`.
		- #### withRoutees
		
		
		
		```
		public [Router](Router.html "class in akka.routing") withRoutees​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> rs)
		```
		
		Create a new instance with the specified routees and the same [`RoutingLogic`](RoutingLogic.html "interface in akka.routing").
		- #### addRoutee
		
		
		
		```
		public [Router](Router.html "class in akka.routing") addRoutee​([Routee](Routee.html "interface in akka.routing") routee)
		```
		
		Create a new instance with one more routee and the same [`RoutingLogic`](RoutingLogic.html "interface in akka.routing").
		- #### addRoutee
		
		
		
		```
		public [Router](Router.html "class in akka.routing") addRoutee​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		Create a new instance with one more [`ActorRefRoutee`](ActorRefRoutee.html "class in akka.routing") for the
		 specified [`ActorRef`](../actor/ActorRef.html "class in akka.actor") and the same [`RoutingLogic`](RoutingLogic.html "interface in akka.routing").
		- #### addRoutee
		
		
		
		```
		public [Router](Router.html "class in akka.routing") addRoutee​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") sel)
		```
		
		Create a new instance with one more [`ActorSelectionRoutee`](ActorSelectionRoutee.html "class in akka.routing") for the
		 specified [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor") and the same [`RoutingLogic`](RoutingLogic.html "interface in akka.routing").
		- #### removeRoutee
		
		
		
		```
		public [Router](Router.html "class in akka.routing") removeRoutee​([Routee](Routee.html "interface in akka.routing") routee)
		```
		
		Create a new instance without the specified routee.
		- #### removeRoutee
		
		
		
		```
		public [Router](Router.html "class in akka.routing") removeRoutee​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		Create a new instance without the [`ActorRefRoutee`](ActorRefRoutee.html "class in akka.routing") for the specified
		 [`ActorRef`](../actor/ActorRef.html "class in akka.actor").
		- #### removeRoutee
		
		
		
		```
		public [Router](Router.html "class in akka.routing") removeRoutee​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") sel)
		```
		
		Create a new instance without the [`ActorSelectionRoutee`](ActorSelectionRoutee.html "class in akka.routing") for the specified
		 [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor").
		- #### copy
		
		
		
		```
		public [Router](Router.html "class in akka.routing") copy​([RoutingLogic](RoutingLogic.html "interface in akka.routing") logic,
		                   scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		- #### copy$default$1
		
		
		
		```
		public [RoutingLogic](RoutingLogic.html "interface in akka.routing") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ActorRefRoutee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ActorSelectionRoutee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Broadcast.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html)*