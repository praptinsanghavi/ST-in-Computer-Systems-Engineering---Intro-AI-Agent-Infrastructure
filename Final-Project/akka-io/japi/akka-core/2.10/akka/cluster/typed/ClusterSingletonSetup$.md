---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:24:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingletonSetup$.html
title: ClusterSingletonSetup$
---

# ClusterSingletonSetup$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class ClusterSingletonSetup$

- java.lang.Object
- - akka.cluster.typed.ClusterSingletonSetup$

- ---

```
public class ClusterSingletonSetup$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterSingletonSetup$](ClusterSingletonSetup$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingletonSetup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T extends [Extension](../../actor/typed/Extension.html "interface in akka.actor.typed")>[ClusterSingletonSetup](ClusterSingletonSetup.html "class in akka.cluster.typed")` | `[apply](#apply(scala.Function1))​(scala.Function1<[ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")> createExtension)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterSingletonSetup$](ClusterSingletonSetup$.html "class in akka.cluster.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterSingletonSetup$
		
		
		
		```
		public ClusterSingletonSetup$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T extends [Extension](../../actor/typed/Extension.html "interface in akka.actor.typed")> [ClusterSingletonSetup](ClusterSingletonSetup.html "class in akka.cluster.typed") apply​(scala.Function1<[ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?>,​[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")> createExtension)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingletonSetup$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingletonSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingletonSetup$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingletonSetup$.html)*