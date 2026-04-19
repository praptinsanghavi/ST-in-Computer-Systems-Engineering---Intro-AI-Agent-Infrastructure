---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html
title: AbstractSerializationSupport
---

# AbstractSerializationSupport

## Content

Package [akka.cluster.ddata.protobuf](package-summary.html)
## Class AbstractSerializationSupport

- java.lang.Object
- - [akka.serialization.JSerializer](../../../serialization/JSerializer.html "class in akka.serialization")
	- - akka.cluster.ddata.protobuf.AbstractSerializationSupport

- All Implemented Interfaces:
`[SerializationSupport](SerializationSupport.html "interface in akka.cluster.ddata.protobuf")`, `[Serializer](../../../serialization/Serializer.html "interface in akka.serialization")`

---

```
public abstract class AbstractSerializationSupport
extends [JSerializer](../../../serialization/JSerializer.html "class in akka.serialization")
implements [SerializationSupport](SerializationSupport.html "interface in akka.cluster.ddata.protobuf")
```

Java API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractSerializationSupport](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.serialization.[JSerializer](../../../serialization/JSerializer.html "class in akka.serialization")
		
		
		`[fromBinary](../../../serialization/JSerializer.html#fromBinary(byte%5B%5D,scala.Option)), [fromBinaryJava](../../../serialization/JSerializer.html#fromBinaryJava(byte%5B%5D,java.lang.Class))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.cluster.ddata.protobuf.[SerializationSupport](SerializationSupport.html "interface in akka.cluster.ddata.protobuf")
		
		
		`[addressFromProto](SerializationSupport.html#addressFromProto(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address)), [addressProtocol](SerializationSupport.html#addressProtocol()), [addressToProto](SerializationSupport.html#addressToProto(akka.actor.Address)), [BufferSize](SerializationSupport.html#BufferSize()), [compress](SerializationSupport.html#compress(akka.protobufv3.internal.MessageLite)), [decompress](SerializationSupport.html#decompress(byte%5B%5D)), [otherMessageFromBinary](SerializationSupport.html#otherMessageFromBinary(byte%5B%5D)), [otherMessageFromProto](SerializationSupport.html#otherMessageFromProto(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage)), [otherMessageToProto](SerializationSupport.html#otherMessageToProto(java.lang.Object)), [protocol_$eq](SerializationSupport.html#protocol_$eq(java.lang.String)), [resolveActorRef](SerializationSupport.html#resolveActorRef(java.lang.String)), [ser_$eq](SerializationSupport.html#ser_$eq(akka.serialization.Serialization)), [serialization](SerializationSupport.html#serialization()), [system](SerializationSupport.html#system()), [transportInfo_$eq](SerializationSupport.html#transportInfo_$eq(akka.serialization.Serialization.Information)), [transportInformation](SerializationSupport.html#transportInformation()), [uniqueAddressFromProto](SerializationSupport.html#uniqueAddressFromProto(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress)), [uniqueAddressToProto](SerializationSupport.html#uniqueAddressToProto(akka.cluster.UniqueAddress)), [versionVectorFromBinary](SerializationSupport.html#versionVectorFromBinary(byte%5B%5D)), [versionVectorFromProto](SerializationSupport.html#versionVectorFromProto(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector)), [versionVectorToProto](SerializationSupport.html#versionVectorToProto(akka.cluster.ddata.VersionVector))`
		- ### Methods inherited from interface akka.serialization.[Serializer](../../../serialization/Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](../../../serialization/Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](../../../serialization/Serializer.html#fromBinary(byte%5B%5D,java.lang.Class)), [identifier](../../../serialization/Serializer.html#identifier()), [includeManifest](../../../serialization/Serializer.html#includeManifest()), [toBinary](../../../serialization/Serializer.html#toBinary(java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### AbstractSerializationSupport
		
		
		
		```
		public AbstractSerializationSupport()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/SerializationSupport.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/serialization/JSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html)*