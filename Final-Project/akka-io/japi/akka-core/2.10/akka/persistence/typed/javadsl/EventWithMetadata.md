---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:03:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventWithMetadata.html
title: EventWithMetadata
---

# EventWithMetadata

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class EventWithMetadata\<E\>

- java.lang.Object
- - akka.persistence.typed.javadsl.EventWithMetadata\<E\>

- ---

```
public final class EventWithMetadata<E>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventWithMetadata](#%3Cinit%3E(E,java.util.List))​([E](EventWithMetadata.html "type parameter in EventWithMetadata") event,  java.util.List<java.lang.Object> metadataEntries)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <E> [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")<E>` | `[create](#create(E,java.lang.Object))​(E event,  java.lang.Object metadata)` |  |
	| `static <E> [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")<E>` | `[create](#create(E,java.util.List))​(E event,  java.util.List<java.lang.Object> metadataEntries)` |  |
	| `[E](EventWithMetadata.html "type parameter in EventWithMetadata")` | `[event](#event())()` |  |
	| `<M> java.util.Optional<M>` | `[getMetadata](#getMetadata(java.lang.Class))​(java.lang.Class<M> metadataType)` | The metadata of a given type that is associated with the event. |
	| `java.util.List<java.lang.Object>` | `[metadataEntries](#metadataEntries())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventWithMetadata
		
		
		
		```
		public EventWithMetadata​([E](EventWithMetadata.html "type parameter in EventWithMetadata") event,
		                         java.util.List<java.lang.Object> metadataEntries)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <E> [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")<E> create​(E event,
		                                              java.lang.Object metadata)
		```
		- #### create
		
		
		
		```
		public static <E> [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")<E> create​(E event,
		                                              java.util.List<java.lang.Object> metadataEntries)
		```
		- #### event
		
		
		
		```
		public [E](EventWithMetadata.html "type parameter in EventWithMetadata") event()
		```
		- #### metadataEntries
		
		
		
		```
		public java.util.List<java.lang.Object> metadataEntries()
		```
		- #### getMetadata
		
		
		
		```
		public <M> java.util.Optional<M> getMetadata​(java.lang.Class<M> metadataType)
		```
		
		The metadata of a given type that is associated with the event.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventWithMetadata.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventWithMetadata.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventWithMetadata.html)*