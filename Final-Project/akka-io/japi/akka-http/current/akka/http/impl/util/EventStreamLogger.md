---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EventStreamLogger.html
title: EventStreamLogger
---

# EventStreamLogger

## Content

Package [akka.http.impl.util](package-summary.html)
## Class EventStreamLogger

- java.lang.Object
- - akka.http.impl.util.EventStreamLogger

- All Implemented Interfaces:
`akka.actor.Actor`, `akka.actor.ActorLogging`

---

```
public class EventStreamLogger
extends java.lang.Object
implements akka.actor.Actor, akka.actor.ActorLogging
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.Actor
		
		
		`akka.actor.Actor.emptyBehavior$, akka.actor.Actor.ignoringBehavior$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventStreamLogger](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.ActorContext` | `[context](#context())()` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` |  |
	| `akka.actor.ActorRef` | `[self](#self())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.Actor
		
		
		`akka$actor$Actor$_setter_$context_$eq, akka$actor$Actor$_setter_$self_$eq, aroundPostRestart, aroundPostStop, aroundPreRestart, aroundPreStart, aroundReceive, postRestart, postStop, preRestart, preStart, sender, supervisorStrategy, unhandled`
		- ### Methods inherited from interface akka.actor.ActorLogging
		
		
		`akka$actor$ActorLogging$$_log, akka$actor$ActorLogging$$_log_$eq, log`

- - ### Constructor Detail
	
	
	
		- #### EventStreamLogger
		
		
		
		```
		public EventStreamLogger()
		```

	- ### Method Detail
	
	
	
		- #### context
		
		
		
		```
		public akka.actor.ActorContext context()
		```
		
		
		Specified by:
		`context` in interface `akka.actor.Actor`
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		
		Specified by:
		`receive` in interface `akka.actor.Actor`
		- #### self
		
		
		
		```
		public final akka.actor.ActorRef self()
		```
		
		
		Specified by:
		`self` in interface `akka.actor.Actor`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EventStreamLogger.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EventStreamLogger.html)*