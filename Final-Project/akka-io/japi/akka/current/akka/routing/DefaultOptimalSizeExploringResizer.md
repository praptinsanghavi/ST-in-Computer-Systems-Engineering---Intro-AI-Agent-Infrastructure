---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/DefaultOptimalSizeExploringResizer.html
title: DefaultOptimalSizeExploringResizer
---

# DefaultOptimalSizeExploringResizer

## Content

Package [akka.routing](package-summary.html)
## Class DefaultOptimalSizeExploringResizer

- java.lang.Object
- - akka.routing.DefaultOptimalSizeExploringResizer

- All Implemented Interfaces:
`[OptimalSizeExploringResizer](OptimalSizeExploringResizer.html "interface in akka.routing")`, `[Resizer](Resizer.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class DefaultOptimalSizeExploringResizer
extends java.lang.Object
implements [OptimalSizeExploringResizer](OptimalSizeExploringResizer.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

This resizer resizes the pool to an optimal size that provides
 the most message throughput.
 
 This resizer works best when you expect the pool size to
 performance function to be a convex function.
 

 For example, when you have a CPU bound tasks, the optimal
 size is bound to the number of CPU cores.
 When your task is IO bound, the optimal size is bound to
 optimal number of concurrent connections to that IO service \-
 e.g. a 4 node elastic search cluster may handle 4\-8
 concurrent requests at optimal speed.
 

 It achieves this by keeping track of message throughput at
 each pool size and performing the following three
 resizing operations (one at a time) periodically:
 

 \* Downsize if it hasn't seen all routees ever fully
 utilized for a period of time.
 \* Explore to a random nearby pool size to try and
 collect throughput metrics.
 \* Optimize to a nearby pool size with a better (than any other
 nearby sizes) throughput metrics.
 

 When the pool is fully\-utilized (i.e. all routees are busy),
 it randomly choose between exploring and optimizing.
 When the pool has not been fully\-utilized for a period of time,
 it will downsize the pool to the last seen max utilization
 multiplied by a configurable ratio.
 

 By constantly exploring and optimizing, the resizer will
 eventually walk to the optimal size and remain nearby.
 When the optimal size changes it will start walking towards
 the new one.
 

 It keeps a performance log so it's stateful as well as
 having a larger memory footprint than the default [`Resizer`](Resizer.html "interface in akka.routing").
 The memory usage is O(n) where n is the number of sizes
 you allow, i.e. upperBound \- lowerBound.
 

 For documentation about the parameters, see the reference.conf \-
 akka.actor.deployment.default.optimal\-size\-exploring\-resizer
 

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.DefaultOptimalSizeExploringResizer)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.routing.[OptimalSizeExploringResizer](OptimalSizeExploringResizer.html "interface in akka.routing")
		
		
		`[OptimalSizeExploringResizer.ResizeRecord](OptimalSizeExploringResizer.ResizeRecord.html "class in akka.routing"), [OptimalSizeExploringResizer.ResizeRecord$](OptimalSizeExploringResizer.ResizeRecord$.html "class in akka.routing"), [OptimalSizeExploringResizer.UnderUtilizationStreak](OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing"), [OptimalSizeExploringResizer.UnderUtilizationStreak$](OptimalSizeExploringResizer.UnderUtilizationStreak$.html "class in akka.routing")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultOptimalSizeExploringResizer](#%3Cinit%3E(int,int,double,scala.concurrent.duration.Duration,int,double,double,scala.concurrent.duration.Duration,double,double))​(int lowerBound,  int upperBound,  double chanceOfScalingDownWhenFull,  scala.concurrent.duration.Duration actionInterval,  int numOfAdjacentSizesToConsiderDuringOptimization,  double exploreStepSize,  double downsizeRatio,  scala.concurrent.duration.Duration downsizeAfterUnderutilizedFor,  double explorationProbability,  double weightOfLatestMetric)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static int` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `static double` | `[$lessinit$greater$default$10](#$lessinit$greater$default$10())()` |  |
	| `static int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static double` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static scala.concurrent.duration.Duration` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `static int` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `static double` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `static double` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `static scala.concurrent.duration.Duration` | `[$lessinit$greater$default$8](#$lessinit$greater$default$8())()` |  |
	| `static double` | `[$lessinit$greater$default$9](#$lessinit$greater$default$9())()` |  |
	| `scala.concurrent.duration.Duration` | `[actionInterval](#actionInterval())()` |  |
	| `static [DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing")` | `[apply](#apply(int,int,double,scala.concurrent.duration.Duration,int,double,double,scala.concurrent.duration.Duration,double,double))​(int lowerBound,  int upperBound,  double chanceOfScalingDownWhenFull,  scala.concurrent.duration.Duration actionInterval,  int numOfAdjacentSizesToConsiderDuringOptimization,  double exploreStepSize,  double downsizeRatio,  scala.concurrent.duration.Duration downsizeAfterUnderutilizedFor,  double explorationProbability,  double weightOfLatestMetric)` |  |
	| `static int` | `[apply$default$1](#apply$default$1())()` |  |
	| `static double` | `[apply$default$10](#apply$default$10())()` |  |
	| `static int` | `[apply$default$2](#apply$default$2())()` |  |
	| `static double` | `[apply$default$3](#apply$default$3())()` |  |
	| `static scala.concurrent.duration.Duration` | `[apply$default$4](#apply$default$4())()` |  |
	| `static int` | `[apply$default$5](#apply$default$5())()` |  |
	| `static double` | `[apply$default$6](#apply$default$6())()` |  |
	| `static double` | `[apply$default$7](#apply$default$7())()` |  |
	| `static scala.concurrent.duration.Duration` | `[apply$default$8](#apply$default$8())()` |  |
	| `static double` | `[apply$default$9](#apply$default$9())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `double` | `[chanceOfScalingDownWhenFull](#chanceOfScalingDownWhenFull())()` |  |
	| `[DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing")` | `[copy](#copy(int,int,double,scala.concurrent.duration.Duration,int,double,double,scala.concurrent.duration.Duration,double,double))​(int lowerBound,  int upperBound,  double chanceOfScalingDownWhenFull,  scala.concurrent.duration.Duration actionInterval,  int numOfAdjacentSizesToConsiderDuringOptimization,  double exploreStepSize,  double downsizeRatio,  scala.concurrent.duration.Duration downsizeAfterUnderutilizedFor,  double explorationProbability,  double weightOfLatestMetric)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `double` | `[copy$default$10](#copy$default$10())()` |  |
	| `int` | `[copy$default$2](#copy$default$2())()` |  |
	| `double` | `[copy$default$3](#copy$default$3())()` |  |
	| `scala.concurrent.duration.Duration` | `[copy$default$4](#copy$default$4())()` |  |
	| `int` | `[copy$default$5](#copy$default$5())()` |  |
	| `double` | `[copy$default$6](#copy$default$6())()` |  |
	| `double` | `[copy$default$7](#copy$default$7())()` |  |
	| `scala.concurrent.duration.Duration` | `[copy$default$8](#copy$default$8())()` |  |
	| `double` | `[copy$default$9](#copy$default$9())()` |  |
	| `scala.concurrent.duration.Duration` | `[downsizeAfterUnderutilizedFor](#downsizeAfterUnderutilizedFor())()` |  |
	| `double` | `[downsizeRatio](#downsizeRatio())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `double` | `[explorationProbability](#explorationProbability())()` |  |
	| `double` | `[exploreStepSize](#exploreStepSize())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isTimeForResize](#isTimeForResize(long))​(long messageCounter)` | Is it time for resizing. |
	| `int` | `[lowerBound](#lowerBound())()` |  |
	| `int` | `[numOfAdjacentSizesToConsiderDuringOptimization](#numOfAdjacentSizesToConsiderDuringOptimization())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `void` | `[reportMessageCount](#reportMessageCount(scala.collection.immutable.IndexedSeq,long))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> currentRoutees,  long messageCounter)` | Report the messageCount as well as current routees so that the  it can collect metrics. |
	| `int` | `[resize](#resize(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> currentRoutees)` | Decide if the capacity of the router need to be changed. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple10<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.routing.DefaultOptimalSizeExploringResizer))​([DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing") x$0)` |  |
	| `int` | `[upperBound](#upperBound())()` |  |
	| `double` | `[weightOfLatestMetric](#weightOfLatestMetric())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### DefaultOptimalSizeExploringResizer
		
		
		
		```
		public DefaultOptimalSizeExploringResizer​(int lowerBound,
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

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public static int $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static int $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static double $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public static scala.concurrent.duration.Duration $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public static int $lessinit$greater$default$5()
		```
		- #### $lessinit$greater$default$6
		
		
		
		```
		public static double $lessinit$greater$default$6()
		```
		- #### $lessinit$greater$default$7
		
		
		
		```
		public static double $lessinit$greater$default$7()
		```
		- #### $lessinit$greater$default$8
		
		
		
		```
		public static scala.concurrent.duration.Duration $lessinit$greater$default$8()
		```
		- #### $lessinit$greater$default$9
		
		
		
		```
		public static double $lessinit$greater$default$9()
		```
		- #### $lessinit$greater$default$10
		
		
		
		```
		public static double $lessinit$greater$default$10()
		```
		- #### apply
		
		
		
		```
		public static [DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing") apply​(int lowerBound,
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
		public static int apply$default$1()
		```
		- #### apply$default$10
		
		
		
		```
		public static double apply$default$10()
		```
		- #### apply$default$2
		
		
		
		```
		public static int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static double apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public static scala.concurrent.duration.Duration apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public static int apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public static double apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public static double apply$default$7()
		```
		- #### apply$default$8
		
		
		
		```
		public static scala.concurrent.duration.Duration apply$default$8()
		```
		- #### apply$default$9
		
		
		
		```
		public static double apply$default$9()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple10<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object>> unapply​([DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing") x$0)
		```
		- #### lowerBound
		
		
		
		```
		public int lowerBound()
		```
		- #### upperBound
		
		
		
		```
		public int upperBound()
		```
		- #### chanceOfScalingDownWhenFull
		
		
		
		```
		public double chanceOfScalingDownWhenFull()
		```
		- #### actionInterval
		
		
		
		```
		public scala.concurrent.duration.Duration actionInterval()
		```
		- #### numOfAdjacentSizesToConsiderDuringOptimization
		
		
		
		```
		public int numOfAdjacentSizesToConsiderDuringOptimization()
		```
		- #### exploreStepSize
		
		
		
		```
		public double exploreStepSize()
		```
		- #### downsizeRatio
		
		
		
		```
		public double downsizeRatio()
		```
		- #### downsizeAfterUnderutilizedFor
		
		
		
		```
		public scala.concurrent.duration.Duration downsizeAfterUnderutilizedFor()
		```
		- #### explorationProbability
		
		
		
		```
		public double explorationProbability()
		```
		- #### weightOfLatestMetric
		
		
		
		```
		public double weightOfLatestMetric()
		```
		- #### isTimeForResize
		
		
		
		```
		public boolean isTimeForResize​(long messageCounter)
		```
		
		Description copied from interface: `[Resizer](Resizer.html#isTimeForResize(long))`
		Is it time for resizing. Typically implemented with modulo of nth message, but
		 could be based on elapsed time or something else. The messageCounter starts with 0
		 for the initial resize and continues with 1 for the first message. Make sure to perform
		 initial resize before first message (messageCounter \=\= 0\), because there is no guarantee
		 that resize will be done when concurrent messages are in play.
		 
		 CAUTION: this method is invoked from the thread which tries to send a
		 message to the pool, i.e. the ActorRef.!() method, hence it may be called
		 concurrently.
		
		
		
		Specified by:
		`[isTimeForResize](Resizer.html#isTimeForResize(long))` in interface `[Resizer](Resizer.html "interface in akka.routing")`
		- #### reportMessageCount
		
		
		
		```
		public void reportMessageCount​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> currentRoutees,
		                               long messageCounter)
		```
		
		Description copied from interface: `[OptimalSizeExploringResizer](OptimalSizeExploringResizer.html#reportMessageCount(scala.collection.immutable.IndexedSeq,long))`
		Report the messageCount as well as current routees so that the
		 it can collect metrics.
		 Caution: this method is not thread safe.
		 
		
		Specified by:
		`[reportMessageCount](OptimalSizeExploringResizer.html#reportMessageCount(scala.collection.immutable.IndexedSeq,long))` in interface `[OptimalSizeExploringResizer](OptimalSizeExploringResizer.html "interface in akka.routing")`
		- #### resize
		
		
		
		```
		public int resize​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> currentRoutees)
		```
		
		Description copied from interface: `[Resizer](Resizer.html#resize(scala.collection.immutable.IndexedSeq))`
		Decide if the capacity of the router need to be changed. Will be invoked when `isTimeForResize`
		 returns true and no other resize is in progress.
		 
		 Return the number of routees to add or remove. Negative value will remove that number of routees.
		 Positive value will add that number of routees. 0 will not change the routees.
		 
		
		
		 This method is invoked only in the context of the Router actor.
		
		
		
		Specified by:
		`[resize](Resizer.html#resize(scala.collection.immutable.IndexedSeq))` in interface `[Resizer](Resizer.html "interface in akka.routing")`
		- #### copy
		
		
		
		```
		public [DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing") copy​(int lowerBound,
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
		- #### copy$default$1
		
		
		
		```
		public int copy$default$1()
		```
		- #### copy$default$10
		
		
		
		```
		public double copy$default$10()
		```
		- #### copy$default$2
		
		
		
		```
		public int copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public double copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public scala.concurrent.duration.Duration copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public int copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public double copy$default$6()
		```
		- #### copy$default$7
		
		
		
		```
		public double copy$default$7()
		```
		- #### copy$default$8
		
		
		
		```
		public scala.concurrent.duration.Duration copy$default$8()
		```
		- #### copy$default$9
		
		
		
		```
		public double copy$default$9()
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

- https://doc.akka.io/japi/akka/current/akka/routing/DefaultOptimalSizeExploringResizer.html
- https://doc.akka.io/japi/akka/current/akka/routing/OptimalSizeExploringResizer.ResizeRecord$.html
- https://doc.akka.io/japi/akka/current/akka/routing/OptimalSizeExploringResizer.ResizeRecord.html
- https://doc.akka.io/japi/akka/current/akka/routing/OptimalSizeExploringResizer.UnderUtilizationStreak$.html
- https://doc.akka.io/japi/akka/current/akka/routing/OptimalSizeExploringResizer.UnderUtilizationStreak.html
- https://doc.akka.io/japi/akka/current/akka/routing/OptimalSizeExploringResizer.html
- https://doc.akka.io/japi/akka/current/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka/current/akka/routing/Routee.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/DefaultOptimalSizeExploringResizer.html](https://doc.akka.io/japi/akka/current/akka/routing/DefaultOptimalSizeExploringResizer.html)*