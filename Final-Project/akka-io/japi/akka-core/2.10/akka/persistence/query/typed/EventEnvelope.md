---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
title: EventEnvelope
---

# EventEnvelope

## Content

Package [akka.persistence.query.typed](package-summary.html)
## Class EventEnvelope\<Event\>

- java.lang.Object
- - akka.persistence.query.typed.EventEnvelope\<Event\>

- ---

```
public final class EventEnvelope<Event>
extends java.lang.Object
```

Event wrapper adding meta data for the events in the result stream of
 [`EventsBySliceQuery`](scaladsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl") query, or similar queries.
 
 If the `event` is not defined it has not been loaded yet. It can be loaded with
 [`LoadEventQuery`](scaladsl/LoadEventQuery.html "interface in akka.persistence.query.typed.scaladsl").
 

 The `timestamp` is the time the event was stored, in milliseconds since midnight, January 1, 1970 UTC (same as
 `System.currentTimeMillis`).
 

 It is an improved `EventEnvelope` compared to [`EventEnvelope`](../EventEnvelope.html "class in akka.persistence.query").

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventEnvelope](#%3Cinit%3E(akka.persistence.query.Offset,java.lang.String,long,scala.Option,long,scala.Option,java.lang.String,int))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  scala.Option<[Event](EventEnvelope.html "type parameter in EventEnvelope")> eventOption,  long timestamp,  scala.Option<java.lang.Object> eventMetadata,  java.lang.String entityType,  int slice)` |  |
	| `[EventEnvelope](#%3Cinit%3E(akka.persistence.query.Offset,java.lang.String,long,scala.Option,long,scala.Option,java.lang.String,int,boolean,java.lang.String))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  scala.Option<[Event](EventEnvelope.html "type parameter in EventEnvelope")> eventOption,  long timestamp,  scala.Option<java.lang.Object> eventMetadata,  java.lang.String entityType,  int slice,  boolean filtered,  java.lang.String source)` |  |
	| `[EventEnvelope](#%3Cinit%3E(akka.persistence.query.Offset,java.lang.String,long,scala.Option,long,scala.Option,java.lang.String,int,boolean,java.lang.String,scala.collection.immutable.Set))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  scala.Option<[Event](EventEnvelope.html "type parameter in EventEnvelope")> eventOption,  long timestamp,  scala.Option<java.lang.Object> _eventMetadata,  java.lang.String entityType,  int slice,  boolean filtered,  java.lang.String source,  scala.collection.immutable.Set<java.lang.String> tags)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event>` | `[apply](#apply(akka.persistence.query.Offset,java.lang.String,long,Event,long,java.lang.String,int))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  Event event,  long timestamp,  java.lang.String entityType,  int slice)` |  |
	| `static <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event>` | `[apply](#apply(akka.persistence.query.Offset,java.lang.String,long,Event,long,java.lang.String,int,boolean,java.lang.String))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  Event event,  long timestamp,  java.lang.String entityType,  int slice,  boolean filtered,  java.lang.String source)` |  |
	| `static <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event>` | `[apply](#apply(akka.persistence.query.Offset,java.lang.String,long,Event,long,java.lang.String,int,boolean,java.lang.String,scala.collection.immutable.Set))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  Event event,  long timestamp,  java.lang.String entityType,  int slice,  boolean filtered,  java.lang.String source,  scala.collection.immutable.Set<java.lang.String> tags)` |  |
	| `static <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event>` | `[create](#create(akka.persistence.query.Offset,java.lang.String,long,Event,long,java.lang.String,int))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  Event event,  long timestamp,  java.lang.String entityType,  int slice)` |  |
	| `static <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event>` | `[create](#create(akka.persistence.query.Offset,java.lang.String,long,Event,long,java.lang.String,int,boolean,java.lang.String))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  Event event,  long timestamp,  java.lang.String entityType,  int slice,  boolean filtered,  java.lang.String source)` |  |
	| `static <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event>` | `[create](#create(akka.persistence.query.Offset,java.lang.String,long,Event,long,java.lang.String,int,boolean,java.lang.String,java.util.Set))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  Event event,  long timestamp,  java.lang.String entityType,  int slice,  boolean filtered,  java.lang.String source,  java.util.Set<java.lang.String> tags)` |  |
	| `java.lang.String` | `[entityType](#entityType())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `[Event](EventEnvelope.html "type parameter in EventEnvelope")` | `[event](#event())()` |  |
	| `scala.Option<java.lang.Object>` | `[eventMetadata](#eventMetadata())()` | Deprecated. Use metadata with metadataType parameter. |
	| `scala.Option<[Event](EventEnvelope.html "type parameter in EventEnvelope")>` | `[eventOption](#eventOption())()` |  |
	| `boolean` | `[filtered](#filtered())()` |  |
	| `[Event](EventEnvelope.html "type parameter in EventEnvelope")` | `[getEvent](#getEvent())()` | Java API |
	| `java.util.Optional<java.lang.Object>` | `[getEventMetaData](#getEventMetaData())()` | Deprecated. Use getMetadata with metadataType parameter. |
	| `<M> java.util.Optional<M>` | `[getMetadata](#getMetadata(java.lang.Class))​(java.lang.Class<M> metadataType)` | Java API: The metadata of a given type that is associated with the event. |
	| `java.util.Optional<[Event](EventEnvelope.html "type parameter in EventEnvelope")>` | `[getOptionalEvent](#getOptionalEvent())()` | Java API |
	| `java.util.Set<java.lang.String>` | `[getTags](#getTags())()` | Java API: |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `<M> scala.Option<M>` | `[metadata](#metadata(scala.reflect.ClassTag))​(scala.reflect.ClassTag<M> evidence$1)` | Scala API: The metadata of a given type that is associated with the event. |
	| `[Offset](../Offset.html "class in akka.persistence.query")` | `[offset](#offset())()` |  |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` |  |
	| `[EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")>` | `[removeMetadata](#removeMetadata(java.lang.Class))​(java.lang.Class<?> metadataType)` | Java API: Drop metadata of the given type if present |
	| `<M> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")>` | `[removeMetadata](#removeMetadata(scala.reflect.ClassTag))​(scala.reflect.ClassTag<M> classTag)` | Scala API: Drop metadata of the given type if present |
	| `long` | `[sequenceNr](#sequenceNr())()` |  |
	| `int` | `[slice](#slice())()` |  |
	| `java.lang.String` | `[source](#source())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[tags](#tags())()` |  |
	| `long` | `[timestamp](#timestamp())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <Event> scala.Option<scala.Tuple5<[Offset](../Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​scala.Option<Event>,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.query.typed.EventEnvelope))​([EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> arg)` |  |
	| `[EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")>` | `[withEvent](#withEvent(Event))​([Event](EventEnvelope.html "type parameter in EventEnvelope") event)` |  |
	| `[EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")>` | `[withEventOption](#withEventOption(scala.Option))​(scala.Option<[Event](EventEnvelope.html "type parameter in EventEnvelope")> eventOption)` |  |
	| `[EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")>` | `[withMetadata](#withMetadata(java.lang.Object))​(java.lang.Object metadata)` |  |
	| `[EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")>` | `[withPersistenceId](#withPersistenceId(java.lang.String,java.lang.String,int))​(java.lang.String persistenceId,  java.lang.String entityType,  int slice)` | `entityType` and `slice` should be derived from the `persistenceId`, but must be explicitly defined  when changing the `persistenceId` of the envelope. |
	| `[EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")>` | `[withTags](#withTags(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> tags)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventEnvelope
		
		
		
		```
		public EventEnvelope​([Offset](../Offset.html "class in akka.persistence.query") offset,
		                     java.lang.String persistenceId,
		                     long sequenceNr,
		                     scala.Option<[Event](EventEnvelope.html "type parameter in EventEnvelope")> eventOption,
		                     long timestamp,
		                     scala.Option<java.lang.Object> _eventMetadata,
		                     java.lang.String entityType,
		                     int slice,
		                     boolean filtered,
		                     java.lang.String source,
		                     scala.collection.immutable.Set<java.lang.String> tags)
		```
		- #### EventEnvelope
		
		
		
		```
		public EventEnvelope​([Offset](../Offset.html "class in akka.persistence.query") offset,
		                     java.lang.String persistenceId,
		                     long sequenceNr,
		                     scala.Option<[Event](EventEnvelope.html "type parameter in EventEnvelope")> eventOption,
		                     long timestamp,
		                     scala.Option<java.lang.Object> eventMetadata,
		                     java.lang.String entityType,
		                     int slice,
		                     boolean filtered,
		                     java.lang.String source)
		```
		- #### EventEnvelope
		
		
		
		```
		public EventEnvelope​([Offset](../Offset.html "class in akka.persistence.query") offset,
		                     java.lang.String persistenceId,
		                     long sequenceNr,
		                     scala.Option<[Event](EventEnvelope.html "type parameter in EventEnvelope")> eventOption,
		                     long timestamp,
		                     scala.Option<java.lang.Object> eventMetadata,
		                     java.lang.String entityType,
		                     int slice)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> apply​([Offset](../Offset.html "class in akka.persistence.query") offset,
		                                                 java.lang.String persistenceId,
		                                                 long sequenceNr,
		                                                 Event event,
		                                                 long timestamp,
		                                                 java.lang.String entityType,
		                                                 int slice,
		                                                 boolean filtered,
		                                                 java.lang.String source,
		                                                 scala.collection.immutable.Set<java.lang.String> tags)
		```
		- #### apply
		
		
		
		```
		public static <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> apply​([Offset](../Offset.html "class in akka.persistence.query") offset,
		                                                 java.lang.String persistenceId,
		                                                 long sequenceNr,
		                                                 Event event,
		                                                 long timestamp,
		                                                 java.lang.String entityType,
		                                                 int slice,
		                                                 boolean filtered,
		                                                 java.lang.String source)
		```
		- #### apply
		
		
		
		```
		public static <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> apply​([Offset](../Offset.html "class in akka.persistence.query") offset,
		                                                 java.lang.String persistenceId,
		                                                 long sequenceNr,
		                                                 Event event,
		                                                 long timestamp,
		                                                 java.lang.String entityType,
		                                                 int slice)
		```
		- #### create
		
		
		
		```
		public static <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> create​([Offset](../Offset.html "class in akka.persistence.query") offset,
		                                                  java.lang.String persistenceId,
		                                                  long sequenceNr,
		                                                  Event event,
		                                                  long timestamp,
		                                                  java.lang.String entityType,
		                                                  int slice,
		                                                  boolean filtered,
		                                                  java.lang.String source,
		                                                  java.util.Set<java.lang.String> tags)
		```
		- #### create
		
		
		
		```
		public static <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> create​([Offset](../Offset.html "class in akka.persistence.query") offset,
		                                                  java.lang.String persistenceId,
		                                                  long sequenceNr,
		                                                  Event event,
		                                                  long timestamp,
		                                                  java.lang.String entityType,
		                                                  int slice,
		                                                  boolean filtered,
		                                                  java.lang.String source)
		```
		- #### create
		
		
		
		```
		public static <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> create​([Offset](../Offset.html "class in akka.persistence.query") offset,
		                                                  java.lang.String persistenceId,
		                                                  long sequenceNr,
		                                                  Event event,
		                                                  long timestamp,
		                                                  java.lang.String entityType,
		                                                  int slice)
		```
		- #### unapply
		
		
		
		```
		public static <Event> scala.Option<scala.Tuple5<[Offset](../Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​scala.Option<Event>,​java.lang.Object>> unapply​([EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> arg)
		```
		- #### offset
		
		
		
		```
		public [Offset](../Offset.html "class in akka.persistence.query") offset()
		```
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId()
		```
		- #### sequenceNr
		
		
		
		```
		public long sequenceNr()
		```
		- #### eventOption
		
		
		
		```
		public scala.Option<[Event](EventEnvelope.html "type parameter in EventEnvelope")> eventOption()
		```
		- #### timestamp
		
		
		
		```
		public long timestamp()
		```
		- #### entityType
		
		
		
		```
		public java.lang.String entityType()
		```
		- #### slice
		
		
		
		```
		public int slice()
		```
		- #### filtered
		
		
		
		```
		public boolean filtered()
		```
		- #### source
		
		
		
		```
		public java.lang.String source()
		```
		- #### tags
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> tags()
		```
		- #### event
		
		
		
		```
		public [Event](EventEnvelope.html "type parameter in EventEnvelope") event()
		```
		- #### getEvent
		
		
		
		```
		public [Event](EventEnvelope.html "type parameter in EventEnvelope") getEvent()
		```
		
		Java API
		- #### getOptionalEvent
		
		
		
		```
		public java.util.Optional<[Event](EventEnvelope.html "type parameter in EventEnvelope")> getOptionalEvent()
		```
		
		Java API
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
		public [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")> removeMetadata​(java.lang.Class<?> metadataType)
		```
		
		Java API: Drop metadata of the given type if present
		- #### removeMetadata
		
		
		
		```
		public <M> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")> removeMetadata​(scala.reflect.ClassTag<M> classTag)
		```
		
		Scala API: Drop metadata of the given type if present
		- #### getTags
		
		
		
		```
		public java.util.Set<java.lang.String> getTags()
		```
		
		Java API:
		- #### withPersistenceId
		
		
		
		```
		public [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")> withPersistenceId​(java.lang.String persistenceId,
		                                              java.lang.String entityType,
		                                              int slice)
		```
		
		`entityType` and `slice` should be derived from the `persistenceId`, but must be explicitly defined
		 when changing the `persistenceId` of the envelope.
		 The `slice` should be calculated with `akka.persistence.Persistence.sliceForPersistenceId` for
		 the given `persistenceId`.
		 The `entityType` should be extracted from the `persistenceId` with
		 `akka.persistence.typed.PersistenceId.extractEntityType`.
		- #### withEvent
		
		
		
		```
		public [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")> withEvent​([Event](EventEnvelope.html "type parameter in EventEnvelope") event)
		```
		- #### withEventOption
		
		
		
		```
		public [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")> withEventOption​(scala.Option<[Event](EventEnvelope.html "type parameter in EventEnvelope")> eventOption)
		```
		- #### withTags
		
		
		
		```
		public [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")> withTags​(scala.collection.immutable.Set<java.lang.String> tags)
		```
		- #### withMetadata
		
		
		
		```
		public [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<[Event](EventEnvelope.html "type parameter in EventEnvelope")> withMetadata​(java.lang.Object metadata)
		```
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
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/LoadEventQuery.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html)*