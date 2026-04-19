---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:42:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistentRepr.html
title: PersistentRepr
---

# PersistentRepr

## Content

Package [akka.persistence](package-summary.html)
## Interface PersistentRepr

- All Superinterfaces:
`[Message](serialization/Message.html "interface in akka.persistence.serialization")`, `java.io.Serializable`

---

```
public interface PersistentRepr
extends [Message](serialization/Message.html "interface in akka.persistence.serialization")
```

Plugin API: representation of a persistent message in the journal plugin API.
 

See Also:
[`AsyncWriteJournal`](journal/AsyncWriteJournal.html "interface in akka.persistence.journal"), 
[`AsyncRecovery`](journal/AsyncRecovery.html "interface in akka.persistence.journal")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[deleted](#deleted())()` | Not used, can always be `false`. |
	| `java.lang.String` | `[manifest](#manifest())()` | Returns the event adapter manifest for the persistent payload (event) if available  May be `""` if event adapter manifest is not used. |
	| `scala.Option<java.lang.Object>` | `[metadata](#metadata())()` |  |
	| `java.lang.Object` | `[payload](#payload())()` | This persistent message's payload (the event). |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` | Persistent id that journals a persistent message |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[sender](#sender())()` | Not used, can be `null` |
	| `long` | `[sequenceNr](#sequenceNr())()` | This persistent message's sequence number. |
	| `long` | `[timestamp](#timestamp())()` | The `timestamp` is the time the event was stored, in milliseconds since midnight, January 1, 1970 UTC  (same as `System.currentTimeMillis`). |
	| `[PersistentRepr](PersistentRepr.html "interface in akka.persistence")` | `[update](#update(long,java.lang.String,boolean,akka.actor.ActorRef,java.lang.String))​(long sequenceNr,  java.lang.String persistenceId,  boolean deleted,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,  java.lang.String writerUuid)` | Creates a new copy of this [`PersistentRepr`](PersistentRepr.html "interface in akka.persistence"). |
	| `long` | `[update$default$1](#update$default$1())()` |  |
	| `java.lang.String` | `[update$default$2](#update$default$2())()` |  |
	| `boolean` | `[update$default$3](#update$default$3())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[update$default$4](#update$default$4())()` |  |
	| `java.lang.String` | `[update$default$5](#update$default$5())()` |  |
	| `[PersistentRepr](PersistentRepr.html "interface in akka.persistence")` | `[withManifest](#withManifest(java.lang.String))​(java.lang.String manifest)` | Creates a new persistent message with the specified event adapter `manifest`. |
	| `[PersistentRepr](PersistentRepr.html "interface in akka.persistence")` | `[withMetadata](#withMetadata(java.lang.Object))​(java.lang.Object metadata)` |  |
	| `[PersistentRepr](PersistentRepr.html "interface in akka.persistence")` | `[withPayload](#withPayload(java.lang.Object))​(java.lang.Object payload)` | Creates a new persistent message with the specified `payload` (event). |
	| `[PersistentRepr](PersistentRepr.html "interface in akka.persistence")` | `[withTimestamp](#withTimestamp(long))​(long newTimestamp)` |  |
	| `java.lang.String` | `[writerUuid](#writerUuid())()` | Unique identifier of the writing persistent actor. |

- - ### Method Detail
	
	
	
		- #### payload
		
		
		
		```
		java.lang.Object payload()
		```
		
		This persistent message's payload (the event).
		- #### manifest
		
		
		
		```
		java.lang.String manifest()
		```
		
		Returns the event adapter manifest for the persistent payload (event) if available
		 May be `""` if event adapter manifest is not used.
		 Note that this is not the same as the manifest of the serialized representation of the `payload`.
		- #### persistenceId
		
		
		
		```
		java.lang.String persistenceId()
		```
		
		Persistent id that journals a persistent message
		- #### sequenceNr
		
		
		
		```
		long sequenceNr()
		```
		
		This persistent message's sequence number.
		- #### timestamp
		
		
		
		```
		long timestamp()
		```
		
		The `timestamp` is the time the event was stored, in milliseconds since midnight, January 1, 1970 UTC
		 (same as `System.currentTimeMillis`).
		 
		 Value `0` is used if undefined.
		- #### withTimestamp
		
		
		
		```
		[PersistentRepr](PersistentRepr.html "interface in akka.persistence") withTimestamp​(long newTimestamp)
		```
		- #### metadata
		
		
		
		```
		scala.Option<java.lang.Object> metadata()
		```
		- #### withMetadata
		
		
		
		```
		[PersistentRepr](PersistentRepr.html "interface in akka.persistence") withMetadata​(java.lang.Object metadata)
		```
		- #### writerUuid
		
		
		
		```
		java.lang.String writerUuid()
		```
		
		Unique identifier of the writing persistent actor.
		 Used to detect anomalies with overlapping writes from multiple
		 persistent actors, which can result in inconsistent replays.
		- #### withPayload
		
		
		
		```
		[PersistentRepr](PersistentRepr.html "interface in akka.persistence") withPayload​(java.lang.Object payload)
		```
		
		Creates a new persistent message with the specified `payload` (event).
		- #### withManifest
		
		
		
		```
		[PersistentRepr](PersistentRepr.html "interface in akka.persistence") withManifest​(java.lang.String manifest)
		```
		
		Creates a new persistent message with the specified event adapter `manifest`.
		- #### deleted
		
		
		
		```
		boolean deleted()
		```
		
		Not used, can always be `false`.
		 
		 Not used in new records stored with Akka v2\.4, but
		 old records from v2\.3 may have this as `true` if
		 it was a non\-permanent delete.
		- #### sender
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") sender()
		```
		
		Not used, can be `null`
		- #### update
		
		
		
		```
		[PersistentRepr](PersistentRepr.html "interface in akka.persistence") update​(long sequenceNr,
		                      java.lang.String persistenceId,
		                      boolean deleted,
		                      [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,
		                      java.lang.String writerUuid)
		```
		
		Creates a new copy of this [`PersistentRepr`](PersistentRepr.html "interface in akka.persistence").
		- #### update$default$1
		
		
		
		```
		long update$default$1()
		```
		- #### update$default$2
		
		
		
		```
		java.lang.String update$default$2()
		```
		- #### update$default$3
		
		
		
		```
		boolean update$default$3()
		```
		- #### update$default$4
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") update$default$4()
		```
		- #### update$default$5
		
		
		
		```
		java.lang.String update$default$5()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/serialization/Message.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistentRepr.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistentRepr.html)*