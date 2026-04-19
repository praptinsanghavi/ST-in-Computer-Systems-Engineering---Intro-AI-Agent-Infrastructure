---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope.html
title: EventEnvelope
---

# EventEnvelope

## Content

Package [akka.persistence.query](package-summary.html)
## Class EventEnvelope

- java.lang.Object
- - akka.persistence.query.EventEnvelope

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.Product4<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object>`

---

```
public final class EventEnvelope
extends java.lang.Object
implements scala.Product4<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object>, java.io.Serializable
```

Event wrapper adding meta data for the events in the result stream of
 [`EventsByTagQuery`](scaladsl/EventsByTagQuery.html "interface in akka.persistence.query.scaladsl") query, or similar queries.
 
 The `timestamp` is the time the event was stored, in milliseconds since midnight, January 1, 1970 UTC
 (same as `System.currentTimeMillis`).

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.query.EventEnvelope)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventEnvelope](#%3Cinit%3E(akka.persistence.query.Offset,java.lang.String,long,java.lang.Object))​([Offset](Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  java.lang.Object event)` | Deprecated. for binary compatibility. |
	| `[EventEnvelope](#%3Cinit%3E(akka.persistence.query.Offset,java.lang.String,long,java.lang.Object,long))​([Offset](Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  java.lang.Object event,  long timestamp)` |  |
	| `[EventEnvelope](#%3Cinit%3E(akka.persistence.query.Offset,java.lang.String,long,java.lang.Object,long,scala.Option))​([Offset](Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  java.lang.Object event,  long timestamp,  scala.Option<java.lang.Object> _eventMetadata)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Offset](Offset.html "class in akka.persistence.query")` | `[_1](#_1())()` |  |
	| `java.lang.String` | `[_2](#_2())()` |  |
	| `long` | `[_3](#_3())()` |  |
	| `java.lang.Object` | `[_4](#_4())()` |  |
	| `static [EventEnvelope](EventEnvelope.html "class in akka.persistence.query")` | `[apply](#apply(akka.persistence.query.Offset,java.lang.String,long,java.lang.Object))​([Offset](Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  java.lang.Object event)` | Deprecated. for binary compatibility. |
	| `static [EventEnvelope](EventEnvelope.html "class in akka.persistence.query")` | `[apply](#apply(akka.persistence.query.Offset,java.lang.String,long,java.lang.Object,long))​([Offset](Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  java.lang.Object event,  long timestamp)` |  |
	| `static [EventEnvelope](EventEnvelope.html "class in akka.persistence.query")` | `[apply](#apply(akka.persistence.query.Offset,java.lang.String,long,java.lang.Object,long,scala.Option))​([Offset](Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  java.lang.Object event,  long timestamp,  scala.Option<java.lang.Object> meta)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object that)` |  |
	| `[EventEnvelope](EventEnvelope.html "class in akka.persistence.query")` | `[copy](#copy(akka.persistence.query.Offset,java.lang.String,long,java.lang.Object))​([Offset](Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  java.lang.Object event)` |  |
	| `[Offset](Offset.html "class in akka.persistence.query")` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `long` | `[copy$default$3](#copy$default$3())()` |  |
	| `java.lang.Object` | `[copy$default$4](#copy$default$4())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `java.lang.Object` | `[event](#event())()` |  |
	| `scala.Option<java.lang.Object>` | `[eventMetadata](#eventMetadata())()` | Deprecated. Use metadata with metadataType parameter. |
	| `java.util.Optional<java.lang.Object>` | `[getEventMetaData](#getEventMetaData())()` | Deprecated. Use getMetadata with metadataType parameter. |
	| `<M> java.util.Optional<M>` | `[getMetadata](#getMetadata(java.lang.Class))​(java.lang.Class<M> metadataType)` | Java API: The metadata of a given type that is associated with the event. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `<M> scala.Option<M>` | `[metadata](#metadata(scala.reflect.ClassTag))​(scala.reflect.ClassTag<M> evidence$1)` | Scala API: The metadata of a given type that is associated with the event. |
	| `[Offset](Offset.html "class in akka.persistence.query")` | `[offset](#offset())()` |  |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[EventEnvelope](EventEnvelope.html "class in akka.persistence.query")` | `[removeMetadata](#removeMetadata(java.lang.Class))​(java.lang.Class<?> metadataType)` | Java API: Drop metadata of the given type if present |
	| `<M> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query")` | `[removeMetadata](#removeMetadata(scala.reflect.ClassTag))​(scala.reflect.ClassTag<M> classTag)` | Scala API: Drop metadata of the given type if present |
	| `long` | `[sequenceNr](#sequenceNr())()` |  |
	| `long` | `[timestamp](#timestamp())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple4<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.query.EventEnvelope))​([EventEnvelope](EventEnvelope.html "class in akka.persistence.query") arg)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames, productIterator`
		- ### Methods inherited from interface scala.Product4
		
		
		`productArity, productElement`

- - ### Constructor Detail
	
	
	
		- #### EventEnvelope
		
		
		
		```
		public EventEnvelope​([Offset](Offset.html "class in akka.persistence.query") offset,
		                     java.lang.String persistenceId,
		                     long sequenceNr,
		                     java.lang.Object event,
		                     long timestamp,
		                     scala.Option<java.lang.Object> _eventMetadata)
		```
		- #### EventEnvelope
		
		
		
		```
		public EventEnvelope​([Offset](Offset.html "class in akka.persistence.query") offset,
		                     java.lang.String persistenceId,
		                     long sequenceNr,
		                     java.lang.Object event)
		```
		
		Deprecated.
		for binary compatibility. Since 2\.6\.2\.
		- #### EventEnvelope
		
		
		
		```
		public EventEnvelope​([Offset](Offset.html "class in akka.persistence.query") offset,
		                     java.lang.String persistenceId,
		                     long sequenceNr,
		                     java.lang.Object event,
		                     long timestamp)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [EventEnvelope](EventEnvelope.html "class in akka.persistence.query") apply​([Offset](Offset.html "class in akka.persistence.query") offset,
		                                  java.lang.String persistenceId,
		                                  long sequenceNr,
		                                  java.lang.Object event,
		                                  long timestamp)
		```
		- #### apply
		
		
		
		```
		public static [EventEnvelope](EventEnvelope.html "class in akka.persistence.query") apply​([Offset](Offset.html "class in akka.persistence.query") offset,
		                                  java.lang.String persistenceId,
		                                  long sequenceNr,
		                                  java.lang.Object event,
		                                  long timestamp,
		                                  scala.Option<java.lang.Object> meta)
		```
		- #### apply
		
		
		
		```
		public static [EventEnvelope](EventEnvelope.html "class in akka.persistence.query") apply​([Offset](Offset.html "class in akka.persistence.query") offset,
		                                  java.lang.String persistenceId,
		                                  long sequenceNr,
		                                  java.lang.Object event)
		```
		
		Deprecated.
		for binary compatibility. Since 2\.6\.2\.
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple4<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object>> unapply​([EventEnvelope](EventEnvelope.html "class in akka.persistence.query") arg)
		```
		- #### offset
		
		
		
		```
		public [Offset](Offset.html "class in akka.persistence.query") offset()
		```
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId()
		```
		- #### sequenceNr
		
		
		
		```
		public long sequenceNr()
		```
		- #### event
		
		
		
		```
		public java.lang.Object event()
		```
		- #### timestamp
		
		
		
		```
		public long timestamp()
		```
		- #### eventMetadata
		
		
		
		```
		public scala.Option<java.lang.Object> eventMetadata()
		```
		
		Deprecated.
		Use metadata with metadataType parameter.
		
		Scala API
		- #### getEventMetaData
		
		
		
		```
		public java.util.Optional<java.lang.Object> getEventMetaData()
		```
		
		Deprecated.
		Use getMetadata with metadataType parameter.
		
		Java API
		- #### metadata
		
		
		
		```
		public <M> scala.Option<M> metadata​(scala.reflect.ClassTag<M> evidence$1)
		```
		
		Scala API: The metadata of a given type that is associated with the event.
		- #### getMetadata
		
		
		
		```
		public <M> java.util.Optional<M> getMetadata​(java.lang.Class<M> metadataType)
		```
		
		Java API: The metadata of a given type that is associated with the event.
		- #### removeMetadata
		
		
		
		```
		public [EventEnvelope](EventEnvelope.html "class in akka.persistence.query") removeMetadata​(java.lang.Class<?> metadataType)
		```
		
		Java API: Drop metadata of the given type if present
		- #### removeMetadata
		
		
		
		```
		public <M> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query") removeMetadata​(scala.reflect.ClassTag<M> classTag)
		```
		
		Scala API: Drop metadata of the given type if present
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### copy
		
		
		
		```
		public [EventEnvelope](EventEnvelope.html "class in akka.persistence.query") copy​([Offset](Offset.html "class in akka.persistence.query") offset,
		                          java.lang.String persistenceId,
		                          long sequenceNr,
		                          java.lang.Object event)
		```
		- #### copy$default$1
		
		
		
		```
		public [Offset](Offset.html "class in akka.persistence.query") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.String copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public long copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public java.lang.Object copy$default$4()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### \_1
		
		
		
		```
		public [Offset](Offset.html "class in akka.persistence.query") _1()
		```
		
		
		Specified by:
		`_1` in interface `scala.Product4<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object>`
		- #### \_2
		
		
		
		```
		public java.lang.String _2()
		```
		
		
		Specified by:
		`_2` in interface `scala.Product4<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object>`
		- #### \_3
		
		
		
		```
		public long _3()
		```
		
		
		Specified by:
		`_3` in interface `scala.Product4<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object>`
		- #### \_4
		
		
		
		```
		public java.lang.Object _4()
		```
		
		
		Specified by:
		`_4` in interface `scala.Product4<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object>`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object that)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/EventsByTagQuery.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope.html)*