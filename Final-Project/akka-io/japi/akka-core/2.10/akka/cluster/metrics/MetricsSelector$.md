---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector$.html
title: MetricsSelector$
---

# MetricsSelector$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class MetricsSelector$

- java.lang.Object
- - akka.cluster.metrics.MetricsSelector$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class MetricsSelector$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.MetricsSelector$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MetricsSelector$](MetricsSelector$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MetricsSelector$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[fromConfig](#fromConfig(com.typesafe.config.Config,akka.actor.DynamicAccess))​(com.typesafe.config.Config config,  [DynamicAccess](../../actor/DynamicAccess.html "class in akka.actor") dynamicAccess)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MetricsSelector$](MetricsSelector$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MetricsSelector$
		
		
		
		```
		public MetricsSelector$()
		```

	- ### Method Detail
	
	
	
		- #### fromConfig
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") fromConfig​(com.typesafe.config.Config config,
		                                  [DynamicAccess](../../actor/DynamicAccess.html "class in akka.actor") dynamicAccess)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector$.html)*