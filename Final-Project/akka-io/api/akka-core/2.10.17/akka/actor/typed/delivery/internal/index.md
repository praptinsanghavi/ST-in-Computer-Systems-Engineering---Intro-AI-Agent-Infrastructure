---
description: Akka 2.10.17 - akka.actor.typed.delivery.internal
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:50:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/internal/index.html
title: Akka 2.10.17 - akka.actor.typed.delivery.internal
---

# Akka 2.10.17 - akka.actor.typed.delivery.internal

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.internal

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/actor/typed/delivery/internal/index.html "Permalink")  package internalDefinition Classes[delivery](../index.html)
- [ProducerControllerImpl](ProducerControllerImpl$.html "INTERNAL API")
p[akka](../../../../index.html).[actor](../../../index.html).[typed](../../index.html).[delivery](../index.html)

# internal[**](../../../../../akka/actor/typed/delivery/internal/index.html "Permalink")

#### package internal

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html "Permalink")  object [ProducerControllerImpl](ProducerControllerImpl$.html "INTERNAL API")INTERNAL API

INTERNAL API

###### Design notes

The producer will start the flow by sending a [ProducerController.Start](../ProducerController$$Start.html) message to the `ProducerController` with
message adapter reference to convert [ProducerController.RequestNext](../ProducerController$$RequestNext.html) message.
The `ProducerController` sends `RequestNext` to the producer, which is then allowed to send one message to
the `ProducerController`.

The producer and `ProducerController` are supposed to be local so that these messages are fast and not lost.

The `ProducerController` sends the first message to the `ConsumerController` without waiting for
a `Request` from the `ConsumerController`. The main reason for this is that when used with
Cluster Sharding the first message will typically create the `ConsumerController`. It's
also a way to connect the ProducerController and ConsumerController in a dynamic way, for
example when the ProducerController is replaced.

When the first message is received by the `ConsumerController` it sends back the initial `Request`,
with demand of how many messages it can accept.

Apart from the first message the `ProducerController` will not send more messages than requested
by the `ConsumerController`.

When there is demand from the consumer side the `ProducerController` sends `RequestNext` to the
actual producer, which is then allowed to send one more message.

Each message is wrapped by the `ProducerController` in [ConsumerController.SequencedMessage](../ConsumerController$$SequencedMessage.html) with
a monotonically increasing sequence number without gaps, starting at 1\.

In other words, the "request" protocol to the application producer and consumer is one\-by\-one, but
between the `ProducerController` and `ConsumerController` it's window of messages in flight.

The `Request` message also contains a `confirmedSeqNr` that is the acknowledgement
from the consumer that it has received and processed all messages up to that sequence number.

The `ConsumerController` will send [ProducerControllerImpl.Resend](ProducerControllerImpl$$Resend.html) if a lost message is detected
and then the `ProducerController` will resend all messages from that sequence number. The producer keeps
unconfirmed messages in a buffer to be able to resend them. The buffer size is limited
by the request window size.

The resending is optional, and the `ConsumerController` can be started with `resendLost=false`
to ignore lost messages, and then the `ProducerController` will not buffer unconfirmed messages.
In that mode it provides only flow control but no reliable delivery.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController$$RequestNext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController$$Start.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Resend.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/index.html)*