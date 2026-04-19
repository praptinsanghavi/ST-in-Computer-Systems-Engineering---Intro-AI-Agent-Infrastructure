---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sbr/LeaseMajoritySettings$.html
title: LeaseMajoritySettings$
---

# LeaseMajoritySettings$

## Content

Package [akka.cluster.sbr](package-summary.html)
## Class LeaseMajoritySettings$

- java.lang.Object
- - scala.runtime.AbstractFunction5\<java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.Option\<java.lang.String\>,​scala.Option\<java.lang.String\>,​akka.cluster.sbr.LeaseMajoritySettings\>
	- - akka.cluster.sbr.LeaseMajoritySettings$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function5<java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​akka.cluster.sbr.LeaseMajoritySettings>`

---

```
public class LeaseMajoritySettings$
extends scala.runtime.AbstractFunction5<java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​akka.cluster.sbr.LeaseMajoritySettings>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.sbr.LeaseMajoritySettings$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LeaseMajoritySettings$](LeaseMajoritySettings$.html "class in akka.cluster.sbr")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LeaseMajoritySettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.sbr.LeaseMajoritySettings` | `[apply](#apply(java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Option,scala.Option))​(java.lang.String leaseImplementation,  scala.concurrent.duration.FiniteDuration acquireLeaseDelayForMinority,  scala.concurrent.duration.FiniteDuration releaseAfter,  scala.Option<java.lang.String> role,  scala.Option<java.lang.String> leaseName)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple5<java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>>>` | `[unapply](#unapply(akka.cluster.sbr.LeaseMajoritySettings))​(akka.cluster.sbr.LeaseMajoritySettings x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction5
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LeaseMajoritySettings$](LeaseMajoritySettings$.html "class in akka.cluster.sbr") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LeaseMajoritySettings$
		
		
		
		```
		public LeaseMajoritySettings$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function5<java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​akka.cluster.sbr.LeaseMajoritySettings>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction5<java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​akka.cluster.sbr.LeaseMajoritySettings>`
		- #### apply
		
		
		
		```
		public akka.cluster.sbr.LeaseMajoritySettings apply​(java.lang.String leaseImplementation,
		                                                    scala.concurrent.duration.FiniteDuration acquireLeaseDelayForMinority,
		                                                    scala.concurrent.duration.FiniteDuration releaseAfter,
		                                                    scala.Option<java.lang.String> role,
		                                                    scala.Option<java.lang.String> leaseName)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function5<java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​akka.cluster.sbr.LeaseMajoritySettings>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple5<java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>>> unapply​(akka.cluster.sbr.LeaseMajoritySettings x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sbr/LeaseMajoritySettings$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sbr/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sbr/LeaseMajoritySettings$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sbr/LeaseMajoritySettings$.html)*