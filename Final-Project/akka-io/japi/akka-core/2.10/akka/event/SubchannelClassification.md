---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:46:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/SubchannelClassification.html
title: SubchannelClassification
---

# SubchannelClassification

## Content

Package [akka.event](package-summary.html)
## Interface SubchannelClassification

- All Known Implementing Classes:
`[EventStream](EventStream.html "class in akka.event")`

---

```
public interface SubchannelClassification
```

Classification which respects relationships between channels: subscribing
 to one channel automatically and idempotently subscribes to all sub\-channels.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[addToCache](#addToCache(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object,​scala.collection.immutable.Set<java.lang.Object>>> changes)` |  |
	| `void` | `[cache_$eq](#cache_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.Object,​scala.collection.immutable.Set<java.lang.Object>> x$1)` |  |
	| `[SubchannelClassification](SubchannelClassification.html "interface in akka.event")` | `[classify](#classify(akka.event.SubchannelClassification))​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") event)` | Returns the Classifier associated with the given Event |
	| `boolean` | `[hasSubscriptions](#hasSubscriptions(akka.event.SubchannelClassification))​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") subscriber)` | INTERNAL API  Expensive call! Avoid calling directly from event bus subscribe / unsubscribe. |
	| `void` | `[publish](#publish(akka.event.SubchannelClassification))​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") event)` |  |
	| `void` | `[publish](#publish(akka.event.SubchannelClassification,akka.event.SubchannelClassification))​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") event,  [SubchannelClassification](SubchannelClassification.html "interface in akka.event") subscriber)` | Publishes the given Event to the given Subscriber |
	| `void` | `[removeFromCache](#removeFromCache(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object,​scala.collection.immutable.Set<java.lang.Object>>> changes)` |  |
	| `[Subclassification](../util/Subclassification.html "interface in akka.util")<java.lang.Object>` | `[subclassification](#subclassification())()` | The logic to form sub\-class hierarchy |
	| `boolean` | `[subscribe](#subscribe(akka.event.SubchannelClassification,akka.event.SubchannelClassification))​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") subscriber,  [SubchannelClassification](SubchannelClassification.html "interface in akka.event") to)` |  |
	| `void` | `[unsubscribe](#unsubscribe(akka.event.SubchannelClassification))​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") subscriber)` |  |
	| `boolean` | `[unsubscribe](#unsubscribe(akka.event.SubchannelClassification,akka.event.SubchannelClassification))​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") subscriber,  [SubchannelClassification](SubchannelClassification.html "interface in akka.event") from)` |  |

- - ### Method Detail
	
	
	
		- #### addToCache
		
		
		
		```
		void addToCache​(scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object,​scala.collection.immutable.Set<java.lang.Object>>> changes)
		```
		- #### cache\_$eq
		
		
		
		```
		void cache_$eq​(scala.collection.immutable.Map<java.lang.Object,​scala.collection.immutable.Set<java.lang.Object>> x$1)
		```
		- #### classify
		
		
		
		```
		[SubchannelClassification](SubchannelClassification.html "interface in akka.event") classify​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") event)
		```
		
		Returns the Classifier associated with the given Event
		- #### hasSubscriptions
		
		
		
		```
		boolean hasSubscriptions​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") subscriber)
		```
		
		INTERNAL API
		 Expensive call! Avoid calling directly from event bus subscribe / unsubscribe.
		- #### publish
		
		
		
		```
		void publish​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") event,
		             [SubchannelClassification](SubchannelClassification.html "interface in akka.event") subscriber)
		```
		
		Publishes the given Event to the given Subscriber
		- #### publish
		
		
		
		```
		void publish​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") event)
		```
		- #### removeFromCache
		
		
		
		```
		void removeFromCache​(scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object,​scala.collection.immutable.Set<java.lang.Object>>> changes)
		```
		- #### subclassification
		
		
		
		```
		[Subclassification](../util/Subclassification.html "interface in akka.util")<java.lang.Object> subclassification()
		```
		
		The logic to form sub\-class hierarchy
		- #### subscribe
		
		
		
		```
		boolean subscribe​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") subscriber,
		                  [SubchannelClassification](SubchannelClassification.html "interface in akka.event") to)
		```
		- #### unsubscribe
		
		
		
		```
		boolean unsubscribe​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") subscriber,
		                    [SubchannelClassification](SubchannelClassification.html "interface in akka.event") from)
		```
		- #### unsubscribe
		
		
		
		```
		void unsubscribe​([SubchannelClassification](SubchannelClassification.html "interface in akka.event") subscriber)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/SubchannelClassification.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Subclassification.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/SubchannelClassification.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/SubchannelClassification.html)*