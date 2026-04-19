---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:08:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/NonBlockingBoundedMailbox.html
title: NonBlockingBoundedMailbox
---

# NonBlockingBoundedMailbox

## Content

Package [akka.dispatch](package-summary.html)
## Class NonBlockingBoundedMailbox

- java.lang.Object
- - akka.dispatch.NonBlockingBoundedMailbox

- All Implemented Interfaces:
`[MailboxType](MailboxType.html "interface in akka.dispatch")`, `[ProducesMessageQueue](ProducesMessageQueue.html "interface in akka.dispatch")<[BoundedNodeMessageQueue](BoundedNodeMessageQueue.html "class in akka.dispatch")>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class NonBlockingBoundedMailbox
extends java.lang.Object
implements [MailboxType](MailboxType.html "interface in akka.dispatch"), [ProducesMessageQueue](ProducesMessageQueue.html "interface in akka.dispatch")<[BoundedNodeMessageQueue](BoundedNodeMessageQueue.html "class in akka.dispatch")>, scala.Product, java.io.Serializable
```

NonBlockingBoundedMailbox is a high\-performance, multiple\-producer single\-consumer, bounded MailboxType,
 Noteworthy is that it discards overflow as DeadLetters.
 
 It can't have multiple consumers, which rules out using it with BalancingPool (BalancingDispatcher) for instance.
 

 NOTE: NonBlockingBoundedMailbox does not use `mailbox-push-timeout-time` as it is non\-blocking.

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.NonBlockingBoundedMailbox)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NonBlockingBoundedMailbox](#%3Cinit%3E(int))​(int capacity)` |  |
	| `[NonBlockingBoundedMailbox](#%3Cinit%3E(akka.actor.ActorSystem.Settings,com.typesafe.config.Config))​([ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") settings,  com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch")` | `[apply](#apply(int))​(int capacity)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[capacity](#capacity())()` |  |
	| `[NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch")` | `[copy](#copy(int))​(int capacity)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `[MessageQueue](MessageQueue.html "interface in akka.dispatch")` | `[create](#create(scala.Option,scala.Option))​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> owner,  scala.Option<[ActorSystem](../actor/ActorSystem.html "class in akka.actor")> system)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.dispatch.NonBlockingBoundedMailbox))​([NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### NonBlockingBoundedMailbox
		
		
		
		```
		public NonBlockingBoundedMailbox​(int capacity)
		```
		- #### NonBlockingBoundedMailbox
		
		
		
		```
		public NonBlockingBoundedMailbox​([ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") settings,
		                                 com.typesafe.config.Config config)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch") apply​(int capacity)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​([NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch") x$0)
		```
		- #### capacity
		
		
		
		```
		public int capacity()
		```
		- #### create
		
		
		
		```
		public final [MessageQueue](MessageQueue.html "interface in akka.dispatch") create​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> owner,
		                                 scala.Option<[ActorSystem](../actor/ActorSystem.html "class in akka.actor")> system)
		```
		
		
		Specified by:
		`[create](MailboxType.html#create(scala.Option,scala.Option))` in interface `[MailboxType](MailboxType.html "interface in akka.dispatch")`
		- #### copy
		
		
		
		```
		public [NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch") copy​(int capacity)
		```
		- #### copy$default$1
		
		
		
		```
		public int copy$default$1()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedNodeMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MailboxType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/NonBlockingBoundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ProducesMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/NonBlockingBoundedMailbox.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/NonBlockingBoundedMailbox.html)*