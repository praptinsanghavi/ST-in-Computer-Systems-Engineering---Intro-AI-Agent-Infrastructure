---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSentAck$.html
title: DurableProducerQueue.StoreMessageSentAck$
---

# DurableProducerQueue.StoreMessageSentAck$

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class DurableProducerQueue.StoreMessageSentAck$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Object,​[DurableProducerQueue.StoreMessageSentAck](DurableProducerQueue.StoreMessageSentAck.html "class in akka.actor.typed.delivery")\>
	- - akka.actor.typed.delivery.DurableProducerQueue.StoreMessageSentAck$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Object,​[DurableProducerQueue.StoreMessageSentAck](DurableProducerQueue.StoreMessageSentAck.html "class in akka.actor.typed.delivery")>`

Enclosing class:
[DurableProducerQueue](DurableProducerQueue.html "class in akka.actor.typed.delivery")

---

```
public static class DurableProducerQueue.StoreMessageSentAck$
extends scala.runtime.AbstractFunction1<java.lang.Object,​[DurableProducerQueue.StoreMessageSentAck](DurableProducerQueue.StoreMessageSentAck.html "class in akka.actor.typed.delivery")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.delivery.DurableProducerQueue.StoreMessageSentAck$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DurableProducerQueue.StoreMessageSentAck$](DurableProducerQueue.StoreMessageSentAck$.html "class in akka.actor.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StoreMessageSentAck$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DurableProducerQueue.StoreMessageSentAck](DurableProducerQueue.StoreMessageSentAck.html "class in akka.actor.typed.delivery")` | `[apply](#apply(long))​(long storedSeqNr)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.actor.typed.delivery.DurableProducerQueue.StoreMessageSentAck))​([DurableProducerQueue.StoreMessageSentAck](DurableProducerQueue.StoreMessageSentAck.html "class in akka.actor.typed.delivery") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DurableProducerQueue.StoreMessageSentAck$](DurableProducerQueue.StoreMessageSentAck$.html "class in akka.actor.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StoreMessageSentAck$
		
		
		
		```
		public StoreMessageSentAck$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​[DurableProducerQueue.StoreMessageSentAck](DurableProducerQueue.StoreMessageSentAck.html "class in akka.actor.typed.delivery")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Object,​[DurableProducerQueue.StoreMessageSentAck](DurableProducerQueue.StoreMessageSentAck.html "class in akka.actor.typed.delivery")>`
		- #### apply
		
		
		
		```
		public [DurableProducerQueue.StoreMessageSentAck](DurableProducerQueue.StoreMessageSentAck.html "class in akka.actor.typed.delivery") apply​(long storedSeqNr)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​([DurableProducerQueue.StoreMessageSentAck](DurableProducerQueue.StoreMessageSentAck.html "class in akka.actor.typed.delivery") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSentAck$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSentAck.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSentAck$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSentAck$.html)*