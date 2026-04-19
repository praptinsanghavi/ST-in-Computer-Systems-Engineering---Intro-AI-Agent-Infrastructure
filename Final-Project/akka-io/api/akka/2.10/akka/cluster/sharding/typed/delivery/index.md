---
description: Akka 2.10.17 - akka.cluster.sharding.typed.delivery
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:38:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/delivery/index.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.delivery
---

# Akka 2.10.17 - akka.cluster.sharding.typed.delivery

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.delivery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/delivery/index.html "Permalink")  package deliveryDefinition Classes[typed](../index.html)
- [ShardingConsumerController](ShardingConsumerController$.html "ShardingConsumerController is used together with ShardingProducerController.")
- [ShardingProducerController](ShardingProducerController$.html "Reliable delivery between a producer actor sending messages to sharded consumer actors receiving the messages.")
- [**](../../../../../akka/cluster/sharding/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/cluster/sharding/typed/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/cluster/sharding/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/cluster/sharding/typed/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[typed](../index.html)
p[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html)

# delivery[**](../../../../../akka/cluster/sharding/typed/delivery/index.html "Permalink")

#### package delivery

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html "Permalink")  object [ShardingConsumerController](ShardingConsumerController$.html "ShardingConsumerController is used together with ShardingProducerController.")`ShardingConsumerController` is used together with [ShardingProducerController](ShardingProducerController$.html).

`ShardingConsumerController` is used together with [ShardingProducerController](ShardingProducerController$.html). See the description
in that class or the Akka reference documentation for how they are intended to be used.

`ShardingConsumerController` is the entity that is initialized in `ClusterSharding`. It will manage
the lifecycle and message delivery to the destination consumer actor.

The destination consumer actor will start the flow by sending an initial ConsumerController.Start
message via the `ActorRef` provided in the factory function of the consumer `Behavior`.
The `ActorRef` in the `Start` message is typically constructed as a message adapter to map the
ConsumerController.Delivery to the protocol of the consumer actor.

Received messages from the producer are wrapped in ConsumerController.Delivery when sent to the consumer,
which is supposed to reply with ConsumerController.Confirmed when it has processed the message.
Next message from a specific producer is not delivered until the previous is confirmed. However, since
there can be several producers, e.g. one per node, sending to the same destination entity there can be
several `Delivery` in flight at the same time.
More messages from a specific producer that arrive while waiting for the confirmation are stashed by
the `ConsumerController` and delivered when previous message was confirmed.

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
2. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$.html "Permalink")  object [ShardingProducerController](ShardingProducerController$.html "Reliable delivery between a producer actor sending messages to sharded consumer actors receiving the messages.")Reliable delivery between a producer actor sending messages to sharded consumer
actors receiving the messages.

Reliable delivery between a producer actor sending messages to sharded consumer
actors receiving the messages.

The `ShardingProducerController` should be used together with [ShardingConsumerController](ShardingConsumerController$.html).

A producer can send messages via a `ShardingProducerController` to any `ShardingConsumerController`
identified by an `entityId`. A single `ShardingProducerController` per `ActorSystem` (node) can be
shared for sending to all entities of a certain entity type. No explicit registration is needed
between the `ShardingConsumerController` and `ShardingProducerController`.

The producer actor will start the flow by sending a [ShardingProducerController.Start](ShardingProducerController$$Start.html)
message to the `ShardingProducerController`. The `ActorRef` in the `Start` message is
typically constructed as a message adapter to map the [ShardingProducerController.RequestNext](ShardingProducerController$$RequestNext.html)
to the protocol of the producer actor.

The `ShardingProducerController` sends `RequestNext` to the producer, which is then allowed
to send one message to the `ShardingProducerController` via the `sendNextTo` in the `RequestNext`.
Thereafter the producer will receive a new `RequestNext` when it's allowed to send one more message.

In the `RequestNext` message there is information about which entities that have demand. It is allowed
to send to a new `entityId` that is not included in the `RequestNext.entitiesWithDemand`. If sending to
an entity that doesn't have demand the message will be buffered. This support for buffering means that
it is even allowed to send several messages in response to one `RequestNext` but it's recommended to
only send one message and wait for next `RequestNext` before sending more messages.

The producer and `ShardingProducerController` actors are supposed to be local so that these messages are
fast and not lost. This is enforced by a runtime check.

There will be one `ShardingConsumerController` for each entity. Many unconfirmed messages can be in
flight between the `ShardingProducerController` and each `ShardingConsumerController`. The flow control
is driven by the consumer side, which means that the `ShardingProducerController` will not send faster
than the demand requested by the consumers.

Lost messages are detected, resent and deduplicated if needed. This is also driven by the consumer side,
which means that the `ShardingProducerController` will not push resends unless requested by the
`ShardingConsumerController`.

Until sent messages have been confirmed the `ShardingProducerController` keeps them in memory to be able to
resend them. If the JVM of the `ShardingProducerController` crashes those unconfirmed messages are lost.
To make sure the messages can be delivered also in that scenario the `ShardingProducerController` can be
used with a DurableProducerQueue. Then the unconfirmed messages are stored in a durable way so
that they can be redelivered when the producer is started again. An implementation of the
`DurableProducerQueue` is provided by `EventSourcedProducerQueue` in `akka-persistence-typed`.

Instead of using `tell` with the `sendNextTo` in the `RequestNext` the producer can use `context.ask`
with the `askNextTo` in the `RequestNext`. The difference is that a reply is sent back when the
message has been handled. If a `DurableProducerQueue` is used then the reply is sent when the message
has been stored successfully, but it might not have been processed by the consumer yet. Otherwise the
reply is sent after the consumer has processed and confirmed the message.

It's also possible to use the `ShardingProducerController` and `ShardingConsumerController` without resending
lost messages, but the flow control is still used. This can be more efficient since messages
don't have to be kept in memory in the `ProducerController` until they have been
confirmed, but the drawback is that lost messages will not be delivered. See configuration
`only-flow-control` of the `ShardingConsumerController`.

The `producerId` is used in logging and included as MDC entry with key `"producerId"`. It's propagated
to the `ConsumerController` and is useful for correlating log messages. It can be any `String` but it's
recommended to use a unique identifier of representing the producer.

If the `DurableProducerQueue` is defined it is created as a child actor of the `ShardingProducerController` actor.
`ProducerController` actors are created for each destination entity. Those child actors use the same dispatcher
as the parent `ShardingProducerController`.

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$$RequestNext.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$$Start.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/delivery/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/internal/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/testkit/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/delivery/index.html](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/delivery/index.html)*