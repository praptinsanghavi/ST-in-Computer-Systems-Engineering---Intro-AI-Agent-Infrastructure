---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:20:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout$.html
title: Timeout$
---

# Timeout$

## Content

Package [akka.util](package-summary.html)
## Class Timeout$

- java.lang.Object
- - akka.util.Timeout$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Timeout$
extends java.lang.Object
implements java.io.Serializable
```

A Timeout is a wrapper on top of Duration to be more specific about what the duration means.

See Also:
[Serialized Form](../../serialized-form.html#akka.util.Timeout$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Timeout$](Timeout$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Timeout$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Timeout](Timeout.html "class in akka.util")` | `[apply](#apply(long,java.util.concurrent.TimeUnit))​(long length,  java.util.concurrent.TimeUnit unit)` | Construct a Timeout from the given time unit and factor. |
	| `[Timeout](Timeout.html "class in akka.util")` | `[apply](#apply(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration duration)` |  |
	| `[Timeout](Timeout.html "class in akka.util")` | `[create](#create(java.time.Duration))​(java.time.Duration duration)` | Create a Timeout from java.time.Duration. |
	| `[Timeout](Timeout.html "class in akka.util")` | `[durationToTimeout](#durationToTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration duration)` |  |
	| `scala.Option<scala.concurrent.duration.FiniteDuration>` | `[unapply](#unapply(akka.util.Timeout))​([Timeout](Timeout.html "class in akka.util") x$0)` |  |
	| `[Timeout](Timeout.html "class in akka.util")` | `[zero](#zero())()` | A timeout with zero duration, will cause most requests to always timeout. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Timeout$](Timeout$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Timeout$
		
		
		
		```
		public Timeout$()
		```

	- ### Method Detail
	
	
	
		- #### zero
		
		
		
		```
		public [Timeout](Timeout.html "class in akka.util") zero()
		```
		
		A timeout with zero duration, will cause most requests to always timeout.
		- #### apply
		
		
		
		```
		public [Timeout](Timeout.html "class in akka.util") apply​(long length,
		                     java.util.concurrent.TimeUnit unit)
		```
		
		Construct a Timeout from the given time unit and factor.
		- #### create
		
		
		
		```
		public [Timeout](Timeout.html "class in akka.util") create​(java.time.Duration duration)
		```
		
		Create a Timeout from java.time.Duration.
		- #### durationToTimeout
		
		
		
		```
		public [Timeout](Timeout.html "class in akka.util") durationToTimeout​(scala.concurrent.duration.FiniteDuration duration)
		```
		- #### apply
		
		
		
		```
		public [Timeout](Timeout.html "class in akka.util") apply​(scala.concurrent.duration.FiniteDuration duration)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.concurrent.duration.FiniteDuration> unapply​([Timeout](Timeout.html "class in akka.util") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout$.html](https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout$.html)*