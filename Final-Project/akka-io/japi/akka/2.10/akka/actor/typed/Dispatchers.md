---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:06:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Dispatchers.html
title: Dispatchers
---

# Dispatchers

## Content

Package [akka.actor.typed](package-summary.html)
## Class Dispatchers

- java.lang.Object
- - akka.actor.typed.Dispatchers

- ---

```
public abstract class Dispatchers
extends java.lang.Object
```

An [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") looks up all its thread pools via a Dispatchers instance.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Dispatchers](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[DefaultDispatcherId](#DefaultDispatcherId())()` | The id of the default dispatcher, also the full key of the  configuration of the default dispatcher. |
	| `static java.lang.String` | `[InternalDispatcherId](#InternalDispatcherId())()` | INTERNAL API |
	| `abstract scala.concurrent.ExecutionContextExecutor` | `[lookup](#lookup(akka.actor.typed.DispatcherSelector))​([DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed") selector)` |  |
	| `abstract void` | `[shutdown](#shutdown())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Dispatchers
		
		
		
		```
		public Dispatchers()
		```

	- ### Method Detail
	
	
	
		- #### DefaultDispatcherId
		
		
		
		```
		public static final java.lang.String DefaultDispatcherId()
		```
		
		The id of the default dispatcher, also the full key of the
		 configuration of the default dispatcher.
		- #### InternalDispatcherId
		
		
		
		```
		public static final java.lang.String InternalDispatcherId()
		```
		
		INTERNAL API
		- #### lookup
		
		
		
		```
		public abstract scala.concurrent.ExecutionContextExecutor lookup​([DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed") selector)
		```
		- #### shutdown
		
		
		
		```
		public abstract void shutdown()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Dispatchers.html](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Dispatchers.html)*