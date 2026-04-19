---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:16:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/typed/internal/EventsBySliceFirehose$.html
title: EventsBySliceFirehose$
---

# EventsBySliceFirehose$

## Content

Package [akka.persistence.query.typed.internal](package-summary.html)
## Class EventsBySliceFirehose$

- java.lang.Object
- - akka.persistence.query.typed.internal.EventsBySliceFirehose$

- All Implemented Interfaces:
`[ExtensionId](../../../../actor/ExtensionId.html "interface in akka.actor")<akka.persistence.query.typed.internal.EventsBySliceFirehose>`, `[ExtensionIdProvider](../../../../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class EventsBySliceFirehose$
extends java.lang.Object
implements [ExtensionId](../../../../actor/ExtensionId.html "interface in akka.actor")<akka.persistence.query.typed.internal.EventsBySliceFirehose>, [ExtensionIdProvider](../../../../actor/ExtensionIdProvider.html "interface in akka.actor")
```

INTERNAL API
 
 The purpose is to share the stream of events from the database and fan out to connected consumer
 streams. Thereby less queries and loading of events from the database. The shared stream is called
 the firehose stream.
 

 The fan out of the firehose stream is via a `BroadcastHub` that consumer streams dynamically attach to.
 

 A new consumer starts a catchup stream since the start offset typically is behind the live
 firehose stream. In the beginning it will emit events only from the catchup stream. Offset progress
 for the firehose stream is tracked and when the catchup stream has caught up with the firehose
 stream it will switch over to emitting from firehose stream and close the catchup stream. During
 an overlap period of time it will use events from both catchup and firehose streams to make sure
 that no events are missed. During this overlap time there is best effort deduplication.
 

 The `BroadcastHub` has a limited buffer that holds events between the slowest and fastest consumer.
 When the buffer is full the fastest consumer can't progress faster than the slowest. Short periods of
 slow down can be fine, but after a while the slow consumers are detected and aborted. They have to
 connect again and try catching up, but without slowing down other streams.
 

 The firehose stream is started on demand when the first consumer is attaching. It will be stopped
 when the last consumer is stopped, but it stays around for a while to make it more efficient for
 new or restarted consumers to attach again.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventsBySliceFirehose$](EventsBySliceFirehose$.html "class in akka.persistence.query.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventsBySliceFirehose$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.query.typed.internal.EventsBySliceFirehose` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `akka.persistence.query.typed.internal.EventsBySliceFirehose` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../../../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `akka.persistence.query.typed.internal.EventsBySliceFirehose` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `boolean` | `[isDurationGreaterThan](#isDurationGreaterThan(java.time.Instant,java.time.Instant,java.time.Duration))​(java.time.Instant from,  java.time.Instant to,  java.time.Duration duration)` |  |
	| `[EventsBySliceFirehose$](EventsBySliceFirehose$.html "class in akka.persistence.query.typed.internal")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	| `[TimestampOffset](../../TimestampOffset.html "class in akka.persistence.query")` | `[timestampOffset](#timestampOffset(akka.persistence.query.typed.EventEnvelope))​([EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<java.lang.Object> env)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../../../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../../../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../../../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../../../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../../../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventsBySliceFirehose$](EventsBySliceFirehose$.html "class in akka.persistence.query.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventsBySliceFirehose$
		
		
		
		```
		public EventsBySliceFirehose$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public akka.persistence.query.typed.internal.EventsBySliceFirehose get​([ActorSystem](../../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../../../actor/ExtensionId.html#get(akka.actor.ActorSystem))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ActorSystem): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../../../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../../../../actor/ExtensionId.html "interface in akka.actor")<akka.persistence.query.typed.internal.EventsBySliceFirehose>`
		- #### get
		
		
		
		```
		public akka.persistence.query.typed.internal.EventsBySliceFirehose get​([ClassicActorSystemProvider](../../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../../../../actor/ExtensionId.html "interface in akka.actor")<akka.persistence.query.typed.internal.EventsBySliceFirehose>`
		- #### lookup
		
		
		
		```
		public [EventsBySliceFirehose$](EventsBySliceFirehose$.html "class in akka.persistence.query.typed.internal") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../../../../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../../../../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../../../../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public akka.persistence.query.typed.internal.EventsBySliceFirehose createExtension​([ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../../../actor/ExtensionId.html "interface in akka.actor")<akka.persistence.query.typed.internal.EventsBySliceFirehose>`
		- #### timestampOffset
		
		
		
		```
		public [TimestampOffset](../../TimestampOffset.html "class in akka.persistence.query") timestampOffset​([EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<java.lang.Object> env)
		```
		- #### isDurationGreaterThan
		
		
		
		```
		public boolean isDurationGreaterThan​(java.time.Instant from,
		                                     java.time.Instant to,
		                                     java.time.Duration duration)
		```

## Code Examples

### Example 1: get

```text
override def get(system: ActorSystem): TheExtension = super.get(system)
```

### Example 2: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/typed/internal/EventsBySliceFirehose$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/typed/internal/EventsBySliceFirehose$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/typed/internal/EventsBySliceFirehose$.html)*