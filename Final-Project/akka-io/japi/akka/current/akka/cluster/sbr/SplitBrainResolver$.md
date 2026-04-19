---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sbr/SplitBrainResolver$.html
title: SplitBrainResolver$
---

# SplitBrainResolver$

## Content

Package [akka.cluster.sbr](package-summary.html)
## Class SplitBrainResolver$

- java.lang.Object
- - akka.cluster.sbr.SplitBrainResolver$

- ---

```
public class SplitBrainResolver$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SplitBrainResolver$](SplitBrainResolver$.html "class in akka.cluster.sbr")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SplitBrainResolver$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(scala.concurrent.duration.FiniteDuration,akka.cluster.sbr.DowningStrategy))​(scala.concurrent.duration.FiniteDuration stableAfter,  akka.cluster.sbr.DowningStrategy strategy)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SplitBrainResolver$](SplitBrainResolver$.html "class in akka.cluster.sbr") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SplitBrainResolver$
		
		
		
		```
		public SplitBrainResolver$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../actor/Props.html "class in akka.actor") props​(scala.concurrent.duration.FiniteDuration stableAfter,
		                   akka.cluster.sbr.DowningStrategy strategy)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sbr/SplitBrainResolver$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sbr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sbr/SplitBrainResolver$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sbr/SplitBrainResolver$.html)*