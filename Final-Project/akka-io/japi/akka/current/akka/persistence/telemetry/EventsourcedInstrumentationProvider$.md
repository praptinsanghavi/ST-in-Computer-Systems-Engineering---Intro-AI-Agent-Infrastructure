---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedInstrumentationProvider$.html
title: EventsourcedInstrumentationProvider$
---

# EventsourcedInstrumentationProvider$

## Content

Package [akka.persistence.telemetry](package-summary.html)
## Class EventsourcedInstrumentationProvider$

- java.lang.Object
- - akka.persistence.telemetry.EventsourcedInstrumentationProvider$

- All Implemented Interfaces:
`[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "class in akka.persistence.telemetry")>`, `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class EventsourcedInstrumentationProvider$
extends java.lang.Object
implements [ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "class in akka.persistence.telemetry")>, [ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventsourcedInstrumentationProvider$](EventsourcedInstrumentationProvider$.html "class in akka.persistence.telemetry")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventsourcedInstrumentationProvider$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "class in akka.persistence.telemetry")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "class in akka.persistence.telemetry")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "class in akka.persistence.telemetry")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[EventsourcedInstrumentationProvider$](EventsourcedInstrumentationProvider$.html "class in akka.persistence.telemetry")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventsourcedInstrumentationProvider$](EventsourcedInstrumentationProvider$.html "class in akka.persistence.telemetry") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventsourcedInstrumentationProvider$
		
		
		
		```
		public EventsourcedInstrumentationProvider$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "class in akka.persistence.telemetry") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#get(akka.actor.ActorSystem))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ActorSystem): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "class in akka.persistence.telemetry")>`
		- #### get
		
		
		
		```
		public [EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "class in akka.persistence.telemetry") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "class in akka.persistence.telemetry")>`
		- #### lookup
		
		
		
		```
		public [EventsourcedInstrumentationProvider$](EventsourcedInstrumentationProvider$.html "class in akka.persistence.telemetry") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public [EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "class in akka.persistence.telemetry") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "class in akka.persistence.telemetry")>`

## Code Examples

### Example 1: get

```text
override def get(system: ActorSystem): TheExtension = super.get(system)
```

### Example 2: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedInstrumentationProvider$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedInstrumentationProvider.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedInstrumentationProvider$.html](https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedInstrumentationProvider$.html)*