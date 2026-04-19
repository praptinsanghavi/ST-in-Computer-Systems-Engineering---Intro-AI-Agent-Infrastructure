---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Cell.html
title: Cell
---

# Cell

## Content

Package [akka.actor](package-summary.html)
## Interface Cell

- ---

```
public interface Cell
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ChildrenContainer](dungeon/ChildrenContainer.html "interface in akka.actor.dungeon")` | `[childrenRefs](#childrenRefs())()` | All children of this actor, including only reserved\-names. |
	| `scala.Option<[ChildStats](ChildStats.html "interface in akka.actor")>` | `[getChildByName](#getChildByName(java.lang.String))​(java.lang.String name)` | Get the stats for the named child, if that exists. |
	| `akka.actor.InternalActorRef` | `[getSingleChild](#getSingleChild(java.lang.String))​(java.lang.String name)` | Method for looking up a single child beneath this actor. |
	| `boolean` | `[hasMessages](#hasMessages())()` | If the actor isLocal, returns whether "user messages" are currently queued,  \&ldquo;false\&rdquo; otherwise. |
	| `boolean` | `[isLocal](#isLocal())()` | Returns true if the actor is local, i.e. |
	| `boolean` | `[isTerminated](#isTerminated())()` | Returns \&ldquo;true\&rdquo; if the actor is locally known to be terminated, \&ldquo;false\&rdquo; if  alive or uncertain. |
	| `int` | `[numberOfMessages](#numberOfMessages())()` | If the actor isLocal, returns the number of "user messages" currently queued,  which may be a costly operation, 0 otherwise. |
	| `akka.actor.InternalActorRef` | `[parent](#parent())()` | The supervisor of this actor. |
	| `[Props](Props.html "class in akka.actor")` | `[props](#props())()` | The props for this actor cell. |
	| `void` | `[restart](#restart(java.lang.Throwable))​(java.lang.Throwable cause)` | Restart this actor (will recursively restart or stop all children). |
	| `void` | `[resume](#resume(java.lang.Throwable))​(java.lang.Throwable causedByFailure)` | Recursively resume this actor and all its children. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[self](#self())()` | The \&ldquo;self\&rdquo; reference which this Cell is attached to. |
	| `void` | `[sendMessage](#sendMessage(akka.dispatch.Envelope))​([Envelope](../dispatch/Envelope.html "class in akka.dispatch") msg)` | Enqueue a message to be sent to the actor; may or may not actually  schedule the actor to run, depending on which type of cell it is. |
	| `void` | `[sendMessage](#sendMessage(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Enqueue a message to be sent to the actor; may or may not actually  schedule the actor to run, depending on which type of cell it is. |
	| `void` | `[sendSystemMessage](#sendSystemMessage(akka.dispatch.sysmsg.SystemMessage))​([SystemMessage](../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") msg)` | Enqueue a message to be sent to the actor; may or may not actually  schedule the actor to run, depending on which type of cell it is. |
	| `[Cell](Cell.html "interface in akka.actor")` | `[start](#start())()` | Start the cell: enqueued message must not be processed before this has  been called. |
	| `void` | `[stop](#stop())()` | Recursively terminate this actor and all its children. |
	| `void` | `[suspend](#suspend())()` | Recursively suspend this actor and all its children. |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[system](#system())()` | The system within which this Cell lives. |
	| `akka.actor.ActorSystemImpl` | `[systemImpl](#systemImpl())()` | The system internals where this Cell lives. |

- - ### Method Detail
	
	
	
		- #### childrenRefs
		
		
		
		```
		[ChildrenContainer](dungeon/ChildrenContainer.html "interface in akka.actor.dungeon") childrenRefs()
		```
		
		All children of this actor, including only reserved\-names.
		- #### getChildByName
		
		
		
		```
		scala.Option<[ChildStats](ChildStats.html "interface in akka.actor")> getChildByName​(java.lang.String name)
		```
		
		Get the stats for the named child, if that exists.
		- #### getSingleChild
		
		
		
		```
		akka.actor.InternalActorRef getSingleChild​(java.lang.String name)
		```
		
		Method for looking up a single child beneath this actor.
		 It is racy if called from the outside.
		- #### hasMessages
		
		
		
		```
		boolean hasMessages()
		```
		
		If the actor isLocal, returns whether "user messages" are currently queued,
		 \&ldquo;false\&rdquo; otherwise.
		- #### isLocal
		
		
		
		```
		boolean isLocal()
		```
		
		Returns true if the actor is local, i.e. if it is actually scheduled
		 on a Thread in the current JVM when run.
		- #### isTerminated
		
		
		
		```
		boolean isTerminated()
		```
		
		Returns \&ldquo;true\&rdquo; if the actor is locally known to be terminated, \&ldquo;false\&rdquo; if
		 alive or uncertain.
		- #### numberOfMessages
		
		
		
		```
		int numberOfMessages()
		```
		
		If the actor isLocal, returns the number of "user messages" currently queued,
		 which may be a costly operation, 0 otherwise.
		- #### parent
		
		
		
		```
		akka.actor.InternalActorRef parent()
		```
		
		The supervisor of this actor.
		- #### props
		
		
		
		```
		[Props](Props.html "class in akka.actor") props()
		```
		
		The props for this actor cell.
		- #### restart
		
		
		
		```
		void restart​(java.lang.Throwable cause)
		```
		
		Restart this actor (will recursively restart or stop all children). Is only allowed to throw Fatal Throwables.
		- #### resume
		
		
		
		```
		void resume​(java.lang.Throwable causedByFailure)
		```
		
		Recursively resume this actor and all its children. Is only allowed to throw Fatal Throwables.
		- #### self
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") self()
		```
		
		The \&ldquo;self\&rdquo; reference which this Cell is attached to.
		- #### sendMessage
		
		
		
		```
		void sendMessage​([Envelope](../dispatch/Envelope.html "class in akka.dispatch") msg)
		```
		
		Enqueue a message to be sent to the actor; may or may not actually
		 schedule the actor to run, depending on which type of cell it is.
		 Is only allowed to throw Fatal Throwables.
		- #### sendMessage
		
		
		
		```
		void sendMessage​(java.lang.Object message,
		                 [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Enqueue a message to be sent to the actor; may or may not actually
		 schedule the actor to run, depending on which type of cell it is.
		 Is only allowed to throw Fatal Throwables.
		- #### sendSystemMessage
		
		
		
		```
		void sendSystemMessage​([SystemMessage](../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") msg)
		```
		
		Enqueue a message to be sent to the actor; may or may not actually
		 schedule the actor to run, depending on which type of cell it is.
		 Is only allowed to throw Fatal Throwables.
		- #### start
		
		
		
		```
		[Cell](Cell.html "interface in akka.actor") start()
		```
		
		Start the cell: enqueued message must not be processed before this has
		 been called. The usual action is to attach the mailbox to a dispatcher.
		- #### stop
		
		
		
		```
		void stop()
		```
		
		Recursively terminate this actor and all its children. Is only allowed to throw Fatal Throwables.
		- #### suspend
		
		
		
		```
		void suspend()
		```
		
		Recursively suspend this actor and all its children. Is only allowed to throw Fatal Throwables.
		- #### system
		
		
		
		```
		[ActorSystem](ActorSystem.html "class in akka.actor") system()
		```
		
		The system within which this Cell lives.
		- #### systemImpl
		
		
		
		```
		akka.actor.ActorSystemImpl systemImpl()
		```
		
		The system internals where this Cell lives.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Cell.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ChildStats.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/dungeon/ChildrenContainer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/sysmsg/SystemMessage.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Cell.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Cell.html)*