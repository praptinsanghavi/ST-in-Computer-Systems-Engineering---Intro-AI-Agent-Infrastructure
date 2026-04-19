---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem$.html
title: ActorSystem$
---

# ActorSystem$

## Content

Package [akka.actor](package-summary.html)
## Class ActorSystem$

- java.lang.Object
- - akka.actor.ActorSystem$

- ---

```
public class ActorSystem$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorSystem$](ActorSystem$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSystem$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply())()` | Creates a new ActorSystem with the name "default",  obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,  then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader  associated with the ActorSystem class. |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply(java.lang.String))​(java.lang.String name)` | Creates a new ActorSystem with the specified name,  obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,  then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader  associated with the ActorSystem class. |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply(java.lang.String,akka.actor.BootstrapSetup))​(java.lang.String name,  [BootstrapSetup](BootstrapSetup.html "class in akka.actor") bootstrapSetup)` | Scala API: Shortcut for creating an actor system with custom bootstrap settings. |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply(java.lang.String,akka.actor.setup.ActorSystemSetup))​(java.lang.String name,  [ActorSystemSetup](setup/ActorSystemSetup.html "class in akka.actor.setup") setup)` | Scala API: Creates a new actor system with the specified name and settings  The core actor system settings are defined in [`BootstrapSetup`](BootstrapSetup.html "class in akka.actor") |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply(java.lang.String,com.typesafe.config.Config))​(java.lang.String name,  com.typesafe.config.Config config)` | Creates a new ActorSystem with the specified name, and the specified Config, then  obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,  then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader  associated with the ActorSystem class. |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply(java.lang.String,com.typesafe.config.Config,java.lang.ClassLoader))​(java.lang.String name,  com.typesafe.config.Config config,  java.lang.ClassLoader classLoader)` | Creates a new ActorSystem with the specified name, the specified Config, and specified ClassLoader |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[apply](#apply(java.lang.String,scala.Option,scala.Option,scala.Option))​(java.lang.String name,  scala.Option<com.typesafe.config.Config> config,  scala.Option<java.lang.ClassLoader> classLoader,  scala.Option<scala.concurrent.ExecutionContext> defaultExecutionContext)` | Creates a new ActorSystem with the specified name,  the specified ClassLoader if given, otherwise obtains the current ClassLoader by first inspecting the current  threads' getContextClassLoader, then tries to walk the stack to find the callers class loader, then  falls back to the ClassLoader associated with the ActorSystem class. |
	| `scala.Option<com.typesafe.config.Config>` | `[apply$default$2](#apply$default$2())()` |  |
	| `scala.Option<java.lang.ClassLoader>` | `[apply$default$3](#apply$default$3())()` |  |
	| `scala.Option<scala.concurrent.ExecutionContext>` | `[apply$default$4](#apply$default$4())()` |  |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create())()` | Creates a new ActorSystem with the name "default",  obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,  then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader  associated with the ActorSystem class. |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create(java.lang.String))​(java.lang.String name)` | Creates a new ActorSystem with the specified name,  obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,  then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader  associated with the ActorSystem class. |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create(java.lang.String,akka.actor.BootstrapSetup))​(java.lang.String name,  [BootstrapSetup](BootstrapSetup.html "class in akka.actor") bootstrapSetup)` | Java API: Shortcut for creating an actor system with custom bootstrap settings. |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create(java.lang.String,akka.actor.setup.ActorSystemSetup))​(java.lang.String name,  [ActorSystemSetup](setup/ActorSystemSetup.html "class in akka.actor.setup") setups)` | Java API: Creates a new actor system with the specified name and settings  The core actor system settings are defined in [`BootstrapSetup`](BootstrapSetup.html "class in akka.actor") |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create(java.lang.String,com.typesafe.config.Config))​(java.lang.String name,  com.typesafe.config.Config config)` | Creates a new ActorSystem with the specified name, and the specified Config, then  obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,  then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader  associated with the ActorSystem class. |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create(java.lang.String,com.typesafe.config.Config,java.lang.ClassLoader))​(java.lang.String name,  com.typesafe.config.Config config,  java.lang.ClassLoader classLoader)` | Creates a new ActorSystem with the specified name, the specified Config, and specified ClassLoader |
	| `[ActorSystem](ActorSystem.html "class in akka.actor")` | `[create](#create(java.lang.String,com.typesafe.config.Config,java.lang.ClassLoader,scala.concurrent.ExecutionContext))​(java.lang.String name,  com.typesafe.config.Config config,  java.lang.ClassLoader classLoader,  scala.concurrent.ExecutionContext defaultExecutionContext)` | Creates a new ActorSystem with the specified name, the specified Config, the specified ClassLoader,  and the specified ExecutionContext. |
	| `java.lang.String` | `[Version](#Version())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorSystem$](ActorSystem$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorSystem$
		
		
		
		```
		public ActorSystem$()
		```

	- ### Method Detail
	
	
	
		- #### Version
		
		
		
		```
		public java.lang.String Version()
		```
		- #### create
		
		
		
		```
		public [ActorSystem](ActorSystem.html "class in akka.actor") create()
		```
		
		Creates a new ActorSystem with the name "default",
		 obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,
		 then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader
		 associated with the ActorSystem class.
		 Then it loads the default reference configuration using the ClassLoader.
		- #### create
		
		
		
		```
		public [ActorSystem](ActorSystem.html "class in akka.actor") create​(java.lang.String name)
		```
		
		Creates a new ActorSystem with the specified name,
		 obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,
		 then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader
		 associated with the ActorSystem class.
		 Then it loads the default reference configuration using the ClassLoader.
		- #### create
		
		
		
		```
		public [ActorSystem](ActorSystem.html "class in akka.actor") create​(java.lang.String name,
		                          [ActorSystemSetup](setup/ActorSystemSetup.html "class in akka.actor.setup") setups)
		```
		
		Java API: Creates a new actor system with the specified name and settings
		 The core actor system settings are defined in [`BootstrapSetup`](BootstrapSetup.html "class in akka.actor")
		- #### create
		
		
		
		```
		public [ActorSystem](ActorSystem.html "class in akka.actor") create​(java.lang.String name,
		                          [BootstrapSetup](BootstrapSetup.html "class in akka.actor") bootstrapSetup)
		```
		
		Java API: Shortcut for creating an actor system with custom bootstrap settings.
		 Same behavior as calling `ActorSystem.create(name, ActorSystemSetup.create(bootstrapSettings))`
		- #### create
		
		
		
		```
		public [ActorSystem](ActorSystem.html "class in akka.actor") create​(java.lang.String name,
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
		public [ActorSystem](ActorSystem.html "class in akka.actor") create​(java.lang.String name,
		                          com.typesafe.config.Config config,
		                          java.lang.ClassLoader classLoader)
		```
		
		Creates a new ActorSystem with the specified name, the specified Config, and specified ClassLoader
		 
		
		See Also:
		[The Typesafe Config Library API Documentation](https://lightbend.github.io/config/latest/api/index.html)
		- #### create
		
		
		
		```
		public [ActorSystem](ActorSystem.html "class in akka.actor") create​(java.lang.String name,
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
		public [ActorSystem](ActorSystem.html "class in akka.actor") apply()
		```
		
		Creates a new ActorSystem with the name "default",
		 obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,
		 then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader
		 associated with the ActorSystem class.
		 Then it loads the default reference configuration using the ClassLoader.
		- #### apply
		
		
		
		```
		public [ActorSystem](ActorSystem.html "class in akka.actor") apply​(java.lang.String name)
		```
		
		Creates a new ActorSystem with the specified name,
		 obtains the current ClassLoader by first inspecting the current threads' getContextClassLoader,
		 then tries to walk the stack to find the callers class loader, then falls back to the ClassLoader
		 associated with the ActorSystem class.
		 Then it loads the default reference configuration using the ClassLoader.
		- #### apply
		
		
		
		```
		public [ActorSystem](ActorSystem.html "class in akka.actor") apply​(java.lang.String name,
		                         [ActorSystemSetup](setup/ActorSystemSetup.html "class in akka.actor.setup") setup)
		```
		
		Scala API: Creates a new actor system with the specified name and settings
		 The core actor system settings are defined in [`BootstrapSetup`](BootstrapSetup.html "class in akka.actor")
		- #### apply
		
		
		
		```
		public [ActorSystem](ActorSystem.html "class in akka.actor") apply​(java.lang.String name,
		                         [BootstrapSetup](BootstrapSetup.html "class in akka.actor") bootstrapSetup)
		```
		
		Scala API: Shortcut for creating an actor system with custom bootstrap settings.
		 Same behavior as calling `ActorSystem(name, ActorSystemSetup(bootstrapSetup))`
		- #### apply
		
		
		
		```
		public [ActorSystem](ActorSystem.html "class in akka.actor") apply​(java.lang.String name,
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
		public [ActorSystem](ActorSystem.html "class in akka.actor") apply​(java.lang.String name,
		                         com.typesafe.config.Config config,
		                         java.lang.ClassLoader classLoader)
		```
		
		Creates a new ActorSystem with the specified name, the specified Config, and specified ClassLoader
		 
		
		See Also:
		[The Typesafe Config Library API Documentation](https://lightbend.github.io/config/latest/api/index.html)
		- #### apply
		
		
		
		```
		public [ActorSystem](ActorSystem.html "class in akka.actor") apply​(java.lang.String name,
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
		public scala.Option<com.typesafe.config.Config> apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public scala.Option<java.lang.ClassLoader> apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public scala.Option<scala.concurrent.ExecutionContext> apply$default$4()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/BootstrapSetup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/setup/ActorSystemSetup.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem$.html)*