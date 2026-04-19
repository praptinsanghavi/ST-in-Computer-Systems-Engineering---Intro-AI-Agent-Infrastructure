---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:36:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/Metric.html
title: Metric
---

# Metric

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class Metric

- java.lang.Object
- - akka.cluster.metrics.Metric

- All Implemented Interfaces:
`[MetricNumericConverter](MetricNumericConverter.html "interface in akka.cluster.metrics")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Metric
extends java.lang.Object
implements [MetricNumericConverter](MetricNumericConverter.html "interface in akka.cluster.metrics"), scala.Product, java.io.Serializable
```

Metrics key/value.
 
 Equality of Metric is based on its name.
 

 param: name the metric name
 param: value the metric value, which must be a valid numerical value,
 a valid value is neither negative nor NaN/Infinite.
 param: average the data stream of the metric value, for trending over time. Metrics that are already
 averages (e.g. system load average) or finite (e.g. as number of processors), are not trended.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.Metric)

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Metric](Metric.html "class in akka.cluster.metrics")` | `[$colon$plus](#$colon$plus(akka.cluster.metrics.Metric))​([Metric](Metric.html "class in akka.cluster.metrics") latest)` | Updates the data point, and if defined, updates the data stream (average). |
	| `static [Metric](Metric.html "class in akka.cluster.metrics")` | `[apply](#apply(java.lang.String,java.lang.Number,scala.Option))​(java.lang.String name,  java.lang.Number value,  scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")> average)` |  |
	| `scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")>` | `[average](#average())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static scala.util.Either<java.lang.Object,​java.lang.Object>` | `[convertNumber](#convertNumber(java.lang.Object))​(java.lang.Object from)` |  |
	| `[Metric](Metric.html "class in akka.cluster.metrics")` | `[copy](#copy(java.lang.String,java.lang.Number,scala.Option))​(java.lang.String name,  java.lang.Number value,  scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")> average)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.Number` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")>` | `[copy$default$3](#copy$default$3())()` |  |
	| `static scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[create](#create(java.lang.String,java.lang.Number,scala.Option))​(java.lang.String name,  java.lang.Number value,  scala.Option<java.lang.Object> decayFactor)` | Creates a new Metric instance if the value is valid, otherwise None  is returned. |
	| `static scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[create](#create(java.lang.String,scala.util.Try,scala.Option))​(java.lang.String name,  scala.util.Try<java.lang.Number> value,  scala.Option<java.lang.Object> decayFactor)` | Creates a new Metric instance if the Try is successful and the value is valid,  otherwise None is returned. |
	| `static scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")>` | `[createEWMA](#createEWMA(double,scala.Option))​(double value,  scala.Option<java.lang.Object> decayFactor)` |  |
	| `static boolean` | `[defined](#defined(java.lang.Number))​(java.lang.Number value)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isSmooth](#isSmooth())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `boolean` | `[sameAs](#sameAs(akka.cluster.metrics.Metric))​([Metric](Metric.html "class in akka.cluster.metrics") that)` | Returns true if `that` is tracking the same metric as this. |
	| `double` | `[smoothValue](#smoothValue())()` | The numerical value of the average, if defined, otherwise the latest value |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<java.lang.String,​java.lang.Number,​scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")>>>` | `[unapply](#unapply(akka.cluster.metrics.Metric))​([Metric](Metric.html "class in akka.cluster.metrics") x$0)` |  |
	| `java.lang.Number` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.cluster.metrics.[MetricNumericConverter](MetricNumericConverter.html "interface in akka.cluster.metrics")
		
		
		`[convertNumber](MetricNumericConverter.html#convertNumber(java.lang.Object)), [defined](MetricNumericConverter.html#defined(java.lang.Number))`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> create​(java.lang.String name,
		                                          java.lang.Number value,
		                                          scala.Option<java.lang.Object> decayFactor)
		```
		
		Creates a new Metric instance if the value is valid, otherwise None
		 is returned. Invalid numeric values are negative and NaN/Infinite.
		- #### create
		
		
		
		```
		public static scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> create​(java.lang.String name,
		                                          scala.util.Try<java.lang.Number> value,
		                                          scala.Option<java.lang.Object> decayFactor)
		```
		
		Creates a new Metric instance if the Try is successful and the value is valid,
		 otherwise None is returned. Invalid numeric values are negative and NaN/Infinite.
		- #### createEWMA
		
		
		
		```
		public static scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")> createEWMA​(double value,
		                                            scala.Option<java.lang.Object> decayFactor)
		```
		- #### apply
		
		
		
		```
		public static [Metric](Metric.html "class in akka.cluster.metrics") apply​(java.lang.String name,
		                           java.lang.Number value,
		                           scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")> average)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<java.lang.String,​java.lang.Number,​scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")>>> unapply​([Metric](Metric.html "class in akka.cluster.metrics") x$0)
		```
		- #### defined
		
		
		
		```
		public static boolean defined​(java.lang.Number value)
		```
		- #### convertNumber
		
		
		
		```
		public static scala.util.Either<java.lang.Object,​java.lang.Object> convertNumber​(java.lang.Object from)
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### value
		
		
		
		```
		public java.lang.Number value()
		```
		- #### average
		
		
		
		```
		public scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")> average()
		```
		- #### $colon$plus
		
		
		
		```
		public [Metric](Metric.html "class in akka.cluster.metrics") $colon$plus​([Metric](Metric.html "class in akka.cluster.metrics") latest)
		```
		
		Updates the data point, and if defined, updates the data stream (average).
		 Returns the updated metric.
		- #### smoothValue
		
		
		
		```
		public double smoothValue()
		```
		
		The numerical value of the average, if defined, otherwise the latest value
		- #### isSmooth
		
		
		
		```
		public boolean isSmooth()
		```
		
		
		Returns:
		true if this value is smoothed
		- #### sameAs
		
		
		
		```
		public boolean sameAs​([Metric](Metric.html "class in akka.cluster.metrics") that)
		```
		
		Returns true if `that` is tracking the same metric as this.
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`
		- #### copy
		
		
		
		```
		public [Metric](Metric.html "class in akka.cluster.metrics") copy​(java.lang.String name,
		                   java.lang.Number value,
		                   scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")> average)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.Number copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public scala.Option<[EWMA](EWMA.html "class in akka.cluster.metrics")> copy$default$3()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/EWMA.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/Metric.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MetricNumericConverter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/Metric.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/Metric.html)*