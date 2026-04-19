---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:47:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/EventEnvelope$.html
title: EventEnvelope$
---

# EventEnvelope$

## Content

Package [akka.persistence.query](package-summary.html)
## Class EventEnvelope$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object,​[EventEnvelope](EventEnvelope.html "class in akka.persistence.query")\>
	- - akka.persistence.query.EventEnvelope$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object,​[EventEnvelope](EventEnvelope.html "class in akka.persistence.query")>`

---

```
public class EventEnvelope$
extends scala.runtime.AbstractFunction4<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object,​[EventEnvelope](EventEnvelope.html "class in akka.persistence.query")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.query.EventEnvelope$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventEnvelope$](EventEnvelope$.html "class in akka.persistence.query")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventEnvelope$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[EventEnvelope](EventEnvelope.html "class in akka.persistence.query")` | `[apply](#apply(akka.persistence.query.Offset,java.lang.String,long,java.lang.Object))​([Offset](Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  java.lang.Object event)` | Deprecated. for binary compatibility. |
	| `[EventEnvelope](EventEnvelope.html "class in akka.persistence.query")` | `[apply](#apply(akka.persistence.query.Offset,java.lang.String,long,java.lang.Object,long))​([Offset](Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  java.lang.Object event,  long timestamp)` |  |
	| `[EventEnvelope](EventEnvelope.html "class in akka.persistence.query")` | `[apply](#apply(akka.persistence.query.Offset,java.lang.String,long,java.lang.Object,long,scala.Option))​([Offset](Offset.html "class in akka.persistence.query") offset,  java.lang.String persistenceId,  long sequenceNr,  java.lang.Object event,  long timestamp,  scala.Option<java.lang.Object> meta)` |  |
	| `scala.Option<scala.Tuple4<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.query.EventEnvelope))​([EventEnvelope](EventEnvelope.html "class in akka.persistence.query") arg)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, toString, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function4
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventEnvelope$](EventEnvelope$.html "class in akka.persistence.query") MODULE$
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
		public [EventEnvelope](EventEnvelope.html "class in akka.persistence.query") apply​([Offset](Offset.html "class in akka.persistence.query") offset,
		                           java.lang.String persistenceId,
		                           long sequenceNr,
		                           java.lang.Object event,
		                           long timestamp)
		```
		- #### apply
		
		
		
		```
		public [EventEnvelope](EventEnvelope.html "class in akka.persistence.query") apply​([Offset](Offset.html "class in akka.persistence.query") offset,
		                           java.lang.String persistenceId,
		                           long sequenceNr,
		                           java.lang.Object event,
		                           long timestamp,
		                           scala.Option<java.lang.Object> meta)
		```
		- #### apply
		
		
		
		```
		public [EventEnvelope](EventEnvelope.html "class in akka.persistence.query") apply​([Offset](Offset.html "class in akka.persistence.query") offset,
		                           java.lang.String persistenceId,
		                           long sequenceNr,
		                           java.lang.Object event)
		```
		
		Deprecated.
		for binary compatibility. Since 2\.6\.2\.
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<[Offset](Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object>> unapply​([EventEnvelope](EventEnvelope.html "class in akka.persistence.query") arg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/EventEnvelope$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/EventEnvelope$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/EventEnvelope$.html)*