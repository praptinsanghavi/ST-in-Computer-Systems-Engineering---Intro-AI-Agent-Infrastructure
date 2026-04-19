---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html
title: RecoveryPermitterInstrumentationProvider
---

# RecoveryPermitterInstrumentationProvider

## Content

Package [akka.persistence.telemetry](package-summary.html)
## Class RecoveryPermitterInstrumentationProvider

- java.lang.Object
- - akka.persistence.telemetry.RecoveryPermitterInstrumentationProvider

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`

---

```
public class RecoveryPermitterInstrumentationProvider
extends java.lang.Object
implements [Extension](../../actor/Extension.html "interface in akka.actor")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecoveryPermitterInstrumentationProvider](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider.html "class in akka.persistence.telemetry")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider.html "class in akka.persistence.telemetry")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider.html "class in akka.persistence.telemetry")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `[RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "interface in akka.persistence.telemetry")` | `[instrumentation](#instrumentation())()` |  |
	| `static [RecoveryPermitterInstrumentationProvider$](RecoveryPermitterInstrumentationProvider$.html "class in akka.persistence.telemetry")` | `[lookup](#lookup())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RecoveryPermitterInstrumentationProvider
		
		
		
		```
		public RecoveryPermitterInstrumentationProvider​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider.html "class in akka.persistence.telemetry") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider.html "class in akka.persistence.telemetry") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [RecoveryPermitterInstrumentationProvider$](RecoveryPermitterInstrumentationProvider$.html "class in akka.persistence.telemetry") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider.html "class in akka.persistence.telemetry") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### instrumentation
		
		
		
		```
		public [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "interface in akka.persistence.telemetry") instrumentation()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html](https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html)*