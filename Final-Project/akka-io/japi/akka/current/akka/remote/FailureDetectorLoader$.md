---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:33:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/FailureDetectorLoader$.html
title: FailureDetectorLoader$
---

# FailureDetectorLoader$

## Content

Package [akka.remote](package-summary.html)
## Class FailureDetectorLoader$

- java.lang.Object
- - akka.remote.FailureDetectorLoader$

- ---

```
public class FailureDetectorLoader$
extends java.lang.Object
```

INTERNAL API
 
 Utility class to create [`FailureDetector`](FailureDetector.html "interface in akka.remote") instances reflectively.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FailureDetectorLoader$](FailureDetectorLoader$.html "class in akka.remote")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FailureDetectorLoader$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[FailureDetector](FailureDetector.html "interface in akka.remote")` | `[apply](#apply(java.lang.String,com.typesafe.config.Config,akka.actor.ActorContext))​(java.lang.String fqcn,  com.typesafe.config.Config config,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") ctx)` | Loads and instantiates a given [`FailureDetector`](FailureDetector.html "interface in akka.remote") implementation. |
	| `[FailureDetector](FailureDetector.html "interface in akka.remote")` | `[load](#load(java.lang.String,com.typesafe.config.Config,akka.actor.ActorSystem))​(java.lang.String fqcn,  com.typesafe.config.Config config,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Loads and instantiates a given [`FailureDetector`](FailureDetector.html "interface in akka.remote") implementation. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FailureDetectorLoader$](FailureDetectorLoader$.html "class in akka.remote") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FailureDetectorLoader$
		
		
		
		```
		public FailureDetectorLoader$()
		```

	- ### Method Detail
	
	
	
		- #### load
		
		
		
		```
		public [FailureDetector](FailureDetector.html "interface in akka.remote") load​(java.lang.String fqcn,
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
		public [FailureDetector](FailureDetector.html "interface in akka.remote") apply​(java.lang.String fqcn,
		                             com.typesafe.config.Config config,
		                             [ActorContext](../actor/ActorContext.html "interface in akka.actor") ctx)
		```
		
		Loads and instantiates a given [`FailureDetector`](FailureDetector.html "interface in akka.remote") implementation. The class to be loaded must have a constructor
		 that accepts a `Config` and an [`EventStream`](../event/EventStream.html "class in akka.event") parameter. Will throw ConfigurationException
		 if the implementation cannot be loaded. Use [`FailureDetectorLoader.load(java.lang.String, com.typesafe.config.Config, akka.actor.ActorSystem)`](FailureDetectorLoader.html#load(java.lang.String,com.typesafe.config.Config,akka.actor.ActorSystem)) if no implicit [`ActorContext`](../actor/ActorContext.html "interface in akka.actor") is
		 available.
		 
		
		Parameters:
		`fqcn` \- Fully qualified class name of the implementation to be loaded.
		`config` \- Configuration that will be passed to the implementation
		Returns:

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/event/EventStream.html
- https://doc.akka.io/japi/akka/current/akka/remote/FailureDetector.html
- https://doc.akka.io/japi/akka/current/akka/remote/FailureDetectorLoader$.html
- https://doc.akka.io/japi/akka/current/akka/remote/FailureDetectorLoader.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/FailureDetectorLoader$.html](https://doc.akka.io/japi/akka/current/akka/remote/FailureDetectorLoader$.html)*