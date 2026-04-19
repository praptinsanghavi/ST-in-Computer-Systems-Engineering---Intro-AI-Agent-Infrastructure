---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Unsubscribe$.html
title: Unsubscribe$
---

# Unsubscribe$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class Unsubscribe$

- java.lang.Object
- - akka.cluster.typed.Unsubscribe$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Unsubscribe$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.Unsubscribe$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Unsubscribe$](Unsubscribe$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unsubscribe$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Unsubscribe](Unsubscribe.html "class in akka.cluster.typed")<T>` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T> subscriber)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>>` | `[unapply](#unapply(akka.cluster.typed.Unsubscribe))​([Unsubscribe](Unsubscribe.html "class in akka.cluster.typed")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Unsubscribe$](Unsubscribe$.html "class in akka.cluster.typed") MODULE$
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
		public <T> [Unsubscribe](Unsubscribe.html "class in akka.cluster.typed")<T> apply​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T> subscriber)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>> unapply​([Unsubscribe](Unsubscribe.html "class in akka.cluster.typed")<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Unsubscribe$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Unsubscribe.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Unsubscribe$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Unsubscribe$.html)*