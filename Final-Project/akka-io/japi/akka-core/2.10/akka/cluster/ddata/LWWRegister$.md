---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister$.html
title: LWWRegister$
---

# LWWRegister$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class LWWRegister$

- java.lang.Object
- - akka.cluster.ddata.LWWRegister$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class LWWRegister$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.LWWRegister$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LWWRegister$](LWWRegister$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LWWRegister$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A>` | `[apply](#apply(akka.cluster.ddata.SelfUniqueAddress,A))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  A initialValue)` |  |
	| `<A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A>` | `[apply](#apply(akka.cluster.ddata.SelfUniqueAddress,A,akka.cluster.ddata.LWWRegister.Clock))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  A initialValue,  [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> clock)` |  |
	| `<A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A>` | `[create](#create(akka.cluster.ddata.SelfUniqueAddress,A))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  A initialValue)` | Java API |
	| `<A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A>` | `[create](#create(akka.cluster.ddata.SelfUniqueAddress,A,akka.cluster.ddata.LWWRegister.Clock))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  A initialValue,  [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> clock)` | Java API |
	| `<A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A>` | `[create](#create(A,akka.cluster.ddata.SelfUniqueAddress,akka.cluster.ddata.LWWRegister.Clock))​(A initialValue,  [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> clock)` | Scala API  Creates a `LWWRegister` with implicits, given deprecated `apply` functions using Cluster constrain overloading. |
	| `<A> [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A>` | `[create$default$3](#create$default$3(A))​(A initialValue)` |  |
	| `<A> [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A>` | `[defaultClock](#defaultClock())()` | The default [`LWWRegister.Clock`](LWWRegister.Clock.html "interface in akka.cluster.ddata") is using max value of `System.currentTimeMillis()`  and `currentTimestamp + 1`. |
	| `<A> [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A>` | `[reverseClock](#reverseClock())()` | This [`LWWRegister.Clock`](LWWRegister.Clock.html "interface in akka.cluster.ddata") can be used for first\-write\-wins semantics. |
	| `<A> scala.Option<A>` | `[unapply](#unapply(akka.cluster.ddata.LWWRegister))​([LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> c)` | Extract the [`LWWRegister.value()`](LWWRegister.html#value()). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LWWRegister$](LWWRegister$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LWWRegister$
		
		
		
		```
		public LWWRegister$()
		```

	- ### Method Detail
	
	
	
		- #### defaultClock
		
		
		
		```
		public <A> [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> defaultClock()
		```
		
		The default [`LWWRegister.Clock`](LWWRegister.Clock.html "interface in akka.cluster.ddata") is using max value of `System.currentTimeMillis()`
		 and `currentTimestamp + 1`.
		- #### reverseClock
		
		
		
		```
		public <A> [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> reverseClock()
		```
		
		This [`LWWRegister.Clock`](LWWRegister.Clock.html "interface in akka.cluster.ddata") can be used for first\-write\-wins semantics. It is using min value of
		 `-System.currentTimeMillis()` and `currentTimestamp + 1`, i.e. it is counting backwards.
		- #### apply
		
		
		
		```
		public <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> apply​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                A initialValue)
		```
		- #### apply
		
		
		
		```
		public <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> apply​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                A initialValue,
		                                [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> clock)
		```
		- #### create
		
		
		
		```
		public <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> create​(A initialValue,
		                                 [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                 [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> clock)
		```
		
		Scala API
		 Creates a `LWWRegister` with implicits, given deprecated `apply` functions using Cluster constrain overloading.
		- #### create
		
		
		
		```
		public <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> create​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                 A initialValue,
		                                 [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> clock)
		```
		
		Java API
		- #### create
		
		
		
		```
		public <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> create​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                 A initialValue)
		```
		
		Java API
		- #### create$default$3
		
		
		
		```
		public <A> [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> create$default$3​(A initialValue)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<A> unapply​([LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> c)
		```
		
		Extract the [`LWWRegister.value()`](LWWRegister.html#value()).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister.Clock.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/SelfUniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister$.html)*