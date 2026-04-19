---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/MultipleConsumerSemantics.html
title: MultipleConsumerSemantics
---

# MultipleConsumerSemantics

## Content

Package [akka.dispatch](package-summary.html)
## Interface MultipleConsumerSemantics

- All Known Subinterfaces:
`[BoundedControlAwareMessageQueueSemantics](BoundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "interface in akka.dispatch")`, `[BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html "interface in akka.dispatch")`, `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[DequeBasedMessageQueue](DequeBasedMessageQueue.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[UnboundedDequeBasedMessageQueue](UnboundedDequeBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch")`

All Known Implementing Classes:
`[BoundedControlAwareMailbox.MessageQueue](BoundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedDequeBasedMailbox.MessageQueue](BoundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedMailbox.MessageQueue](BoundedMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedNodeMessageQueue](BoundedNodeMessageQueue.html "class in akka.dispatch")`, `[BoundedPriorityMailbox.MessageQueue](BoundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedStablePriorityMailbox.MessageQueue](BoundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedControlAwareMailbox.MessageQueue](UnboundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedDequeBasedMailbox.MessageQueue](UnboundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedMailbox.MessageQueue](UnboundedMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedPriorityMailbox.MessageQueue](UnboundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedStablePriorityMailbox.MessageQueue](UnboundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public interface MultipleConsumerSemantics
```

This is a marker trait for message queues which support multiple consumers,
 as is required by the BalancingDispatcher.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedNodeMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedPriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/DequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedPriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/MultipleConsumerSemantics.html](https://doc.akka.io/japi/akka/current/akka/dispatch/MultipleConsumerSemantics.html)*