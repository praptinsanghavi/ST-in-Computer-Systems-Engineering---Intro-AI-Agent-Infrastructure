---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/aeron/AeronErrorLog.html
title: AeronErrorLog
---

# AeronErrorLog

## Content

Package [akka.remote.artery.aeron](package-summary.html)
## Class AeronErrorLog

- java.lang.Object
- - akka.remote.artery.aeron.AeronErrorLog

- ---

```
public class AeronErrorLog
extends java.lang.Object
```

INTERNAL API

 Application to print out errors recorded in the command\-and\-control (cnc) file is maintained
 by media driver in shared memory. This application reads the cnc file and prints the distinct
 errors. Layout of the cnc file is described in `CncFileDescriptor`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AeronErrorLog](#%3Cinit%3E(java.io.File))​(java.io.File cncFile)` | Deprecated. |
	| `[AeronErrorLog](#%3Cinit%3E(java.io.File,akka.event.LoggingAdapter))​(java.io.File cncFile,  [LoggingAdapter](../../../event/LoggingAdapter.html "interface in akka.event") log)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[close](#close())()` |  |
	| `long` | `[logErrors](#logErrors(akka.event.LoggingAdapter,long))​([LoggingAdapter](../../../event/LoggingAdapter.html "interface in akka.event") log,  long sinceTimestamp)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AeronErrorLog
		
		
		
		```
		@Deprecated
		public AeronErrorLog​(java.io.File cncFile)
		```
		
		Deprecated.
		- #### AeronErrorLog
		
		
		
		```
		public AeronErrorLog​(java.io.File cncFile,
		                     [LoggingAdapter](../../../event/LoggingAdapter.html "interface in akka.event") log)
		```

	- ### Method Detail
	
	
	
		- #### logErrors
		
		
		
		```
		public long logErrors​([LoggingAdapter](../../../event/LoggingAdapter.html "interface in akka.event") log,
		                      long sinceTimestamp)
		```
		- #### close
		
		
		
		```
		public void close()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/aeron/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/aeron/AeronErrorLog.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/aeron/AeronErrorLog.html)*