---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ReceptionistSetup.html
title: ReceptionistSetup
---

# ReceptionistSetup

## Content

Package [akka.actor.typed.receptionist](package-summary.html)
## Class ReceptionistSetup

- java.lang.Object
- - [akka.actor.setup.Setup](../../setup/Setup.html "class in akka.actor.setup")
	- - [akka.actor.typed.ExtensionSetup](../ExtensionSetup.html "class in akka.actor.typed")\<[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")\>
		- - akka.actor.typed.receptionist.ReceptionistSetup

- ---

```
public final class ReceptionistSetup
extends [ExtensionSetup](../ExtensionSetup.html "class in akka.actor.typed")<[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")>
```

Can be used in [`ActorSystemSetup`](../../setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the `ActorSystem`
 to replace the default implementation of the [`Receptionist`](Receptionist.html "class in akka.actor.typed.receptionist") extension. Intended
 for tests that need to replace extension with stub/mock implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReceptionistSetup](#%3Cinit%3E(java.util.function.Function))​(java.util.function.Function<[ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?>,​[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")> createExtension)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T extends [Extension](../Extension.html "interface in akka.actor.typed")>[ReceptionistSetup](ReceptionistSetup.html "class in akka.actor.typed.receptionist")` | `[apply](#apply(scala.Function1))​(scala.Function1<[ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?>,​[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")> createExtension)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionSetup](../ExtensionSetup.html "class in akka.actor.typed")
		
		
		`[createExtension](../ExtensionSetup.html#createExtension()), [extId](../ExtensionSetup.html#extId())`
		- ### Methods inherited from class akka.actor.setup.[Setup](../../setup/Setup.html "class in akka.actor.setup")
		
		
		`[and](../../setup/Setup.html#and(akka.actor.setup.Setup))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReceptionistSetup
		
		
		
		```
		public ReceptionistSetup​(java.util.function.Function<[ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?>,​[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")> createExtension)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T extends [Extension](../Extension.html "interface in akka.actor.typed")> [ReceptionistSetup](ReceptionistSetup.html "class in akka.actor.typed.receptionist") apply​(scala.Function1<[ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?>,​[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")> createExtension)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka/current/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ReceptionistSetup.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ReceptionistSetup.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ReceptionistSetup.html)*