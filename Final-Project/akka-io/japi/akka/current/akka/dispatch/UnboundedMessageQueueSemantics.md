---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedMessageQueueSemantics.html
title: UnboundedMessageQueueSemantics
---

# UnboundedMessageQueueSemantics

## Content

Package [akka.dispatch](package-summary.html)
## Interface UnboundedMessageQueueSemantics

- All Known Subinterfaces:
`[UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[UnboundedDequeBasedMessageQueue](UnboundedDequeBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedDequeBasedMessageQueueSemantics](UnboundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch")`, `[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch")`

All Known Implementing Classes:
`[NodeMessageQueue](NodeMessageQueue.html "class in akka.dispatch")`, `[UnboundedControlAwareMailbox.MessageQueue](UnboundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedDequeBasedMailbox.MessageQueue](UnboundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedMailbox.MessageQueue](UnboundedMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedPriorityMailbox.MessageQueue](UnboundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedStablePriorityMailbox.MessageQueue](UnboundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public interface UnboundedMessageQueueSemantics
```

UnboundedMessageQueueSemantics adds unbounded semantics to a QueueBasedMessageQueue,
 i.e. a non\-blocking enqueue and dequeue.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/NodeMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedDequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedPriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedMessageQueueSemantics.html](https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedMessageQueueSemantics.html)*