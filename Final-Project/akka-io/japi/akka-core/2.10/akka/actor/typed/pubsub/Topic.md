---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:39:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.Unsubscribe$.html
title: Topic.Unsubscribe$
---

# Topic.Unsubscribe$

## Content

Package [akka.actor.typed.pubsub](package-summary.html)
## Class Topic.Unsubscribe$

- java.lang.Object
- - akka.actor.typed.pubsub.Topic.Unsubscribe$

- Enclosing class:
[Topic](Topic.html "class in akka.actor.typed.pubsub")

---

```
public static class Topic.Unsubscribe$
extends java.lang.Object
```

Scala API: Unsubscribe a previously subscribed actor from this topic.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Topic.Unsubscribe$](Topic.Unsubscribe$.html "class in akka.actor.typed.pubsub")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unsubscribe$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> subscriber)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Topic.Unsubscribe$](Topic.Unsubscribe$.html "class in akka.actor.typed.pubsub") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Unsubscribe$
		
		
		
		```
		public Unsubscribe$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T> apply​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> subscriber)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.Unsubscribe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.Unsubscribe$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.Unsubscribe$.html)*