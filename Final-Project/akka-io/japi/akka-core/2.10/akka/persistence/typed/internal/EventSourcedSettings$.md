---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventSourcedSettings$.html
title: EventSourcedSettings$
---

# EventSourcedSettings$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class EventSourcedSettings$

- java.lang.Object
- - akka.persistence.typed.internal.EventSourcedSettings$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class EventSourcedSettings$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.EventSourcedSettings$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventSourcedSettings$](EventSourcedSettings$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSourcedSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.typed.internal.EventSourcedSettings` | `[apply](#apply(int,akka.persistence.typed.internal.StashOverflowStrategy,boolean,scala.concurrent.duration.FiniteDuration,java.lang.String,java.lang.String,boolean))​(int stashCapacity,  [StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.internal") stashOverflowStrategy,  boolean logOnStashing,  scala.concurrent.duration.FiniteDuration recoveryEventTimeout,  java.lang.String journalPluginId,  java.lang.String snapshotPluginId,  boolean useContextLoggerForInternalLogging)` | INTERNAL API |
	| `akka.persistence.typed.internal.EventSourcedSettings` | `[apply](#apply(akka.actor.typed.ActorSystem,java.lang.String,java.lang.String))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,  java.lang.String journalPluginId,  java.lang.String snapshotPluginId)` |  |
	| `akka.persistence.typed.internal.EventSourcedSettings` | `[apply](#apply(akka.actor.typed.ActorSystem,java.lang.String,java.lang.String,scala.Option))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,  java.lang.String journalPluginId,  java.lang.String snapshotPluginId,  scala.Option<java.lang.Object> customStashCapacity)` |  |
	| `akka.persistence.typed.internal.EventSourcedSettings` | `[apply](#apply(com.typesafe.config.Config,java.lang.String,java.lang.String,scala.Option))​(com.typesafe.config.Config config,  java.lang.String journalPluginId,  java.lang.String snapshotPluginId,  scala.Option<java.lang.Object> customStashCapacity)` |  |
	| `scala.Option<scala.Tuple7<java.lang.Object,​[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.internal"),​java.lang.Object,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.typed.internal.EventSourcedSettings))​(akka.persistence.typed.internal.EventSourcedSettings x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventSourcedSettings$](EventSourcedSettings$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventSourcedSettings$
		
		
		
		```
		public EventSourcedSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.persistence.typed.internal.EventSourcedSettings apply​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                                                                  java.lang.String journalPluginId,
		                                                                  java.lang.String snapshotPluginId)
		```
		- #### apply
		
		
		
		```
		public akka.persistence.typed.internal.EventSourcedSettings apply​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                                                                  java.lang.String journalPluginId,
		                                                                  java.lang.String snapshotPluginId,
		                                                                  scala.Option<java.lang.Object> customStashCapacity)
		```
		- #### apply
		
		
		
		```
		public akka.persistence.typed.internal.EventSourcedSettings apply​(com.typesafe.config.Config config,
		                                                                  java.lang.String journalPluginId,
		                                                                  java.lang.String snapshotPluginId,
		                                                                  scala.Option<java.lang.Object> customStashCapacity)
		```
		- #### apply
		
		
		
		```
		public akka.persistence.typed.internal.EventSourcedSettings apply​(int stashCapacity,
		                                                                  [StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.internal") stashOverflowStrategy,
		                                                                  boolean logOnStashing,
		                                                                  scala.concurrent.duration.FiniteDuration recoveryEventTimeout,
		                                                                  java.lang.String journalPluginId,
		                                                                  java.lang.String snapshotPluginId,
		                                                                  boolean useContextLoggerForInternalLogging)
		```
		
		INTERNAL API
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple7<java.lang.Object,​[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.internal"),​java.lang.Object,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​java.lang.String,​java.lang.Object>> unapply​(akka.persistence.typed.internal.EventSourcedSettings x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventSourcedSettings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/StashOverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventSourcedSettings$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventSourcedSettings$.html)*