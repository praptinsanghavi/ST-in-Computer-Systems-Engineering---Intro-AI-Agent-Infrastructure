---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface$.html
title: PoolInterface$
---

# PoolInterface$

## Content

Package [akka.http.impl.engine.client](package-summary.html)
## Class PoolInterface$

- java.lang.Object
- - akka.http.impl.engine.client.PoolInterface$

- ---

```
public class PoolInterface$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PoolInterface$](PoolInterface$.html "class in akka.http.impl.engine.client")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PoolInterface$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client")` | `[apply](#apply(akka.http.impl.engine.client.PoolId,akka.actor.ActorRefFactory,akka.http.impl.engine.client.PoolMaster,akka.stream.Materializer))​([PoolId](PoolId.html "class in akka.http.impl.engine.client") poolId,  akka.actor.ActorRefFactory parent,  [PoolMaster](PoolMaster.html "class in akka.http.impl.engine.client") master,  akka.stream.Materializer fm)` |  |
	| `akka.event.LogSource<[PoolId](PoolId.html "class in akka.http.impl.engine.client")>` | `[PoolLogSource](#PoolLogSource())()` | LogSource for pool instances |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PoolInterface$](PoolInterface$.html "class in akka.http.impl.engine.client") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PoolInterface$
		
		
		
		```
		public PoolInterface$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client") apply​([PoolId](PoolId.html "class in akka.http.impl.engine.client") poolId,
		                           akka.actor.ActorRefFactory parent,
		                           [PoolMaster](PoolMaster.html "class in akka.http.impl.engine.client") master,
		                           akka.stream.Materializer fm)
		```
		- #### PoolLogSource
		
		
		
		```
		public akka.event.LogSource<[PoolId](PoolId.html "class in akka.http.impl.engine.client")> PoolLogSource()
		```
		
		LogSource for pool instances
		 
		 Using this LogSource allows us to set the log class to `PoolId` and the log source string
		 to a descriptive name that describes a particular pool instance.
		
		
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolId.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMaster.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface$.html)*