---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/EWMA$.html
title: EWMA$
---

# EWMA$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class EWMA$

- java.lang.Object
- - akka.cluster.metrics.EWMA$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class EWMA$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.EWMA$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EWMA$](EWMA$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EWMA$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `double` | `[alpha](#alpha(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration halfLife,  scala.concurrent.duration.FiniteDuration collectInterval)` | Calculate the alpha (decay factor) used in `akka.cluster.EWMA`  from specified half\-life and interval between observations. |
	| `[EWMA](EWMA.html "class in akka.cluster.metrics")` | `[apply](#apply(double,double))​(double value,  double alpha)` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.metrics.EWMA))​([EWMA](EWMA.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EWMA$](EWMA$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EWMA$
		
		
		
		```
		public EWMA$()
		```

	- ### Method Detail
	
	
	
		- #### alpha
		
		
		
		```
		public double alpha​(scala.concurrent.duration.FiniteDuration halfLife,
		                    scala.concurrent.duration.FiniteDuration collectInterval)
		```
		
		Calculate the alpha (decay factor) used in `akka.cluster.EWMA`
		 from specified half\-life and interval between observations.
		 Half\-life is the interval over which the weights decrease by a factor of two.
		 The relevance of each data sample is halved for every passing half\-life duration,
		 i.e. after 4 times the half\-life, a data sample\&rsquo;s relevance is reduced to 6% of
		 its original relevance. The initial relevance of a data sample is given by
		 1 – 0\.5 ^ (collect\-interval / half\-life).
		- #### apply
		
		
		
		```
		public [EWMA](EWMA.html "class in akka.cluster.metrics") apply​(double value,
		                  double alpha)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>> unapply​([EWMA](EWMA.html "class in akka.cluster.metrics") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/EWMA$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/EWMA.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/EWMA$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/EWMA$.html)*