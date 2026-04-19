---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:39:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/Terminated$.html
title: Terminated$
---

# Terminated$

## Content

Package [akka.actor.typed](package-summary.html)
## Class Terminated$

- java.lang.Object
- - akka.actor.typed.Terminated$

- ---

```
public class Terminated$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Terminated$](Terminated$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Terminated$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Terminated](Terminated.html "class in akka.actor.typed")` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref)` |  |
	| `scala.Option<[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>>` | `[unapply](#unapply(akka.actor.typed.Terminated))​([Terminated](Terminated.html "class in akka.actor.typed") t)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Terminated$](Terminated$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Terminated$
		
		
		
		```
		public Terminated$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Terminated](Terminated.html "class in akka.actor.typed") apply​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>> unapply​([Terminated](Terminated.html "class in akka.actor.typed") t)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Terminated$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Terminated.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/Terminated$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/Terminated$.html)*