---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadMailbox.html
title: CallingThreadMailbox
---

# CallingThreadMailbox

## Content

Package [akka.testkit](package-summary.html)
## Class CallingThreadMailbox

- java.lang.Object
- - akka.dispatch.Mailbox
	- - akka.testkit.CallingThreadMailbox

- All Implemented Interfaces:
`[DefaultSystemMessageQueue](../dispatch/DefaultSystemMessageQueue.html "interface in akka.dispatch")`

---

```
public class CallingThreadMailbox
extends akka.dispatch.Mailbox
implements [DefaultSystemMessageQueue](../dispatch/DefaultSystemMessageQueue.html "interface in akka.dispatch")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CallingThreadMailbox](#%3Cinit%3E(akka.actor.Cell,akka.dispatch.MailboxType))​([Cell](../actor/Cell.html "interface in akka.actor") _receiver,  [MailboxType](../dispatch/MailboxType.html "interface in akka.dispatch") mailboxType)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[cleanUp](#cleanUp())()` |  |
	| `java.util.concurrent.locks.ReentrantLock` | `[ctdLock](#ctdLock())()` |  |
	| `[Envelope](../dispatch/Envelope.html "class in akka.dispatch")` | `[dequeue](#dequeue())()` |  |
	| `void` | `[enqueue](#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,  [Envelope](../dispatch/Envelope.html "class in akka.dispatch") msg)` |  |
	| `boolean` | `[hasMessages](#hasMessages())()` |  |
	| `[MailboxType](../dispatch/MailboxType.html "interface in akka.dispatch")` | `[mailboxType](#mailboxType())()` |  |
	| `[MessageQueue](../dispatch/MessageQueue.html "interface in akka.dispatch")` | `[messageQueue](#messageQueue())()` | This is only a marker to be put in the messageQueue\&rsquo;s stead to make error  messages pertaining to violated mailbox type requirements less cryptic. |
	| `int` | `[numberOfMessages](#numberOfMessages())()` |  |
	| `[MessageQueue](../dispatch/MessageQueue.html "interface in akka.dispatch")` | `[queue](#queue())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` |  |
	| `[Switch](../util/Switch.html "class in akka.util")` | `[suspendSwitch](#suspendSwitch())()` |  |
	| `[ActorSystem](../actor/ActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.dispatch.[DefaultSystemMessageQueue](../dispatch/DefaultSystemMessageQueue.html "interface in akka.dispatch")
		
		
		`[hasSystemMessages](../dispatch/DefaultSystemMessageQueue.html#hasSystemMessages()), [systemDrain](../dispatch/DefaultSystemMessageQueue.html#systemDrain(akka.dispatch.sysmsg.LatestFirstSystemMessageList)), [systemEnqueue](../dispatch/DefaultSystemMessageQueue.html#systemEnqueue(akka.actor.ActorRef,akka.dispatch.sysmsg.SystemMessage))`

- - ### Constructor Detail
	
	
	
		- #### CallingThreadMailbox
		
		
		
		```
		public CallingThreadMailbox​([Cell](../actor/Cell.html "interface in akka.actor") _receiver,
		                            [MailboxType](../dispatch/MailboxType.html "interface in akka.dispatch") mailboxType)
		```

	- ### Method Detail
	
	
	
		- #### cleanUp
		
		
		
		```
		public void cleanUp()
		```
		- #### ctdLock
		
		
		
		```
		public java.util.concurrent.locks.ReentrantLock ctdLock()
		```
		- #### dequeue
		
		
		
		```
		public [Envelope](../dispatch/Envelope.html "class in akka.dispatch") dequeue()
		```
		- #### enqueue
		
		
		
		```
		public void enqueue​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,
		                    [Envelope](../dispatch/Envelope.html "class in akka.dispatch") msg)
		```
		- #### hasMessages
		
		
		
		```
		public boolean hasMessages()
		```
		- #### mailboxType
		
		
		
		```
		public [MailboxType](../dispatch/MailboxType.html "interface in akka.dispatch") mailboxType()
		```
		- #### messageQueue
		
		
		
		```
		public [MessageQueue](../dispatch/MessageQueue.html "interface in akka.dispatch") messageQueue()
		```
		
		This is only a marker to be put in the messageQueue\&rsquo;s stead to make error
		 messages pertaining to violated mailbox type requirements less cryptic.
		- #### numberOfMessages
		
		
		
		```
		public int numberOfMessages()
		```
		- #### queue
		
		
		
		```
		public [MessageQueue](../dispatch/MessageQueue.html "interface in akka.dispatch") queue()
		```
		- #### self
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") self()
		```
		- #### suspendSwitch
		
		
		
		```
		public [Switch](../util/Switch.html "class in akka.util") suspendSwitch()
		```
		- #### system
		
		
		
		```
		public [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Cell.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/DefaultSystemMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MailboxType.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Switch.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadMailbox.html](https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadMailbox.html)*