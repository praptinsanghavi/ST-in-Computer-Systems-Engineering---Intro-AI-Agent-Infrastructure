---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html
title: BoundedControlAwareMessageQueueSemantics
---

# BoundedControlAwareMessageQueueSemantics

## Content

Package [akka.dispatch](package-summary.html)
## Interface BoundedControlAwareMessageQueueSemantics

- All Superinterfaces:
`[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")`, `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`

All Known Implementing Classes:
`[BoundedControlAwareMailbox.MessageQueue](BoundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public interface BoundedControlAwareMessageQueueSemantics
extends [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch"), [ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")
```

- - ### Method Summary
	
	
		- ### Methods inherited from interface akka.dispatch.[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")
		
		
		`[pushTimeOut](BoundedMessageQueueSemantics.html#pushTimeOut())`
		- ### Methods inherited from interface akka.dispatch.[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")
		
		
		`[controlQueue](ControlAwareMessageQueueSemantics.html#controlQueue()), [dequeue](ControlAwareMessageQueueSemantics.html#dequeue()), [enqueue](ControlAwareMessageQueueSemantics.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope)), [hasMessages](ControlAwareMessageQueueSemantics.html#hasMessages()), [numberOfMessages](ControlAwareMessageQueueSemantics.html#numberOfMessages()), [queue](ControlAwareMessageQueueSemantics.html#queue())`
		- ### Methods inherited from interface akka.dispatch.[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[cleanUp](QueueBasedMessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue))`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html](https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html)*