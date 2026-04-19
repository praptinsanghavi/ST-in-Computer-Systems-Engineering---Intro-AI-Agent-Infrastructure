---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/InboundEnvelope.html
title: InboundEnvelope
---

# InboundEnvelope

## Content

Package [akka.remote.artery](package-summary.html)
## Interface InboundEnvelope

- All Superinterfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`

---

```
public interface InboundEnvelope
extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<any>` | `[association](#association())()` |  |
	| `java.lang.String` | `[classManifest](#classManifest())()` |  |
	| `[InboundEnvelope](InboundEnvelope.html "interface in akka.remote.artery")` | `[copyForLane](#copyForLane(int))​(int lane)` |  |
	| `akka.remote.artery.EnvelopeBuffer` | `[envelopeBuffer](#envelopeBuffer())()` |  |
	| `boolean` | `[flag](#flag(akka.remote.artery.ByteFlag))​(akka.remote.artery.ByteFlag byteFlag)` |  |
	| `byte` | `[flags](#flags())()` |  |
	| `int` | `[lane](#lane())()` |  |
	| `java.lang.Object` | `[message](#message())()` |  |
	| `long` | `[originUid](#originUid())()` |  |
	| `<any>` | `[recipient](#recipient())()` |  |
	| `[InboundEnvelope](InboundEnvelope.html "interface in akka.remote.artery")` | `[releaseEnvelopeBuffer](#releaseEnvelopeBuffer())()` |  |
	| `<any>` | `[sender](#sender())()` |  |
	| `int` | `[serializer](#serializer())()` |  |
	| `[InboundEnvelope](InboundEnvelope.html "interface in akka.remote.artery")` | `[withMessage](#withMessage(java.lang.Object))​(java.lang.Object message)` |  |
	| `[InboundEnvelope](InboundEnvelope.html "interface in akka.remote.artery")` | `[withRecipient](#withRecipient(akka.actor.InternalActorRef))​(akka.actor.InternalActorRef ref)` |  |

- - ### Method Detail
	
	
	
		- #### recipient
		
		
		
		```
		<any> recipient()
		```
		- #### sender
		
		
		
		```
		<any> sender()
		```
		- #### originUid
		
		
		
		```
		long originUid()
		```
		- #### association
		
		
		
		```
		<any> association()
		```
		- #### serializer
		
		
		
		```
		int serializer()
		```
		- #### classManifest
		
		
		
		```
		java.lang.String classManifest()
		```
		- #### message
		
		
		
		```
		java.lang.Object message()
		```
		- #### envelopeBuffer
		
		
		
		```
		akka.remote.artery.EnvelopeBuffer envelopeBuffer()
		```
		- #### flags
		
		
		
		```
		byte flags()
		```
		- #### flag
		
		
		
		```
		boolean flag​(akka.remote.artery.ByteFlag byteFlag)
		```
		- #### withMessage
		
		
		
		```
		[InboundEnvelope](InboundEnvelope.html "interface in akka.remote.artery") withMessage​(java.lang.Object message)
		```
		- #### releaseEnvelopeBuffer
		
		
		
		```
		[InboundEnvelope](InboundEnvelope.html "interface in akka.remote.artery") releaseEnvelopeBuffer()
		```
		- #### withRecipient
		
		
		
		```
		[InboundEnvelope](InboundEnvelope.html "interface in akka.remote.artery") withRecipient​(akka.actor.InternalActorRef ref)
		```
		- #### lane
		
		
		
		```
		int lane()
		```
		- #### copyForLane
		
		
		
		```
		[InboundEnvelope](InboundEnvelope.html "interface in akka.remote.artery") copyForLane​(int lane)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/InboundEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/InboundEnvelope.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/InboundEnvelope.html)*