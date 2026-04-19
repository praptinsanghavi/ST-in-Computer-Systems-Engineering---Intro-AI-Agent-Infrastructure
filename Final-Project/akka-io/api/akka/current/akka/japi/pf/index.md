---
description: Akka 2.10.17 - akka.japi.pf
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:40:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/pf/index.html
title: Akka 2.10.17 - akka.japi.pf
---

# Akka 2.10.17 - akka.japi.pf

> **Summary:** Akka 2.10.17 - akka.japi.pf

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/japi/index.html "Permalink")  package [japi](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/japi/function/index.html "Permalink")  package [function](../function/index.html)Definition Classes[japi](../index.html)
- [**](../../../akka/japi/pf/index.html "Permalink")  package pfDefinition Classes[japi](../index.html)
- [DeciderBuilder](DeciderBuilder.html "Used for building a partial function for Actor.supervisorStrategy().")
- [FI](FI.html "Class that encapsulates Functional Interfaces used for creating partial functions.")
- [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "Builder used to create a partial function for akka.actor.FSM#whenUnhandled.")
- [FSMStopBuilder](FSMStopBuilder.html "Builder used to create a partial function for akka.actor.FSM#onTermination.")
- [FSMTransitionHandlerBuilder](FSMTransitionHandlerBuilder.html "Builder used to create a partial function for akka.actor.FSM#onTransition.")
- [Match](Match.html "Version of scala.PartialFunction that can be built during runtime from Java.")
- [PFBuilder](PFBuilder.html "A builder for scala.PartialFunction.")
- [ReceiveBuilder](ReceiveBuilder.html "Used for building a partial function for AbstractActor.createReceive().")
- [UnitMatch](UnitMatch.html "Version of scala.PartialFunction that can be built during runtime from Java.")
- [UnitPFBuilder](UnitPFBuilder.html "A builder for scala.PartialFunction.")
- [**](../../../akka/japi/tuple/index.html "Permalink")  package [tuple](../tuple/index.html)Definition Classes[japi](../index.html)
p[akka](../../index.html).[japi](../index.html)

# pf[**](../../../akka/japi/pf/index.html "Permalink")

#### package pf

### Type Members

1. [**](../../../akka/japi/pf/DeciderBuilder.html "Permalink")  class [DeciderBuilder](DeciderBuilder.html "Used for building a partial function for Actor.supervisorStrategy().") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Used for building a partial function for `Actor.supervisorStrategy()`.

Used for building a partial function for `Actor.supervisorStrategy()`. \* Inside an actor you can use it like this with Java 8 to define
your supervisorStrategy.

Example:

```

@Override
private static SupervisorStrategy strategy =
  new OneForOneStrategy(10, Duration.ofMinutes(1), DeciderBuilder.
    match(ArithmeticException.class, e -> resume()).
    match(NullPointerException.class, e -> restart()).
    match(IllegalArgumentException.class, e -> stop()).
    matchAny(o -> escalate()).build());

@Override
public SupervisorStrategy supervisorStrategy() {
  return strategy;
}

```
2. [**](../../../akka/japi/pf/FI.html "Permalink") final  class [FI](FI.html "Class that encapsulates Functional Interfaces used for creating partial functions.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Class that encapsulates Functional Interfaces used for creating partial functions.

Class that encapsulates Functional Interfaces used for creating partial functions.

These classes are kept for compatibility, but for future API's please prefer the ones in
`[akka.japi.function](../function/index.html)`.
3. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html "Permalink")  class [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "Builder used to create a partial function for akka.actor.FSM#whenUnhandled.")\[S, D] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Builder used to create a partial function for `[akka.actor.FSM#whenUnhandled](../../actor/FSM.html#whenUnhandled(stateFunction:FSM.this.StateFunction):Unit)`.

Builder used to create a partial function for `[akka.actor.FSM#whenUnhandled](../../actor/FSM.html#whenUnhandled(stateFunction:FSM.this.StateFunction):Unit)`.

Annotations@SuppressWarnings()
4. [**](../../../akka/japi/pf/FSMStopBuilder.html "Permalink")  class [FSMStopBuilder](FSMStopBuilder.html "Builder used to create a partial function for akka.actor.FSM#onTermination.")\[S, D] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Builder used to create a partial function for `[akka.actor.FSM#onTermination](../../actor/FSM.html#onTermination(terminationHandler:PartialFunction[FSM.this.StopEvent,Unit]):Unit)`.
5. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html "Permalink")  class [FSMTransitionHandlerBuilder](FSMTransitionHandlerBuilder.html "Builder used to create a partial function for akka.actor.FSM#onTransition.")\[S] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Builder used to create a partial function for `[akka.actor.FSM#onTransition](../../actor/FSM.html#onTransition(transitionHandler:FSM.this.TransitionHandler):Unit)`.
6. [**](../../../akka/japi/pf/Match.html "Permalink")  class [Match](Match.html "Version of scala.PartialFunction that can be built during runtime from Java.")\[I, R] extends AbstractMatch\[I, R]Version of `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` that can be built during runtime from Java.
7. [**](../../../akka/japi/pf/PFBuilder.html "Permalink") final  class [PFBuilder](PFBuilder.html "A builder for scala.PartialFunction.")\[I, R] extends AbstractPFBuilder\[I, R]A builder for `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)`.
8. [**](../../../akka/japi/pf/ReceiveBuilder.html "Permalink")  class [ReceiveBuilder](ReceiveBuilder.html "Used for building a partial function for AbstractActor.createReceive().") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Used for building a partial function for `AbstractActor.createReceive()`.

Used for building a partial function for `AbstractActor.createReceive()`.

There is both a match on type only, and a match on type and predicate.

Inside an actor you can use it like this:

Example:

```

@Override
public Receive createReceive() {
  return receiveBuilder()
    .match(Double.class, d -> {
      getSender().tell(d.isNaN() ? 0 : d, self());
    })
    .match(Integer.class, i -> {
      getSender().tell(i * 10, self());
    })
    .match(String.class, s -> s.startsWith("foo"), s -> {
      getSender().tell(s.toUpperCase(), self());
    })
    .build()
  );
}

```
9. [**](../../../akka/japi/pf/UnitMatch.html "Permalink")  class [UnitMatch](UnitMatch.html "Version of scala.PartialFunction that can be built during runtime from Java.")\[I] extends AbstractMatch\[I, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]Version of `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` that can be built during runtime from Java.

Version of `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` that can be built during runtime from Java. This is a
specialized version of `[UnitMatch](UnitMatch.html)` to map java void methods to `scala.runtime.BoxedUnit`.
10. [**](../../../akka/japi/pf/UnitPFBuilder.html "Permalink") final  class [UnitPFBuilder](UnitPFBuilder.html "A builder for scala.PartialFunction.")\[I] extends AbstractPFBuilder\[I, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]A builder for `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)`.

A builder for `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)`. This is a specialized version of `[PFBuilder](PFBuilder.html)`
to map java void methods to `[scala.runtime.BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html)`.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/FSM.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/function/index.html
- https://doc.akka.io/api/akka/current/akka/japi/index.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/DeciderBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/FI.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/FSMStateFunctionBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/FSMStopBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/FSMTransitionHandlerBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/Match.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/PFBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/ReceiveBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/UnitMatch.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/UnitPFBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/index.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/japi/pf/index.html](https://doc.akka.io/api/akka/current/akka/japi/pf/index.html)*