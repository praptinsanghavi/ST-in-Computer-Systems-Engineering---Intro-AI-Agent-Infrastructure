---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:23:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/actor/ActorSystem.html
title: ActorSystem
---

# ActorSystem

## Content

Package [akka.actor](package-summary.html)
## Class ActorSystem

- java.lang.Object
- - akka.actor.ActorSystem

- All Implemented Interfaces:
`[ActorRefFactory](ActorRefFactory.html "interface in akka.actor")`, `[ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor")`

Direct Known Subclasses:
`[ExtendedActorSystem](ExtendedActorSystem.html "class in akka.actor")`

---

```
public abstract class ActorSystem
extends java.lang.Object
implements [ActorRefFactory](ActorRefFactory.html "interface in akka.actor"), [ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor")
```

An actor system is a hierarchical group of actors which share common
 configuration, e.g. dispatchers, deployments, remote capabilities and
 addresses. It is also the entry point for creating or looking up actors.
 
 There are several possibilities for creating actors (see [`Props`](Props.html "class in akka.actor")
 for details on `props`):
 

```

 // Java or Scala
 system.actorOf(props, "name")
 system.actorOf(props)

 // Scala
 system.actorOf(Props[MyActor], "name")
 system.actorOf(Props(classOf[MyActor], arg1, arg2), "name")

 // Java
 system.actorOf(Props.create(MyActor.class), "name");
 system.actorOf(Props.create(MyActor.class, arg1, arg2), "name");
 
```

 Where no name is given explicitly, one will be automatically generated.
 

***Important Notice:***

 This class is not meant to be extended by user code. If you want to
 actually roll your own Akka, it will probably be better to look into
 extending [`ExtendedActorSystem`](ExtendedActorSystem.html "class in akka.actor") instead, but beware that you
 are completely on your own in that case!

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ActorSystem.Settings](ActorSystem.Settings.html "class in akka.actor")` | Settings are the overall ActorSystem Settings which also provides a convenient access to the Config object. |
	| `static class` | `[ActorSystem.Settings$](ActorSystem.Settings$.html "class in akka.actor")` | INTERNAL API |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSystem](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [ActorPath](ActorPath.html "interface in akka.actor")` | `[$div](#$div(java.lang.String))​(java.lang.String name)` | Construct a path below the application guardian to be used with [`ActorRefFactory.actorSelection(java.lang.String)`](ActorRefFactory.html#actorSelection(java.lang.String)). |
	| `abstract [ActorPath](ActorPath.html "interface in akka.actor")` | `[$div](#$div(scala.collection.Iterable))​(scala.collection.Iterable<java.lang.String> name)` | Construct a path below the application guardian to be used with [`ActorRefFactory.actorSelection(java.lang.String)`](ActorRefFactory.html#actorSelection(java.lang.String)). |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply())()` | Creates a new ActorSystem with the name "default",  obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,  then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader  associated with the ActorSystem class. |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply(java.lang.String))​(java.lang.String name)` | Creates a new ActorSystem with the specified name,  obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,  then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader  associated with the ActorSystem class. |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply(java.lang.String,akka.actor.BootstrapSetup))​(java.lang.String name,  [BootstrapSetup](BootstrapSetup.html "class in akka.actor") bootstrapSetup)` | Scala API: Shortcut for creating an actor system with custom bootstrap settings. |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply(java.lang.String,akka.actor.setup.ActorSystemSetup))​(java.lang.String name,  [ActorSystemSetup](setup/ActorSystemSetup.html "class in akka.actor.setup") setup)` | Scala API: Creates a new actor system with the specified name and settings  The core actor system settings are defined in [`BootstrapSetup`](BootstrapSetup.html "class in akka.actor") |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply(java.lang.String,com.typesafe.config.Config))​(java.lang.String name,  com.typesafe.config.Config config)` | Creates a new ActorSystem with the specified name, and the specified Config, then  obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,  then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader  associated with the ActorSystem class. |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply(java.lang.String,com.typesafe.config.Config,java.lang.ClassLoader))​(java.lang.String name,  com.typesafe.config.Config config,  java.lang.ClassLoader classLoader)` | Creates a new ActorSystem with the specified name, the specified Config, and specified ClassLoader |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply(java.lang.String,scala.Option,scala.Option,scala.Option))​(java.lang.String name,  scala.Option<com.typesafe.config.Config> config,  scala.Option<java.lang.ClassLoader> classLoader,  scala.Option<scala.concurrent.ExecutionContext> defaultExecutionContext)` | Creates a new ActorSystem with the specified name,  the specified ClassLoader if given, otherwise obtains the current ClassLoader by first inspecting the current  threads' getContextClassLoader, then tries to walk the stack to find the callers class loader, then  falls back to the ClassLoader associated with the ActorSystem class. |
	| `static scala.Option<com.typesafe.config.Config>` | `[apply$default$2](#apply$default$2())()` |  |
	| `static scala.Option<java.lang.ClassLoader>` | `[apply$default$3](#apply$default$3())()` |  |
	| `static scala.Option<scala.concurrent.ExecutionContext>` | `[apply$default$4](#apply$default$4())()` |  |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[child](#child(java.lang.String))​(java.lang.String child)` | Java API: Create a new child actor path. |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create())()` | Creates a new ActorSystem with the name "default",  obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,  then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader  associated with the ActorSystem class. |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create(java.lang.String))​(java.lang.String name)` | Creates a new ActorSystem with the specified name,  obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,  then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader  associated with the ActorSystem class. |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create(java.lang.String,akka.actor.BootstrapSetup))​(java.lang.String name,  [BootstrapSetup](BootstrapSetup.html "class in akka.actor") bootstrapSetup)` | Java API: Shortcut for creating an actor system with custom bootstrap settings. |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create(java.lang.String,akka.actor.setup.ActorSystemSetup))​(java.lang.String name,  [ActorSystemSetup](setup/ActorSystemSetup.html "class in akka.actor.setup") setups)` | Java API: Creates a new actor system with the specified name and settings  The core actor system settings are defined in [`BootstrapSetup`](BootstrapSetup.html "class in akka.actor") |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create(java.lang.String,com.typesafe.config.Config))​(java.lang.String name,  com.typesafe.config.Config config)` | Creates a new ActorSystem with the specified name, and the specified Config, then  obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,  then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader  associated with the ActorSystem class. |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create(java.lang.String,com.typesafe.config.Config,java.lang.ClassLoader))​(java.lang.String name,  com.typesafe.config.Config config,  java.lang.ClassLoader classLoader)` | Creates a new ActorSystem with the specified name, the specified Config, and specified ClassLoader |
	| `static [ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create(java.lang.String,com.typesafe.config.Config,java.lang.ClassLoader,scala.concurrent.ExecutionContext))​(java.lang.String name,  com.typesafe.config.Config config,  java.lang.ClassLoader classLoader,  scala.concurrent.ExecutionContext defaultExecutionContext)` | Creates a new ActorSystem with the specified name, the specified Config, the specified ClassLoader,  and the specified ExecutionContext. |
	| `abstract [ActorRef](ActorRef.html "class in akka.actor")` | `[deadLetters](#deadLetters())()` | Actor reference where messages are re\-routed to which were addressed to  stopped or non\-existing actors. |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[descendant](#descendant(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> names)` | Java API: Recursively create a descendant\&rsquo;s path by appending all child names. |
	| `abstract scala.concurrent.ExecutionContextExecutor` | `[dispatcher](#dispatcher())()` | Default dispatcher as configured. |
	| `abstract [Dispatchers](../dispatch/Dispatchers.html "class in akka.dispatch")` | `[dispatchers](#dispatchers())()` | Helper object for looking up configured dispatchers. |
	| `abstract [EventStream](../event/EventStream.html "class in akka.event")` | `[eventStream](#eventStream())()` | Main event bus of this actor system, used for example for logging. |
	| `abstract <T extends [Extension](Extension.html "interface in akka.actor")>T` | `[extension](#extension(akka.actor.ExtensionId))​([ExtensionId](ExtensionId.html "interface in akka.actor")<T> ext)` | Returns the payload that is associated with the provided extension  throws an IllegalStateException if it is not registered. |
	| `scala.concurrent.ExecutionContextExecutor` | `[getDispatcher](#getDispatcher())()` | Java API: Default dispatcher as configured. |
	| `[EventStream](../event/EventStream.html "class in akka.event")` | `[getEventStream](#getEventStream())()` | Java API: Main event bus of this actor system, used for example for logging. |
	| `[Scheduler](Scheduler.html "interface in akka.actor")` | `[getScheduler](#getScheduler())()` | Java API: Light\-weight scheduler for running asynchronous tasks after some deadline  in the future. |
	| `abstract java.util.concurrent.CompletionStage<[Terminated](Terminated.html "class in akka.actor")>` | `[getWhenTerminated](#getWhenTerminated())()` | Returns a CompletionStage which will be completed after the ActorSystem has been terminated  and termination hooks have been executed. |
	| `abstract boolean` | `[hasExtension](#hasExtension(akka.actor.ExtensionId))​([ExtensionId](ExtensionId.html "interface in akka.actor")<? extends [Extension](Extension.html "interface in akka.actor")> ext)` | Returns whether the specified extension is already registered, this method can potentially block, waiting for the initialization  of the payload, if is in the process of registration from another Thread of execution |
	| `abstract [LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event")` | `[log](#log())()` | Convenient logging adapter for logging to the [`eventStream()`](#eventStream()). |
	| `abstract void` | `[logConfiguration](#logConfiguration())()` | Log the configuration. |
	| `abstract akka.dispatch.Mailboxes` | `[mailboxes](#mailboxes())()` | Helper object for looking up configured mailbox types. |
	| `abstract java.lang.String` | `[name](#name())()` | The name of this actor system, used to distinguish multiple ones within  the same JVM \& class loader. |
	| `abstract <T extends [Extension](Extension.html "interface in akka.actor")>T` | `[registerExtension](#registerExtension(akka.actor.ExtensionId))​([ExtensionId](ExtensionId.html "interface in akka.actor")<T> ext)` | Registers the provided extension and creates its payload, if this extension isn't already registered  This method has putIfAbsent\-semantics, this method can potentially block, waiting for the initialization  of the payload, if is in the process of registration from another Thread of execution |
	| `abstract void` | `[registerOnTermination](#registerOnTermination(java.lang.Runnable))​(java.lang.Runnable code)` | Java API: Register a block of code (callback) to run after `ActorSystem.terminate` has been issued and  all actors in this actor system have been stopped. |
	| `abstract <T> void` | `[registerOnTermination](#registerOnTermination(scala.Function0))​(scala.Function0<T> code)` | Register a block of code (callback) to run after `ActorSystem.terminate` has been issued and  all actors in this actor system have been stopped. |
	| `abstract [Scheduler](Scheduler.html "interface in akka.actor")` | `[scheduler](#scheduler())()` | Light\-weight scheduler for running asynchronous tasks after some deadline  in the future. |
	| `abstract [ActorSystem.Settings](ActorSystem.Settings.html "class in akka.actor")` | `[settings](#settings())()` | The core settings extracted from the supplied configuration. |
	| `long` | `[startTime](#startTime())()` | Start\-up time in milliseconds since the epoch. |
	| `abstract scala.concurrent.Future<[Terminated](Terminated.html "class in akka.actor")>` | `[terminate](#terminate())()` | Terminates this actor system by running [`CoordinatedShutdown`](CoordinatedShutdown.html "class in akka.actor") with reason  `CoordinatedShutdown.ActorSystemTerminateReason`. |
	| `long` | `[uptime](#uptime())()` | Up\-time of this actor system in seconds. |
	| `static java.lang.String` | `[Version](#Version())()` |  |
	| `abstract scala.concurrent.Future<[Terminated](Terminated.html "class in akka.actor")>` | `[whenTerminated](#whenTerminated())()` | Returns a Future which will be completed after the ActorSystem has been terminated  and termination hooks have been executed. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ActorRefFactory](ActorRefFactory.html "interface in akka.actor")
		
		
		`[actorOf](ActorRefFactory.html#actorOf(akka.actor.Props)), [actorOf](ActorRefFactory.html#actorOf(akka.actor.Props,java.lang.String)), [actorSelection](ActorRefFactory.html#actorSelection(akka.actor.ActorPath)), [actorSelection](ActorRefFactory.html#actorSelection(java.lang.String)), [guardian](ActorRefFactory.html#guardian()), [lookupRoot](ActorRefFactory.html#lookupRoot()), [provider](ActorRefFactory.html#provider()), [stop](ActorRefFactory.html#stop(akka.actor.ActorRef)), [systemImpl](ActorRefFactory.html#systemImpl())`
		- ### Methods inherited from interface akka.actor.[ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor")
		
		
		`[classicSystem](ClassicActorSystemProvider.html#classicSystem())`

- - ### Constructor Detail
	
	
	
		- #### ActorSystem
		
		
		
		```
		public ActorSystem()
		```

	- ### Method Detail
	
	
	
		- #### Version
		
		
		
		```
		public static java.lang.String Version()
		```
		- #### create
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") create()
		```
		
		Creates a new ActorSystem with the name "default",
		 obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,
		 then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader
		 associated with the ActorSystem class.
		 Then it loads the default reference configuration using the ClassLoader.
		- #### create
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") create​(java.lang.String name)
		```
		
		Creates a new ActorSystem with the specified name,
		 obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,
		 then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader
		 associated with the ActorSystem class.
		 Then it loads the default reference configuration using the ClassLoader.
		- #### create
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") create​(java.lang.String name,
		                                 [ActorSystemSetup](setup/ActorSystemSetup.html "class in akka.actor.setup") setups)
		```
		
		Java API: Creates a new actor system with the specified name and settings
		 The core actor system settings are defined in [`BootstrapSetup`](BootstrapSetup.html "class in akka.actor")
		- #### create
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") create​(java.lang.String name,
		                                 [BootstrapSetup](BootstrapSetup.html "class in akka.actor") bootstrapSetup)
		```
		
		Java API: Shortcut for creating an actor system with custom bootstrap settings.
		 Same behavior as calling `ActorSystem.create(name, ActorSystemSetup.create(bootstrapSettings))`
		- #### create
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") create​(java.lang.String name,
		                                 com.typesafe.config.Config config)
		```
		
		Creates a new ActorSystem with the specified name, and the specified Config, then
		 obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,
		 then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader
		 associated with the ActorSystem class.
		 
		
		See Also:
		[The Typesafe Config Library API Documentation](https://lightbend.github.io/config/latest/api/index.html)
		- #### create
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") create​(java.lang.String name,
		                                 com.typesafe.config.Config config,
		                                 java.lang.ClassLoader classLoader)
		```
		
		Creates a new ActorSystem with the specified name, the specified Config, and specified ClassLoader
		 
		
		See Also:
		[The Typesafe Config Library API Documentation](https://lightbend.github.io/config/latest/api/index.html)
		- #### create
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") create​(java.lang.String name,
		                                 com.typesafe.config.Config config,
		                                 java.lang.ClassLoader classLoader,
		                                 scala.concurrent.ExecutionContext defaultExecutionContext)
		```
		
		Creates a new ActorSystem with the specified name, the specified Config, the specified ClassLoader,
		 and the specified ExecutionContext. The ExecutionContext will be used as the default executor inside this ActorSystem.
		 If `null` is passed in for the Config, ClassLoader and/or ExecutionContext parameters, the respective default value
		 will be used. If no Config is given, the default reference config will be obtained from the ClassLoader.
		 If no ClassLoader is given, it obtains the current ClassLoader by first inspecting the current
		 threads' getContextClassLoader, then tries to walk the stack to find the callers class loader, then
		 falls back to the ClassLoader associated with the ActorSystem class. If no ExecutionContext is given, the
		 system will fallback to the executor configured under "akka.actor.default\-dispatcher.default\-executor.fallback".
		 Note that the given ExecutionContext will be used by all dispatchers that have been configured with
		 executor \= "default\-executor", including those that have not defined the executor setting and thereby fallback
		 to the default of "default\-dispatcher.executor".
		 
		
		See Also:
		[The Typesafe Config Library API Documentation](https://lightbend.github.io/config/latest/api/index.html)
		- #### apply
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") apply()
		```
		
		Creates a new ActorSystem with the name "default",
		 obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,
		 then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader
		 associated with the ActorSystem class.
		 Then it loads the default reference configuration using the ClassLoader.
		- #### apply
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") apply​(java.lang.String name)
		```
		
		Creates a new ActorSystem with the specified name,
		 obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,
		 then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader
		 associated with the ActorSystem class.
		 Then it loads the default reference configuration using the ClassLoader.
		- #### apply
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") apply​(java.lang.String name,
		                                [ActorSystemSetup](setup/ActorSystemSetup.html "class in akka.actor.setup") setup)
		```
		
		Scala API: Creates a new actor system with the specified name and settings
		 The core actor system settings are defined in [`BootstrapSetup`](BootstrapSetup.html "class in akka.actor")
		- #### apply
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") apply​(java.lang.String name,
		                                [BootstrapSetup](BootstrapSetup.html "class in akka.actor") bootstrapSetup)
		```
		
		Scala API: Shortcut for creating an actor system with custom bootstrap settings.
		 Same behavior as calling `ActorSystem(name, ActorSystemSetup(bootstrapSetup))`
		- #### apply
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") apply​(java.lang.String name,
		                                com.typesafe.config.Config config)
		```
		
		Creates a new ActorSystem with the specified name, and the specified Config, then
		 obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,
		 then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader
		 associated with the ActorSystem class.
		 
		
		See Also:
		[The Typesafe Config Library API Documentation](https://lightbend.github.io/config/latest/api/index.html)
		- #### apply
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") apply​(java.lang.String name,
		                                com.typesafe.config.Config config,
		                                java.lang.ClassLoader classLoader)
		```
		
		Creates a new ActorSystem with the specified name, the specified Config, and specified ClassLoader
		 
		
		See Also:
		[The Typesafe Config Library API Documentation](https://lightbend.github.io/config/latest/api/index.html)
		- #### apply
		
		
		
		```
		public static [ActorSystem](ActorSystem.html "class in akka.actor") apply​(java.lang.String name,
		                                scala.Option<com.typesafe.config.Config> config,
		                                scala.Option<java.lang.ClassLoader> classLoader,
		                                scala.Option<scala.concurrent.ExecutionContext> defaultExecutionContext)
		```
		
		Creates a new ActorSystem with the specified name,
		 the specified ClassLoader if given, otherwise obtains the current ClassLoader by first inspecting the current
		 threads' getContextClassLoader, then tries to walk the stack to find the callers class loader, then
		 falls back to the ClassLoader associated with the ActorSystem class.
		 If an ExecutionContext is given, it will be used as the default executor inside this ActorSystem.
		 If no ExecutionContext is given, the system will fallback to the executor configured under "akka.actor.default\-dispatcher.default\-executor.fallback".
		 The system will use the passed in config, or falls back to the default reference configuration using the ClassLoader.
		 
		
		See Also:
		[The Typesafe Config Library API Documentation](https://lightbend.github.io/config/latest/api/index.html)
		- #### apply$default$2
		
		
		
		```
		public static scala.Option<com.typesafe.config.Config> apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static scala.Option<java.lang.ClassLoader> apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public static scala.Option<scala.concurrent.ExecutionContext> apply$default$4()
		```
		- #### name
		
		
		
		```
		public abstract java.lang.String name()
		```
		
		The name of this actor system, used to distinguish multiple ones within
		 the same JVM \& class loader.
		- #### settings
		
		
		
		```
		public abstract [ActorSystem.Settings](ActorSystem.Settings.html "class in akka.actor") settings()
		```
		
		The core settings extracted from the supplied configuration.
		- #### logConfiguration
		
		
		
		```
		public abstract void logConfiguration()
		```
		
		Log the configuration.
		- #### $div
		
		
		
		```
		public abstract [ActorPath](ActorPath.html "interface in akka.actor") $div​(java.lang.String name)
		```
		
		Construct a path below the application guardian to be used with [`ActorRefFactory.actorSelection(java.lang.String)`](ActorRefFactory.html#actorSelection(java.lang.String)).
		- #### child
		
		
		
		```
		public [ActorPath](ActorPath.html "interface in akka.actor") child​(java.lang.String child)
		```
		
		Java API: Create a new child actor path.
		- #### $div
		
		
		
		```
		public abstract [ActorPath](ActorPath.html "interface in akka.actor") $div​(scala.collection.Iterable<java.lang.String> name)
		```
		
		Construct a path below the application guardian to be used with [`ActorRefFactory.actorSelection(java.lang.String)`](ActorRefFactory.html#actorSelection(java.lang.String)).
		- #### descendant
		
		
		
		```
		public [ActorPath](ActorPath.html "interface in akka.actor") descendant​(java.lang.Iterable<java.lang.String> names)
		```
		
		Java API: Recursively create a descendant\&rsquo;s path by appending all child names.
		- #### startTime
		
		
		
		```
		public long startTime()
		```
		
		Start\-up time in milliseconds since the epoch.
		- #### uptime
		
		
		
		```
		public long uptime()
		```
		
		Up\-time of this actor system in seconds.
		- #### eventStream
		
		
		
		```
		public abstract [EventStream](../event/EventStream.html "class in akka.event") eventStream()
		```
		
		Main event bus of this actor system, used for example for logging.
		- #### getEventStream
		
		
		
		```
		public [EventStream](../event/EventStream.html "class in akka.event") getEventStream()
		```
		
		Java API: Main event bus of this actor system, used for example for logging.
		- #### log
		
		
		
		```
		public abstract [LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event") log()
		```
		
		Convenient logging adapter for logging to the [`eventStream()`](#eventStream()).
		- #### deadLetters
		
		
		
		```
		public abstract [ActorRef](ActorRef.html "class in akka.actor") deadLetters()
		```
		
		Actor reference where messages are re\-routed to which were addressed to
		 stopped or non\-existing actors. Delivery to this actor is done on a best
		 effort basis and hence not strictly guaranteed.
		- #### scheduler
		
		
		
		```
		public abstract [Scheduler](Scheduler.html "interface in akka.actor") scheduler()
		```
		
		Light\-weight scheduler for running asynchronous tasks after some deadline
		 in the future. Not terribly precise but cheap.
		- #### getScheduler
		
		
		
		```
		public [Scheduler](Scheduler.html "interface in akka.actor") getScheduler()
		```
		
		Java API: Light\-weight scheduler for running asynchronous tasks after some deadline
		 in the future. Not terribly precise but cheap.
		- #### dispatchers
		
		
		
		```
		public abstract [Dispatchers](../dispatch/Dispatchers.html "class in akka.dispatch") dispatchers()
		```
		
		Helper object for looking up configured dispatchers.
		- #### dispatcher
		
		
		
		```
		public abstract scala.concurrent.ExecutionContextExecutor dispatcher()
		```
		
		Default dispatcher as configured. This dispatcher is used for all actors
		 in the actor system which do not have a different dispatcher configured
		 explicitly.
		 Importing this member will place the default MessageDispatcher in scope.
		
		Specified by:
		`[dispatcher](ActorRefFactory.html#dispatcher())` in interface `[ActorRefFactory](ActorRefFactory.html "interface in akka.actor")`
		- #### getDispatcher
		
		
		
		```
		public scala.concurrent.ExecutionContextExecutor getDispatcher()
		```
		
		Java API: Default dispatcher as configured. This dispatcher is used for all actors
		 in the actor system which do not have a different dispatcher configured
		 explicitly.
		 Importing this member will place the default MessageDispatcher in scope.
		- #### mailboxes
		
		
		
		```
		public abstract akka.dispatch.Mailboxes mailboxes()
		```
		
		Helper object for looking up configured mailbox types.
		- #### registerOnTermination
		
		
		
		```
		public abstract <T> void registerOnTermination​(scala.Function0<T> code)
		```
		
		Register a block of code (callback) to run after `ActorSystem.terminate` has been issued and
		 all actors in this actor system have been stopped.
		 Multiple code blocks may be registered by calling this method multiple times.
		 The callbacks will be run sequentially in reverse order of registration, i.e.
		 last registration is run first.
		 Note that ActorSystem will not terminate until all the registered callbacks are finished.
		 
		 Throws a RejectedExecutionException if the System has already been terminated or if termination has been initiated.
		 
		
		
		 Scala API
		- #### registerOnTermination
		
		
		
		```
		public abstract void registerOnTermination​(java.lang.Runnable code)
		```
		
		Java API: Register a block of code (callback) to run after `ActorSystem.terminate` has been issued and
		 all actors in this actor system have been stopped.
		 Multiple code blocks may be registered by calling this method multiple times.
		 The callbacks will be run sequentially in reverse order of registration, i.e.
		 last registration is run first.
		 Note that ActorSystem will not terminate until all the registered callbacks are finished.
		 
		 Throws a RejectedExecutionException if the System has already been terminated or if termination has been initiated.
		- #### terminate
		
		
		
		```
		public abstract scala.concurrent.Future<[Terminated](Terminated.html "class in akka.actor")> terminate()
		```
		
		Terminates this actor system by running [`CoordinatedShutdown`](CoordinatedShutdown.html "class in akka.actor") with reason
		 `CoordinatedShutdown.ActorSystemTerminateReason`.
		 
		 If `akka.coordinated-shutdown.run-by-actor-system-terminate` is configured to `off`
		 it will not run `CoordinatedShutdown`, but the `ActorSystem` and its actors
		 will still be terminated.
		 
		
		
		 This will stop the guardian actor, which in turn
		 will recursively stop all its child actors, and finally the system guardian
		 (below which the logging actors reside) and then execute all registered
		 termination handlers (see [`registerOnTermination(scala.Function0<T>)`](#registerOnTermination(scala.Function0))).
		 Be careful to not schedule any operations on completion of the returned future
		 using the dispatcher of this actor system as it will have been shut down before the
		 future completes.
		- #### whenTerminated
		
		
		
		```
		public abstract scala.concurrent.Future<[Terminated](Terminated.html "class in akka.actor")> whenTerminated()
		```
		
		Returns a Future which will be completed after the ActorSystem has been terminated
		 and termination hooks have been executed. If you registered any callback with
		 [`registerOnTermination(scala.Function0<T>)`](#registerOnTermination(scala.Function0)), the returned Future from this method will not complete
		 until all the registered callbacks are finished. Be careful to not schedule any operations,
		 such as `onComplete`, on the dispatchers (`ExecutionContext`) of this actor system as they
		 will have been shut down before this future completes.
		- #### getWhenTerminated
		
		
		
		```
		public abstract java.util.concurrent.CompletionStage<[Terminated](Terminated.html "class in akka.actor")> getWhenTerminated()
		```
		
		Returns a CompletionStage which will be completed after the ActorSystem has been terminated
		 and termination hooks have been executed. If you registered any callback with
		 [`registerOnTermination(scala.Function0<T>)`](#registerOnTermination(scala.Function0)), the returned CompletionStage from this method will not complete
		 until all the registered callbacks are finished. Be careful to not schedule any operations,
		 such as `thenRunAsync`, on the dispatchers (`Executor`) of this actor system as they
		 will have been shut down before this CompletionStage completes.
		- #### registerExtension
		
		
		
		```
		public abstract <T extends [Extension](Extension.html "interface in akka.actor")> T registerExtension​([ExtensionId](ExtensionId.html "interface in akka.actor")<T> ext)
		```
		
		Registers the provided extension and creates its payload, if this extension isn't already registered
		 This method has putIfAbsent\-semantics, this method can potentially block, waiting for the initialization
		 of the payload, if is in the process of registration from another Thread of execution
		- #### extension
		
		
		
		```
		public abstract <T extends [Extension](Extension.html "interface in akka.actor")> T extension​([ExtensionId](ExtensionId.html "interface in akka.actor")<T> ext)
		```
		
		Returns the payload that is associated with the provided extension
		 throws an IllegalStateException if it is not registered.
		 This method can potentially block, waiting for the initialization
		 of the payload, if is in the process of registration from another Thread of execution
		- #### hasExtension
		
		
		
		```
		public abstract boolean hasExtension​([ExtensionId](ExtensionId.html "interface in akka.actor")<? extends [Extension](Extension.html "interface in akka.actor")> ext)
		```
		
		Returns whether the specified extension is already registered, this method can potentially block, waiting for the initialization
		 of the payload, if is in the process of registration from another Thread of execution

## Code Examples

### Example 1: Class ActorSystem

```text
// Java or Scala
 system.actorOf(props, "name")
 system.actorOf(props)

 // Scala
 system.actorOf(Props[MyActor], "name")
 system.actorOf(Props(classOf[MyActor], arg1, arg2), "name")

 // Java
 system.actorOf(Props.create(MyActor.class), "name");
 system.actorOf(Props.create(MyActor.class, arg1, arg2), "name");
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ActorSystem.Settings$.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/BootstrapSetup.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Props.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka/2.8/akka/dispatch/Dispatchers.html
- https://doc.akka.io/japi/akka/2.8/akka/event/EventStream.html
- https://doc.akka.io/japi/akka/2.8/akka/event/LoggingAdapter.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/actor/ActorSystem.html](https://doc.akka.io/japi/akka/2.8/akka/actor/ActorSystem.html)*