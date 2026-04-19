---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventWithMetadata$.html
title: EventWithMetadata$
---

# EventWithMetadata$

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class EventWithMetadata$

- java.lang.Object
- - akka.persistence.typed.javadsl.EventWithMetadata$

- ---

```
public class EventWithMetadata$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventWithMetadata$](EventWithMetadata$.html "class in akka.persistence.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventWithMetadata$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<E> [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")<E>` | `[create](#create(E,java.lang.Object))​(E event,  java.lang.Object metadata)` |  |
	| `<E> [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")<E>` | `[create](#create(E,java.util.List))​(E event,  java.util.List<java.lang.Object> metadataEntries)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventWithMetadata$](EventWithMetadata$.html "class in akka.persistence.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventWithMetadata$
		
		
		
		```
		public EventWithMetadata$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <E> [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")<E> create​(E event,
		                                       java.lang.Object metadata)
		```
		- #### create
		
		
		
		```
		public <E> [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")<E> create​(E event,
		                                       java.util.List<java.lang.Object> metadataEntries)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventWithMetadata$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventWithMetadata.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventWithMetadata$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventWithMetadata$.html)*