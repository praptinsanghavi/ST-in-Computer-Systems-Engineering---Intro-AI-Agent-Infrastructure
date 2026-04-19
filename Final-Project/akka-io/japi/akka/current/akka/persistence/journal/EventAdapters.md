---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters.html
title: EventAdapters
---

# EventAdapters

## Content

Package [akka.persistence.journal](package-summary.html)
## Class EventAdapters

- java.lang.Object
- - akka.persistence.journal.EventAdapters

- Direct Known Subclasses:
`[IdentityEventAdapters$](IdentityEventAdapters$.html "class in akka.persistence.journal")`

---

```
public class EventAdapters
extends java.lang.Object
```

`EventAdapters` serves as a per\-journal collection of bound event adapters.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[EventAdapters.CombinedReadEventAdapter$](EventAdapters.CombinedReadEventAdapter$.html "class in akka.persistence.journal")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventAdapters](#%3Cinit%3E(java.util.concurrent.ConcurrentHashMap,scala.collection.immutable.Seq,akka.event.LoggingAdapter))​(java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>,​[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")> map,  scala.collection.immutable.Seq<scala.Tuple2<java.lang.Class<?>,​[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")>> bindings,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [EventAdapters](EventAdapters.html "class in akka.persistence.journal")` | `[apply](#apply(akka.actor.ExtendedActorSystem,com.typesafe.config.Config))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system,  com.typesafe.config.Config config)` |  |
	| `[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")` | `[get](#get(java.lang.Class))​(java.lang.Class<?> clazz)` | Finds the "most specific" matching adapter for the given class (i.e. |
	| `static scala.util.Try<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")>` | `[instantiateAdapter](#instantiateAdapter(java.lang.String,akka.actor.ExtendedActorSystem))​(java.lang.String adapterFQN,  [ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventAdapters
		
		
		
		```
		public EventAdapters​(java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>,​[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")> map,
		                     scala.collection.immutable.Seq<scala.Tuple2<java.lang.Class<?>,​[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")>> bindings,
		                     [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [EventAdapters](EventAdapters.html "class in akka.persistence.journal") apply​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                  com.typesafe.config.Config config)
		```
		- #### instantiateAdapter
		
		
		
		```
		public static scala.util.Try<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")> instantiateAdapter​(java.lang.String adapterFQN,
		                                                              [ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public [EventAdapter](EventAdapter.html "interface in akka.persistence.journal") get​(java.lang.Class<?> clazz)
		```
		
		Finds the "most specific" matching adapter for the given class (i.e. it may return an adapter that can work on a
		 interface implemented by the given class if no direct match is found).
		 
		 Falls back to [`IdentityEventAdapter`](IdentityEventAdapter.html "class in akka.persistence.journal") if no adapter was defined for the given class.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters.CombinedReadEventAdapter$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/IdentityEventAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/IdentityEventAdapters$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters.html)*