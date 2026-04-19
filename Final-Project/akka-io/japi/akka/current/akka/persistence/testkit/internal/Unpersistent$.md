---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/Unpersistent$.html
title: Unpersistent$
---

# Unpersistent$

## Content

Package [akka.persistence.testkit.internal](package-summary.html)
## Class Unpersistent$

- java.lang.Object
- - akka.persistence.testkit.internal.Unpersistent$

- ---

```
public class Unpersistent$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Unpersistent$](Unpersistent$.html "class in akka.persistence.testkit.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unpersistent$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​State>[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command>` | `[durableState](#durableState(akka.actor.typed.Behavior,scala.Option,scala.Function3))​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,  scala.Option<State> fromState,  scala.Function3<State,​java.lang.Object,​java.lang.String,​scala.runtime.BoxedUnit> onPersist)` |  |
	| `<Command,​Event,​State>[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command>` | `[eventSourced](#eventSourced(akka.actor.typed.Behavior,scala.Option,scala.Function3,scala.Function2))​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,  scala.Option<scala.Tuple2<State,​java.lang.Object>> fromStateAndSequenceNr,  scala.Function3<Event,​java.lang.Object,​scala.collection.immutable.Set<java.lang.String>,​scala.runtime.BoxedUnit> onEvent,  scala.Function2<State,​java.lang.Object,​scala.runtime.BoxedUnit> onSnapshot)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Unpersistent$](Unpersistent$.html "class in akka.persistence.testkit.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Unpersistent$
		
		
		
		```
		public Unpersistent$()
		```

	- ### Method Detail
	
	
	
		- #### eventSourced
		
		
		
		```
		public <Command,​Event,​State> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> eventSourced​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,
		                                                                        scala.Option<scala.Tuple2<State,​java.lang.Object>> fromStateAndSequenceNr,
		                                                                        scala.Function3<Event,​java.lang.Object,​scala.collection.immutable.Set<java.lang.String>,​scala.runtime.BoxedUnit> onEvent,
		                                                                        scala.Function2<State,​java.lang.Object,​scala.runtime.BoxedUnit> onSnapshot)
		```
		- #### durableState
		
		
		
		```
		public <Command,​State> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> durableState​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,
		                                                            scala.Option<State> fromState,
		                                                            scala.Function3<State,​java.lang.Object,​java.lang.String,​scala.runtime.BoxedUnit> onPersist)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/Unpersistent$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/Unpersistent$.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/Unpersistent$.html)*