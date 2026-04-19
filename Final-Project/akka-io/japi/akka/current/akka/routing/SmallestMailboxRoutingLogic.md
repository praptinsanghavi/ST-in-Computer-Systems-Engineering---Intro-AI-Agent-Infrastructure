---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/SmallestMailboxRoutingLogic.html
title: SmallestMailboxRoutingLogic
---

# SmallestMailboxRoutingLogic

## Content

Package [akka.routing](package-summary.html)
## Class SmallestMailboxRoutingLogic

- java.lang.Object
- - akka.routing.SmallestMailboxRoutingLogic

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[RoutingLogic](RoutingLogic.html "interface in akka.routing")`

---

```
public class SmallestMailboxRoutingLogic
extends java.lang.Object
implements [RoutingLogic](RoutingLogic.html "interface in akka.routing")
```

Tries to send to the non\-suspended routee with fewest messages in mailbox.
 The selection is done in this order:
 
	- pick any idle routee (not processing message) with empty mailbox
	- pick any routee with empty mailbox
	- pick routee with fewest pending messages in mailbox
	- pick any remote routee, remote actors are consider lowest priority,
	 since their mailbox size is unknown

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SmallestMailboxRoutingLogic](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SmallestMailboxRoutingLogic](SmallestMailboxRoutingLogic.html "class in akka.routing")` | `[apply](#apply())()` |  |
	| `protected boolean` | `[hasMessages](#hasMessages(akka.routing.Routee))​([Routee](Routee.html "interface in akka.routing") a)` | Returns true if the actor currently has any pending messages  in the mailbox, i.e. |
	| `protected boolean` | `[isProcessingMessage](#isProcessingMessage(akka.routing.Routee))​([Routee](Routee.html "interface in akka.routing") a)` | Returns true if the actor is currently processing a message. |
	| `protected boolean` | `[isSuspended](#isSuspended(akka.routing.Routee))​([Routee](Routee.html "interface in akka.routing") a)` | Returns true if the actor is currently suspended. |
	| `protected boolean` | `[isTerminated](#isTerminated(akka.routing.Routee))​([Routee](Routee.html "interface in akka.routing") a)` |  |
	| `protected int` | `[numberOfMessages](#numberOfMessages(akka.routing.Routee))​([Routee](Routee.html "interface in akka.routing") a)` | Returns the number of pending messages in the mailbox of the actor. |
	| `[Routee](Routee.html "interface in akka.routing")` | `[select](#select(java.lang.Object,scala.collection.immutable.IndexedSeq))​(java.lang.Object message,  scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` | Pick the destination for a given message. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SmallestMailboxRoutingLogic
		
		
		
		```
		public SmallestMailboxRoutingLogic()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SmallestMailboxRoutingLogic](SmallestMailboxRoutingLogic.html "class in akka.routing") apply()
		```
		- #### select
		
		
		
		```
		public [Routee](Routee.html "interface in akka.routing") select​(java.lang.Object message,
		                     scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		
		Description copied from interface: `[RoutingLogic](RoutingLogic.html#select(java.lang.Object,scala.collection.immutable.IndexedSeq))`
		Pick the destination for a given message. Normally it picks one of the
		 passed `routees`, but in the end it is up to the implementation to
		 return whatever [`Routee`](Routee.html "interface in akka.routing") to use for sending a specific message.
		 
		 When implemented from Java it can be good to know that
		 `routees.apply(index)` can be used to get an element
		 from the `IndexedSeq`.
		
		
		
		Specified by:
		`[select](RoutingLogic.html#select(java.lang.Object,scala.collection.immutable.IndexedSeq))` in interface `[RoutingLogic](RoutingLogic.html "interface in akka.routing")`
		- #### isTerminated
		
		
		
		```
		protected boolean isTerminated​([Routee](Routee.html "interface in akka.routing") a)
		```
		- #### isProcessingMessage
		
		
		
		```
		protected boolean isProcessingMessage​([Routee](Routee.html "interface in akka.routing") a)
		```
		
		Returns true if the actor is currently processing a message.
		 It will always return false for remote actors.
		 Method is exposed to subclasses to be able to implement custom
		 routers based on mailbox and actor internal state.
		- #### hasMessages
		
		
		
		```
		protected boolean hasMessages​([Routee](Routee.html "interface in akka.routing") a)
		```
		
		Returns true if the actor currently has any pending messages
		 in the mailbox, i.e. the mailbox is not empty.
		 It will always return false for remote actors.
		 Method is exposed to subclasses to be able to implement custom
		 routers based on mailbox and actor internal state.
		- #### isSuspended
		
		
		
		```
		protected boolean isSuspended​([Routee](Routee.html "interface in akka.routing") a)
		```
		
		Returns true if the actor is currently suspended.
		 It will always return false for remote actors.
		 Method is exposed to subclasses to be able to implement custom
		 routers based on mailbox and actor internal state.
		- #### numberOfMessages
		
		
		
		```
		protected int numberOfMessages​([Routee](Routee.html "interface in akka.routing") a)
		```
		
		Returns the number of pending messages in the mailbox of the actor.
		 It will always return 0 for remote actors.
		 Method is exposed to subclasses to be able to implement custom
		 routers based on mailbox and actor internal state.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka/current/akka/routing/Routee.html
- https://doc.akka.io/japi/akka/current/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/routing/SmallestMailboxRoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/SmallestMailboxRoutingLogic.html](https://doc.akka.io/japi/akka/current/akka/routing/SmallestMailboxRoutingLogic.html)*