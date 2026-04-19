---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultResizer$.html
title: DefaultResizer$
---

# DefaultResizer$

## Content

Package [akka.routing](package-summary.html)
## Class DefaultResizer$

- java.lang.Object
- - akka.routing.DefaultResizer$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class DefaultResizer$
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.DefaultResizer$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DefaultResizer$](DefaultResizer$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultResizer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` | Implementation of [`Resizer`](Resizer.html "interface in akka.routing") that adjust the [`Pool`](Pool.html "interface in akka.routing") based on specified  thresholds. |
	| `int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `int` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `double` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `double` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `double` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `int` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `[DefaultResizer](DefaultResizer.html "class in akka.routing")` | `[apply](#apply(int,int,int,double,double,double,int))​(int lowerBound,  int upperBound,  int pressureThreshold,  double rampupRate,  double backoffThreshold,  double backoffRate,  int messagesPerResize)` | Implementation of [`Resizer`](Resizer.html "interface in akka.routing") that adjust the [`Pool`](Pool.html "interface in akka.routing") based on specified  thresholds. |
	| `[DefaultResizer](DefaultResizer.html "class in akka.routing")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config resizerConfig)` |  |
	| `int` | `[apply$default$1](#apply$default$1())()` | Implementation of [`Resizer`](Resizer.html "interface in akka.routing") that adjust the [`Pool`](Pool.html "interface in akka.routing") based on specified  thresholds. |
	| `int` | `[apply$default$2](#apply$default$2())()` |  |
	| `int` | `[apply$default$3](#apply$default$3())()` |  |
	| `double` | `[apply$default$4](#apply$default$4())()` |  |
	| `double` | `[apply$default$5](#apply$default$5())()` |  |
	| `double` | `[apply$default$6](#apply$default$6())()` |  |
	| `int` | `[apply$default$7](#apply$default$7())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.Option<[DefaultResizer](DefaultResizer.html "class in akka.routing")>` | `[fromConfig](#fromConfig(com.typesafe.config.Config))​(com.typesafe.config.Config resizerConfig)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple7<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.routing.DefaultResizer))​([DefaultResizer](DefaultResizer.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DefaultResizer$](DefaultResizer$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DefaultResizer$
		
		
		
		```
		public DefaultResizer$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public int $lessinit$greater$default$1()
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
		public int $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public int $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public double $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public double $lessinit$greater$default$5()
		```
		- #### $lessinit$greater$default$6
		
		
		
		```
		public double $lessinit$greater$default$6()
		```
		- #### $lessinit$greater$default$7
		
		
		
		```
		public int $lessinit$greater$default$7()
		```
		- #### apply
		
		
		
		```
		public [DefaultResizer](DefaultResizer.html "class in akka.routing") apply​(com.typesafe.config.Config resizerConfig)
		```
		- #### apply$default$1
		
		
		
		```
		public int apply$default$1()
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
		public int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public int apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public double apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public double apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public double apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public int apply$default$7()
		```
		- #### fromConfig
		
		
		
		```
		public scala.Option<[DefaultResizer](DefaultResizer.html "class in akka.routing")> fromConfig​(com.typesafe.config.Config resizerConfig)
		```
		- #### apply
		
		
		
		```
		public [DefaultResizer](DefaultResizer.html "class in akka.routing") apply​(int lowerBound,
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
		public scala.Option<scala.Tuple7<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​([DefaultResizer](DefaultResizer.html "class in akka.routing") x$0)
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultResizer$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultResizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Pool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultResizer$.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultResizer$.html)*