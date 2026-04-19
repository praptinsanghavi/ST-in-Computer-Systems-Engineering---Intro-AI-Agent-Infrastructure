---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:51:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeHub.DrainingControl.html
title: MergeHub.DrainingControl
---

# MergeHub.DrainingControl

## Content

Package [akka.stream.javadsl](package-summary.html)
## Interface MergeHub.DrainingControl

- Enclosing class:
[MergeHub](MergeHub.html "class in akka.stream.javadsl")

---

```
public static interface MergeHub.DrainingControl
```

A DrainingControl object is created during the materialization of a MergeHub and allows to initiate the draining
 and eventual completion of the Hub from the outside.
 
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[drainAndComplete](#drainAndComplete())()` | Set the operation mode of the linked MergeHub to draining. |

- - ### Method Detail
	
	
	
		- #### drainAndComplete
		
		
		
		```
		void drainAndComplete()
		```
		
		Set the operation mode of the linked MergeHub to draining. In this mode the Hub will cancel any new producer and
		 will complete as soon as all the currently connected producers complete.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeHub.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeHub.DrainingControl.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeHub.DrainingControl.html)*