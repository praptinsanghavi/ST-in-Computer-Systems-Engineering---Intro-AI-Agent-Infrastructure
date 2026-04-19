---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/EWMA.html
title: EWMA
---

# EWMA

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class EWMA

- java.lang.Object
- - akka.cluster.metrics.EWMA

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class EWMA
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

The exponentially weighted moving average (EWMA) approach captures short\-term
 movements in volatility for a conditional volatility forecasting model. By virtue
 of its alpha, or decay factor, this provides a statistical streaming data model
 that is exponentially biased towards newer entries.
 
 https://en.wikipedia.org/wiki/Moving\_average\#Exponential\_moving\_average
 

 An EWMA only needs the most recent forecast value to be kept, as opposed to a standard
 moving average model.
 

 param: alpha decay factor, sets how quickly the exponential weighting decays for past data compared to new data,
 see https://en.wikipedia.org/wiki/Moving\_average\#Exponential\_moving\_average
 

 param: value the current exponentially weighted moving average, e.g. Y(n \- 1\), or,
 the sampled value resulting from the previous smoothing iteration.
 This value is always used as the previous EWMA to calculate the new EWMA.
 

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.EWMA)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EWMA](#%3Cinit%3E(double,double))​(double value,  double alpha)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EWMA](EWMA.html "class in akka.cluster.metrics")` | `[$colon$plus](#$colon$plus(double))​(double xn)` | Calculates the exponentially weighted moving average for a given monitored data set. |
	| `double` | `[alpha](#alpha())()` |  |
	| `static [EWMA](EWMA.html "class in akka.cluster.metrics")` | `[apply](#apply(double,double))​(double value,  double alpha)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[EWMA](EWMA.html "class in akka.cluster.metrics")` | `[copy](#copy(double,double))​(double value,  double alpha)` |  |
	| `double` | `[copy$default$1](#copy$default$1())()` |  |
	| `double` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.metrics.EWMA))​([EWMA](EWMA.html "class in akka.cluster.metrics") x$0)` |  |
	| `double` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### EWMA
		
		
		
		```
		public EWMA​(double value,
		            double alpha)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [EWMA](EWMA.html "class in akka.cluster.metrics") apply​(double value,
		                         double alpha)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>> unapply​([EWMA](EWMA.html "class in akka.cluster.metrics") x$0)
		```
		- #### value
		
		
		
		```
		public double value()
		```
		- #### alpha
		
		
		
		```
		public double alpha()
		```
		- #### $colon$plus
		
		
		
		```
		public [EWMA](EWMA.html "class in akka.cluster.metrics") $colon$plus​(double xn)
		```
		
		Calculates the exponentially weighted moving average for a given monitored data set.
		 
		
		Parameters:
		`xn` \- the new data point
		Returns:
		a new EWMA with the updated value
		- #### copy
		
		
		
		```
		public [EWMA](EWMA.html "class in akka.cluster.metrics") copy​(double value,
		                 double alpha)
		```
		- #### copy$default$1
		
		
		
		```
		public double copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public double copy$default$2()
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
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/EWMA.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/EWMA.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/EWMA.html)*