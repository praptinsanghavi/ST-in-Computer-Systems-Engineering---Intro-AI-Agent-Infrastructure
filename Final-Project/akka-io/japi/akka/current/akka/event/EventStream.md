---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/EventStream.html
title: EventStream
---

# EventStream

## Content

Package [akka.event](package-summary.html)
## Class EventStream

- java.lang.Object
- - akka.event.EventStream

- All Implemented Interfaces:
`[ActorEventBus](ActorEventBus.html "interface in akka.event")`, `[EventBus](EventBus.html "interface in akka.event")`, `[LoggingBus](LoggingBus.html "interface in akka.event")`, `[SubchannelClassification](SubchannelClassification.html "interface in akka.event")`

---

```
public class EventStream
extends java.lang.Object
implements [LoggingBus](LoggingBus.html "interface in akka.event"), [SubchannelClassification](SubchannelClassification.html "interface in akka.event")
```

An Akka EventStream is a pub\-sub stream of events both system and user generated,
 where subscribers are ActorRefs and the channels are Classes and Events are any java.lang.Object.
 EventStreams employ SubchannelClassification, which means that if you listen to a Class,
 you'll receive any message that is of that type or a subtype.
 
 The debug flag in the constructor toggles if operations on this EventStream should also be published
 as Debug\-Events

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventStream](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") sys)` |  |
	| `[EventStream](#%3Cinit%3E(akka.actor.ActorSystem,boolean))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") sys,  boolean debug)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected java.lang.Class<?>` | `[classify](#classify(java.lang.Object))​(java.lang.Object event)` |  |
	| `protected void` | `[publish](#publish(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object event,  [ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber)` |  |
	| `void` | `[startUnsubscriber](#startUnsubscriber())()` | ''Must'' be called after actor system is "ready". |
	| `protected [Subclassification](../util/Subclassification.html "interface in akka.util")<java.lang.Class<?>>` | `[subclassification](#subclassification())()` | The logic to form sub\-class hierarchy |
	| `boolean` | `[subscribe](#subscribe(akka.actor.ActorRef,java.lang.Class))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,  java.lang.Class<?> channel)` | Subscribe an actor to listen for types and subtypes by passing Class to channel argument. |
	| `void` | `[unsubscribe](#unsubscribe(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber)` | Unsubscribe all subscriptions created by this actor from the event stream. |
	| `boolean` | `[unsubscribe](#unsubscribe(akka.actor.ActorRef,java.lang.Class))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,  java.lang.Class<?> channel)` | Unsubscribe specific types subscriptions created by this actor from the event stream. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.event.[ActorEventBus](ActorEventBus.html "interface in akka.event")
		
		
		`[compareSubscribers](ActorEventBus.html#compareSubscribers(akka.actor.ActorRef,akka.actor.ActorRef))`
		- ### Methods inherited from interface akka.event.[EventBus](EventBus.html "interface in akka.event")
		
		
		`[publish](EventBus.html#publish(akka.event.EventBus)), [subscribe](EventBus.html#subscribe(akka.event.EventBus,akka.event.EventBus)), [unsubscribe](EventBus.html#unsubscribe(akka.event.EventBus)), [unsubscribe](EventBus.html#unsubscribe(akka.event.EventBus,akka.event.EventBus))`
		- ### Methods inherited from interface akka.event.[LoggingBus](LoggingBus.html "interface in akka.event")
		
		
		`[_logLevel_$eq](LoggingBus.html#_logLevel_$eq(akka.event.Logging.LogLevel)), [addLogger](LoggingBus.html#addLogger(akka.actor.ActorSystemImpl,java.lang.Class,akka.event.Logging.LogLevel,java.lang.String)), [loggers_$eq](LoggingBus.html#loggers_$eq(scala.collection.immutable.Seq)), [logLevel](LoggingBus.html#logLevel()), [setLogLevel](LoggingBus.html#setLogLevel(akka.event.Logging.LogLevel)), [setUpStdoutLogger](LoggingBus.html#setUpStdoutLogger(akka.actor.ActorSystem.Settings)), [startDefaultLoggers](LoggingBus.html#startDefaultLoggers(akka.actor.ActorSystemImpl)), [startStdoutLogger](LoggingBus.html#startStdoutLogger(akka.actor.ActorSystem.Settings)), [stopDefaultLoggers](LoggingBus.html#stopDefaultLoggers(akka.actor.ActorSystem))`
		- ### Methods inherited from interface akka.event.[SubchannelClassification](SubchannelClassification.html "interface in akka.event")
		
		
		`[addToCache](SubchannelClassification.html#addToCache(scala.collection.immutable.Seq)), [cache_$eq](SubchannelClassification.html#cache_$eq(scala.collection.immutable.Map)), [classify](SubchannelClassification.html#classify(akka.event.SubchannelClassification)), [hasSubscriptions](SubchannelClassification.html#hasSubscriptions(akka.event.SubchannelClassification)), [publish](SubchannelClassification.html#publish(akka.event.SubchannelClassification)), [publish](SubchannelClassification.html#publish(akka.event.SubchannelClassification,akka.event.SubchannelClassification)), [removeFromCache](SubchannelClassification.html#removeFromCache(scala.collection.immutable.Seq)), [subscribe](SubchannelClassification.html#subscribe(akka.event.SubchannelClassification,akka.event.SubchannelClassification)), [unsubscribe](SubchannelClassification.html#unsubscribe(akka.event.SubchannelClassification)), [unsubscribe](SubchannelClassification.html#unsubscribe(akka.event.SubchannelClassification,akka.event.SubchannelClassification))`

- - ### Constructor Detail
	
	
	
		- #### EventStream
		
		
		
		```
		public EventStream​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") sys,
		                   boolean debug)
		```
		- #### EventStream
		
		
		
		```
		public EventStream​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") sys)
		```

	- ### Method Detail
	
	
	
		- #### classify
		
		
		
		```
		protected java.lang.Class<?> classify​(java.lang.Object event)
		```
		- #### publish
		
		
		
		```
		protected void publish​(java.lang.Object event,
		                       [ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber)
		```
		- #### startUnsubscriber
		
		
		
		```
		public void startUnsubscriber()
		```
		
		''Must'' be called after actor system is "ready".
		 Starts system actor that takes care of unsubscribing subscribers that have terminated.
		- #### subclassification
		
		
		
		```
		protected [Subclassification](../util/Subclassification.html "interface in akka.util")<java.lang.Class<?>> subclassification()
		```
		
		Description copied from interface: `[SubchannelClassification](SubchannelClassification.html#subclassification())`
		The logic to form sub\-class hierarchy
		
		Specified by:
		`[subclassification](SubchannelClassification.html#subclassification())` in interface `[SubchannelClassification](SubchannelClassification.html "interface in akka.event")`
		- #### subscribe
		
		
		
		```
		public boolean subscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,
		                         java.lang.Class<?> channel)
		```
		
		Subscribe an actor to listen for types and subtypes by passing Class to channel argument.
		 The same actor can create multiple subscriptions for different Class.
		- #### unsubscribe
		
		
		
		```
		public boolean unsubscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,
		                           java.lang.Class<?> channel)
		```
		
		Unsubscribe specific types subscriptions created by this actor from the event stream.
		- #### unsubscribe
		
		
		
		```
		public void unsubscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber)
		```
		
		Unsubscribe all subscriptions created by this actor from the event stream.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/event/ActorEventBus.html
- https://doc.akka.io/japi/akka/current/akka/event/EventBus.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingBus.html
- https://doc.akka.io/japi/akka/current/akka/event/SubchannelClassification.html
- https://doc.akka.io/japi/akka/current/akka/event/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Subclassification.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/EventStream.html](https://doc.akka.io/japi/akka/current/akka/event/EventStream.html)*