---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:17:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/osgi/DefaultOSGiLogger.html
title: DefaultOSGiLogger
---

# DefaultOSGiLogger

## Content

Package [akka.osgi](package-summary.html)
## Class DefaultOSGiLogger

- java.lang.Object
- - [akka.event.Logging.DefaultLogger](../event/Logging.DefaultLogger.html "class in akka.event")
	- - akka.osgi.DefaultOSGiLogger

- All Implemented Interfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`, `[RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[LoggerMessageQueueSemantics](../event/LoggerMessageQueueSemantics.html "interface in akka.event")>`, `[Logging.StdOutLogger](../event/Logging.StdOutLogger.html "interface in akka.event")`

---

```
public class DefaultOSGiLogger
extends [Logging.DefaultLogger](../event/Logging.DefaultLogger.html "class in akka.event")
```

Logger for OSGi environment.
 Stands for an interface between akka and the OSGi LogService
 It uses the OSGi LogService to log the received LogEvents

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultOSGiLogger](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[initialisedReceive](#initialisedReceive(org.osgi.service.log.LogService))​(org.osgi.service.log.LogService logService)` | Behavior of the Event handler that is setup (has received a LogService) |
	| `void` | `[logMessage](#logMessage(org.osgi.service.log.LogService,akka.event.Logging.LogEvent))​(org.osgi.service.log.LogService logService,  [Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event") event)` | Logs a message in an OSGi LogService |
	| `java.lang.String` | `[messageFormat](#messageFormat())()` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[uninitialisedReceive](#uninitialisedReceive())()` | Behavior of the logger that waits for its LogService |
	
	
		- ### Methods inherited from class akka.event.[Logging.DefaultLogger](../event/Logging.DefaultLogger.html "class in akka.event")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../event/Logging.DefaultLogger.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../event/Logging.DefaultLogger.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../event/Logging.DefaultLogger.html#context()), [self](../event/Logging.DefaultLogger.html#self())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../actor/Actor.html#aroundPreStart()), [aroundReceive](../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../actor/Actor.html#postRestart(java.lang.Throwable)), [postStop](../actor/Actor.html#postStop()), [preRestart](../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../actor/Actor.html#preStart()), [sender](../actor/Actor.html#sender()), [supervisorStrategy](../actor/Actor.html#supervisorStrategy()), [unhandled](../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.event.[Logging.StdOutLogger](../event/Logging.StdOutLogger.html "interface in akka.event")
		
		
		`[debug](../event/Logging.StdOutLogger.html#debug(akka.event.Logging.Debug)), [error](../event/Logging.StdOutLogger.html#error(akka.event.Logging.Error)), [formatMDC](../event/Logging.StdOutLogger.html#formatMDC(scala.collection.immutable.Map)), [info](../event/Logging.StdOutLogger.html#info(akka.event.Logging.Info)), [print](../event/Logging.StdOutLogger.html#print(java.lang.Object)), [timestamp](../event/Logging.StdOutLogger.html#timestamp(akka.event.Logging.LogEvent)), [warning](../event/Logging.StdOutLogger.html#warning(akka.event.Logging.Warning))`

- - ### Constructor Detail
	
	
	
		- #### DefaultOSGiLogger
		
		
		
		```
		public DefaultOSGiLogger()
		```

	- ### Method Detail
	
	
	
		- #### initialisedReceive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> initialisedReceive​(org.osgi.service.log.LogService logService)
		```
		
		Behavior of the Event handler that is setup (has received a LogService)
		
		Parameters:
		`logService` \- registered OSGi LogService
		Returns:
		Receive : Logs LogEvent or go back to the uninitialised state
		- #### logMessage
		
		
		
		```
		public void logMessage​(org.osgi.service.log.LogService logService,
		                       [Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event") event)
		```
		
		Logs a message in an OSGi LogService
		 
		
		Parameters:
		`logService` \- OSGi LogService registered and used for logging
		`event` \- akka LogEvent that is logged using the LogService
		- #### messageFormat
		
		
		
		```
		public java.lang.String messageFormat()
		```
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../actor/Actor.html#receive())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		Overrides:
		`[receive](../event/Logging.DefaultLogger.html#receive())` in class `[Logging.DefaultLogger](../event/Logging.DefaultLogger.html "class in akka.event")`
		- #### uninitialisedReceive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> uninitialisedReceive()
		```
		
		Behavior of the logger that waits for its LogService
		
		Returns:
		Receive: Store LogEvent or become initialised

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/Logging.DefaultLogger.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/Logging.LogEvent.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/Logging.StdOutLogger.html
- https://doc.akka.io/japi/akka-core/2.6/akka/osgi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/osgi/DefaultOSGiLogger.html](https://doc.akka.io/japi/akka-core/2.6/akka/osgi/DefaultOSGiLogger.html)*