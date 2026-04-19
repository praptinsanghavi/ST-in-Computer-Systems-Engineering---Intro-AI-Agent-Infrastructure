---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope$.html
title: Envelope$
---

# Envelope$

## Content

Package [akka.dispatch](package-summary.html)
## Class Envelope$

- java.lang.Object
- - akka.dispatch.Envelope$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Envelope$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.Envelope$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Envelope$](Envelope$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Envelope$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Envelope](Envelope.html "class in akka.dispatch")` | `[apply](#apply(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[Envelope](Envelope.html "class in akka.dispatch")` | `[apply](#apply(java.lang.Object,akka.actor.ActorRef,akka.actor.ActorSystem))​(java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor")>>` | `[unapply](#unapply(akka.dispatch.Envelope))​([Envelope](Envelope.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Envelope$](Envelope$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Envelope$
		
		
		
		```
		public Envelope$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Envelope](Envelope.html "class in akka.dispatch") apply​(java.lang.Object message,
		                      [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,
		                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public [Envelope](Envelope.html "class in akka.dispatch") apply​(java.lang.Object message,
		                      [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor")>> unapply​([Envelope](Envelope.html "class in akka.dispatch") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope$.html](https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope$.html)*