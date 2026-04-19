---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/DurableStateBehaviorImpl$.html
title: DurableStateBehaviorImpl$
---

# DurableStateBehaviorImpl$

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class DurableStateBehaviorImpl$

- java.lang.Object
- - akka.persistence.typed.state.internal.DurableStateBehaviorImpl$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class DurableStateBehaviorImpl$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.persistence.typed.state.internal.DurableStateBehaviorImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DurableStateBehaviorImpl$](DurableStateBehaviorImpl$.html "class in akka.persistence.typed.state.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DurableStateBehaviorImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​State>scala.Option<java.lang.Object>` | `[$lessinit$greater$default$10](#$lessinit$greater$default$10())()` |  |
	| `<Command,​State>scala.None$` | `[$lessinit$greater$default$11](#$lessinit$greater$default$11())()` |  |
	| `<Command,​State>scala.Option<java.lang.String>` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` | Used by DurableStateBehaviorTestKit to retrieve the state. |
	| `<Command,​State>java.lang.String` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `<Command,​State>[SnapshotAdapter](../../SnapshotAdapter.html "interface in akka.persistence.typed")<State>` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `<Command,​State>[SupervisorStrategy](../../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed")` | `[$lessinit$greater$default$8](#$lessinit$greater$default$8())()` |  |
	| `<Command,​State>scala.PartialFunction<java.lang.Object,​scala.runtime.Nothing$>` | `[$lessinit$greater$default$9](#$lessinit$greater$default$9())()` |  |
	| `<Command,​State>akka.persistence.typed.state.internal.DurableStateBehaviorImpl<Command,​State>` | `[apply](#apply(akka.persistence.typed.PersistenceId,scala.Function0,scala.Function2,java.lang.Class,scala.Option,java.lang.String,akka.persistence.typed.SnapshotAdapter,akka.actor.typed.SupervisorStrategy,scala.PartialFunction,scala.Option,scala.Option))​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,  scala.Function0<State> emptyState,  scala.Function2<State,​Command,​[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>> commandHandler,  java.lang.Class<?> loggerClass,  scala.Option<java.lang.String> durableStateStorePluginId,  java.lang.String tag,  [SnapshotAdapter](../../SnapshotAdapter.html "interface in akka.persistence.typed")<State> snapshotAdapter,  [SupervisorStrategy](../../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed") supervisionStrategy,  scala.PartialFunction<scala.Tuple2<State,​[Signal](../../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit> signalHandler,  scala.Option<java.lang.Object> customStashCapacity,  scala.Option<[ChangeEventHandler](../scaladsl/ChangeEventHandler.html "class in akka.persistence.typed.state.scaladsl")<java.lang.Object,​State,​java.lang.Object>> changeEventHandler)` |  |
	| `<Command,​State>scala.Option<java.lang.Object>` | `[apply$default$10](#apply$default$10())()` |  |
	| `<Command,​State>scala.None$` | `[apply$default$11](#apply$default$11())()` |  |
	| `<Command,​State>scala.Option<java.lang.String>` | `[apply$default$5](#apply$default$5())()` |  |
	| `<Command,​State>java.lang.String` | `[apply$default$6](#apply$default$6())()` |  |
	| `<Command,​State>[SnapshotAdapter](../../SnapshotAdapter.html "interface in akka.persistence.typed")<State>` | `[apply$default$7](#apply$default$7())()` |  |
	| `<Command,​State>[SupervisorStrategy](../../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed")` | `[apply$default$8](#apply$default$8())()` |  |
	| `<Command,​State>scala.PartialFunction<java.lang.Object,​scala.runtime.Nothing$>` | `[apply$default$9](#apply$default$9())()` |  |
	| `<Command,​State>scala.Option<scala.Tuple11<[PersistenceId](../../PersistenceId.html "class in akka.persistence.typed"),​scala.Function0<State>,​scala.Function2<State,​Command,​[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>>,​java.lang.Class<?>,​scala.Option<java.lang.String>,​java.lang.String,​[SnapshotAdapter](../../SnapshotAdapter.html "interface in akka.persistence.typed")<State>,​[SupervisorStrategy](../../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed"),​scala.PartialFunction<scala.Tuple2<State,​[Signal](../../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit>,​scala.Option<java.lang.Object>,​scala.Option<[ChangeEventHandler](../scaladsl/ChangeEventHandler.html "class in akka.persistence.typed.state.scaladsl")<java.lang.Object,​State,​java.lang.Object>>>>` | `[unapply](#unapply(akka.persistence.typed.state.internal.DurableStateBehaviorImpl))​(akka.persistence.typed.state.internal.DurableStateBehaviorImpl<Command,​State> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DurableStateBehaviorImpl$](DurableStateBehaviorImpl$.html "class in akka.persistence.typed.state.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DurableStateBehaviorImpl$
		
		
		
		```
		public DurableStateBehaviorImpl$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$5
		
		
		
		```
		public <Command,​State> scala.Option<java.lang.String> $lessinit$greater$default$5()
		```
		
		Used by DurableStateBehaviorTestKit to retrieve the state.
		 Can't be a Signal because those are not stashed.
		- #### $lessinit$greater$default$6
		
		
		
		```
		public <Command,​State> java.lang.String $lessinit$greater$default$6()
		```
		- #### $lessinit$greater$default$7
		
		
		
		```
		public <Command,​State> [SnapshotAdapter](../../SnapshotAdapter.html "interface in akka.persistence.typed")<State> $lessinit$greater$default$7()
		```
		- #### $lessinit$greater$default$8
		
		
		
		```
		public <Command,​State> [SupervisorStrategy](../../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed") $lessinit$greater$default$8()
		```
		- #### $lessinit$greater$default$9
		
		
		
		```
		public <Command,​State> scala.PartialFunction<java.lang.Object,​scala.runtime.Nothing$> $lessinit$greater$default$9()
		```
		- #### $lessinit$greater$default$10
		
		
		
		```
		public <Command,​State> scala.Option<java.lang.Object> $lessinit$greater$default$10()
		```
		- #### $lessinit$greater$default$11
		
		
		
		```
		public <Command,​State> scala.None$ $lessinit$greater$default$11()
		```
		- #### apply
		
		
		
		```
		public <Command,​State> akka.persistence.typed.state.internal.DurableStateBehaviorImpl<Command,​State> apply​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                                                                                       scala.Function0<State> emptyState,
		                                                                                                                       scala.Function2<State,​Command,​[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>> commandHandler,
		                                                                                                                       java.lang.Class<?> loggerClass,
		                                                                                                                       scala.Option<java.lang.String> durableStateStorePluginId,
		                                                                                                                       java.lang.String tag,
		                                                                                                                       [SnapshotAdapter](../../SnapshotAdapter.html "interface in akka.persistence.typed")<State> snapshotAdapter,
		                                                                                                                       [SupervisorStrategy](../../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed") supervisionStrategy,
		                                                                                                                       scala.PartialFunction<scala.Tuple2<State,​[Signal](../../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit> signalHandler,
		                                                                                                                       scala.Option<java.lang.Object> customStashCapacity,
		                                                                                                                       scala.Option<[ChangeEventHandler](../scaladsl/ChangeEventHandler.html "class in akka.persistence.typed.state.scaladsl")<java.lang.Object,​State,​java.lang.Object>> changeEventHandler)
		```
		- #### apply$default$10
		
		
		
		```
		public <Command,​State> scala.Option<java.lang.Object> apply$default$10()
		```
		- #### apply$default$11
		
		
		
		```
		public <Command,​State> scala.None$ apply$default$11()
		```
		- #### apply$default$5
		
		
		
		```
		public <Command,​State> scala.Option<java.lang.String> apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public <Command,​State> java.lang.String apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public <Command,​State> [SnapshotAdapter](../../SnapshotAdapter.html "interface in akka.persistence.typed")<State> apply$default$7()
		```
		- #### apply$default$8
		
		
		
		```
		public <Command,​State> [SupervisorStrategy](../../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed") apply$default$8()
		```
		- #### apply$default$9
		
		
		
		```
		public <Command,​State> scala.PartialFunction<java.lang.Object,​scala.runtime.Nothing$> apply$default$9()
		```
		- #### unapply
		
		
		
		```
		public <Command,​State> scala.Option<scala.Tuple11<[PersistenceId](../../PersistenceId.html "class in akka.persistence.typed"),​scala.Function0<State>,​scala.Function2<State,​Command,​[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>>,​java.lang.Class<?>,​scala.Option<java.lang.String>,​java.lang.String,​[SnapshotAdapter](../../SnapshotAdapter.html "interface in akka.persistence.typed")<State>,​[SupervisorStrategy](../../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed"),​scala.PartialFunction<scala.Tuple2<State,​[Signal](../../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit>,​scala.Option<java.lang.Object>,​scala.Option<[ChangeEventHandler](../scaladsl/ChangeEventHandler.html "class in akka.persistence.typed.state.scaladsl")<java.lang.Object,​State,​java.lang.Object>>>> unapply​(akka.persistence.typed.state.internal.DurableStateBehaviorImpl<Command,​State> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/DurableStateBehaviorImpl$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/DurableStateBehaviorImpl$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/DurableStateBehaviorImpl$.html)*