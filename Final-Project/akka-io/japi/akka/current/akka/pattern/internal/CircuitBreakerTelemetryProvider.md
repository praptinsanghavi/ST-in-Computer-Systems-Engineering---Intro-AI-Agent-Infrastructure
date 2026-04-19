---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerTelemetryProvider.html
title: CircuitBreakerTelemetryProvider
---

# CircuitBreakerTelemetryProvider

## Content

Package [akka.pattern.internal](package-summary.html)
## Class CircuitBreakerTelemetryProvider

- java.lang.Object
- - akka.pattern.internal.CircuitBreakerTelemetryProvider

- ---

```
public class CircuitBreakerTelemetryProvider
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CircuitBreakerTelemetryProvider](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal")` | `[create](#create(java.lang.String,akka.actor.ExtendedActorSystem,java.lang.String))​(java.lang.String breakerId,  [ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system,  java.lang.String fqcn)` |  |
	| `static [CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal")` | `[start](#start(java.lang.String,akka.actor.ExtendedActorSystem))​(java.lang.String breakerId,  [ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CircuitBreakerTelemetryProvider
		
		
		
		```
		public CircuitBreakerTelemetryProvider()
		```

	- ### Method Detail
	
	
	
		- #### start
		
		
		
		```
		public static [CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal") start​(java.lang.String breakerId,
		                                            [ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### create
		
		
		
		```
		public static [CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal") create​(java.lang.String breakerId,
		                                             [ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                             java.lang.String fqcn)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerTelemetry.html
- https://doc.akka.io/japi/akka/current/akka/pattern/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerTelemetryProvider.html](https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerTelemetryProvider.html)*