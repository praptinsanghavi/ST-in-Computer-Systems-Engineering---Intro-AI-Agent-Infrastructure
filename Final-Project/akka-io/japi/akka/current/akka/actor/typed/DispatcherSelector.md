---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:39:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/DispatcherSelector.html
title: DispatcherSelector
---

# DispatcherSelector

## Content

Package [akka.actor.typed](package-summary.html)
## Class DispatcherSelector

- java.lang.Object
- - [akka.actor.typed.Props](Props.html "class in akka.actor.typed")
	- - akka.actor.typed.DispatcherSelector

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Direct Known Subclasses:
`[PropsImpl.DispatcherDefault](internal/PropsImpl.DispatcherDefault.html "class in akka.actor.typed.internal")`, `[PropsImpl.DispatcherFromConfig](internal/PropsImpl.DispatcherFromConfig.html "class in akka.actor.typed.internal")`, `[PropsImpl.DispatcherSameAsParent](internal/PropsImpl.DispatcherSameAsParent.html "class in akka.actor.typed.internal")`

---

```
public abstract class DispatcherSelector
extends [Props](Props.html "class in akka.actor.typed")
```

Not for user extension.

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.DispatcherSelector)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DispatcherSelector](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed")` | `[blocking](#blocking())()` | Run the actor on the default blocking dispatcher that is  configured under default\-blocking\-io\-dispatcher |
	| `static [DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed")` | `[defaultDispatcher](#defaultDispatcher())()` | Java API:  Run the actor on the default [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") executor. |
	| `static [DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed")` | `[fromConfig](#fromConfig(java.lang.String))​(java.lang.String path)` | Look up an executor definition in the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") configuration. |
	| `static [DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed")` | `[sameAsParent](#sameAsParent())()` | Run the actor on the same executor as the parent actor. |
	
	
		- ### Methods inherited from class akka.actor.typed.[Props](Props.html "class in akka.actor.typed")
		
		
		`[empty](Props.html#empty()), [withDispatcherDefault](Props.html#withDispatcherDefault()), [withDispatcherFromConfig](Props.html#withDispatcherFromConfig(java.lang.String)), [withDispatcherSameAsParent](Props.html#withDispatcherSameAsParent()), [withMailboxFromConfig](Props.html#withMailboxFromConfig(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### DispatcherSelector
		
		
		
		```
		public DispatcherSelector()
		```

	- ### Method Detail
	
	
	
		- #### defaultDispatcher
		
		
		
		```
		public static [DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed") defaultDispatcher()
		```
		
		Java API:
		 Run the actor on the default [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") executor.
		- #### blocking
		
		
		
		```
		public static [DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed") blocking()
		```
		
		Run the actor on the default blocking dispatcher that is
		 configured under default\-blocking\-io\-dispatcher
		- #### fromConfig
		
		
		
		```
		public static [DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed") fromConfig​(java.lang.String path)
		```
		
		Look up an executor definition in the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") configuration.
		 ExecutorServices created in this fashion will be shut down when the
		 ActorSystem terminates.
		- #### sameAsParent
		
		
		
		```
		public static [DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed") sameAsParent()
		```
		
		Run the actor on the same executor as the parent actor.
		
		Returns:

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.DispatcherDefault.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.DispatcherFromConfig.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.DispatcherSameAsParent.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/DispatcherSelector.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/DispatcherSelector.html)*