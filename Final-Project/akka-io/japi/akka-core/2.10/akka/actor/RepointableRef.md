---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:11:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/RepointableRef.html
title: RepointableRef
---

# RepointableRef

## Content

Package [akka.actor](package-summary.html)
## Interface RepointableRef

- All Superinterfaces:
`[ActorRefScope](ActorRefScope.html "interface in akka.actor")`

---

```
public interface RepointableRef
extends [ActorRefScope](ActorRefScope.html "interface in akka.actor")
```

RepointableActorRef (and potentially others) may change their locality at
 runtime, meaning that isLocal might not be stable. RepointableActorRef has
 the feature that it starts out \&ldquo;not fully started\&rdquo; (but you can send to it),
 which is why `isStarted` features here; it is not improbable that cluster
 actor refs will have the same behavior.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isStarted](#isStarted())()` |  |
	
	
		- ### Methods inherited from interface akka.actor.[ActorRefScope](ActorRefScope.html "interface in akka.actor")
		
		
		`[isLocal](ActorRefScope.html#isLocal())`

- - ### Method Detail
	
	
	
		- #### isStarted
		
		
		
		```
		boolean isStarted()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRefScope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/RepointableRef.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/RepointableRef.html)*