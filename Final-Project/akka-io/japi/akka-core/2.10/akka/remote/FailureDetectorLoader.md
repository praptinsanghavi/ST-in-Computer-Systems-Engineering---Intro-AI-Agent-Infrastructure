---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/FailureDetectorLoader.html
title: FailureDetectorLoader
---

# FailureDetectorLoader

## Content

Package [akka.remote](package-summary.html)
## Class FailureDetectorLoader

- java.lang.Object
- - akka.remote.FailureDetectorLoader

- ---

```
public class FailureDetectorLoader
extends java.lang.Object
```

INTERNAL API
 
 Utility class to create [`FailureDetector`](FailureDetector.html "interface in akka.remote") instances reflectively.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FailureDetectorLoader](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [FailureDetector](FailureDetector.html "interface in akka.remote")` | `[apply](#apply(java.lang.String,com.typesafe.config.Config,akka.actor.ActorContext))​(java.lang.String fqcn,  com.typesafe.config.Config config,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") ctx)` | Loads and instantiates a given [`FailureDetector`](FailureDetector.html "interface in akka.remote") implementation. |
	| `static [FailureDetector](FailureDetector.html "interface in akka.remote")` | `[load](#load(java.lang.String,com.typesafe.config.Config,akka.actor.ActorSystem))​(java.lang.String fqcn,  com.typesafe.config.Config config,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Loads and instantiates a given [`FailureDetector`](FailureDetector.html "interface in akka.remote") implementation. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FailureDetectorLoader
		
		
		
		```
		public FailureDetectorLoader()
		```

	- ### Method Detail
	
	
	
		- #### load
		
		
		
		```
		public static [FailureDetector](FailureDetector.html "interface in akka.remote") load​(java.lang.String fqcn,
		                                   com.typesafe.config.Config config,
		                                   [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Loads and instantiates a given [`FailureDetector`](FailureDetector.html "interface in akka.remote") implementation. The class to be loaded must have a constructor
		 that accepts a `Config` and an [`EventStream`](../event/EventStream.html "class in akka.event") parameter. Will throw ConfigurationException
		 if the implementation cannot be loaded.
		 
		
		Parameters:
		`fqcn` \- Fully qualified class name of the implementation to be loaded.
		`config` \- Configuration that will be passed to the implementation
		`system` \- ActorSystem to be used for loading the implementation
		Returns:
		A configured instance of the given [`FailureDetector`](FailureDetector.html "interface in akka.remote") implementation
		- #### apply
		
		
		
		```
		public static [FailureDetector](FailureDetector.html "interface in akka.remote") apply​(java.lang.String fqcn,
		                                    com.typesafe.config.Config config,
		                                    [ActorContext](../actor/ActorContext.html "interface in akka.actor") ctx)
		```
		
		Loads and instantiates a given [`FailureDetector`](FailureDetector.html "interface in akka.remote") implementation. The class to be loaded must have a constructor
		 that accepts a `Config` and an [`EventStream`](../event/EventStream.html "class in akka.event") parameter. Will throw ConfigurationException
		 if the implementation cannot be loaded. Use [`load(java.lang.String, com.typesafe.config.Config, akka.actor.ActorSystem)`](#load(java.lang.String,com.typesafe.config.Config,akka.actor.ActorSystem)) if no implicit [`ActorContext`](../actor/ActorContext.html "interface in akka.actor") is
		 available.
		 
		
		Parameters:
		`fqcn` \- Fully qualified class name of the implementation to be loaded.
		`config` \- Configuration that will be passed to the implementation
		Returns:

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/FailureDetector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/FailureDetectorLoader.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/FailureDetectorLoader.html)*