---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:08:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.html
title: JournalProtocol
---

# JournalProtocol

## Content

Package [akka.persistence](package-summary.html)
## Class JournalProtocol

- java.lang.Object
- - akka.persistence.JournalProtocol

- ---

```
public class JournalProtocol
extends java.lang.Object
```

INTERNAL API.
 
 Messages exchanged between persistent actors and a journal.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[JournalProtocol.DeleteMessagesTo](JournalProtocol.DeleteMessagesTo.html "class in akka.persistence")` | Request to delete all persistent messages with sequence numbers up to `toSequenceNr`  (inclusive). |
	| `static class` | `[JournalProtocol.DeleteMessagesTo$](JournalProtocol.DeleteMessagesTo$.html "class in akka.persistence")` |  |
	| `static class` | `[JournalProtocol.LoopMessageSuccess](JournalProtocol.LoopMessageSuccess.html "class in akka.persistence")` | Reply message to a [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") with a non\-persistent message. |
	| `static class` | `[JournalProtocol.LoopMessageSuccess$](JournalProtocol.LoopMessageSuccess$.html "class in akka.persistence")` |  |
	| `static interface` | `[JournalProtocol.Message](JournalProtocol.Message.html "interface in akka.persistence")` | Marker trait shared by internal journal messages. |
	| `static class` | `[JournalProtocol.RecoverySuccess](JournalProtocol.RecoverySuccess.html "class in akka.persistence")` | Reply message to a successful [`JournalProtocol.ReplayMessages`](JournalProtocol.ReplayMessages.html "class in akka.persistence") request. |
	| `static class` | `[JournalProtocol.RecoverySuccess$](JournalProtocol.RecoverySuccess$.html "class in akka.persistence")` |  |
	| `static class` | `[JournalProtocol.ReplayedMessage](JournalProtocol.ReplayedMessage.html "class in akka.persistence")` | Reply message to a [`JournalProtocol.ReplayMessages`](JournalProtocol.ReplayMessages.html "class in akka.persistence") request. |
	| `static class` | `[JournalProtocol.ReplayedMessage$](JournalProtocol.ReplayedMessage$.html "class in akka.persistence")` |  |
	| `static class` | `[JournalProtocol.ReplayMessages](JournalProtocol.ReplayMessages.html "class in akka.persistence")` | Request to replay messages to `persistentActor`. |
	| `static class` | `[JournalProtocol.ReplayMessages$](JournalProtocol.ReplayMessages$.html "class in akka.persistence")` |  |
	| `static class` | `[JournalProtocol.ReplayMessagesFailure](JournalProtocol.ReplayMessagesFailure.html "class in akka.persistence")` | Reply message to a failed [`JournalProtocol.ReplayMessages`](JournalProtocol.ReplayMessages.html "class in akka.persistence") request. |
	| `static class` | `[JournalProtocol.ReplayMessagesFailure$](JournalProtocol.ReplayMessagesFailure$.html "class in akka.persistence")` |  |
	| `static interface` | `[JournalProtocol.Request](JournalProtocol.Request.html "interface in akka.persistence")` | Internal journal command. |
	| `static interface` | `[JournalProtocol.Response](JournalProtocol.Response.html "interface in akka.persistence")` | Internal journal acknowledgement. |
	| `static class` | `[JournalProtocol.WriteMessageFailure](JournalProtocol.WriteMessageFailure.html "class in akka.persistence")` | Reply message to a failed [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") request. |
	| `static class` | `[JournalProtocol.WriteMessageFailure$](JournalProtocol.WriteMessageFailure$.html "class in akka.persistence")` |  |
	| `static class` | `[JournalProtocol.WriteMessageRejected](JournalProtocol.WriteMessageRejected.html "class in akka.persistence")` | Reply message to a rejected [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") request. |
	| `static class` | `[JournalProtocol.WriteMessageRejected$](JournalProtocol.WriteMessageRejected$.html "class in akka.persistence")` |  |
	| `static class` | `[JournalProtocol.WriteMessages](JournalProtocol.WriteMessages.html "class in akka.persistence")` |  |
	| `static class` | `[JournalProtocol.WriteMessages$](JournalProtocol.WriteMessages$.html "class in akka.persistence")` |  |
	| `static class` | `[JournalProtocol.WriteMessagesFailed](JournalProtocol.WriteMessagesFailed.html "class in akka.persistence")` | Reply message to a failed [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") request. |
	| `static class` | `[JournalProtocol.WriteMessagesFailed$](JournalProtocol.WriteMessagesFailed$.html "class in akka.persistence")` |  |
	| `static class` | `[JournalProtocol.WriteMessagesSuccessful$](JournalProtocol.WriteMessagesSuccessful$.html "class in akka.persistence")` | Reply message to a successful [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") request. |
	| `static class` | `[JournalProtocol.WriteMessageSuccess](JournalProtocol.WriteMessageSuccess.html "class in akka.persistence")` | Reply message to a successful [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") request. |
	| `static class` | `[JournalProtocol.WriteMessageSuccess$](JournalProtocol.WriteMessageSuccess$.html "class in akka.persistence")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JournalProtocol](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JournalProtocol
		
		
		
		```
		public JournalProtocol()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.DeleteMessagesTo$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.DeleteMessagesTo.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.LoopMessageSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.LoopMessageSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.Message.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.RecoverySuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.RecoverySuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.ReplayMessages$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.ReplayMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.ReplayMessagesFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.ReplayMessagesFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.ReplayedMessage$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.ReplayedMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.Request.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.Response.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessageFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessageFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessageRejected$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessageRejected.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessageSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessageSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessages$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessagesFailed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessagesFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessagesSuccessful$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.html)*