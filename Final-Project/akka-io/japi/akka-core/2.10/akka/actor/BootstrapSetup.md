---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:34:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/BootstrapSetup.html
title: BootstrapSetup
---

# BootstrapSetup

## Content

Package [akka.actor](package-summary.html)
## Class BootstrapSetup

- java.lang.Object
- - [akka.actor.setup.Setup](setup/Setup.html "class in akka.actor.setup")
	- - akka.actor.BootstrapSetup

- ---

```
public final class BootstrapSetup
extends [Setup](setup/Setup.html "class in akka.actor.setup")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BootstrapSetup](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[ProviderSelection](ProviderSelection.html "class in akka.actor")>` | `[actorRefProvider](#actorRefProvider())()` |  |
	| `static [BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[apply](#apply())()` |  |
	| `static [BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Scala API: Short for using custom config but keeping default classloader and default execution context |
	| `static [BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[apply](#apply(scala.Option,scala.Option,scala.Option))​(scala.Option<java.lang.ClassLoader> classLoader,  scala.Option<com.typesafe.config.Config> config,  scala.Option<scala.concurrent.ExecutionContext> defaultExecutionContext)` | Scala API: Create bootstrap settings needed for starting the actor system |
	| `scala.Option<java.lang.ClassLoader>` | `[classLoader](#classLoader())()` |  |
	| `scala.Option<com.typesafe.config.Config>` | `[config](#config())()` |  |
	| `static [BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[create](#create())()` | Java API: Construct a bootstrap settings with default values. |
	| `static [BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Short for using custom config but keeping default classloader and default execution context |
	| `static [BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[create](#create(java.util.Optional,java.util.Optional,java.util.Optional))​(java.util.Optional<java.lang.ClassLoader> classLoader,  java.util.Optional<com.typesafe.config.Config> config,  java.util.Optional<scala.concurrent.ExecutionContext> defaultExecutionContext)` | Java API: Create bootstrap settings needed for starting the actor system |
	| `scala.Option<scala.concurrent.ExecutionContext>` | `[defaultExecutionContext](#defaultExecutionContext())()` |  |
	| `[BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[withActorRefProvider](#withActorRefProvider(akka.actor.ProviderSelection))​([ProviderSelection](ProviderSelection.html "class in akka.actor") name)` |  |
	| `[BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[withClassloader](#withClassloader(java.lang.ClassLoader))​(java.lang.ClassLoader classLoader)` |  |
	| `[BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[withConfig](#withConfig(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `[BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[withDefaultExecutionContext](#withDefaultExecutionContext(scala.concurrent.ExecutionContext))​(scala.concurrent.ExecutionContext executionContext)` |  |
	
	
		- ### Methods inherited from class akka.actor.setup.[Setup](setup/Setup.html "class in akka.actor.setup")
		
		
		`[and](setup/Setup.html#and(akka.actor.setup.Setup))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BootstrapSetup
		
		
		
		```
		public BootstrapSetup()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [BootstrapSetup](BootstrapSetup.html "class in akka.actor") apply()
		```
		- #### apply
		
		
		
		```
		public static [BootstrapSetup](BootstrapSetup.html "class in akka.actor") apply​(scala.Option<java.lang.ClassLoader> classLoader,
		                                   scala.Option<com.typesafe.config.Config> config,
		                                   scala.Option<scala.concurrent.ExecutionContext> defaultExecutionContext)
		```
		
		Scala API: Create bootstrap settings needed for starting the actor system
		- #### apply
		
		
		
		```
		public static [BootstrapSetup](BootstrapSetup.html "class in akka.actor") apply​(com.typesafe.config.Config config)
		```
		
		Scala API: Short for using custom config but keeping default classloader and default execution context
		- #### create
		
		
		
		```
		public static [BootstrapSetup](BootstrapSetup.html "class in akka.actor") create​(java.util.Optional<java.lang.ClassLoader> classLoader,
		                                    java.util.Optional<com.typesafe.config.Config> config,
		                                    java.util.Optional<scala.concurrent.ExecutionContext> defaultExecutionContext)
		```
		
		Java API: Create bootstrap settings needed for starting the actor system
		- #### create
		
		
		
		```
		public static [BootstrapSetup](BootstrapSetup.html "class in akka.actor") create​(com.typesafe.config.Config config)
		```
		
		Java API: Short for using custom config but keeping default classloader and default execution context
		- #### create
		
		
		
		```
		public static [BootstrapSetup](BootstrapSetup.html "class in akka.actor") create()
		```
		
		Java API: Construct a bootstrap settings with default values. Note that passing that to the actor system is the
		 same as not passing any [`BootstrapSetup`](BootstrapSetup.html "class in akka.actor") at all. You can use the returned instance to derive
		 one that has other values than defaults using the various `with`\-methods.
		- #### classLoader
		
		
		
		```
		public scala.Option<java.lang.ClassLoader> classLoader()
		```
		- #### config
		
		
		
		```
		public scala.Option<com.typesafe.config.Config> config()
		```
		- #### defaultExecutionContext
		
		
		
		```
		public scala.Option<scala.concurrent.ExecutionContext> defaultExecutionContext()
		```
		- #### actorRefProvider
		
		
		
		```
		public scala.Option<[ProviderSelection](ProviderSelection.html "class in akka.actor")> actorRefProvider()
		```
		- #### withClassloader
		
		
		
		```
		public [BootstrapSetup](BootstrapSetup.html "class in akka.actor") withClassloader​(java.lang.ClassLoader classLoader)
		```
		- #### withConfig
		
		
		
		```
		public [BootstrapSetup](BootstrapSetup.html "class in akka.actor") withConfig​(com.typesafe.config.Config config)
		```
		- #### withDefaultExecutionContext
		
		
		
		```
		public [BootstrapSetup](BootstrapSetup.html "class in akka.actor") withDefaultExecutionContext​(scala.concurrent.ExecutionContext executionContext)
		```
		- #### withActorRefProvider
		
		
		
		```
		public [BootstrapSetup](BootstrapSetup.html "class in akka.actor") withActorRefProvider​([ProviderSelection](ProviderSelection.html "class in akka.actor") name)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/BootstrapSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ProviderSelection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/Setup.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/BootstrapSetup.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/BootstrapSetup.html)*