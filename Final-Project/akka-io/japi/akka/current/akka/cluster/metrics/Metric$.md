---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/Metric$.html
title: Metric$
---

# Metric$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class Metric$

- java.lang.Object
- - akka.cluster.metrics.Metric$

- All Implemented Interfaces:
`[MetricNumericConverter](MetricNumericConverter.html "interface in akka.cluster.metrics")`, `java.io.Serializable`

---

```
public class Metric$
extends java.lang.Object
implements [MetricNumericConverter](MetricNumericConverter.html "interface in akka.cluster.metrics"), java.io.Serializable
```

Factory for creating valid Metric instances.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.Metric$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Metric$](Metric$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Metric$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Metric](Metric.html "class in akka.cluster.metrics")` | `[apply](#apply(java.lang.String,java.lang.Number,scala.Option))​(java.lang.String name,  java.lang.Number value,  scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")> average)` |  |
	| `scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[create](#create(java.lang.String,java.lang.Number,scala.Option))​(java.lang.String name,  java.lang.Number value,  scala.Option<java.lang.Object> decayFactor)` | Creates a new Metric instance if the value is valid, otherwise None  is returned. |
	| `scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[create](#create(java.lang.String,scala.util.Try,scala.Option))​(java.lang.String name,  scala.util.Try<java.lang.Number> value,  scala.Option<java.lang.Object> decayFactor)` | Creates a new Metric instance if the Try is successful and the value is valid,  otherwise None is returned. |
	| `scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")>` | `[createEWMA](#createEWMA(double,scala.Option))​(double value,  scala.Option<java.lang.Object> decayFactor)` |  |
	| `scala.Option<scala.Tuple3<java.lang.String,​java.lang.Number,​scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")>>>` | `[unapply](#unapply(akka.cluster.metrics.Metric))​([Metric](Metric.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.cluster.metrics.[MetricNumericConverter](MetricNumericConverter.html "interface in akka.cluster.metrics")
		
		
		`[convertNumber](MetricNumericConverter.html#convertNumber(java.lang.Object)), [defined](MetricNumericConverter.html#defined(java.lang.Number))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Metric$](Metric$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Metric$
		
		
		
		```
		public Metric$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> create​(java.lang.String name,
		                                   java.lang.Number value,
		                                   scala.Option<java.lang.Object> decayFactor)
		```
		
		Creates a new Metric instance if the value is valid, otherwise None
		 is returned. Invalid numeric values are negative and NaN/Infinite.
		- #### create
		
		
		
		```
		public scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> create​(java.lang.String name,
		                                   scala.util.Try<java.lang.Number> value,
		                                   scala.Option<java.lang.Object> decayFactor)
		```
		
		Creates a new Metric instance if the Try is successful and the value is valid,
		 otherwise None is returned. Invalid numeric values are negative and NaN/Infinite.
		- #### createEWMA
		
		
		
		```
		public scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")> createEWMA​(double value,
		                                     scala.Option<java.lang.Object> decayFactor)
		```
		- #### apply
		
		
		
		```
		public [Metric](Metric.html "class in akka.cluster.metrics") apply​(java.lang.String name,
		                    java.lang.Number value,
		                    scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")> average)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.String,​java.lang.Number,​scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")>>> unapply​([Metric](Metric.html "class in akka.cluster.metrics") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/EWMA.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/Metric$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/Metric.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricNumericConverter.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/Metric$.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/Metric$.html)*