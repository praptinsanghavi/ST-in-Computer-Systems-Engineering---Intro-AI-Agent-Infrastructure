---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters$.html
title: EventAdapters$
---

# EventAdapters$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class EventAdapters$

- java.lang.Object
- - akka.persistence.journal.EventAdapters$

- ---

```
public class EventAdapters$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventAdapters$](EventAdapters$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventAdapters$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EventAdapters](EventAdapters.html "class in akka.persistence.journal")` | `[apply](#apply(akka.actor.ExtendedActorSystem,com.typesafe.config.Config))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system,  com.typesafe.config.Config config)` |  |
	| `scala.util.Try<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")>` | `[instantiateAdapter](#instantiateAdapter(java.lang.String,akka.actor.ExtendedActorSystem))​(java.lang.String adapterFQN,  [ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventAdapters$](EventAdapters$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventAdapters$
		
		
		
		```
		public EventAdapters$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [EventAdapters](EventAdapters.html "class in akka.persistence.journal") apply​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                           com.typesafe.config.Config config)
		```
		- #### instantiateAdapter
		
		
		
		```
		public scala.util.Try<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")> instantiateAdapter​(java.lang.String adapterFQN,
		                                                       [ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters$.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters$.html)*