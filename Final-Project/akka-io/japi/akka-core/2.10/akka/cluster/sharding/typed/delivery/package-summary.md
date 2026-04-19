---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/package-summary.html
title: akka.cluster.sharding.typed.delivery
---

# akka.cluster.sharding.typed.delivery

## Content

# Package akka.cluster.sharding.typed.delivery

- Interface Summary 
| Interface | Description |
| [ShardingProducerController.Command](ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")\<A\> |  |
| --- | --- |
- Class Summary 
| Class | Description |
| [ShardingConsumerController](ShardingConsumerController.html "class in akka.cluster.sharding.typed.delivery") | `ShardingConsumerController` is used together with [`ShardingProducerController`](ShardingProducerController.html "class in akka.cluster.sharding.typed.delivery"). |
| --- | --- |
| [ShardingConsumerController.Settings](ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") |  |
| [ShardingConsumerController.Settings$](ShardingConsumerController.Settings$.html "class in akka.cluster.sharding.typed.delivery") |  |
| [ShardingConsumerController$](ShardingConsumerController$.html "class in akka.cluster.sharding.typed.delivery") | `ShardingConsumerController` is used together with [`ShardingProducerController`](ShardingProducerController.html "class in akka.cluster.sharding.typed.delivery"). |
| [ShardingProducerController](ShardingProducerController.html "class in akka.cluster.sharding.typed.delivery") | Reliable delivery between a producer actor sending messages to sharded consumer  actors receiving the messages. |
| [ShardingProducerController.MessageWithConfirmation](ShardingProducerController.MessageWithConfirmation.html "class in akka.cluster.sharding.typed.delivery")\<A\> | For sending confirmation message back to the producer when the message has been confirmed. |
| [ShardingProducerController.MessageWithConfirmation$](ShardingProducerController.MessageWithConfirmation$.html "class in akka.cluster.sharding.typed.delivery") |  |
| [ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")\<A\> | The `ProducerController` sends `RequestNext` to the producer when it is allowed to send one  message via the `sendNextTo` or `askNextTo`. |
| [ShardingProducerController.RequestNext$](ShardingProducerController.RequestNext$.html "class in akka.cluster.sharding.typed.delivery") |  |
| [ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") |  |
| [ShardingProducerController.Settings$](ShardingProducerController.Settings$.html "class in akka.cluster.sharding.typed.delivery") |  |
| [ShardingProducerController.Start](ShardingProducerController.Start.html "class in akka.cluster.sharding.typed.delivery")\<A\> | Initial message from the producer actor. |
| [ShardingProducerController.Start$](ShardingProducerController.Start$.html "class in akka.cluster.sharding.typed.delivery") |  |
| [ShardingProducerController$](ShardingProducerController$.html "class in akka.cluster.sharding.typed.delivery") | Reliable delivery between a producer actor sending messages to sharded consumer  actors receiving the messages. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController.Settings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.MessageWithConfirmation$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.MessageWithConfirmation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.RequestNext$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.RequestNext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.Settings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.Start$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.Start.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/package-summary.html)*