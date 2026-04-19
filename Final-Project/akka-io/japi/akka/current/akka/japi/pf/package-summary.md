---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:38:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/pf/package-summary.html
title: akka.japi.pf
---

# akka.japi.pf

## Content

# Package akka.japi.pf

- Interface Summary 
| Interface | Description |
| [FI.Apply](FI.Apply.html "interface in akka.japi.pf")\<I,​R\> | Functional interface for an application. |
| --- | --- |
| [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")\<I1,​I2,​R\> | Functional interface for an application. |
| [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")\<T\> | Functional interface for a predicate. |
| [FI.TypedPredicate2](FI.TypedPredicate2.html "interface in akka.japi.pf")\<T,​U\> | Functional interface for a predicate. |
| [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")\<I\> | Functional interface for an application. |
| [FI.UnitApply2](FI.UnitApply2.html "interface in akka.japi.pf")\<I1,​I2\> | Functional interface for an application. |
| [FI.UnitApply3](FI.UnitApply3.html "interface in akka.japi.pf")\<I1,​I2,​I3\> | Functional interface for an application. |
| [FI.UnitApply4](FI.UnitApply4.html "interface in akka.japi.pf")\<I1,​I2,​I3,​I4\> | Functional interface for an application. |
| [FI.UnitApplyVoid](FI.UnitApplyVoid.html "interface in akka.japi.pf") | Functional interface for an application. |
- Class Summary 
| Class | Description |
| [CaseStatement$](CaseStatement$.html "class in akka.japi.pf") |  |
| --- | --- |
| [DeciderBuilder](DeciderBuilder.html "class in akka.japi.pf") | Used for building a partial function for [`Actor.supervisorStrategy()`](../../actor/Actor.html#supervisorStrategy()). |
| [FI](FI.html "class in akka.japi.pf") | Class that encapsulates Functional Interfaces used for creating partial functions. |
| [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")\<S,​D\> | Builder used to create a partial function for [`FSM.whenUnhandled(scala.PartialFunction<akka.actor.FSM.Event<D>, akka.actor.FSM.State<S, D>>)`](../../actor/FSM.html#whenUnhandled(scala.PartialFunction)). |
| [FSMStopBuilder](FSMStopBuilder.html "class in akka.japi.pf")\<S,​D\> | Builder used to create a partial function for [`FSM.onTermination(scala.PartialFunction<akka.actor.FSM.StopEvent<S, D>, scala.runtime.BoxedUnit>)`](../../actor/FSM.html#onTermination(scala.PartialFunction)). |
| [FSMTransitionHandlerBuilder](FSMTransitionHandlerBuilder.html "class in akka.japi.pf")\<S\> | Builder used to create a partial function for [`FSM.onTransition(scala.PartialFunction<scala.Tuple2<S, S>, scala.runtime.BoxedUnit>)`](../../actor/FSM.html#onTransition(scala.PartialFunction)). |
| [Match](Match.html "class in akka.japi.pf")\<I,​R\> | Version of `PartialFunction` that can be built during runtime from Java. |
| [PFBuilder](PFBuilder.html "class in akka.japi.pf")\<I,​R\> | A builder for `PartialFunction`. |
| [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") | Used for building a partial function for [`AbstractActor.createReceive()`](../../actor/AbstractActor.html#createReceive()). |
| [UnitMatch](UnitMatch.html "class in akka.japi.pf")\<I\> | Version of `PartialFunction` that can be built during runtime from Java. |
| [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")\<I\> | A builder for `PartialFunction`. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/CaseStatement$.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/DeciderBuilder.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.Apply.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.Apply2.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.TypedPredicate.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.TypedPredicate2.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.UnitApply.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.UnitApply2.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.UnitApply3.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.UnitApply4.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.UnitApplyVoid.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FSMStateFunctionBuilder.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FSMStopBuilder.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FSMTransitionHandlerBuilder.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/Match.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/PFBuilder.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/ReceiveBuilder.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/UnitMatch.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/UnitPFBuilder.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/pf/package-summary.html](https://doc.akka.io/japi/akka/current/akka/japi/pf/package-summary.html)*