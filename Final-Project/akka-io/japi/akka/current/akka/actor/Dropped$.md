---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/Dropped$.html
title: Dropped$
---

# Dropped$

## Content

Package [akka.actor](package-summary.html)
## Class Dropped$

- java.lang.Object
- - akka.actor.Dropped$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Dropped$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Dropped$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Dropped$](Dropped$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Dropped$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Dropped](Dropped.html "class in akka.actor")` | `[apply](#apply(java.lang.Object,java.lang.String,akka.actor.ActorRef))​(java.lang.Object message,  java.lang.String reason,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` | Convenience for creating `Dropped` without a `sender`. |
	| `[Dropped](Dropped.html "class in akka.actor")` | `[apply](#apply(java.lang.Object,java.lang.String,akka.actor.ActorRef,akka.actor.ActorRef))​(java.lang.Object message,  java.lang.String reason,  [ActorRef](ActorRef.html "class in akka.actor") sender,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` |  |
	| `scala.Option<scala.Tuple4<java.lang.Object,​java.lang.String,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor")>>` | `[unapply](#unapply(akka.actor.Dropped))​([Dropped](Dropped.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Dropped$](Dropped$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Dropped$
		
		
		
		```
		public Dropped$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Dropped](Dropped.html "class in akka.actor") apply​(java.lang.Object message,
		                     java.lang.String reason,
		                     [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```
		
		Convenience for creating `Dropped` without a `sender`.
		- #### apply
		
		
		
		```
		public [Dropped](Dropped.html "class in akka.actor") apply​(java.lang.Object message,
		                     java.lang.String reason,
		                     [ActorRef](ActorRef.html "class in akka.actor") sender,
		                     [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.Object,​java.lang.String,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor")>> unapply​([Dropped](Dropped.html "class in akka.actor") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Dropped$.html
- https://doc.akka.io/japi/akka/current/akka/actor/Dropped.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/Dropped$.html](https://doc.akka.io/japi/akka/current/akka/actor/Dropped$.html)*