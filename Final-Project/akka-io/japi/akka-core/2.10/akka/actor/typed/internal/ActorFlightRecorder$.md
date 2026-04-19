---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorFlightRecorder$.html
title: ActorFlightRecorder$
---

# ActorFlightRecorder$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class ActorFlightRecorder$

- java.lang.Object
- - akka.actor.typed.internal.ActorFlightRecorder$

- ---

```
public class ActorFlightRecorder$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorFlightRecorder$](ActorFlightRecorder$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorFlightRecorder$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[consumerChangedProducer](#consumerChangedProducer(java.lang.String))​(java.lang.String producerId)` |  |
	| `void` | `[consumerCreated](#consumerCreated(akka.actor.ActorPath))​([ActorPath](../../ActorPath.html "interface in akka.actor") path)` |  |
	| `void` | `[consumerDuplicate](#consumerDuplicate(java.lang.String,long,long))​(java.lang.String producerId,  long expectedSeqNr,  long seqNr)` |  |
	| `void` | `[consumerMissing](#consumerMissing(java.lang.String,long,long))​(java.lang.String producerId,  long expectedSeqNr,  long seqNr)` |  |
	| `void` | `[consumerReceived](#consumerReceived(java.lang.String,long))​(java.lang.String producerId,  long seqNr)` |  |
	| `void` | `[consumerReceivedPreviousInProgress](#consumerReceivedPreviousInProgress(java.lang.String,long,int))​(java.lang.String producerId,  long seqNr,  int stashed)` |  |
	| `void` | `[consumerReceivedResend](#consumerReceivedResend(long))​(long seqNr)` |  |
	| `void` | `[consumerSentRequest](#consumerSentRequest(java.lang.String,long))​(java.lang.String producerId,  long requestedSeqNr)` |  |
	| `void` | `[consumerStarted](#consumerStarted(akka.actor.ActorPath))​([ActorPath](../../ActorPath.html "interface in akka.actor") path)` |  |
	| `void` | `[consumerStashFull](#consumerStashFull(java.lang.String,long))​(java.lang.String producerId,  long seqNr)` |  |
	| `void` | `[producerCreated](#producerCreated(java.lang.String,akka.actor.ActorPath))​(java.lang.String producerId,  [ActorPath](../../ActorPath.html "interface in akka.actor") path)` |  |
	| `void` | `[producerReceived](#producerReceived(java.lang.String,long))​(java.lang.String producerId,  long currentSeqNr)` |  |
	| `void` | `[producerReceivedRequest](#producerReceivedRequest(java.lang.String,long,long))​(java.lang.String producerId,  long requestedSeqNr,  long confirmedSeqNr)` |  |
	| `void` | `[producerReceivedResend](#producerReceivedResend(java.lang.String,long))​(java.lang.String producerId,  long fromSeqNr)` |  |
	| `void` | `[producerRequestNext](#producerRequestNext(java.lang.String,long,long))​(java.lang.String producerId,  long currentSeqNr,  long confirmedSeqNr)` |  |
	| `void` | `[producerResentFirst](#producerResentFirst(java.lang.String,long))​(java.lang.String producerId,  long firstSeqNr)` |  |
	| `void` | `[producerResentFirstUnconfirmed](#producerResentFirstUnconfirmed(java.lang.String,long))​(java.lang.String producerId,  long seqNr)` |  |
	| `void` | `[producerResentUnconfirmed](#producerResentUnconfirmed(java.lang.String,long,long))​(java.lang.String producerId,  long fromSeqNr,  long toSeqNr)` |  |
	| `void` | `[producerSent](#producerSent(java.lang.String,long))​(java.lang.String producerId,  long seqNr)` |  |
	| `void` | `[producerStarted](#producerStarted(java.lang.String,akka.actor.ActorPath))​(java.lang.String producerId,  [ActorPath](../../ActorPath.html "interface in akka.actor") path)` |  |
	| `void` | `[producerWaitingForRequest](#producerWaitingForRequest(java.lang.String,long))​(java.lang.String producerId,  long currentSeqNr)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorFlightRecorder$](ActorFlightRecorder$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorFlightRecorder$
		
		
		
		```
		public ActorFlightRecorder$()
		```

	- ### Method Detail
	
	
	
		- #### producerCreated
		
		
		
		```
		public void producerCreated​(java.lang.String producerId,
		                            [ActorPath](../../ActorPath.html "interface in akka.actor") path)
		```
		- #### producerStarted
		
		
		
		```
		public void producerStarted​(java.lang.String producerId,
		                            [ActorPath](../../ActorPath.html "interface in akka.actor") path)
		```
		- #### producerRequestNext
		
		
		
		```
		public void producerRequestNext​(java.lang.String producerId,
		                                long currentSeqNr,
		                                long confirmedSeqNr)
		```
		- #### producerSent
		
		
		
		```
		public void producerSent​(java.lang.String producerId,
		                         long seqNr)
		```
		- #### producerWaitingForRequest
		
		
		
		```
		public void producerWaitingForRequest​(java.lang.String producerId,
		                                      long currentSeqNr)
		```
		- #### producerResentUnconfirmed
		
		
		
		```
		public void producerResentUnconfirmed​(java.lang.String producerId,
		                                      long fromSeqNr,
		                                      long toSeqNr)
		```
		- #### producerResentFirst
		
		
		
		```
		public void producerResentFirst​(java.lang.String producerId,
		                                long firstSeqNr)
		```
		- #### producerResentFirstUnconfirmed
		
		
		
		```
		public void producerResentFirstUnconfirmed​(java.lang.String producerId,
		                                           long seqNr)
		```
		- #### producerReceived
		
		
		
		```
		public void producerReceived​(java.lang.String producerId,
		                             long currentSeqNr)
		```
		- #### producerReceivedRequest
		
		
		
		```
		public void producerReceivedRequest​(java.lang.String producerId,
		                                    long requestedSeqNr,
		                                    long confirmedSeqNr)
		```
		- #### producerReceivedResend
		
		
		
		```
		public void producerReceivedResend​(java.lang.String producerId,
		                                   long fromSeqNr)
		```
		- #### consumerCreated
		
		
		
		```
		public void consumerCreated​([ActorPath](../../ActorPath.html "interface in akka.actor") path)
		```
		- #### consumerStarted
		
		
		
		```
		public void consumerStarted​([ActorPath](../../ActorPath.html "interface in akka.actor") path)
		```
		- #### consumerReceived
		
		
		
		```
		public void consumerReceived​(java.lang.String producerId,
		                             long seqNr)
		```
		- #### consumerReceivedPreviousInProgress
		
		
		
		```
		public void consumerReceivedPreviousInProgress​(java.lang.String producerId,
		                                               long seqNr,
		                                               int stashed)
		```
		- #### consumerDuplicate
		
		
		
		```
		public void consumerDuplicate​(java.lang.String producerId,
		                              long expectedSeqNr,
		                              long seqNr)
		```
		- #### consumerMissing
		
		
		
		```
		public void consumerMissing​(java.lang.String producerId,
		                            long expectedSeqNr,
		                            long seqNr)
		```
		- #### consumerReceivedResend
		
		
		
		```
		public void consumerReceivedResend​(long seqNr)
		```
		- #### consumerSentRequest
		
		
		
		```
		public void consumerSentRequest​(java.lang.String producerId,
		                                long requestedSeqNr)
		```
		- #### consumerChangedProducer
		
		
		
		```
		public void consumerChangedProducer​(java.lang.String producerId)
		```
		- #### consumerStashFull
		
		
		
		```
		public void consumerStashFull​(java.lang.String producerId,
		                              long seqNr)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorFlightRecorder$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorFlightRecorder$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorFlightRecorder$.html)*