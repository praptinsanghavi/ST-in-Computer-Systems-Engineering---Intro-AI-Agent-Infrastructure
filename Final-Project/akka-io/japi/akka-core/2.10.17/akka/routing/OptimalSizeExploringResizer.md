---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:53:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/OptimalSizeExploringResizer.ResizeRecord.html
title: OptimalSizeExploringResizer.ResizeRecord
---

# OptimalSizeExploringResizer.ResizeRecord

## Content

Package [akka.routing](package-summary.html)
## Class OptimalSizeExploringResizer.ResizeRecord

- java.lang.Object
- - akka.routing.OptimalSizeExploringResizer.ResizeRecord

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[OptimalSizeExploringResizer](OptimalSizeExploringResizer.html "interface in akka.routing")

---

```
public static class OptimalSizeExploringResizer.ResizeRecord
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.OptimalSizeExploringResizer.ResizeRecord)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResizeRecord](#%3Cinit%3E(scala.Option,long,int,long))​(scala.Option<[OptimalSizeExploringResizer.UnderUtilizationStreak](OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing")> underutilizationStreak,  long messageCount,  int totalQueueLength,  long checkTime)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `long` | `[checkTime](#checkTime())()` |  |
	| `[OptimalSizeExploringResizer.ResizeRecord](OptimalSizeExploringResizer.ResizeRecord.html "class in akka.routing")` | `[copy](#copy(scala.Option,long,int,long))​(scala.Option<[OptimalSizeExploringResizer.UnderUtilizationStreak](OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing")> underutilizationStreak,  long messageCount,  int totalQueueLength,  long checkTime)` |  |
	| `scala.Option<[OptimalSizeExploringResizer.UnderUtilizationStreak](OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing")>` | `[copy$default$1](#copy$default$1())()` |  |
	| `long` | `[copy$default$2](#copy$default$2())()` |  |
	| `int` | `[copy$default$3](#copy$default$3())()` |  |
	| `long` | `[copy$default$4](#copy$default$4())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `long` | `[messageCount](#messageCount())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `int` | `[totalQueueLength](#totalQueueLength())()` |  |
	| `scala.Option<[OptimalSizeExploringResizer.UnderUtilizationStreak](OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing")>` | `[underutilizationStreak](#underutilizationStreak())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ResizeRecord
		
		
		
		```
		public ResizeRecord​(scala.Option<[OptimalSizeExploringResizer.UnderUtilizationStreak](OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing")> underutilizationStreak,
		                    long messageCount,
		                    int totalQueueLength,
		                    long checkTime)
		```

	- ### Method Detail
	
	
	
		- #### underutilizationStreak
		
		
		
		```
		public scala.Option<[OptimalSizeExploringResizer.UnderUtilizationStreak](OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing")> underutilizationStreak()
		```
		- #### messageCount
		
		
		
		```
		public long messageCount()
		```
		- #### totalQueueLength
		
		
		
		```
		public int totalQueueLength()
		```
		- #### checkTime
		
		
		
		```
		public long checkTime()
		```
		- #### copy
		
		
		
		```
		public [OptimalSizeExploringResizer.ResizeRecord](OptimalSizeExploringResizer.ResizeRecord.html "class in akka.routing") copy​(scala.Option<[OptimalSizeExploringResizer.UnderUtilizationStreak](OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing")> underutilizationStreak,
		                                                     long messageCount,
		                                                     int totalQueueLength,
		                                                     long checkTime)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.Option<[OptimalSizeExploringResizer.UnderUtilizationStreak](OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing")> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public long copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public int copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public long copy$default$4()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/OptimalSizeExploringResizer.ResizeRecord.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/OptimalSizeExploringResizer.UnderUtilizationStreak.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/OptimalSizeExploringResizer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/OptimalSizeExploringResizer.ResizeRecord.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/OptimalSizeExploringResizer.ResizeRecord.html)*