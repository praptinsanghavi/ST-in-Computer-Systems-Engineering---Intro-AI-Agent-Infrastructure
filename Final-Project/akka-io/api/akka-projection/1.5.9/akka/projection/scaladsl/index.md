---
description: Akka Projection 1.5.9 - akka.projection.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:32:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/index.html
title: Akka Projection 1.5.9 - akka.projection.scaladsl
---

# Akka Projection 1.5.9 - akka.projection.scaladsl

> **Summary:** Akka Projection 1.5.9 - akka.projection.scaladsl

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/cassandra/index.html "Permalink")  package [cassandra](../cassandra/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/eventsourced/index.html "Permalink")  package [eventsourced](../eventsourced/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../grpc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/jdbc/index.html "Permalink")  package [jdbc](../jdbc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/kafka/index.html "Permalink")  package [kafka](../kafka/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/r2dbc/index.html "Permalink")  package [r2dbc](../r2dbc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[projection](../index.html)
- [ActorHandler](ActorHandler.html "This Handler gives support for spawning an actor of a given Behavior to delegate processing of the envelopes to the actor.")
- [AtLeastOnceFlowProjection](AtLeastOnceFlowProjection.html)
- [AtLeastOnceProjection](AtLeastOnceProjection.html)
- [AtMostOnceProjection](AtMostOnceProjection.html)
- [ExactlyOnceProjection](ExactlyOnceProjection.html)
- [GroupedProjection](GroupedProjection.html)
- [Handler](Handler.html "Implement this interface for the Envelope handler in the Projection.")
- [HandlerLifecycle](HandlerLifecycle.html)
- [MergeableOffsetSourceProvider](MergeableOffsetSourceProvider.html)
- [ProjectionManagement](ProjectionManagement.html)
- [SourceProvider](SourceProvider.html)
- [StatefulHandler](StatefulHandler.html)
- [VerifiableSourceProvider](VerifiableSourceProvider.html)
- [**](../../../akka/projection/slick/index.html "Permalink")  package [slick](../slick/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[projection](../index.html)
p[akka](../../index.html).[projection](../index.html)

# scaladsl[**](../../../akka/projection/scaladsl/index.html "Permalink")

#### package scaladsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/projection/scaladsl/ActorHandler.html "Permalink") abstract  class [ActorHandler](ActorHandler.html "This Handler gives support for spawning an actor of a given Behavior to delegate processing of the envelopes to the actor.")\[Envelope, T] extends [Handler](Handler.html)\[Envelope] with ActorHandlerInit\[T]This [Handler](Handler.html) gives support for spawning an actor of a given `Behavior` to delegate
processing of the envelopes to the actor.

This [Handler](Handler.html) gives support for spawning an actor of a given `Behavior` to delegate
processing of the envelopes to the actor.

The lifecycle of the actor is managed by the `Projection`. The `behavior` is spawned when the
`Projection` is started and the `ActorRef` is passed in as a parameter to the `process` method.
The Actor is stopped when the `Projection` is stopped.
2. [**](../../../akka/projection/scaladsl/AtLeastOnceFlowProjection.html "Permalink")  trait [AtLeastOnceFlowProjection](AtLeastOnceFlowProjection.html)\[Offset, Envelope] extends [Projection](../Projection.html)\[Envelope]Annotations@DoNotInherit()
3. [**](../../../akka/projection/scaladsl/AtLeastOnceProjection.html "Permalink")  trait [AtLeastOnceProjection](AtLeastOnceProjection.html)\[Offset, Envelope] extends [Projection](../Projection.html)\[Envelope]Annotations@DoNotInherit()
4. [**](../../../akka/projection/scaladsl/AtMostOnceProjection.html "Permalink")  trait [AtMostOnceProjection](AtMostOnceProjection.html)\[Offset, Envelope] extends [Projection](../Projection.html)\[Envelope]Annotations@DoNotInherit()
5. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html "Permalink")  trait [ExactlyOnceProjection](ExactlyOnceProjection.html)\[Offset, Envelope] extends [Projection](../Projection.html)\[Envelope]Annotations@DoNotInherit()
6. [**](../../../akka/projection/scaladsl/GroupedProjection.html "Permalink")  trait [GroupedProjection](GroupedProjection.html)\[Offset, Envelope] extends [Projection](../Projection.html)\[Envelope]Annotations@DoNotInherit()
7. [**](../../../akka/projection/scaladsl/Handler.html "Permalink")  trait [Handler](Handler.html "Implement this interface for the Envelope handler in the Projection.")\[Envelope] extends [HandlerLifecycle](HandlerLifecycle.html)Implement this interface for the Envelope handler in the `Projection`.

Implement this interface for the Envelope handler in the `Projection`. Some projections
may have more specific handler types.

It can be stateful, with variables and mutable data structures.
It is invoked by the `Projection` machinery one envelope at a time and visibility
guarantees between the invocations are handled automatically, i.e. no volatile or
other concurrency primitives are needed for managing the state.

Supported error handling strategies for when processing an `Envelope` fails can be
defined in configuration or using the `withRecoveryStrategy` method of a `Projection`
implementation.
8. [**](../../../akka/projection/scaladsl/HandlerLifecycle.html "Permalink")  trait [HandlerLifecycle](HandlerLifecycle.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)
9. [**](../../../akka/projection/scaladsl/MergeableOffsetSourceProvider.html "Permalink")  trait [MergeableOffsetSourceProvider](MergeableOffsetSourceProvider.html)\[Offset \<: [MergeableOffset](../MergeableOffset.html)\[\_], Envelope] extends [SourceProvider](SourceProvider.html)\[Offset, Envelope]
10. [**](../../../akka/projection/scaladsl/ProjectionManagement.html "Permalink")  class [ProjectionManagement](ProjectionManagement.html) extends [Extension](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/Extension.html#akka.actor.typed.Extension)
11. [**](../../../akka/projection/scaladsl/SourceProvider.html "Permalink")  trait [SourceProvider](SourceProvider.html)\[Offset, Envelope] extends [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)
12. [**](../../../akka/projection/scaladsl/StatefulHandler.html "Permalink") abstract  class [StatefulHandler](StatefulHandler.html)\[State, Envelope] extends [Handler](Handler.html)\[Envelope]
13. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html "Permalink")  trait [VerifiableSourceProvider](VerifiableSourceProvider.html)\[Offset, Envelope] extends [SourceProvider](SourceProvider.html)\[Offset, Envelope]
### Value Members

1. [**](../../../akka/projection/scaladsl/Handler$.html "Permalink")  object [Handler](Handler$.html)
2. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html "Permalink")  object [ProjectionManagement](ProjectionManagement$.html) extends [ExtensionId](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ExtensionId.html#akka.actor.typed.ExtensionId)\[[ProjectionManagement](ProjectionManagement.html)]
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/MergeableOffset.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/Projection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/cassandra/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/eventsourced/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/internal/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/kafka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/r2dbc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ActorHandler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/AtMostOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ExactlyOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/Handler$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/HandlerLifecycle.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/MergeableOffsetSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ProjectionManagement$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ProjectionManagement.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/StatefulHandler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/VerifiableSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/slick/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/state/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/testkit/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ExtensionId.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/index.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/index.html)*