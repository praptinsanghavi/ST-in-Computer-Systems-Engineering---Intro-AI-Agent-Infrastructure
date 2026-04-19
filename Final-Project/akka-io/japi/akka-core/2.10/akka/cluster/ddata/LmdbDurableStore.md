---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:47:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LmdbDurableStore.html
title: LmdbDurableStore
---

# LmdbDurableStore

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class LmdbDurableStore

- java.lang.Object
- - akka.cluster.ddata.LmdbDurableStore

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`

---

```
public final class LmdbDurableStore
extends java.lang.Object
implements [Actor](../../actor/Actor.html "interface in akka.actor"), [ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LmdbDurableStore](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[active](#active())()` |  |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `[ActorContext](../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `void` | `[dbDelete](#dbDelete(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> keys)` |  |
	| `void` | `[dbPut](#dbPut(%3Cany%3E,java.lang.String,akka.cluster.ddata.DurableStore.DurableDataEnvelope))​(<any> tx,  java.lang.String key,  [DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata") data)` |  |
	| `java.io.File` | `[dir](#dir())()` |  |
	| `void` | `[ensureValueBufferSize](#ensureValueBufferSize(int))​(int size)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[init](#init())()` |  |
	| `boolean` | `[isDbInitialized](#isDbInitialized())()` |  |
	| `java.lang.String` | `[manifest](#manifest())()` |  |
	| `java.util.HashMap<java.lang.String,​[DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata")>` | `[pending](#pending())()` |  |
	| `void` | `[postRestart](#postRestart(java.lang.Throwable))​(java.lang.Throwable reason)` | User overridable callback: By default it calls `preStart()`. |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `static [Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	| `[Serialization](../../serialization/Serialization.html "class in akka.serialization")` | `[serialization](#serialization())()` |  |
	| `[SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html "class in akka.serialization")` | `[serializer](#serializer())()` |  |
	| `void` | `[writeBehind](#writeBehind())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[writeBehindInterval](#writeBehindInterval())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../../actor/Actor.html#preStart()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`

- - ### Constructor Detail
	
	
	
		- #### LmdbDurableStore
		
		
		
		```
		public LmdbDurableStore​(com.typesafe.config.Config config)
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public static [Props](../../actor/Props.html "class in akka.actor") props​(com.typesafe.config.Config config)
		```
		- #### context
		
		
		
		```
		public [ActorContext](../../actor/ActorContext.html "interface in akka.actor") context()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#context())`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[context](../../actor/Actor.html#context())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### self
		
		
		
		```
		public final [ActorRef](../../actor/ActorRef.html "class in akka.actor") self()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](../../actor/Actor.html#self())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		protected final void akka$actor$Actor$_setter_$self_$eq​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### serialization
		
		
		
		```
		public [Serialization](../../serialization/Serialization.html "class in akka.serialization") serialization()
		```
		- #### serializer
		
		
		
		```
		public [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html "class in akka.serialization") serializer()
		```
		- #### manifest
		
		
		
		```
		public java.lang.String manifest()
		```
		- #### writeBehindInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration writeBehindInterval()
		```
		- #### dir
		
		
		
		```
		public java.io.File dir()
		```
		- #### isDbInitialized
		
		
		
		```
		public boolean isDbInitialized()
		```
		- #### ensureValueBufferSize
		
		
		
		```
		public void ensureValueBufferSize​(int size)
		```
		- #### pending
		
		
		
		```
		public java.util.HashMap<java.lang.String,​[DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata")> pending()
		```
		- #### postRestart
		
		
		
		```
		public void postRestart​(java.lang.Throwable reason)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#postRestart(java.lang.Throwable))`
		User overridable callback: By default it calls `preStart()`.
		
		Specified by:
		`[postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		Parameters:
		`reason` \- the Throwable that caused the restart to happen
		 
		 Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.
		- #### postStop
		
		
		
		```
		public void postStop()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#postStop())`
		User overridable callback.
		 
		 Is called asynchronously after 'actor.stop()' is invoked.
		 Empty default implementation.
		
		Specified by:
		`[postStop](../../actor/Actor.html#postStop())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../../actor/Actor.html#receive())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### init
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> init()
		```
		- #### active
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> active()
		```
		- #### dbPut
		
		
		
		```
		public void dbPut​(<any> tx,
		                  java.lang.String key,
		                  [DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata") data)
		```
		- #### writeBehind
		
		
		
		```
		public void writeBehind()
		```
		- #### dbDelete
		
		
		
		```
		public void dbDelete​(scala.collection.immutable.Set<java.lang.String> keys)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.DurableDataEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serialization.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/SerializerWithStringManifest.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LmdbDurableStore.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LmdbDurableStore.html)*