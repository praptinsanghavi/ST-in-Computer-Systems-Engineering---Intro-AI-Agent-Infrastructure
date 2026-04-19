---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:44:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorExt.Settings.html
title: TestConductorExt.Settings
---

# TestConductorExt.Settings

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class TestConductorExt.Settings

- java.lang.Object
- - akka.remote.testconductor.TestConductorExt.Settings

- Enclosing class:
[TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")

---

```
public class TestConductorExt.Settings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Settings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Timeout](../../util/Timeout.html "class in akka.util")` | `[BarrierTimeout](#BarrierTimeout())()` |  |
	| `static int` | `[ClientReconnects](#ClientReconnects())()` |  |
	| `static int` | `[ClientSocketWorkerPoolSize](#ClientSocketWorkerPoolSize())()` |  |
	| `static com.typesafe.config.Config` | `[config](#config())()` |  |
	| `static scala.concurrent.duration.FiniteDuration` | `[ConnectTimeout](#ConnectTimeout())()` |  |
	| `static scala.concurrent.duration.FiniteDuration` | `[PacketSplitThreshold](#PacketSplitThreshold())()` |  |
	| `static [Timeout](../../util/Timeout.html "class in akka.util")` | `[QueryTimeout](#QueryTimeout())()` |  |
	| `static scala.concurrent.duration.FiniteDuration` | `[ReconnectBackoff](#ReconnectBackoff())()` |  |
	| `static int` | `[ServerSocketWorkerPoolSize](#ServerSocketWorkerPoolSize())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Settings
		
		
		
		```
		public Settings()
		```

	- ### Method Detail
	
	
	
		- #### config
		
		
		
		```
		public static com.typesafe.config.Config config()
		```
		- #### ConnectTimeout
		
		
		
		```
		public static scala.concurrent.duration.FiniteDuration ConnectTimeout()
		```
		- #### ClientReconnects
		
		
		
		```
		public static int ClientReconnects()
		```
		- #### ReconnectBackoff
		
		
		
		```
		public static scala.concurrent.duration.FiniteDuration ReconnectBackoff()
		```
		- #### BarrierTimeout
		
		
		
		```
		public static [Timeout](../../util/Timeout.html "class in akka.util") BarrierTimeout()
		```
		- #### QueryTimeout
		
		
		
		```
		public static [Timeout](../../util/Timeout.html "class in akka.util") QueryTimeout()
		```
		- #### PacketSplitThreshold
		
		
		
		```
		public static scala.concurrent.duration.FiniteDuration PacketSplitThreshold()
		```
		- #### ServerSocketWorkerPoolSize
		
		
		
		```
		public static int ServerSocketWorkerPoolSize()
		```
		- #### ClientSocketWorkerPoolSize
		
		
		
		```
		public static int ClientSocketWorkerPoolSize()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorExt.Settings.html](https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorExt.Settings.html)*