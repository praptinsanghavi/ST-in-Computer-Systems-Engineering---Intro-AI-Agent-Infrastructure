---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:32:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
title: ActorSystem
---

# ActorSystem

## Content

Package [akka.actor.typed](package-summary.html)
## Class ActorSystem\<T\>

- java.lang.Object
- - akka.actor.typed.ActorSystem\<T\>

- All Implemented Interfaces:
`[ClassicActorSystemProvider](../ClassicActorSystemProvider.html "interface in akka.actor")`, `[ActorRef](ActorRef.html "interface in akka.actor.typed")<T>`, `[Extensions](Extensions.html "interface in akka.actor.typed")`, `[RecipientRef](RecipientRef.html "interface in akka.actor.typed")<T>`, `java.io.Serializable`, `java.lang.Comparable<[ActorRef](ActorRef.html "interface in akka.actor.typed")<?>>`

---

```
public abstract class ActorSystem<T>
extends java.lang.Object
implements [ActorRef](ActorRef.html "interface in akka.actor.typed")<T>, [Extensions](Extensions.html "interface in akka.actor.typed"), [ClassicActorSystemProvider](../ClassicActorSystemProvider.html "interface in akka.actor")
```

An ActorSystem is home to a hierarchy of Actors. It is created using
 [`apply(akka.actor.typed.Behavior<T>, java.lang.String)`](#apply(akka.actor.typed.Behavior,java.lang.String)) from a [`Behavior`](Behavior.html "class in akka.actor.typed") object that describes the root
 Actor of this hierarchy and which will create all other Actors beneath it.
 A system also implements the [`ActorRef`](ActorRef.html "interface in akka.actor.typed") type, and sending a message to
 the system directs that message to the root Actor.
 
 Not for user extension.

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.ActorSystem)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.typed.[ActorRef](ActorRef.html "interface in akka.actor.typed")
		
		
		`[ActorRef.ActorRefOps](ActorRef.ActorRefOps.html "class in akka.actor.typed")<[T](ActorRef.ActorRefOps.html "type parameter in ActorRef.ActorRefOps")>, [ActorRef.ActorRefOps$](ActorRef.ActorRefOps$.html "class in akka.actor.typed")`
		- ### Nested classes/interfaces inherited from interface akka.actor.typed.[RecipientRef](RecipientRef.html "interface in akka.actor.typed")
		
		
		`[RecipientRef.RecipientRefOps](RecipientRef.RecipientRefOps.html "class in akka.actor.typed")<[T](RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps")>, [RecipientRef.RecipientRefOps$](RecipientRef.RecipientRefOps$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSystem](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [Address](../Address.html "class in akka.actor")` | `[address](#address())()` | Obtains the external address of the default transport. |
	| `static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name)` | Scala API: Create an ActorSystem |
	| `static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String,akka.actor.BootstrapSetup))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  [BootstrapSetup](../BootstrapSetup.html "class in akka.actor") bootstrapSetup)` | Scala API: Shortcut for creating an actor system with custom bootstrap settings. |
	| `static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String,akka.actor.setup.ActorSystemSetup,akka.actor.typed.Props))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  [ActorSystemSetup](../setup/ActorSystemSetup.html "class in akka.actor.setup") setup,  [Props](Props.html "class in akka.actor.typed") guardianProps)` | Scala API: Creates a new actor system with the specified name and settings  The core actor system settings are defined in `BootstrapSetup` |
	| `static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String,com.typesafe.config.Config))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  com.typesafe.config.Config config)` | Scala API: Create an ActorSystem |
	| `static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String,com.typesafe.config.Config,akka.actor.typed.Props))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  com.typesafe.config.Config config,  [Props](Props.html "class in akka.actor.typed") guardianProps)` | Scala API: Create an ActorSystem |
	| `static <T> [Props](Props.html "class in akka.actor.typed")` | `[apply$default$4](#apply$default$4())()` |  |
	| `static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[create](#create(akka.actor.typed.Behavior,java.lang.String))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name)` | Java API: Create an ActorSystem |
	| `static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[create](#create(akka.actor.typed.Behavior,java.lang.String,akka.actor.BootstrapSetup))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  [BootstrapSetup](../BootstrapSetup.html "class in akka.actor") bootstrapSetup)` | Java API: Shortcut for creating an actor system with custom bootstrap settings. |
	| `static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[create](#create(akka.actor.typed.Behavior,java.lang.String,akka.actor.setup.ActorSystemSetup))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  [ActorSystemSetup](../setup/ActorSystemSetup.html "class in akka.actor.setup") setups)` | Java API: Creates a new actor system with the specified name and settings  The core actor system settings are defined in `BootstrapSetup` |
	| `static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[create](#create(akka.actor.typed.Behavior,java.lang.String,com.typesafe.config.Config))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  com.typesafe.config.Config config)` | Java API: Create an ActorSystem |
	| `static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[create](#create(akka.actor.typed.Behavior,java.lang.String,com.typesafe.config.Config,akka.actor.typed.Props))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  com.typesafe.config.Config config,  [Props](Props.html "class in akka.actor.typed") guardianProps)` | Java API: Create an ActorSystem |
	| `abstract <U> [ActorRef](ActorRef.html "interface in akka.actor.typed")<U>` | `[deadLetters](#deadLetters())()` | The deadLetter address is a destination that will accept (and discard)  every message sent to it. |
	| `abstract [Dispatchers](Dispatchers.html "class in akka.actor.typed")` | `[dispatchers](#dispatchers())()` | Facilities for lookup up thread\-pools from configuration. |
	| `abstract [DynamicAccess](../DynamicAccess.html "class in akka.actor")` | `[dynamicAccess](#dynamicAccess())()` | ClassLoader wrapper which is used for reflective accesses internally. |
	| `[ActorRef](ActorRef.html "interface in akka.actor.typed")<[EventStream.Command](eventstream/EventStream.Command.html "interface in akka.actor.typed.eventstream")>` | `[eventStream](#eventStream())()` | Main event bus of this actor system, used for example for logging. |
	| `abstract scala.concurrent.ExecutionContextExecutor` | `[executionContext](#executionContext())()` | The default thread pool of this ActorSystem, configured with settings in `akka.actor.default-dispatcher`. |
	| `abstract java.util.Optional<java.time.LocalDate>` | `[getLicenseKeyExpiry](#getLicenseKeyExpiry())()` | Java API: When the license key will expire. |
	| `abstract java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>` | `[getWhenTerminated](#getWhenTerminated())()` | Java API: Returns a CompletionStage which will be completed after the ActorSystem has been terminated  and termination hooks have been executed. |
	| `abstract <U> [ActorRef](ActorRef.html "interface in akka.actor.typed")<U>` | `[ignoreRef](#ignoreRef())()` | An ActorRef that ignores any incoming messages. |
	| `abstract scala.Option<java.time.LocalDate>` | `[licenseKeyExpiry](#licenseKeyExpiry())()` | Scala API: When the license key will expire. |
	| `abstract org.slf4j.Logger` | `[log](#log())()` | A `Logger` that can be used to emit log messages  without specifying a more detailed source. |
	| `abstract void` | `[logConfiguration](#logConfiguration())()` | Log the configuration. |
	| `abstract java.lang.String` | `[name](#name())()` | The name of this actor system, used to distinguish multiple ones within  the same JVM \& class loader. |
	| `abstract java.lang.String` | `[printTree](#printTree())()` | Create a string representation of the actor hierarchy within this system  for debugging purposes. |
	| `[ActorRef](ActorRef.html "interface in akka.actor.typed")<[Receptionist.Command](receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")>` | `[receptionist](#receptionist())()` | Return a reference to this system\&rsquo;s [`Receptionist`](receptionist/Receptionist.html "class in akka.actor.typed.receptionist"). |
	| `abstract [Scheduler](Scheduler.html "interface in akka.actor.typed")` | `[scheduler](#scheduler())()` | A generic scheduler that can initiate the execution of tasks after some delay. |
	| `abstract [Settings](Settings.html "class in akka.actor.typed")` | `[settings](#settings())()` | The core settings extracted from the supplied configuration. |
	| `abstract long` | `[startTime](#startTime())()` | Start\-up time in milliseconds since the epoch. |
	| `abstract <U> [ActorRef](ActorRef.html "interface in akka.actor.typed")<U>` | `[systemActorOf](#systemActorOf(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props))​([Behavior](Behavior.html "class in akka.actor.typed")<U> behavior,  java.lang.String name,  [Props](Props.html "class in akka.actor.typed") props)` | Create an actor in the "/system" namespace. |
	| `<U> [Props](Props.html "class in akka.actor.typed")` | `[systemActorOf$default$3](#systemActorOf$default$3())()` |  |
	| `abstract void` | `[terminate](#terminate())()` | Terminates this actor system by running [`CoordinatedShutdown`](../CoordinatedShutdown.html "class in akka.actor") with reason  `akka.actor.CoordinatedShutdown.ActorSystemTerminateReason`. |
	| `abstract java.util.concurrent.ThreadFactory` | `[threadFactory](#threadFactory())()` | A ThreadFactory that can be used if the transport needs to create any Threads |
	| `abstract long` | `[uptime](#uptime())()` | Up\-time of this actor system in seconds. |
	| `abstract scala.concurrent.Future<[Done](../../Done.html "class in akka")>` | `[whenTerminated](#whenTerminated())()` | Scala API: Returns a Future which will be completed after the ActorSystem has been terminated. |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor.typed")<scala.runtime.Nothing$>` | `[wrap](#wrap(akka.actor.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor") system)` | Wrap a classic [`ActorSystem`](../ActorSystem.html "class in akka.actor") such that it can be used from  Akka Typed [`Behavior`](Behavior.html "class in akka.actor.typed"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.typed.[ActorRef](ActorRef.html "interface in akka.actor.typed")
		
		
		`[narrow](ActorRef.html#narrow()), [path](ActorRef.html#path()), [tell](ActorRef.html#tell(T)), [unsafeUpcast](ActorRef.html#unsafeUpcast()), [writeReplace](ActorRef.html#writeReplace())`
		- ### Methods inherited from interface akka.actor.[ClassicActorSystemProvider](../ClassicActorSystemProvider.html "interface in akka.actor")
		
		
		`[classicSystem](../ClassicActorSystemProvider.html#classicSystem())`
		- ### Methods inherited from interface java.lang.Comparable
		
		
		`compareTo`
		- ### Methods inherited from interface akka.actor.typed.[Extensions](Extensions.html "interface in akka.actor.typed")
		
		
		`[extension](Extensions.html#extension(akka.actor.typed.ExtensionId)), [hasExtension](Extensions.html#hasExtension(akka.actor.typed.ExtensionId)), [registerExtension](Extensions.html#registerExtension(akka.actor.typed.ExtensionId))`

- - ### Constructor Detail
	
	
	
		- #### ActorSystem
		
		
		
		```
		public ActorSystem()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> apply​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                       java.lang.String name)
		```
		
		Scala API: Create an ActorSystem
		- #### apply
		
		
		
		```
		public static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> apply​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                       java.lang.String name,
		                                       com.typesafe.config.Config config)
		```
		
		Scala API: Create an ActorSystem
		- #### apply
		
		
		
		```
		public static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> apply​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                       java.lang.String name,
		                                       com.typesafe.config.Config config,
		                                       [Props](Props.html "class in akka.actor.typed") guardianProps)
		```
		
		Scala API: Create an ActorSystem
		- #### apply
		
		
		
		```
		public static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> apply​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                       java.lang.String name,
		                                       [ActorSystemSetup](../setup/ActorSystemSetup.html "class in akka.actor.setup") setup,
		                                       [Props](Props.html "class in akka.actor.typed") guardianProps)
		```
		
		Scala API: Creates a new actor system with the specified name and settings
		 The core actor system settings are defined in `BootstrapSetup`
		- #### apply
		
		
		
		```
		public static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> apply​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                       java.lang.String name,
		                                       [BootstrapSetup](../BootstrapSetup.html "class in akka.actor") bootstrapSetup)
		```
		
		Scala API: Shortcut for creating an actor system with custom bootstrap settings.
		 Same behavior as calling `ActorSystem(name, ActorSystemSetup(bootstrapSetup))`
		- #### apply$default$4
		
		
		
		```
		public static <T> [Props](Props.html "class in akka.actor.typed") apply$default$4()
		```
		- #### create
		
		
		
		```
		public static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> create​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                        java.lang.String name)
		```
		
		Java API: Create an ActorSystem
		- #### create
		
		
		
		```
		public static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> create​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                        java.lang.String name,
		                                        com.typesafe.config.Config config)
		```
		
		Java API: Create an ActorSystem
		- #### create
		
		
		
		```
		public static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> create​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                        java.lang.String name,
		                                        com.typesafe.config.Config config,
		                                        [Props](Props.html "class in akka.actor.typed") guardianProps)
		```
		
		Java API: Create an ActorSystem
		- #### create
		
		
		
		```
		public static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> create​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                        java.lang.String name,
		                                        [ActorSystemSetup](../setup/ActorSystemSetup.html "class in akka.actor.setup") setups)
		```
		
		Java API: Creates a new actor system with the specified name and settings
		 The core actor system settings are defined in `BootstrapSetup`
		- #### create
		
		
		
		```
		public static <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> create​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                        java.lang.String name,
		                                        [BootstrapSetup](../BootstrapSetup.html "class in akka.actor") bootstrapSetup)
		```
		
		Java API: Shortcut for creating an actor system with custom bootstrap settings.
		 Same behavior as calling `ActorSystem.create(name, ActorSystemSetup.create(bootstrapSettings))`
		- #### wrap
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor.typed")<scala.runtime.Nothing$> wrap​([ActorSystem](../ActorSystem.html "class in akka.actor") system)
		```
		
		Wrap a classic [`ActorSystem`](../ActorSystem.html "class in akka.actor") such that it can be used from
		 Akka Typed [`Behavior`](Behavior.html "class in akka.actor.typed").
		- #### name
		
		
		
		```
		public abstract java.lang.String name()
		```
		
		The name of this actor system, used to distinguish multiple ones within
		 the same JVM \& class loader.
		- #### settings
		
		
		
		```
		public abstract [Settings](Settings.html "class in akka.actor.typed") settings()
		```
		
		The core settings extracted from the supplied configuration.
		- #### logConfiguration
		
		
		
		```
		public abstract void logConfiguration()
		```
		
		Log the configuration.
		- #### log
		
		
		
		```
		public abstract org.slf4j.Logger log()
		```
		
		A `Logger` that can be used to emit log messages
		 without specifying a more detailed source. Typically it is desirable to
		 use the dedicated `Logger` available from each Actor\&rsquo;s [`TypedActorContext`](TypedActorContext.html "interface in akka.actor.typed")
		 as that ties the log entries to the actor.
		- #### startTime
		
		
		
		```
		public abstract long startTime()
		```
		
		Start\-up time in milliseconds since the epoch.
		- #### uptime
		
		
		
		```
		public abstract long uptime()
		```
		
		Up\-time of this actor system in seconds.
		- #### threadFactory
		
		
		
		```
		public abstract java.util.concurrent.ThreadFactory threadFactory()
		```
		
		A ThreadFactory that can be used if the transport needs to create any Threads
		- #### dynamicAccess
		
		
		
		```
		public abstract [DynamicAccess](../DynamicAccess.html "class in akka.actor") dynamicAccess()
		```
		
		ClassLoader wrapper which is used for reflective accesses internally. This is set
		 to use the context class loader, if one is set, or the class loader which
		 loaded the ActorSystem implementation. The context class loader is also
		 set on all threads created by the ActorSystem, if one was set during
		 creation.
		- #### scheduler
		
		
		
		```
		public abstract [Scheduler](Scheduler.html "interface in akka.actor.typed") scheduler()
		```
		
		A generic scheduler that can initiate the execution of tasks after some delay.
		 It is recommended to use the ActorContext\&rsquo;s scheduling capabilities for sending
		 messages to actors instead of registering a Runnable for execution using this facility.
		- #### dispatchers
		
		
		
		```
		public abstract [Dispatchers](Dispatchers.html "class in akka.actor.typed") dispatchers()
		```
		
		Facilities for lookup up thread\-pools from configuration.
		- #### executionContext
		
		
		
		```
		public abstract scala.concurrent.ExecutionContextExecutor executionContext()
		```
		
		The default thread pool of this ActorSystem, configured with settings in `akka.actor.default-dispatcher`.
		- #### terminate
		
		
		
		```
		public abstract void terminate()
		```
		
		Terminates this actor system by running [`CoordinatedShutdown`](../CoordinatedShutdown.html "class in akka.actor") with reason
		 `akka.actor.CoordinatedShutdown.ActorSystemTerminateReason`.
		 
		 If `akka.coordinated-shutdown.run-by-actor-system-terminate` is configured to `off`
		 it will not run `CoordinatedShutdown`, but the `ActorSystem` and its actors
		 will still be terminated.
		 
		
		
		 This will stop the guardian actor, which in turn
		 will recursively stop all its child actors, and finally the system guardian
		 (below which the logging actors reside).
		 
		
		
		 This is an asynchronous operation and completion of the termination can
		 be observed with `ActorSystem.whenTerminated` or `ActorSystem.getWhenTerminated`.
		- #### whenTerminated
		
		
		
		```
		public abstract scala.concurrent.Future<[Done](../../Done.html "class in akka")> whenTerminated()
		```
		
		Scala API: Returns a Future which will be completed after the ActorSystem has been terminated.
		 The `ActorSystem` can be stopped with `ActorSystem.terminate`
		 or by stopping the guardian actor.
		 
		 Be careful to not schedule any operations, such as `onComplete`, on the dispatchers (`ExecutionContext`)
		 of this actor system as they will have been shut down before this future completes.
		- #### getWhenTerminated
		
		
		
		```
		public abstract java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")> getWhenTerminated()
		```
		
		Java API: Returns a CompletionStage which will be completed after the ActorSystem has been terminated
		 and termination hooks have been executed. The `ActorSystem` can be stopped with `ActorSystem.terminate`
		 or by stopping the guardian actor.
		 
		 Be careful to not schedule any operations, such as `thenRunAsync`, on the dispatchers (`Executor`) of this
		 actor system as they will have been shut down before this CompletionStage completes.
		- #### deadLetters
		
		
		
		```
		public abstract <U> [ActorRef](ActorRef.html "interface in akka.actor.typed")<U> deadLetters()
		```
		
		The deadLetter address is a destination that will accept (and discard)
		 every message sent to it.
		- #### ignoreRef
		
		
		
		```
		public abstract <U> [ActorRef](ActorRef.html "interface in akka.actor.typed")<U> ignoreRef()
		```
		
		An ActorRef that ignores any incoming messages.
		- #### printTree
		
		
		
		```
		public abstract java.lang.String printTree()
		```
		
		Create a string representation of the actor hierarchy within this system
		 for debugging purposes.
		 
		 The format of the string is subject to change, i.e. no stable \&ldquo;API\&rdquo;.
		- #### systemActorOf
		
		
		
		```
		public abstract <U> [ActorRef](ActorRef.html "interface in akka.actor.typed")<U> systemActorOf​([Behavior](Behavior.html "class in akka.actor.typed")<U> behavior,
		                                              java.lang.String name,
		                                              [Props](Props.html "class in akka.actor.typed") props)
		```
		
		Create an actor in the "/system" namespace. This actor will be shut down
		 during system.terminate only after all user actors have terminated.
		 
		 This is only intended to be used by libraries (and Akka itself).
		 Applications should use ordinary `spawn`.
		- #### systemActorOf$default$3
		
		
		
		```
		public <U> [Props](Props.html "class in akka.actor.typed") systemActorOf$default$3()
		```
		- #### receptionist
		
		
		
		```
		public [ActorRef](ActorRef.html "interface in akka.actor.typed")<[Receptionist.Command](receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")> receptionist()
		```
		
		Return a reference to this system\&rsquo;s [`Receptionist`](receptionist/Receptionist.html "class in akka.actor.typed.receptionist").
		- #### eventStream
		
		
		
		```
		public [ActorRef](ActorRef.html "interface in akka.actor.typed")<[EventStream.Command](eventstream/EventStream.Command.html "interface in akka.actor.typed.eventstream")> eventStream()
		```
		
		Main event bus of this actor system, used for example for logging.
		 Accepts [`EventStream.Command`](eventstream/EventStream.Command.html "interface in akka.actor.typed.eventstream").
		- #### address
		
		
		
		```
		public abstract [Address](../Address.html "class in akka.actor") address()
		```
		
		Obtains the external address of the default transport.
		 
		 Consider differences in clustered and non\-clustered ActorSystems.
		 For a non\-clustered ActorSystem, this will return an address without host and port.
		 For a clustered ActorSystem, this will return the address that other nodes can use to
		 communicate with this node.
		- #### licenseKeyExpiry
		
		
		
		```
		public abstract scala.Option<java.time.LocalDate> licenseKeyExpiry()
		```
		
		Scala API: When the license key will expire. `None` for perpetual keys.
		 If a license key is not defined the expiry date will be today's date.
		- #### getLicenseKeyExpiry
		
		
		
		```
		public abstract java.util.Optional<java.time.LocalDate> getLicenseKeyExpiry()
		```
		
		Java API: When the license key will expire. `Optional.empty` for perpetual keys.
		 If a license key is not defined the expiry date will be today's date.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/BootstrapSetup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.ActorRefOps$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.ActorRefOps.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Dispatchers.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Extensions.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.RecipientRefOps$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.RecipientRefOps.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Settings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/eventstream/EventStream.Command.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist.Command.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html)*