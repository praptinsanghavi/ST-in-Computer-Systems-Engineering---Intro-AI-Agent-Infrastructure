---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/ScanningClassification.html
title: ScanningClassification
---

# ScanningClassification

## Content

Package [akka.event](package-summary.html)
## Interface ScanningClassification

- ---

```
public interface ScanningClassification
```

Maps Classifiers to Subscribers and selects which Subscriber should receive which publication through scanning through all Subscribers
 through the matches(classifier, event) method
 
 Note: the compareClassifiers and compareSubscribers must together form an absolute ordering (think java.util.Comparator.compare)

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[akka$event$ScanningClassification$_setter_$subscribers_$eq](#akka$event$ScanningClassification$_setter_$subscribers_$eq(java.util.concurrent.ConcurrentSkipListSet))​(java.util.concurrent.ConcurrentSkipListSet<scala.Tuple2<java.lang.Object,​java.lang.Object>> x$1)` |  |
	| `int` | `[compareClassifiers](#compareClassifiers(akka.event.ScanningClassification,akka.event.ScanningClassification))​([ScanningClassification](ScanningClassification.html "interface in akka.event") a,  [ScanningClassification](ScanningClassification.html "interface in akka.event") b)` | Provides a total ordering of Classifiers (think java.util.Comparator.compare) |
	| `int` | `[compareSubscribers](#compareSubscribers(akka.event.ScanningClassification,akka.event.ScanningClassification))​([ScanningClassification](ScanningClassification.html "interface in akka.event") a,  [ScanningClassification](ScanningClassification.html "interface in akka.event") b)` | Provides a total ordering of Subscribers (think java.util.Comparator.compare) |
	| `boolean` | `[matches](#matches(akka.event.ScanningClassification,akka.event.ScanningClassification))​([ScanningClassification](ScanningClassification.html "interface in akka.event") classifier,  [ScanningClassification](ScanningClassification.html "interface in akka.event") event)` | Returns whether the specified Classifier matches the specified Event |
	| `void` | `[publish](#publish(akka.event.ScanningClassification))​([ScanningClassification](ScanningClassification.html "interface in akka.event") event)` |  |
	| `void` | `[publish](#publish(akka.event.ScanningClassification,akka.event.ScanningClassification))​([ScanningClassification](ScanningClassification.html "interface in akka.event") event,  [ScanningClassification](ScanningClassification.html "interface in akka.event") subscriber)` | Publishes the specified Event to the specified Subscriber |
	| `boolean` | `[subscribe](#subscribe(akka.event.ScanningClassification,akka.event.ScanningClassification))​([ScanningClassification](ScanningClassification.html "interface in akka.event") subscriber,  [ScanningClassification](ScanningClassification.html "interface in akka.event") to)` |  |
	| `java.util.concurrent.ConcurrentSkipListSet<scala.Tuple2<java.lang.Object,​java.lang.Object>>` | `[subscribers](#subscribers())()` |  |
	| `void` | `[unsubscribe](#unsubscribe(akka.event.ScanningClassification))​([ScanningClassification](ScanningClassification.html "interface in akka.event") subscriber)` |  |
	| `boolean` | `[unsubscribe](#unsubscribe(akka.event.ScanningClassification,akka.event.ScanningClassification))​([ScanningClassification](ScanningClassification.html "interface in akka.event") subscriber,  [ScanningClassification](ScanningClassification.html "interface in akka.event") from)` |  |

- - ### Method Detail
	
	
	
		- #### akka$event$ScanningClassification$\_setter\_$subscribers\_$eq
		
		
		
		```
		void akka$event$ScanningClassification$_setter_$subscribers_$eq​(java.util.concurrent.ConcurrentSkipListSet<scala.Tuple2<java.lang.Object,​java.lang.Object>> x$1)
		```
		- #### compareClassifiers
		
		
		
		```
		int compareClassifiers​([ScanningClassification](ScanningClassification.html "interface in akka.event") a,
		                       [ScanningClassification](ScanningClassification.html "interface in akka.event") b)
		```
		
		Provides a total ordering of Classifiers (think java.util.Comparator.compare)
		- #### compareSubscribers
		
		
		
		```
		int compareSubscribers​([ScanningClassification](ScanningClassification.html "interface in akka.event") a,
		                       [ScanningClassification](ScanningClassification.html "interface in akka.event") b)
		```
		
		Provides a total ordering of Subscribers (think java.util.Comparator.compare)
		- #### matches
		
		
		
		```
		boolean matches​([ScanningClassification](ScanningClassification.html "interface in akka.event") classifier,
		                [ScanningClassification](ScanningClassification.html "interface in akka.event") event)
		```
		
		Returns whether the specified Classifier matches the specified Event
		- #### publish
		
		
		
		```
		void publish​([ScanningClassification](ScanningClassification.html "interface in akka.event") event,
		             [ScanningClassification](ScanningClassification.html "interface in akka.event") subscriber)
		```
		
		Publishes the specified Event to the specified Subscriber
		- #### publish
		
		
		
		```
		void publish​([ScanningClassification](ScanningClassification.html "interface in akka.event") event)
		```
		- #### subscribe
		
		
		
		```
		boolean subscribe​([ScanningClassification](ScanningClassification.html "interface in akka.event") subscriber,
		                  [ScanningClassification](ScanningClassification.html "interface in akka.event") to)
		```
		- #### subscribers
		
		
		
		```
		java.util.concurrent.ConcurrentSkipListSet<scala.Tuple2<java.lang.Object,​java.lang.Object>> subscribers()
		```
		- #### unsubscribe
		
		
		
		```
		boolean unsubscribe​([ScanningClassification](ScanningClassification.html "interface in akka.event") subscriber,
		                    [ScanningClassification](ScanningClassification.html "interface in akka.event") from)
		```
		- #### unsubscribe
		
		
		
		```
		void unsubscribe​([ScanningClassification](ScanningClassification.html "interface in akka.event") subscriber)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/ScanningClassification.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/ScanningClassification.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/ScanningClassification.html)*