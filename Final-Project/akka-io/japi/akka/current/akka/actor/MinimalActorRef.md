---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/MinimalActorRef.html
title: MinimalActorRef
---

# MinimalActorRef

## Content

Package [akka.actor](package-summary.html)
## Interface MinimalActorRef

- All Superinterfaces:
`[ActorRefScope](ActorRefScope.html "interface in akka.actor")`, `[LocalRef](LocalRef.html "interface in akka.actor")`

All Known Implementing Classes:
`[Logging.StandardOutLogger](../event/Logging.StandardOutLogger.html "class in akka.event")`, `[Nobody$](Nobody$.html "class in akka.actor")`

---

```
public interface MinimalActorRef
extends [LocalRef](LocalRef.html "interface in akka.actor")
```

Trait for ActorRef implementations where all methods contain default stubs.
 
 INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[$bang](#$bang(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[$bang$default$2](#$bang$default$2(java.lang.Object))​(java.lang.Object message)` |  |
	| `akka.actor.InternalActorRef` | `[getChild](#getChild(scala.collection.Iterator))​(scala.collection.Iterator<java.lang.String> names)` |  |
	| `akka.actor.InternalActorRef` | `[getParent](#getParent())()` |  |
	| `boolean` | `[isTerminated](#isTerminated())()` |  |
	| `void` | `[restart](#restart(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `void` | `[resume](#resume(java.lang.Throwable))​(java.lang.Throwable causedByFailure)` |  |
	| `void` | `[sendSystemMessage](#sendSystemMessage(akka.dispatch.sysmsg.SystemMessage))​([SystemMessage](../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") message)` |  |
	| `void` | `[start](#start())()` |  |
	| `void` | `[stop](#stop())()` |  |
	| `void` | `[suspend](#suspend())()` |  |
	| `java.lang.Object` | `[writeReplace](#writeReplace())()` |  |
	
	
		- ### Methods inherited from interface akka.actor.[LocalRef](LocalRef.html "interface in akka.actor")
		
		
		`[isLocal](LocalRef.html#isLocal())`

- - ### Method Detail
	
	
	
		- #### $bang
		
		
		
		```
		void $bang​(java.lang.Object message,
		           [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		- #### $bang$default$2
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") $bang$default$2​(java.lang.Object message)
		```
		- #### getChild
		
		
		
		```
		akka.actor.InternalActorRef getChild​(scala.collection.Iterator<java.lang.String> names)
		```
		- #### getParent
		
		
		
		```
		akka.actor.InternalActorRef getParent()
		```
		- #### isTerminated
		
		
		
		```
		boolean isTerminated()
		```
		- #### restart
		
		
		
		```
		void restart​(java.lang.Throwable cause)
		```
		- #### resume
		
		
		
		```
		void resume​(java.lang.Throwable causedByFailure)
		```
		- #### sendSystemMessage
		
		
		
		```
		void sendSystemMessage​([SystemMessage](../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") message)
		```
		- #### start
		
		
		
		```
		void start()
		```
		- #### stop
		
		
		
		```
		void stop()
		```
		- #### suspend
		
		
		
		```
		void suspend()
		```
		- #### writeReplace
		
		
		
		```
		java.lang.Object writeReplace()
		                       throws java.io.ObjectStreamException
		```
		
		
		Throws:
		`java.io.ObjectStreamException`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRefScope.html
- https://doc.akka.io/japi/akka/current/akka/actor/LocalRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Nobody$.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/SystemMessage.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.StandardOutLogger.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/MinimalActorRef.html](https://doc.akka.io/japi/akka/current/akka/actor/MinimalActorRef.html)*