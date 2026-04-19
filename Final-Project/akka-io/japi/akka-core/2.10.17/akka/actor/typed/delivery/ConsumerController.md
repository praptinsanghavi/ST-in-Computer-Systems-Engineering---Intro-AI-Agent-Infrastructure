---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:29:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController.Start.html
title: ConsumerController.Start
---

# ConsumerController.Start

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class ConsumerController.Start\<A\>

- java.lang.Object
- - akka.actor.typed.delivery.ConsumerController.Start\<A\>

- All Implemented Interfaces:
`[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>`, `[ConsumerControllerImpl.InternalCommand](internal/ConsumerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")`, `[ConsumerControllerImpl.UnsealedInternalCommand](internal/ConsumerControllerImpl.UnsealedInternalCommand.html "interface in akka.actor.typed.delivery.internal")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[ConsumerController](ConsumerController.html "class in akka.actor.typed.delivery")

---

```
public static final class ConsumerController.Start<A>
extends java.lang.Object
implements [ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>, scala.Product, java.io.Serializable
```

Initial message from the consumer actor. The `deliverTo` is typically constructed
 as a message adapter to map the [`ConsumerController.Delivery`](ConsumerController.Delivery.html "class in akka.actor.typed.delivery") to the protocol of the consumer actor.
 
 If the consumer is restarted it should send a new `Start` message to the
 `ConsumerController`.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.delivery.ConsumerController.Start)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Start](#%3Cinit%3E(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<[A](ConsumerController.Start.html "type parameter in ConsumerController.Start")>> deliverTo)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<A> [ConsumerController.Start](ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>` | `[copy](#copy(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A>> deliverTo)` |  |
	| `<A> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A>>` | `[copy$default$1](#copy$default$1())()` |  |
	| `[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<[A](ConsumerController.Start.html "type parameter in ConsumerController.Start")>>` | `[deliverTo](#deliverTo())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Start
		
		
		
		```
		public Start​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<[A](ConsumerController.Start.html "type parameter in ConsumerController.Start")>> deliverTo)
		```

	- ### Method Detail
	
	
	
		- #### deliverTo
		
		
		
		```
		public [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<[A](ConsumerController.Start.html "type parameter in ConsumerController.Start")>> deliverTo()
		```
		- #### copy
		
		
		
		```
		public <A> [ConsumerController.Start](ConsumerController.Start.html "class in akka.actor.typed.delivery")<A> copy​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A>> deliverTo)
		```
		- #### copy$default$1
		
		
		
		```
		public <A> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A>> copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController.Command.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController.Delivery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController.Start.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/internal/ConsumerControllerImpl.InternalCommand.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/internal/ConsumerControllerImpl.UnsealedInternalCommand.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController.Start.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController.Start.html)*