---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:52:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/Effects.html
title: Effects
---

# Effects

## Content

Package [akka.actor.testkit.typed.javadsl](package-summary.html)
## Class Effects

- java.lang.Object
- - akka.actor.testkit.typed.javadsl.Effects

- ---

```
public class Effects
extends java.lang.Object
```

Factories for behavior effects for [`BehaviorTestKit`](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl"), each effect has a suitable equals and can be used to compare
 actual effects to expected ones.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Effects](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <Req,​Res,​T>[Effect.AskInitiated](../Effect.AskInitiated.html "class in akka.actor.testkit.typed")<Req,​Res,​T>` | `[askInitiated](#askInitiated(akka.actor.typed.RecipientRef,java.time.Duration,java.lang.Class,java.lang.Class))​([RecipientRef](../../../typed/RecipientRef.html "interface in akka.actor.typed")<Req> target,  java.time.Duration responseTimeout,  java.lang.Class<Res> responseClass,  java.lang.Class<T> messageClass)` | The behavior initiated an ask via its context. |
	| `static [Effect.NoEffects](../Effect.NoEffects.html "class in akka.actor.testkit.typed")` | `[noEffects](#noEffects())()` | Used to represent an empty list of effects \- in other words, the behavior didn't do anything observable |
	| `static <T> [Effect.ReceiveTimeoutSet](../Effect.ReceiveTimeoutSet.html "class in akka.actor.testkit.typed")<T>` | `[receiveTimeoutSet](#receiveTimeoutSet(java.time.Duration,T))​(java.time.Duration d,  T message)` | The behavior set a new receive timeout, with `message` as timeout notification |
	| `static <U> [Effect.Scheduled](../Effect.Scheduled.html "class in akka.actor.testkit.typed")<U>` | `[scheduled](#scheduled(java.time.Duration,akka.actor.typed.ActorRef,U))​(java.time.Duration delay,  [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> target,  U message)` | The behavior used `context.schedule` to schedule `message` to be sent to `target` after `delay`  FIXME what about events scheduled through the scheduler? |
	| `static <T> [Effect.Spawned](../Effect.Spawned.html "class in akka.actor.testkit.typed")<T>` | `[spawned](#spawned(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String childName)` | The behavior spawned a named child with the given behavior with no specific props |
	| `static <T> [Effect.Spawned](../Effect.Spawned.html "class in akka.actor.testkit.typed")<T>` | `[spawned](#spawned(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.ActorRef))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String childName,  [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref)` | The behavior spawned a named child with the given behavior with no specific props |
	| `static <T> [Effect.Spawned](../Effect.Spawned.html "class in akka.actor.testkit.typed")<T>` | `[spawned](#spawned(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String childName,  [Props](../../../typed/Props.html "class in akka.actor.typed") props)` | The behavior spawned a named child with the given behavior and specific props |
	| `static <T> [Effect.Spawned](../Effect.Spawned.html "class in akka.actor.testkit.typed")<T>` | `[spawned](#spawned(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props,akka.actor.typed.ActorRef))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String childName,  [Props](../../../typed/Props.html "class in akka.actor.typed") props,  [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref)` | The behavior spawned a named child with the given behavior and specific props |
	| `static <T> [Effect.SpawnedAnonymous](../Effect.SpawnedAnonymous.html "class in akka.actor.testkit.typed")<T>` | `[spawnedAnonymous](#spawnedAnonymous(akka.actor.typed.Behavior))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior)` | The behavior spawned an anonymous child with the given behavior with no specific props |
	| `static <T> [Effect.SpawnedAnonymous](../Effect.SpawnedAnonymous.html "class in akka.actor.testkit.typed")<T>` | `[spawnedAnonymous](#spawnedAnonymous(akka.actor.typed.Behavior,akka.actor.typed.ActorRef))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref)` | The behavior spawned an anonymous child with the given behavior with no specific props |
	| `static <T> [Effect.SpawnedAnonymous](../Effect.SpawnedAnonymous.html "class in akka.actor.testkit.typed")<T>` | `[spawnedAnonymous](#spawnedAnonymous(akka.actor.typed.Behavior,akka.actor.typed.Props))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  [Props](../../../typed/Props.html "class in akka.actor.typed") props)` | The behavior spawned an anonymous child with the given behavior with specific props |
	| `static <T> [Effect.SpawnedAnonymous](../Effect.SpawnedAnonymous.html "class in akka.actor.testkit.typed")<T>` | `[spawnedAnonymous](#spawnedAnonymous(akka.actor.typed.Behavior,akka.actor.typed.Props,akka.actor.typed.ActorRef))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  [Props](../../../typed/Props.html "class in akka.actor.typed") props,  [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref)` | The behavior spawned an anonymous child with the given behavior with specific props |
	| `static [Effect.Stopped](../Effect.Stopped.html "class in akka.actor.testkit.typed")` | `[stopped](#stopped(java.lang.String))​(java.lang.String childName)` | The behavior stopped `childName` |
	| `static <U> [Effect.TimerScheduled](../Effect.TimerScheduled.html "class in akka.actor.testkit.typed")<U>` | `[timerScheduled](#timerScheduled(java.lang.Object,U,java.time.Duration,akka.actor.testkit.typed.Effect.TimerScheduled.TimerMode,boolean,akka.japi.function.Effect))​(java.lang.Object key,  U msg,  java.time.Duration delay,  akka.actor.testkit.typed.Effect.TimerScheduled.TimerMode mode,  boolean overriding,  [Effect](../../../../japi/function/Effect.html "interface in akka.japi.function") send)` |  |
	| `static <T> [Effect.Unwatched](../Effect.Unwatched.html "class in akka.actor.testkit.typed")<T>` | `[unwatched](#unwatched(akka.actor.typed.ActorRef))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> other)` | The behavior stopped watching `other`, through `context.unwatch(other)` |
	| `static <T> [Effect.Watched](../Effect.Watched.html "class in akka.actor.testkit.typed")<T>` | `[watched](#watched(akka.actor.typed.ActorRef))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> other)` | The behavior started watching `other`, through `context.watch(other)` |
	| `static <U,​T>[Effect.WatchedWith](../Effect.WatchedWith.html "class in akka.actor.testkit.typed")<U,​T>` | `[watchedWith](#watchedWith(akka.actor.typed.ActorRef,T))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> other,  T message)` | The behavior started watching `other`, through `context.watchWith(other, message)` |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Effects
		
		
		
		```
		public Effects()
		```

	- ### Method Detail
	
	
	
		- #### askInitiated
		
		
		
		```
		public static <Req,​Res,​T> [Effect.AskInitiated](../Effect.AskInitiated.html "class in akka.actor.testkit.typed")<Req,​Res,​T> askInitiated​([RecipientRef](../../../typed/RecipientRef.html "interface in akka.actor.typed")<Req> target,
		                                                                                              java.time.Duration responseTimeout,
		                                                                                              java.lang.Class<Res> responseClass,
		                                                                                              java.lang.Class<T> messageClass)
		```
		
		The behavior initiated an ask via its context. Note that the effect returned from this method should only
		 be used to compare with an actual effect.
		- #### spawned
		
		
		
		```
		public static <T> [Effect.Spawned](../Effect.Spawned.html "class in akka.actor.testkit.typed")<T> spawned​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                                            java.lang.String childName)
		```
		
		The behavior spawned a named child with the given behavior with no specific props
		- #### spawned
		
		
		
		```
		public static <T> [Effect.Spawned](../Effect.Spawned.html "class in akka.actor.testkit.typed")<T> spawned​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                                            java.lang.String childName,
		                                            [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref)
		```
		
		The behavior spawned a named child with the given behavior with no specific props
		- #### spawned
		
		
		
		```
		public static <T> [Effect.Spawned](../Effect.Spawned.html "class in akka.actor.testkit.typed")<T> spawned​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                                            java.lang.String childName,
		                                            [Props](../../../typed/Props.html "class in akka.actor.typed") props)
		```
		
		The behavior spawned a named child with the given behavior and specific props
		- #### spawned
		
		
		
		```
		public static <T> [Effect.Spawned](../Effect.Spawned.html "class in akka.actor.testkit.typed")<T> spawned​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                                            java.lang.String childName,
		                                            [Props](../../../typed/Props.html "class in akka.actor.typed") props,
		                                            [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref)
		```
		
		The behavior spawned a named child with the given behavior and specific props
		- #### spawnedAnonymous
		
		
		
		```
		public static <T> [Effect.SpawnedAnonymous](../Effect.SpawnedAnonymous.html "class in akka.actor.testkit.typed")<T> spawnedAnonymous​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		The behavior spawned an anonymous child with the given behavior with no specific props
		- #### spawnedAnonymous
		
		
		
		```
		public static <T> [Effect.SpawnedAnonymous](../Effect.SpawnedAnonymous.html "class in akka.actor.testkit.typed")<T> spawnedAnonymous​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                                                              [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref)
		```
		
		The behavior spawned an anonymous child with the given behavior with no specific props
		- #### spawnedAnonymous
		
		
		
		```
		public static <T> [Effect.SpawnedAnonymous](../Effect.SpawnedAnonymous.html "class in akka.actor.testkit.typed")<T> spawnedAnonymous​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                                                              [Props](../../../typed/Props.html "class in akka.actor.typed") props)
		```
		
		The behavior spawned an anonymous child with the given behavior with specific props
		- #### spawnedAnonymous
		
		
		
		```
		public static <T> [Effect.SpawnedAnonymous](../Effect.SpawnedAnonymous.html "class in akka.actor.testkit.typed")<T> spawnedAnonymous​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                                                              [Props](../../../typed/Props.html "class in akka.actor.typed") props,
		                                                              [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref)
		```
		
		The behavior spawned an anonymous child with the given behavior with specific props
		- #### stopped
		
		
		
		```
		public static [Effect.Stopped](../Effect.Stopped.html "class in akka.actor.testkit.typed") stopped​(java.lang.String childName)
		```
		
		The behavior stopped `childName`
		- #### watched
		
		
		
		```
		public static <T> [Effect.Watched](../Effect.Watched.html "class in akka.actor.testkit.typed")<T> watched​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> other)
		```
		
		The behavior started watching `other`, through `context.watch(other)`
		- #### watchedWith
		
		
		
		```
		public static <U,​T> [Effect.WatchedWith](../Effect.WatchedWith.html "class in akka.actor.testkit.typed")<U,​T> watchedWith​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> other,
		                                                                    T message)
		```
		
		The behavior started watching `other`, through `context.watchWith(other, message)`
		- #### unwatched
		
		
		
		```
		public static <T> [Effect.Unwatched](../Effect.Unwatched.html "class in akka.actor.testkit.typed")<T> unwatched​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> other)
		```
		
		The behavior stopped watching `other`, through `context.unwatch(other)`
		- #### receiveTimeoutSet
		
		
		
		```
		public static <T> [Effect.ReceiveTimeoutSet](../Effect.ReceiveTimeoutSet.html "class in akka.actor.testkit.typed")<T> receiveTimeoutSet​(java.time.Duration d,
		                                                                T message)
		```
		
		The behavior set a new receive timeout, with `message` as timeout notification
		- #### scheduled
		
		
		
		```
		public static <U> [Effect.Scheduled](../Effect.Scheduled.html "class in akka.actor.testkit.typed")<U> scheduled​(java.time.Duration delay,
		                                                [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> target,
		                                                U message)
		```
		
		The behavior used `context.schedule` to schedule `message` to be sent to `target` after `delay`
		 FIXME what about events scheduled through the scheduler?
		- #### timerScheduled
		
		
		
		```
		public static <U> [Effect.TimerScheduled](../Effect.TimerScheduled.html "class in akka.actor.testkit.typed")<U> timerScheduled​(java.lang.Object key,
		                                                          U msg,
		                                                          java.time.Duration delay,
		                                                          akka.actor.testkit.typed.Effect.TimerScheduled.TimerMode mode,
		                                                          boolean overriding,
		                                                          [Effect](../../../../japi/function/Effect.html "interface in akka.japi.function") send)
		```
		- #### noEffects
		
		
		
		```
		public static [Effect.NoEffects](../Effect.NoEffects.html "class in akka.actor.testkit.typed") noEffects()
		```
		
		Used to represent an empty list of effects \- in other words, the behavior didn't do anything observable

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.AskInitiated.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.NoEffects.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.ReceiveTimeoutSet.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.Scheduled.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.Spawned.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.SpawnedAnonymous.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.Stopped.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.TimerScheduled.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.Unwatched.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.Watched.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.WatchedWith.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Effect.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/Effects.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/Effects.html)*