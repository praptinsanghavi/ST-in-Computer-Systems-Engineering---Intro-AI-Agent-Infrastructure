---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/TimerSchedulerCrossDslSupport.html
title: TimerSchedulerCrossDslSupport
---

# TimerSchedulerCrossDslSupport

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Interface TimerSchedulerCrossDslSupport\<T\>

- All Superinterfaces:
`[TimerScheduler](../javadsl/TimerScheduler.html "interface in akka.actor.typed.javadsl")<T>`, `[TimerScheduler](../scaladsl/TimerScheduler.html "interface in akka.actor.typed.scaladsl")<T>`

---

```
public interface TimerSchedulerCrossDslSupport<T>
extends [TimerScheduler](../scaladsl/TimerScheduler.html "interface in akka.actor.typed.scaladsl")<T>, [TimerScheduler](../javadsl/TimerScheduler.html "interface in akka.actor.typed.javadsl")<T>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[startPeriodicTimer](#startPeriodicTimer(java.lang.Object,T,java.time.Duration))​(java.lang.Object key,  [T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport") msg,  java.time.Duration interval)` | Deprecated API: See [`TimerScheduler.startTimerWithFixedDelay(java.lang.Object, T, java.time.Duration)`](../javadsl/TimerScheduler.html#startTimerWithFixedDelay(java.lang.Object,T,java.time.Duration)) or [`TimerScheduler.startTimerAtFixedRate(java.lang.Object, T, java.time.Duration)`](../javadsl/TimerScheduler.html#startTimerAtFixedRate(java.lang.Object,T,java.time.Duration)). |
	| `void` | `[startSingleTimer](#startSingleTimer(java.lang.Object,T,java.time.Duration))​(java.lang.Object key,  [T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport") msg,  java.time.Duration delay)` | Start a timer that will send `msg` once to the `self` actor after  the given `delay`. |
	| `void` | `[startTimerAtFixedRate](#startTimerAtFixedRate(java.lang.Object,T,java.time.Duration))​(java.lang.Object key,  [T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport") msg,  java.time.Duration interval)` | Schedules a message to be sent repeatedly to the `self` actor with a  given frequency. |
	| `void` | `[startTimerAtFixedRate](#startTimerAtFixedRate(java.lang.Object,T,java.time.Duration,java.time.Duration))​(java.lang.Object key,  [T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport") msg,  java.time.Duration initialDelay,  java.time.Duration interval)` | Schedules a message to be sent repeatedly to the `self` actor with a  given frequency. |
	| `void` | `[startTimerWithFixedDelay](#startTimerWithFixedDelay(java.lang.Object,T,java.time.Duration))​(java.lang.Object key,  [T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport") msg,  java.time.Duration delay)` | Schedules a message to be sent repeatedly to the `self` actor with a  fixed `delay` between messages. |
	| `void` | `[startTimerWithFixedDelay](#startTimerWithFixedDelay(java.lang.Object,T,java.time.Duration,java.time.Duration))​(java.lang.Object key,  [T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport") msg,  java.time.Duration initialDelay,  java.time.Duration delay)` | Schedules a message to be sent repeatedly to the `self` actor with a  fixed `delay` between messages after `initialDelay`. |
	
	
		- ### Methods inherited from interface akka.actor.typed.javadsl.[TimerScheduler](../javadsl/TimerScheduler.html "interface in akka.actor.typed.javadsl")
		
		
		`[cancel](../javadsl/TimerScheduler.html#cancel(java.lang.Object)), [cancelAll](../javadsl/TimerScheduler.html#cancelAll()), [isTimerActive](../javadsl/TimerScheduler.html#isTimerActive(java.lang.Object)), [startSingleTimer](../javadsl/TimerScheduler.html#startSingleTimer(T,java.time.Duration)), [startTimerAtFixedRate](../javadsl/TimerScheduler.html#startTimerAtFixedRate(T,java.time.Duration)), [startTimerAtFixedRate](../javadsl/TimerScheduler.html#startTimerAtFixedRate(T,java.time.Duration,java.time.Duration)), [startTimerWithFixedDelay](../javadsl/TimerScheduler.html#startTimerWithFixedDelay(T,java.time.Duration)), [startTimerWithFixedDelay](../javadsl/TimerScheduler.html#startTimerWithFixedDelay(T,java.time.Duration,java.time.Duration))`
		- ### Methods inherited from interface akka.actor.typed.scaladsl.[TimerScheduler](../scaladsl/TimerScheduler.html "interface in akka.actor.typed.scaladsl")
		
		
		`[cancel](../scaladsl/TimerScheduler.html#cancel(java.lang.Object)), [cancelAll](../scaladsl/TimerScheduler.html#cancelAll()), [isTimerActive](../scaladsl/TimerScheduler.html#isTimerActive(java.lang.Object)), [startPeriodicTimer](../scaladsl/TimerScheduler.html#startPeriodicTimer(java.lang.Object,T,scala.concurrent.duration.FiniteDuration)), [startSingleTimer](../scaladsl/TimerScheduler.html#startSingleTimer(java.lang.Object,T,scala.concurrent.duration.FiniteDuration)), [startSingleTimer](../scaladsl/TimerScheduler.html#startSingleTimer(T,scala.concurrent.duration.FiniteDuration)), [startTimerAtFixedRate](../scaladsl/TimerScheduler.html#startTimerAtFixedRate(java.lang.Object,T,scala.concurrent.duration.FiniteDuration)), [startTimerAtFixedRate](../scaladsl/TimerScheduler.html#startTimerAtFixedRate(java.lang.Object,T,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration)), [startTimerAtFixedRate](../scaladsl/TimerScheduler.html#startTimerAtFixedRate(T,scala.concurrent.duration.FiniteDuration)), [startTimerAtFixedRate](../scaladsl/TimerScheduler.html#startTimerAtFixedRate(T,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration)), [startTimerWithFixedDelay](../scaladsl/TimerScheduler.html#startTimerWithFixedDelay(java.lang.Object,T,scala.concurrent.duration.FiniteDuration)), [startTimerWithFixedDelay](../scaladsl/TimerScheduler.html#startTimerWithFixedDelay(java.lang.Object,T,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration)), [startTimerWithFixedDelay](../scaladsl/TimerScheduler.html#startTimerWithFixedDelay(T,scala.concurrent.duration.FiniteDuration)), [startTimerWithFixedDelay](../scaladsl/TimerScheduler.html#startTimerWithFixedDelay(T,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))`

- - ### Method Detail
	
	
	
		- #### startPeriodicTimer
		
		
		
		```
		void startPeriodicTimer​(java.lang.Object key,
		                        [T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport") msg,
		                        java.time.Duration interval)
		```
		
		Description copied from interface: `[TimerScheduler](../javadsl/TimerScheduler.html#startPeriodicTimer(java.lang.Object,T,java.time.Duration))`
		Deprecated API: See [`TimerScheduler.startTimerWithFixedDelay(java.lang.Object, T, java.time.Duration)`](../javadsl/TimerScheduler.html#startTimerWithFixedDelay(java.lang.Object,T,java.time.Duration)) or [`TimerScheduler.startTimerAtFixedRate(java.lang.Object, T, java.time.Duration)`](../javadsl/TimerScheduler.html#startTimerAtFixedRate(java.lang.Object,T,java.time.Duration)).
		
		Specified by:
		`[startPeriodicTimer](../javadsl/TimerScheduler.html#startPeriodicTimer(java.lang.Object,T,java.time.Duration))` in interface `[TimerScheduler](../javadsl/TimerScheduler.html "interface in akka.actor.typed.javadsl")<[T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport")>`
		- #### startSingleTimer
		
		
		
		```
		void startSingleTimer​(java.lang.Object key,
		                      [T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport") msg,
		                      java.time.Duration delay)
		```
		
		Description copied from interface: `[TimerScheduler](../javadsl/TimerScheduler.html#startSingleTimer(java.lang.Object,T,java.time.Duration))`
		Start a timer that will send `msg` once to the `self` actor after
		 the given `delay`.
		 
		 Each timer has a key and if a new timer with same key is started
		 the previous is cancelled. It is guaranteed that a message from the
		 previous timer is not received, even if it was already enqueued
		 in the mailbox when the new timer was started.
		
		
		
		Specified by:
		`[startSingleTimer](../javadsl/TimerScheduler.html#startSingleTimer(java.lang.Object,T,java.time.Duration))` in interface `[TimerScheduler](../javadsl/TimerScheduler.html "interface in akka.actor.typed.javadsl")<[T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport")>`
		- #### startTimerAtFixedRate
		
		
		
		```
		void startTimerAtFixedRate​(java.lang.Object key,
		                           [T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport") msg,
		                           java.time.Duration interval)
		```
		
		Description copied from interface: `[TimerScheduler](../javadsl/TimerScheduler.html#startTimerAtFixedRate(java.lang.Object,T,java.time.Duration))`
		Schedules a message to be sent repeatedly to the `self` actor with a
		 given frequency.
		 
		 It will compensate the delay for a subsequent message if the sending of previous
		 message was delayed more than specified. In such cases, the actual message interval
		 will differ from the interval passed to the method.
		 
		
		
		 If the execution is delayed longer than the `interval`, the subsequent message will
		 be sent immediately after the prior one. This also has the consequence that after
		 long garbage collection pauses or other reasons when the JVM was suspended all
		 "missed" messages will be sent when the process wakes up again.
		 
		
		
		 In the long run, the frequency of messages will be exactly the reciprocal of the
		 specified `interval`.
		 
		
		
		 Warning: `startTimerAtFixedRate` can result in bursts of scheduled messages after long
		 garbage collection pauses, which may in worst case cause undesired load on the system.
		 Therefore `startTimerWithFixedDelay` is often preferred.
		 
		
		
		 Each timer has a key and if a new timer with same key is started
		 the previous is cancelled. It is guaranteed that a message from the
		 previous timer is not received, even if it was already enqueued
		 in the mailbox when the new timer was started.
		
		
		
		Specified by:
		`[startTimerAtFixedRate](../javadsl/TimerScheduler.html#startTimerAtFixedRate(java.lang.Object,T,java.time.Duration))` in interface `[TimerScheduler](../javadsl/TimerScheduler.html "interface in akka.actor.typed.javadsl")<[T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport")>`
		- #### startTimerAtFixedRate
		
		
		
		```
		void startTimerAtFixedRate​(java.lang.Object key,
		                           [T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport") msg,
		                           java.time.Duration initialDelay,
		                           java.time.Duration interval)
		```
		
		Description copied from interface: `[TimerScheduler](../javadsl/TimerScheduler.html#startTimerAtFixedRate(java.lang.Object,T,java.time.Duration,java.time.Duration))`
		Schedules a message to be sent repeatedly to the `self` actor with a
		 given frequency.
		 
		 It will compensate the delay for a subsequent message if the sending of previous
		 message was delayed more than specified. In such cases, the actual message interval
		 will differ from the interval passed to the method.
		 
		
		
		 If the execution is delayed longer than the `interval`, the subsequent message will
		 be sent immediately after the prior one. This also has the consequence that after
		 long garbage collection pauses or other reasons when the JVM was suspended all
		 "missed" messages will be sent when the process wakes up again.
		 
		
		
		 In the long run, the frequency of messages will be exactly the reciprocal of the
		 specified `interval` after `initialDelay`.
		 
		
		
		 Warning: `startTimerAtFixedRate` can result in bursts of scheduled messages after long
		 garbage collection pauses, which may in worst case cause undesired load on the system.
		 Therefore `startTimerWithFixedDelay` is often preferred.
		 
		
		
		 Each timer has a key and if a new timer with same key is started
		 the previous is cancelled. It is guaranteed that a message from the
		 previous timer is not received, even if it was already enqueued
		 in the mailbox when the new timer was started.
		
		
		
		Specified by:
		`[startTimerAtFixedRate](../javadsl/TimerScheduler.html#startTimerAtFixedRate(java.lang.Object,T,java.time.Duration,java.time.Duration))` in interface `[TimerScheduler](../javadsl/TimerScheduler.html "interface in akka.actor.typed.javadsl")<[T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport")>`
		- #### startTimerWithFixedDelay
		
		
		
		```
		void startTimerWithFixedDelay​(java.lang.Object key,
		                              [T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport") msg,
		                              java.time.Duration delay)
		```
		
		Description copied from interface: `[TimerScheduler](../javadsl/TimerScheduler.html#startTimerWithFixedDelay(java.lang.Object,T,java.time.Duration))`
		Schedules a message to be sent repeatedly to the `self` actor with a
		 fixed `delay` between messages.
		 
		 It will not compensate the delay between messages if scheduling is delayed
		 longer than specified for some reason. The delay between sending of subsequent
		 messages will always be (at least) the given `delay`.
		 
		
		
		 In the long run, the frequency of messages will generally be slightly lower than
		 the reciprocal of the specified `delay`.
		 
		
		
		 Each timer has a key and if a new timer with same key is started
		 the previous is cancelled. It is guaranteed that a message from the
		 previous timer is not received, even if it was already enqueued
		 in the mailbox when the new timer was started.
		
		
		
		Specified by:
		`[startTimerWithFixedDelay](../javadsl/TimerScheduler.html#startTimerWithFixedDelay(java.lang.Object,T,java.time.Duration))` in interface `[TimerScheduler](../javadsl/TimerScheduler.html "interface in akka.actor.typed.javadsl")<[T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport")>`
		- #### startTimerWithFixedDelay
		
		
		
		```
		void startTimerWithFixedDelay​(java.lang.Object key,
		                              [T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport") msg,
		                              java.time.Duration initialDelay,
		                              java.time.Duration delay)
		```
		
		Description copied from interface: `[TimerScheduler](../javadsl/TimerScheduler.html#startTimerWithFixedDelay(java.lang.Object,T,java.time.Duration,java.time.Duration))`
		Schedules a message to be sent repeatedly to the `self` actor with a
		 fixed `delay` between messages after `initialDelay`.
		 
		 It will not compensate the delay between messages if scheduling is delayed
		 longer than specified for some reason. The delay between sending of subsequent
		 messages will always be (at least) the given `delay`.
		 
		
		
		 In the long run, the frequency of messages will generally be slightly lower than
		 the reciprocal of the specified `delay`.
		 
		
		
		 Each timer has a key and if a new timer with same key is started
		 the previous is cancelled. It is guaranteed that a message from the
		 previous timer is not received, even if it was already enqueued
		 in the mailbox when the new timer was started.
		
		
		
		Specified by:
		`[startTimerWithFixedDelay](../javadsl/TimerScheduler.html#startTimerWithFixedDelay(java.lang.Object,T,java.time.Duration,java.time.Duration))` in interface `[TimerScheduler](../javadsl/TimerScheduler.html "interface in akka.actor.typed.javadsl")<[T](TimerSchedulerCrossDslSupport.html "type parameter in TimerSchedulerCrossDslSupport")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/TimerSchedulerCrossDslSupport.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/TimerScheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/TimerScheduler.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/TimerSchedulerCrossDslSupport.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/TimerSchedulerCrossDslSupport.html)*