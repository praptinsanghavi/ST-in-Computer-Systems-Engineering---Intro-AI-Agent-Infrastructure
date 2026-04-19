---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.Settings.html
title: ActorSystem.Settings
---

# ActorSystem.Settings

## Content

Package [akka.actor](package-summary.html)
## Class ActorSystem.Settings

- java.lang.Object
- - akka.actor.ActorSystem.Settings

- Enclosing class:
[ActorSystem](ActorSystem.html "class in akka.actor")

---

```
public static class ActorSystem.Settings
extends java.lang.Object
```

Settings are the overall ActorSystem Settings which also provides a convenient access to the Config object.
 
 For more detailed information about the different possible configuration options, look in the Akka Documentation under "Configuration"
 

See Also:
[The Typesafe Config Library API Documentation](https://lightbend.github.io/config/latest/api/index.html)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Settings](#%3Cinit%3E(java.lang.ClassLoader,com.typesafe.config.Config,java.lang.String))​(java.lang.ClassLoader classLoader,  com.typesafe.config.Config cfg,  java.lang.String name)` |  |
	| `[Settings](#%3Cinit%3E(java.lang.ClassLoader,com.typesafe.config.Config,java.lang.String,akka.actor.setup.ActorSystemSetup))​(java.lang.ClassLoader classLoader,  com.typesafe.config.Config cfg,  java.lang.String name,  [ActorSystemSetup](setup/ActorSystemSetup.html "class in akka.actor.setup") setup)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[AddLoggingReceive](#AddLoggingReceive())()` |  |
	| `boolean` | `[AllowJavaSerialization](#AllowJavaSerialization())()` |  |
	| `com.typesafe.config.Config` | `[config](#config())()` | The backing Config of this ActorSystem's Settings |
	| `java.lang.String` | `[ConfigVersion](#ConfigVersion())()` |  |
	| `boolean` | `[CoordinatedShutdownRunByActorSystemTerminate](#CoordinatedShutdownRunByActorSystemTerminate())()` |  |
	| `boolean` | `[CoordinatedShutdownTerminateActorSystem](#CoordinatedShutdownTerminateActorSystem())()` |  |
	| `[Timeout](../util/Timeout.html "class in akka.util")` | `[CreationTimeout](#CreationTimeout())()` |  |
	| `boolean` | `[Daemonicity](#Daemonicity())()` |  |
	| `boolean` | `[DebugAutoReceive](#DebugAutoReceive())()` |  |
	| `boolean` | `[DebugEventStream](#DebugEventStream())()` |  |
	| `boolean` | `[DebugLifecycle](#DebugLifecycle())()` |  |
	| `boolean` | `[DebugRouterMisconfiguration](#DebugRouterMisconfiguration())()` |  |
	| `boolean` | `[DebugUnhandledMessage](#DebugUnhandledMessage())()` |  |
	| `int` | `[DefaultVirtualNodesFactor](#DefaultVirtualNodesFactor())()` |  |
	| `boolean` | `[EnableAdditionalSerializationBindings](#EnableAdditionalSerializationBindings())()` | Deprecated. Always enabled from Akka 2\.6\.0\. |
	| `boolean` | `[FailMixedVersions](#FailMixedVersions())()` |  |
	| `boolean` | `[FsmDebugEvent](#FsmDebugEvent())()` |  |
	| `boolean` | `[HasCluster](#HasCluster())()` |  |
	| `scala.Option<java.lang.String>` | `[Home](#Home())()` |  |
	| `boolean` | `[JvmExitOnFatalError](#JvmExitOnFatalError())()` |  |
	| `boolean` | `[JvmShutdownHooks](#JvmShutdownHooks())()` |  |
	| `boolean` | `[LogConfigOnStart](#LogConfigOnStart())()` |  |
	| `int` | `[LogDeadLetters](#LogDeadLetters())()` |  |
	| `boolean` | `[LogDeadLettersDuringShutdown](#LogDeadLettersDuringShutdown())()` |  |
	| `scala.concurrent.duration.Duration` | `[LogDeadLettersSuspendDuration](#LogDeadLettersSuspendDuration())()` |  |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[Loggers](#Loggers())()` |  |
	| `java.lang.String` | `[LoggersDispatcher](#LoggersDispatcher())()` |  |
	| `[Timeout](../util/Timeout.html "class in akka.util")` | `[LoggerStartTimeout](#LoggerStartTimeout())()` |  |
	| `java.lang.String` | `[LoggingFilter](#LoggingFilter())()` |  |
	| `java.lang.String` | `[LogLevel](#LogLevel())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[NoSerializationVerificationNeededClassPrefix](#NoSerializationVerificationNeededClassPrefix())()` |  |
	| `java.lang.String` | `[ProviderClass](#ProviderClass())()` |  |
	| `[ProviderSelection](ProviderSelection.html "class in akka.actor")` | `[ProviderSelectionType](#ProviderSelectionType())()` |  |
	| `java.lang.String` | `[SchedulerClass](#SchedulerClass())()` |  |
	| `boolean` | `[SerializeAllCreators](#SerializeAllCreators())()` |  |
	| `boolean` | `[SerializeAllMessages](#SerializeAllMessages())()` |  |
	| `[ActorSystemSetup](setup/ActorSystemSetup.html "class in akka.actor.setup")` | `[setup](#setup())()` |  |
	| `java.lang.String` | `[StdoutLogLevel](#StdoutLogLevel())()` |  |
	| `java.lang.String` | `[SupervisorStrategyClass](#SupervisorStrategyClass())()` |  |
	| `java.lang.String` | `[toString](#toString())()` | Returns the String representation of the Config that this Settings is backed by |
	| `[Timeout](../util/Timeout.html "class in akka.util")` | `[UnstartedPushTimeout](#UnstartedPushTimeout())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Settings
		
		
		
		```
		public Settings​(java.lang.ClassLoader classLoader,
		                com.typesafe.config.Config cfg,
		                java.lang.String name,
		                [ActorSystemSetup](setup/ActorSystemSetup.html "class in akka.actor.setup") setup)
		```
		- #### Settings
		
		
		
		```
		public Settings​(java.lang.ClassLoader classLoader,
		                com.typesafe.config.Config cfg,
		                java.lang.String name)
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public final java.lang.String name()
		```
		- #### setup
		
		
		
		```
		public [ActorSystemSetup](setup/ActorSystemSetup.html "class in akka.actor.setup") setup()
		```
		- #### config
		
		
		
		```
		public final com.typesafe.config.Config config()
		```
		
		The backing Config of this ActorSystem's Settings
		 
		
		See Also:
		[The Typesafe Config Library API Documentation](https://lightbend.github.io/config/latest/api/index.html)
		- #### ConfigVersion
		
		
		
		```
		public final java.lang.String ConfigVersion()
		```
		- #### ProviderSelectionType
		
		
		
		```
		public final [ProviderSelection](ProviderSelection.html "class in akka.actor") ProviderSelectionType()
		```
		- #### ProviderClass
		
		
		
		```
		public final java.lang.String ProviderClass()
		```
		- #### HasCluster
		
		
		
		```
		public final boolean HasCluster()
		```
		- #### SupervisorStrategyClass
		
		
		
		```
		public final java.lang.String SupervisorStrategyClass()
		```
		- #### CreationTimeout
		
		
		
		```
		public final [Timeout](../util/Timeout.html "class in akka.util") CreationTimeout()
		```
		- #### UnstartedPushTimeout
		
		
		
		```
		public final [Timeout](../util/Timeout.html "class in akka.util") UnstartedPushTimeout()
		```
		- #### AllowJavaSerialization
		
		
		
		```
		public final boolean AllowJavaSerialization()
		```
		- #### EnableAdditionalSerializationBindings
		
		
		
		```
		public final boolean EnableAdditionalSerializationBindings()
		```
		
		Deprecated.
		Always enabled from Akka 2\.6\.0\. Since 2\.6\.0\.
		- #### SerializeAllMessages
		
		
		
		```
		public final boolean SerializeAllMessages()
		```
		- #### SerializeAllCreators
		
		
		
		```
		public final boolean SerializeAllCreators()
		```
		- #### NoSerializationVerificationNeededClassPrefix
		
		
		
		```
		public final scala.collection.immutable.Set<java.lang.String> NoSerializationVerificationNeededClassPrefix()
		```
		- #### LogLevel
		
		
		
		```
		public final java.lang.String LogLevel()
		```
		- #### StdoutLogLevel
		
		
		
		```
		public final java.lang.String StdoutLogLevel()
		```
		- #### Loggers
		
		
		
		```
		public final scala.collection.immutable.Seq<java.lang.String> Loggers()
		```
		- #### LoggersDispatcher
		
		
		
		```
		public final java.lang.String LoggersDispatcher()
		```
		- #### LoggingFilter
		
		
		
		```
		public final java.lang.String LoggingFilter()
		```
		- #### LoggerStartTimeout
		
		
		
		```
		public final [Timeout](../util/Timeout.html "class in akka.util") LoggerStartTimeout()
		```
		- #### LogConfigOnStart
		
		
		
		```
		public final boolean LogConfigOnStart()
		```
		- #### LogDeadLetters
		
		
		
		```
		public final int LogDeadLetters()
		```
		- #### LogDeadLettersDuringShutdown
		
		
		
		```
		public final boolean LogDeadLettersDuringShutdown()
		```
		- #### LogDeadLettersSuspendDuration
		
		
		
		```
		public final scala.concurrent.duration.Duration LogDeadLettersSuspendDuration()
		```
		- #### AddLoggingReceive
		
		
		
		```
		public final boolean AddLoggingReceive()
		```
		- #### DebugAutoReceive
		
		
		
		```
		public final boolean DebugAutoReceive()
		```
		- #### DebugLifecycle
		
		
		
		```
		public final boolean DebugLifecycle()
		```
		- #### FsmDebugEvent
		
		
		
		```
		public final boolean FsmDebugEvent()
		```
		- #### DebugEventStream
		
		
		
		```
		public final boolean DebugEventStream()
		```
		- #### DebugUnhandledMessage
		
		
		
		```
		public final boolean DebugUnhandledMessage()
		```
		- #### DebugRouterMisconfiguration
		
		
		
		```
		public final boolean DebugRouterMisconfiguration()
		```
		- #### Home
		
		
		
		```
		public final scala.Option<java.lang.String> Home()
		```
		- #### SchedulerClass
		
		
		
		```
		public final java.lang.String SchedulerClass()
		```
		- #### Daemonicity
		
		
		
		```
		public final boolean Daemonicity()
		```
		- #### JvmExitOnFatalError
		
		
		
		```
		public final boolean JvmExitOnFatalError()
		```
		- #### JvmShutdownHooks
		
		
		
		```
		public final boolean JvmShutdownHooks()
		```
		- #### FailMixedVersions
		
		
		
		```
		public final boolean FailMixedVersions()
		```
		- #### CoordinatedShutdownTerminateActorSystem
		
		
		
		```
		public final boolean CoordinatedShutdownTerminateActorSystem()
		```
		- #### CoordinatedShutdownRunByActorSystemTerminate
		
		
		
		```
		public final boolean CoordinatedShutdownRunByActorSystemTerminate()
		```
		- #### DefaultVirtualNodesFactor
		
		
		
		```
		public final int DefaultVirtualNodesFactor()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		Returns the String representation of the Config that this Settings is backed by
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ProviderSelection.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.Settings.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.Settings.html)*