---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:58:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreakersRegistry.html
title: CircuitBreakersRegistry
---

# CircuitBreakersRegistry

## Content

Package [akka.pattern](package-summary.html)
## Class CircuitBreakersRegistry

- java.lang.Object
- - akka.pattern.CircuitBreakersRegistry

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`

---

```
public final class CircuitBreakersRegistry
extends java.lang.Object
implements [Extension](../actor/Extension.html "interface in akka.actor")
```

A CircuitBreakersPanel is a central point collecting all circuit breakers in Akka.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CircuitBreakersRegistry](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<? extends [Extension](../actor/Extension.html "interface in akka.actor")>` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CircuitBreakersRegistry
		
		
		
		```
		public CircuitBreakersRegistry​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public static [CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		- #### lookup
		
		
		
		```
		public static [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<? extends [Extension](../actor/Extension.html "interface in akka.actor")> lookup()
		```
		
		Returns the canonical ExtensionId for this Extension
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreakersRegistry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreakersRegistry.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreakersRegistry.html)*