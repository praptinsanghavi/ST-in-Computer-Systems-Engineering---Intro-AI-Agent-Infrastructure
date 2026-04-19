---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/ActorRefFactoryAdapter.html
title: ActorRefFactoryAdapter
---

# ActorRefFactoryAdapter

## Content

Package [akka.actor.typed.internal.adapter](package-summary.html)
## Class ActorRefFactoryAdapter

- java.lang.Object
- - akka.actor.typed.internal.adapter.ActorRefFactoryAdapter

- ---

```
public class ActorRefFactoryAdapter
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorRefFactoryAdapter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.ActorRefFactory,akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props,boolean))​([ActorRefFactory](../../../ActorRefFactory.html "interface in akka.actor") actorRefFactory,  [Behavior](../../Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name,  [Props](../../Props.html "class in akka.actor.typed") props,  boolean rethrowTypedFailure)` |  |
	| `static <T> [ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T>` | `[spawnAnonymous](#spawnAnonymous(akka.actor.ActorRefFactory,akka.actor.typed.Behavior,akka.actor.typed.Props,boolean))​([ActorRefFactory](../../../ActorRefFactory.html "interface in akka.actor") context,  [Behavior](../../Behavior.html "class in akka.actor.typed")<T> behavior,  [Props](../../Props.html "class in akka.actor.typed") props,  boolean rethrowTypedFailure)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorRefFactoryAdapter
		
		
		
		```
		public ActorRefFactoryAdapter()
		```

	- ### Method Detail
	
	
	
		- #### spawnAnonymous
		
		
		
		```
		public static <T> [ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T> spawnAnonymous​([ActorRefFactory](../../../ActorRefFactory.html "interface in akka.actor") context,
		                                             [Behavior](../../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                             [Props](../../Props.html "class in akka.actor.typed") props,
		                                             boolean rethrowTypedFailure)
		```
		- #### spawn
		
		
		
		```
		public static <T> [ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T> spawn​([ActorRefFactory](../../../ActorRefFactory.html "interface in akka.actor") actorRefFactory,
		                                    [Behavior](../../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                    java.lang.String name,
		                                    [Props](../../Props.html "class in akka.actor.typed") props,
		                                    boolean rethrowTypedFailure)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/ActorRefFactoryAdapter.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/ActorRefFactoryAdapter.html)*