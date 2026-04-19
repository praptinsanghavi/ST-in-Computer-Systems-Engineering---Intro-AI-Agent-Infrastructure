---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/BaseSerializer.html
title: BaseSerializer
---

# BaseSerializer

## Content

Package [akka.serialization](package-summary.html)
## Interface BaseSerializer

- All Superinterfaces:
`[Serializer](Serializer.html "interface in akka.serialization")`

All Known Implementing Classes:
`[ByteArraySerializer](ByteArraySerializer.html "class in akka.serialization")`, `[ByteStringSerializer](../remote/serialization/ByteStringSerializer.html "class in akka.remote.serialization")`, `[ClusterMessageSerializer](../cluster/protobuf/ClusterMessageSerializer.html "class in akka.cluster.protobuf")`, `[IntSerializer](../remote/serialization/IntSerializer.html "class in akka.remote.serialization")`, `[JavaSerializer](JavaSerializer.html "class in akka.serialization")`, `[LongSerializer](../remote/serialization/LongSerializer.html "class in akka.remote.serialization")`, `[MessageContainerSerializer](../remote/serialization/MessageContainerSerializer.html "class in akka.remote.serialization")`, `[MessageSerializer](../cluster/metrics/protobuf/MessageSerializer.html "class in akka.cluster.metrics.protobuf")`, `[MessageSerializer](../persistence/serialization/MessageSerializer.html "class in akka.persistence.serialization")`, `[MiscMessageSerializer](../remote/serialization/MiscMessageSerializer.html "class in akka.remote.serialization")`, `[PayloadSerializer](../persistence/serialization/PayloadSerializer.html "class in akka.persistence.serialization")`, `[ProtobufSerializer](../remote/serialization/ProtobufSerializer.html "class in akka.remote.serialization")`, `[ReplicatedDataSerializer](../cluster/ddata/protobuf/ReplicatedDataSerializer.html "class in akka.cluster.ddata.protobuf")`, `[ReplicatorMessageSerializer](../cluster/ddata/protobuf/ReplicatorMessageSerializer.html "class in akka.cluster.ddata.protobuf")`, `[ServiceKeySerializer](../actor/typed/internal/receptionist/ServiceKeySerializer.html "class in akka.actor.typed.internal.receptionist")`, `[SnapshotSerializer](../persistence/serialization/SnapshotSerializer.html "class in akka.persistence.serialization")`, `[StringSerializer](../remote/serialization/StringSerializer.html "class in akka.remote.serialization")`, `[SystemMessageSerializer](../remote/serialization/SystemMessageSerializer.html "class in akka.remote.serialization")`, `[TestJavaSerializer](../testkit/TestJavaSerializer.html "class in akka.testkit")`

---

```
public interface BaseSerializer
extends [Serializer](Serializer.html "interface in akka.serialization")
```

Base serializer trait with serialization identifiers configuration contract,
 when globally unique serialization identifier is configured in the `reference.conf`.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[akka$serialization$BaseSerializer$_setter_$identifier_$eq](#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))​(int x$1)` | Globally unique serialization identifier configured in the `reference.conf`. |
	| `int` | `[identifier](#identifier())()` | Globally unique serialization identifier configured in the `reference.conf`. |
	| `int` | `[identifierFromConfig](#identifierFromConfig())()` | INTERNAL API |
	| `java.lang.String` | `[SerializationIdentifiers](#SerializationIdentifiers())()` | Configuration namespace of serialization identifiers in the `reference.conf`. |
	| `[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` | Actor system which is required by most serializer implementations. |
	
	
		- ### Methods inherited from interface akka.serialization.[Serializer](Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](Serializer.html#fromBinary(byte%5B%5D,java.lang.Class)), [fromBinary](Serializer.html#fromBinary(byte%5B%5D,scala.Option)), [includeManifest](Serializer.html#includeManifest()), [toBinary](Serializer.html#toBinary(java.lang.Object))`

- - ### Method Detail
	
	
	
		- #### akka$serialization$BaseSerializer$\_setter\_$identifier\_$eq
		
		
		
		```
		void akka$serialization$BaseSerializer$_setter_$identifier_$eq​(int x$1)
		```
		
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		- #### system
		
		
		
		```
		[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		
		Actor system which is required by most serializer implementations.
		- #### SerializationIdentifiers
		
		
		
		```
		java.lang.String SerializationIdentifiers()
		```
		
		Configuration namespace of serialization identifiers in the `reference.conf`.
		 
		 Each serializer implementation must have an entry in the following format:
		 `akka.actor.serialization-identifiers."FQCN" = ID`
		 where `FQCN` is fully qualified class name of the serializer implementation
		 and `ID` is globally unique serializer identifier number.
		- #### identifier
		
		
		
		```
		int identifier()
		```
		
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		
		
		
		Specified by:
		`[identifier](Serializer.html#identifier())` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
		- #### identifierFromConfig
		
		
		
		```
		int identifierFromConfig()
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ServiceKeySerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/MessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/ClusterMessageSerializer.html
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
- https://doc.akka.io/japi/akka/current/akka/serialization/ByteArraySerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/JavaSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestJavaSerializer.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/BaseSerializer.html](https://doc.akka.io/japi/akka/current/akka/serialization/BaseSerializer.html)*