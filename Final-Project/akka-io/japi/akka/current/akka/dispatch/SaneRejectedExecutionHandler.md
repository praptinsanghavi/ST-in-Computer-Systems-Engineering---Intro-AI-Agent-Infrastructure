---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/SaneRejectedExecutionHandler.html
title: SaneRejectedExecutionHandler
---

# SaneRejectedExecutionHandler

## Content

Package [akka.dispatch](package-summary.html)
## Class SaneRejectedExecutionHandler

- java.lang.Object
- - akka.dispatch.SaneRejectedExecutionHandler

- All Implemented Interfaces:
`java.util.concurrent.RejectedExecutionHandler`

---

```
public class SaneRejectedExecutionHandler
extends java.lang.Object
implements java.util.concurrent.RejectedExecutionHandler
```

The RejectedExecutionHandler used by Akka, it improves on CallerRunsPolicy
 by throwing a RejectedExecutionException if the executor isShutdown.
 (CallerRunsPolicy silently discards the runnable in this case, which is arguably broken)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SaneRejectedExecutionHandler](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[rejectedExecution](#rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor))​(java.lang.Runnable runnable,  java.util.concurrent.ThreadPoolExecutor threadPoolExecutor)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SaneRejectedExecutionHandler
		
		
		
		```
		public SaneRejectedExecutionHandler()
		```

	- ### Method Detail
	
	
	
		- #### rejectedExecution
		
		
		
		```
		public void rejectedExecution​(java.lang.Runnable runnable,
		                              java.util.concurrent.ThreadPoolExecutor threadPoolExecutor)
		```
		
		
		Specified by:
		`rejectedExecution` in interface `java.util.concurrent.RejectedExecutionHandler`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/SaneRejectedExecutionHandler.html](https://doc.akka.io/japi/akka/current/akka/dispatch/SaneRejectedExecutionHandler.html)*