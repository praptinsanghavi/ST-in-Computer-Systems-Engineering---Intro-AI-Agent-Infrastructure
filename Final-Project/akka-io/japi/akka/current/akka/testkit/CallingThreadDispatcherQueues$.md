---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadDispatcherQueues$.html
title: CallingThreadDispatcherQueues$
---

# CallingThreadDispatcherQueues$

## Content

Package [akka.testkit](package-summary.html)
## Class CallingThreadDispatcherQueues$

- java.lang.Object
- - akka.testkit.CallingThreadDispatcherQueues$

- All Implemented Interfaces:
`[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<akka.testkit.CallingThreadDispatcherQueues>`, `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class CallingThreadDispatcherQueues$
extends java.lang.Object
implements [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<akka.testkit.CallingThreadDispatcherQueues>, [ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CallingThreadDispatcherQueues$](CallingThreadDispatcherQueues$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CallingThreadDispatcherQueues$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.testkit.CallingThreadDispatcherQueues` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[CallingThreadDispatcherQueues$](CallingThreadDispatcherQueues$.html "class in akka.testkit")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../actor/ExtensionId.html#equals(java.lang.Object)), [get](../actor/ExtensionId.html#get(akka.actor.ActorSystem)), [get](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider)), [hashCode](../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CallingThreadDispatcherQueues$](CallingThreadDispatcherQueues$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CallingThreadDispatcherQueues$
		
		
		
		```
		public CallingThreadDispatcherQueues$()
		```

	- ### Method Detail
	
	
	
		- #### lookup
		
		
		
		```
		public [CallingThreadDispatcherQueues$](CallingThreadDispatcherQueues$.html "class in akka.testkit") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public akka.testkit.CallingThreadDispatcherQueues createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<akka.testkit.CallingThreadDispatcherQueues>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadDispatcherQueues$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadDispatcherQueues$.html](https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadDispatcherQueues$.html)*