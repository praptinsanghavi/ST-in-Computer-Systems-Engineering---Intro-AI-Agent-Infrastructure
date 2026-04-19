---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:29:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/TimerScheduler.html
title: TimerScheduler
---

# TimerScheduler

## Content

Package [akka.actor](package-summary.html)
## Class TimerScheduler

- java.lang.Object
- - akka.actor.TimerScheduler

- ---

```
public abstract class TimerScheduler
extends java.lang.Object
```

Support for scheduled `self` messages in an actor.
 It is used by mixing in trait `Timers` in Scala or extending `AbstractActorWithTimers`
 in Java.
 
 Timers are bound to the lifecycle of the actor that owns it,
 and thus are cancelled automatically when it is restarted or stopped.
 

`TimerScheduler` is not thread\-safe, i.e. it must only be used within
 the actor that owns it.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TimerScheduler](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `abstract void` | `[cancel](#cancel(java.lang.Object))​(java.lang.Object key)` | Cancel a timer with a given `key`. |
	| `abstract void` | `[cancelAll](#cancelAll())()` | Cancel all timers. |
	| `abstract boolean` | `[isTimerActive](#isTimerActive(java.lang.Object))​(java.lang.Object key)` | Check if a timer with a given `key` is active. |
	| `void` | `[startPeriodicTimer](#startPeriodicTimer(java.lang.Object,java.lang.Object,java.time.Duration))​(java.lang.Object key,  java.lang.Object msg,  java.time.Duration interval)` | Deprecated. Use startTimerWithFixedDelay or startTimerAtFixedRate instead. |
	| `abstract void` | `[startPeriodicTimer](#startPeriodicTimer(java.lang.Object,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.Object key,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration interval)` | Deprecated. Use startTimerWithFixedDelay or startTimerAtFixedRate instead. |
	| `void` | `[startSingleTimer](#startSingleTimer(java.lang.Object,java.lang.Object,java.time.Duration))​(java.lang.Object key,  java.lang.Object msg,  java.time.Duration timeout)` | Start a timer that will send `msg` once to the `self` actor after  the given `timeout`. |
	| `abstract void` | `[startSingleTimer](#startSingleTimer(java.lang.Object,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.Object key,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration timeout)` | Start a timer that will send `msg` once to the `self` actor after  the given `timeout`. |
	| `void` | `[startTimerAtFixedRate](#startTimerAtFixedRate(java.lang.Object,java.lang.Object,java.time.Duration))​(java.lang.Object key,  java.lang.Object msg,  java.time.Duration interval)` | Java API: Schedules a message to be sent repeatedly to the `self` actor with a  given frequency. |
	| `void` | `[startTimerAtFixedRate](#startTimerAtFixedRate(java.lang.Object,java.lang.Object,java.time.Duration,java.time.Duration))​(java.lang.Object key,  java.lang.Object msg,  java.time.Duration initialDelay,  java.time.Duration interval)` | Java API: Schedules a message to be sent repeatedly to the `self` actor with a  given frequency. |
	| `abstract void` | `[startTimerAtFixedRate](#startTimerAtFixedRate(java.lang.Object,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.Object key,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration interval)` | Scala API: Schedules a message to be sent repeatedly to the `self` actor with a  given frequency. |
	| `abstract void` | `[startTimerAtFixedRate](#startTimerAtFixedRate(java.lang.Object,java.lang.Object,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(java.lang.Object key,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval)` | Scala API: Schedules a message to be sent repeatedly to the `self` actor with a  given frequency. |
	| `void` | `[startTimerWithFixedDelay](#startTimerWithFixedDelay(java.lang.Object,java.lang.Object,java.time.Duration))​(java.lang.Object key,  java.lang.Object msg,  java.time.Duration delay)` | Java API: Schedules a message to be sent repeatedly to the `self` actor with a  fixed `delay` between messages. |
	| `void` | `[startTimerWithFixedDelay](#startTimerWithFixedDelay(java.lang.Object,java.lang.Object,java.time.Duration,java.time.Duration))​(java.lang.Object key,  java.lang.Object msg,  java.time.Duration initialDelay,  java.time.Duration delay)` | Java API: Schedules a message to be sent repeatedly to the `self` actor with a  fixed `delay` between messages after the `initialDelay`. |
	| `abstract void` | `[startTimerWithFixedDelay](#startTimerWithFixedDelay(java.lang.Object,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.Object key,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration delay)` | Scala API: Schedules a message to be sent repeatedly to the `self` actor with a  fixed `delay` between messages. |
	| `abstract void` | `[startTimerWithFixedDelay](#startTimerWithFixedDelay(java.lang.Object,java.lang.Object,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(java.lang.Object key,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration delay)` | Scala API: Schedules a message to be sent repeatedly to the `self` actor with a  fixed `delay` between messages after the `initialDelay`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TimerScheduler
		
		
		
		```
		public TimerScheduler()
		```

	- ### Method Detail
	
	
	
		- #### cancel
		
		
		
		```
		public abstract void cancel​(java.lang.Object key)
		```
		
		Cancel a timer with a given `key`.
		 If canceling a timer that was already canceled, or key never was used to start a timer
		 this operation will do nothing.
		 
		 It is guaranteed that a message from a canceled timer, including its previous incarnation
		 for the same key, will not be received by the actor, even though the message might already
		 be enqueued in the mailbox when cancel is called.
		- #### cancelAll
		
		
		
		```
		public abstract void cancelAll()
		```
		
		Cancel all timers.
		- #### isTimerActive
		
		
		
		```
		public abstract boolean isTimerActive​(java.lang.Object key)
		```
		
		Check if a timer with a given `key` is active.
		- #### startPeriodicTimer
		
		
		
		```
		public abstract void startPeriodicTimer​(java.lang.Object key,
		                                        java.lang.Object msg,
		                                        scala.concurrent.duration.FiniteDuration interval)
		```
		
		Deprecated.
		Use startTimerWithFixedDelay or startTimerAtFixedRate instead. This has the same semantics as startTimerAtFixedRate, but startTimerWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Deprecated API: See [`startTimerWithFixedDelay(java.lang.Object, java.lang.Object, scala.concurrent.duration.FiniteDuration)`](#startTimerWithFixedDelay(java.lang.Object,java.lang.Object,scala.concurrent.duration.FiniteDuration)) or [`startTimerAtFixedRate(java.lang.Object, java.lang.Object, scala.concurrent.duration.FiniteDuration)`](#startTimerAtFixedRate(java.lang.Object,java.lang.Object,scala.concurrent.duration.FiniteDuration)).
		- #### startPeriodicTimer
		
		
		
		```
		public final void startPeriodicTimer​(java.lang.Object key,
		                                     java.lang.Object msg,
		                                     java.time.Duration interval)
		```
		
		Deprecated.
		Use startTimerWithFixedDelay or startTimerAtFixedRate instead. This has the same semantics as startTimerAtFixedRate, but startTimerWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Deprecated API: See [`startTimerWithFixedDelay(java.lang.Object, java.lang.Object, scala.concurrent.duration.FiniteDuration)`](#startTimerWithFixedDelay(java.lang.Object,java.lang.Object,scala.concurrent.duration.FiniteDuration)) or [`startTimerAtFixedRate(java.lang.Object, java.lang.Object, scala.concurrent.duration.FiniteDuration)`](#startTimerAtFixedRate(java.lang.Object,java.lang.Object,scala.concurrent.duration.FiniteDuration)).
		- #### startSingleTimer
		
		
		
		```
		public abstract void startSingleTimer​(java.lang.Object key,
		                                      java.lang.Object msg,
		                                      scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Start a timer that will send `msg` once to the `self` actor after
		 the given `timeout`.
		 
		 Each timer has a key and if a new timer with same key is started
		 the previous is cancelled. It is guaranteed that a message from the
		 previous timer is not received, even if it was already enqueued
		 in the mailbox when the new timer was started.
		- #### startSingleTimer
		
		
		
		```
		public final void startSingleTimer​(java.lang.Object key,
		                                   java.lang.Object msg,
		                                   java.time.Duration timeout)
		```
		
		Start a timer that will send `msg` once to the `self` actor after
		 the given `timeout`.
		 
		 Each timer has a key and if a new timer with same key is started
		 the previous is cancelled. It is guaranteed that a message from the
		 previous timer is not received, even if it was already enqueued
		 in the mailbox when the new timer was started.
		- #### startTimerAtFixedRate
		
		
		
		```
		public abstract void startTimerAtFixedRate​(java.lang.Object key,
		                                           java.lang.Object msg,
		                                           scala.concurrent.duration.FiniteDuration interval)
		```
		
		Scala API: Schedules a message to be sent repeatedly to the `self` actor with a
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
		- #### startTimerAtFixedRate
		
		
		
		```
		public abstract void startTimerAtFixedRate​(java.lang.Object key,
		                                           java.lang.Object msg,
		                                           scala.concurrent.duration.FiniteDuration initialDelay,
		                                           scala.concurrent.duration.FiniteDuration interval)
		```
		
		Scala API: Schedules a message to be sent repeatedly to the `self` actor with a
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
		- #### startTimerAtFixedRate
		
		
		
		```
		public final void startTimerAtFixedRate​(java.lang.Object key,
		                                        java.lang.Object msg,
		                                        java.time.Duration interval)
		```
		
		Java API: Schedules a message to be sent repeatedly to the `self` actor with a
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
		- #### startTimerAtFixedRate
		
		
		
		```
		public final void startTimerAtFixedRate​(java.lang.Object key,
		                                        java.lang.Object msg,
		                                        java.time.Duration initialDelay,
		                                        java.time.Duration interval)
		```
		
		Java API: Schedules a message to be sent repeatedly to the `self` actor with a
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
		- #### startTimerWithFixedDelay
		
		
		
		```
		public abstract void startTimerWithFixedDelay​(java.lang.Object key,
		                                              java.lang.Object msg,
		                                              scala.concurrent.duration.FiniteDuration delay)
		```
		
		Scala API: Schedules a message to be sent repeatedly to the `self` actor with a
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
		- #### startTimerWithFixedDelay
		
		
		
		```
		public abstract void startTimerWithFixedDelay​(java.lang.Object key,
		                                              java.lang.Object msg,
		                                              scala.concurrent.duration.FiniteDuration initialDelay,
		                                              scala.concurrent.duration.FiniteDuration delay)
		```
		
		Scala API: Schedules a message to be sent repeatedly to the `self` actor with a
		 fixed `delay` between messages after the `initialDelay`.
		 
		 It will not compensate the delay between messages if scheduling is delayed
		 longer than specified for some reason. The delay between sending of subsequent
		 messages will always be (at least) the given `delay`.
		 
		
		
		 In the long run, the frequency of messages will generally be slightly lower than
		 the reciprocal of the specified `delay`.
		 
		
		
		 Each timer has a key and if a new timer with same key is started
		 the previous is cancelled. It is guaranteed that a message from the
		 previous timer is not received, even if it was already enqueued
		 in the mailbox when the new timer was started.
		- #### startTimerWithFixedDelay
		
		
		
		```
		public final void startTimerWithFixedDelay​(java.lang.Object key,
		                                           java.lang.Object msg,
		                                           java.time.Duration delay)
		```
		
		Java API: Schedules a message to be sent repeatedly to the `self` actor with a
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
		- #### startTimerWithFixedDelay
		
		
		
		```
		public final void startTimerWithFixedDelay​(java.lang.Object key,
		                                           java.lang.Object msg,
		                                           java.time.Duration initialDelay,
		                                           java.time.Duration delay)
		```
		
		Java API: Schedules a message to be sent repeatedly to the `self` actor with a
		 fixed `delay` between messages after the `initialDelay`.
		 
		 It will not compensate the delay between messages if scheduling is delayed
		 longer than specified for some reason. The delay between sending of subsequent
		 messages will always be (at least) the given `delay`.
		 
		
		
		 In the long run, the frequency of messages will generally be slightly lower than
		 the reciprocal of the specified `delay`.
		 
		
		
		 Each timer has a key and if a new timer with same key is started
		 the previous is cancelled. It is guaranteed that a message from the
		 previous timer is not received, even if it was already enqueued
		 in the mailbox when the new timer was started.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/TimerScheduler.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/TimerScheduler.html)*