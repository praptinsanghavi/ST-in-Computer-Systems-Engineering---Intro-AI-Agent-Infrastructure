---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html
title: Serializer
---

# Serializer

## Content

Package [akka.serialization](package-summary.html)
## Interface Serializer

- All Known Subinterfaces:
`[BaseSerializer](BaseSerializer.html "interface in akka.serialization")`

All Known Implementing Classes:
`[AbstractSerializationSupport](../cluster/ddata/protobuf/AbstractSerializationSupport.html "class in akka.cluster.ddata.protobuf")`, `[AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html "class in akka.serialization")`, `[AsyncSerializerWithStringManifestCS](AsyncSerializerWithStringManifestCS.html "class in akka.serialization")`, `[ByteArraySerializer](ByteArraySerializer.html "class in akka.serialization")`, `[ByteStringSerializer](../remote/serialization/ByteStringSerializer.html "class in akka.remote.serialization")`, `[ClusterMessageSerializer](../cluster/protobuf/ClusterMessageSerializer.html "class in akka.cluster.protobuf")`, `[DisabledJavaSerializer](DisabledJavaSerializer.html "class in akka.serialization")`, `[IntSerializer](../remote/serialization/IntSerializer.html "class in akka.remote.serialization")`, `[JavaSerializer](JavaSerializer.html "class in akka.serialization")`, `[JSerializer](JSerializer.html "class in akka.serialization")`, `[LongSerializer](../remote/serialization/LongSerializer.html "class in akka.remote.serialization")`, `[MessageContainerSerializer](../remote/serialization/MessageContainerSerializer.html "class in akka.remote.serialization")`, `[MessageSerializer](../cluster/metrics/protobuf/MessageSerializer.html "class in akka.cluster.metrics.protobuf")`, `[MessageSerializer](../persistence/serialization/MessageSerializer.html "class in akka.persistence.serialization")`, `[MiscMessageSerializer](../remote/serialization/MiscMessageSerializer.html "class in akka.remote.serialization")`, `[NullSerializer](NullSerializer.html "class in akka.serialization")`, `[NullSerializer$](NullSerializer$.html "class in akka.serialization")`, `[PayloadSerializer](../persistence/serialization/PayloadSerializer.html "class in akka.persistence.serialization")`, `[ProtobufSerializer](../remote/serialization/ProtobufSerializer.html "class in akka.remote.serialization")`, `[ReplicatedDataSerializer](../cluster/ddata/protobuf/ReplicatedDataSerializer.html "class in akka.cluster.ddata.protobuf")`, `[ReplicatorMessageSerializer](../cluster/ddata/protobuf/ReplicatorMessageSerializer.html "class in akka.cluster.ddata.protobuf")`, `[SerializerWithStringManifest](SerializerWithStringManifest.html "class in akka.serialization")`, `[ServiceKeySerializer](../actor/typed/internal/receptionist/ServiceKeySerializer.html "class in akka.actor.typed.internal.receptionist")`, `[SnapshotSerializer](../persistence/serialization/SnapshotSerializer.html "class in akka.persistence.serialization")`, `[StringSerializer](../remote/serialization/StringSerializer.html "class in akka.remote.serialization")`, `[SystemMessageSerializer](../remote/serialization/SystemMessageSerializer.html "class in akka.remote.serialization")`, `[TestJavaSerializer](../testkit/TestJavaSerializer.html "class in akka.testkit")`, `[TestSerializer](../persistence/TestSerializer.html "class in akka.persistence")`

---

```
public interface Serializer
```

A Serializer represents a bimap between an object and an array of bytes representing that object.
 
 Serializers are loaded using reflection during [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor")
 start\-up, where constructors are tried in order:
 

	- taking exactly one argument of type [`ExtendedActorSystem`](../actor/ExtendedActorSystem.html "class in akka.actor");
	 this should be the preferred one because all reflective loading of classes
	 during deserialization should use ExtendedActorSystem.dynamicAccess (see
	 [`DynamicAccess`](../actor/DynamicAccess.html "class in akka.actor"))
	- taking exactly one argument of type [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor")
	- taking exactly one argument of type [`ClassicActorSystemProvider`](../actor/ClassicActorSystemProvider.html "interface in akka.actor")
	- without arguments
	- taking two arguments of type [`ExtendedActorSystem`](../actor/ExtendedActorSystem.html "class in akka.actor") and `String` where the second `String` argument is the binding name
	- taking two arguments of type [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") and `String` where the second `String` argument is the binding name
	- taking two arguments of type [`ClassicActorSystemProvider`](../actor/ClassicActorSystemProvider.html "interface in akka.actor") and `String` where the second `String` argument is the binding name

**Be sure to always use the** [`DynamicAccess`](../actor/DynamicAccess.html "class in akka.actor") **for loading classes!** This is necessary to
 avoid strange match errors and inequalities which arise from different class loaders loading
 the same class.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D))​(byte[] bytes)` | Java API: deserialize without type hint |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,java.lang.Class))​(byte[] bytes,  java.lang.Class<?> clazz)` | Java API: deserialize with type hint |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,scala.Option))​(byte[] bytes,  scala.Option<java.lang.Class<?>> manifest)` | Produces an object from an array of bytes, with an optional type\-hint;  the class should be loaded using ActorSystem.dynamicAccess. |
	| `int` | `[identifier](#identifier())()` | Completely unique value to identify this implementation of Serializer, used to optimize network traffic. |
	| `boolean` | `[includeManifest](#includeManifest())()` | Returns whether this serializer needs a manifest in the fromBinary method |
	| `byte[]` | `[toBinary](#toBinary(java.lang.Object))​(java.lang.Object o)` | Serializes the given object into an Array of Byte. |

- - ### Method Detail
	
	
	
		- #### fromBinary
		
		
		
		```
		java.lang.Object fromBinary​(byte[] bytes,
		                            scala.Option<java.lang.Class<?>> manifest)
		                     throws java.io.NotSerializableException
		```
		
		Produces an object from an array of bytes, with an optional type\-hint;
		 the class should be loaded using ActorSystem.dynamicAccess.
		
		Throws:
		`java.io.NotSerializableException`
		- #### fromBinary
		
		
		
		```
		java.lang.Object fromBinary​(byte[] bytes)
		```
		
		Java API: deserialize without type hint
		- #### fromBinary
		
		
		
		```
		java.lang.Object fromBinary​(byte[] bytes,
		                            java.lang.Class<?> clazz)
		                     throws java.io.NotSerializableException
		```
		
		Java API: deserialize with type hint
		
		Throws:
		`java.io.NotSerializableException`
		- #### identifier
		
		
		
		```
		int identifier()
		```
		
		Completely unique value to identify this implementation of Serializer, used to optimize network traffic.
		 Values from 0 to 40 are reserved for Akka internal usage.
		- #### includeManifest
		
		
		
		```
		boolean includeManifest()
		```
		
		Returns whether this serializer needs a manifest in the fromBinary method
		- #### toBinary
		
		
		
		```
		byte[] toBinary​(java.lang.Object o)
		```
		
		Serializes the given object into an Array of Byte.
		 
		 Note that the array must not be mutated by the serializer after it has been returned.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ServiceKeySerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/MessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/ClusterMessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/TestSerializer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/PayloadSerializer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/SnapshotSerializer.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/ByteStringSerializer.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/IntSerializer.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/LongSerializer.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/MessageContainerSerializer.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/MiscMessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/ProtobufSerializer.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/StringSerializer.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/SystemMessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/AsyncSerializerWithStringManifest.html
- https://doc.akka.io/japi/akka/current/akka/serialization/AsyncSerializerWithStringManifestCS.html
- https://doc.akka.io/japi/akka/current/akka/serialization/BaseSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/ByteArraySerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/DisabledJavaSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/JSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/JavaSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/NullSerializer$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/NullSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestJavaSerializer.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html](https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html)*