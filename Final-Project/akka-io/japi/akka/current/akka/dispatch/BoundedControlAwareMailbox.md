---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox.html
title: BoundedControlAwareMailbox
---

# BoundedControlAwareMailbox

## Content

Package [akka.dispatch](package-summary.html)
## Class BoundedControlAwareMailbox

- java.lang.Object
- - akka.dispatch.BoundedControlAwareMailbox

- All Implemented Interfaces:
`[MailboxType](MailboxType.html "interface in akka.dispatch")`, `[ProducesMessageQueue](ProducesMessageQueue.html "interface in akka.dispatch")<[BoundedControlAwareMailbox.MessageQueue](BoundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")>`, `[ProducesPushTimeoutSemanticsMailbox](ProducesPushTimeoutSemanticsMailbox.html "interface in akka.dispatch")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class BoundedControlAwareMailbox
extends java.lang.Object
implements [MailboxType](MailboxType.html "interface in akka.dispatch"), [ProducesMessageQueue](ProducesMessageQueue.html "interface in akka.dispatch")<[BoundedControlAwareMailbox.MessageQueue](BoundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")>, [ProducesPushTimeoutSemanticsMailbox](ProducesPushTimeoutSemanticsMailbox.html "interface in akka.dispatch"), scala.Product, java.io.Serializable
```

BoundedControlAwareMailbox is a bounded MailboxType, that maintains two queues
 to allow messages that extend [`ControlMessage`](ControlMessage.html "interface in akka.dispatch") to be delivered with priority.

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.BoundedControlAwareMailbox)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[BoundedControlAwareMailbox.MessageQueue](BoundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BoundedControlAwareMailbox](#%3Cinit%3E(int,scala.concurrent.duration.FiniteDuration))​(int capacity,  scala.concurrent.duration.FiniteDuration pushTimeOut)` |  |
	| `[BoundedControlAwareMailbox](#%3Cinit%3E(akka.actor.ActorSystem.Settings,com.typesafe.config.Config))​([ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") settings,  com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch")` | `[apply](#apply(int,scala.concurrent.duration.FiniteDuration))​(int capacity,  scala.concurrent.duration.FiniteDuration pushTimeOut)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[capacity](#capacity())()` |  |
	| `[BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch")` | `[copy](#copy(int,scala.concurrent.duration.FiniteDuration))​(int capacity,  scala.concurrent.duration.FiniteDuration pushTimeOut)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[copy$default$2](#copy$default$2())()` |  |
	| `[MessageQueue](MessageQueue.html "interface in akka.dispatch")` | `[create](#create(scala.Option,scala.Option))​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> owner,  scala.Option<[ActorSystem](../actor/ActorSystem.html "class in akka.actor")> system)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[pushTimeOut](#pushTimeOut())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.Object,​scala.concurrent.duration.FiniteDuration>>` | `[unapply](#unapply(akka.dispatch.BoundedControlAwareMailbox))​([BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### BoundedControlAwareMailbox
		
		
		
		```
		public BoundedControlAwareMailbox​(int capacity,
		                                  scala.concurrent.duration.FiniteDuration pushTimeOut)
		```
		- #### BoundedControlAwareMailbox
		
		
		
		```
		public BoundedControlAwareMailbox​([ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") settings,
		                                  com.typesafe.config.Config config)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch") apply​(int capacity,
		                                               scala.concurrent.duration.FiniteDuration pushTimeOut)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Object,​scala.concurrent.duration.FiniteDuration>> unapply​([BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch") x$0)
		```
		- #### capacity
		
		
		
		```
		public int capacity()
		```
		- #### pushTimeOut
		
		
		
		```
		public final scala.concurrent.duration.FiniteDuration pushTimeOut()
		```
		
		
		Specified by:
		`[pushTimeOut](ProducesPushTimeoutSemanticsMailbox.html#pushTimeOut())` in interface `[ProducesPushTimeoutSemanticsMailbox](ProducesPushTimeoutSemanticsMailbox.html "interface in akka.dispatch")`
		- #### create
		
		
		
		```
		public [MessageQueue](MessageQueue.html "interface in akka.dispatch") create​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> owner,
		                           scala.Option<[ActorSystem](../actor/ActorSystem.html "class in akka.actor")> system)
		```
		
		
		Specified by:
		`[create](MailboxType.html#create(scala.Option,scala.Option))` in interface `[MailboxType](MailboxType.html "interface in akka.dispatch")`
		- #### copy
		
		
		
		```
		public [BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch") copy​(int capacity,
		                                       scala.concurrent.duration.FiniteDuration pushTimeOut)
		```
		- #### copy$default$1
		
		
		
		```
		public int copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ControlMessage.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MailboxType.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ProducesMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ProducesPushTimeoutSemanticsMailbox.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox.html](https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox.html)*