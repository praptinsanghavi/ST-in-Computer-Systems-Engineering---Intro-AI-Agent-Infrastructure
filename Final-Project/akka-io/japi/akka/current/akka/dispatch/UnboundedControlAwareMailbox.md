---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMailbox.MessageQueue.html
title: UnboundedControlAwareMailbox.MessageQueue
---

# UnboundedControlAwareMailbox.MessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Class UnboundedControlAwareMailbox.MessageQueue

- java.lang.Object
- - akka.dispatch.UnboundedControlAwareMailbox.MessageQueue

- All Implemented Interfaces:
`[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "interface in akka.dispatch")`, `java.io.Serializable`

Enclosing class:
[UnboundedControlAwareMailbox](UnboundedControlAwareMailbox.html "class in akka.dispatch")

---

```
public static class UnboundedControlAwareMailbox.MessageQueue
extends java.lang.Object
implements [UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch"), java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.UnboundedControlAwareMailbox.MessageQueue)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageQueue](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>` | `[controlQueue](#controlQueue())()` |  |
	| `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>` | `[queue](#queue())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.dispatch.[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")
		
		
		`[dequeue](ControlAwareMessageQueueSemantics.html#dequeue()), [enqueue](ControlAwareMessageQueueSemantics.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope)), [hasMessages](ControlAwareMessageQueueSemantics.html#hasMessages()), [numberOfMessages](ControlAwareMessageQueueSemantics.html#numberOfMessages())`
		- ### Methods inherited from interface akka.dispatch.[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[cleanUp](QueueBasedMessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue))`

- - ### Constructor Detail
	
	
	
		- #### MessageQueue
		
		
		
		```
		public MessageQueue()
		```

	- ### Method Detail
	
	
	
		- #### controlQueue
		
		
		
		```
		public java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")> controlQueue()
		```
		
		
		Specified by:
		`[controlQueue](ControlAwareMessageQueueSemantics.html#controlQueue())` in interface `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`
		- #### queue
		
		
		
		```
		public java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")> queue()
		```
		
		
		Specified by:
		`[queue](ControlAwareMessageQueueSemantics.html#queue())` in interface `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`
		Specified by:
		`[queue](QueueBasedMessageQueue.html#queue())` in interface `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/ControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMailbox.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMailbox.MessageQueue.html](https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMailbox.MessageQueue.html)*