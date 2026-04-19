---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/HeaderBuilder.html
title: HeaderBuilder
---

# HeaderBuilder

## Content

Package [akka.remote.artery](package-summary.html)
## Interface HeaderBuilder

- ---

```
public interface HeaderBuilder
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[clearFlag](#clearFlag(akka.remote.artery.ByteFlag))​(akka.remote.artery.ByteFlag byteFlag)` |  |
	| `boolean` | `[flag](#flag(akka.remote.artery.ByteFlag))​(akka.remote.artery.ByteFlag byteFlag)` |  |
	| `byte` | `[flags](#flags())()` |  |
	| `byte` | `[inboundActorRefCompressionTableVersion](#inboundActorRefCompressionTableVersion())()` |  |
	| `byte` | `[inboundClassManifestCompressionTableVersion](#inboundClassManifestCompressionTableVersion())()` |  |
	| `boolean` | `[isNoRecipient](#isNoRecipient())()` |  |
	| `boolean` | `[isNoSender](#isNoSender())()` |  |
	| `<any>` | `[manifest](#manifest(long))​(long originUid)` |  |
	| `<any>` | `[outboundActorRefCompression](#outboundActorRefCompression())()` |  |
	| `<any>` | `[outboundClassManifestCompression](#outboundClassManifestCompression())()` |  |
	| `<any>` | `[recipientActorRef](#recipientActorRef(long))​(long originUid)` | Retrive the compressed ActorRef by the compressionId carried by this header. |
	| `<any>` | `[recipientActorRefPath](#recipientActorRefPath())()` | Retrive the raw literal actor path, instead of using the compressed value. |
	| `void` | `[resetMessageFields](#resetMessageFields())()` | Reset all fields that are related to an outbound message,  i.e. |
	| `<any>` | `[senderActorRef](#senderActorRef(long))​(long originUid)` | Retrive the compressed ActorRef by the compressionId carried by this header. |
	| `<any>` | `[senderActorRefPath](#senderActorRefPath())()` | Retrive the raw literal actor path, instead of using the compressed value. |
	| `int` | `[serializer](#serializer())()` |  |
	| `void` | `[setFlag](#setFlag(akka.remote.artery.ByteFlag))​(akka.remote.artery.ByteFlag byteFlag)` |  |
	| `void` | `[setFlags](#setFlags(byte))​(byte v)` |  |
	| `void` | `[setManifest](#setManifest(java.lang.String))​(java.lang.String manifest)` |  |
	| `void` | `[setNoRecipient](#setNoRecipient())()` |  |
	| `void` | `[setNoSender](#setNoSender())()` |  |
	| `void` | `[setOutboundActorRefCompression](#setOutboundActorRefCompression(%3Cany%3E))​(<any> table)` |  |
	| `void` | `[setOutboundClassManifestCompression](#setOutboundClassManifestCompression(%3Cany%3E))​(<any> table)` |  |
	| `void` | `[setRecipientActorRef](#setRecipientActorRef(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `void` | `[setRemoteInstruments](#setRemoteInstruments(akka.remote.artery.RemoteInstruments))​(akka.remote.artery.RemoteInstruments instruments)` |  |
	| `void` | `[setSenderActorRef](#setSenderActorRef(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `void` | `[setSerializer](#setSerializer(int))​(int serializer)` |  |
	| `void` | `[setUid](#setUid(long))​(long u)` |  |
	| `void` | `[setVersion](#setVersion(byte))​(byte v)` |  |
	| `long` | `[uid](#uid())()` |  |
	| `void` | `[useOutboundCompression](#useOutboundCompression(boolean))​(boolean on)` |  |
	| `byte` | `[version](#version())()` |  |

- - ### Method Detail
	
	
	
		- #### setVersion
		
		
		
		```
		void setVersion​(byte v)
		```
		- #### version
		
		
		
		```
		byte version()
		```
		- #### setFlags
		
		
		
		```
		void setFlags​(byte v)
		```
		- #### flags
		
		
		
		```
		byte flags()
		```
		- #### flag
		
		
		
		```
		boolean flag​(akka.remote.artery.ByteFlag byteFlag)
		```
		- #### setFlag
		
		
		
		```
		void setFlag​(akka.remote.artery.ByteFlag byteFlag)
		```
		- #### clearFlag
		
		
		
		```
		void clearFlag​(akka.remote.artery.ByteFlag byteFlag)
		```
		- #### inboundActorRefCompressionTableVersion
		
		
		
		```
		byte inboundActorRefCompressionTableVersion()
		```
		- #### inboundClassManifestCompressionTableVersion
		
		
		
		```
		byte inboundClassManifestCompressionTableVersion()
		```
		- #### useOutboundCompression
		
		
		
		```
		void useOutboundCompression​(boolean on)
		```
		- #### outboundActorRefCompression
		
		
		
		```
		<any> outboundActorRefCompression()
		```
		- #### setOutboundActorRefCompression
		
		
		
		```
		void setOutboundActorRefCompression​(<any> table)
		```
		- #### outboundClassManifestCompression
		
		
		
		```
		<any> outboundClassManifestCompression()
		```
		- #### setOutboundClassManifestCompression
		
		
		
		```
		void setOutboundClassManifestCompression​(<any> table)
		```
		- #### setUid
		
		
		
		```
		void setUid​(long u)
		```
		- #### uid
		
		
		
		```
		long uid()
		```
		- #### setSenderActorRef
		
		
		
		```
		void setSenderActorRef​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		- #### senderActorRef
		
		
		
		```
		<any> senderActorRef​(long originUid)
		```
		
		Retrive the compressed ActorRef by the compressionId carried by this header.
		 Returns `None` if ActorRef was not compressed, and then the literal [`senderActorRefPath()`](#senderActorRefPath()) should be used.
		- #### senderActorRefPath
		
		
		
		```
		<any> senderActorRefPath()
		```
		
		Retrive the raw literal actor path, instead of using the compressed value.
		 Returns `None` if ActorRef was compressed (!). To obtain the path in such case call [`senderActorRef(long)`](#senderActorRef(long)) and extract the path from it directly.
		- #### setNoSender
		
		
		
		```
		void setNoSender()
		```
		- #### isNoSender
		
		
		
		```
		boolean isNoSender()
		```
		- #### setNoRecipient
		
		
		
		```
		void setNoRecipient()
		```
		- #### isNoRecipient
		
		
		
		```
		boolean isNoRecipient()
		```
		- #### setRecipientActorRef
		
		
		
		```
		void setRecipientActorRef​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		- #### recipientActorRef
		
		
		
		```
		<any> recipientActorRef​(long originUid)
		```
		
		Retrive the compressed ActorRef by the compressionId carried by this header.
		 Returns `None` if ActorRef was not compressed, and then the literal [`recipientActorRefPath()`](#recipientActorRefPath()) should be used.
		- #### recipientActorRefPath
		
		
		
		```
		<any> recipientActorRefPath()
		```
		
		Retrive the raw literal actor path, instead of using the compressed value.
		 Returns `None` if ActorRef was compressed (!). To obtain the path in such case call [`recipientActorRefPath()`](#recipientActorRefPath()) and extract the path from it directly.
		- #### setSerializer
		
		
		
		```
		void setSerializer​(int serializer)
		```
		- #### serializer
		
		
		
		```
		int serializer()
		```
		- #### setManifest
		
		
		
		```
		void setManifest​(java.lang.String manifest)
		```
		- #### manifest
		
		
		
		```
		<any> manifest​(long originUid)
		```
		- #### setRemoteInstruments
		
		
		
		```
		void setRemoteInstruments​(akka.remote.artery.RemoteInstruments instruments)
		```
		- #### resetMessageFields
		
		
		
		```
		void resetMessageFields()
		```
		
		Reset all fields that are related to an outbound message,
		 i.e. Encoder calls this as the first thing in onPush.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/HeaderBuilder.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/HeaderBuilder.html)*