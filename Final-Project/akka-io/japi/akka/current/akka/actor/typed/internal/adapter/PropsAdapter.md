---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/PropsAdapter.html
title: PropsAdapter
---

# PropsAdapter

## Content

Package [akka.actor.typed.internal.adapter](package-summary.html)
## Class PropsAdapter

- java.lang.Object
- - akka.actor.typed.internal.adapter.PropsAdapter

- ---

```
public class PropsAdapter
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PropsAdapter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Props](../../../Props.html "class in akka.actor")` | `[apply](#apply(scala.Function0,akka.actor.typed.Props,boolean))​(scala.Function0<[Behavior](../../Behavior.html "class in akka.actor.typed")<T>> behavior,  [Props](../../Props.html "class in akka.actor.typed") props,  boolean rethrowTypedFailure)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PropsAdapter
		
		
		
		```
		public PropsAdapter()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Props](../../../Props.html "class in akka.actor") apply​(scala.Function0<[Behavior](../../Behavior.html "class in akka.actor.typed")<T>> behavior,
		                              [Props](../../Props.html "class in akka.actor.typed") props,
		                              boolean rethrowTypedFailure)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/PropsAdapter.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/PropsAdapter.html)*