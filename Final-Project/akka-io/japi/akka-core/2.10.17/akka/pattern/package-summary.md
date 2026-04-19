---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:18:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/package-summary.html
title: akka.pattern
---

# akka.pattern

## Content

# Package akka.pattern

- Interface Summary 
| Interface | Description |
| [AskSupport](AskSupport.html "interface in akka.pattern") | This object contains implementation details of the \&ldquo;ask\&rdquo; pattern. |
| --- | --- |
| [BackoffOnFailureOptions](BackoffOnFailureOptions.html "interface in akka.pattern") |  |
| [BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern") |  |
| [BackoffReset](BackoffReset.html "interface in akka.pattern") |  |
| [CircuitBreaker.State](CircuitBreaker.State.html "interface in akka.pattern") | Internal state abstraction |
| [ExplicitAskSupport](ExplicitAskSupport.html "interface in akka.pattern") | This object contains implementation details of the \&ldquo;ask\&rdquo; pattern,  which can be combined with "replyTo" pattern. |
| [ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")\<T extends [ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")\<T\>\> | Not for user extension |
| [FutureRef](FutureRef.html "interface in akka.pattern")\<T\> | A combination of a Future and an ActorRef associated with it, which points  to an actor performing a task which will eventually resolve the Future. |
| [FutureTimeoutSupport](FutureTimeoutSupport.html "interface in akka.pattern") |  |
| [GracefulStopSupport](GracefulStopSupport.html "interface in akka.pattern") |  |
| [HandleBackoff](HandleBackoff.html "interface in akka.pattern") | INTERNAL API |
| [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") |  |
| [PipeToSupport](PipeToSupport.html "interface in akka.pattern") |  |
| [PromiseRef](PromiseRef.html "interface in akka.pattern")\<T\> | A combination of a Promise and an ActorRef associated with it, which points  to an actor performing a task which will eventually resolve the Promise. |
| [RetrySupport](RetrySupport.html "interface in akka.pattern") | This trait provides the retry utility function |
- Class Summary 
| Class | Description |
| [AskableActorRef](AskableActorRef.html "class in akka.pattern") |  |
| --- | --- |
| [AskableActorRef$](AskableActorRef$.html "class in akka.pattern") |  |
| [AskableActorSelection](AskableActorSelection.html "class in akka.pattern") |  |
| [AskableActorSelection$](AskableActorSelection$.html "class in akka.pattern") |  |
| [AskPromiseRef$](AskPromiseRef$.html "class in akka.pattern") |  |
| [AutoReset$](AutoReset$.html "class in akka.pattern") |  |
| [BackoffOnFailureOptionsImpl](BackoffOnFailureOptionsImpl.html "class in akka.pattern")\<T\> |  |
| [BackoffOnFailureOptionsImpl$](BackoffOnFailureOptionsImpl$.html "class in akka.pattern") |  |
| [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")\<T\> |  |
| [BackoffOnStopOptionsImpl$](BackoffOnStopOptionsImpl$.html "class in akka.pattern") |  |
| [BackoffOpts](BackoffOpts.html "class in akka.pattern") | Backoff options allow to specify a number of properties for backoff supervisors. |
| [BackoffOpts$](BackoffOpts$.html "class in akka.pattern") | Backoff options allow to specify a number of properties for backoff supervisors. |
| [BackoffSupervisor](BackoffSupervisor.html "class in akka.pattern") |  |
| [BackoffSupervisor.CurrentChild](BackoffSupervisor.CurrentChild.html "class in akka.pattern") | Send this message to the `BackoffSupervisor` and it will reply with  [`BackoffSupervisor.CurrentChild`](BackoffSupervisor.CurrentChild.html "class in akka.pattern") containing the `ActorRef` of the current child, if any. |
| [BackoffSupervisor.CurrentChild$](BackoffSupervisor.CurrentChild$.html "class in akka.pattern") |  |
| [BackoffSupervisor.GetCurrentChild$](BackoffSupervisor.GetCurrentChild$.html "class in akka.pattern") | Send this message to the `BackoffSupervisor` and it will reply with  [`BackoffSupervisor.CurrentChild`](BackoffSupervisor.CurrentChild.html "class in akka.pattern") containing the `ActorRef` of the current child, if any. |
| [BackoffSupervisor.GetRestartCount$](BackoffSupervisor.GetRestartCount$.html "class in akka.pattern") | Send this message to the `BackoffSupervisor` and it will reply with  [`BackoffSupervisor.RestartCount`](BackoffSupervisor.RestartCount.html "class in akka.pattern") containing the current restart count. |
| [BackoffSupervisor.Reset$](BackoffSupervisor.Reset$.html "class in akka.pattern") | Send this message to the `BackoffSupervisor` and it will reset the back\-off. |
| [BackoffSupervisor.ResetRestartCount$](BackoffSupervisor.ResetRestartCount$.html "class in akka.pattern") |  |
| [BackoffSupervisor.RestartCount](BackoffSupervisor.RestartCount.html "class in akka.pattern") |  |
| [BackoffSupervisor.RestartCount$](BackoffSupervisor.RestartCount$.html "class in akka.pattern") |  |
| [BackoffSupervisor.StartChild$](BackoffSupervisor.StartChild$.html "class in akka.pattern") | INTERNAL API |
| [BackoffSupervisor$](BackoffSupervisor$.html "class in akka.pattern") |  |
| [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") | Provides circuit breaker functionality for stability when working with "dangerous" operations, e.g. |
| [CircuitBreaker$](CircuitBreaker$.html "class in akka.pattern") | Companion object providing factory methods for Circuit Breaker which runs callbacks in caller's thread |
| [CircuitBreakerOpenException$](CircuitBreakerOpenException$.html "class in akka.pattern") |  |
| [CircuitBreakersRegistry](CircuitBreakersRegistry.html "class in akka.pattern") | A CircuitBreakersPanel is a central point collecting all circuit breakers in Akka. |
| [CircuitBreakersRegistry$](CircuitBreakersRegistry$.html "class in akka.pattern") | Companion object providing factory methods for Circuit Breaker which runs callbacks in caller's thread |
| [ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") |  |
| [ExplicitlyAskableActorRef$](ExplicitlyAskableActorRef$.html "class in akka.pattern") |  |
| [ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") |  |
| [ExplicitlyAskableActorSelection$](ExplicitlyAskableActorSelection$.html "class in akka.pattern") |  |
| [ForwardDeathLetters](ForwardDeathLetters.html "class in akka.pattern") |  |
| [ForwardDeathLetters$](ForwardDeathLetters$.html "class in akka.pattern") |  |
| [ForwardTo$](ForwardTo$.html "class in akka.pattern") |  |
| [FutureRef$](FutureRef$.html "class in akka.pattern") |  |
| [ManualReset](ManualReset.html "class in akka.pattern") |  |
| [ManualReset$](ManualReset$.html "class in akka.pattern") |  |
| [Patterns](Patterns.html "class in akka.pattern") | Java API: for Akka patterns such as `ask`, `pipe` and others which work with `CompletionStage`. |
| [Patterns$](Patterns$.html "class in akka.pattern") | Java API: for Akka patterns such as `ask`, `pipe` and others which work with `CompletionStage`. |
| [PipeToSupport.PipeableCompletionStage](PipeToSupport.PipeableCompletionStage.html "class in akka.pattern")\<T\> |  |
| [PipeToSupport.PipeableFuture](PipeToSupport.PipeableFuture.html "class in akka.pattern")\<T\> |  |
| [PromiseActorRef$](PromiseActorRef$.html "class in akka.pattern") | INTERNAL API |
| [PromiseRef$](PromiseRef$.html "class in akka.pattern") |  |
| [ReplyWith$](ReplyWith$.html "class in akka.pattern") |  |
| [RetrySettings](RetrySettings.html "class in akka.pattern") | Settings for retrying operations. |
| [RetrySettings$](RetrySettings$.html "class in akka.pattern") |  |
| [RetrySupport$](RetrySupport$.html "class in akka.pattern") |  |
| [StatusReply](StatusReply.html "class in akka.pattern")\<T\> | Generic top\-level message type for replies that signal failure or success. |
| [StatusReply.Error$](StatusReply.Error$.html "class in akka.pattern") | Scala API for creating and pattern matching an error response |
| [StatusReply.ErrorMessage$](StatusReply.ErrorMessage$.html "class in akka.pattern") |  |
| [StatusReply.Success$](StatusReply.Success$.html "class in akka.pattern") | Scala API for creation and pattern matching a successful response. |
| [StatusReply$](StatusReply$.html "class in akka.pattern") |  |
- Exception Summary 
| Exception | Description |
| [AskTimeoutException](AskTimeoutException.html "class in akka.pattern") | This is what is used to complete a Future that is returned from an ask/? call,  when it times out. |
| --- | --- |
| [CircuitBreakerOpenException](CircuitBreakerOpenException.html "class in akka.pattern") | Exception thrown when Circuit Breaker is open. |
| [StatusReply.ErrorMessage](StatusReply.ErrorMessage.html "class in akka.pattern") | Carrier exception used for textual error descriptions. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/AskPromiseRef$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/AskSupport.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/AskableActorRef$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/AskableActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/AskableActorSelection$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/AskableActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/AutoReset$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOnFailureOptionsImpl$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOnFailureOptionsImpl.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOnStopOptionsImpl$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOnStopOptionsImpl.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOpts.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffReset.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffSupervisor$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffSupervisor.CurrentChild$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffSupervisor.CurrentChild.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffSupervisor.GetCurrentChild$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffSupervisor.GetRestartCount$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffSupervisor.Reset$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffSupervisor.ResetRestartCount$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffSupervisor.RestartCount$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffSupervisor.RestartCount.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffSupervisor.StartChild$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffSupervisor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/CircuitBreaker$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/CircuitBreaker.State.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/CircuitBreakerOpenException$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/CircuitBreakersRegistry$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/CircuitBreakersRegistry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/ExplicitAskSupport.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/ExplicitlyAskableActorRef$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/ExplicitlyAskableActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/ExplicitlyAskableActorSelection$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/ExplicitlyAskableActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/ExtendedBackoffOptions.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/ForwardDeathLetters$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/ForwardDeathLetters.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/ForwardTo$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/FutureRef$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/FutureRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/FutureTimeoutSupport.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/GracefulStopSupport.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/HandleBackoff.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/HandlingWhileStopped.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/package-summary.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/package-summary.html)*