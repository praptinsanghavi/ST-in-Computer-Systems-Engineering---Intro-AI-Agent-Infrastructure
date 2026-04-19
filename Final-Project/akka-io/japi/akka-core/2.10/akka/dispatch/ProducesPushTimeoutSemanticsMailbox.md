---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ProducesPushTimeoutSemanticsMailbox.html
title: ProducesPushTimeoutSemanticsMailbox
---

# ProducesPushTimeoutSemanticsMailbox

## Content

Package [akka.dispatch](package-summary.html)
## Interface ProducesPushTimeoutSemanticsMailbox

- All Known Implementing Classes:
`[BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch")`, `[BoundedDequeBasedMailbox](BoundedDequeBasedMailbox.html "class in akka.dispatch")`, `[BoundedMailbox](BoundedMailbox.html "class in akka.dispatch")`, `[BoundedPriorityMailbox](BoundedPriorityMailbox.html "class in akka.dispatch")`, `[BoundedStablePriorityMailbox](BoundedStablePriorityMailbox.html "class in akka.dispatch")`

---

```
public interface ProducesPushTimeoutSemanticsMailbox
```

INTERNAL API
 Used to determine mailbox factories which create [`BoundedMessageQueueSemantics`](BoundedMessageQueueSemantics.html "interface in akka.dispatch")
 mailboxes, and thus should be validated that the `pushTimeOut` is greater than 0\.

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

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedControlAwareMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedDequeBasedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedPriorityMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedStablePriorityMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ProducesPushTimeoutSemanticsMailbox.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ProducesPushTimeoutSemanticsMailbox.html)*