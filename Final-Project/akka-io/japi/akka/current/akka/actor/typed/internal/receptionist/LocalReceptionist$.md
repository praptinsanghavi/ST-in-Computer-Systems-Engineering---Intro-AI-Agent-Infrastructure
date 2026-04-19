---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/LocalReceptionist$.html
title: LocalReceptionist$
---

# LocalReceptionist$

## Content

Package [akka.actor.typed.internal.receptionist](package-summary.html)
## Class LocalReceptionist$

- java.lang.Object
- - akka.actor.typed.internal.receptionist.LocalReceptionist$

- All Implemented Interfaces:
`[ReceptionistBehaviorProvider](ReceptionistBehaviorProvider.html "interface in akka.actor.typed.internal.receptionist")`

---

```
public class LocalReceptionist$
extends java.lang.Object
implements [ReceptionistBehaviorProvider](ReceptionistBehaviorProvider.html "interface in akka.actor.typed.internal.receptionist")
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LocalReceptionist$](LocalReceptionist$.html "class in akka.actor.typed.internal.receptionist")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LocalReceptionist$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../Behavior.html "class in akka.actor.typed")<[Receptionist.Command](../../receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")>` | `[behavior](#behavior())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LocalReceptionist$](LocalReceptionist$.html "class in akka.actor.typed.internal.receptionist") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LocalReceptionist$
		
		
		
		```
		public LocalReceptionist$()
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		
		Specified by:
		`[name](ReceptionistBehaviorProvider.html#name())` in interface `[ReceptionistBehaviorProvider](ReceptionistBehaviorProvider.html "interface in akka.actor.typed.internal.receptionist")`
		- #### behavior
		
		
		
		```
		public [Behavior](../../Behavior.html "class in akka.actor.typed")<[Receptionist.Command](../../receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")> behavior()
		```
		
		
		Specified by:
		`[behavior](ReceptionistBehaviorProvider.html#behavior())` in interface `[ReceptionistBehaviorProvider](ReceptionistBehaviorProvider.html "interface in akka.actor.typed.internal.receptionist")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/LocalReceptionist$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ReceptionistBehaviorProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.Command.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/LocalReceptionist$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/LocalReceptionist$.html)*