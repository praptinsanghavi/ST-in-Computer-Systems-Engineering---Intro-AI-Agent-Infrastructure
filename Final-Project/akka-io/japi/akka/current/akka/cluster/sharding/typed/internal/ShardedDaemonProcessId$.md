---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId$.html
title: ShardedDaemonProcessId$
---

# ShardedDaemonProcessId$

## Content

Package [akka.cluster.sharding.typed.internal](package-summary.html)
## Class ShardedDaemonProcessId$

- java.lang.Object
- - akka.cluster.sharding.typed.internal.ShardedDaemonProcessId$

- ---

```
public class ShardedDaemonProcessId$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardedDaemonProcessId$](ShardedDaemonProcessId$.html "class in akka.cluster.sharding.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardedDaemonProcessId$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Set<java.lang.String>` | `[allShardsFor](#allShardsFor(long,int))​(long revision,  int numberOfProcesses)` |  |
	| `[ShardedDaemonProcessId.DecodedId](ShardedDaemonProcessId.DecodedId.html "class in akka.cluster.sharding.typed.internal")` | `[decodeEntityId](#decodeEntityId(java.lang.String,int))​(java.lang.String id,  int initialNumberOfProcesses)` |  |
	| `char` | `[Separator](#Separator())()` |  |
	| `scala.collection.immutable.Vector<java.lang.String>` | `[sortedIdentitiesFor](#sortedIdentitiesFor(long,int))​(long revision,  int numberOfProcesses)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardedDaemonProcessId$](ShardedDaemonProcessId$.html "class in akka.cluster.sharding.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardedDaemonProcessId$
		
		
		
		```
		public ShardedDaemonProcessId$()
		```

	- ### Method Detail
	
	
	
		- #### Separator
		
		
		
		```
		public char Separator()
		```
		- #### decodeEntityId
		
		
		
		```
		public [ShardedDaemonProcessId.DecodedId](ShardedDaemonProcessId.DecodedId.html "class in akka.cluster.sharding.typed.internal") decodeEntityId​(java.lang.String id,
		                                                       int initialNumberOfProcesses)
		```
		- #### sortedIdentitiesFor
		
		
		
		```
		public scala.collection.immutable.Vector<java.lang.String> sortedIdentitiesFor​(long revision,
		                                                                               int numberOfProcesses)
		```
		- #### allShardsFor
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> allShardsFor​(long revision,
		                                                                     int numberOfProcesses)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.DecodedId.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId$.html)*