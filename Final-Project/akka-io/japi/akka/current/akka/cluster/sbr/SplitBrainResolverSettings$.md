---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sbr/SplitBrainResolverSettings$.html
title: SplitBrainResolverSettings$
---

# SplitBrainResolverSettings$

## Content

Package [akka.cluster.sbr](package-summary.html)
## Class SplitBrainResolverSettings$

- java.lang.Object
- - akka.cluster.sbr.SplitBrainResolverSettings$

- ---

```
public class SplitBrainResolverSettings$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SplitBrainResolverSettings$](SplitBrainResolverSettings$.html "class in akka.cluster.sbr")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SplitBrainResolverSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Set<java.lang.String>` | `[allStrategyNames](#allStrategyNames())()` |  |
	| `java.lang.String` | `[DownAllName](#DownAllName())()` |  |
	| `java.lang.String` | `[KeepMajorityName](#KeepMajorityName())()` |  |
	| `java.lang.String` | `[KeepOldestName](#KeepOldestName())()` |  |
	| `java.lang.String` | `[LeaseMajorityName](#LeaseMajorityName())()` |  |
	| `java.lang.String` | `[StaticQuorumName](#StaticQuorumName())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SplitBrainResolverSettings$](SplitBrainResolverSettings$.html "class in akka.cluster.sbr") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SplitBrainResolverSettings$
		
		
		
		```
		public SplitBrainResolverSettings$()
		```

	- ### Method Detail
	
	
	
		- #### KeepMajorityName
		
		
		
		```
		public final java.lang.String KeepMajorityName()
		```
		- #### LeaseMajorityName
		
		
		
		```
		public final java.lang.String LeaseMajorityName()
		```
		- #### StaticQuorumName
		
		
		
		```
		public final java.lang.String StaticQuorumName()
		```
		- #### KeepOldestName
		
		
		
		```
		public final java.lang.String KeepOldestName()
		```
		- #### DownAllName
		
		
		
		```
		public final java.lang.String DownAllName()
		```
		- #### allStrategyNames
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> allStrategyNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sbr/SplitBrainResolverSettings$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sbr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sbr/SplitBrainResolverSettings$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sbr/SplitBrainResolverSettings$.html)*