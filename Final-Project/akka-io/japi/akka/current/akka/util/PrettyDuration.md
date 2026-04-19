---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/PrettyDuration.PrettyPrintableDuration$.html
title: PrettyDuration.PrettyPrintableDuration$
---

# PrettyDuration.PrettyPrintableDuration$

## Content

Package [akka.util](package-summary.html)
## Class PrettyDuration.PrettyPrintableDuration$

- java.lang.Object
- - akka.util.PrettyDuration.PrettyPrintableDuration$

- Enclosing class:
[PrettyDuration](PrettyDuration.html "class in akka.util")

---

```
public static class PrettyDuration.PrettyPrintableDuration$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PrettyDuration.PrettyPrintableDuration$](PrettyDuration.PrettyPrintableDuration$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PrettyPrintableDuration$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[abbreviate$extension](#abbreviate$extension(akka.util.PrettyDuration.PrettyPrintableDuration,java.util.concurrent.TimeUnit))​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this,  java.util.concurrent.TimeUnit unit)` |  |
	| `java.util.concurrent.TimeUnit` | `[chooseUnit$extension](#chooseUnit$extension(akka.util.PrettyDuration.PrettyPrintableDuration,long))​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this,  long nanos)` |  |
	| `boolean` | `[equals$extension](#equals$extension(akka.util.PrettyDuration.PrettyPrintableDuration,java.lang.Object))​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode$extension](#hashCode$extension(akka.util.PrettyDuration.PrettyPrintableDuration))​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this)` |  |
	| `int` | `[pretty$default$2$extension](#pretty$default$2$extension(akka.util.PrettyDuration.PrettyPrintableDuration))​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this)` |  |
	| `java.lang.String` | `[pretty$extension](#pretty$extension(akka.util.PrettyDuration.PrettyPrintableDuration))​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this)` |  |
	| `java.lang.String` | `[pretty$extension](#pretty$extension(akka.util.PrettyDuration.PrettyPrintableDuration,boolean,int))​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this,  boolean includeNanos,  int precision)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PrettyDuration.PrettyPrintableDuration$](PrettyDuration.PrettyPrintableDuration$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PrettyPrintableDuration$
		
		
		
		```
		public PrettyPrintableDuration$()
		```

	- ### Method Detail
	
	
	
		- #### pretty$extension
		
		
		
		```
		public final java.lang.String pretty$extension​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this)
		```
		- #### pretty$extension
		
		
		
		```
		public final java.lang.String pretty$extension​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this,
		                                               boolean includeNanos,
		                                               int precision)
		```
		- #### pretty$default$2$extension
		
		
		
		```
		public final int pretty$default$2$extension​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this)
		```
		- #### chooseUnit$extension
		
		
		
		```
		public final java.util.concurrent.TimeUnit chooseUnit$extension​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this,
		                                                                long nanos)
		```
		- #### abbreviate$extension
		
		
		
		```
		public final java.lang.String abbreviate$extension​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this,
		                                                   java.util.concurrent.TimeUnit unit)
		```
		- #### hashCode$extension
		
		
		
		```
		public final int hashCode$extension​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this)
		```
		- #### equals$extension
		
		
		
		```
		public final boolean equals$extension​([PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") $this,
		                                      java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/PrettyDuration.PrettyPrintableDuration$.html
- https://doc.akka.io/japi/akka/current/akka/util/PrettyDuration.PrettyPrintableDuration.html
- https://doc.akka.io/japi/akka/current/akka/util/PrettyDuration.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/PrettyDuration.PrettyPrintableDuration$.html](https://doc.akka.io/japi/akka/current/akka/util/PrettyDuration.PrettyPrintableDuration$.html)*