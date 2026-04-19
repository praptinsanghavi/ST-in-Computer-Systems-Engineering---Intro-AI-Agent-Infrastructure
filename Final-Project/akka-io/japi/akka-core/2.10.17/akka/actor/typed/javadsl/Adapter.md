---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Adapter.html
title: Adapter
---

# Adapter

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class Adapter

- java.lang.Object
- - akka.actor.typed.javadsl.Adapter

- ---

```
public class Adapter
extends java.lang.Object
```

Adapters between typed and classic actors and actor systems.
 The underlying `ActorSystem` is the classic [`ActorSystem`](../../ActorSystem.html "class in akka.actor")
 which runs Akka [`Behavior`](../Behavior.html "class in akka.actor.typed") on an emulation layer. In this
 system typed and classic actors can coexist.
 
 These methods make it possible to create a child actor from classic
 parent actor, and the opposite classic child from typed parent.
 `watch` is also supported in both directions.
 

 There are also converters (`toTyped`, `toClassic`) between classic
 [`ActorRef`](../../ActorRef.html "class in akka.actor") and [`ActorRef`](../ActorRef.html "interface in akka.actor.typed"), and between classic
 [`ActorSystem`](../../ActorSystem.html "class in akka.actor") and [`ActorSystem`](../ActorSystem.html "class in akka.actor.typed").

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Adapter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ActorRef](../../ActorRef.html "class in akka.actor")` | `[actorOf](#actorOf(akka.actor.typed.javadsl.ActorContext,akka.actor.Props))​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx,  [Props](../../Props.html "class in akka.actor") props)` |  |
	| `static [ActorRef](../../ActorRef.html "class in akka.actor")` | `[actorOf](#actorOf(akka.actor.typed.javadsl.ActorContext,akka.actor.Props,java.lang.String))​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx,  [Props](../../Props.html "class in akka.actor") props,  java.lang.String name)` |  |
	| `static <T> [Props](../../Props.html "class in akka.actor")` | `[props](#props(akka.japi.Creator))​([Creator](../../../japi/Creator.html "interface in akka.japi")<[Behavior](../Behavior.html "class in akka.actor.typed")<T>> behavior)` | Wrap [`Behavior`](../Behavior.html "class in akka.actor.typed") in a classic [`Props`](../../Props.html "class in akka.actor"), i.e. |
	| `static <T> [Props](../../Props.html "class in akka.actor")` | `[props](#props(akka.japi.Creator,akka.actor.typed.Props))​([Creator](../../../japi/Creator.html "interface in akka.japi")<[Behavior](../Behavior.html "class in akka.actor.typed")<T>> behavior,  [Props](../Props.html "class in akka.actor.typed") deploy)` | Wrap [`Behavior`](../Behavior.html "class in akka.actor.typed") in a classic [`Props`](../../Props.html "class in akka.actor"), i.e. |
	| `static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.ActorContext,akka.actor.typed.Behavior,java.lang.String))​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name)` | Spawn the given behavior as a child of the user actor in a classic ActorContext. |
	| `static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.ActorContext,akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props))​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name,  [Props](../Props.html "class in akka.actor.typed") props)` | Spawn the given behavior as a child of the user actor in a classic ActorContext. |
	| `static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.ActorSystem,akka.actor.typed.Behavior,java.lang.String))​([ActorSystem](../../ActorSystem.html "class in akka.actor") sys,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name)` | Spawn the given behavior as a child of the user actor in a classic ActorSystem. |
	| `static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.ActorSystem,akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props))​([ActorSystem](../../ActorSystem.html "class in akka.actor") sys,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name,  [Props](../Props.html "class in akka.actor.typed") props)` | Spawn the given behavior as a child of the user actor in a classic ActorSystem. |
	| `static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>` | `[spawnAnonymous](#spawnAnonymous(akka.actor.ActorContext,akka.actor.typed.Behavior))​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | Spawn the given behavior as a child of the user actor in a classic ActorContext. |
	| `static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>` | `[spawnAnonymous](#spawnAnonymous(akka.actor.ActorContext,akka.actor.typed.Behavior,akka.actor.typed.Props))​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,  [Props](../Props.html "class in akka.actor.typed") props)` | Spawn the given behavior as a child of the user actor in a classic ActorContext. |
	| `static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>` | `[spawnAnonymous](#spawnAnonymous(akka.actor.ActorSystem,akka.actor.typed.Behavior))​([ActorSystem](../../ActorSystem.html "class in akka.actor") sys,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | Spawn the given behavior as a child of the user actor in a classic ActorSystem. |
	| `static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>` | `[spawnAnonymous](#spawnAnonymous(akka.actor.ActorSystem,akka.actor.typed.Behavior,akka.actor.typed.Props))​([ActorSystem](../../ActorSystem.html "class in akka.actor") sys,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,  [Props](../Props.html "class in akka.actor.typed") props)` | Spawn the given behavior as a child of the user actor in a classic ActorSystem. |
	| `static void` | `[stop](#stop(akka.actor.ActorContext,akka.actor.typed.ActorRef))​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<?> child)` |  |
	| `static void` | `[stop](#stop(akka.actor.typed.javadsl.ActorContext,akka.actor.ActorRef))​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx,  [ActorRef](../../ActorRef.html "class in akka.actor") child)` |  |
	| `static [ActorRef](../../ActorRef.html "class in akka.actor")` | `[toClassic](#toClassic(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<?> ref)` |  |
	| `static [ActorSystem](../../ActorSystem.html "class in akka.actor")` | `[toClassic](#toClassic(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> sys)` |  |
	| `static [ActorContext](../../ActorContext.html "interface in akka.actor")` | `[toClassic](#toClassic(akka.actor.typed.javadsl.ActorContext))​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx)` |  |
	| `static [Scheduler](../../Scheduler.html "interface in akka.actor")` | `[toClassic](#toClassic(akka.actor.typed.Scheduler))​([Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)` |  |
	| `static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>` | `[toTyped](#toTyped(akka.actor.ActorRef))​([ActorRef](../../ActorRef.html "class in akka.actor") ref)` |  |
	| `static [ActorSystem](../ActorSystem.html "class in akka.actor.typed")<java.lang.Void>` | `[toTyped](#toTyped(akka.actor.ActorSystem))​([ActorSystem](../../ActorSystem.html "class in akka.actor") sys)` |  |
	| `static <T> [Scheduler](../Scheduler.html "interface in akka.actor.typed")` | `[toTyped](#toTyped(akka.actor.Scheduler))​([Scheduler](../../Scheduler.html "interface in akka.actor") scheduler)` |  |
	| `static <U> void` | `[unwatch](#unwatch(akka.actor.ActorContext,akka.actor.typed.ActorRef))​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other)` |  |
	| `static <U> void` | `[unwatch](#unwatch(akka.actor.typed.javadsl.ActorContext,akka.actor.ActorRef))​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx,  [ActorRef](../../ActorRef.html "class in akka.actor") other)` |  |
	| `static <U> void` | `[watch](#watch(akka.actor.ActorContext,akka.actor.typed.ActorRef))​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other)` |  |
	| `static <U> void` | `[watch](#watch(akka.actor.typed.javadsl.ActorContext,akka.actor.ActorRef))​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx,  [ActorRef](../../ActorRef.html "class in akka.actor") other)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Adapter
		
		
		
		```
		public Adapter()
		```

	- ### Method Detail
	
	
	
		- #### spawnAnonymous
		
		
		
		```
		public static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> spawnAnonymous​([ActorSystem](../../ActorSystem.html "class in akka.actor") sys,
		                                             [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Spawn the given behavior as a child of the user actor in a classic ActorSystem.
		 Actor default supervision strategy is to stop. Can be overridden with
		 `Behaviors.supervise`.
		- #### spawnAnonymous
		
		
		
		```
		public static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> spawnAnonymous​([ActorSystem](../../ActorSystem.html "class in akka.actor") sys,
		                                             [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                             [Props](../Props.html "class in akka.actor.typed") props)
		```
		
		Spawn the given behavior as a child of the user actor in a classic ActorSystem.
		 Actor default supervision strategy is to stop. Can be overridden with
		 `Behaviors.supervise`.
		- #### spawn
		
		
		
		```
		public static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> spawn​([ActorSystem](../../ActorSystem.html "class in akka.actor") sys,
		                                    [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                    java.lang.String name)
		```
		
		Spawn the given behavior as a child of the user actor in a classic ActorSystem.
		 Actor default supervision strategy is to stop. Can be overridden with
		 `Behaviors.supervise`.
		- #### spawn
		
		
		
		```
		public static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> spawn​([ActorSystem](../../ActorSystem.html "class in akka.actor") sys,
		                                    [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                    java.lang.String name,
		                                    [Props](../Props.html "class in akka.actor.typed") props)
		```
		
		Spawn the given behavior as a child of the user actor in a classic ActorSystem.
		 Actor default supervision strategy is to stop. Can be overridden with
		 `Behaviors.supervise`.
		- #### spawnAnonymous
		
		
		
		```
		public static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> spawnAnonymous​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,
		                                             [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Spawn the given behavior as a child of the user actor in a classic ActorContext.
		 Actor default supervision strategy is to stop. Can be overridden with
		 `Behaviors.supervise`.
		- #### spawnAnonymous
		
		
		
		```
		public static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> spawnAnonymous​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,
		                                             [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                             [Props](../Props.html "class in akka.actor.typed") props)
		```
		
		Spawn the given behavior as a child of the user actor in a classic ActorContext.
		 Actor default supervision strategy is to stop. Can be overridden with
		 `Behaviors.supervise`.
		- #### spawn
		
		
		
		```
		public static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> spawn​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,
		                                    [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                    java.lang.String name)
		```
		
		Spawn the given behavior as a child of the user actor in a classic ActorContext.
		 Actor default supervision strategy is to stop. Can be overridden with
		 `Behaviors.supervise`.
		- #### spawn
		
		
		
		```
		public static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> spawn​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,
		                                    [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                    java.lang.String name,
		                                    [Props](../Props.html "class in akka.actor.typed") props)
		```
		
		Spawn the given behavior as a child of the user actor in a classic ActorContext.
		 Actor default supervision strategy is to stop. Can be overridden with
		 `Behaviors.supervise`.
		- #### toTyped
		
		
		
		```
		public static [ActorSystem](../ActorSystem.html "class in akka.actor.typed")<java.lang.Void> toTyped​([ActorSystem](../../ActorSystem.html "class in akka.actor") sys)
		```
		- #### toClassic
		
		
		
		```
		public static [ActorSystem](../../ActorSystem.html "class in akka.actor") toClassic​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> sys)
		```
		- #### toClassic
		
		
		
		```
		public static [ActorContext](../../ActorContext.html "interface in akka.actor") toClassic​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx)
		```
		- #### watch
		
		
		
		```
		public static <U> void watch​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,
		                             [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other)
		```
		- #### unwatch
		
		
		
		```
		public static <U> void unwatch​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,
		                               [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> other)
		```
		- #### stop
		
		
		
		```
		public static void stop​([ActorContext](../../ActorContext.html "interface in akka.actor") ctx,
		                        [ActorRef](../ActorRef.html "interface in akka.actor.typed")<?> child)
		```
		- #### watch
		
		
		
		```
		public static <U> void watch​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx,
		                             [ActorRef](../../ActorRef.html "class in akka.actor") other)
		```
		- #### unwatch
		
		
		
		```
		public static <U> void unwatch​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx,
		                               [ActorRef](../../ActorRef.html "class in akka.actor") other)
		```
		- #### stop
		
		
		
		```
		public static void stop​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx,
		                        [ActorRef](../../ActorRef.html "class in akka.actor") child)
		```
		- #### actorOf
		
		
		
		```
		public static [ActorRef](../../ActorRef.html "class in akka.actor") actorOf​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx,
		                               [Props](../../Props.html "class in akka.actor") props)
		```
		- #### actorOf
		
		
		
		```
		public static [ActorRef](../../ActorRef.html "class in akka.actor") actorOf​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx,
		                               [Props](../../Props.html "class in akka.actor") props,
		                               java.lang.String name)
		```
		- #### toClassic
		
		
		
		```
		public static [ActorRef](../../ActorRef.html "class in akka.actor") toClassic​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<?> ref)
		```
		- #### toTyped
		
		
		
		```
		public static <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> toTyped​([ActorRef](../../ActorRef.html "class in akka.actor") ref)
		```
		- #### props
		
		
		
		```
		public static <T> [Props](../../Props.html "class in akka.actor") props​([Creator](../../../japi/Creator.html "interface in akka.japi")<[Behavior](../Behavior.html "class in akka.actor.typed")<T>> behavior,
		                              [Props](../Props.html "class in akka.actor.typed") deploy)
		```
		
		Wrap [`Behavior`](../Behavior.html "class in akka.actor.typed") in a classic [`Props`](../../Props.html "class in akka.actor"), i.e. when
		 spawning a typed child actor from a classic parent actor.
		 This is normally not needed because you can use the extension methods
		 `spawn` and `spawnAnonymous` with a classic `ActorContext`, but it's needed
		 when using typed actors with an existing library/tool that provides an API that
		 takes a classic [`Props`](../../Props.html "class in akka.actor") parameter. Cluster Sharding is an
		 example of that.
		- #### props
		
		
		
		```
		public static <T> [Props](../../Props.html "class in akka.actor") props​([Creator](../../../japi/Creator.html "interface in akka.japi")<[Behavior](../Behavior.html "class in akka.actor.typed")<T>> behavior)
		```
		
		Wrap [`Behavior`](../Behavior.html "class in akka.actor.typed") in a classic [`Props`](../../Props.html "class in akka.actor"), i.e. when
		 spawning a typed child actor from a classic parent actor.
		 This is normally not needed because you can use the extension methods
		 `spawn` and `spawnAnonymous` with a classic `ActorContext`, but it's needed
		 when using typed actors with an existing library/tool that provides an API that
		 takes a classic [`Props`](../../Props.html "class in akka.actor") parameter. Cluster Sharding is an
		 example of that.
		- #### toClassic
		
		
		
		```
		public static [Scheduler](../../Scheduler.html "interface in akka.actor") toClassic​([Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)
		```
		- #### toTyped
		
		
		
		```
		public static <T> [Scheduler](../Scheduler.html "interface in akka.actor.typed") toTyped​([Scheduler](../../Scheduler.html "interface in akka.actor") scheduler)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Creator.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Adapter.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Adapter.html)*