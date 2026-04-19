---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.html
title: ArteryControlFormats
---

# ArteryControlFormats

## Content

Package [akka.remote](package-summary.html)
## Class ArteryControlFormats

- java.lang.Object
- - akka.remote.ArteryControlFormats

- ---

```
public final class ArteryControlFormats
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote")` | Defines a remote address. |
	| `static interface` | `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")` |  |
	| `static class` | `[ArteryControlFormats.ArteryHeartbeatRsp](ArteryControlFormats.ArteryHeartbeatRsp.html "class in akka.remote")` | RemoteWatcher.ArteryHeartbeat is empty array  RemoteWatcher.ArteryHeartbeatRsp |
	| `static interface` | `[ArteryControlFormats.ArteryHeartbeatRspOrBuilder](ArteryControlFormats.ArteryHeartbeatRspOrBuilder.html "interface in akka.remote")` |  |
	| `static class` | `[ArteryControlFormats.CompressionTableAdvertisement](ArteryControlFormats.CompressionTableAdvertisement.html "class in akka.remote")` | CompressionProtocol.ActorRefCompressionAdvertisement  CompressionProtocol.ClassManifestCompressionAdvertisement |
	| `static class` | `[ArteryControlFormats.CompressionTableAdvertisementAck](ArteryControlFormats.CompressionTableAdvertisementAck.html "class in akka.remote")` | CompressionProtocol.ActorRefCompressionAdvertisementAck  CompressionProtocol.ClassManifestCompressionAdvertisementAck |
	| `static interface` | `[ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html "interface in akka.remote")` |  |
	| `static interface` | `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")` |  |
	| `static class` | `[ArteryControlFormats.FlushAck](ArteryControlFormats.FlushAck.html "class in akka.remote")` | Protobuf type `FlushAck` |
	| `static interface` | `[ArteryControlFormats.FlushAckOrBuilder](ArteryControlFormats.FlushAckOrBuilder.html "interface in akka.remote")` |  |
	| `static class` | `[ArteryControlFormats.HandshakeReq](ArteryControlFormats.HandshakeReq.html "class in akka.remote")` | Protobuf type `HandshakeReq` |
	| `static interface` | `[ArteryControlFormats.HandshakeReqOrBuilder](ArteryControlFormats.HandshakeReqOrBuilder.html "interface in akka.remote")` |  |
	| `static class` | `[ArteryControlFormats.MessageWithAddress](ArteryControlFormats.MessageWithAddress.html "class in akka.remote")` | Generic message declaration that is used for all types of message that (currently) have a single  address field. |
	| `static interface` | `[ArteryControlFormats.MessageWithAddressOrBuilder](ArteryControlFormats.MessageWithAddressOrBuilder.html "interface in akka.remote")` |  |
	| `static class` | `[ArteryControlFormats.Quarantined](ArteryControlFormats.Quarantined.html "class in akka.remote")` | Protobuf type `Quarantined` |
	| `static interface` | `[ArteryControlFormats.QuarantinedOrBuilder](ArteryControlFormats.QuarantinedOrBuilder.html "interface in akka.remote")` |  |
	| `static class` | `[ArteryControlFormats.SystemMessageDeliveryAck](ArteryControlFormats.SystemMessageDeliveryAck.html "class in akka.remote")` | SystemMessageDelivery.Ack  SystemMessageDelivery.Nack |
	| `static interface` | `[ArteryControlFormats.SystemMessageDeliveryAckOrBuilder](ArteryControlFormats.SystemMessageDeliveryAckOrBuilder.html "interface in akka.remote")` |  |
	| `static class` | `[ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | SystemMessageDelivery.SystemMessageEnvelope |
	| `static interface` | `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")` |  |
	| `static class` | `[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | Defines a remote address with uid. |
	| `static interface` | `[ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.protobufv3.internal.Descriptors.FileDescriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `static void` | `[registerAllExtensions](#registerAllExtensions(akka.protobufv3.internal.ExtensionRegistry))​(akka.protobufv3.internal.ExtensionRegistry registry)` |  |
	| `static void` | `[registerAllExtensions](#registerAllExtensions(akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ExtensionRegistryLite registry)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### registerAllExtensions
		
		
		
		```
		public static void registerAllExtensions​(akka.protobufv3.internal.ExtensionRegistryLite registry)
		```
		- #### registerAllExtensions
		
		
		
		```
		public static void registerAllExtensions​(akka.protobufv3.internal.ExtensionRegistry registry)
		```
		- #### getDescriptor
		
		
		
		```
		public static akka.protobufv3.internal.Descriptors.FileDescriptor getDescriptor()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.AddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.ArteryHeartbeatRsp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.ArteryHeartbeatRspOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisement.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisementAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.FlushAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.FlushAckOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.HandshakeReq.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.HandshakeReqOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.MessageWithAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.MessageWithAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.Quarantined.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.QuarantinedOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.SystemMessageDeliveryAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.SystemMessageDeliveryAckOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.SystemMessageEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.html)*