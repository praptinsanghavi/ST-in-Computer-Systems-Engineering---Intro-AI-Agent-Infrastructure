---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/ExtendedBackoffOptions.html
title: ExtendedBackoffOptions
---

# ExtendedBackoffOptions

## Content

Package [akka.pattern](package-summary.html)
## Interface ExtendedBackoffOptions\<T extends ExtendedBackoffOptions\<T\>\>

- All Known Subinterfaces:
`[BackoffOnFailureOptions](BackoffOnFailureOptions.html "interface in akka.pattern")`, `[BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern")`

All Known Implementing Classes:
`[BackoffOnFailureOptionsImpl](BackoffOnFailureOptionsImpl.html "class in akka.pattern")`, `[BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")`

---

```
public interface ExtendedBackoffOptions<T extends ExtendedBackoffOptions<T>>
```

Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props())()` | Returns the props to create the back\-off supervisor. |
	| `[T](ExtendedBackoffOptions.html "type parameter in ExtendedBackoffOptions")` | `[withAutoReset](#withAutoReset(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration resetBackoff)` | Returns a new BackoffOptions with automatic back\-off reset. |
	| `[T](ExtendedBackoffOptions.html "type parameter in ExtendedBackoffOptions")` | `[withHandlerWhileStopped](#withHandlerWhileStopped(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler)` | Returns a new BackoffOptions with a custom handler for messages that the supervisor receives while its child is stopped. |
	| `[T](ExtendedBackoffOptions.html "type parameter in ExtendedBackoffOptions")` | `[withManualReset](#withManualReset())()` | Returns a new BackoffOptions with manual back\-off reset. |
	| `[T](ExtendedBackoffOptions.html "type parameter in ExtendedBackoffOptions")` | `[withMaxNrOfRetries](#withMaxNrOfRetries(int))​(int maxNrOfRetries)` | Returns a new BackoffOptions with a maximum number of retries to restart the child actor. |
	| `[T](ExtendedBackoffOptions.html "type parameter in ExtendedBackoffOptions")` | `[withReplyWhileStopped](#withReplyWhileStopped(java.lang.Object))​(java.lang.Object replyWhileStopped)` | Returns a new BackoffOptions with a constant reply to messages that the supervisor receives while its  child is stopped. |
	| `[T](ExtendedBackoffOptions.html "type parameter in ExtendedBackoffOptions")` | `[withSupervisorStrategy](#withSupervisorStrategy(akka.actor.OneForOneStrategy))​([OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy)` | Returns a new BackoffOptions with the supervisorStrategy. |

- - ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		[Props](../actor/Props.html "class in akka.actor") props()
		```
		
		Returns the props to create the back\-off supervisor.
		- #### withAutoReset
		
		
		
		```
		[T](ExtendedBackoffOptions.html "type parameter in ExtendedBackoffOptions") withAutoReset​(scala.concurrent.duration.FiniteDuration resetBackoff)
		```
		
		Returns a new BackoffOptions with automatic back\-off reset.
		 The back\-off algorithm is reset if the child does not crash within the specified `resetBackoff`.
		 
		
		Parameters:
		`resetBackoff` \- The back\-off is reset if the child does not crash within this duration.
		- #### withHandlerWhileStopped
		
		
		
		```
		[T](ExtendedBackoffOptions.html "type parameter in ExtendedBackoffOptions") withHandlerWhileStopped​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler)
		```
		
		Returns a new BackoffOptions with a custom handler for messages that the supervisor receives while its child is stopped.
		 By default, a message received while the child is stopped is forwarded to `deadLetters`.
		 Essentially, this handler replaces `deadLetters` allowing to implement custom handling instead of a static reply.
		 
		
		Parameters:
		`handler` \- PartialFunction of the received message and sender
		- #### withManualReset
		
		
		
		```
		[T](ExtendedBackoffOptions.html "type parameter in ExtendedBackoffOptions") withManualReset()
		```
		
		Returns a new BackoffOptions with manual back\-off reset. The back\-off is only reset
		 if the child sends a `BackoffSupervisor.Reset` to its parent (the backoff\-supervisor actor).
		- #### withMaxNrOfRetries
		
		
		
		```
		[T](ExtendedBackoffOptions.html "type parameter in ExtendedBackoffOptions") withMaxNrOfRetries​(int maxNrOfRetries)
		```
		
		Returns a new BackoffOptions with a maximum number of retries to restart the child actor.
		 By default, the supervisor will retry infinitely.
		 With this option, the supervisor will terminate itself after the maxNoOfRetries is reached.
		 
		
		Parameters:
		`maxNrOfRetries` \- the number of times a child actor is allowed to be restarted.
		 If negative, the value is unbounded, otherwise the provided
		 limit is used. If the limit is exceeded the child actor will be stopped.
		- #### withReplyWhileStopped
		
		
		
		```
		[T](ExtendedBackoffOptions.html "type parameter in ExtendedBackoffOptions") withReplyWhileStopped​(java.lang.Object replyWhileStopped)
		```
		
		Returns a new BackoffOptions with a constant reply to messages that the supervisor receives while its
		 child is stopped. By default, a message received while the child is stopped is forwarded to `deadLetters`.
		 With this option, the supervisor will reply to the sender instead.
		 
		
		Parameters:
		`replyWhileStopped` \- The message that the supervisor will send in response to all messages while
		 its child is stopped.
		- #### withSupervisorStrategy
		
		
		
		```
		[T](ExtendedBackoffOptions.html "type parameter in ExtendedBackoffOptions") withSupervisorStrategy​([OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy)
		```
		
		Returns a new BackoffOptions with the supervisorStrategy.
		 
		
		Parameters:
		`supervisorStrategy` \- the supervisorStrategy that the back\-off supervisor will use.
		 The default supervisor strategy is used as fallback if the specified supervisorStrategy (its decider)
		 does not explicitly handle an exception. As the BackoffSupervisor creates a separate actor to handle the
		 backoff process, only a `OneForOneStrategy` makes sense here.
		 Note that changing the strategy will replace the previously defined maxNrOfRetries.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/OneForOneStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffOnFailureOptionsImpl.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffOnStopOptionsImpl.html
- https://doc.akka.io/japi/akka/current/akka/pattern/ExtendedBackoffOptions.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/ExtendedBackoffOptions.html](https://doc.akka.io/japi/akka/current/akka/pattern/ExtendedBackoffOptions.html)*