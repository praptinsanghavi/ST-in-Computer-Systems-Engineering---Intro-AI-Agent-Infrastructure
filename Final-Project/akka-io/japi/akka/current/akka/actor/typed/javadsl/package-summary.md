---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:37:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/package-summary.html
title: akka.actor.typed.javadsl
---

# akka.actor.typed.javadsl

## Content

# Package akka.actor.typed.javadsl

- Interface Summary 
| Interface | Description |
| [ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")\<T\> | An Actor is given by the combination of a `Behavior` and a context in  which this behavior is executed. |
| --- | --- |
| [StashBuffer](StashBuffer.html "interface in akka.actor.typed.javadsl")\<T\> | A non thread safe mutable message buffer that can be used to buffer messages inside actors  and then unstash them. |
| [TimerScheduler](TimerScheduler.html "interface in akka.actor.typed.javadsl")\<T\> | Support for scheduled `self` messages in an actor. |
- Class Summary 
| Class | Description |
| [AbstractBehavior](AbstractBehavior.html "class in akka.actor.typed.javadsl")\<T\> | An actor `Behavior` can be implemented by extending this class and implement the  abstract method [`AbstractBehavior.createReceive()`](AbstractBehavior.html#createReceive()). |
| --- | --- |
| [AbstractOnMessageBehavior](AbstractOnMessageBehavior.html "class in akka.actor.typed.javadsl")\<T\> | An actor `Behavior` can be implemented by extending this class and implementing the abstract  method [`AbstractOnMessageBehavior.onMessage(T)`](AbstractOnMessageBehavior.html#onMessage(T)). |
| [Adapter](Adapter.html "class in akka.actor.typed.javadsl") | Adapters between typed and classic actors and actor systems. |
| [Adapter$](Adapter$.html "class in akka.actor.typed.javadsl") | Adapters between typed and classic actors and actor systems. |
| [AskPattern](AskPattern.html "class in akka.actor.typed.javadsl") | The ask\-pattern implements the initiator side of a request–reply protocol. |
| [AskPattern$](AskPattern$.html "class in akka.actor.typed.javadsl") | The ask\-pattern implements the initiator side of a request–reply protocol. |
| [BehaviorBuilder](BehaviorBuilder.html "class in akka.actor.typed.javadsl")\<T\> | Immutable builder used for creating a `Behavior` by 'chaining' message and signal handlers. |
| [BehaviorBuilder.Case$](BehaviorBuilder.Case$.html "class in akka.actor.typed.javadsl") |  |
| [BehaviorBuilder$](BehaviorBuilder$.html "class in akka.actor.typed.javadsl") |  |
| [Behaviors](Behaviors.html "class in akka.actor.typed.javadsl") | Factories for [`Behavior`](../Behavior.html "class in akka.actor.typed"). |
| [Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.javadsl")\<T\> |  |
| [Behaviors$](Behaviors$.html "class in akka.actor.typed.javadsl") | Factories for [`Behavior`](../Behavior.html "class in akka.actor.typed"). |
| [BuiltBehavior](BuiltBehavior.html "class in akka.actor.typed.javadsl")\<T\> | The concrete behavior |
| [BuiltReceive](BuiltReceive.html "class in akka.actor.typed.javadsl")\<T\> | Receive type for [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.javadsl") |
| [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")\<T\> | Provides builder style configuration options for group routers |
| [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")\<T\> | Provides builder style configuration options for pool routers |
| [Receive](Receive.html "class in akka.actor.typed.javadsl")\<T\> | A specialized "receive" behavior that is implemented using message matching builders,  such as [`ReceiveBuilder`](ReceiveBuilder.html "class in akka.actor.typed.javadsl"), from [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.javadsl"). |
| [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")\<T\> | Mutable builder used when implementing [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.javadsl"). |
| [ReceiveBuilder.Case$](ReceiveBuilder.Case$.html "class in akka.actor.typed.javadsl") |  |
| [ReceiveBuilder$](ReceiveBuilder$.html "class in akka.actor.typed.javadsl") |  |
| [Routers](Routers.html "class in akka.actor.typed.javadsl") |  |
| [Routers$](Routers$.html "class in akka.actor.typed.javadsl") |  |
- Exception Summary 
| Exception | Description |
| [StashOverflowException](StashOverflowException.html "class in akka.actor.typed.javadsl") | Is thrown when the size of the stash exceeds the capacity of the stash buffer. |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/Adapter$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/Adapter.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/AskPattern$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/AskPattern.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BehaviorBuilder$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BehaviorBuilder.Case$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BehaviorBuilder.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/Behaviors$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/Behaviors.Supervise.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BuiltBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BuiltReceive.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/GroupRouter.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/PoolRouter.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ReceiveBuilder$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ReceiveBuilder.Case$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ReceiveBuilder.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/Routers$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/Routers.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/StashBuffer.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/StashOverflowException.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/TimerScheduler.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/package-summary.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/package-summary.html)*