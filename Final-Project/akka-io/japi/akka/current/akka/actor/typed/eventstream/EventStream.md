---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/eventstream/EventStream.Unsubscribe$.html
title: EventStream.Unsubscribe$
---

# EventStream.Unsubscribe$

## Content

Package [akka.actor.typed.eventstream](package-summary.html)
## Class EventStream.Unsubscribe$

- java.lang.Object
- - akka.actor.typed.eventstream.EventStream.Unsubscribe$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[EventStream](EventStream.html "class in akka.actor.typed.eventstream")

---

```
public static class EventStream.Unsubscribe$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.eventstream.EventStream.Unsubscribe$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventStream.Unsubscribe$](EventStream.Unsubscribe$.html "class in akka.actor.typed.eventstream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unsubscribe$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<E> [EventStream.Unsubscribe](EventStream.Unsubscribe.html "class in akka.actor.typed.eventstream")<E>` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<E> subscriber)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<E> scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<E>>` | `[unapply](#unapply(akka.actor.typed.eventstream.EventStream.Unsubscribe))​([EventStream.Unsubscribe](EventStream.Unsubscribe.html "class in akka.actor.typed.eventstream")<E> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventStream.Unsubscribe$](EventStream.Unsubscribe$.html "class in akka.actor.typed.eventstream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Unsubscribe$
		
		
		
		```
		public Unsubscribe$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <E> [EventStream.Unsubscribe](EventStream.Unsubscribe.html "class in akka.actor.typed.eventstream")<E> apply​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<E> subscriber)
		```
		- #### unapply
		
		
		
		```
		public <E> scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<E>> unapply​([EventStream.Unsubscribe](EventStream.Unsubscribe.html "class in akka.actor.typed.eventstream")<E> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/eventstream/EventStream.Unsubscribe$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/eventstream/EventStream.Unsubscribe.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/eventstream/EventStream.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/eventstream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/eventstream/EventStream.Unsubscribe$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/eventstream/EventStream.Unsubscribe$.html)*