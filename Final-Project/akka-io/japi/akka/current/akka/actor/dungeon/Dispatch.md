---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/dungeon/Dispatch.html
title: Dispatch
---

# Dispatch

## Content

Package [akka.actor.dungeon](package-summary.html)
## Interface Dispatch

- ---

```
public interface Dispatch
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[_mailboxDoNotCallMeDirectly_$eq](#_mailboxDoNotCallMeDirectly_$eq(akka.dispatch.Mailbox))​(akka.dispatch.Mailbox x$1)` |  |
	| `akka.dispatch.Mailbox` | `[_preventPrivateUnusedErasure](#_preventPrivateUnusedErasure())()` |  |
	| `scala.PartialFunction<java.lang.Throwable,​scala.runtime.BoxedUnit>` | `[handleException](#handleException())()` |  |
	| `boolean` | `[hasMessages](#hasMessages())()` |  |
	| `[Dispatch](Dispatch.html "interface in akka.actor.dungeon")` | `[init](#init(boolean,akka.dispatch.MailboxType))​(boolean sendSupervise,  [MailboxType](../../dispatch/MailboxType.html "interface in akka.dispatch") mailboxType)` | Initialize this cell, i.e. |
	| `[Dispatch](Dispatch.html "interface in akka.actor.dungeon")` | `[initWithFailure](#initWithFailure(java.lang.Throwable))​(java.lang.Throwable failure)` |  |
	| `boolean` | `[isTerminated](#isTerminated())()` |  |
	| `akka.dispatch.Mailbox` | `[mailbox](#mailbox())()` |  |
	| `int` | `[numberOfMessages](#numberOfMessages())()` |  |
	| `void` | `[restart](#restart(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `void` | `[resume](#resume(java.lang.Throwable))​(java.lang.Throwable causedByFailure)` |  |
	| `void` | `[sendMessage](#sendMessage(akka.dispatch.Envelope))​([Envelope](../../dispatch/Envelope.html "class in akka.dispatch") msg)` |  |
	| `void` | `[sendSystemMessage](#sendSystemMessage(akka.dispatch.sysmsg.SystemMessage))​([SystemMessage](../../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") message)` |  |
	| `[Envelope](../../dispatch/Envelope.html "class in akka.dispatch")` | `[serializeAndDeserialize](#serializeAndDeserialize(akka.dispatch.Envelope))​([Envelope](../../dispatch/Envelope.html "class in akka.dispatch") envelope)` |  |
	| `java.lang.Object` | `[serializeAndDeserializePayload](#serializeAndDeserializePayload(java.lang.Object))​(java.lang.Object obj)` |  |
	| `[Dispatch](Dispatch.html "interface in akka.actor.dungeon")` | `[start](#start())()` | Start this cell, i.e. |
	| `void` | `[stop](#stop())()` |  |
	| `void` | `[suspend](#suspend())()` |  |
	| `akka.dispatch.Mailbox` | `[swapMailbox](#swapMailbox(akka.dispatch.Mailbox))​(akka.dispatch.Mailbox newMailbox)` |  |

- - ### Method Detail
	
	
	
		- #### \_mailboxDoNotCallMeDirectly\_$eq
		
		
		
		```
		void _mailboxDoNotCallMeDirectly_$eq​(akka.dispatch.Mailbox x$1)
		```
		- #### \_preventPrivateUnusedErasure
		
		
		
		```
		akka.dispatch.Mailbox _preventPrivateUnusedErasure()
		```
		- #### handleException
		
		
		
		```
		scala.PartialFunction<java.lang.Throwable,​scala.runtime.BoxedUnit> handleException()
		```
		- #### hasMessages
		
		
		
		```
		boolean hasMessages()
		```
		- #### init
		
		
		
		```
		[Dispatch](Dispatch.html "interface in akka.actor.dungeon") init​(boolean sendSupervise,
		              [MailboxType](../../dispatch/MailboxType.html "interface in akka.dispatch") mailboxType)
		```
		
		Initialize this cell, i.e. set up mailboxes and supervision. The UID must be
		 reasonably different from the previous UID of a possible actor with the same path,
		 which can be achieved by using ThreadLocalRandom.current.nextInt().
		- #### initWithFailure
		
		
		
		```
		[Dispatch](Dispatch.html "interface in akka.actor.dungeon") initWithFailure​(java.lang.Throwable failure)
		```
		- #### isTerminated
		
		
		
		```
		boolean isTerminated()
		```
		- #### mailbox
		
		
		
		```
		akka.dispatch.Mailbox mailbox()
		```
		- #### numberOfMessages
		
		
		
		```
		int numberOfMessages()
		```
		- #### restart
		
		
		
		```
		void restart​(java.lang.Throwable cause)
		```
		- #### resume
		
		
		
		```
		void resume​(java.lang.Throwable causedByFailure)
		```
		- #### sendMessage
		
		
		
		```
		void sendMessage​([Envelope](../../dispatch/Envelope.html "class in akka.dispatch") msg)
		```
		- #### sendSystemMessage
		
		
		
		```
		void sendSystemMessage​([SystemMessage](../../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") message)
		```
		- #### serializeAndDeserialize
		
		
		
		```
		[Envelope](../../dispatch/Envelope.html "class in akka.dispatch") serializeAndDeserialize​([Envelope](../../dispatch/Envelope.html "class in akka.dispatch") envelope)
		```
		- #### serializeAndDeserializePayload
		
		
		
		```
		java.lang.Object serializeAndDeserializePayload​(java.lang.Object obj)
		```
		- #### start
		
		
		
		```
		[Dispatch](Dispatch.html "interface in akka.actor.dungeon") start()
		```
		
		Start this cell, i.e. attach it to the dispatcher.
		- #### stop
		
		
		
		```
		void stop()
		```
		- #### suspend
		
		
		
		```
		void suspend()
		```
		- #### swapMailbox
		
		
		
		```
		akka.dispatch.Mailbox swapMailbox​(akka.dispatch.Mailbox newMailbox)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/Dispatch.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MailboxType.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/SystemMessage.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/dungeon/Dispatch.html](https://doc.akka.io/japi/akka/current/akka/actor/dungeon/Dispatch.html)*