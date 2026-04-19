---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorFlightRecorder.html
title: ActorFlightRecorder
---

# ActorFlightRecorder

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class ActorFlightRecorder

- java.lang.Object
- - akka.actor.typed.internal.ActorFlightRecorder

- ---

```
public class ActorFlightRecorder
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorFlightRecorder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[consumerChangedProducer](#consumerChangedProducer(java.lang.String))​(java.lang.String producerId)` |  |
	| `static void` | `[consumerCreated](#consumerCreated(akka.actor.ActorPath))​([ActorPath](../../ActorPath.html "interface in akka.actor") path)` |  |
	| `static void` | `[consumerDuplicate](#consumerDuplicate(java.lang.String,long,long))​(java.lang.String producerId,  long expectedSeqNr,  long seqNr)` |  |
	| `static void` | `[consumerMissing](#consumerMissing(java.lang.String,long,long))​(java.lang.String producerId,  long expectedSeqNr,  long seqNr)` |  |
	| `static void` | `[consumerReceived](#consumerReceived(java.lang.String,long))​(java.lang.String producerId,  long seqNr)` |  |
	| `static void` | `[consumerReceivedPreviousInProgress](#consumerReceivedPreviousInProgress(java.lang.String,long,int))​(java.lang.String producerId,  long seqNr,  int stashed)` |  |
	| `static void` | `[consumerReceivedResend](#consumerReceivedResend(long))​(long seqNr)` |  |
	| `static void` | `[consumerSentRequest](#consumerSentRequest(java.lang.String,long))​(java.lang.String producerId,  long requestedSeqNr)` |  |
	| `static void` | `[consumerStarted](#consumerStarted(akka.actor.ActorPath))​([ActorPath](../../ActorPath.html "interface in akka.actor") path)` |  |
	| `static void` | `[consumerStashFull](#consumerStashFull(java.lang.String,long))​(java.lang.String producerId,  long seqNr)` |  |
	| `static void` | `[producerCreated](#producerCreated(java.lang.String,akka.actor.ActorPath))​(java.lang.String producerId,  [ActorPath](../../ActorPath.html "interface in akka.actor") path)` |  |
	| `static void` | `[producerReceived](#producerReceived(java.lang.String,long))​(java.lang.String producerId,  long currentSeqNr)` |  |
	| `static void` | `[producerReceivedRequest](#producerReceivedRequest(java.lang.String,long,long))​(java.lang.String producerId,  long requestedSeqNr,  long confirmedSeqNr)` |  |
	| `static void` | `[producerReceivedResend](#producerReceivedResend(java.lang.String,long))​(java.lang.String producerId,  long fromSeqNr)` |  |
	| `static void` | `[producerRequestNext](#producerRequestNext(java.lang.String,long,long))​(java.lang.String producerId,  long currentSeqNr,  long confirmedSeqNr)` |  |
	| `static void` | `[producerResentFirst](#producerResentFirst(java.lang.String,long))​(java.lang.String producerId,  long firstSeqNr)` |  |
	| `static void` | `[producerResentFirstUnconfirmed](#producerResentFirstUnconfirmed(java.lang.String,long))​(java.lang.String producerId,  long seqNr)` |  |
	| `static void` | `[producerResentUnconfirmed](#producerResentUnconfirmed(java.lang.String,long,long))​(java.lang.String producerId,  long fromSeqNr,  long toSeqNr)` |  |
	| `static void` | `[producerSent](#producerSent(java.lang.String,long))​(java.lang.String producerId,  long seqNr)` |  |
	| `static void` | `[producerStarted](#producerStarted(java.lang.String,akka.actor.ActorPath))​(java.lang.String producerId,  [ActorPath](../../ActorPath.html "interface in akka.actor") path)` |  |
	| `static void` | `[producerWaitingForRequest](#producerWaitingForRequest(java.lang.String,long))​(java.lang.String producerId,  long currentSeqNr)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorFlightRecorder
		
		
		
		```
		public ActorFlightRecorder()
		```

	- ### Method Detail
	
	
	
		- #### producerCreated
		
		
		
		```
		public static void producerCreated​(java.lang.String producerId,
		                                   [ActorPath](../../ActorPath.html "interface in akka.actor") path)
		```
		- #### producerStarted
		
		
		
		```
		public static void producerStarted​(java.lang.String producerId,
		                                   [ActorPath](../../ActorPath.html "interface in akka.actor") path)
		```
		- #### producerRequestNext
		
		
		
		```
		public static void producerRequestNext​(java.lang.String producerId,
		                                       long currentSeqNr,
		                                       long confirmedSeqNr)
		```
		- #### producerSent
		
		
		
		```
		public static void producerSent​(java.lang.String producerId,
		                                long seqNr)
		```
		- #### producerWaitingForRequest
		
		
		
		```
		public static void producerWaitingForRequest​(java.lang.String producerId,
		                                             long currentSeqNr)
		```
		- #### producerResentUnconfirmed
		
		
		
		```
		public static void producerResentUnconfirmed​(java.lang.String producerId,
		                                             long fromSeqNr,
		                                             long toSeqNr)
		```
		- #### producerResentFirst
		
		
		
		```
		public static void producerResentFirst​(java.lang.String producerId,
		                                       long firstSeqNr)
		```
		- #### producerResentFirstUnconfirmed
		
		
		
		```
		public static void producerResentFirstUnconfirmed​(java.lang.String producerId,
		                                                  long seqNr)
		```
		- #### producerReceived
		
		
		
		```
		public static void producerReceived​(java.lang.String producerId,
		                                    long currentSeqNr)
		```
		- #### producerReceivedRequest
		
		
		
		```
		public static void producerReceivedRequest​(java.lang.String producerId,
		                                           long requestedSeqNr,
		                                           long confirmedSeqNr)
		```
		- #### producerReceivedResend
		
		
		
		```
		public static void producerReceivedResend​(java.lang.String producerId,
		                                          long fromSeqNr)
		```
		- #### consumerCreated
		
		
		
		```
		public static void consumerCreated​([ActorPath](../../ActorPath.html "interface in akka.actor") path)
		```
		- #### consumerStarted
		
		
		
		```
		public static void consumerStarted​([ActorPath](../../ActorPath.html "interface in akka.actor") path)
		```
		- #### consumerReceived
		
		
		
		```
		public static void consumerReceived​(java.lang.String producerId,
		                                    long seqNr)
		```
		- #### consumerReceivedPreviousInProgress
		
		
		
		```
		public static void consumerReceivedPreviousInProgress​(java.lang.String producerId,
		                                                      long seqNr,
		                                                      int stashed)
		```
		- #### consumerDuplicate
		
		
		
		```
		public static void consumerDuplicate​(java.lang.String producerId,
		                                     long expectedSeqNr,
		                                     long seqNr)
		```
		- #### consumerMissing
		
		
		
		```
		public static void consumerMissing​(java.lang.String producerId,
		                                   long expectedSeqNr,
		                                   long seqNr)
		```
		- #### consumerReceivedResend
		
		
		
		```
		public static void consumerReceivedResend​(long seqNr)
		```
		- #### consumerSentRequest
		
		
		
		```
		public static void consumerSentRequest​(java.lang.String producerId,
		                                       long requestedSeqNr)
		```
		- #### consumerChangedProducer
		
		
		
		```
		public static void consumerChangedProducer​(java.lang.String producerId)
		```
		- #### consumerStashFull
		
		
		
		```
		public static void consumerStashFull​(java.lang.String producerId,
		                                     long seqNr)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorFlightRecorder.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorFlightRecorder.html)*