---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.html
title: ShardedDaemonProcessId
---

# ShardedDaemonProcessId

## Content

Package [akka.cluster.sharding.typed.internal](package-summary.html)
## Class ShardedDaemonProcessId

- java.lang.Object
- - akka.cluster.sharding.typed.internal.ShardedDaemonProcessId

- ---

```
public class ShardedDaemonProcessId
extends java.lang.Object
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ShardedDaemonProcessId.DecodedId](ShardedDaemonProcessId.DecodedId.html "class in akka.cluster.sharding.typed.internal")` |  |
	| `static class` | `[ShardedDaemonProcessId.DecodedId$](ShardedDaemonProcessId.DecodedId$.html "class in akka.cluster.sharding.typed.internal")` |  |
	| `static class` | `[ShardedDaemonProcessId.MessageExtractor](ShardedDaemonProcessId.MessageExtractor.html "class in akka.cluster.sharding.typed.internal")<[T](ShardedDaemonProcessId.MessageExtractor.html "type parameter in ShardedDaemonProcessId.MessageExtractor")>` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardedDaemonProcessId](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.collection.immutable.Set<java.lang.String>` | `[allShardsFor](#allShardsFor(long,int))​(long revision,  int numberOfProcesses)` |  |
	| `static [ShardedDaemonProcessId.DecodedId](ShardedDaemonProcessId.DecodedId.html "class in akka.cluster.sharding.typed.internal")` | `[decodeEntityId](#decodeEntityId(java.lang.String,int))​(java.lang.String id,  int initialNumberOfProcesses)` |  |
	| `static char` | `[Separator](#Separator())()` |  |
	| `static scala.collection.immutable.Vector<java.lang.String>` | `[sortedIdentitiesFor](#sortedIdentitiesFor(long,int))​(long revision,  int numberOfProcesses)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ShardedDaemonProcessId
		
		
		
		```
		public ShardedDaemonProcessId()
		```

	- ### Method Detail
	
	
	
		- #### Separator
		
		
		
		```
		public static char Separator()
		```
		- #### decodeEntityId
		
		
		
		```
		public static [ShardedDaemonProcessId.DecodedId](ShardedDaemonProcessId.DecodedId.html "class in akka.cluster.sharding.typed.internal") decodeEntityId​(java.lang.String id,
		                                                              int initialNumberOfProcesses)
		```
		- #### sortedIdentitiesFor
		
		
		
		```
		public static scala.collection.immutable.Vector<java.lang.String> sortedIdentitiesFor​(long revision,
		                                                                                      int numberOfProcesses)
		```
		- #### allShardsFor
		
		
		
		```
		public static scala.collection.immutable.Set<java.lang.String> allShardsFor​(long revision,
		                                                                            int numberOfProcesses)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.DecodedId$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.DecodedId.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.MessageExtractor.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.html)*