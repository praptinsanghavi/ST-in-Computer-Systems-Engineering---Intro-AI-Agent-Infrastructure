---
description: Akka 2.10.17 - akka.actor.typed.delivery
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:41:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/index.html
title: Akka 2.10.17 - akka.actor.typed.delivery
---

# Akka 2.10.17 - akka.actor.typed.delivery

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/delivery/index.html "Permalink")  package deliveryDefinition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/delivery/internal/index.html "Permalink")  package [internal](internal/index.html)
- [ConsumerController](ConsumerController$.html "ConsumerController and ProducerController or WorkPullingProducerController are used together.")
- [DurableProducerQueue](DurableProducerQueue$.html "Actor message protocol for storing and confirming reliable delivery of messages.")
- [ProducerController](ProducerController$.html "Point-to-point reliable delivery between a single producer actor sending messages and a single consumer actor receiving the messages.")
- [WorkPullingProducerController](WorkPullingProducerController$.html "Work pulling is a pattern where several worker actors pull tasks in their own pace from a shared work manager instead of that the manager pushes work to the workers blindly without knowing their individual capacity and current availability.")
- [**](../../../../akka/actor/typed/eventstream/index.html "Permalink")  package [eventstream](../eventstream/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](../pubsub/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](../receptionist/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
p[akka](../../../index.html).[actor](../../index.html).[typed](../index.html)

# delivery[**](../../../../akka/actor/typed/delivery/index.html "Permalink")

#### package delivery

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/actor/typed/delivery/internal/index.html "Permalink")  package [internal](internal/index.html)
### Value Members

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html "Permalink")  object [ConsumerController](ConsumerController$.html "ConsumerController and ProducerController or WorkPullingProducerController are used together.")`ConsumerController` and [ProducerController](ProducerController$.html) or [WorkPullingProducerController](WorkPullingProducerController$.html) are used
together.

`ConsumerController` and [ProducerController](ProducerController$.html) or [WorkPullingProducerController](WorkPullingProducerController$.html) are used
together. See the descriptions in those classes or the Akka reference documentation for
how they are intended to be used.

The destination consumer actor will start the flow by sending an initial [ConsumerController.Start](ConsumerController$$Start.html)
message to the `ConsumerController`. The `ActorRef` in the `Start` message is typically constructed
as a message adapter to map the [ConsumerController.Delivery](ConsumerController$$Delivery.html) to the protocol of the consumer actor.

Received messages from the producer are wrapped in [ConsumerController.Delivery](ConsumerController$$Delivery.html) when sent to the consumer,
which is supposed to reply with [ConsumerController.Confirmed](ConsumerController$$Confirmed.html) when it has processed the message.
Next message is not delivered until the previous is confirmed.
More messages from the producer that arrive while waiting for the confirmation are stashed by
the `ConsumerController` and delivered when previous message was confirmed.

The consumer and the `ConsumerController` actors are supposed to be local so that these messages are fast
and not lost. This is enforced by a runtime check.

The `ConsumerController` is automatically stopped when the consumer that registered with the `Start`
message is terminated.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
2. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html "Permalink")  object [DurableProducerQueue](DurableProducerQueue$.html "Actor message protocol for storing and confirming reliable delivery of messages.")Actor message protocol for storing and confirming reliable delivery of messages.

Actor message protocol for storing and confirming reliable delivery of messages. A [akka.actor.typed.Behavior](../Behavior.html)
implementation of this protocol can optionally be used with [ProducerController](ProducerController$.html) when messages shall survive
a crash of the producer side.

An implementation of this exists in `akka.persistence.typed.delivery.EventSourcedProducerQueue`.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
3. [**](../../../../akka/actor/typed/delivery/ProducerController$.html "Permalink")  object [ProducerController](ProducerController$.html "Point-to-point reliable delivery between a single producer actor sending messages and a single consumer actor receiving the messages.")Point\-to\-point reliable delivery between a single producer actor sending messages and a single consumer
actor receiving the messages.

Point\-to\-point reliable delivery between a single producer actor sending messages and a single consumer
actor receiving the messages. Used together with [ConsumerController](ConsumerController$.html).

The producer actor will start the flow by sending a [ProducerController.Start](ProducerController$$Start.html) message to
the `ProducerController`. The `ActorRef` in the `Start` message is typically constructed
as a message adapter to map the [ProducerController.RequestNext](ProducerController$$RequestNext.html) to the protocol of the
producer actor.

For the `ProducerController` to know where to send the messages it must be connected with the
`ConsumerController`. You do this is with [ProducerController.RegisterConsumer](ProducerController$$RegisterConsumer.html) or
[ConsumerController.RegisterToProducerController](ConsumerController$$RegisterToProducerController.html) messages.

The `ProducerController` sends `RequestNext` to the producer, which is then allowed to send one
message to the `ProducerController` via the `sendNextTo` in the `RequestNext`. Thereafter the
producer will receive a new `RequestNext` when it's allowed to send one more message.

The producer and `ProducerController` actors are supposed to be local so that these messages are
fast and not lost. This is enforced by a runtime check.

Many unconfirmed messages can be in flight between the `ProducerController` and `ConsumerController`.
The flow control is driven by the consumer side, which means that the `ProducerController` will
not send faster than the demand requested by the `ConsumerController`.

Lost messages are detected, resent and deduplicated if needed. This is also driven by the consumer side,
which means that the `ProducerController` will not push resends unless requested by the
`ConsumerController`.

Until sent messages have been confirmed the `ProducerController` keeps them in memory to be able to
resend them. If the JVM of the `ProducerController` crashes those unconfirmed messages are lost.
To make sure the messages can be delivered also in that scenario the `ProducerController` can be
used with a [DurableProducerQueue](DurableProducerQueue$.html). Then the unconfirmed messages are stored in a durable way so
that they can be redelivered when the producer is started again. An implementation of the
`DurableProducerQueue` is provided by `EventSourcedProducerQueue` in `akka-persistence-typed`.

Instead of using `tell` with the `sendNextTo` in the `RequestNext` the producer can use `context.ask`
with the `askNextTo` in the `RequestNext`. The difference is that a reply is sent back when the
message has been handled. If a `DurableProducerQueue` is used then the reply is sent when the message
has been stored successfully, but it might not have been processed by the consumer yet. Otherwise the
reply is sent after the consumer has processed and confirmed the message.

If the consumer crashes a new `ConsumerController` can be connected to the original `ProducerConsumer`
without restarting it. The `ProducerConsumer` will then redeliver all unconfirmed messages.

It's also possible to use the `ProducerController` and `ConsumerController` without resending
lost messages, but the flow control is still used. This can for example be useful when both consumer and
producer are know to be located in the same local `ActorSystem`. This can be more efficient since messages
don't have to be kept in memory in the `ProducerController` until they have been
confirmed, but the drawback is that lost messages will not be delivered. See configuration
`only-flow-control` of the `ConsumerController`.

The `producerId` is used in logging and included as MDC entry with key `"producerId"`. It's propagated
to the `ConsumerController` and is useful for correlating log messages. It can be any `String` but it's
recommended to use a unique identifier of representing the producer.

If the `DurableProducerQueue` is defined it is created as a child actor of the `ProducerController` actor.
It will use the same dispatcher as the parent `ProducerController`.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
4. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html "Permalink")  object [WorkPullingProducerController](WorkPullingProducerController$.html "Work pulling is a pattern where several worker actors pull tasks in their own pace from a shared work manager instead of that the manager pushes work to the workers blindly without knowing their individual capacity and current availability.")Work pulling is a pattern where several worker actors pull tasks in their own pace from
a shared work manager instead of that the manager pushes work to the workers blindly
without knowing their individual capacity and current availability.

Work pulling is a pattern where several worker actors pull tasks in their own pace from
a shared work manager instead of that the manager pushes work to the workers blindly
without knowing their individual capacity and current availability.

The `WorkPullingProducerController` can be used together with [ConsumerController](ConsumerController$.html) to
implement the work pulling pattern.

One important property is that the order of the messages should not matter, because each
message is routed randomly to one of the workers with demand. In other words, two subsequent
messages may be routed to two different workers and processed independent of each other.

A worker actor (consumer) and its `ConsumerController` is dynamically registered to the
`WorkPullingProducerController` via a ServiceKey. It will register itself to the
\* [akka.actor.typed.receptionist.Receptionist](../receptionist/Receptionist.html), and the `WorkPullingProducerController`
subscribes to the same key to find active workers. In this way workers can be dynamically
added or removed from any node in the cluster.

The work manager (producer) actor will start the flow by sending a [WorkPullingProducerController.Start](WorkPullingProducerController$$Start.html)
message to the `WorkPullingProducerController`. The `ActorRef` in the `Start` message is
typically constructed as a message adapter to map the [WorkPullingProducerController.RequestNext](WorkPullingProducerController$$RequestNext.html)
to the protocol of the producer actor.

The `WorkPullingProducerController` sends `RequestNext` to the producer, which is then allowed
to send one message to the `WorkPullingProducerController` via the `sendNextTo` in the `RequestNext`.
Thereafter the producer will receive a new `RequestNext` when it's allowed to send one more message.
It will send a new `RequestNext` when there are demand from any worker.
It's possible that all workers with demand are deregistered after the `RequestNext` is sent and before
the actual messages is sent to the `WorkPullingProducerController`. In that case the message is
buffered and will be delivered when a new worker is registered or when there is new demand.

The producer and `WorkPullingProducerController` actors are supposed to be local so that these messages are
fast and not lost. This is enforced by a runtime check.

Many unconfirmed messages can be in flight between the `WorkPullingProducerController` and each
`ConsumerController`. The flow control is driven by the consumer side, which means that the
`WorkPullingProducerController` will not send faster than the demand requested by the workers.

Lost messages are detected, resent and deduplicated if needed. This is also driven by the consumer side,
which means that the `WorkPullingProducerController` will not push resends unless requested by the
`ConsumerController`.

If a worker crashes or is stopped gracefully the unconfirmed messages for that worker will be
routed to other workers by the `WorkPullingProducerController`. This may result in that some messages
may be processed more than once, by different workers.

Until sent messages have been confirmed the `WorkPullingProducerController` keeps them in memory to be able to
resend them. If the JVM of the `WorkPullingProducerController` crashes those unconfirmed messages are lost.
To make sure the messages can be delivered also in that scenario the `WorkPullingProducerController` can be
used with a [DurableProducerQueue](DurableProducerQueue$.html). Then the unconfirmed messages are stored in a durable way so
that they can be redelivered when the producer is started again. An implementation of the
`DurableProducerQueue` is provided by `EventSourcedProducerQueue` in `akka-persistence-typed`.

Instead of using `tell` with the `sendNextTo` in the `RequestNext` the producer can use `context.ask`
with the `askNextTo` in the `RequestNext`. The difference is that a reply is sent back when the
message has been handled. If a `DurableProducerQueue` is used then the reply is sent when the message
has been stored successfully, but it might not have been processed by the consumer yet. Otherwise the
reply is sent after the consumer has processed and confirmed the message.

It's also possible to use the `WorkPullingProducerController` and `ConsumerController` without resending
lost messages, but the flow control is still used. This can for example be useful when both consumer and
producer are know to be located in the same local `ActorSystem`. This can be more efficient since messages
don't have to be kept in memory in the `ProducerController` until they have been
confirmed, but the drawback is that lost messages will not be delivered. See configuration
`only-flow-control` of the `ConsumerController`.

The `producerId` is used in logging and included as MDC entry with key `"producerId"`. It's propagated
to the `ConsumerController` and is useful for correlating log messages. It can be any `String` but it's
recommended to use a unique identifier of representing the producer.

If the `DurableProducerQueue` is defined it is created as a child actor of the `WorkPullingProducerController` actor.
`ProducerController` actors are created for each registered worker. Those child actors use the same dispatcher
as the parent `WorkPullingProducerController`.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/ConsumerController$$Confirmed.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/ConsumerController$$Delivery.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/ConsumerController$$RegisterToProducerController.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/ConsumerController$$Start.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/ConsumerController$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/DurableProducerQueue$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/ProducerController$$RegisterConsumer.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/ProducerController$$RequestNext.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/ProducerController$$Start.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/WorkPullingProducerController$$RequestNext.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/WorkPullingProducerController$$Start.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/WorkPullingProducerController$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/internal/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/eventstream/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/internal/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/pubsub/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/index.html](https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/index.html)*