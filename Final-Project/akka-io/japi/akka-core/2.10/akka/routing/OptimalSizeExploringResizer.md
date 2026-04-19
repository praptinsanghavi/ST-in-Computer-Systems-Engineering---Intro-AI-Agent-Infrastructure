---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:19:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.html
title: OptimalSizeExploringResizer
---

# OptimalSizeExploringResizer

## Content

Package [akka.routing](package-summary.html)
## Interface OptimalSizeExploringResizer

- All Superinterfaces:
`[Resizer](Resizer.html "interface in akka.routing")`

All Known Implementing Classes:
`[DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing")`

---

```
public interface OptimalSizeExploringResizer
extends [Resizer](Resizer.html "interface in akka.routing")
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[OptimalSizeExploringResizer.ResizeRecord](OptimalSizeExploringResizer.ResizeRecord.html "class in akka.routing")` | INTERNAL API |
	| `static class` | `[OptimalSizeExploringResizer.ResizeRecord$](OptimalSizeExploringResizer.ResizeRecord$.html "class in akka.routing")` |  |
	| `static class` | `[OptimalSizeExploringResizer.UnderUtilizationStreak](OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing")` | INTERNAL API |
	| `static class` | `[OptimalSizeExploringResizer.UnderUtilizationStreak$](OptimalSizeExploringResizer.UnderUtilizationStreak$.html "class in akka.routing")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[reportMessageCount](#reportMessageCount(scala.collection.immutable.IndexedSeq,long))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> currentRoutees,  long messageCounter)` | Report the messageCount as well as current routees so that the  it can collect metrics. |
	
	
		- ### Methods inherited from interface akka.routing.[Resizer](Resizer.html "interface in akka.routing")
		
		
		`[isTimeForResize](Resizer.html#isTimeForResize(long)), [resize](Resizer.html#resize(scala.collection.immutable.IndexedSeq))`

- - ### Method Detail
	
	
	
		- #### reportMessageCount
		
		
		
		```
		void reportMessageCount​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> currentRoutees,
		                        long messageCounter)
		```
		
		Report the messageCount as well as current routees so that the
		 it can collect metrics.
		 Caution: this method is not thread safe.
		 
		
		Parameters:
		`currentRoutees` \- 
		`messageCounter` \-

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultOptimalSizeExploringResizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.ResizeRecord$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.ResizeRecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.UnderUtilizationStreak$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.UnderUtilizationStreak.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.html)*