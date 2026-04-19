---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/ActorCell$.html
title: ActorCell$
---

# ActorCell$

## Content

Package [akka.actor](package-summary.html)
## Class ActorCell$

- java.lang.Object
- - akka.actor.ActorCell$

- ---

```
public class ActorCell$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorCell$](ActorCell$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorCell$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.ThreadLocal<scala.collection.immutable.List<[ActorContext](ActorContext.html "interface in akka.actor")>>` | `[contextStack](#contextStack())()` |  |
	| `int` | `[DefaultState](#DefaultState())()` |  |
	| `scala.collection.immutable.Set<[ActorRef](ActorRef.html "class in akka.actor")>` | `[emptyActorRefSet](#emptyActorRefSet())()` |  |
	| `scala.collection.immutable.List<scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>>` | `[emptyBehaviorStack](#emptyBehaviorStack())()` |  |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[emptyCancellable](#emptyCancellable())()` |  |
	| `int` | `[newUid](#newUid())()` |  |
	| `scala.Tuple2<java.lang.String,​java.lang.Object>` | `[splitNameAndUid](#splitNameAndUid(java.lang.String))​(java.lang.String name)` |  |
	| `int` | `[SuspendedState](#SuspendedState())()` |  |
	| `int` | `[SuspendedWaitForChildrenState](#SuspendedWaitForChildrenState())()` |  |
	| `[Props](Props.html "class in akka.actor")` | `[terminatedProps](#terminatedProps())()` |  |
	| `int` | `[undefinedUid](#undefinedUid())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorCell$](ActorCell$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorCell$
		
		
		
		```
		public ActorCell$()
		```

	- ### Method Detail
	
	
	
		- #### contextStack
		
		
		
		```
		public java.lang.ThreadLocal<scala.collection.immutable.List<[ActorContext](ActorContext.html "interface in akka.actor")>> contextStack()
		```
		- #### emptyCancellable
		
		
		
		```
		public final [Cancellable](Cancellable.html "interface in akka.actor") emptyCancellable()
		```
		- #### emptyBehaviorStack
		
		
		
		```
		public final scala.collection.immutable.List<scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>> emptyBehaviorStack()
		```
		- #### emptyActorRefSet
		
		
		
		```
		public final scala.collection.immutable.Set<[ActorRef](ActorRef.html "class in akka.actor")> emptyActorRefSet()
		```
		- #### terminatedProps
		
		
		
		```
		public final [Props](Props.html "class in akka.actor") terminatedProps()
		```
		- #### undefinedUid
		
		
		
		```
		public final int undefinedUid()
		```
		- #### newUid
		
		
		
		```
		public final int newUid()
		```
		- #### splitNameAndUid
		
		
		
		```
		public final scala.Tuple2<java.lang.String,​java.lang.Object> splitNameAndUid​(java.lang.String name)
		```
		- #### DefaultState
		
		
		
		```
		public final int DefaultState()
		```
		- #### SuspendedState
		
		
		
		```
		public final int SuspendedState()
		```
		- #### SuspendedWaitForChildrenState
		
		
		
		```
		public final int SuspendedWaitForChildrenState()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorCell$.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/ActorCell$.html](https://doc.akka.io/japi/akka/current/akka/actor/ActorCell$.html)*