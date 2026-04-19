---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/SerializationSupport.html
title: SerializationSupport
---

# SerializationSupport

## Content

Package [akka.cluster.ddata.protobuf](package-summary.html)
## Interface SerializationSupport

- All Known Implementing Classes:
`[AbstractSerializationSupport](AbstractSerializationSupport.html "class in akka.cluster.ddata.protobuf")`, `[ReplicatedDataSerializer](ReplicatedDataSerializer.html "class in akka.cluster.ddata.protobuf")`, `[ReplicatorMessageSerializer](ReplicatorMessageSerializer.html "class in akka.cluster.ddata.protobuf")`

---

```
public interface SerializationSupport
```

Some useful serialization helper methods.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Address](../../../actor/Address.html "class in akka.actor")` | `[addressFromProto](#addressFromProto(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address))​([ReplicatorMessages.Address](msg/ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") address)` |  |
	| `java.lang.String` | `[addressProtocol](#addressProtocol())()` |  |
	| `[ReplicatorMessages.Address.Builder](msg/ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addressToProto](#addressToProto(akka.actor.Address))​([Address](../../../actor/Address.html "class in akka.actor") address)` |  |
	| `int` | `[BufferSize](#BufferSize())()` |  |
	| `byte[]` | `[compress](#compress(akka.protobufv3.internal.MessageLite))​(akka.protobufv3.internal.MessageLite msg)` |  |
	| `byte[]` | `[decompress](#decompress(byte%5B%5D))​(byte[] bytes)` |  |
	| `java.lang.Object` | `[otherMessageFromBinary](#otherMessageFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `java.lang.Object` | `[otherMessageFromProto](#otherMessageFromProto(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[otherMessageToProto](#otherMessageToProto(java.lang.Object))​(java.lang.Object msg)` |  |
	| `void` | `[protocol_$eq](#protocol_$eq(java.lang.String))​(java.lang.String x$1)` |  |
	| `[ActorRef](../../../actor/ActorRef.html "class in akka.actor")` | `[resolveActorRef](#resolveActorRef(java.lang.String))​(java.lang.String path)` |  |
	| `void` | `[ser_$eq](#ser_$eq(akka.serialization.Serialization))​([Serialization](../../../serialization/Serialization.html "class in akka.serialization") x$1)` |  |
	| `[Serialization](../../../serialization/Serialization.html "class in akka.serialization")` | `[serialization](#serialization())()` |  |
	| `[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `void` | `[transportInfo_$eq](#transportInfo_$eq(akka.serialization.Serialization.Information))​([Serialization.Information](../../../serialization/Serialization.Information.html "class in akka.serialization") x$1)` |  |
	| `[Serialization.Information](../../../serialization/Serialization.Information.html "class in akka.serialization")` | `[transportInformation](#transportInformation())()` |  |
	| `[UniqueAddress](../../UniqueAddress.html "class in akka.cluster")` | `[uniqueAddressFromProto](#uniqueAddressFromProto(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](msg/ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") uniqueAddress)` |  |
	| `[ReplicatorMessages.UniqueAddress.Builder](msg/ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[uniqueAddressToProto](#uniqueAddressToProto(akka.cluster.UniqueAddress))​([UniqueAddress](../../UniqueAddress.html "class in akka.cluster") uniqueAddress)` |  |
	| `[VersionVector](../VersionVector.html "class in akka.cluster.ddata")` | `[versionVectorFromBinary](#versionVectorFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `[VersionVector](../VersionVector.html "class in akka.cluster.ddata")` | `[versionVectorFromProto](#versionVectorFromProto(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector))​([ReplicatorMessages.VersionVector](msg/ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") versionVector)` |  |
	| `[ReplicatorMessages.VersionVector](msg/ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg")` | `[versionVectorToProto](#versionVectorToProto(akka.cluster.ddata.VersionVector))​([VersionVector](../VersionVector.html "class in akka.cluster.ddata") versionVector)` |  |

- - ### Method Detail
	
	
	
		- #### BufferSize
		
		
		
		```
		int BufferSize()
		```
		- #### addressFromProto
		
		
		
		```
		[Address](../../../actor/Address.html "class in akka.actor") addressFromProto​([ReplicatorMessages.Address](msg/ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") address)
		```
		- #### addressProtocol
		
		
		
		```
		java.lang.String addressProtocol()
		```
		- #### addressToProto
		
		
		
		```
		[ReplicatorMessages.Address.Builder](msg/ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg") addressToProto​([Address](../../../actor/Address.html "class in akka.actor") address)
		```
		- #### compress
		
		
		
		```
		byte[] compress​(akka.protobufv3.internal.MessageLite msg)
		```
		- #### decompress
		
		
		
		```
		byte[] decompress​(byte[] bytes)
		```
		- #### otherMessageFromBinary
		
		
		
		```
		java.lang.Object otherMessageFromBinary​(byte[] bytes)
		```
		- #### otherMessageFromProto
		
		
		
		```
		java.lang.Object otherMessageFromProto​([ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### otherMessageToProto
		
		
		
		```
		[ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") otherMessageToProto​(java.lang.Object msg)
		```
		- #### protocol\_$eq
		
		
		
		```
		void protocol_$eq​(java.lang.String x$1)
		```
		- #### resolveActorRef
		
		
		
		```
		[ActorRef](../../../actor/ActorRef.html "class in akka.actor") resolveActorRef​(java.lang.String path)
		```
		- #### ser\_$eq
		
		
		
		```
		void ser_$eq​([Serialization](../../../serialization/Serialization.html "class in akka.serialization") x$1)
		```
		- #### serialization
		
		
		
		```
		[Serialization](../../../serialization/Serialization.html "class in akka.serialization") serialization()
		```
		- #### system
		
		
		
		```
		[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		- #### transportInfo\_$eq
		
		
		
		```
		void transportInfo_$eq​([Serialization.Information](../../../serialization/Serialization.Information.html "class in akka.serialization") x$1)
		```
		- #### transportInformation
		
		
		
		```
		[Serialization.Information](../../../serialization/Serialization.Information.html "class in akka.serialization") transportInformation()
		```
		- #### uniqueAddressFromProto
		
		
		
		```
		[UniqueAddress](../../UniqueAddress.html "class in akka.cluster") uniqueAddressFromProto​([ReplicatorMessages.UniqueAddress](msg/ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") uniqueAddress)
		```
		- #### uniqueAddressToProto
		
		
		
		```
		[ReplicatorMessages.UniqueAddress.Builder](msg/ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") uniqueAddressToProto​([UniqueAddress](../../UniqueAddress.html "class in akka.cluster") uniqueAddress)
		```
		- #### versionVectorFromBinary
		
		
		
		```
		[VersionVector](../VersionVector.html "class in akka.cluster.ddata") versionVectorFromBinary​(byte[] bytes)
		```
		- #### versionVectorFromProto
		
		
		
		```
		[VersionVector](../VersionVector.html "class in akka.cluster.ddata") versionVectorFromProto​([ReplicatorMessages.VersionVector](msg/ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") versionVector)
		```
		- #### versionVectorToProto
		
		
		
		```
		[ReplicatorMessages.VersionVector](msg/ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") versionVectorToProto​([VersionVector](../VersionVector.html "class in akka.cluster.ddata") versionVector)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/VersionVector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.Information.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/SerializationSupport.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/SerializationSupport.html)*