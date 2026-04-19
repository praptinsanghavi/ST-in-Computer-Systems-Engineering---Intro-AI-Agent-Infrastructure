---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/SingletonActor$.html
title: SingletonActor$
---

# SingletonActor$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class SingletonActor$

- java.lang.Object
- - akka.cluster.typed.SingletonActor$

- ---

```
public class SingletonActor$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SingletonActor$](SingletonActor$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SingletonActor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<M> [SingletonActor](SingletonActor.html "class in akka.cluster.typed")<M>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../../actor/typed/Behavior.html "class in akka.actor.typed")<M> behavior,  java.lang.String name)` |  |
	| `<M> [SingletonActor](SingletonActor.html "class in akka.cluster.typed")<M>` | `[of](#of(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../../actor/typed/Behavior.html "class in akka.actor.typed")<M> behavior,  java.lang.String name)` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SingletonActor$](SingletonActor$.html "class in akka.cluster.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SingletonActor$
		
		
		
		```
		public SingletonActor$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <M> [SingletonActor](SingletonActor.html "class in akka.cluster.typed")<M> apply​([Behavior](../../actor/typed/Behavior.html "class in akka.actor.typed")<M> behavior,
		                                   java.lang.String name)
		```
		
		
		Parameters:
		`name` \- Unique name for the singleton
		`behavior` \- Behavior for the singleton
		- #### of
		
		
		
		```
		public <M> [SingletonActor](SingletonActor.html "class in akka.cluster.typed")<M> of​([Behavior](../../actor/typed/Behavior.html "class in akka.actor.typed")<M> behavior,
		                                java.lang.String name)
		```
		
		Java API
		 
		
		Parameters:
		`name` \- Unique name for the singleton
		`behavior` \- Behavior for the singleton

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/SingletonActor$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/SingletonActor.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/SingletonActor$.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/SingletonActor$.html)*