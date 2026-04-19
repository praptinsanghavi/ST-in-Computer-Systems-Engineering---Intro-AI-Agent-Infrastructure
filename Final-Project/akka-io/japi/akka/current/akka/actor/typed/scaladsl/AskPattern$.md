---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/AskPattern$.html
title: AskPattern$
---

# AskPattern$

## Content

Package [akka.actor.typed.scaladsl](package-summary.html)
## Class AskPattern$

- java.lang.Object
- - akka.actor.typed.scaladsl.AskPattern$

- ---

```
public class AskPattern$
extends java.lang.Object
```

The ask\-pattern implements the initiator side of a request–reply protocol.
 
 See `AskPattern.Askable.ask` for details

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AskPattern$](AskPattern$.html "class in akka.actor.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AskPattern$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Req> [AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")<Req>` | `[Askable](#Askable(akka.actor.typed.RecipientRef))​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> ref)` |  |
	| `[Scheduler](../Scheduler.html "interface in akka.actor.typed")` | `[schedulerFromActorSystem](#schedulerFromActorSystem(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` | Provides a scheduler from an actor system (that will likely already be implicit in the scope) to minimize ask  boilerplate. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AskPattern$](AskPattern$.html "class in akka.actor.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AskPattern$
		
		
		
		```
		public AskPattern$()
		```

	- ### Method Detail
	
	
	
		- #### schedulerFromActorSystem
		
		
		
		```
		public [Scheduler](../Scheduler.html "interface in akka.actor.typed") schedulerFromActorSystem​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Provides a scheduler from an actor system (that will likely already be implicit in the scope) to minimize ask
		 boilerplate.
		- #### Askable
		
		
		
		```
		public final <Req> [AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")<Req> Askable​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> ref)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Scheduler.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/AskPattern$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/AskPattern.Askable.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/AskPattern$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/AskPattern$.html)*