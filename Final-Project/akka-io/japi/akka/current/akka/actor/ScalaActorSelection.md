---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/ScalaActorSelection.html
title: ScalaActorSelection
---

# ScalaActorSelection

## Content

Package [akka.actor](package-summary.html)
## Interface ScalaActorSelection

- ---

```
public interface ScalaActorSelection
```

Contains the Scala API (!\-method) for ActorSelections) which provides automatic tracking of the sender,
 as per the usual implicit ActorRef pattern.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[$bang](#$bang(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object msg,  [ActorRef](ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[$bang$default$2](#$bang$default$2(java.lang.Object))​(java.lang.Object msg)` |  |

- - ### Method Detail
	
	
	
		- #### $bang
		
		
		
		```
		void $bang​(java.lang.Object msg,
		           [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		- #### $bang$default$2
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") $bang$default$2​(java.lang.Object msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/ScalaActorSelection.html](https://doc.akka.io/japi/akka/current/akka/actor/ScalaActorSelection.html)*