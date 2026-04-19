---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:17:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingRoutees$.html
title: TailChoppingRoutees$
---

# TailChoppingRoutees$

## Content

Package [akka.routing](package-summary.html)
## Class TailChoppingRoutees$

- java.lang.Object
- - akka.routing.TailChoppingRoutees$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class TailChoppingRoutees$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.TailChoppingRoutees$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TailChoppingRoutees$](TailChoppingRoutees$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TailChoppingRoutees$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.routing.TailChoppingRoutees` | `[apply](#apply(akka.actor.Scheduler,scala.collection.immutable.IndexedSeq,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.ExecutionContext))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  scala.concurrent.ExecutionContext ec)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration>>` | `[unapply](#unapply(akka.routing.TailChoppingRoutees))​(akka.routing.TailChoppingRoutees x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TailChoppingRoutees$](TailChoppingRoutees$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TailChoppingRoutees$
		
		
		
		```
		public TailChoppingRoutees$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public akka.routing.TailChoppingRoutees apply​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                              scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees,
		                                              scala.concurrent.duration.FiniteDuration within,
		                                              scala.concurrent.duration.FiniteDuration interval,
		                                              scala.concurrent.ExecutionContext ec)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration>> unapply​(akka.routing.TailChoppingRoutees x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingRoutees$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingRoutees$.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingRoutees$.html)*