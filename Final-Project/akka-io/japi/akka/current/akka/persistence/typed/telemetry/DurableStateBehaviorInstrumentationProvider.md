---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider.html
title: DurableStateBehaviorInstrumentationProvider
---

# DurableStateBehaviorInstrumentationProvider

## Content

Package [akka.persistence.typed.telemetry](package-summary.html)
## Class DurableStateBehaviorInstrumentationProvider

- java.lang.Object
- - akka.persistence.typed.telemetry.DurableStateBehaviorInstrumentationProvider

- All Implemented Interfaces:
`[Extension](../../../actor/typed/Extension.html "interface in akka.actor.typed")`

---

```
public class DurableStateBehaviorInstrumentationProvider
extends java.lang.Object
implements [Extension](../../../actor/typed/Extension.html "interface in akka.actor.typed")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DurableStateBehaviorInstrumentationProvider](#%3Cinit%3E(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static [DurableStateBehaviorInstrumentationProvider](DurableStateBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [DurableStateBehaviorInstrumentationProvider](DurableStateBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<T>` | `[id](#id())()` |  |
	| `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")` | `[instrumentation](#instrumentation())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DurableStateBehaviorInstrumentationProvider
		
		
		
		```
		public DurableStateBehaviorInstrumentationProvider​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public static [DurableStateBehaviorInstrumentationProvider](DurableStateBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry") createExtension​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### get
		
		
		
		```
		public static [DurableStateBehaviorInstrumentationProvider](DurableStateBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry") get​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### apply
		
		
		
		```
		public static final T apply​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### id
		
		
		
		```
		public static [ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<T> id()
		```
		- #### instrumentation
		
		
		
		```
		public [DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry") instrumentation()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider.html)*