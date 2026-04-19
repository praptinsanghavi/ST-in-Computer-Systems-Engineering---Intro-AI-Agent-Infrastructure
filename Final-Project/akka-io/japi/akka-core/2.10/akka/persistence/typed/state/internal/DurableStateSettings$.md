---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:14:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/DurableStateSettings$.html
title: DurableStateSettings$
---

# DurableStateSettings$

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class DurableStateSettings$

- java.lang.Object
- - akka.persistence.typed.state.internal.DurableStateSettings$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class DurableStateSettings$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.persistence.typed.state.internal.DurableStateSettings$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DurableStateSettings$](DurableStateSettings$.html "class in akka.persistence.typed.state.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DurableStateSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.typed.state.internal.DurableStateSettings` | `[apply](#apply(int,akka.persistence.typed.state.internal.StashOverflowStrategy,boolean,scala.concurrent.duration.FiniteDuration,java.lang.String,boolean))​(int stashCapacity,  [StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.state.internal") stashOverflowStrategy,  boolean logOnStashing,  scala.concurrent.duration.FiniteDuration recoveryTimeout,  java.lang.String durableStateStorePluginId,  boolean useContextLoggerForInternalLogging)` | INTERNAL API |
	| `akka.persistence.typed.state.internal.DurableStateSettings` | `[apply](#apply(akka.actor.typed.ActorSystem,java.lang.String,scala.Option))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,  java.lang.String durableStateStorePluginId,  scala.Option<java.lang.Object> customStashCapacity)` |  |
	| `akka.persistence.typed.state.internal.DurableStateSettings` | `[apply](#apply(com.typesafe.config.Config,java.lang.String,scala.Option))​(com.typesafe.config.Config config,  java.lang.String durableStateStorePluginId,  scala.Option<java.lang.Object> customStashCapacity)` |  |
	| `scala.Option<scala.Tuple6<java.lang.Object,​[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.state.internal"),​java.lang.Object,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.typed.state.internal.DurableStateSettings))​(akka.persistence.typed.state.internal.DurableStateSettings x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DurableStateSettings$](DurableStateSettings$.html "class in akka.persistence.typed.state.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DurableStateSettings$
		
		
		
		```
		public DurableStateSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.persistence.typed.state.internal.DurableStateSettings apply​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                                                                        java.lang.String durableStateStorePluginId,
		                                                                        scala.Option<java.lang.Object> customStashCapacity)
		```
		- #### apply
		
		
		
		```
		public akka.persistence.typed.state.internal.DurableStateSettings apply​(com.typesafe.config.Config config,
		                                                                        java.lang.String durableStateStorePluginId,
		                                                                        scala.Option<java.lang.Object> customStashCapacity)
		```
		- #### apply
		
		
		
		```
		public akka.persistence.typed.state.internal.DurableStateSettings apply​(int stashCapacity,
		                                                                        [StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.state.internal") stashOverflowStrategy,
		                                                                        boolean logOnStashing,
		                                                                        scala.concurrent.duration.FiniteDuration recoveryTimeout,
		                                                                        java.lang.String durableStateStorePluginId,
		                                                                        boolean useContextLoggerForInternalLogging)
		```
		
		INTERNAL API
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple6<java.lang.Object,​[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.state.internal"),​java.lang.Object,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​java.lang.Object>> unapply​(akka.persistence.typed.state.internal.DurableStateSettings x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/DurableStateSettings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/StashOverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/DurableStateSettings$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/DurableStateSettings$.html)*