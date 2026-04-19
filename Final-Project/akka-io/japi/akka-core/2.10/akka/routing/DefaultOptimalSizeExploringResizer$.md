---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultOptimalSizeExploringResizer$.html
title: DefaultOptimalSizeExploringResizer$
---

# DefaultOptimalSizeExploringResizer$

## Content

Package [akka.routing](package-summary.html)
## Class DefaultOptimalSizeExploringResizer$

- java.lang.Object
- - scala.runtime.AbstractFunction10\<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​[DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing")\>
	- - akka.routing.DefaultOptimalSizeExploringResizer$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function10<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​[DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing")>`

---

```
public class DefaultOptimalSizeExploringResizer$
extends scala.runtime.AbstractFunction10<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​[DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.DefaultOptimalSizeExploringResizer$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DefaultOptimalSizeExploringResizer$](DefaultOptimalSizeExploringResizer$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultOptimalSizeExploringResizer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `double` | `[$lessinit$greater$default$10](#$lessinit$greater$default$10())()` |  |
	| `int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `double` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `scala.concurrent.duration.Duration` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `int` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `double` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `double` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `scala.concurrent.duration.Duration` | `[$lessinit$greater$default$8](#$lessinit$greater$default$8())()` |  |
	| `double` | `[$lessinit$greater$default$9](#$lessinit$greater$default$9())()` |  |
	| `[DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing")` | `[apply](#apply(int,int,double,scala.concurrent.duration.Duration,int,double,double,scala.concurrent.duration.Duration,double,double))​(int lowerBound,  int upperBound,  double chanceOfScalingDownWhenFull,  scala.concurrent.duration.Duration actionInterval,  int numOfAdjacentSizesToConsiderDuringOptimization,  double exploreStepSize,  double downsizeRatio,  scala.concurrent.duration.Duration downsizeAfterUnderutilizedFor,  double explorationProbability,  double weightOfLatestMetric)` |  |
	| `int` | `[apply$default$1](#apply$default$1())()` |  |
	| `double` | `[apply$default$10](#apply$default$10())()` |  |
	| `int` | `[apply$default$2](#apply$default$2())()` |  |
	| `double` | `[apply$default$3](#apply$default$3())()` |  |
	| `scala.concurrent.duration.Duration` | `[apply$default$4](#apply$default$4())()` |  |
	| `int` | `[apply$default$5](#apply$default$5())()` |  |
	| `double` | `[apply$default$6](#apply$default$6())()` |  |
	| `double` | `[apply$default$7](#apply$default$7())()` |  |
	| `scala.concurrent.duration.Duration` | `[apply$default$8](#apply$default$8())()` |  |
	| `double` | `[apply$default$9](#apply$default$9())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple10<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.routing.DefaultOptimalSizeExploringResizer))​([DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction10
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function10
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DefaultOptimalSizeExploringResizer$](DefaultOptimalSizeExploringResizer$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DefaultOptimalSizeExploringResizer$
		
		
		
		```
		public DefaultOptimalSizeExploringResizer$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public int $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public int $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public double $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public scala.concurrent.duration.Duration $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public int $lessinit$greater$default$5()
		```
		- #### $lessinit$greater$default$6
		
		
		
		```
		public double $lessinit$greater$default$6()
		```
		- #### $lessinit$greater$default$7
		
		
		
		```
		public double $lessinit$greater$default$7()
		```
		- #### $lessinit$greater$default$8
		
		
		
		```
		public scala.concurrent.duration.Duration $lessinit$greater$default$8()
		```
		- #### $lessinit$greater$default$9
		
		
		
		```
		public double $lessinit$greater$default$9()
		```
		- #### $lessinit$greater$default$10
		
		
		
		```
		public double $lessinit$greater$default$10()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function10<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​[DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction10<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​[DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing") apply​(int lowerBound,
		                                                int upperBound,
		                                                double chanceOfScalingDownWhenFull,
		                                                scala.concurrent.duration.Duration actionInterval,
		                                                int numOfAdjacentSizesToConsiderDuringOptimization,
		                                                double exploreStepSize,
		                                                double downsizeRatio,
		                                                scala.concurrent.duration.Duration downsizeAfterUnderutilizedFor,
		                                                double explorationProbability,
		                                                double weightOfLatestMetric)
		```
		- #### apply$default$1
		
		
		
		```
		public int apply$default$1()
		```
		- #### apply$default$10
		
		
		
		```
		public double apply$default$10()
		```
		- #### apply$default$2
		
		
		
		```
		public int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public double apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public scala.concurrent.duration.Duration apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public int apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public double apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public double apply$default$7()
		```
		- #### apply$default$8
		
		
		
		```
		public scala.concurrent.duration.Duration apply$default$8()
		```
		- #### apply$default$9
		
		
		
		```
		public double apply$default$9()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple10<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object>> unapply​([DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultOptimalSizeExploringResizer$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultOptimalSizeExploringResizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultOptimalSizeExploringResizer$.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultOptimalSizeExploringResizer$.html)*