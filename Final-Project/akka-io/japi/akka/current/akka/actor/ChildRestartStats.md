---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/ChildRestartStats.html
title: ChildRestartStats
---

# ChildRestartStats

## Content

Package [akka.actor](package-summary.html)
## Class ChildRestartStats

- java.lang.Object
- - akka.actor.ChildRestartStats

- All Implemented Interfaces:
`[ChildStats](ChildStats.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ChildRestartStats
extends java.lang.Object
implements [ChildStats](ChildStats.html "interface in akka.actor"), scala.Product, java.io.Serializable
```

ChildRestartStats is the statistics kept by every parent Actor for every child Actor
 and is used for SupervisorStrategies to know how to deal with problems that occur for the children.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ChildRestartStats)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ChildRestartStats](#%3Cinit%3E(akka.actor.ActorRef,int,long))​([ActorRef](ActorRef.html "class in akka.actor") child,  int maxNrOfRetriesCount,  long restartTimeWindowStartNanos)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static long` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static [ChildRestartStats](ChildRestartStats.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorRef,int,long))​([ActorRef](ActorRef.html "class in akka.actor") child,  int maxNrOfRetriesCount,  long restartTimeWindowStartNanos)` |  |
	| `static int` | `[apply$default$2](#apply$default$2())()` |  |
	| `static long` | `[apply$default$3](#apply$default$3())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[child](#child())()` |  |
	| `[ChildRestartStats](ChildRestartStats.html "class in akka.actor")` | `[copy](#copy(akka.actor.ActorRef,int,long))​([ActorRef](ActorRef.html "class in akka.actor") child,  int maxNrOfRetriesCount,  long restartTimeWindowStartNanos)` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `int` | `[copy$default$2](#copy$default$2())()` |  |
	| `long` | `[copy$default$3](#copy$default$3())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[maxNrOfRetriesCount](#maxNrOfRetriesCount())()` |  |
	| `void` | `[maxNrOfRetriesCount_$eq](#maxNrOfRetriesCount_$eq(int))​(int x$1)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `boolean` | `[requestRestartPermission](#requestRestartPermission(scala.Tuple2))​(scala.Tuple2<scala.Option<java.lang.Object>,​scala.Option<java.lang.Object>> retriesWindow)` |  |
	| `long` | `[restartTimeWindowStartNanos](#restartTimeWindowStartNanos())()` |  |
	| `void` | `[restartTimeWindowStartNanos_$eq](#restartTimeWindowStartNanos_$eq(long))​(long x$1)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `int` | `[uid](#uid())()` |  |
	| `static scala.Option<scala.Tuple3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.actor.ChildRestartStats))​([ChildRestartStats](ChildRestartStats.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ChildRestartStats
		
		
		
		```
		public ChildRestartStats​([ActorRef](ActorRef.html "class in akka.actor") child,
		                         int maxNrOfRetriesCount,
		                         long restartTimeWindowStartNanos)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static int $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static long $lessinit$greater$default$3()
		```
		- #### apply
		
		
		
		```
		public static [ChildRestartStats](ChildRestartStats.html "class in akka.actor") apply​([ActorRef](ActorRef.html "class in akka.actor") child,
		                                      int maxNrOfRetriesCount,
		                                      long restartTimeWindowStartNanos)
		```
		- #### apply$default$2
		
		
		
		```
		public static int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static long apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object>> unapply​([ChildRestartStats](ChildRestartStats.html "class in akka.actor") x$0)
		```
		- #### child
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") child()
		```
		- #### maxNrOfRetriesCount
		
		
		
		```
		public int maxNrOfRetriesCount()
		```
		- #### maxNrOfRetriesCount\_$eq
		
		
		
		```
		public void maxNrOfRetriesCount_$eq​(int x$1)
		```
		- #### restartTimeWindowStartNanos
		
		
		
		```
		public long restartTimeWindowStartNanos()
		```
		- #### restartTimeWindowStartNanos\_$eq
		
		
		
		```
		public void restartTimeWindowStartNanos_$eq​(long x$1)
		```
		- #### uid
		
		
		
		```
		public int uid()
		```
		- #### requestRestartPermission
		
		
		
		```
		public boolean requestRestartPermission​(scala.Tuple2<scala.Option<java.lang.Object>,​scala.Option<java.lang.Object>> retriesWindow)
		```
		- #### copy
		
		
		
		```
		public [ChildRestartStats](ChildRestartStats.html "class in akka.actor") copy​([ActorRef](ActorRef.html "class in akka.actor") child,
		                              int maxNrOfRetriesCount,
		                              long restartTimeWindowStartNanos)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public int copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public long copy$default$3()
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

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ChildRestartStats.html
- https://doc.akka.io/japi/akka/current/akka/actor/ChildStats.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/ChildRestartStats.html](https://doc.akka.io/japi/akka/current/akka/actor/ChildRestartStats.html)*