---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:37:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/package-summary.html
title: akka.actor.typed.scaladsl
---

# akka.actor.typed.scaladsl

## Content

# Package akka.actor.typed.scaladsl

- Interface Summary 
| Interface | Description |
| [ActorContext](ActorContext.html "interface in akka.actor.typed.scaladsl")\<T\> | An Actor is given by the combination of a `Behavior` and a context in  which this behavior is executed. |
| --- | --- |
| [Behaviors.Receive](Behaviors.Receive.html "interface in akka.actor.typed.scaladsl")\<T\> | `Behavior` that exposes additional fluent DSL methods to further change the message or  signal reception behavior. |
| [GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")\<T\> | Provides builder style configuration options for group routers |
| [PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")\<T\> | Provides builder style configuration options for pool routers |
| [StashBuffer](StashBuffer.html "interface in akka.actor.typed.scaladsl")\<T\> | A non thread safe mutable message buffer that can be used to buffer messages inside actors  and then unstash them. |
| [TimerScheduler](TimerScheduler.html "interface in akka.actor.typed.scaladsl")\<T\> | Support for scheduled `self` messages in an actor. |
- Class Summary 
| Class | Description |
| [AbstractBehavior](AbstractBehavior.html "class in akka.actor.typed.scaladsl")\<T\> | An actor `Behavior` can be implemented by extending this class and implement the  abstract method [`AbstractBehavior.onMessage(T)`](AbstractBehavior.html#onMessage(T)) and optionally override  [`AbstractBehavior.onSignal()`](AbstractBehavior.html#onSignal()). |
| --- | --- |
| [AskPattern](AskPattern.html "class in akka.actor.typed.scaladsl") | The ask\-pattern implements the initiator side of a request–reply protocol. |
| [AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")\<Req\> | See [`AskPattern.Askable.<Res>ask(scala.Function1<akka.actor.typed.ActorRef<Res>,Req>,akka.util.Timeout,akka.actor.typed.Scheduler)`](AskPattern.Askable.html#ask(scala.Function1,akka.util.Timeout,akka.actor.typed.Scheduler)) |
| [AskPattern.Askable$](AskPattern.Askable$.html "class in akka.actor.typed.scaladsl") |  |
| [AskPattern$](AskPattern$.html "class in akka.actor.typed.scaladsl") | The ask\-pattern implements the initiator side of a request–reply protocol. |
| [Behaviors](Behaviors.html "class in akka.actor.typed.scaladsl") | Factories for [`Behavior`](../Behavior.html "class in akka.actor.typed"). |
| [Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.scaladsl")\<T\> |  |
| [Behaviors.Supervise$](Behaviors.Supervise$.html "class in akka.actor.typed.scaladsl") |  |
| [Behaviors$](Behaviors$.html "class in akka.actor.typed.scaladsl") | Factories for [`Behavior`](../Behavior.html "class in akka.actor.typed"). |
| [Routers](Routers.html "class in akka.actor.typed.scaladsl") |  |
| [Routers$](Routers$.html "class in akka.actor.typed.scaladsl") |  |
| [StashBuffer$](StashBuffer$.html "class in akka.actor.typed.scaladsl") | INTERNAL API |
- Exception Summary 
| Exception | Description |
| [StashOverflowException](StashOverflowException.html "class in akka.actor.typed.scaladsl") | Is thrown when the size of the stash exceeds the capacity of the stash buffer. |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/AskPattern$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/AskPattern.Askable$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/AskPattern.Askable.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/AskPattern.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/Behaviors.Receive.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/Behaviors.Supervise$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/Behaviors.Supervise.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/Behaviors.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/GroupRouter.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/PoolRouter.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/Routers$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/Routers.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/StashBuffer$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/StashOverflowException.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/TimerScheduler.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/package-summary.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/package-summary.html)*