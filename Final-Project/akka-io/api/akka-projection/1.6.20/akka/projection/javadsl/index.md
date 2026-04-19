---
description: Akka Projection 1.6.20 - akka.projection.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:37:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/index.html
title: Akka Projection 1.6.20 - akka.projection.javadsl
---

# Akka Projection 1.6.20 - akka.projection.javadsl

> **Summary:** Akka Projection 1.6.20 - akka.projection.javadsl

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/cassandra/index.html "Permalink")  package [cassandra](../cassandra/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/dynamodb/index.html "Permalink")  package [dynamodb](../dynamodb/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/eventsourced/index.html "Permalink")  package [eventsourced](../eventsourced/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../grpc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/javadsl/index.html "Permalink")  package javadslDefinition Classes[projection](../index.html)
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
- [**](../../../akka/projection/jdbc/index.html "Permalink")  package [jdbc](../jdbc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/kafka/index.html "Permalink")  package [kafka](../kafka/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/r2dbc/index.html "Permalink")  package [r2dbc](../r2dbc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/slick/index.html "Permalink")  package [slick](../slick/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[projection](../index.html)
p[akka](../../index.html).[projection](../index.html)

# javadsl[**](../../../akka/projection/javadsl/index.html "Permalink")

#### package javadsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/projection/javadsl/ActorHandler.html "Permalink") abstract  class [ActorHandler](ActorHandler.html "This Handler gives support for spawning an actor of a given Behavior to delegate processing of the envelopes to the actor.")\[Envelope, T] extends [Handler](Handler.html)\[Envelope]This [Handler](Handler.html) gives support for spawning an actor of a given `Behavior` to delegate
processing of the envelopes to the actor.

This [Handler](Handler.html) gives support for spawning an actor of a given `Behavior` to delegate
processing of the envelopes to the actor.

The lifecycle of the actor is managed by the `Projection`. The `behavior` is spawned when the
`Projection` is started and the `ActorRef` is passed in as a parameter to the `process` method.
The Actor is stopped when the `Projection` is stopped.
2. [**](../../../akka/projection/javadsl/AtLeastOnceFlowProjection.html "Permalink")  trait [AtLeastOnceFlowProjection](AtLeastOnceFlowProjection.html)\[Offset, Envelope] extends [Projection](../Projection.html)\[Envelope]Annotations@DoNotInherit()
3. [**](../../../akka/projection/javadsl/AtLeastOnceProjection.html "Permalink")  trait [AtLeastOnceProjection](AtLeastOnceProjection.html)\[Offset, Envelope] extends [Projection](../Projection.html)\[Envelope]Annotations@DoNotInherit()
4. [**](../../../akka/projection/javadsl/AtMostOnceProjection.html "Permalink")  trait [AtMostOnceProjection](AtMostOnceProjection.html)\[Offset, Envelope] extends [Projection](../Projection.html)\[Envelope]Annotations@DoNotInherit()
5. [**](../../../akka/projection/javadsl/ExactlyOnceProjection.html "Permalink")  trait [ExactlyOnceProjection](ExactlyOnceProjection.html)\[Offset, Envelope] extends [Projection](../Projection.html)\[Envelope]Annotations@DoNotInherit()
6. [**](../../../akka/projection/javadsl/GroupedProjection.html "Permalink")  trait [GroupedProjection](GroupedProjection.html)\[Offset, Envelope] extends [Projection](../Projection.html)\[Envelope]Annotations@DoNotInherit()
7. [**](../../../akka/projection/javadsl/Handler.html "Permalink") abstract  class [Handler](Handler.html "Implement this interface for the Envelope handler in the Projection.")\[Envelope] extends [HandlerLifecycle](HandlerLifecycle.html)Implement this interface for the Envelope handler in the `Projection`.

Implement this interface for the Envelope handler in the `Projection`. Some projections
may have more specific handler types.

It can be stateful, with variables and mutable data structures.
It is invoked by the `Projection` machinery one envelope at a time and visibility
guarantees between the invocations are handled automatically, i.e. no volatile or
other concurrency primitives are needed for managing the state.

Supported error handling strategies for when processing an `Envelope` fails can be
defined in configuration or using the `withRecoveryStrategy` method of a `Projection`
implementation.
8. [**](../../../akka/projection/javadsl/HandlerLifecycle.html "Permalink")  trait [HandlerLifecycle](HandlerLifecycle.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
9. [**](../../../akka/projection/javadsl/MergeableOffsetSourceProvider.html "Permalink")  trait [MergeableOffsetSourceProvider](MergeableOffsetSourceProvider.html)\[Offset \<: [MergeableOffset](../MergeableOffset.html)\[\_], Envelope] extends [SourceProvider](SourceProvider.html)\[Offset, Envelope]
10. [**](../../../akka/projection/javadsl/ProjectionManagement.html "Permalink")  class [ProjectionManagement](ProjectionManagement.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
11. [**](../../../akka/projection/javadsl/SourceProvider.html "Permalink") abstract  class [SourceProvider](SourceProvider.html)\[Offset, Envelope] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
12. [**](../../../akka/projection/javadsl/StatefulHandler.html "Permalink") abstract  class [StatefulHandler](StatefulHandler.html)\[State, Envelope] extends [Handler](Handler.html)\[Envelope]
13. [**](../../../akka/projection/javadsl/VerifiableSourceProvider.html "Permalink")  trait [VerifiableSourceProvider](VerifiableSourceProvider.html)\[Offset, Envelope] extends [SourceProvider](SourceProvider.html)\[Offset, Envelope]
### Value Members

1. [**](../../../akka/projection/javadsl/Handler$.html "Permalink")  object [Handler](Handler$.html)
2. [**](../../../akka/projection/javadsl/ProjectionManagement$.html "Permalink")  object [ProjectionManagement](ProjectionManagement$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/Projection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/dynamodb/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/internal/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ActorHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtMostOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ExactlyOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/Handler$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/HandlerLifecycle.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/MergeableOffsetSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ProjectionManagement$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ProjectionManagement.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/StatefulHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/VerifiableSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/kafka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/slick/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/state/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/index.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/index.html)*