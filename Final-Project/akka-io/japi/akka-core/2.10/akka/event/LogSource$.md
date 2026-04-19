---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/LogSource$.html
title: LogSource$
---

# LogSource$

## Content

Package [akka.event](package-summary.html)
## Class LogSource$

- java.lang.Object
- - akka.event.LogSource$

- ---

```
public class LogSource$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LogSource$](LogSource$.html "class in akka.event")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogSource$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.Tuple2<java.lang.String,​java.lang.Class<?>>` | `[apply](#apply(T,akka.actor.ActorSystem,akka.event.LogSource))​(T o,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [LogSource](LogSource.html "interface in akka.event")<T> evidence$2)` |  |
	| `<T> scala.Tuple2<java.lang.String,​java.lang.Class<?>>` | `[apply](#apply(T,akka.event.LogSource))​(T o,  [LogSource](LogSource.html "interface in akka.event")<T> evidence$1)` |  |
	| `[LogSource](LogSource.html "interface in akka.event")<[Actor](../actor/Actor.html "interface in akka.actor")>` | `[fromActor](#fromActor())()` |  |
	| `[LogSource](LogSource.html "interface in akka.event")<[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[fromActorRef](#fromActorRef())()` |  |
	| `<T> [LogSource](LogSource.html "interface in akka.event")<java.lang.Class<T>>` | `[fromAnyClass](#fromAnyClass())()` |  |
	| `scala.Tuple2<java.lang.String,​java.lang.Class<?>>` | `[fromAnyRef](#fromAnyRef(java.lang.Object))​(java.lang.Object o)` |  |
	| `scala.Tuple2<java.lang.String,​java.lang.Class<?>>` | `[fromAnyRef](#fromAnyRef(java.lang.Object,akka.actor.ActorSystem))​(java.lang.Object o,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `[LogSource](LogSource.html "interface in akka.event")<java.lang.Class<?>>` | `[fromClass](#fromClass())()` |  |
	| `[LogSource](LogSource.html "interface in akka.event")<java.lang.String>` | `[fromString](#fromString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LogSource$](LogSource$.html "class in akka.event") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LogSource$
		
		
		
		```
		public LogSource$()
		```

	- ### Method Detail
	
	
	
		- #### fromString
		
		
		
		```
		public [LogSource](LogSource.html "interface in akka.event")<java.lang.String> fromString()
		```
		- #### fromActor
		
		
		
		```
		public [LogSource](LogSource.html "interface in akka.event")<[Actor](../actor/Actor.html "interface in akka.actor")> fromActor()
		```
		- #### fromActorRef
		
		
		
		```
		public [LogSource](LogSource.html "interface in akka.event")<[ActorRef](../actor/ActorRef.html "class in akka.actor")> fromActorRef()
		```
		- #### fromClass
		
		
		
		```
		public [LogSource](LogSource.html "interface in akka.event")<java.lang.Class<?>> fromClass()
		```
		- #### fromAnyClass
		
		
		
		```
		public <T> [LogSource](LogSource.html "interface in akka.event")<java.lang.Class<T>> fromAnyClass()
		```
		- #### apply
		
		
		
		```
		public <T> scala.Tuple2<java.lang.String,​java.lang.Class<?>> apply​(T o,
		                                                                         [LogSource](LogSource.html "interface in akka.event")<T> evidence$1)
		```
		- #### apply
		
		
		
		```
		public <T> scala.Tuple2<java.lang.String,​java.lang.Class<?>> apply​(T o,
		                                                                         [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                                                         [LogSource](LogSource.html "interface in akka.event")<T> evidence$2)
		```
		- #### fromAnyRef
		
		
		
		```
		public scala.Tuple2<java.lang.String,​java.lang.Class<?>> fromAnyRef​(java.lang.Object o)
		```
		- #### fromAnyRef
		
		
		
		```
		public scala.Tuple2<java.lang.String,​java.lang.Class<?>> fromAnyRef​(java.lang.Object o,
		                                                                          [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LogSource$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LogSource.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/LogSource$.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/LogSource$.html)*