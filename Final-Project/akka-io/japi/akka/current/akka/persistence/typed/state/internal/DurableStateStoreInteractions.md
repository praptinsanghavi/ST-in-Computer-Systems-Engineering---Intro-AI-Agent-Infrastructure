---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/DurableStateStoreInteractions.html
title: DurableStateStoreInteractions
---

# DurableStateStoreInteractions

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Interface DurableStateStoreInteractions\<C,​S\>

- ---

```
public interface DurableStateStoreInteractions<C,​S>
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.typed.state.internal.Running.RunningState<[S](DurableStateStoreInteractions.html "type parameter in DurableStateStoreInteractions")>` | `[internalDelete](#internalDelete(akka.actor.typed.scaladsl.ActorContext,java.lang.Object,akka.persistence.typed.state.internal.Running.RunningState,%3Cany%3E))​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> ctx,  java.lang.Object cmd,  akka.persistence.typed.state.internal.Running.RunningState<[S](DurableStateStoreInteractions.html "type parameter in DurableStateStoreInteractions")> state,  <any> changeEvent)` |  |
	| `void` | `[internalGet](#internalGet(akka.actor.typed.scaladsl.ActorContext))​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> ctx)` |  |
	| `akka.persistence.typed.state.internal.Running.RunningState<[S](DurableStateStoreInteractions.html "type parameter in DurableStateStoreInteractions")>` | `[internalUpsert](#internalUpsert(akka.actor.typed.scaladsl.ActorContext,java.lang.Object,akka.persistence.typed.state.internal.Running.RunningState,java.lang.Object,%3Cany%3E))​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> ctx,  java.lang.Object cmd,  akka.persistence.typed.state.internal.Running.RunningState<[S](DurableStateStoreInteractions.html "type parameter in DurableStateStoreInteractions")> state,  java.lang.Object value,  <any> changeEvent)` |  |
	| `void` | `[onWriteInitiated](#onWriteInitiated(akka.actor.typed.scaladsl.ActorContext,java.lang.Object))​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> ctx,  java.lang.Object cmd)` |  |
	| `void` | `[requestRecoveryPermit](#requestRecoveryPermit())()` |  |
	| `scala.PartialFunction<scala.Tuple2<[ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")>,​[Signal](../../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")>>` | `[returnPermitOnStop](#returnPermitOnStop())()` | Intended to be used in .onSignal(returnPermitOnStop) by behaviors |
	| `akka.persistence.typed.state.internal.BehaviorSetup<[C](DurableStateStoreInteractions.html "type parameter in DurableStateStoreInteractions"),​[S](DurableStateStoreInteractions.html "type parameter in DurableStateStoreInteractions")>` | `[setup](#setup())()` |  |
	| `void` | `[tryReturnRecoveryPermit](#tryReturnRecoveryPermit(java.lang.String))​(java.lang.String reason)` | Mutates setup, by setting the \`holdingRecoveryPermit\` to false |

- - ### Method Detail
	
	
	
		- #### internalDelete
		
		
		
		```
		akka.persistence.typed.state.internal.Running.RunningState<[S](DurableStateStoreInteractions.html "type parameter in DurableStateStoreInteractions")> internalDelete​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> ctx,
		                                                                             java.lang.Object cmd,
		                                                                             akka.persistence.typed.state.internal.Running.RunningState<[S](DurableStateStoreInteractions.html "type parameter in DurableStateStoreInteractions")> state,
		                                                                             <any> changeEvent)
		```
		- #### internalGet
		
		
		
		```
		void internalGet​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> ctx)
		```
		- #### internalUpsert
		
		
		
		```
		akka.persistence.typed.state.internal.Running.RunningState<[S](DurableStateStoreInteractions.html "type parameter in DurableStateStoreInteractions")> internalUpsert​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> ctx,
		                                                                             java.lang.Object cmd,
		                                                                             akka.persistence.typed.state.internal.Running.RunningState<[S](DurableStateStoreInteractions.html "type parameter in DurableStateStoreInteractions")> state,
		                                                                             java.lang.Object value,
		                                                                             <any> changeEvent)
		```
		- #### onWriteInitiated
		
		
		
		```
		void onWriteInitiated​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> ctx,
		                      java.lang.Object cmd)
		```
		- #### requestRecoveryPermit
		
		
		
		```
		void requestRecoveryPermit()
		```
		- #### returnPermitOnStop
		
		
		
		```
		scala.PartialFunction<scala.Tuple2<[ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")>,​[Signal](../../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")>> returnPermitOnStop()
		```
		
		Intended to be used in .onSignal(returnPermitOnStop) by behaviors
		- #### setup
		
		
		
		```
		akka.persistence.typed.state.internal.BehaviorSetup<[C](DurableStateStoreInteractions.html "type parameter in DurableStateStoreInteractions"),​[S](DurableStateStoreInteractions.html "type parameter in DurableStateStoreInteractions")> setup()
		```
		- #### tryReturnRecoveryPermit
		
		
		
		```
		void tryReturnRecoveryPermit​(java.lang.String reason)
		```
		
		Mutates setup, by setting the \`holdingRecoveryPermit\` to false

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/DurableStateStoreInteractions.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/DurableStateStoreInteractions.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/DurableStateStoreInteractions.html)*