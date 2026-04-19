---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:37:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html
title: akka.actor.typed.internal
---

# akka.actor.typed.internal

## Content

# Package akka.actor.typed.internal

- Interface Summary 
| Interface | Description |
| [ActorContextImpl](ActorContextImpl.html "interface in akka.actor.typed.internal")\<T\> | INTERNAL API |
| --- | --- |
| [ActorRefImpl](ActorRefImpl.html "interface in akka.actor.typed.internal")\<T\> | Every ActorRef is also an ActorRefImpl, but these two methods shall be  completely hidden from client code. |
| [ExtensionsImpl](ExtensionsImpl.html "interface in akka.actor.typed.internal") | INTERNAL API |
| [InternalMessage](InternalMessage.html "interface in akka.actor.typed.internal") | A marker trait for internal messages. |
| [InternalRecipientRef](InternalRecipientRef.html "interface in akka.actor.typed.internal")\<T\> | INTERNAL API |
| [SystemMessage](SystemMessage.html "interface in akka.actor.typed.internal") | System messages are handled specially: they form their own queue within  each actor\&rsquo;s mailbox. |
| [TimerSchedulerCrossDslSupport](TimerSchedulerCrossDslSupport.html "interface in akka.actor.typed.internal")\<T\> |  |
- Class Summary 
| Class | Description |
| [AbstractSupervisor](AbstractSupervisor.html "class in akka.actor.typed.internal")\<I,​Thr extends java.lang.Throwable\> | INTERNAL API |
| --- | --- |
| [ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") |  |
| [ActorContextImpl.LoggingContext$](ActorContextImpl.LoggingContext$.html "class in akka.actor.typed.internal") |  |
| [ActorContextImpl$](ActorContextImpl$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [ActorFlightRecorder](ActorFlightRecorder.html "class in akka.actor.typed.internal") | INTERNAL API |
| [ActorFlightRecorder$](ActorFlightRecorder$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [ActorMdc](ActorMdc.html "class in akka.actor.typed.internal") | INTERNAL API |
| [ActorMdc$](ActorMdc$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [AdaptMessage$](AdaptMessage$.html "class in akka.actor.typed.internal") |  |
| [AdaptWithRegisteredMessageAdapter$](AdaptWithRegisteredMessageAdapter$.html "class in akka.actor.typed.internal") |  |
| [BehaviorImpl](BehaviorImpl.html "class in akka.actor.typed.internal") | INTERNAL API |
| [BehaviorImpl.ContextAs](BehaviorImpl.ContextAs.html "class in akka.actor.typed.internal")\<T\> |  |
| [BehaviorImpl.ContextAs$](BehaviorImpl.ContextAs$.html "class in akka.actor.typed.internal") |  |
| [BehaviorImpl.DeferredBehavior](BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")\<T\> |  |
| [BehaviorImpl.DeferredBehavior$](BehaviorImpl.DeferredBehavior$.html "class in akka.actor.typed.internal") |  |
| [BehaviorImpl.FailedBehavior](BehaviorImpl.FailedBehavior.html "class in akka.actor.typed.internal") |  |
| [BehaviorImpl.ReceiveBehavior](BehaviorImpl.ReceiveBehavior.html "class in akka.actor.typed.internal")\<T\> |  |
| [BehaviorImpl.ReceiveBehavior$](BehaviorImpl.ReceiveBehavior$.html "class in akka.actor.typed.internal") |  |
| [BehaviorImpl.ReceiveMessageBehavior](BehaviorImpl.ReceiveMessageBehavior.html "class in akka.actor.typed.internal")\<T\> | Similar to [`BehaviorImpl.ReceiveBehavior`](BehaviorImpl.ReceiveBehavior.html "class in akka.actor.typed.internal") however `onMessage` does not accept context. |
| [BehaviorImpl.ReceiveMessageBehavior$](BehaviorImpl.ReceiveMessageBehavior$.html "class in akka.actor.typed.internal") |  |
| [BehaviorImpl.SameBehavior$](BehaviorImpl.SameBehavior$.html "class in akka.actor.typed.internal") |  |
| [BehaviorImpl.UnhandledBehavior$](BehaviorImpl.UnhandledBehavior$.html "class in akka.actor.typed.internal") |  |
| [BehaviorImpl$](BehaviorImpl$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [BehaviorTags](BehaviorTags.html "class in akka.actor.typed.internal") | INTERNAL API |
| [BehaviorTags$](BehaviorTags$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [CachedProps$](CachedProps$.html "class in akka.actor.typed.internal") |  |
| [Create$](Create$.html "class in akka.actor.typed.internal") |  |
| [DeathWatchNotification$](DeathWatchNotification$.html "class in akka.actor.typed.internal") |  |
| [EarliestFirstSystemMessageList$](EarliestFirstSystemMessageList$.html "class in akka.actor.typed.internal") |  |
| [EventStreamExtension$](EventStreamExtension$.html "class in akka.actor.typed.internal") |  |
| [InterceptorImpl$](InterceptorImpl$.html "class in akka.actor.typed.internal") | Provides the impl of any behavior that could nest another behavior |
| [LatestFirstSystemMessageList$](LatestFirstSystemMessageList$.html "class in akka.actor.typed.internal") |  |
| [LoggerClass](LoggerClass.html "class in akka.actor.typed.internal") | INTERNAL API |
| [LoggerClass$](LoggerClass$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [LogMessagesInterceptor$](LogMessagesInterceptor$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [MonitorInterceptor$](MonitorInterceptor$.html "class in akka.actor.typed.internal") |  |
| [NoMessage](NoMessage.html "class in akka.actor.typed.internal") | INTERNAL API |
| [NoMessage$](NoMessage$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [PoisonPill$](PoisonPill$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [PropsImpl](PropsImpl.html "class in akka.actor.typed.internal") | INTERNAL API |
| [PropsImpl.ActorTagsImpl](PropsImpl.ActorTagsImpl.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.ActorTagsImpl$](PropsImpl.ActorTagsImpl$.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.BoundedMailboxSelector](PropsImpl.BoundedMailboxSelector.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.BoundedMailboxSelector$](PropsImpl.BoundedMailboxSelector$.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.DefaultMailboxSelector](PropsImpl.DefaultMailboxSelector.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.DefaultMailboxSelector$](PropsImpl.DefaultMailboxSelector$.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.DispatcherDefault](PropsImpl.DispatcherDefault.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.DispatcherDefault$](PropsImpl.DispatcherDefault$.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.DispatcherFromConfig](PropsImpl.DispatcherFromConfig.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.DispatcherFromConfig$](PropsImpl.DispatcherFromConfig$.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.DispatcherSameAsParent](PropsImpl.DispatcherSameAsParent.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.DispatcherSameAsParent$](PropsImpl.DispatcherSameAsParent$.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.EmptyProps$](PropsImpl.EmptyProps$.html "class in akka.actor.typed.internal") | The empty configuration node, used as a terminator for the internally linked  list of each Props. |
| [PropsImpl.MailboxFromConfigSelector](PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal") |  |
| [PropsImpl.MailboxFromConfigSelector$](PropsImpl.MailboxFromConfigSelector$.html "class in akka.actor.typed.internal") |  |
| [PropsImpl$](PropsImpl$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")\<T,​Thr extends java.lang.Throwable\> |  |
| [RestartSupervisor.ResetRestartCount](RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal") |  |
| [RestartSupervisor.ResetRestartCount$](RestartSupervisor.ResetRestartCount$.html "class in akka.actor.typed.internal") |  |
| [RestartSupervisor.ScheduledRestart](RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal") |  |
| [RestartSupervisor.ScheduledRestart$](RestartSupervisor.ScheduledRestart$.html "class in akka.actor.typed.internal") |  |
| [RestartSupervisor$](RestartSupervisor$.html "class in akka.actor.typed.internal") |  |
| [ResumeSupervisor](ResumeSupervisor.html "class in akka.actor.typed.internal")\<T,​Thr extends java.lang.Throwable\> |  |
| [SimpleSupervisor](SimpleSupervisor.html "class in akka.actor.typed.internal")\<T,​Thr extends java.lang.Throwable\> | For cases where O \=\= I for BehaviorInterceptor. |
| [StashBufferImpl$](StashBufferImpl$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [StopSupervisor](StopSupervisor.html "class in akka.actor.typed.internal")\<T,​Thr extends java.lang.Throwable\> |  |
| [Supervisor](Supervisor.html "class in akka.actor.typed.internal") | INTERNAL API |
| [Supervisor$](Supervisor$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [SystemMessageList](SystemMessageList.html "class in akka.actor.typed.internal") | INTERNAL API |
| [SystemMessageList$](SystemMessageList$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [Terminate$](Terminate$.html "class in akka.actor.typed.internal") |  |
| [TimerSchedulerImpl$](TimerSchedulerImpl$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [TransformMessagesInterceptor$](TransformMessagesInterceptor$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [UnstashException$](UnstashException$.html "class in akka.actor.typed.internal") | INTERNAL API |
| [Unwatch$](Unwatch$.html "class in akka.actor.typed.internal") |  |
| [Watch$](Watch$.html "class in akka.actor.typed.internal") |  |
| [WithMdcBehaviorInterceptor$](WithMdcBehaviorInterceptor$.html "class in akka.actor.typed.internal") | INTERNAL API |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/AbstractSupervisor.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorContextImpl$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorContextImpl.LoggingContext$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorContextImpl.LoggingContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorContextImpl.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorFlightRecorder$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorFlightRecorder.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorMdc$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorMdc.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorRefImpl.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/AdaptMessage$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/AdaptWithRegisteredMessageAdapter$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.ContextAs$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.ContextAs.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.FailedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.ReceiveBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.ReceiveBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.ReceiveMessageBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.ReceiveMessageBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.SameBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.UnhandledBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorTags$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorTags.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/CachedProps$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/Create$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/DeathWatchNotification$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/EarliestFirstSystemMessageList$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/EventStreamExtension$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ExtensionsImpl.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/InterceptorImpl$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/InternalMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/InternalRecipientRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/LatestFirstSystemMessageList$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/LogMessagesInterceptor$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/LoggerClass$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/LoggerClass.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/MonitorInterceptor$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/NoMessage$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/NoMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PoisonPill$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.ActorTagsImpl$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.ActorTagsImpl.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.BoundedMailboxSelector$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.BoundedMailboxSelector.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.DefaultMailboxSelector$.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html)*