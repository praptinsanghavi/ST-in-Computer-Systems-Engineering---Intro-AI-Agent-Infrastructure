---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/JournalInteractions.html
title: JournalInteractions
---

# JournalInteractions

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Interface JournalInteractions\<C,​E,​S\>

- ---

```
public interface JournalInteractions<C,​E,​S>
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal")` |  |
	| `static class` | `[JournalInteractions.EventToPersist$](JournalInteractions.EventToPersist$.html "class in akka.persistence.typed.internal")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[internalDeleteEvents](#internalDeleteEvents(long,long))​(long lastSequenceNr,  long toSequenceNr)` | On [`SaveSnapshotSuccess`](../../SaveSnapshotSuccess.html "class in akka.persistence"), if `SnapshotCountRetentionCriteria.deleteEventsOnSnapshot`  is enabled, old messages are deleted based on `SnapshotCountRetentionCriteria.snapshotEveryNEvents`  before old snapshots are deleted. |
	| `akka.persistence.typed.internal.Running.RunningState<[S](JournalInteractions.html "type parameter in JournalInteractions")>` | `[internalPersist](#internalPersist(%3Cany%3E,akka.persistence.typed.internal.Running.RunningState,java.lang.Object,java.lang.String,scala.Option))​(<any> cmd,  akka.persistence.typed.internal.Running.RunningState<[S](JournalInteractions.html "type parameter in JournalInteractions")> state,  java.lang.Object event,  java.lang.String eventAdapterManifest,  scala.Option<java.lang.Object> metadata)` |  |
	| `akka.persistence.typed.internal.Running.RunningState<[S](JournalInteractions.html "type parameter in JournalInteractions")>` | `[internalPersistAll](#internalPersistAll(%3Cany%3E,akka.persistence.typed.internal.Running.RunningState,scala.collection.immutable.Seq))​(<any> cmd,  akka.persistence.typed.internal.Running.RunningState<[S](JournalInteractions.html "type parameter in JournalInteractions")> state,  scala.collection.immutable.Seq<[JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal")> events)` |  |
	| `void` | `[onWriteInitiated](#onWriteInitiated(akka.actor.typed.scaladsl.ActorContext,java.lang.Object,akka.persistence.PersistentRepr))​([ActorContext](../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> ctx,  java.lang.Object cmd,  [PersistentRepr](../../PersistentRepr.html "interface in akka.persistence") repr)` |  |
	| `void` | `[onWritesInitiated](#onWritesInitiated(akka.actor.typed.scaladsl.ActorContext,java.lang.Object,scala.collection.immutable.Seq))​([ActorContext](../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> ctx,  java.lang.Object cmd,  scala.collection.immutable.Seq<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence")> repr)` |  |
	| `void` | `[replayEvents](#replayEvents(long,long))​(long fromSeqNr,  long toSeqNr)` |  |
	| `void` | `[requestRecoveryPermit](#requestRecoveryPermit())()` |  |
	| `scala.PartialFunction<scala.Tuple2<[ActorContext](../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.internal")>,​[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.internal")>>` | `[returnPermitOnStop](#returnPermitOnStop())()` | Intended to be used in .onSignal(returnPermitOnStop) by behaviors |
	| `akka.persistence.typed.internal.BehaviorSetup<[C](JournalInteractions.html "type parameter in JournalInteractions"),​[E](JournalInteractions.html "type parameter in JournalInteractions"),​[S](JournalInteractions.html "type parameter in JournalInteractions")>` | `[setup](#setup())()` |  |
	| `void` | `[tryReturnRecoveryPermit](#tryReturnRecoveryPermit(java.lang.String))​(java.lang.String reason)` | Mutates setup, by setting the \`holdingRecoveryPermit\` to false |

- - ### Method Detail
	
	
	
		- #### setup
		
		
		
		```
		akka.persistence.typed.internal.BehaviorSetup<[C](JournalInteractions.html "type parameter in JournalInteractions"),​[E](JournalInteractions.html "type parameter in JournalInteractions"),​[S](JournalInteractions.html "type parameter in JournalInteractions")> setup()
		```
		- #### internalPersist
		
		
		
		```
		akka.persistence.typed.internal.Running.RunningState<[S](JournalInteractions.html "type parameter in JournalInteractions")> internalPersist​(<any> cmd,
		                                                                        akka.persistence.typed.internal.Running.RunningState<[S](JournalInteractions.html "type parameter in JournalInteractions")> state,
		                                                                        java.lang.Object event,
		                                                                        java.lang.String eventAdapterManifest,
		                                                                        scala.Option<java.lang.Object> metadata)
		```
		- #### onWriteInitiated
		
		
		
		```
		void onWriteInitiated​([ActorContext](../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> ctx,
		                      java.lang.Object cmd,
		                      [PersistentRepr](../../PersistentRepr.html "interface in akka.persistence") repr)
		```
		- #### internalPersistAll
		
		
		
		```
		akka.persistence.typed.internal.Running.RunningState<[S](JournalInteractions.html "type parameter in JournalInteractions")> internalPersistAll​(<any> cmd,
		                                                                           akka.persistence.typed.internal.Running.RunningState<[S](JournalInteractions.html "type parameter in JournalInteractions")> state,
		                                                                           scala.collection.immutable.Seq<[JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal")> events)
		```
		- #### onWritesInitiated
		
		
		
		```
		void onWritesInitiated​([ActorContext](../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> ctx,
		                       java.lang.Object cmd,
		                       scala.collection.immutable.Seq<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence")> repr)
		```
		- #### replayEvents
		
		
		
		```
		void replayEvents​(long fromSeqNr,
		                  long toSeqNr)
		```
		- #### requestRecoveryPermit
		
		
		
		```
		void requestRecoveryPermit()
		```
		- #### returnPermitOnStop
		
		
		
		```
		scala.PartialFunction<scala.Tuple2<[ActorContext](../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.internal")>,​[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.internal")>> returnPermitOnStop()
		```
		
		Intended to be used in .onSignal(returnPermitOnStop) by behaviors
		- #### tryReturnRecoveryPermit
		
		
		
		```
		void tryReturnRecoveryPermit​(java.lang.String reason)
		```
		
		Mutates setup, by setting the \`holdingRecoveryPermit\` to false
		- #### internalDeleteEvents
		
		
		
		```
		void internalDeleteEvents​(long lastSequenceNr,
		                          long toSequenceNr)
		```
		
		On [`SaveSnapshotSuccess`](../../SaveSnapshotSuccess.html "class in akka.persistence"), if `SnapshotCountRetentionCriteria.deleteEventsOnSnapshot`
		 is enabled, old messages are deleted based on `SnapshotCountRetentionCriteria.snapshotEveryNEvents`
		 before old snapshots are deleted.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SaveSnapshotSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/InternalProtocol.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/JournalInteractions.EventToPersist$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/JournalInteractions.EventToPersist.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/JournalInteractions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/JournalInteractions.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/JournalInteractions.html)*