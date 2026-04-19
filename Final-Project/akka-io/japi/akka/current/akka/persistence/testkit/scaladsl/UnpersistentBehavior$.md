---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html
title: UnpersistentBehavior$
---

# UnpersistentBehavior$

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Class UnpersistentBehavior$

- java.lang.Object
- - akka.persistence.testkit.scaladsl.UnpersistentBehavior$

- ---

```
public class UnpersistentBehavior$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UnpersistentBehavior$](UnpersistentBehavior$.html "class in akka.persistence.testkit.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnpersistentBehavior$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​State>[UnpersistentBehavior.DurableState](UnpersistentBehavior.DurableState.html "class in akka.persistence.testkit.scaladsl")<Command,​State>` | `[fromDurableState](#fromDurableState(akka.actor.typed.Behavior,scala.Option))​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,  scala.Option<State> initialState)` |  |
	| `<Command,​State>scala.None$` | `[fromDurableState$default$2](#fromDurableState$default$2())()` |  |
	| `<Command,​Event,​State>[UnpersistentBehavior.EventSourced](UnpersistentBehavior.EventSourced.html "class in akka.persistence.testkit.scaladsl")<Command,​Event,​State>` | `[fromEventSourced](#fromEventSourced(akka.actor.typed.Behavior,scala.Option))​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,  scala.Option<scala.Tuple2<State,​java.lang.Object>> initialStateAndSequenceNr)` | Given an EventSourcedBehavior, produce a non\-persistent Behavior which synchronously publishes events and snapshots  for inspection. |
	| `<Command,​Event,​State>[UnpersistentBehavior.EventSourced](UnpersistentBehavior.EventSourced.html "class in akka.persistence.testkit.scaladsl")<Command,​Event,​State>` | `[fromEventSourced](#fromEventSourced(akka.actor.typed.Behavior,State))​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,  State initialState)` |  |
	| `<Command,​Event,​State>scala.None$` | `[fromEventSourced$default$2](#fromEventSourced$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UnpersistentBehavior$](UnpersistentBehavior$.html "class in akka.persistence.testkit.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UnpersistentBehavior$
		
		
		
		```
		public UnpersistentBehavior$()
		```

	- ### Method Detail
	
	
	
		- #### fromEventSourced
		
		
		
		```
		public <Command,​Event,​State> [UnpersistentBehavior.EventSourced](UnpersistentBehavior.EventSourced.html "class in akka.persistence.testkit.scaladsl")<Command,​Event,​State> fromEventSourced​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,
		                                                                                                                             scala.Option<scala.Tuple2<State,​java.lang.Object>> initialStateAndSequenceNr)
		```
		
		Given an EventSourcedBehavior, produce a non\-persistent Behavior which synchronously publishes events and snapshots
		 for inspection. State is updated as in the EventSourcedBehavior, and side effects are performed synchronously. The
		 resulting Behavior is, contingent on the command handling, event handling, and side effects being compatible with the
		 BehaviorTestKit, testable with the BehaviorTestKit.
		 
		 The returned Behavior does not intrinsically depend on configuration: it therefore does not serialize and assumes an
		 unbounded stash for commands.
		- #### fromEventSourced
		
		
		
		```
		public <Command,​Event,​State> [UnpersistentBehavior.EventSourced](UnpersistentBehavior.EventSourced.html "class in akka.persistence.testkit.scaladsl")<Command,​Event,​State> fromEventSourced​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,
		                                                                                                                             State initialState)
		```
		- #### fromEventSourced$default$2
		
		
		
		```
		public <Command,​Event,​State> scala.None$ fromEventSourced$default$2()
		```
		- #### fromDurableState
		
		
		
		```
		public <Command,​State> [UnpersistentBehavior.DurableState](UnpersistentBehavior.DurableState.html "class in akka.persistence.testkit.scaladsl")<Command,​State> fromDurableState​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,
		                                                                                                     scala.Option<State> initialState)
		```
		- #### fromDurableState$default$2
		
		
		
		```
		public <Command,​State> scala.None$ fromDurableState$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/UnpersistentBehavior.DurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/UnpersistentBehavior.EventSourced.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html)*