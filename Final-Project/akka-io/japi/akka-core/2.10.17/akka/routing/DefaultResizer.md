---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:53:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/DefaultResizer.html
title: DefaultResizer
---

# DefaultResizer

## Content

Package [akka.routing](package-summary.html)
## Class DefaultResizer

- java.lang.Object
- - akka.routing.DefaultResizer

- All Implemented Interfaces:
`[Resizer](Resizer.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class DefaultResizer
extends java.lang.Object
implements [Resizer](Resizer.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.DefaultResizer)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultResizer](#%3Cinit%3E(int,int))​(int lower,  int upper)` | Java API constructor for default values except bounds. |
	| `[DefaultResizer](#%3Cinit%3E(int,int,int,double,double,double,int))​(int lowerBound,  int upperBound,  int pressureThreshold,  double rampupRate,  double backoffThreshold,  double backoffRate,  int messagesPerResize)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static int` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` | Implementation of [`Resizer`](Resizer.html "interface in akka.routing") that adjust the [`Pool`](Pool.html "interface in akka.routing") based on specified  thresholds. |
	| `static int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static int` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static double` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `static double` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `static double` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `static int` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `static [DefaultResizer](DefaultResizer.html "class in akka.routing")` | `[apply](#apply(int,int,int,double,double,double,int))​(int lowerBound,  int upperBound,  int pressureThreshold,  double rampupRate,  double backoffThreshold,  double backoffRate,  int messagesPerResize)` | Implementation of [`Resizer`](Resizer.html "interface in akka.routing") that adjust the [`Pool`](Pool.html "interface in akka.routing") based on specified  thresholds. |
	| `static [DefaultResizer](DefaultResizer.html "class in akka.routing")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config resizerConfig)` |  |
	| `static int` | `[apply$default$1](#apply$default$1())()` | Implementation of [`Resizer`](Resizer.html "interface in akka.routing") that adjust the [`Pool`](Pool.html "interface in akka.routing") based on specified  thresholds. |
	| `static int` | `[apply$default$2](#apply$default$2())()` |  |
	| `static int` | `[apply$default$3](#apply$default$3())()` |  |
	| `static double` | `[apply$default$4](#apply$default$4())()` |  |
	| `static double` | `[apply$default$5](#apply$default$5())()` |  |
	| `static double` | `[apply$default$6](#apply$default$6())()` |  |
	| `static int` | `[apply$default$7](#apply$default$7())()` |  |
	| `int` | `[backoff](#backoff(int,int))​(int pressure,  int capacity)` | Computes a proposed negative (or zero) capacity delta using  the configured `backoffThreshold` and `backoffRate` |
	| `double` | `[backoffRate](#backoffRate())()` |  |
	| `double` | `[backoffThreshold](#backoffThreshold())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[capacity](#capacity(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` | Returns the overall desired change in resizer capacity. |
	| `[DefaultResizer](DefaultResizer.html "class in akka.routing")` | `[copy](#copy(int,int,int,double,double,double,int))​(int lowerBound,  int upperBound,  int pressureThreshold,  double rampupRate,  double backoffThreshold,  double backoffRate,  int messagesPerResize)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `int` | `[copy$default$2](#copy$default$2())()` |  |
	| `int` | `[copy$default$3](#copy$default$3())()` |  |
	| `double` | `[copy$default$4](#copy$default$4())()` |  |
	| `double` | `[copy$default$5](#copy$default$5())()` |  |
	| `double` | `[copy$default$6](#copy$default$6())()` |  |
	| `int` | `[copy$default$7](#copy$default$7())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[filter](#filter(int,int))​(int pressure,  int capacity)` | This method can be used to smooth the capacity delta by considering  the current pressure and current capacity. |
	| `static scala.Option<[DefaultResizer](DefaultResizer.html "class in akka.routing")>` | `[fromConfig](#fromConfig(com.typesafe.config.Config))​(com.typesafe.config.Config resizerConfig)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isTimeForResize](#isTimeForResize(long))​(long messageCounter)` | Is it time for resizing. |
	| `int` | `[lowerBound](#lowerBound())()` |  |
	| `int` | `[messagesPerResize](#messagesPerResize())()` |  |
	| `int` | `[pressure](#pressure(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` | Number of routees considered busy, or above 'pressure level'. |
	| `int` | `[pressureThreshold](#pressureThreshold())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `int` | `[rampup](#rampup(int,int))​(int pressure,  int capacity)` | Computes a proposed positive (or zero) capacity delta using  the configured `rampupRate`. |
	| `double` | `[rampupRate](#rampupRate())()` |  |
	| `int` | `[resize](#resize(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> currentRoutees)` | Decide if the capacity of the router need to be changed. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple7<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.routing.DefaultResizer))​([DefaultResizer](DefaultResizer.html "class in akka.routing") x$0)` |  |
	| `int` | `[upperBound](#upperBound())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### DefaultResizer
		
		
		
		```
		public DefaultResizer​(int lowerBound,
		                      int upperBound,
		                      int pressureThreshold,
		                      double rampupRate,
		                      double backoffThreshold,
		                      double backoffRate,
		                      int messagesPerResize)
		```
		- #### DefaultResizer
		
		
		
		```
		public DefaultResizer​(int lower,
		                      int upper)
		```
		
		Java API constructor for default values except bounds.

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public static int $lessinit$greater$default$1()
		```
		
		Implementation of [`Resizer`](Resizer.html "interface in akka.routing") that adjust the [`Pool`](Pool.html "interface in akka.routing") based on specified
		 thresholds.
		
		Parameters:
		`lowerBound` \- The fewest number of routees the router should ever have.
		`upperBound` \- The most number of routees the router should ever have. Must be greater than or equal to `lowerBound`.
		`pressureThreshold` \- Threshold to evaluate if routee is considered to be busy (under pressure).
		 Implementation depends on this value (default is 1\).
		 
			- 0: number of routees currently processing a message.
			- 1: number of routees currently processing a message has
			 some messages in mailbox.
			- \> 1: number of routees with at least the configured `pressureThreshold`
			 messages in their mailbox. Note that estimating mailbox size of
			 default UnboundedMailbox is O(N) operation.
		`rampupRate` \- Percentage to increase capacity whenever all routees are busy.
		 For example, 0\.2 would increase 20% (rounded up), i.e. if current
		 capacity is 6 it will request an increase of 2 more routees.
		`backoffThreshold` \- Minimum fraction of busy routees before backing off.
		 For example, if this is 0\.3, then we'll remove some routees only when
		 less than 30% of routees are busy, i.e. if current capacity is 10 and
		 3 are busy then the capacity is unchanged, but if 2 or less are busy
		 the capacity is decreased.
		 Use 0\.0 or negative to avoid removal of routees.
		`backoffRate` \- Fraction of routees to be removed when the resizer reaches the
		 backoffThreshold.
		 For example, 0\.1 would decrease 10% (rounded up), i.e. if current
		 capacity is 9 it will request an decrease of 1 routee.
		`messagesPerResize` \- Number of messages between resize operation.
		 Use 1 to resize before each message.
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static int $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static int $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public static double $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public static double $lessinit$greater$default$5()
		```
		- #### $lessinit$greater$default$6
		
		
		
		```
		public static double $lessinit$greater$default$6()
		```
		- #### $lessinit$greater$default$7
		
		
		
		```
		public static int $lessinit$greater$default$7()
		```
		- #### apply
		
		
		
		```
		public static [DefaultResizer](DefaultResizer.html "class in akka.routing") apply​(com.typesafe.config.Config resizerConfig)
		```
		- #### apply$default$1
		
		
		
		```
		public static int apply$default$1()
		```
		
		Implementation of [`Resizer`](Resizer.html "interface in akka.routing") that adjust the [`Pool`](Pool.html "interface in akka.routing") based on specified
		 thresholds.
		
		Parameters:
		`lowerBound` \- The fewest number of routees the router should ever have.
		`upperBound` \- The most number of routees the router should ever have. Must be greater than or equal to `lowerBound`.
		`pressureThreshold` \- Threshold to evaluate if routee is considered to be busy (under pressure).
		 Implementation depends on this value (default is 1\).
		 
			- 0: number of routees currently processing a message.
			- 1: number of routees currently processing a message has
			 some messages in mailbox.
			- \> 1: number of routees with at least the configured `pressureThreshold`
			 messages in their mailbox. Note that estimating mailbox size of
			 default UnboundedMailbox is O(N) operation.
		`rampupRate` \- Percentage to increase capacity whenever all routees are busy.
		 For example, 0\.2 would increase 20% (rounded up), i.e. if current
		 capacity is 6 it will request an increase of 2 more routees.
		`backoffThreshold` \- Minimum fraction of busy routees before backing off.
		 For example, if this is 0\.3, then we'll remove some routees only when
		 less than 30% of routees are busy, i.e. if current capacity is 10 and
		 3 are busy then the capacity is unchanged, but if 2 or less are busy
		 the capacity is decreased.
		 Use 0\.0 or negative to avoid removal of routees.
		`backoffRate` \- Fraction of routees to be removed when the resizer reaches the
		 backoffThreshold.
		 For example, 0\.1 would decrease 10% (rounded up), i.e. if current
		 capacity is 9 it will request an decrease of 1 routee.
		`messagesPerResize` \- Number of messages between resize operation.
		 Use 1 to resize before each message.
		- #### apply$default$2
		
		
		
		```
		public static int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static int apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public static double apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public static double apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public static double apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public static int apply$default$7()
		```
		- #### fromConfig
		
		
		
		```
		public static scala.Option<[DefaultResizer](DefaultResizer.html "class in akka.routing")> fromConfig​(com.typesafe.config.Config resizerConfig)
		```
		- #### apply
		
		
		
		```
		public static [DefaultResizer](DefaultResizer.html "class in akka.routing") apply​(int lowerBound,
		                                   int upperBound,
		                                   int pressureThreshold,
		                                   double rampupRate,
		                                   double backoffThreshold,
		                                   double backoffRate,
		                                   int messagesPerResize)
		```
		
		Implementation of [`Resizer`](Resizer.html "interface in akka.routing") that adjust the [`Pool`](Pool.html "interface in akka.routing") based on specified
		 thresholds.
		
		Parameters:
		`lowerBound` \- The fewest number of routees the router should ever have.
		`upperBound` \- The most number of routees the router should ever have. Must be greater than or equal to `lowerBound`.
		`pressureThreshold` \- Threshold to evaluate if routee is considered to be busy (under pressure).
		 Implementation depends on this value (default is 1\).
		 
			- 0: number of routees currently processing a message.
			- 1: number of routees currently processing a message has
			 some messages in mailbox.
			- \> 1: number of routees with at least the configured `pressureThreshold`
			 messages in their mailbox. Note that estimating mailbox size of
			 default UnboundedMailbox is O(N) operation.
		`rampupRate` \- Percentage to increase capacity whenever all routees are busy.
		 For example, 0\.2 would increase 20% (rounded up), i.e. if current
		 capacity is 6 it will request an increase of 2 more routees.
		`backoffThreshold` \- Minimum fraction of busy routees before backing off.
		 For example, if this is 0\.3, then we'll remove some routees only when
		 less than 30% of routees are busy, i.e. if current capacity is 10 and
		 3 are busy then the capacity is unchanged, but if 2 or less are busy
		 the capacity is decreased.
		 Use 0\.0 or negative to avoid removal of routees.
		`backoffRate` \- Fraction of routees to be removed when the resizer reaches the
		 backoffThreshold.
		 For example, 0\.1 would decrease 10% (rounded up), i.e. if current
		 capacity is 9 it will request an decrease of 1 routee.
		`messagesPerResize` \- Number of messages between resize operation.
		 Use 1 to resize before each message.
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple7<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​([DefaultResizer](DefaultResizer.html "class in akka.routing") x$0)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```
		- #### lowerBound
		
		
		
		```
		public int lowerBound()
		```
		- #### upperBound
		
		
		
		```
		public int upperBound()
		```
		- #### pressureThreshold
		
		
		
		```
		public int pressureThreshold()
		```
		- #### rampupRate
		
		
		
		```
		public double rampupRate()
		```
		- #### backoffThreshold
		
		
		
		```
		public double backoffThreshold()
		```
		- #### backoffRate
		
		
		
		```
		public double backoffRate()
		```
		- #### messagesPerResize
		
		
		
		```
		public int messagesPerResize()
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
		- #### capacity
		
		
		
		```
		public int capacity​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		
		Returns the overall desired change in resizer capacity. Positive value will
		 add routees to the resizer. Negative value will remove routees from the
		 resizer.
		
		Parameters:
		`routees` \- The current actor in the resizer
		Returns:
		the number of routees by which the resizer should be adjusted (positive, negative or zero)
		- #### pressure
		
		
		
		```
		public int pressure​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		
		Number of routees considered busy, or above 'pressure level'.
		 
		 Implementation depends on the value of `pressureThreshold`
		 (default is 1\).
		 
		
		
			- 0: number of routees currently processing a message.
			- 1: number of routees currently processing a message has
			 some messages in mailbox.
			- \> 1: number of routees with at least the configured `pressureThreshold`
			 messages in their mailbox. Note that estimating mailbox size of
			 default UnboundedMailbox is O(N) operation.
		
		
		Parameters:
		`routees` \- the current resizer of routees
		Returns:
		number of busy routees, between 0 and routees.size
		- #### filter
		
		
		
		```
		public int filter​(int pressure,
		                  int capacity)
		```
		
		This method can be used to smooth the capacity delta by considering
		 the current pressure and current capacity.
		 
		
		Parameters:
		`pressure` \- current number of busy routees
		`capacity` \- current number of routees
		Returns:
		proposed change in the capacity
		- #### rampup
		
		
		
		```
		public int rampup​(int pressure,
		                  int capacity)
		```
		
		Computes a proposed positive (or zero) capacity delta using
		 the configured `rampupRate`.
		
		Parameters:
		`pressure` \- the current number of busy routees
		`capacity` \- the current number of total routees
		Returns:
		proposed increase in capacity
		- #### backoff
		
		
		
		```
		public int backoff​(int pressure,
		                   int capacity)
		```
		
		Computes a proposed negative (or zero) capacity delta using
		 the configured `backoffThreshold` and `backoffRate`
		
		Parameters:
		`pressure` \- the current number of busy routees
		`capacity` \- the current number of total routees
		Returns:
		proposed decrease in capacity (as a negative number)
		- #### copy
		
		
		
		```
		public [DefaultResizer](DefaultResizer.html "class in akka.routing") copy​(int lowerBound,
		                           int upperBound,
		                           int pressureThreshold,
		                           double rampupRate,
		                           double backoffThreshold,
		                           double backoffRate,
		                           int messagesPerResize)
		```
		- #### copy$default$1
		
		
		
		```
		public int copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public int copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public int copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public double copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public double copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public double copy$default$6()
		```
		- #### copy$default$7
		
		
		
		```
		public int copy$default$7()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/DefaultResizer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Pool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/DefaultResizer.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/DefaultResizer.html)*