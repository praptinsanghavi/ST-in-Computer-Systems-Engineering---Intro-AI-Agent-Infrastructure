---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreakersRegistry$.html
title: CircuitBreakersRegistry$
---

# CircuitBreakersRegistry$

## Content

Package [akka.pattern](package-summary.html)
## Class CircuitBreakersRegistry$

- java.lang.Object
- - akka.pattern.CircuitBreakersRegistry$

- All Implemented Interfaces:
`[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern")>`, `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class CircuitBreakersRegistry$
extends java.lang.Object
implements [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern")>, [ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")
```

Companion object providing factory methods for Circuit Breaker which runs callbacks in caller's thread

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CircuitBreakersRegistry$](CircuitBreakersRegistry$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CircuitBreakersRegistry$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<? extends [Extension](../actor/Extension.html "interface in akka.actor")>` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CircuitBreakersRegistry$](CircuitBreakersRegistry$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CircuitBreakersRegistry$
		
		
		
		```
		public CircuitBreakersRegistry$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public [CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern")>`
		- #### lookup
		
		
		
		```
		public [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<? extends [Extension](../actor/Extension.html "interface in akka.actor")> lookup()
		```
		
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### get
		
		
		
		```
		public [CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern")>`
		- #### get
		
		
		
		```
		public [CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreakersRegistry$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreakersRegistry.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreakersRegistry$.html](https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreakersRegistry$.html)*