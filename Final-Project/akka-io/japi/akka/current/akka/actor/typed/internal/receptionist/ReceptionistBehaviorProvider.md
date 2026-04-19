---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ReceptionistBehaviorProvider.html
title: ReceptionistBehaviorProvider
---

# ReceptionistBehaviorProvider

## Content

Package [akka.actor.typed.internal.receptionist](package-summary.html)
## Interface ReceptionistBehaviorProvider

- All Known Implementing Classes:
`[ClusterReceptionist$](../../../../cluster/typed/internal/receptionist/ClusterReceptionist$.html "class in akka.cluster.typed.internal.receptionist")`, `[LocalReceptionist$](LocalReceptionist$.html "class in akka.actor.typed.internal.receptionist")`

---

```
public interface ReceptionistBehaviorProvider
```

Marker interface to use with dynamic access
 
 INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../Behavior.html "class in akka.actor.typed")<[Receptionist.Command](../../receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")>` | `[behavior](#behavior())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |

- - ### Method Detail
	
	
	
		- #### behavior
		
		
		
		```
		[Behavior](../../Behavior.html "class in akka.actor.typed")<[Receptionist.Command](../../receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")> behavior()
		```
		- #### name
		
		
		
		```
		java.lang.String name()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/LocalReceptionist$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/receptionist/ClusterReceptionist$.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ReceptionistBehaviorProvider.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ReceptionistBehaviorProvider.html)*