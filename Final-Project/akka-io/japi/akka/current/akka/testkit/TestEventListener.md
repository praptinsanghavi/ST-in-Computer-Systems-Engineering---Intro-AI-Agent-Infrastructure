---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestEventListener.html
title: TestEventListener
---

# TestEventListener

## Content

Package [akka.testkit](package-summary.html)
## Class TestEventListener

- java.lang.Object
- - [akka.event.Logging.DefaultLogger](../event/Logging.DefaultLogger.html "class in akka.event")
	- - akka.testkit.TestEventListener

- All Implemented Interfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`, `[RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[LoggerMessageQueueSemantics](../event/LoggerMessageQueueSemantics.html "interface in akka.event")>`, `[Logging.StdOutLogger](../event/Logging.StdOutLogger.html "interface in akka.event")`

---

```
public class TestEventListener
extends [Logging.DefaultLogger](../event/Logging.DefaultLogger.html "class in akka.event")
```

EventListener for running tests, which allows selectively filtering out
 expected messages. To use it, include something like this into
 `akka.test.conf` and run your tests with system property
 `"akka.mode"` set to `"test"`:
 

```

 akka {
   loggers = ["akka.testkit.TestEventListener"]
 }
 
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestEventListener](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[addFilter](#addFilter(akka.testkit.EventFilter))​([EventFilter](EventFilter.html "class in akka.testkit") filter)` |  |
	| `boolean` | `[filter](#filter(akka.event.Logging.LogEvent))​([Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event") event)` |  |
	| `scala.collection.immutable.List<[EventFilter](EventFilter.html "class in akka.testkit")>` | `[filters](#filters())()` |  |
	| `void` | `[filters_$eq](#filters_$eq(scala.collection.immutable.List))​(scala.collection.immutable.List<[EventFilter](EventFilter.html "class in akka.testkit")> x$1)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `void` | `[removeFilter](#removeFilter(akka.testkit.EventFilter))​([EventFilter](EventFilter.html "class in akka.testkit") filter)` |  |
	
	
		- ### Methods inherited from class akka.event.[Logging.DefaultLogger](../event/Logging.DefaultLogger.html "class in akka.event")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../event/Logging.DefaultLogger.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../event/Logging.DefaultLogger.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../event/Logging.DefaultLogger.html#context()), [self](../event/Logging.DefaultLogger.html#self())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../actor/Actor.html#aroundPreStart()), [aroundReceive](../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../actor/Actor.html#postRestart(java.lang.Throwable)), [postStop](../actor/Actor.html#postStop()), [preRestart](../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../actor/Actor.html#preStart()), [sender](../actor/Actor.html#sender()), [supervisorStrategy](../actor/Actor.html#supervisorStrategy()), [unhandled](../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.event.[Logging.StdOutLogger](../event/Logging.StdOutLogger.html "interface in akka.event")
		
		
		`[debug](../event/Logging.StdOutLogger.html#debug(akka.event.Logging.Debug)), [error](../event/Logging.StdOutLogger.html#error(akka.event.Logging.Error)), [formatMDC](../event/Logging.StdOutLogger.html#formatMDC(scala.collection.immutable.Map)), [info](../event/Logging.StdOutLogger.html#info(akka.event.Logging.Info)), [print](../event/Logging.StdOutLogger.html#print(java.lang.Object)), [timestamp](../event/Logging.StdOutLogger.html#timestamp(akka.event.Logging.LogEvent)), [warning](../event/Logging.StdOutLogger.html#warning(akka.event.Logging.Warning))`

- - ### Constructor Detail
	
	
	
		- #### TestEventListener
		
		
		
		```
		public TestEventListener()
		```

	- ### Method Detail
	
	
	
		- #### addFilter
		
		
		
		```
		public void addFilter​([EventFilter](EventFilter.html "class in akka.testkit") filter)
		```
		- #### filter
		
		
		
		```
		public boolean filter​([Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event") event)
		```
		- #### filters
		
		
		
		```
		public scala.collection.immutable.List<[EventFilter](EventFilter.html "class in akka.testkit")> filters()
		```
		- #### filters\_$eq
		
		
		
		```
		public void filters_$eq​(scala.collection.immutable.List<[EventFilter](EventFilter.html "class in akka.testkit")> x$1)
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
		- #### removeFilter
		
		
		
		```
		public void removeFilter​([EventFilter](EventFilter.html "class in akka.testkit") filter)
		```

## Code Examples

### Example 1: Class TestEventListener

```text
akka {
   loggers = ["akka.testkit.TestEventListener"]
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.DefaultLogger.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.LogEvent.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.StdOutLogger.html
- https://doc.akka.io/japi/akka/current/akka/testkit/EventFilter.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestEventListener.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestEventListener.html)*