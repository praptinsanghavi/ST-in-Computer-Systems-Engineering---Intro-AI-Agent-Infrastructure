---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMessageQueueSemantics.html
title: BoundedDequeBasedMessageQueueSemantics
---

# BoundedDequeBasedMessageQueueSemantics

## Content

Package [akka.dispatch](package-summary.html)
## Interface BoundedDequeBasedMessageQueueSemantics

- All Superinterfaces:
`[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")`, `[DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")`

All Known Subinterfaces:
`[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "interface in akka.dispatch")`

All Known Implementing Classes:
`[BoundedDequeBasedMailbox.MessageQueue](BoundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public interface BoundedDequeBasedMessageQueueSemantics
extends [DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html "interface in akka.dispatch"), [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")
```

- - ### Method Summary
	
	
		- ### Methods inherited from interface akka.dispatch.[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")
		
		
		`[pushTimeOut](BoundedMessageQueueSemantics.html#pushTimeOut())`
		- ### Methods inherited from interface akka.dispatch.[DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")
		
		
		`[enqueueFirst](DequeBasedMessageQueueSemantics.html#enqueueFirst(akka.actor.ActorRef,akka.dispatch.Envelope))`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMessageQueueSemantics.html](https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMessageQueueSemantics.html)*