---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:29:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/internal/ActorTestKitGuardian.SpawnActorAnonymous$.html
title: ActorTestKitGuardian.SpawnActorAnonymous$
---

# ActorTestKitGuardian.SpawnActorAnonymous$

## Content

Package [akka.actor.testkit.typed.internal](package-summary.html)
## Class ActorTestKitGuardian.SpawnActorAnonymous$

- java.lang.Object
- - akka.actor.testkit.typed.internal.ActorTestKitGuardian.SpawnActorAnonymous$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[ActorTestKitGuardian](ActorTestKitGuardian.html "class in akka.actor.testkit.typed.internal")

---

```
public static class ActorTestKitGuardian.SpawnActorAnonymous$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.actor.testkit.typed.internal.ActorTestKitGuardian.SpawnActorAnonymous$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorTestKitGuardian.SpawnActorAnonymous$](ActorTestKitGuardian.SpawnActorAnonymous$.html "class in akka.actor.testkit.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SpawnActorAnonymous$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [ActorTestKitGuardian.SpawnActorAnonymous](ActorTestKitGuardian.SpawnActorAnonymous.html "class in akka.actor.testkit.typed.internal")<T>` | `[apply](#apply(akka.actor.typed.Behavior,akka.actor.typed.ActorRef,akka.actor.typed.Props))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>> replyTo,  [Props](../../../typed/Props.html "class in akka.actor.typed") props)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<scala.Tuple3<[Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T>,​[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>>,​[Props](../../../typed/Props.html "class in akka.actor.typed")>>` | `[unapply](#unapply(akka.actor.testkit.typed.internal.ActorTestKitGuardian.SpawnActorAnonymous))​([ActorTestKitGuardian.SpawnActorAnonymous](ActorTestKitGuardian.SpawnActorAnonymous.html "class in akka.actor.testkit.typed.internal")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorTestKitGuardian.SpawnActorAnonymous$](ActorTestKitGuardian.SpawnActorAnonymous$.html "class in akka.actor.testkit.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SpawnActorAnonymous$
		
		
		
		```
		public SpawnActorAnonymous$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <T> [ActorTestKitGuardian.SpawnActorAnonymous](ActorTestKitGuardian.SpawnActorAnonymous.html "class in akka.actor.testkit.typed.internal")<T> apply​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                                                             [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>> replyTo,
		                                                             [Props](../../../typed/Props.html "class in akka.actor.typed") props)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple3<[Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T>,​[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>>,​[Props](../../../typed/Props.html "class in akka.actor.typed")>> unapply​([ActorTestKitGuardian.SpawnActorAnonymous](ActorTestKitGuardian.SpawnActorAnonymous.html "class in akka.actor.testkit.typed.internal")<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/internal/ActorTestKitGuardian.SpawnActorAnonymous$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/internal/ActorTestKitGuardian.SpawnActorAnonymous.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/internal/ActorTestKitGuardian.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/internal/ActorTestKitGuardian.SpawnActorAnonymous$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/internal/ActorTestKitGuardian.SpawnActorAnonymous$.html)*