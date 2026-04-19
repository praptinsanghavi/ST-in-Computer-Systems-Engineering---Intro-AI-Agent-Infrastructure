---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedMessageQueueSemantics.html
title: BoundedMessageQueueSemantics
---

# BoundedMessageQueueSemantics

## Content

Package [akka.dispatch](package-summary.html)
## Interface BoundedMessageQueueSemantics

- All Known Subinterfaces:
`[BoundedControlAwareMessageQueueSemantics](BoundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "interface in akka.dispatch")`, `[BoundedDequeBasedMessageQueueSemantics](BoundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch")`, `[BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html "interface in akka.dispatch")`

All Known Implementing Classes:
`[BoundedControlAwareMailbox.MessageQueue](BoundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedDequeBasedMailbox.MessageQueue](BoundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedMailbox.MessageQueue](BoundedMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedNodeMessageQueue](BoundedNodeMessageQueue.html "class in akka.dispatch")`, `[BoundedPriorityMailbox.MessageQueue](BoundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedStablePriorityMailbox.MessageQueue](BoundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public interface BoundedMessageQueueSemantics
```

BoundedMessageQueueSemantics adds bounded semantics to a QueueBasedMessageQueue,
 i.e. blocking enqueue with timeout.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.Duration` | `[pushTimeOut](#pushTimeOut())()` |  |

- - ### Method Detail
	
	
	
		- #### pushTimeOut
		
		
		
		```
		scala.concurrent.duration.Duration pushTimeOut()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedNodeMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedPriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedMessageQueueSemantics.html](https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedMessageQueueSemantics.html)*