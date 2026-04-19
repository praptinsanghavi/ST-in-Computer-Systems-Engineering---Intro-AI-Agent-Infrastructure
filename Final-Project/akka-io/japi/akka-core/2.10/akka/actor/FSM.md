---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:26:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/FSM.TransformHelper.html
title: FSM.TransformHelper
---

# FSM.TransformHelper

## Content

Package [akka.actor](package-summary.html)
## Class FSM.TransformHelper

- java.lang.Object
- - akka.actor.FSM.TransformHelper

- Enclosing interface:
[FSM](FSM.html "interface in akka.actor")\<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")\>

---

```
public static final class FSM.TransformHelper
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TransformHelper](#%3Cinit%3E(scala.PartialFunction))​(scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<D>,​[FSM.State](FSM.State.html "class in akka.actor")<S,​D>> func)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<D>,​[FSM.State](FSM.State.html "class in akka.actor")<S,​D>>` | `[using](#using(scala.PartialFunction))​(scala.PartialFunction<[FSM.State](FSM.State.html "class in akka.actor")<S,​D>,​[FSM.State](FSM.State.html "class in akka.actor")<S,​D>> andThen)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TransformHelper
		
		
		
		```
		public TransformHelper​(scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<D>,​[FSM.State](FSM.State.html "class in akka.actor")<S,​D>> func)
		```

	- ### Method Detail
	
	
	
		- #### using
		
		
		
		```
		public scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<D>,​[FSM.State](FSM.State.html "class in akka.actor")<S,​D>> using​(scala.PartialFunction<[FSM.State](FSM.State.html "class in akka.actor")<S,​D>,​[FSM.State](FSM.State.html "class in akka.actor")<S,​D>> andThen)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/FSM.Event.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/FSM.State.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/FSM.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/FSM.TransformHelper.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/FSM.TransformHelper.html)*