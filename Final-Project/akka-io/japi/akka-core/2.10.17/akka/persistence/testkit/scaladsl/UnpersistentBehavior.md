---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:48:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/UnpersistentBehavior.EventSourced$.html
title: UnpersistentBehavior.EventSourced$
---

# UnpersistentBehavior.EventSourced$

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Class UnpersistentBehavior.EventSourced$

- java.lang.Object
- - akka.persistence.testkit.scaladsl.UnpersistentBehavior.EventSourced$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing interface:
[UnpersistentBehavior](UnpersistentBehavior.html "interface in akka.persistence.testkit.scaladsl")\<[Command](UnpersistentBehavior.html "type parameter in UnpersistentBehavior"),​[State](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")\>

---

```
public static class UnpersistentBehavior.EventSourced$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.testkit.scaladsl.UnpersistentBehavior.EventSourced$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UnpersistentBehavior.EventSourced$](UnpersistentBehavior.EventSourced$.html "class in akka.persistence.testkit.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSourced$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​Event,​State>[UnpersistentBehavior.EventSourced](UnpersistentBehavior.EventSourced.html "class in akka.persistence.testkit.scaladsl")<Command,​Event,​State>` | `[apply](#apply(akka.actor.typed.Behavior,akka.persistence.testkit.scaladsl.PersistenceProbe,akka.persistence.testkit.scaladsl.PersistenceProbe))​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,  [PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<Event> eventProbe,  [PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<State> stateProbe)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<Command,​Event,​State>scala.Option<scala.Tuple3<[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command>,​[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<Event>,​[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<State>>>` | `[unapply](#unapply(akka.persistence.testkit.scaladsl.UnpersistentBehavior.EventSourced))​([UnpersistentBehavior.EventSourced](UnpersistentBehavior.EventSourced.html "class in akka.persistence.testkit.scaladsl")<Command,​Event,​State> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UnpersistentBehavior.EventSourced$](UnpersistentBehavior.EventSourced$.html "class in akka.persistence.testkit.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventSourced$
		
		
		
		```
		public EventSourced$()
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
		public <Command,​Event,​State> [UnpersistentBehavior.EventSourced](UnpersistentBehavior.EventSourced.html "class in akka.persistence.testkit.scaladsl")<Command,​Event,​State> apply​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,
		                                                                                                                  [PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<Event> eventProbe,
		                                                                                                                  [PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<State> stateProbe)
		```
		- #### unapply
		
		
		
		```
		public <Command,​Event,​State> scala.Option<scala.Tuple3<[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command>,​[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<Event>,​[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<State>>> unapply​([UnpersistentBehavior.EventSourced](UnpersistentBehavior.EventSourced.html "class in akka.persistence.testkit.scaladsl")<Command,​Event,​State> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/UnpersistentBehavior.EventSourced$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/UnpersistentBehavior.EventSourced.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/UnpersistentBehavior.EventSourced$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/UnpersistentBehavior.EventSourced$.html)*