---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:45:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/package-summary.html
title: akka.actor.typed.delivery
---

# akka.actor.typed.delivery

## Content

# Package akka.actor.typed.delivery

- Interface Summary 
| Interface | Description |
| [ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")\<A\> |  |
| --- | --- |
| [ConsumerController.Confirmed](ConsumerController.Confirmed.html "interface in akka.actor.typed.delivery") |  |
| [DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")\<A\> |  |
| [DurableProducerQueue.Event](DurableProducerQueue.Event.html "interface in akka.actor.typed.delivery") | INTERNAL API |
| [ProducerController.Command](ProducerController.Command.html "interface in akka.actor.typed.delivery")\<A\> |  |
| [WorkPullingProducerController.Command](WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")\<A\> |  |
- Class Summary 
| Class | Description |
| [ConsumerController](ConsumerController.html "class in akka.actor.typed.delivery") | `ConsumerController` and [`ProducerController`](ProducerController.html "class in akka.actor.typed.delivery") or [`WorkPullingProducerController`](WorkPullingProducerController.html "class in akka.actor.typed.delivery") are used  together. |
| --- | --- |
| [ConsumerController.Confirmed$](ConsumerController.Confirmed$.html "class in akka.actor.typed.delivery") | When the message has been processed the consumer is supposed to send `Confirmed` back  to the `ConsumerController` via the `confirmTo` in the [`ConsumerController.Delivery`](ConsumerController.Delivery.html "class in akka.actor.typed.delivery") message. |
| [ConsumerController.DeliverThenStop](ConsumerController.DeliverThenStop.html "class in akka.actor.typed.delivery")\<A\> |  |
| [ConsumerController.DeliverThenStop$](ConsumerController.DeliverThenStop$.html "class in akka.actor.typed.delivery") |  |
| [ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")\<A\> | Received messages from the producer are wrapped in `Delivery` when sent to the consumer. |
| [ConsumerController.Delivery$](ConsumerController.Delivery$.html "class in akka.actor.typed.delivery") |  |
| [ConsumerController.RegisterToProducerController](ConsumerController.RegisterToProducerController.html "class in akka.actor.typed.delivery")\<A\> | Register the `ConsumerController` to the given `producerController`. |
| [ConsumerController.RegisterToProducerController$](ConsumerController.RegisterToProducerController$.html "class in akka.actor.typed.delivery") |  |
| [ConsumerController.SequencedMessage](ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")\<A\> |  |
| [ConsumerController.SequencedMessage$](ConsumerController.SequencedMessage$.html "class in akka.actor.typed.delivery") |  |
| [ConsumerController.Settings](ConsumerController.Settings.html "class in akka.actor.typed.delivery") |  |
| [ConsumerController.Settings$](ConsumerController.Settings$.html "class in akka.actor.typed.delivery") |  |
| [ConsumerController.Start](ConsumerController.Start.html "class in akka.actor.typed.delivery")\<A\> | Initial message from the consumer actor. |
| [ConsumerController.Start$](ConsumerController.Start$.html "class in akka.actor.typed.delivery") |  |
| [ConsumerController$](ConsumerController$.html "class in akka.actor.typed.delivery") | `ConsumerController` and [`ProducerController`](ProducerController.html "class in akka.actor.typed.delivery") or [`WorkPullingProducerController`](WorkPullingProducerController.html "class in akka.actor.typed.delivery") are used  together. |
| [DurableProducerQueue](DurableProducerQueue.html "class in akka.actor.typed.delivery") | Actor message protocol for storing and confirming reliable delivery of messages. |
| [DurableProducerQueue.Cleanup$](DurableProducerQueue.Cleanup$.html "class in akka.actor.typed.delivery") |  |
| [DurableProducerQueue.Confirmed$](DurableProducerQueue.Confirmed$.html "class in akka.actor.typed.delivery") |  |
| [DurableProducerQueue.LoadState](DurableProducerQueue.LoadState.html "class in akka.actor.typed.delivery")\<A\> | Request that is used at startup to retrieve the unconfirmed messages and current sequence number. |
| [DurableProducerQueue.LoadState$](DurableProducerQueue.LoadState$.html "class in akka.actor.typed.delivery") |  |
| [DurableProducerQueue.MessageSent](DurableProducerQueue.MessageSent.html "class in akka.actor.typed.delivery")\<A\> | The fact (event) that a message has been sent. |
| [DurableProducerQueue.MessageSent$](DurableProducerQueue.MessageSent$.html "class in akka.actor.typed.delivery") |  |
| [DurableProducerQueue.State](DurableProducerQueue.State.html "class in akka.actor.typed.delivery")\<A\> |  |
| [DurableProducerQueue.State$](DurableProducerQueue.State$.html "class in akka.actor.typed.delivery") |  |
| [DurableProducerQueue.StoreMessageConfirmed](DurableProducerQueue.StoreMessageConfirmed.html "class in akka.actor.typed.delivery")\<A\> | Store the fact that a message has been confirmed to be delivered and processed. |
| [DurableProducerQueue.StoreMessageConfirmed$](DurableProducerQueue.StoreMessageConfirmed$.html "class in akka.actor.typed.delivery") |  |
| [DurableProducerQueue.StoreMessageSent](DurableProducerQueue.StoreMessageSent.html "class in akka.actor.typed.delivery")\<A\> | Store the fact that a message is to be sent. |
| [DurableProducerQueue.StoreMessageSent$](DurableProducerQueue.StoreMessageSent$.html "class in akka.actor.typed.delivery") |  |
| [DurableProducerQueue.StoreMessageSentAck](DurableProducerQueue.StoreMessageSentAck.html "class in akka.actor.typed.delivery") |  |
| [DurableProducerQueue.StoreMessageSentAck$](DurableProducerQueue.StoreMessageSentAck$.html "class in akka.actor.typed.delivery") |  |
| [DurableProducerQueue$](DurableProducerQueue$.html "class in akka.actor.typed.delivery") | Actor message protocol for storing and confirming reliable delivery of messages. |
| [ProducerController](ProducerController.html "class in akka.actor.typed.delivery") | Point\-to\-point reliable delivery between a single producer actor sending messages and a single consumer  actor receiving the messages. |
| [ProducerController.MessageWithConfirmation](ProducerController.MessageWithConfirmation.html "class in akka.actor.typed.delivery")\<A\> | For sending confirmation message back to the producer when the message has been confirmed. |
| [ProducerController.MessageWithConfirmation$](ProducerController.MessageWithConfirmation$.html "class in akka.actor.typed.delivery") |  |
| [ProducerController.RegisterConsumer](ProducerController.RegisterConsumer.html "class in akka.actor.typed.delivery")\<A\> | Register the given `consumerController` to the `ProducerController`. |
| [ProducerController.RegisterConsumer$](ProducerController.RegisterConsumer$.html "class in akka.actor.typed.delivery") |  |
| [ProducerController.RequestNext](ProducerController.RequestNext.html "class in akka.actor.typed.delivery")\<A\> | The `ProducerController` sends `RequestNext` to the producer when it is allowed to send one  message via the `sendNextTo` or `askNextTo`. |
| [ProducerController.RequestNext$](ProducerController.RequestNext$.html "class in akka.actor.typed.delivery") |  |
| [ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery") |  |
| [ProducerController.Settings$](ProducerController.Settings$.html "class in akka.actor.typed.delivery") |  |
| [ProducerController.Start](ProducerController.Start.html "class in akka.actor.typed.delivery")\<A\> | Initial message from the producer actor. |
| [ProducerController.Start$](ProducerController.Start$.html "class in akka.actor.typed.delivery") |  |
| [ProducerController$](ProducerController$.html "class in akka.actor.typed.delivery") | Point\-to\-point reliable delivery between a single producer actor sending messages and a single consumer  actor receiving the messages. |
| [WorkPullingProducerController](WorkPullingProducerController.html "class in akka.actor.typed.delivery") | Work pulling is a pattern where several worker actors pull tasks in their own pace from  a shared work manager instead of that the manager pushes work to the workers blindly  without knowing their individual capacity and current availability. |
| [WorkPullingProducerController.GetWorkerStats](WorkPullingProducerController.GetWorkerStats.html "class in akka.actor.typed.delivery")\<A\> | Retrieve information about registered workers. |
| [WorkPullingProducerController.GetWorkerStats$](WorkPullingProducerController.GetWorkerStats$.html "class in akka.actor.typed.delivery") |  |
| [WorkPullingProducerController.MessageWithConfirmation](WorkPullingProducerController.MessageWithConfirmation.html "class in akka.actor.typed.delivery")\<A\> | For sending confirmation message back to the producer when the message has been fully delivered, processed,  and confirmed by the consumer. |
| [WorkPullingProducerController.MessageWithConfirmation$](WorkPullingProducerController.MessageWithConfirmation$.html "class in akka.actor.typed.delivery") |  |
| [WorkPullingProducerController.RequestNext](WorkPullingProducerController.RequestNext.html "class in akka.actor.typed.delivery")\<A\> | The `WorkPullingProducerController` sends `RequestNext` to the producer when it is allowed to send one  message via the `sendNextTo` or `askNextTo`. |
| [WorkPullingProducerController.RequestNext$](WorkPullingProducerController.RequestNext$.html "class in akka.actor.typed.delivery") |  |
| [WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") |  |
| [WorkPullingProducerController.Settings$](WorkPullingProducerController.Settings$.html "class in akka.actor.typed.delivery") |  |
| [WorkPullingProducerController.Start](WorkPullingProducerController.Start.html "class in akka.actor.typed.delivery")\<A\> | Initial message from the producer actor. |
| [WorkPullingProducerController.Start$](WorkPullingProducerController.Start$.html "class in akka.actor.typed.delivery") |  |
| [WorkPullingProducerController.WorkerStats](WorkPullingProducerController.WorkerStats.html "class in akka.actor.typed.delivery") |  |
| [WorkPullingProducerController.WorkerStats$](WorkPullingProducerController.WorkerStats$.html "class in akka.actor.typed.delivery") |  |
| [WorkPullingProducerController$](WorkPullingProducerController$.html "class in akka.actor.typed.delivery") | Work pulling is a pattern where several worker actors pull tasks in their own pace from  a shared work manager instead of that the manager pushes work to the workers blindly  without knowing their individual capacity and current availability. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.Command.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.Confirmed$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.Confirmed.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.DeliverThenStop$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.DeliverThenStop.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.Delivery$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.Delivery.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.RegisterToProducerController$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.RegisterToProducerController.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.SequencedMessage$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.SequencedMessage.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.Settings$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.Settings.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.Start$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.Start.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ConsumerController.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.Cleanup$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.Command.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.Confirmed$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.Event.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.LoadState$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.LoadState.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.MessageSent$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.MessageSent.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.State$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.State.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.StoreMessageConfirmed$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.StoreMessageConfirmed.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSent$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSent.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSentAck$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSentAck.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController.Command.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController.MessageWithConfirmation$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController.MessageWithConfirmation.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController.RegisterConsumer$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController.RegisterConsumer.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController.RequestNext$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController.RequestNext.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController.Settings$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController.Settings.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController.Start$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController.Start.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/ProducerController.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/WorkPullingProducerController$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/WorkPullingProducerController.Command.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/actor/typed/delivery/package-summary.html)*