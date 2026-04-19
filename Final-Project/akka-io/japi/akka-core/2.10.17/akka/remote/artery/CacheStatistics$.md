---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:51:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/CacheStatistics$.html
title: CacheStatistics$
---

# CacheStatistics$

## Content

Package [akka.remote.artery](package-summary.html)
## Class CacheStatistics$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.remote.artery.CacheStatistics\>
	- - akka.remote.artery.CacheStatistics$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.remote.artery.CacheStatistics>`

---

```
public class CacheStatistics$
extends scala.runtime.AbstractFunction3<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.remote.artery.CacheStatistics>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.artery.CacheStatistics$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CacheStatistics$](CacheStatistics$.html "class in akka.remote.artery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CacheStatistics$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.artery.CacheStatistics` | `[apply](#apply(int,int,double))​(int entries,  int maxProbeDistance,  double averageProbeDistance)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.remote.artery.CacheStatistics))​(akka.remote.artery.CacheStatistics x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CacheStatistics$](CacheStatistics$.html "class in akka.remote.artery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CacheStatistics$
		
		
		
		```
		public CacheStatistics$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.remote.artery.CacheStatistics>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.remote.artery.CacheStatistics>`
		- #### apply
		
		
		
		```
		public akka.remote.artery.CacheStatistics apply​(int entries,
		                                                int maxProbeDistance,
		                                                double averageProbeDistance)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​(akka.remote.artery.CacheStatistics x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/CacheStatistics$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/CacheStatistics$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/CacheStatistics$.html)*