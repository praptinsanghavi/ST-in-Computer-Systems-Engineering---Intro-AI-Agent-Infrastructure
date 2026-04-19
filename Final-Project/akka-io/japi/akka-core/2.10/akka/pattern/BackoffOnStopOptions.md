---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptions.html
title: BackoffOnStopOptions
---

# BackoffOnStopOptions

## Content

Package [akka.pattern](package-summary.html)
## Interface BackoffOnStopOptions

- All Superinterfaces:
`[ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")<[BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern")>`

All Known Implementing Classes:
`[BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")`

---

```
public interface BackoffOnStopOptions
extends [ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")<[BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern")>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern")` | `[withDefaultStoppingStrategy](#withDefaultStoppingStrategy())()` | Returns a new BackoffOptions with a default `SupervisorStrategy.stoppingStrategy`. |
	| `[BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern")` | `[withFinalStopMessage](#withFinalStopMessage(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> isFinalStopMessage)` | Predicate evaluated for each message, if it returns true and the supervised actor is  stopped then the supervisor will stop its self. |
	
	
		- ### Methods inherited from interface akka.pattern.[ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")
		
		
		`[props](ExtendedBackoffOptions.html#props()), [withAutoReset](ExtendedBackoffOptions.html#withAutoReset(scala.concurrent.duration.FiniteDuration)), [withHandlerWhileStopped](ExtendedBackoffOptions.html#withHandlerWhileStopped(akka.actor.ActorRef)), [withManualReset](ExtendedBackoffOptions.html#withManualReset()), [withMaxNrOfRetries](ExtendedBackoffOptions.html#withMaxNrOfRetries(int)), [withReplyWhileStopped](ExtendedBackoffOptions.html#withReplyWhileStopped(java.lang.Object)), [withSupervisorStrategy](ExtendedBackoffOptions.html#withSupervisorStrategy(akka.actor.OneForOneStrategy))`

- - ### Method Detail
	
	
	
		- #### withDefaultStoppingStrategy
		
		
		
		```
		[BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern") withDefaultStoppingStrategy()
		```
		
		Returns a new BackoffOptions with a default `SupervisorStrategy.stoppingStrategy`.
		 The default supervisor strategy is used as fallback for throwables not handled by `SupervisorStrategy.stoppingStrategy`.
		- #### withFinalStopMessage
		
		
		
		```
		[BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern") withFinalStopMessage​(scala.Function1<java.lang.Object,​java.lang.Object> isFinalStopMessage)
		```
		
		Predicate evaluated for each message, if it returns true and the supervised actor is
		 stopped then the supervisor will stop its self. If it returns true while
		 the supervised actor is running then it will be forwarded to the supervised actor and
		 when the supervised actor stops its self the supervisor will stop its self.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptionsImpl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ExtendedBackoffOptions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptions.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptions.html)*