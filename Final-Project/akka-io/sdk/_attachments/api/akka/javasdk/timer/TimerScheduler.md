---
description: 'declaration: package: akka.javasdk.timer, interface: TimerScheduler'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:18Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timer/TimerScheduler.html
title: TimerScheduler
---

# TimerScheduler

> **Summary:** declaration: package: akka.javasdk.timer, interface: TimerScheduler

## Content

Package [akka.javasdk.timer](package-summary.html)
# Interface TimerScheduler

---

public interface TimerScheduler

- ## Method Summary

Modifier and Type
Method
Description
`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<akka.Done>`
`[cancel](#cancel(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Deprecated, for removal: This API element is subject to removal in a future version.
User [`deleteAsync(String)`](#deleteAsync(java.lang.String)) instead.

`<I,
O> void`
`[createSingleTimer](#createSingleTimer(java.lang.String,java.time.Duration,int,akka.javasdk.DeferredCall))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name,
 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay,
 int maxRetries,
 [DeferredCall](../DeferredCall.html "interface in akka.javasdk")<I,O> deferredCall)`

Schedule a single timer.

`<I,
O> void`
`[createSingleTimer](#createSingleTimer(java.lang.String,java.time.Duration,akka.javasdk.DeferredCall))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name,
 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay,
 [DeferredCall](../DeferredCall.html "interface in akka.javasdk")<I,O> deferredCall)`

Schedule a single timer.

`<I,
O> [CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<akka.Done>`
`[createSingleTimerAsync](#createSingleTimerAsync(java.lang.String,java.time.Duration,int,akka.javasdk.DeferredCall))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name,
 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay,
 int maxRetries,
 [DeferredCall](../DeferredCall.html "interface in akka.javasdk")<I,O> deferredCall)`

Schedule a single timer.

`<I,
O> [CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<akka.Done>`
`[createSingleTimerAsync](#createSingleTimerAsync(java.lang.String,java.time.Duration,akka.javasdk.DeferredCall))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name,
 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay,
 [DeferredCall](../DeferredCall.html "interface in akka.javasdk")<I,O> deferredCall)`

Schedule a single timer.

`void`
`[delete](#delete(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Delete an existing timer.

`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<akka.Done>`
`[deleteAsync](#deleteAsync(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Delete an existing timer.

`<I,
O> [CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<akka.Done>`
`[startSingleTimer](#startSingleTimer(java.lang.String,java.time.Duration,int,akka.javasdk.DeferredCall))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name,
 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay,
 int maxRetries,
 [DeferredCall](../DeferredCall.html "interface in akka.javasdk")<I,O> deferredCall)`

Deprecated, for removal: This API element is subject to removal in a future version.
Use [`createSingleTimerAsync(String, Duration, int, DeferredCall)`](#createSingleTimerAsync(java.lang.String,java.time.Duration,int,akka.javasdk.DeferredCall)) instead.

`<I,
O> [CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<akka.Done>`
`[startSingleTimer](#startSingleTimer(java.lang.String,java.time.Duration,akka.javasdk.DeferredCall))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name,
 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay,
 [DeferredCall](../DeferredCall.html "interface in akka.javasdk")<I,O> deferredCall)`

Deprecated, for removal: This API element is subject to removal in a future version.
Use [`createSingleTimerAsync(String, Duration, DeferredCall)`](#createSingleTimerAsync(java.lang.String,java.time.Duration,akka.javasdk.DeferredCall))
 instead.

- ## Method Details

	- ### createSingleTimer
	
	
	\<I,
	O\> void createSingleTimer([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name,
	 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay,
	 [DeferredCall](../DeferredCall.html "interface in akka.javasdk")\<I,O\> deferredCall)
	Schedule a single timer. Timers allow for scheduling calls in the future. For example, to
	 verify that some process have been completed or not.
	
	 Timers are persisted and are guaranteed to run at least once.
	
	 
	
	When a timer is triggered, the scheduled call is executed. If successfully executed, the
	 timer completes and is automatically removed. In case of a failure, the timer is rescheduled
	 with an exponentially increasing delay, starting at 3 seconds with a max delay of 30 seconds.
	 This process repeats until the call succeeds.
	
	 
	
	Each timer has a `name` and if a new timer with same `name` is registered the
	 previous is cancelled.
	
	
	
	Parameters:
	`name` \- unique name for the timer
	`delay` \- delay, starting from now, in which the timer should be triggered
	`deferredCall` \- a call to component that will be executed when the timer is triggered
	- ### createSingleTimer
	
	
	\<I,
	O\> void createSingleTimer([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name,
	 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay,
	 int maxRetries,
	 [DeferredCall](../DeferredCall.html "interface in akka.javasdk")\<I,O\> deferredCall)
	Schedule a single timer. Timers allow for scheduling calls in the future. For example, to
	 verify that some process have been completed or not.
	
	 Timers are persisted and are guaranteed to run at least once.
	
	 
	
	When a timer is triggered, the scheduled call is executed. If successfully executed, the
	 timer completes and is automatically removed. In case of a failure, the timer is rescheduled
	 with a delay of 3 seconds. This process repeats until the call succeeds or the maxRetries limit
	 is reached.
	
	 
	
	Each timer has a `name` and if a new timer with same `name` is registered the
	 previous is cancelled.
	
	
	
	Parameters:
	`name` \- unique name for the timer
	`delay` \- delay, starting from now, in which the timer should be triggered
	`maxRetries` \- Retry up to this many times before giving up
	`deferredCall` \- a call to component that will be executed when the timer is triggered
	- ### delete
	
	
	void delete([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Delete an existing timer. This completes successfully if no timer is registered for the passed
	 name.
	- ### createSingleTimerAsync
	
	
	\<I,
	O\> [CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<akka.Done\> createSingleTimerAsync([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name,
	 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay,
	 [DeferredCall](../DeferredCall.html "interface in akka.javasdk")\<I,O\> deferredCall)
	Schedule a single timer. Timers allow for scheduling calls in the future. For example, to
	 verify that some process have been completed or not.
	
	 Timers are persisted and are guaranteed to run at least once.
	
	 
	
	When a timer is triggered, the scheduled call is executed. If successfully executed, the
	 timer completes and is automatically removed. In case of a failure, the timer is rescheduled
	 with an exponentially increasing delay, starting at 3 seconds with a max delay of 30 seconds.
	 This process repeats until the call succeeds.
	
	 
	
	Each timer has a `name` and if a new timer with same `name` is registered the
	 previous is cancelled.
	
	
	
	Parameters:
	`name` \- unique name for the timer
	`delay` \- delay, starting from now, in which the timer should be triggered
	`deferredCall` \- a call to component that will be executed when the timer is triggered
	Returns:
	A completion stage that is completed successfully or failed, once the timer has been
	 scheduled
	- ### createSingleTimerAsync
	
	
	\<I,
	O\> [CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<akka.Done\> createSingleTimerAsync([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name,
	 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay,
	 int maxRetries,
	 [DeferredCall](../DeferredCall.html "interface in akka.javasdk")\<I,O\> deferredCall)
	Schedule a single timer. Timers allow for scheduling calls in the future. For example, to
	 verify that some process have been completed or not.
	
	 Timers are persisted and are guaranteed to run at least once.
	
	 
	
	When a timer is triggered, the scheduled call is executed. If successfully executed, the
	 timer completes and is automatically removed. In case of a failure, the timer is rescheduled
	 with a delay of 3 seconds. This process repeats until the call succeeds or the maxRetries limit
	 is reached.
	
	 
	
	Each timer has a `name` and if a new timer with same `name` is registered the
	 previous is cancelled.
	
	
	
	Parameters:
	`name` \- unique name for the timer
	`delay` \- delay, starting from now, in which the timer should be triggered
	`maxRetries` \- Retry up to this many times before giving up
	`deferredCall` \- a call to component that will be executed when the timer is triggered
	Returns:
	A completion stage that is completed successfully or failed, once the timer has been
	 scheduled
	- ### deleteAsync
	
	
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<akka.Done\> deleteAsync([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Delete an existing timer. This completes successfully if no timer is registered for the passed
	 name.
	- ### startSingleTimer
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")([since](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#since() "class or interface in java.lang")\="3\.3\.0",
	 [forRemoval](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#forRemoval() "class or interface in java.lang")\=true)
	\<I,
	O\> [CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<akka.Done\> startSingleTimer([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name,
	 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay,
	 [DeferredCall](../DeferredCall.html "interface in akka.javasdk")\<I,O\> deferredCall)
	Deprecated, for removal: This API element is subject to removal in a future version.
	Use [`createSingleTimerAsync(String, Duration, DeferredCall)`](#createSingleTimerAsync(java.lang.String,java.time.Duration,akka.javasdk.DeferredCall))
	 instead.
	- ### startSingleTimer
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")([since](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#since() "class or interface in java.lang")\="3\.3\.0",
	 [forRemoval](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#forRemoval() "class or interface in java.lang")\=true)
	\<I,
	O\> [CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<akka.Done\> startSingleTimer([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name,
	 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay,
	 int maxRetries,
	 [DeferredCall](../DeferredCall.html "interface in akka.javasdk")\<I,O\> deferredCall)
	Deprecated, for removal: This API element is subject to removal in a future version.
	Use [`createSingleTimerAsync(String, Duration, int, DeferredCall)`](#createSingleTimerAsync(java.lang.String,java.time.Duration,int,akka.javasdk.DeferredCall)) instead.
	- ### cancel
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")([since](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#since() "class or interface in java.lang")\="3\.3\.0",
	 [forRemoval](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#forRemoval() "class or interface in java.lang")\=true)
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<akka.Done\> cancel([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Deprecated, for removal: This API element is subject to removal in a future version.
	User [`deleteAsync(String)`](#deleteAsync(java.lang.String)) instead.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DeferredCall.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timer/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timer/TimerScheduler.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timer/TimerScheduler.html)*