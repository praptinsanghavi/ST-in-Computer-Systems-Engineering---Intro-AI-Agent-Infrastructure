---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:32:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/InboundCompressions.html
title: InboundCompressions
---

# InboundCompressions

## Content

Package [akka.remote.artery.compress](package-summary.html)
## Interface InboundCompressions

- All Known Implementing Classes:
`[NoInboundCompressions$](NoInboundCompressions$.html "class in akka.remote.artery.compress")`

---

```
public interface InboundCompressions
```

INTERNAL API
 Decompress and cause compression advertisements.
 
 One per inbound message stream thus must demux by originUid to use the right tables.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[close](#close(long))​(long originUid)` | Remove compression and cancel advertisement scheduling for a specific origin |
	| `void` | `[confirmActorRefCompressionAdvertisement](#confirmActorRefCompressionAdvertisement(long,byte))​(long originUid,  byte tableVersion)` |  |
	| `void` | `[confirmClassManifestCompressionAdvertisement](#confirmClassManifestCompressionAdvertisement(long,byte))​(long originUid,  byte tableVersion)` |  |
	| `scala.collection.immutable.Set<java.lang.Object>` | `[currentOriginUids](#currentOriginUids())()` |  |
	| `<any>` | `[decompressActorRef](#decompressActorRef(long,byte,int))​(long originUid,  byte tableVersion,  int idx)` |  |
	| `<any>` | `[decompressClassManifest](#decompressClassManifest(long,byte,int))​(long originUid,  byte tableVersion,  int idx)` |  |
	| `void` | `[hitActorRef](#hitActorRef(long,akka.actor.Address,akka.actor.ActorRef,int))​(long originUid,  [Address](../../../actor/Address.html "class in akka.actor") remote,  [ActorRef](../../../actor/ActorRef.html "class in akka.actor") ref,  int n)` |  |
	| `void` | `[hitClassManifest](#hitClassManifest(long,akka.actor.Address,java.lang.String,int))​(long originUid,  [Address](../../../actor/Address.html "class in akka.actor") remote,  java.lang.String manifest,  int n)` |  |
	| `void` | `[runNextActorRefAdvertisement](#runNextActorRefAdvertisement())()` | Triggers compression advertisement via control message. |
	| `void` | `[runNextClassManifestAdvertisement](#runNextClassManifestAdvertisement())()` | Triggers compression advertisement via control message. |

- - ### Method Detail
	
	
	
		- #### close
		
		
		
		```
		void close​(long originUid)
		```
		
		Remove compression and cancel advertisement scheduling for a specific origin
		- #### confirmActorRefCompressionAdvertisement
		
		
		
		```
		void confirmActorRefCompressionAdvertisement​(long originUid,
		                                             byte tableVersion)
		```
		- #### confirmClassManifestCompressionAdvertisement
		
		
		
		```
		void confirmClassManifestCompressionAdvertisement​(long originUid,
		                                                  byte tableVersion)
		```
		- #### currentOriginUids
		
		
		
		```
		scala.collection.immutable.Set<java.lang.Object> currentOriginUids()
		```
		- #### decompressActorRef
		
		
		
		```
		<any> decompressActorRef​(long originUid,
		                         byte tableVersion,
		                         int idx)
		```
		- #### decompressClassManifest
		
		
		
		```
		<any> decompressClassManifest​(long originUid,
		                              byte tableVersion,
		                              int idx)
		```
		- #### hitActorRef
		
		
		
		```
		void hitActorRef​(long originUid,
		                 [Address](../../../actor/Address.html "class in akka.actor") remote,
		                 [ActorRef](../../../actor/ActorRef.html "class in akka.actor") ref,
		                 int n)
		```
		- #### hitClassManifest
		
		
		
		```
		void hitClassManifest​(long originUid,
		                      [Address](../../../actor/Address.html "class in akka.actor") remote,
		                      java.lang.String manifest,
		                      int n)
		```
		- #### runNextActorRefAdvertisement
		
		
		
		```
		void runNextActorRefAdvertisement()
		```
		
		Triggers compression advertisement via control message.
		- #### runNextClassManifestAdvertisement
		
		
		
		```
		void runNextClassManifestAdvertisement()
		```
		
		Triggers compression advertisement via control message.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/NoInboundCompressions$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/InboundCompressions.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/InboundCompressions.html)*