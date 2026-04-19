---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:36:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/DefaultSigarProvider$.html
title: DefaultSigarProvider$
---

# DefaultSigarProvider$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class DefaultSigarProvider$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics"),​[DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics")\>
	- - akka.cluster.metrics.DefaultSigarProvider$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics"),​[DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics")>`

---

```
public class DefaultSigarProvider$
extends scala.runtime.AbstractFunction1<[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics"),​[DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.DefaultSigarProvider$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DefaultSigarProvider$](DefaultSigarProvider$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultSigarProvider$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics")` | `[apply](#apply(akka.cluster.metrics.ClusterMetricsSettings))​([ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics")>` | `[unapply](#unapply(akka.cluster.metrics.DefaultSigarProvider))​([DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DefaultSigarProvider$](DefaultSigarProvider$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DefaultSigarProvider$
		
		
		
		```
		public DefaultSigarProvider$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics"),​[DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics"),​[DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics")>`
		- #### apply
		
		
		
		```
		public [DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics") apply​([ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics"),​[DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics")> unapply​([DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/DefaultSigarProvider$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/DefaultSigarProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/DefaultSigarProvider$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/DefaultSigarProvider$.html)*