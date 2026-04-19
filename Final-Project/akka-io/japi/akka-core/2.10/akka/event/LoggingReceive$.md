---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingReceive$.html
title: LoggingReceive$
---

# LoggingReceive$

## Content

Package [akka.event](package-summary.html)
## Class LoggingReceive$

- java.lang.Object
- - akka.event.LoggingReceive$

- ---

```
public class LoggingReceive$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LoggingReceive$](LoggingReceive$.html "class in akka.event")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggingReceive$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[apply](#apply(akka.event.Logging.LogLevel,scala.PartialFunction,akka.actor.ActorContext))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") logLevel,  scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)` | Wrap a Receive partial function in a logging enclosure, which sends a  message with given log level to the event bus each time before a message is matched. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[apply](#apply(scala.PartialFunction,akka.actor.ActorContext))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)` | Wrap a Receive partial function in a logging enclosure, which sends a  debug message to the event bus each time before a message is matched. |
	| `[AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor")` | `[create](#create(akka.actor.AbstractActor.Receive,akka.actor.AbstractActor.ActorContext))​([AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor") r,  [AbstractActor.ActorContext](../actor/AbstractActor.ActorContext.html "interface in akka.actor") context)` | Java API: compatible with lambda expressions |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[withLabel](#withLabel(java.lang.String,akka.event.Logging.LogLevel,scala.PartialFunction,akka.actor.ActorContext))​(java.lang.String label,  [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") logLevel,  scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)` | Create a decorated logger which will append `" in state " + label` to each message it logs. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[withLabel](#withLabel(java.lang.String,scala.PartialFunction,akka.actor.ActorContext))​(java.lang.String label,  scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)` | Create a decorated logger which will append `" in state " + label` to each message it logs. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LoggingReceive$](LoggingReceive$.html "class in akka.event") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LoggingReceive$
		
		
		
		```
		public LoggingReceive$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> apply​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,
		                                                                                   [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)
		```
		
		Wrap a Receive partial function in a logging enclosure, which sends a
		 debug message to the event bus each time before a message is matched.
		 This includes messages which are not handled.
		 
		
		
		
		```
		
		 def receive = LoggingReceive {
		   case x => ...
		 }
		 
		```
		
		
		 This method does NOT modify the given Receive unless
		 `akka.actor.debug.receive` is set in configuration.
		- #### apply
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> apply​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") logLevel,
		                                                                                   scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,
		                                                                                   [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)
		```
		
		Wrap a Receive partial function in a logging enclosure, which sends a
		 message with given log level to the event bus each time before a message is matched.
		 This includes messages which are not handled.
		- #### create
		
		
		
		```
		public [AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor") create​([AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor") r,
		                                    [AbstractActor.ActorContext](../actor/AbstractActor.ActorContext.html "interface in akka.actor") context)
		```
		
		Java API: compatible with lambda expressions
		- #### withLabel
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> withLabel​(java.lang.String label,
		                                                                                       [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") logLevel,
		                                                                                       scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,
		                                                                                       [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)
		```
		
		Create a decorated logger which will append `" in state " + label` to each message it logs.
		- #### withLabel
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> withLabel​(java.lang.String label,
		                                                                                       scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,
		                                                                                       [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)
		```
		
		Create a decorated logger which will append `" in state " + label` to each message it logs.

## Code Examples

### Example 1: apply

```text
def receive = LoggingReceive {
   case x => ...
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingReceive$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingReceive$.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingReceive$.html)*