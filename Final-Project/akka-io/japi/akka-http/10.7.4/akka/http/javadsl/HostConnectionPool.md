---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:46:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HostConnectionPool.html
title: HostConnectionPool
---

# HostConnectionPool

## Content

Package [akka.http.javadsl](package-summary.html)
## Class HostConnectionPool

- java.lang.Object
- - akka.http.javadsl.HostConnectionPool

- ---

```
public abstract class HostConnectionPool
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HostConnectionPool](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [HostConnectionPoolSetup](../impl/settings/HostConnectionPoolSetup.html "class in akka.http.impl.settings")` | `[setup](#setup())()` |  |
	| `abstract java.util.concurrent.CompletionStage<akka.Done>` | `[shutdown](#shutdown())()` | Asynchronously triggers the shutdown of the host connection pool. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HostConnectionPool
		
		
		
		```
		public HostConnectionPool()
		```

	- ### Method Detail
	
	
	
		- #### setup
		
		
		
		```
		public abstract [HostConnectionPoolSetup](../impl/settings/HostConnectionPoolSetup.html "class in akka.http.impl.settings") setup()
		```
		- #### shutdown
		
		
		
		```
		public abstract java.util.concurrent.CompletionStage<akka.Done> shutdown()
		```
		
		Asynchronously triggers the shutdown of the host connection pool.
		 
		 The produced `CompletionStage` is fulfilled when the shutdown has been completed.
		
		
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/settings/HostConnectionPoolSetup.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HostConnectionPool.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HostConnectionPool.html)*