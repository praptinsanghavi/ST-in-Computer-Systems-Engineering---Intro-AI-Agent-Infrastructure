---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/LocalRef.html
title: LocalRef
---

# LocalRef

## Content

Package [akka.actor](package-summary.html)
## Interface LocalRef

- All Superinterfaces:
`[ActorRefScope](ActorRefScope.html "interface in akka.actor")`

All Known Subinterfaces:
`[MinimalActorRef](MinimalActorRef.html "interface in akka.actor")`

All Known Implementing Classes:
`[Logging.StandardOutLogger](../event/Logging.StandardOutLogger.html "class in akka.event")`, `[Nobody$](Nobody$.html "class in akka.actor")`

---

```
public interface LocalRef
extends [ActorRefScope](ActorRefScope.html "interface in akka.actor")
```

Refs which are statically known to be local inherit from this Scope
 
 Internal API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isLocal](#isLocal())()` |  |

- - ### Method Detail
	
	
	
		- #### isLocal
		
		
		
		```
		boolean isLocal()
		```
		
		
		Specified by:
		`[isLocal](ActorRefScope.html#isLocal())` in interface `[ActorRefScope](ActorRefScope.html "interface in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRefScope.html
- https://doc.akka.io/japi/akka/current/akka/actor/MinimalActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Nobody$.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.StandardOutLogger.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/LocalRef.html](https://doc.akka.io/japi/akka/current/akka/actor/LocalRef.html)*