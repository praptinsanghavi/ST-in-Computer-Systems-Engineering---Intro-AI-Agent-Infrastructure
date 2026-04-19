---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/PrettyDuration$.html
title: PrettyDuration$
---

# PrettyDuration$

## Content

Package [akka.util](package-summary.html)
## Class PrettyDuration$

- java.lang.Object
- - akka.util.PrettyDuration$

- ---

```
public class PrettyDuration$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PrettyDuration$](PrettyDuration$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PrettyDuration$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[format](#format(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration duration)` | JAVA API  Selects most appropriate TimeUnit for given duration and formats it accordingly, with 4 digits precision |
	| `java.lang.String` | `[format](#format(scala.concurrent.duration.Duration,boolean,int))​(scala.concurrent.duration.Duration duration,  boolean includeNanos,  int precision)` | JAVA API  Selects most appropriate TimeUnit for given duration and formats it accordingly |
	| `[PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util")` | `[PrettyPrintableDuration](#PrettyPrintableDuration(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration duration)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PrettyDuration$](PrettyDuration$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PrettyDuration$
		
		
		
		```
		public PrettyDuration$()
		```

	- ### Method Detail
	
	
	
		- #### format
		
		
		
		```
		public java.lang.String format​(scala.concurrent.duration.Duration duration)
		```
		
		JAVA API
		 Selects most appropriate TimeUnit for given duration and formats it accordingly, with 4 digits precision
		- #### format
		
		
		
		```
		public java.lang.String format​(scala.concurrent.duration.Duration duration,
		                               boolean includeNanos,
		                               int precision)
		```
		
		JAVA API
		 Selects most appropriate TimeUnit for given duration and formats it accordingly
		- #### PrettyPrintableDuration
		
		
		
		```
		public [PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") PrettyPrintableDuration​(scala.concurrent.duration.Duration duration)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/PrettyDuration$.html
- https://doc.akka.io/japi/akka/current/akka/util/PrettyDuration.PrettyPrintableDuration.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/PrettyDuration$.html](https://doc.akka.io/japi/akka/current/akka/util/PrettyDuration$.html)*