---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/package-summary.html
title: akka.actor.testkit.typed
---

# akka.actor.testkit.typed

## Content

# Package akka.actor.testkit.typed

- Interface Summary 
| Interface | Description |
| [Effect.TimerScheduled$.TimerMode](Effect.TimerScheduled$.TimerMode.html "interface in akka.actor.testkit.typed") |  |
| --- | --- |
| [FishingOutcome](FishingOutcome.html "interface in akka.actor.testkit.typed") | Not for user extension. |
| [FishingOutcome.ContinueOutcome](FishingOutcome.ContinueOutcome.html "interface in akka.actor.testkit.typed") |  |
- Class Summary 
| Class | Description |
| [CapturedLogEvent](CapturedLogEvent.html "class in akka.actor.testkit.typed") | Representation of a Log Event issued by a [`Behavior`](../../typed/Behavior.html "class in akka.actor.typed")  when testing with [`BehaviorTestKit`](scaladsl/BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")  or [`BehaviorTestKit`](javadsl/BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl"). |
| --- | --- |
| [CapturedLogEvent$](CapturedLogEvent$.html "class in akka.actor.testkit.typed") |  |
| [Effect](Effect.html "class in akka.actor.testkit.typed") | All tracked effects for the [`BehaviorTestKit`](scaladsl/BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl") and  [`BehaviorTestKit`](javadsl/BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl") must extend this type. |
| [Effect.AskInitiated](Effect.AskInitiated.html "class in akka.actor.testkit.typed")\<Req,​Res,​T\> | The behavior initiated an ask via its context. |
| [Effect.AskInitiated$](Effect.AskInitiated$.html "class in akka.actor.testkit.typed") |  |
| [Effect.MessageAdapter](Effect.MessageAdapter.html "class in akka.actor.testkit.typed")\<A,​T\> | The behavior create a message adapter for the messages of type clazz |
| [Effect.MessageAdapter$](Effect.MessageAdapter$.html "class in akka.actor.testkit.typed") |  |
| [Effect.NoEffects](Effect.NoEffects.html "class in akka.actor.testkit.typed") | Used for NoEffects expectations by type |
| [Effect.NoEffects$](Effect.NoEffects$.html "class in akka.actor.testkit.typed") | Used to represent an empty list of effects \- in other words, the behavior didn't do anything observable |
| [Effect.ReceiveTimeoutCancelled](Effect.ReceiveTimeoutCancelled.html "class in akka.actor.testkit.typed") |  |
| [Effect.ReceiveTimeoutCancelled$](Effect.ReceiveTimeoutCancelled$.html "class in akka.actor.testkit.typed") |  |
| [Effect.ReceiveTimeoutSet](Effect.ReceiveTimeoutSet.html "class in akka.actor.testkit.typed")\<T\> | The behavior set a new receive timeout, with `message` as timeout notification |
| [Effect.ReceiveTimeoutSet$](Effect.ReceiveTimeoutSet$.html "class in akka.actor.testkit.typed") |  |
| [Effect.Scheduled](Effect.Scheduled.html "class in akka.actor.testkit.typed")\<U\> | The behavior used `context.scheduleOnce` to schedule `message` to be sent to `target` after `delay`  FIXME what about events scheduled through the scheduler? |
| [Effect.Scheduled$](Effect.Scheduled$.html "class in akka.actor.testkit.typed") |  |
| [Effect.Spawned](Effect.Spawned.html "class in akka.actor.testkit.typed")\<T\> | The behavior spawned a named child with the given behavior (and optionally specific props) |
| [Effect.Spawned$](Effect.Spawned$.html "class in akka.actor.testkit.typed") |  |
| [Effect.SpawnedAdapter$](Effect.SpawnedAdapter$.html "class in akka.actor.testkit.typed") | INTERNAL API  Spawning adapters is private\[akka] |
| [Effect.SpawnedAnonymous](Effect.SpawnedAnonymous.html "class in akka.actor.testkit.typed")\<T\> | The behavior spawned an anonymous child with the given behavior (and optionally specific props) |
| [Effect.SpawnedAnonymous$](Effect.SpawnedAnonymous$.html "class in akka.actor.testkit.typed") |  |
| [Effect.SpawnedAnonymousAdapter$](Effect.SpawnedAnonymousAdapter$.html "class in akka.actor.testkit.typed") | INTERNAL API |
| [Effect.Stopped](Effect.Stopped.html "class in akka.actor.testkit.typed") | The behavior stopped `childName` |
| [Effect.Stopped$](Effect.Stopped$.html "class in akka.actor.testkit.typed") |  |
| [Effect.TimerCancelled](Effect.TimerCancelled.html "class in akka.actor.testkit.typed") |  |
| [Effect.TimerCancelled$](Effect.TimerCancelled$.html "class in akka.actor.testkit.typed") |  |
| [Effect.TimerScheduled](Effect.TimerScheduled.html "class in akka.actor.testkit.typed")\<U\> |  |
| [Effect.TimerScheduled$](Effect.TimerScheduled$.html "class in akka.actor.testkit.typed") |  |
| [Effect.TimerScheduled$.FixedDelayMode$](Effect.TimerScheduled$.FixedDelayMode$.html "class in akka.actor.testkit.typed") |  |
| [Effect.TimerScheduled$.FixedDelayModeWithInitialDelay](Effect.TimerScheduled$.FixedDelayModeWithInitialDelay.html "class in akka.actor.testkit.typed") |  |
| [Effect.TimerScheduled$.FixedDelayModeWithInitialDelay$](Effect.TimerScheduled$.FixedDelayModeWithInitialDelay$.html "class in akka.actor.testkit.typed") |  |
| [Effect.TimerScheduled$.FixedRateMode$](Effect.TimerScheduled$.FixedRateMode$.html "class in akka.actor.testkit.typed") |  |
| [Effect.TimerScheduled$.FixedRateModeWithInitialDelay](Effect.TimerScheduled$.FixedRateModeWithInitialDelay.html "class in akka.actor.testkit.typed") |  |
| [Effect.TimerScheduled$.FixedRateModeWithInitialDelay$](Effect.TimerScheduled$.FixedRateModeWithInitialDelay$.html "class in akka.actor.testkit.typed") |  |
| [Effect.TimerScheduled$.SingleMode$](Effect.TimerScheduled$.SingleMode$.html "class in akka.actor.testkit.typed") |  |
| [Effect.Unwatched](Effect.Unwatched.html "class in akka.actor.testkit.typed")\<T\> | The behavior stopped watching `other`, through `context.unwatch(other)` |
| [Effect.Unwatched$](Effect.Unwatched$.html "class in akka.actor.testkit.typed") |  |
| [Effect.Watched](Effect.Watched.html "class in akka.actor.testkit.typed")\<T\> | The behavior started watching `other`, through `context.watch(other)` |
| [Effect.Watched$](Effect.Watched$.html "class in akka.actor.testkit.typed") |  |
| [Effect.WatchedWith](Effect.WatchedWith.html "class in akka.actor.testkit.typed")\<U,​T\> | The behavior started watching `other`, through `context.watchWith(other, message)` |
| [Effect.WatchedWith$](Effect.WatchedWith$.html "class in akka.actor.testkit.typed") |  |
| [Effect$](Effect$.html "class in akka.actor.testkit.typed") |  |
| [FishingOutcome.Complete$](FishingOutcome.Complete$.html "class in akka.actor.testkit.typed") |  |
| [FishingOutcome.Continue$](FishingOutcome.Continue$.html "class in akka.actor.testkit.typed") |  |
| [FishingOutcome.ContinueAndIgnore$](FishingOutcome.ContinueAndIgnore$.html "class in akka.actor.testkit.typed") |  |
| [FishingOutcome.Fail](FishingOutcome.Fail.html "class in akka.actor.testkit.typed") |  |
| [FishingOutcome.Fail$](FishingOutcome.Fail$.html "class in akka.actor.testkit.typed") |  |
| [FishingOutcome$](FishingOutcome$.html "class in akka.actor.testkit.typed") |  |
| [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") |  |
| [LoggingEvent$](LoggingEvent$.html "class in akka.actor.testkit.typed") |  |
| [TestException$](TestException$.html "class in akka.actor.testkit.typed") |  |
| [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed") |  |
| [TestKitSettings$](TestKitSettings$.html "class in akka.actor.testkit.typed") |  |
- Exception Summary 
| Exception | Description |
| [TestException](TestException.html "class in akka.actor.testkit.typed") | A predefined exception that can be used in tests. |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.AskInitiated$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.AskInitiated.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.MessageAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.MessageAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.NoEffects$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.NoEffects.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.ReceiveTimeoutCancelled$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.ReceiveTimeoutCancelled.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.ReceiveTimeoutSet$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.ReceiveTimeoutSet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.Scheduled$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.Scheduled.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.Spawned$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.Spawned.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.SpawnedAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.SpawnedAnonymous$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.SpawnedAnonymous.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.SpawnedAnonymousAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.Stopped$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.Stopped.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.TimerCancelled$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.TimerCancelled.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.TimerScheduled$.FixedDelayMode$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.TimerScheduled$.FixedDelayModeWithInitialDelay$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.TimerScheduled$.FixedDelayModeWithInitialDelay.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.TimerScheduled$.FixedRateMode$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.TimerScheduled$.FixedRateModeWithInitialDelay$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.TimerScheduled$.FixedRateModeWithInitialDelay.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.TimerScheduled$.SingleMode$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.TimerScheduled$.TimerMode.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.TimerScheduled$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.TimerScheduled.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.Unwatched$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.Unwatched.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.Watched$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.Watched.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.WatchedWith$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.WatchedWith.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/Effect.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome.Complete$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome.Continue$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome.ContinueAndIgnore$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome.ContinueOutcome.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome.Fail$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome.Fail.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/package-summary.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/package-summary.html)*