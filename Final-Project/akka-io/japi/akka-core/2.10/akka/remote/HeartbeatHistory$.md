---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:14:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/HeartbeatHistory$.html
title: HeartbeatHistory$
---

# HeartbeatHistory$

## Content

Package [akka.remote](package-summary.html)
## Class HeartbeatHistory$

- java.lang.Object
- - akka.remote.HeartbeatHistory$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class HeartbeatHistory$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.HeartbeatHistory$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HeartbeatHistory$](HeartbeatHistory$.html "class in akka.remote")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HeartbeatHistory$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.HeartbeatHistory` | `[apply](#apply(int))​(int maxSampleSize)` | Create an empty HeartbeatHistory, without any history. |
	| `akka.remote.HeartbeatHistory` | `[apply](#apply(int,scala.collection.immutable.IndexedSeq,long,long))​(int maxSampleSize,  scala.collection.immutable.IndexedSeq<java.lang.Object> intervals,  long intervalSum,  long squaredIntervalSum)` | Holds the heartbeat statistics for a specific node Address. |
	| `scala.Option<scala.Tuple4<java.lang.Object,​scala.collection.immutable.IndexedSeq<java.lang.Object>,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.remote.HeartbeatHistory))​(akka.remote.HeartbeatHistory x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HeartbeatHistory$](HeartbeatHistory$.html "class in akka.remote") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HeartbeatHistory$
		
		
		
		```
		public HeartbeatHistory$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.remote.HeartbeatHistory apply​(int maxSampleSize)
		```
		
		Create an empty HeartbeatHistory, without any history.
		 Can only be used as starting point for appending intervals.
		 The stats (mean, variance, stdDeviation) are not defined for
		 for empty HeartbeatHistory, i.e. throws ArithmeticException.
		- #### apply
		
		
		
		```
		public akka.remote.HeartbeatHistory apply​(int maxSampleSize,
		                                          scala.collection.immutable.IndexedSeq<java.lang.Object> intervals,
		                                          long intervalSum,
		                                          long squaredIntervalSum)
		```
		
		Holds the heartbeat statistics for a specific node Address.
		 It is capped by the number of samples specified in `maxSampleSize`.
		 
		 The stats (mean, variance, stdDeviation) are not defined for
		 for empty HeartbeatHistory, i.e. throws ArithmeticException.
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.Object,​scala.collection.immutable.IndexedSeq<java.lang.Object>,​java.lang.Object,​java.lang.Object>> unapply​(akka.remote.HeartbeatHistory x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/HeartbeatHistory$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/HeartbeatHistory$.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/HeartbeatHistory$.html)*