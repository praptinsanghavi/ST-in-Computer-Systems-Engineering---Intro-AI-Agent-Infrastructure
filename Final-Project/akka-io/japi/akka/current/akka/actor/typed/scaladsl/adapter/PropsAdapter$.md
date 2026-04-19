---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/adapter/PropsAdapter$.html
title: PropsAdapter$
---

# PropsAdapter$

## Content

Package [akka.actor.typed.scaladsl.adapter](package-summary.html)
## Class PropsAdapter$

- java.lang.Object
- - akka.actor.typed.scaladsl.adapter.PropsAdapter$

- ---

```
public class PropsAdapter$
extends java.lang.Object
```

Wrap [`Behavior`](../../Behavior.html "class in akka.actor.typed") in a classic [`Props`](../../../Props.html "class in akka.actor"), i.e. when
 spawning a typed child actor from a classic parent actor.
 This is normally not needed because you can use the extension methods
 `spawn` and `spawnAnonymous` on a classic `ActorContext`, but it's needed
 when using typed actors with an existing library/tool that provides an API that
 takes a classic [`Props`](../../../Props.html "class in akka.actor") parameter. Cluster Sharding is an
 example of that.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PropsAdapter$](PropsAdapter$.html "class in akka.actor.typed.scaladsl.adapter")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PropsAdapter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Props](../../../Props.html "class in akka.actor")` | `[apply](#apply(scala.Function0,akka.actor.typed.Props))​(scala.Function0<[Behavior](../../Behavior.html "class in akka.actor.typed")<T>> behavior,  [Props](../../Props.html "class in akka.actor.typed") deploy)` |  |
	| `<T> [Props](../../Props.html "class in akka.actor.typed")` | `[apply$default$2](#apply$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PropsAdapter$](PropsAdapter$.html "class in akka.actor.typed.scaladsl.adapter") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PropsAdapter$
		
		
		
		```
		public PropsAdapter$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Props](../../../Props.html "class in akka.actor") apply​(scala.Function0<[Behavior](../../Behavior.html "class in akka.actor.typed")<T>> behavior,
		                       [Props](../../Props.html "class in akka.actor.typed") deploy)
		```
		- #### apply$default$2
		
		
		
		```
		public <T> [Props](../../Props.html "class in akka.actor.typed") apply$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/adapter/PropsAdapter$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/adapter/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/adapter/PropsAdapter$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/adapter/PropsAdapter$.html)*