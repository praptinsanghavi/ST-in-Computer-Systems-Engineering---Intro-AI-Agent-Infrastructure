---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope$.html
title: EventEnvelope$
---

# EventEnvelope$

## Content

Package [akka.persistence.query.typed](package-summary.html)
## Class EventEnvelope$

- java.lang.Object
- - akka.persistence.query.typed.EventEnvelope$

- ---

```
public class EventEnvelope$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventEnvelope$](EventEnvelope$.html "class in akka.persistence.query.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventEnvelope$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event>` | `[apply](#apply(akka.persistence.query.Offset,java.lang.String,long,Event,long,java.lang.String,int))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  Event event,  long timestamp,  java.lang.String entityType,  int slice)` |  |
	| `<Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event>` | `[apply](#apply(akka.persistence.query.Offset,java.lang.String,long,Event,long,java.lang.String,int,boolean,java.lang.String))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  Event event,  long timestamp,  java.lang.String entityType,  int slice,  boolean filtered,  java.lang.String source)` |  |
	| `<Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event>` | `[apply](#apply(akka.persistence.query.Offset,java.lang.String,long,Event,long,java.lang.String,int,boolean,java.lang.String,scala.collection.immutable.Set))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  Event event,  long timestamp,  java.lang.String entityType,  int slice,  boolean filtered,  java.lang.String source,  scala.collection.immutable.Set<java.lang.String> tags)` |  |
	| `<Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event>` | `[create](#create(akka.persistence.query.Offset,java.lang.String,long,Event,long,java.lang.String,int))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  Event event,  long timestamp,  java.lang.String entityType,  int slice)` |  |
	| `<Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event>` | `[create](#create(akka.persistence.query.Offset,java.lang.String,long,Event,long,java.lang.String,int,boolean,java.lang.String))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  Event event,  long timestamp,  java.lang.String entityType,  int slice,  boolean filtered,  java.lang.String source)` |  |
	| `<Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event>` | `[create](#create(akka.persistence.query.Offset,java.lang.String,long,Event,long,java.lang.String,int,boolean,java.lang.String,java.util.Set))​([Offset](../Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  Event event,  long timestamp,  java.lang.String entityType,  int slice,  boolean filtered,  java.lang.String source,  java.util.Set<java.lang.String> tags)` |  |
	| `<Event> scala.Option<scala.Tuple5<[Offset](../Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​scala.Option<Event>,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.query.typed.EventEnvelope))​([EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> arg)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventEnvelope$](EventEnvelope$.html "class in akka.persistence.query.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventEnvelope$
		
		
		
		```
		public EventEnvelope$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> apply​([Offset](../Offset.html "class in akka.persistence.query") offset,
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
		public <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> apply​([Offset](../Offset.html "class in akka.persistence.query") offset,
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
		public <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> apply​([Offset](../Offset.html "class in akka.persistence.query") offset,
		                                          java.lang.String persistenceId,
		                                          long sequenceNr,
		                                          Event event,
		                                          long timestamp,
		                                          java.lang.String entityType,
		                                          int slice)
		```
		- #### create
		
		
		
		```
		public <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> create​([Offset](../Offset.html "class in akka.persistence.query") offset,
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
		public <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> create​([Offset](../Offset.html "class in akka.persistence.query") offset,
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
		public <Event> [EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> create​([Offset](../Offset.html "class in akka.persistence.query") offset,
		                                           java.lang.String persistenceId,
		                                           long sequenceNr,
		                                           Event event,
		                                           long timestamp,
		                                           java.lang.String entityType,
		                                           int slice)
		```
		- #### unapply
		
		
		
		```
		public <Event> scala.Option<scala.Tuple5<[Offset](../Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​scala.Option<Event>,​java.lang.Object>> unapply​([EventEnvelope](EventEnvelope.html "class in akka.persistence.query.typed")<Event> arg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope$.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope$.html)*