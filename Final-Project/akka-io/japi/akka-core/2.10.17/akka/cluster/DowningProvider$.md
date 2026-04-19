---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:17:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/DowningProvider$.html
title: DowningProvider$
---

# DowningProvider$

## Content

Package [akka.cluster](package-summary.html)
## Class DowningProvider$

- java.lang.Object
- - akka.cluster.DowningProvider$

- ---

```
public class DowningProvider$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DowningProvider$](DowningProvider$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DowningProvider$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DowningProvider](DowningProvider.html "class in akka.cluster")` | `[load](#load(java.lang.String,akka.actor.ActorSystem))​(java.lang.String fqcn,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DowningProvider$](DowningProvider$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DowningProvider$
		
		
		
		```
		public DowningProvider$()
		```

	- ### Method Detail
	
	
	
		- #### load
		
		
		
		```
		public [DowningProvider](DowningProvider.html "class in akka.cluster") load​(java.lang.String fqcn,
		                            [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		
		Parameters:
		`fqcn` \- Fully qualified class name of the implementation to be loaded.
		`system` \- Actor system used to load the implemntation
		Returns:
		the provider or throws a [`ConfigurationException`](../ConfigurationException.html "class in akka") if loading it fails

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/ConfigurationException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/DowningProvider$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/DowningProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/DowningProvider$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/DowningProvider$.html)*