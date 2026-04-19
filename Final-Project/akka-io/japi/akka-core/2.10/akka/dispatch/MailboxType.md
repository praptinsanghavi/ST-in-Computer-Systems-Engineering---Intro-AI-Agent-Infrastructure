---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:11:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MailboxType.html
title: MailboxType
---

# MailboxType

## Content

Package [akka.dispatch](package-summary.html)
## Interface MailboxType

- All Known Implementing Classes:
`[BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch")`, `[BoundedDequeBasedMailbox](BoundedDequeBasedMailbox.html "class in akka.dispatch")`, `[BoundedMailbox](BoundedMailbox.html "class in akka.dispatch")`, `[BoundedPriorityMailbox](BoundedPriorityMailbox.html "class in akka.dispatch")`, `[BoundedStablePriorityMailbox](BoundedStablePriorityMailbox.html "class in akka.dispatch")`, `[NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch")`, `[SingleConsumerOnlyUnboundedMailbox](SingleConsumerOnlyUnboundedMailbox.html "class in akka.dispatch")`, `[UnboundedControlAwareMailbox](UnboundedControlAwareMailbox.html "class in akka.dispatch")`, `[UnboundedDequeBasedMailbox](UnboundedDequeBasedMailbox.html "class in akka.dispatch")`, `[UnboundedMailbox](UnboundedMailbox.html "class in akka.dispatch")`, `[UnboundedPriorityMailbox](UnboundedPriorityMailbox.html "class in akka.dispatch")`, `[UnboundedStablePriorityMailbox](UnboundedStablePriorityMailbox.html "class in akka.dispatch")`

---

```
public interface MailboxType
```

MailboxType is a factory to create MessageQueues for an optionally
 provided ActorContext.
 
**Possibly Important Notice**

 When implementing a custom mailbox type, be aware that there is special
 semantics attached to `system.actorOf()` in that sending to the returned
 ActorRef may—for a short period of time—enqueue the messages first in a
 dummy queue. Top\-level actors are created in two steps, and only after the
 guardian actor has performed that second step will all previously sent
 messages be transferred from the dummy queue into the real mailbox.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[MessageQueue](MessageQueue.html "interface in akka.dispatch")` | `[create](#create(scala.Option,scala.Option))​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> owner,  scala.Option<[ActorSystem](../actor/ActorSystem.html "class in akka.actor")> system)` |  |

- - ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		[MessageQueue](MessageQueue.html "interface in akka.dispatch") create​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> owner,
		                    scala.Option<[ActorSystem](../actor/ActorSystem.html "class in akka.actor")> system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedControlAwareMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedDequeBasedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedPriorityMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedStablePriorityMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/NonBlockingBoundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedControlAwareMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedDequeBasedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedPriorityMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedStablePriorityMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MailboxType.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MailboxType.html)*