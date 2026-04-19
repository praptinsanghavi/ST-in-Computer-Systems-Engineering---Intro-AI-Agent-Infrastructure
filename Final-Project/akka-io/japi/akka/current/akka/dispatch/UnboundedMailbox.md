---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedMailbox.MessageQueue.html
title: UnboundedMailbox.MessageQueue
---

# UnboundedMailbox.MessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Class UnboundedMailbox.MessageQueue

- java.lang.Object
- - java.util.AbstractCollection\<E\>
	- - java.util.AbstractQueue\<E\>
		- - java.util.concurrent.ConcurrentLinkedQueue\<[Envelope](Envelope.html "class in akka.dispatch")\>
			- - akka.dispatch.UnboundedMailbox.MessageQueue

- All Implemented Interfaces:
`[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "interface in akka.dispatch")`, `[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch")`, `java.io.Serializable`, `java.lang.Iterable<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Collection<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>`

Enclosing class:
[UnboundedMailbox](UnboundedMailbox.html "class in akka.dispatch")

---

```
public static class UnboundedMailbox.MessageQueue
extends java.util.concurrent.ConcurrentLinkedQueue<[Envelope](Envelope.html "class in akka.dispatch")>
implements [UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch")
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.UnboundedMailbox.MessageQueue)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageQueue](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>` | `[queue](#queue())()` |  |
	
	
		- ### Methods inherited from class java.util.concurrent.ConcurrentLinkedQueue
		
		
		`add, addAll, clear, contains, forEach, isEmpty, iterator, offer, peek, poll, remove, removeAll, removeIf, retainAll, size, spliterator, toArray, toArray, toString`
		- ### Methods inherited from class java.util.AbstractQueue
		
		
		`element, remove`
		- ### Methods inherited from class java.util.AbstractCollection
		
		
		`containsAll`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface java.util.Collection
		
		
		`containsAll, equals, hashCode, parallelStream, stream, toArray`
		- ### Methods inherited from interface java.util.Queue
		
		
		`element, remove`
		- ### Methods inherited from interface akka.dispatch.[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[cleanUp](QueueBasedMessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue)), [hasMessages](QueueBasedMessageQueue.html#hasMessages()), [numberOfMessages](QueueBasedMessageQueue.html#numberOfMessages())`
		- ### Methods inherited from interface akka.dispatch.[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[dequeue](UnboundedQueueBasedMessageQueue.html#dequeue()), [enqueue](UnboundedQueueBasedMessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))`

- - ### Constructor Detail
	
	
	
		- #### MessageQueue
		
		
		
		```
		public MessageQueue()
		```

	- ### Method Detail
	
	
	
		- #### queue
		
		
		
		```
		public final java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")> queue()
		```
		
		
		Specified by:
		`[queue](QueueBasedMessageQueue.html#queue())` in interface `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedMailbox.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedMailbox.MessageQueue.html](https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedMailbox.MessageQueue.html)*