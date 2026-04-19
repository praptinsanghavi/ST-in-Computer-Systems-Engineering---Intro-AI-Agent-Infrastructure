---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/BootstrapSetup$.html
title: BootstrapSetup$
---

# BootstrapSetup$

## Content

Package [akka.actor](package-summary.html)
## Class BootstrapSetup$

- java.lang.Object
- - akka.actor.BootstrapSetup$

- ---

```
public class BootstrapSetup$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BootstrapSetup$](BootstrapSetup$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BootstrapSetup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[apply](#apply())()` |  |
	| `[BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Scala API: Short for using custom config but keeping default classloader and default execution context |
	| `[BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[apply](#apply(scala.Option,scala.Option,scala.Option))​(scala.Option<java.lang.ClassLoader> classLoader,  scala.Option<com.typesafe.config.Config> config,  scala.Option<scala.concurrent.ExecutionContext> defaultExecutionContext)` | Scala API: Create bootstrap settings needed for starting the actor system |
	| `[BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[create](#create())()` | Java API: Construct a bootstrap settings with default values. |
	| `[BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Short for using custom config but keeping default classloader and default execution context |
	| `[BootstrapSetup](BootstrapSetup.html "class in akka.actor")` | `[create](#create(java.util.Optional,java.util.Optional,java.util.Optional))​(java.util.Optional<java.lang.ClassLoader> classLoader,  java.util.Optional<com.typesafe.config.Config> config,  java.util.Optional<scala.concurrent.ExecutionContext> defaultExecutionContext)` | Java API: Create bootstrap settings needed for starting the actor system |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BootstrapSetup$](BootstrapSetup$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BootstrapSetup$
		
		
		
		```
		public BootstrapSetup$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [BootstrapSetup](BootstrapSetup.html "class in akka.actor") apply()
		```
		- #### apply
		
		
		
		```
		public [BootstrapSetup](BootstrapSetup.html "class in akka.actor") apply​(scala.Option<java.lang.ClassLoader> classLoader,
		                            scala.Option<com.typesafe.config.Config> config,
		                            scala.Option<scala.concurrent.ExecutionContext> defaultExecutionContext)
		```
		
		Scala API: Create bootstrap settings needed for starting the actor system
		- #### apply
		
		
		
		```
		public [BootstrapSetup](BootstrapSetup.html "class in akka.actor") apply​(com.typesafe.config.Config config)
		```
		
		Scala API: Short for using custom config but keeping default classloader and default execution context
		- #### create
		
		
		
		```
		public [BootstrapSetup](BootstrapSetup.html "class in akka.actor") create​(java.util.Optional<java.lang.ClassLoader> classLoader,
		                             java.util.Optional<com.typesafe.config.Config> config,
		                             java.util.Optional<scala.concurrent.ExecutionContext> defaultExecutionContext)
		```
		
		Java API: Create bootstrap settings needed for starting the actor system
		- #### create
		
		
		
		```
		public [BootstrapSetup](BootstrapSetup.html "class in akka.actor") create​(com.typesafe.config.Config config)
		```
		
		Java API: Short for using custom config but keeping default classloader and default execution context
		- #### create
		
		
		
		```
		public [BootstrapSetup](BootstrapSetup.html "class in akka.actor") create()
		```
		
		Java API: Construct a bootstrap settings with default values. Note that passing that to the actor system is the
		 same as not passing any [`BootstrapSetup`](BootstrapSetup.html "class in akka.actor") at all. You can use the returned instance to derive
		 one that has other values than defaults using the various `with`\-methods.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/BootstrapSetup$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/BootstrapSetup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/BootstrapSetup$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/BootstrapSetup$.html)*