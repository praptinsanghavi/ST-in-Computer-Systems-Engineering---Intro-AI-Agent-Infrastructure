---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:39:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/DispatcherSelector$.html
title: DispatcherSelector$
---

# DispatcherSelector$

## Content

Package [akka.actor.typed](package-summary.html)
## Class DispatcherSelector$

- java.lang.Object
- - akka.actor.typed.DispatcherSelector$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class DispatcherSelector$
extends java.lang.Object
implements java.io.Serializable
```

Factories for [`DispatcherSelector`](DispatcherSelector.html "class in akka.actor.typed")s which describe which thread pool shall be used to run
 the actor to which this configuration is applied. See the individual factory methods for details
 on the options.
 
 The default configuration if none of these options are present is to run
 the actor on the default [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") executor.

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.DispatcherSelector$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DispatcherSelector$](DispatcherSelector$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DispatcherSelector$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed")` | `[blocking](#blocking())()` | Run the actor on the default blocking dispatcher that is  configured under default\-blocking\-io\-dispatcher |
	| `[DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed")` | `[defaultDispatcher](#defaultDispatcher())()` | Java API:  Run the actor on the default [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") executor. |
	| `[DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed")` | `[fromConfig](#fromConfig(java.lang.String))​(java.lang.String path)` | Look up an executor definition in the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") configuration. |
	| `[DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed")` | `[sameAsParent](#sameAsParent())()` | Run the actor on the same executor as the parent actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DispatcherSelector$](DispatcherSelector$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DispatcherSelector$
		
		
		
		```
		public DispatcherSelector$()
		```

	- ### Method Detail
	
	
	
		- #### defaultDispatcher
		
		
		
		```
		public [DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed") defaultDispatcher()
		```
		
		Java API:
		 Run the actor on the default [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") executor.
		- #### blocking
		
		
		
		```
		public [DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed") blocking()
		```
		
		Run the actor on the default blocking dispatcher that is
		 configured under default\-blocking\-io\-dispatcher
		- #### fromConfig
		
		
		
		```
		public [DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed") fromConfig​(java.lang.String path)
		```
		
		Look up an executor definition in the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") configuration.
		 ExecutorServices created in this fashion will be shut down when the
		 ActorSystem terminates.
		- #### sameAsParent
		
		
		
		```
		public [DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed") sameAsParent()
		```
		
		Run the actor on the same executor as the parent actor.
		
		Returns:

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/DispatcherSelector$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/DispatcherSelector$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/DispatcherSelector$.html)*