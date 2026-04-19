---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:18:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/LookupClassification.html
title: LookupClassification
---

# LookupClassification

## Content

Package [akka.event](package-summary.html)
## Interface LookupClassification

- ---

```
public interface LookupClassification
```

Maps Subscribers to Classifiers using equality on Classifier to store a Set of Subscribers (hence the need for compareSubscribers)
 Maps Events to Classifiers through the classify\-method (so it knows who to publish to)
 
 The compareSubscribers need to provide a total ordering of the Subscribers

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[akka$event$LookupClassification$_setter_$subscribers_$eq](#akka$event$LookupClassification$_setter_$subscribers_$eq(akka.util.Index))​([Index](../util/Index.html "class in akka.util")<java.lang.Object,​java.lang.Object> x$1)` |  |
	| `[LookupClassification](LookupClassification.html "interface in akka.event")` | `[classify](#classify(akka.event.LookupClassification))​([LookupClassification](LookupClassification.html "interface in akka.event") event)` | Returns the Classifier associated with the given Event |
	| `int` | `[compareSubscribers](#compareSubscribers(akka.event.LookupClassification,akka.event.LookupClassification))​([LookupClassification](LookupClassification.html "interface in akka.event") a,  [LookupClassification](LookupClassification.html "interface in akka.event") b)` | Provides a total ordering of Subscribers (think java.util.Comparator.compare) |
	| `int` | `[mapSize](#mapSize())()` | This is a size hint for the number of Classifiers you expect to have (use powers of 2\) |
	| `void` | `[publish](#publish(akka.event.LookupClassification))​([LookupClassification](LookupClassification.html "interface in akka.event") event)` |  |
	| `void` | `[publish](#publish(akka.event.LookupClassification,akka.event.LookupClassification))​([LookupClassification](LookupClassification.html "interface in akka.event") event,  [LookupClassification](LookupClassification.html "interface in akka.event") subscriber)` | Publishes the given Event to the given Subscriber |
	| `boolean` | `[subscribe](#subscribe(akka.event.LookupClassification,akka.event.LookupClassification))​([LookupClassification](LookupClassification.html "interface in akka.event") subscriber,  [LookupClassification](LookupClassification.html "interface in akka.event") to)` |  |
	| `[Index](../util/Index.html "class in akka.util")<java.lang.Object,​java.lang.Object>` | `[subscribers](#subscribers())()` |  |
	| `void` | `[unsubscribe](#unsubscribe(akka.event.LookupClassification))​([LookupClassification](LookupClassification.html "interface in akka.event") subscriber)` |  |
	| `boolean` | `[unsubscribe](#unsubscribe(akka.event.LookupClassification,akka.event.LookupClassification))​([LookupClassification](LookupClassification.html "interface in akka.event") subscriber,  [LookupClassification](LookupClassification.html "interface in akka.event") from)` |  |

- - ### Method Detail
	
	
	
		- #### akka$event$LookupClassification$\_setter\_$subscribers\_$eq
		
		
		
		```
		void akka$event$LookupClassification$_setter_$subscribers_$eq​([Index](../util/Index.html "class in akka.util")<java.lang.Object,​java.lang.Object> x$1)
		```
		- #### classify
		
		
		
		```
		[LookupClassification](LookupClassification.html "interface in akka.event") classify​([LookupClassification](LookupClassification.html "interface in akka.event") event)
		```
		
		Returns the Classifier associated with the given Event
		- #### compareSubscribers
		
		
		
		```
		int compareSubscribers​([LookupClassification](LookupClassification.html "interface in akka.event") a,
		                       [LookupClassification](LookupClassification.html "interface in akka.event") b)
		```
		
		Provides a total ordering of Subscribers (think java.util.Comparator.compare)
		- #### mapSize
		
		
		
		```
		int mapSize()
		```
		
		This is a size hint for the number of Classifiers you expect to have (use powers of 2\)
		- #### publish
		
		
		
		```
		void publish​([LookupClassification](LookupClassification.html "interface in akka.event") event,
		             [LookupClassification](LookupClassification.html "interface in akka.event") subscriber)
		```
		
		Publishes the given Event to the given Subscriber
		- #### publish
		
		
		
		```
		void publish​([LookupClassification](LookupClassification.html "interface in akka.event") event)
		```
		- #### subscribe
		
		
		
		```
		boolean subscribe​([LookupClassification](LookupClassification.html "interface in akka.event") subscriber,
		                  [LookupClassification](LookupClassification.html "interface in akka.event") to)
		```
		- #### subscribers
		
		
		
		```
		[Index](../util/Index.html "class in akka.util")<java.lang.Object,​java.lang.Object> subscribers()
		```
		- #### unsubscribe
		
		
		
		```
		boolean unsubscribe​([LookupClassification](LookupClassification.html "interface in akka.event") subscriber,
		                    [LookupClassification](LookupClassification.html "interface in akka.event") from)
		```
		- #### unsubscribe
		
		
		
		```
		void unsubscribe​([LookupClassification](LookupClassification.html "interface in akka.event") subscriber)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/LookupClassification.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Index.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/LookupClassification.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/LookupClassification.html)*