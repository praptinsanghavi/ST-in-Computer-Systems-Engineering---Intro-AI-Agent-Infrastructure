---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRefScope.html
title: ActorRefScope
---

# ActorRefScope

## Content

Package [akka.actor](package-summary.html)
## Interface ActorRefScope

- All Known Subinterfaces:
`[LocalRef](LocalRef.html "interface in akka.actor")`, `[MinimalActorRef](MinimalActorRef.html "interface in akka.actor")`, `[RemoteRef](../remote/RemoteRef.html "interface in akka.remote")`, `[RepointableRef](RepointableRef.html "interface in akka.actor")`

All Known Implementing Classes:
`[Logging.StandardOutLogger](../event/Logging.StandardOutLogger.html "class in akka.event")`, `[Nobody$](Nobody$.html "class in akka.actor")`

---

```
public interface ActorRefScope
```

All ActorRefs have a scope which describes where they live. Since it is
 often necessary to distinguish between local and non\-local references, this
 is the only method provided on the scope.
 
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/LocalRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/MinimalActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Nobody$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/RepointableRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.StandardOutLogger.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/RemoteRef.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRefScope.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRefScope.html)*