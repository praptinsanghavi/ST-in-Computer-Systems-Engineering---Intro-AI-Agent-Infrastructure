---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventSourcedBehaviorImpl$.html
title: EventSourcedBehaviorImpl$
---

# EventSourcedBehaviorImpl$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class EventSourcedBehaviorImpl$

- java.lang.Object
- - akka.persistence.typed.internal.EventSourcedBehaviorImpl$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class EventSourcedBehaviorImpl$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.EventSourcedBehaviorImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventSourcedBehaviorImpl$](EventSourcedBehaviorImpl$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSourcedBehaviorImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​Event,​State>[SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<State>` | `[$lessinit$greater$default$10](#$lessinit$greater$default$10())()` |  |
	| `<Command,​Event,​State><any>` | `[$lessinit$greater$default$11](#$lessinit$greater$default$11())()` |  |
	| `<Command,​Event,​State>[Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl")` | `[$lessinit$greater$default$12](#$lessinit$greater$default$12())()` |  |
	| `<Command,​Event,​State>[RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl")` | `[$lessinit$greater$default$13](#$lessinit$greater$default$13())()` |  |
	| `<Command,​Event,​State>[SupervisorStrategy](../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed")` | `[$lessinit$greater$default$14](#$lessinit$greater$default$14())()` |  |
	| `<Command,​Event,​State>scala.PartialFunction<java.lang.Object,​scala.runtime.Nothing$>` | `[$lessinit$greater$default$15](#$lessinit$greater$default$15())()` |  |
	| `<Command,​Event,​State>scala.Option<akka.persistence.typed.internal.ReplicationSetup>` | `[$lessinit$greater$default$16](#$lessinit$greater$default$16())()` |  |
	| `<Command,​Event,​State>boolean` | `[$lessinit$greater$default$17](#$lessinit$greater$default$17())()` |  |
	| `<Command,​Event,​State>scala.Option<java.lang.Object>` | `[$lessinit$greater$default$18](#$lessinit$greater$default$18())()` |  |
	| `<Command,​Event,​State>scala.None$` | `[$lessinit$greater$default$19](#$lessinit$greater$default$19())()` |  |
	| `<Command,​Event,​State>scala.None$` | `[$lessinit$greater$default$20](#$lessinit$greater$default$20())()` |  |
	| `<Command,​Event,​State>scala.Option<java.lang.String>` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` | For testing purposes |
	| `<Command,​Event,​State>scala.Option<java.lang.String>` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `<Command,​Event,​State>scala.Function2<State,​Event,​scala.collection.immutable.Set<java.lang.String>>` | `[$lessinit$greater$default$8](#$lessinit$greater$default$8())()` |  |
	| `<Command,​Event,​State><any>` | `[$lessinit$greater$default$9](#$lessinit$greater$default$9())()` |  |
	| `<Command,​Event,​State>akka.persistence.typed.internal.EventSourcedBehaviorImpl<Command,​Event,​State>` | `[apply](#apply(akka.persistence.typed.PersistenceId,scala.Function0,scala.Function2,scala.Function2,java.lang.Class,scala.Option,scala.Option,scala.Function2,akka.persistence.typed.EventAdapter,akka.persistence.typed.SnapshotAdapter,%3Cany%3E,akka.persistence.typed.scaladsl.Recovery,akka.persistence.typed.scaladsl.RetentionCriteria,akka.actor.typed.SupervisorStrategy,scala.PartialFunction,scala.Option,boolean,scala.Option,scala.Option,scala.Option))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  scala.Function0<State> emptyState,  scala.Function2<State,​Command,​[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> commandHandler,  scala.Function2<State,​Event,​State> eventHandler,  java.lang.Class<?> loggerClass,  scala.Option<java.lang.String> journalPluginId,  scala.Option<java.lang.String> snapshotPluginId,  scala.Function2<State,​Event,​scala.collection.immutable.Set<java.lang.String>> tagger,  [EventAdapter](../EventAdapter.html "class in akka.persistence.typed")<Event,​java.lang.Object> eventAdapter,  [SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<State> snapshotAdapter,  <any> snapshotWhen,  [Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl") recovery,  [RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl") retention,  [SupervisorStrategy](../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed") supervisionStrategy,  scala.PartialFunction<scala.Tuple2<State,​[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit> signalHandler,  scala.Option<akka.persistence.typed.internal.ReplicationSetup> replication,  boolean publishEvents,  scala.Option<java.lang.Object> customStashCapacity,  scala.Option<[ReplicationInterceptor](../scaladsl/ReplicationInterceptor.html "interface in akka.persistence.typed.scaladsl")<State,​Event>> replicatedEventInterceptor,  scala.Option<scala.Function2<State,​[EventWithMetadata](../scaladsl/EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>,​scala.collection.immutable.Seq<[EventWithMetadata](../scaladsl/EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>>>> replicatedEventTransformation)` |  |
	| `<Command,​Event,​State>[SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<State>` | `[apply$default$10](#apply$default$10())()` |  |
	| `<Command,​Event,​State><any>` | `[apply$default$11](#apply$default$11())()` |  |
	| `<Command,​Event,​State>[Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl")` | `[apply$default$12](#apply$default$12())()` |  |
	| `<Command,​Event,​State>[RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl")` | `[apply$default$13](#apply$default$13())()` |  |
	| `<Command,​Event,​State>[SupervisorStrategy](../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed")` | `[apply$default$14](#apply$default$14())()` |  |
	| `<Command,​Event,​State>scala.PartialFunction<java.lang.Object,​scala.runtime.Nothing$>` | `[apply$default$15](#apply$default$15())()` |  |
	| `<Command,​Event,​State>scala.Option<akka.persistence.typed.internal.ReplicationSetup>` | `[apply$default$16](#apply$default$16())()` |  |
	| `<Command,​Event,​State>boolean` | `[apply$default$17](#apply$default$17())()` |  |
	| `<Command,​Event,​State>scala.Option<java.lang.Object>` | `[apply$default$18](#apply$default$18())()` |  |
	| `<Command,​Event,​State>scala.None$` | `[apply$default$19](#apply$default$19())()` |  |
	| `<Command,​Event,​State>scala.None$` | `[apply$default$20](#apply$default$20())()` |  |
	| `<Command,​Event,​State>scala.Option<java.lang.String>` | `[apply$default$6](#apply$default$6())()` |  |
	| `<Command,​Event,​State>scala.Option<java.lang.String>` | `[apply$default$7](#apply$default$7())()` |  |
	| `<Command,​Event,​State>scala.Function2<State,​Event,​scala.collection.immutable.Set<java.lang.String>>` | `[apply$default$8](#apply$default$8())()` |  |
	| `<Command,​Event,​State><any>` | `[apply$default$9](#apply$default$9())()` |  |
	| `<Command,​Event,​State>scala.Option<scala.Tuple20<[PersistenceId](../PersistenceId.html "class in akka.persistence.typed"),​scala.Function0<State>,​scala.Function2<State,​Command,​[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>>,​scala.Function2<State,​Event,​State>,​java.lang.Class<?>,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​scala.Function2<State,​Event,​scala.collection.immutable.Set<java.lang.String>>,​[EventAdapter](../EventAdapter.html "class in akka.persistence.typed")<Event,​java.lang.Object>,​[SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<State>,​<any>,​[Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl"),​[RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl"),​[SupervisorStrategy](../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed"),​scala.PartialFunction<scala.Tuple2<State,​[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit>,​scala.Option<akka.persistence.typed.internal.ReplicationSetup>,​java.lang.Object,​scala.Option<java.lang.Object>,​scala.Option<[ReplicationInterceptor](../scaladsl/ReplicationInterceptor.html "interface in akka.persistence.typed.scaladsl")<State,​Event>>,​scala.Option<scala.Function2<State,​[EventWithMetadata](../scaladsl/EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>,​scala.collection.immutable.Seq<[EventWithMetadata](../scaladsl/EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>>>>>>` | `[unapply](#unapply(akka.persistence.typed.internal.EventSourcedBehaviorImpl))​(akka.persistence.typed.internal.EventSourcedBehaviorImpl<Command,​Event,​State> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventSourcedBehaviorImpl$](EventSourcedBehaviorImpl$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventSourcedBehaviorImpl$
		
		
		
		```
		public EventSourcedBehaviorImpl$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$6
		
		
		
		```
		public <Command,​Event,​State> scala.Option<java.lang.String> $lessinit$greater$default$6()
		```
		
		For testing purposes
		- #### $lessinit$greater$default$7
		
		
		
		```
		public <Command,​Event,​State> scala.Option<java.lang.String> $lessinit$greater$default$7()
		```
		- #### $lessinit$greater$default$8
		
		
		
		```
		public <Command,​Event,​State> scala.Function2<State,​Event,​scala.collection.immutable.Set<java.lang.String>> $lessinit$greater$default$8()
		```
		- #### $lessinit$greater$default$9
		
		
		
		```
		public <Command,​Event,​State> <any> $lessinit$greater$default$9()
		```
		- #### $lessinit$greater$default$10
		
		
		
		```
		public <Command,​Event,​State> [SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<State> $lessinit$greater$default$10()
		```
		- #### $lessinit$greater$default$11
		
		
		
		```
		public <Command,​Event,​State> <any> $lessinit$greater$default$11()
		```
		- #### $lessinit$greater$default$12
		
		
		
		```
		public <Command,​Event,​State> [Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl") $lessinit$greater$default$12()
		```
		- #### $lessinit$greater$default$13
		
		
		
		```
		public <Command,​Event,​State> [RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl") $lessinit$greater$default$13()
		```
		- #### $lessinit$greater$default$14
		
		
		
		```
		public <Command,​Event,​State> [SupervisorStrategy](../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed") $lessinit$greater$default$14()
		```
		- #### $lessinit$greater$default$15
		
		
		
		```
		public <Command,​Event,​State> scala.PartialFunction<java.lang.Object,​scala.runtime.Nothing$> $lessinit$greater$default$15()
		```
		- #### $lessinit$greater$default$16
		
		
		
		```
		public <Command,​Event,​State> scala.Option<akka.persistence.typed.internal.ReplicationSetup> $lessinit$greater$default$16()
		```
		- #### $lessinit$greater$default$17
		
		
		
		```
		public <Command,​Event,​State> boolean $lessinit$greater$default$17()
		```
		- #### $lessinit$greater$default$18
		
		
		
		```
		public <Command,​Event,​State> scala.Option<java.lang.Object> $lessinit$greater$default$18()
		```
		- #### $lessinit$greater$default$19
		
		
		
		```
		public <Command,​Event,​State> scala.None$ $lessinit$greater$default$19()
		```
		- #### $lessinit$greater$default$20
		
		
		
		```
		public <Command,​Event,​State> scala.None$ $lessinit$greater$default$20()
		```
		- #### apply
		
		
		
		```
		public <Command,​Event,​State> akka.persistence.typed.internal.EventSourcedBehaviorImpl<Command,​Event,​State> apply​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                                                                                                         scala.Function0<State> emptyState,
		                                                                                                                                         scala.Function2<State,​Command,​[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> commandHandler,
		                                                                                                                                         scala.Function2<State,​Event,​State> eventHandler,
		                                                                                                                                         java.lang.Class<?> loggerClass,
		                                                                                                                                         scala.Option<java.lang.String> journalPluginId,
		                                                                                                                                         scala.Option<java.lang.String> snapshotPluginId,
		                                                                                                                                         scala.Function2<State,​Event,​scala.collection.immutable.Set<java.lang.String>> tagger,
		                                                                                                                                         [EventAdapter](../EventAdapter.html "class in akka.persistence.typed")<Event,​java.lang.Object> eventAdapter,
		                                                                                                                                         [SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<State> snapshotAdapter,
		                                                                                                                                         <any> snapshotWhen,
		                                                                                                                                         [Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl") recovery,
		                                                                                                                                         [RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl") retention,
		                                                                                                                                         [SupervisorStrategy](../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed") supervisionStrategy,
		                                                                                                                                         scala.PartialFunction<scala.Tuple2<State,​[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit> signalHandler,
		                                                                                                                                         scala.Option<akka.persistence.typed.internal.ReplicationSetup> replication,
		                                                                                                                                         boolean publishEvents,
		                                                                                                                                         scala.Option<java.lang.Object> customStashCapacity,
		                                                                                                                                         scala.Option<[ReplicationInterceptor](../scaladsl/ReplicationInterceptor.html "interface in akka.persistence.typed.scaladsl")<State,​Event>> replicatedEventInterceptor,
		                                                                                                                                         scala.Option<scala.Function2<State,​[EventWithMetadata](../scaladsl/EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>,​scala.collection.immutable.Seq<[EventWithMetadata](../scaladsl/EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>>>> replicatedEventTransformation)
		```
		- #### apply$default$10
		
		
		
		```
		public <Command,​Event,​State> [SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<State> apply$default$10()
		```
		- #### apply$default$11
		
		
		
		```
		public <Command,​Event,​State> <any> apply$default$11()
		```
		- #### apply$default$12
		
		
		
		```
		public <Command,​Event,​State> [Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl") apply$default$12()
		```
		- #### apply$default$13
		
		
		
		```
		public <Command,​Event,​State> [RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl") apply$default$13()
		```
		- #### apply$default$14
		
		
		
		```
		public <Command,​Event,​State> [SupervisorStrategy](../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed") apply$default$14()
		```
		- #### apply$default$15
		
		
		
		```
		public <Command,​Event,​State> scala.PartialFunction<java.lang.Object,​scala.runtime.Nothing$> apply$default$15()
		```
		- #### apply$default$16
		
		
		
		```
		public <Command,​Event,​State> scala.Option<akka.persistence.typed.internal.ReplicationSetup> apply$default$16()
		```
		- #### apply$default$17
		
		
		
		```
		public <Command,​Event,​State> boolean apply$default$17()
		```
		- #### apply$default$18
		
		
		
		```
		public <Command,​Event,​State> scala.Option<java.lang.Object> apply$default$18()
		```
		- #### apply$default$19
		
		
		
		```
		public <Command,​Event,​State> scala.None$ apply$default$19()
		```
		- #### apply$default$20
		
		
		
		```
		public <Command,​Event,​State> scala.None$ apply$default$20()
		```
		- #### apply$default$6
		
		
		
		```
		public <Command,​Event,​State> scala.Option<java.lang.String> apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public <Command,​Event,​State> scala.Option<java.lang.String> apply$default$7()
		```
		- #### apply$default$8
		
		
		
		```
		public <Command,​Event,​State> scala.Function2<State,​Event,​scala.collection.immutable.Set<java.lang.String>> apply$default$8()
		```
		- #### apply$default$9
		
		
		
		```
		public <Command,​Event,​State> <any> apply$default$9()
		```
		- #### unapply
		
		
		
		```
		public <Command,​Event,​State> scala.Option<scala.Tuple20<[PersistenceId](../PersistenceId.html "class in akka.persistence.typed"),​scala.Function0<State>,​scala.Function2<State,​Command,​[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>>,​scala.Function2<State,​Event,​State>,​java.lang.Class<?>,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​scala.Function2<State,​Event,​scala.collection.immutable.Set<java.lang.String>>,​[EventAdapter](../EventAdapter.html "class in akka.persistence.typed")<Event,​java.lang.Object>,​[SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<State>,​<any>,​[Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl"),​[RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl"),​[SupervisorStrategy](../../../actor/typed/SupervisorStrategy.html "class in akka.actor.typed"),​scala.PartialFunction<scala.Tuple2<State,​[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit>,​scala.Option<akka.persistence.typed.internal.ReplicationSetup>,​java.lang.Object,​scala.Option<java.lang.Object>,​scala.Option<[ReplicationInterceptor](../scaladsl/ReplicationInterceptor.html "interface in akka.persistence.typed.scaladsl")<State,​Event>>,​scala.Option<scala.Function2<State,​[EventWithMetadata](../scaladsl/EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>,​scala.collection.immutable.Seq<[EventWithMetadata](../scaladsl/EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>>>>>> unapply​(akka.persistence.typed.internal.EventSourcedBehaviorImpl<Command,​Event,​State> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventSourcedBehaviorImpl$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventWithMetadata.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Recovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/ReplicationInterceptor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/RetentionCriteria.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventSourcedBehaviorImpl$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventSourcedBehaviorImpl$.html)*