---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:08:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedControlAwareMailbox.html
title: UnboundedControlAwareMailbox
---

# UnboundedControlAwareMailbox

## Content

Package [akka.dispatch](package-summary.html)
## Class UnboundedControlAwareMailbox

- java.lang.Object
- - akka.dispatch.UnboundedControlAwareMailbox

- All Implemented Interfaces:
`[MailboxType](MailboxType.html "interface in akka.dispatch")`, `[ProducesMessageQueue](ProducesMessageQueue.html "interface in akka.dispatch")<[UnboundedControlAwareMailbox.MessageQueue](UnboundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class UnboundedControlAwareMailbox
extends java.lang.Object
implements [MailboxType](MailboxType.html "interface in akka.dispatch"), [ProducesMessageQueue](ProducesMessageQueue.html "interface in akka.dispatch")<[UnboundedControlAwareMailbox.MessageQueue](UnboundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")>, scala.Product, java.io.Serializable
```

UnboundedControlAwareMailbox is an unbounded MailboxType, that maintains two queues
 to allow messages that extend [`ControlMessage`](ControlMessage.html "interface in akka.dispatch") to be delivered with priority.

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.UnboundedControlAwareMailbox)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[UnboundedControlAwareMailbox.MessageQueue](UnboundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnboundedControlAwareMailbox](#%3Cinit%3E())()` |  |
	| `[UnboundedControlAwareMailbox](#%3Cinit%3E(akka.actor.ActorSystem.Settings,com.typesafe.config.Config))​([ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") settings,  com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [UnboundedControlAwareMailbox](UnboundedControlAwareMailbox.html "class in akka.dispatch")` | `[apply](#apply())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[UnboundedControlAwareMailbox](UnboundedControlAwareMailbox.html "class in akka.dispatch")` | `[copy](#copy())()` |  |
	| `[MessageQueue](MessageQueue.html "interface in akka.dispatch")` | `[create](#create(scala.Option,scala.Option))​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> owner,  scala.Option<[ActorSystem](../actor/ActorSystem.html "class in akka.actor")> system)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static boolean` | `[unapply](#unapply(akka.dispatch.UnboundedControlAwareMailbox))​([UnboundedControlAwareMailbox](UnboundedControlAwareMailbox.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### UnboundedControlAwareMailbox
		
		
		
		```
		public UnboundedControlAwareMailbox()
		```
		- #### UnboundedControlAwareMailbox
		
		
		
		```
		public UnboundedControlAwareMailbox​([ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") settings,
		                                    com.typesafe.config.Config config)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [UnboundedControlAwareMailbox](UnboundedControlAwareMailbox.html "class in akka.dispatch") apply()
		```
		- #### unapply
		
		
		
		```
		public static boolean unapply​([UnboundedControlAwareMailbox](UnboundedControlAwareMailbox.html "class in akka.dispatch") x$0)
		```
		- #### create
		
		
		
		```
		public [MessageQueue](MessageQueue.html "interface in akka.dispatch") create​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> owner,
		                           scala.Option<[ActorSystem](../actor/ActorSystem.html "class in akka.actor")> system)
		```
		
		
		Specified by:
		`[create](MailboxType.html#create(scala.Option,scala.Option))` in interface `[MailboxType](MailboxType.html "interface in akka.dispatch")`
		- #### copy
		
		
		
		```
		public [UnboundedControlAwareMailbox](UnboundedControlAwareMailbox.html "class in akka.dispatch") copy()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ControlMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MailboxType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ProducesMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedControlAwareMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedControlAwareMailbox.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedControlAwareMailbox.html)*