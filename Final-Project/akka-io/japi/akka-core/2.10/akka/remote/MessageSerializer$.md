---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/MessageSerializer$.html
title: MessageSerializer$
---

# MessageSerializer$

## Content

Package [akka.remote](package-summary.html)
## Class MessageSerializer$

- java.lang.Object
- - akka.remote.MessageSerializer$

- ---

```
public class MessageSerializer$
extends java.lang.Object
```

INTERNAL API
 
 MessageSerializer is a helper for serializing and deserialize messages

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MessageSerializer$](MessageSerializer$.html "class in akka.remote")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageSerializer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[deserialize](#deserialize(akka.actor.ExtendedActorSystem,akka.remote.WireFormats.SerializedMessage))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system,  [WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") messageProtocol)` | Uses Akka Serialization for the specified ActorSystem to transform the given MessageProtocol to a message |
	| `java.lang.Object` | `[deserializeForArtery](#deserializeForArtery(akka.actor.ExtendedActorSystem,long,akka.serialization.Serialization,int,java.lang.String,akka.remote.artery.EnvelopeBuffer))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system,  long originUid,  [Serialization](../serialization/Serialization.html "class in akka.serialization") serialization,  int serializer,  java.lang.String classManifest,  akka.remote.artery.EnvelopeBuffer envelope)` |  |
	| `[WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote")` | `[serialize](#serialize(akka.actor.ExtendedActorSystem,java.lang.Object))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system,  java.lang.Object message)` | Uses Akka Serialization for the specified ActorSystem to transform the given message to a MessageProtocol  Throws `NotSerializableException` if serializer was not configured for the message type. |
	| `void` | `[serializeForArtery](#serializeForArtery(akka.serialization.Serialization,akka.remote.artery.OutboundEnvelope,akka.remote.artery.HeaderBuilder,akka.remote.artery.EnvelopeBuffer))​([Serialization](../serialization/Serialization.html "class in akka.serialization") serialization,  [OutboundEnvelope](artery/OutboundEnvelope.html "interface in akka.remote.artery") outboundEnvelope,  [HeaderBuilder](artery/HeaderBuilder.html "interface in akka.remote.artery") headerBuilder,  akka.remote.artery.EnvelopeBuffer envelope)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MessageSerializer$](MessageSerializer$.html "class in akka.remote") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MessageSerializer$
		
		
		
		```
		public MessageSerializer$()
		```

	- ### Method Detail
	
	
	
		- #### deserialize
		
		
		
		```
		public java.lang.Object deserialize​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                    [WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") messageProtocol)
		```
		
		Uses Akka Serialization for the specified ActorSystem to transform the given MessageProtocol to a message
		- #### serialize
		
		
		
		```
		public [WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") serialize​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                               java.lang.Object message)
		```
		
		Uses Akka Serialization for the specified ActorSystem to transform the given message to a MessageProtocol
		 Throws `NotSerializableException` if serializer was not configured for the message type.
		 Throws `MessageSerializer.SerializationException` if exception was thrown from `toBinary` of the
		 serializer.
		- #### serializeForArtery
		
		
		
		```
		public void serializeForArtery​([Serialization](../serialization/Serialization.html "class in akka.serialization") serialization,
		                               [OutboundEnvelope](artery/OutboundEnvelope.html "interface in akka.remote.artery") outboundEnvelope,
		                               [HeaderBuilder](artery/HeaderBuilder.html "interface in akka.remote.artery") headerBuilder,
		                               akka.remote.artery.EnvelopeBuffer envelope)
		```
		- #### deserializeForArtery
		
		
		
		```
		public java.lang.Object deserializeForArtery​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                             long originUid,
		                                             [Serialization](../serialization/Serialization.html "class in akka.serialization") serialization,
		                                             int serializer,
		                                             java.lang.String classManifest,
		                                             akka.remote.artery.EnvelopeBuffer envelope)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/MessageSerializer$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.SerializedMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/HeaderBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/OutboundEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serialization.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/MessageSerializer$.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/MessageSerializer$.html)*