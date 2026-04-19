---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/ActorSystemSetup$.html
title: ActorSystemSetup$
---

# ActorSystemSetup$

## Content

Package [akka.actor.setup](package-summary.html)
## Class ActorSystemSetup$

- java.lang.Object
- - akka.actor.setup.ActorSystemSetup$

- ---

```
public class ActorSystemSetup$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorSystemSetup$](ActorSystemSetup$.html "class in akka.actor.setup")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSystemSetup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Setup](Setup.html "class in akka.actor.setup")> settings)` | Scala API: Create an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") containing all the provided settings |
	| `[ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup")` | `[create](#create(akka.actor.setup.Setup...))​([Setup](Setup.html "class in akka.actor.setup")... settings)` | Java API: Create an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") containing all the provided settings |
	| `[ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup")` | `[create](#create(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Setup](Setup.html "class in akka.actor.setup")> settings)` | Java API: Create an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") containing all the provided settings |
	| `[ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup")` | `[empty](#empty())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorSystemSetup$](ActorSystemSetup$.html "class in akka.actor.setup") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorSystemSetup$
		
		
		
		```
		public ActorSystemSetup$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup") create​([Setup](Setup.html "class in akka.actor.setup")... settings)
		```
		
		Java API: Create an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") containing all the provided settings
		- #### empty
		
		
		
		```
		public [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup") empty()
		```
		- #### apply
		
		
		
		```
		public [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup") apply​(scala.collection.immutable.Seq<[Setup](Setup.html "class in akka.actor.setup")> settings)
		```
		
		Scala API: Create an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") containing all the provided settings
		- #### create
		
		
		
		```
		public [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup") create​(scala.collection.immutable.Seq<[Setup](Setup.html "class in akka.actor.setup")> settings)
		```
		
		Java API: Create an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") containing all the provided settings

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/ActorSystemSetup$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/ActorSystemSetup$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/ActorSystemSetup$.html)*