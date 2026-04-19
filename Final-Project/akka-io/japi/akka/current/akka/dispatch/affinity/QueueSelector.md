---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/affinity/QueueSelector.html
title: QueueSelector
---

# QueueSelector

## Content

Package [akka.dispatch.affinity](package-summary.html)
## Interface QueueSelector

- ---

```
public interface QueueSelector
```

A `QueueSelector` is responsible for, given a `Runnable` and the number of available
 queues, return which of the queues that `Runnable` should be placed in.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `int` | `[getQueue](#getQueue(java.lang.Runnable,int))​(java.lang.Runnable command,  int queues)` | Must be deterministic—return the same value for the same input. |

- - ### Method Detail
	
	
	
		- #### getQueue
		
		
		
		```
		int getQueue​(java.lang.Runnable command,
		             int queues)
		```
		
		Must be deterministic—return the same value for the same input.
		
		Returns:
		given a `Runnable` a number between 0 .. `queues` (exclusive)
		Throws:
		`java.lang.NullPointerException` \- when `command` is `null`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/affinity/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/affinity/QueueSelector.html](https://doc.akka.io/japi/akka/current/akka/dispatch/affinity/QueueSelector.html)*