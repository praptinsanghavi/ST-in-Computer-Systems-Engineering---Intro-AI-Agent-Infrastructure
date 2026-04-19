---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/StashManagement.html
title: StashManagement
---

# StashManagement

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Interface StashManagement\<C,​S\>

- ---

```
public interface StashManagement<C,​S>
```

INTERNAL API: Stash management for persistent behaviors

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")>` | `[context](#context())()` |  |
	| `boolean` | `[isInternalStashEmpty](#isInternalStashEmpty())()` |  |
	| `boolean` | `[isStashEmpty](#isStashEmpty())()` |  |
	| `boolean` | `[isUnstashAllInProgress](#isUnstashAllInProgress())()` |  |
	| `void` | `[logStashMessage](#logStashMessage(akka.persistence.typed.state.internal.InternalProtocol,akka.actor.typed.scaladsl.StashBuffer))​([InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal") msg,  [StashBuffer](../../../../actor/typed/scaladsl/StashBuffer.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> buffer)` |  |
	| `void` | `[logUnstashAll](#logUnstashAll())()` |  |
	| `void` | `[logUnstashMessage](#logUnstashMessage(akka.actor.typed.scaladsl.StashBuffer))​([StashBuffer](../../../../actor/typed/scaladsl/StashBuffer.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> buffer)` |  |
	| `akka.persistence.typed.state.internal.BehaviorSetup<[C](StashManagement.html "type parameter in StashManagement"),​[S](StashManagement.html "type parameter in StashManagement")>` | `[setup](#setup())()` |  |
	| `void` | `[stash](#stash(akka.persistence.typed.state.internal.InternalProtocol,akka.actor.typed.scaladsl.StashBuffer))​([InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal") msg,  [StashBuffer](../../../../actor/typed/scaladsl/StashBuffer.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> buffer)` |  |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")>` | `[stashInternal](#stashInternal(akka.persistence.typed.state.internal.InternalProtocol))​([InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal") msg)` | Stash a command to the internal stash buffer, which is used while waiting for persist to be completed. |
	| `akka.persistence.typed.state.internal.StashState` | `[stashState](#stashState())()` |  |
	| `void` | `[stashUser](#stashUser(akka.persistence.typed.state.internal.InternalProtocol))​([InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal") msg)` | Stash a command to the user stash buffer, which is used when `Stash` effect is used. |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")>` | `[tryUnstashOne](#tryUnstashOne(akka.actor.typed.Behavior))​([Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> behavior)` | `tryUnstashOne` is called at the end of processing each command, or when persist is completed |
	| `void` | `[unstashAll](#unstashAll())()` | Subsequent `tryUnstashOne` will drain the user stash buffer before using the  internal stash buffer. |

- - ### Method Detail
	
	
	
		- #### context
		
		
		
		```
		[ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> context()
		```
		- #### isInternalStashEmpty
		
		
		
		```
		boolean isInternalStashEmpty()
		```
		- #### isStashEmpty
		
		
		
		```
		boolean isStashEmpty()
		```
		
		
		Returns:
		false if `tryUnstashOne` will unstash a message
		- #### isUnstashAllInProgress
		
		
		
		```
		boolean isUnstashAllInProgress()
		```
		- #### logStashMessage
		
		
		
		```
		void logStashMessage​([InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal") msg,
		                     [StashBuffer](../../../../actor/typed/scaladsl/StashBuffer.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> buffer)
		```
		- #### logUnstashAll
		
		
		
		```
		void logUnstashAll()
		```
		- #### logUnstashMessage
		
		
		
		```
		void logUnstashMessage​([StashBuffer](../../../../actor/typed/scaladsl/StashBuffer.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> buffer)
		```
		- #### setup
		
		
		
		```
		akka.persistence.typed.state.internal.BehaviorSetup<[C](StashManagement.html "type parameter in StashManagement"),​[S](StashManagement.html "type parameter in StashManagement")> setup()
		```
		- #### stash
		
		
		
		```
		void stash​([InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal") msg,
		           [StashBuffer](../../../../actor/typed/scaladsl/StashBuffer.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> buffer)
		```
		- #### stashInternal
		
		
		
		```
		[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> stashInternal​([InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal") msg)
		```
		
		Stash a command to the internal stash buffer, which is used while waiting for persist to be completed.
		- #### stashState
		
		
		
		```
		akka.persistence.typed.state.internal.StashState stashState()
		```
		- #### stashUser
		
		
		
		```
		void stashUser​([InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal") msg)
		```
		
		Stash a command to the user stash buffer, which is used when `Stash` effect is used.
		- #### tryUnstashOne
		
		
		
		```
		[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> tryUnstashOne​([Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> behavior)
		```
		
		`tryUnstashOne` is called at the end of processing each command, or when persist is completed
		- #### unstashAll
		
		
		
		```
		void unstashAll()
		```
		
		Subsequent `tryUnstashOne` will drain the user stash buffer before using the
		 internal stash buffer. It will unstash as many commands as are in the buffer when
		 `unstashAll` was called, i.e. if subsequent commands stash more, those will
		 not be unstashed until `unstashAll` is called again.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/StashManagement.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/StashManagement.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/StashManagement.html)*