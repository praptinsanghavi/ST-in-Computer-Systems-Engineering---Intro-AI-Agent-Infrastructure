---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EventWithMetadata.html
title: EventWithMetadata
---

# EventWithMetadata

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Class EventWithMetadata\<E\>

- java.lang.Object
- - akka.persistence.typed.scaladsl.EventWithMetadata\<E\>

- ---

```
public final class EventWithMetadata<E>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventWithMetadata](#%3Cinit%3E(E,scala.collection.immutable.Seq))​([E](EventWithMetadata.html "type parameter in EventWithMetadata") event,  scala.collection.immutable.Seq<java.lang.Object> metadataEntries)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <E> [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<E>` | `[apply](#apply(E,java.lang.Object))​(E event,  java.lang.Object metadata)` |  |
	| `static <E> [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<E>` | `[apply](#apply(E,scala.collection.immutable.Seq))​(E event,  scala.collection.immutable.Seq<java.lang.Object> metadataEntries)` |  |
	| `[E](EventWithMetadata.html "type parameter in EventWithMetadata")` | `[event](#event())()` |  |
	| `<M> scala.Option<M>` | `[metadata](#metadata(scala.reflect.ClassTag))​(scala.reflect.ClassTag<M> evidence$1)` | The metadata of a given type that is associated with the event. |
	| `scala.collection.immutable.Seq<java.lang.Object>` | `[metadataEntries](#metadataEntries())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventWithMetadata
		
		
		
		```
		public EventWithMetadata​([E](EventWithMetadata.html "type parameter in EventWithMetadata") event,
		                         scala.collection.immutable.Seq<java.lang.Object> metadataEntries)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <E> [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<E> apply​(E event,
		                                             java.lang.Object metadata)
		```
		- #### apply
		
		
		
		```
		public static <E> [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<E> apply​(E event,
		                                             scala.collection.immutable.Seq<java.lang.Object> metadataEntries)
		```
		- #### event
		
		
		
		```
		public [E](EventWithMetadata.html "type parameter in EventWithMetadata") event()
		```
		- #### metadataEntries
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.Object> metadataEntries()
		```
		- #### metadata
		
		
		
		```
		public <M> scala.Option<M> metadata​(scala.reflect.ClassTag<M> evidence$1)
		```
		
		The metadata of a given type that is associated with the event.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EventWithMetadata.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EventWithMetadata.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EventWithMetadata.html)*