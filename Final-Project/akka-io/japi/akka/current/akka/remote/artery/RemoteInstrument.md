---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/RemoteInstrument.html
title: RemoteInstrument
---

# RemoteInstrument

## Content

Package [akka.remote.artery](package-summary.html)
## Class RemoteInstrument

- java.lang.Object
- - akka.remote.artery.RemoteInstrument

- ---

```
public abstract class RemoteInstrument
extends java.lang.Object
```

INTERNAL API
 
 Part of the monitoring SPI which allows attaching metadata to outbound remote messages,
 and reading in metadata from incoming messages.
 

 Multiple instruments are automatically handled, however they MUST NOT overlap in their idenfitiers.
 

 Instances of `RemoteInstrument` are created from configuration. A new instance of RemoteInstrument
 will be created for each encoder and decoder. It's only called from the operator, so if it doesn't
 delegate to any shared instance it doesn't have to be thread\-safe.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteInstrument](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract byte` | `[identifier](#identifier())()` | Instrument identifier. |
	| `abstract void` | `[remoteMessageReceived](#remoteMessageReceived(akka.actor.ActorRef,java.lang.Object,akka.actor.ActorRef,int,long))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") recipient,  java.lang.Object message,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") sender,  int size,  long time)` | Called when the message has been deserialized. |
	| `abstract void` | `[remoteMessageSent](#remoteMessageSent(akka.actor.ActorRef,java.lang.Object,akka.actor.ActorRef,int,long))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") recipient,  java.lang.Object message,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") sender,  int size,  long time)` | Called right before putting the message onto the wire. |
	| `abstract void` | `[remoteReadMetadata](#remoteReadMetadata(akka.actor.ActorRef,java.lang.Object,akka.actor.ActorRef,java.nio.ByteBuffer))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") recipient,  java.lang.Object message,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") sender,  java.nio.ByteBuffer buffer)` | Called while deserializing the message once a message (containing a metadata field designated for this instrument) is found. |
	| `abstract void` | `[remoteWriteMetadata](#remoteWriteMetadata(akka.actor.ActorRef,java.lang.Object,akka.actor.ActorRef,java.nio.ByteBuffer))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") recipient,  java.lang.Object message,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") sender,  java.nio.ByteBuffer buffer)` | Called while serializing the message. |
	| `boolean` | `[serializationTimingEnabled](#serializationTimingEnabled())()` | Should the serialization be timed? Otherwise times are always 0\. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RemoteInstrument
		
		
		
		```
		public RemoteInstrument()
		```

	- ### Method Detail
	
	
	
		- #### identifier
		
		
		
		```
		public abstract byte identifier()
		```
		
		Instrument identifier.
		 
		 MUST be \>\=1 and \<32\.
		 
		
		
		 Values between 1 and 7 are reserved for Akka internal use.
		- #### remoteMessageReceived
		
		
		
		```
		public abstract void remoteMessageReceived​([ActorRef](../../actor/ActorRef.html "class in akka.actor") recipient,
		                                           java.lang.Object message,
		                                           [ActorRef](../../actor/ActorRef.html "class in akka.actor") sender,
		                                           int size,
		                                           long time)
		```
		
		Called when the message has been deserialized.
		 
		 The `size` is the total serialized size in bytes of the complete message including akka specific headers and any
		 `RemoteInstrument` metadata.
		 If `serializationTimingEnabled` returns true, then `time` will be the total time it took to deserialize all data
		 in the message in nanoseconds, otherwise it is 0\.
		- #### remoteMessageSent
		
		
		
		```
		public abstract void remoteMessageSent​([ActorRef](../../actor/ActorRef.html "class in akka.actor") recipient,
		                                       java.lang.Object message,
		                                       [ActorRef](../../actor/ActorRef.html "class in akka.actor") sender,
		                                       int size,
		                                       long time)
		```
		
		Called right before putting the message onto the wire.
		 Parameters MAY be `null` (except `message` and `buffer`)!
		 
		 The `size` is the total serialized size in bytes of the complete message including akka specific headers and any
		 `RemoteInstrument` metadata.
		 If `serializationTimingEnabled` returns true, then `time` will be the total time it took to serialize all data
		 in the message in nanoseconds, otherwise it is 0\.
		- #### remoteReadMetadata
		
		
		
		```
		public abstract void remoteReadMetadata​([ActorRef](../../actor/ActorRef.html "class in akka.actor") recipient,
		                                        java.lang.Object message,
		                                        [ActorRef](../../actor/ActorRef.html "class in akka.actor") sender,
		                                        java.nio.ByteBuffer buffer)
		```
		
		Called while deserializing the message once a message (containing a metadata field designated for this instrument) is found.
		- #### remoteWriteMetadata
		
		
		
		```
		public abstract void remoteWriteMetadata​([ActorRef](../../actor/ActorRef.html "class in akka.actor") recipient,
		                                         java.lang.Object message,
		                                         [ActorRef](../../actor/ActorRef.html "class in akka.actor") sender,
		                                         java.nio.ByteBuffer buffer)
		```
		
		Called while serializing the message.
		 Parameters MAY be `null` (except `message` and `buffer`)!
		- #### serializationTimingEnabled
		
		
		
		```
		public boolean serializationTimingEnabled()
		```
		
		Should the serialization be timed? Otherwise times are always 0\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/RemoteInstrument.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/RemoteInstrument.html)*