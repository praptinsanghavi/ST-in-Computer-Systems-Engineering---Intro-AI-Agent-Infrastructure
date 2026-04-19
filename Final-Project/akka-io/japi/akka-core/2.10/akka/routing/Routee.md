---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html
title: Routee
---

# Routee

## Content

Package [akka.routing](package-summary.html)
## Interface Routee

- All Known Implementing Classes:
`[ActorRefRoutee](ActorRefRoutee.html "class in akka.routing")`, `[ActorSelectionRoutee](ActorSelectionRoutee.html "class in akka.routing")`, `[NoRoutee$](NoRoutee$.html "class in akka.routing")`, `[SeveralRoutees](SeveralRoutees.html "class in akka.routing")`

---

```
public interface Routee
```

Abstraction of a destination for messages routed via a [`Router`](Router.html "class in akka.routing").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[send](#send(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |

- - ### Method Detail
	
	
	
		- #### send
		
		
		
		```
		void send​(java.lang.Object message,
		          [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ActorRefRoutee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ActorSelectionRoutee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/NoRoutee$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/SeveralRoutees.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html)*