---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
title: ReplicatedDataSerializer
---

# ReplicatedDataSerializer

## Content

Package [akka.cluster.ddata.protobuf](package-summary.html)
## Class ReplicatedDataSerializer

- java.lang.Object
- - [akka.serialization.SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")
	- - akka.cluster.ddata.protobuf.ReplicatedDataSerializer

- All Implemented Interfaces:
`[SerializationSupport](SerializationSupport.html "interface in akka.cluster.ddata.protobuf")`, `[BaseSerializer](../../../serialization/BaseSerializer.html "interface in akka.serialization")`, `[Serializer](../../../serialization/Serializer.html "interface in akka.serialization")`

---

```
public class ReplicatedDataSerializer
extends [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")
implements [SerializationSupport](SerializationSupport.html "interface in akka.cluster.ddata.protobuf"), [BaseSerializer](../../../serialization/BaseSerializer.html "interface in akka.serialization")
```

Protobuf serializer of ReplicatedData.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ReplicatedDataSerializer.KeyComparator](ReplicatedDataSerializer.KeyComparator.html "class in akka.cluster.ddata.protobuf")<[A](ReplicatedDataSerializer.KeyComparator.html "type parameter in ReplicatedDataSerializer.KeyComparator") extends akka.protobufv3.internal.GeneratedMessageV3>` |  |
	| `static class` | `[ReplicatedDataSerializer.LWWMapEntry$](ReplicatedDataSerializer.LWWMapEntry$.html "class in akka.cluster.ddata.protobuf")` |  |
	| `static class` | `[ReplicatedDataSerializer.LWWMapEntryComparator$](ReplicatedDataSerializer.LWWMapEntryComparator$.html "class in akka.cluster.ddata.protobuf")` |  |
	| `static class` | `[ReplicatedDataSerializer.ORMapDeltaGroupEntry$](ReplicatedDataSerializer.ORMapDeltaGroupEntry$.html "class in akka.cluster.ddata.protobuf")` |  |
	| `static class` | `[ReplicatedDataSerializer.ORMapEntry$](ReplicatedDataSerializer.ORMapEntry$.html "class in akka.cluster.ddata.protobuf")` |  |
	| `static class` | `[ReplicatedDataSerializer.ORMapEntryComparator$](ReplicatedDataSerializer.ORMapEntryComparator$.html "class in akka.cluster.ddata.protobuf")` |  |
	| `static class` | `[ReplicatedDataSerializer.ORMultiMapEntry$](ReplicatedDataSerializer.ORMultiMapEntry$.html "class in akka.cluster.ddata.protobuf")` |  |
	| `static class` | `[ReplicatedDataSerializer.ORMultiMapEntryComparator$](ReplicatedDataSerializer.ORMultiMapEntryComparator$.html "class in akka.cluster.ddata.protobuf")` |  |
	| `static class` | `[ReplicatedDataSerializer.PNCounterMapEntry$](ReplicatedDataSerializer.PNCounterMapEntry$.html "class in akka.cluster.ddata.protobuf")` |  |
	| `static class` | `[ReplicatedDataSerializer.PNCounterMapEntryComparator$](ReplicatedDataSerializer.PNCounterMapEntryComparator$.html "class in akka.cluster.ddata.protobuf")` |  |
	| `static interface` | `[ReplicatedDataSerializer.ProtoMapEntryReader](ReplicatedDataSerializer.ProtoMapEntryReader.html "interface in akka.cluster.ddata.protobuf")<[Entry](ReplicatedDataSerializer.ProtoMapEntryReader.html "type parameter in ReplicatedDataSerializer.ProtoMapEntryReader") extends akka.protobufv3.internal.GeneratedMessageV3,​[A](ReplicatedDataSerializer.ProtoMapEntryReader.html "type parameter in ReplicatedDataSerializer.ProtoMapEntryReader") extends akka.protobufv3.internal.GeneratedMessageV3>` |  |
	| `static interface` | `[ReplicatedDataSerializer.ProtoMapEntryWriter](ReplicatedDataSerializer.ProtoMapEntryWriter.html "interface in akka.cluster.ddata.protobuf")<[Entry](ReplicatedDataSerializer.ProtoMapEntryWriter.html "type parameter in ReplicatedDataSerializer.ProtoMapEntryWriter") extends akka.protobufv3.internal.GeneratedMessageV3,​[EntryBuilder](ReplicatedDataSerializer.ProtoMapEntryWriter.html "type parameter in ReplicatedDataSerializer.ProtoMapEntryWriter") extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[EntryBuilder](ReplicatedDataSerializer.ProtoMapEntryWriter.html "type parameter in ReplicatedDataSerializer.ProtoMapEntryWriter")>,​[Value](ReplicatedDataSerializer.ProtoMapEntryWriter.html "type parameter in ReplicatedDataSerializer.ProtoMapEntryWriter") extends akka.protobufv3.internal.GeneratedMessageV3>` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedDataSerializer](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$serialization$BaseSerializer$_setter_$identifier_$eq](#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))​(int x$1)` | Globally unique serialization identifier configured in the `reference.conf`. |
	| `[Flag](../Flag.html "class in akka.cluster.ddata")` | `[flagFromBinary](#flagFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `[Flag](../Flag.html "class in akka.cluster.ddata")` | `[flagFromProto](#flagFromProto(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.Flag))​([ReplicatedDataMessages.Flag](msg/ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg") flag)` |  |
	| `[ReplicatedDataMessages.Flag](msg/ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg")` | `[flagToProto](#flagToProto(akka.cluster.ddata.Flag))​([Flag](../Flag.html "class in akka.cluster.ddata") flag)` |  |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,java.lang.String))​(byte[] bytes,  java.lang.String manifest)` | Produces an object from an array of bytes, with an optional type\-hint. |
	| `[GCounter](../GCounter.html "class in akka.cluster.ddata")` | `[gcounterFromBinary](#gcounterFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `[GCounter](../GCounter.html "class in akka.cluster.ddata")` | `[gcounterFromProto](#gcounterFromProto(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter))​([ReplicatedDataMessages.GCounter](msg/ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") gcounter)` |  |
	| `[ReplicatedDataMessages.GCounter](msg/ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[gcounterToProto](#gcounterToProto(akka.cluster.ddata.GCounter))​([GCounter](../GCounter.html "class in akka.cluster.ddata") gcounter)` |  |
	| `[GSet](../GSet.html "class in akka.cluster.ddata")<?>` | `[gsetFromBinary](#gsetFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `[GSet](../GSet.html "class in akka.cluster.ddata")<java.lang.Object>` | `[gsetFromProto](#gsetFromProto(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GSet))​([ReplicatedDataMessages.GSet](msg/ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg") gset)` |  |
	| `[ReplicatedDataMessages.GSet](msg/ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[gsetToProto](#gsetToProto(akka.cluster.ddata.GSet))​([GSet](../GSet.html "class in akka.cluster.ddata")<?> gset)` |  |
	| `int` | `[identifier](#identifier())()` | Completely unique value to identify this implementation of Serializer, used to optimize network traffic. |
	| `java.lang.String` | `[keyIdFromBinary](#keyIdFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `byte[]` | `[keyIdToBinary](#keyIdToBinary(java.lang.String))​(java.lang.String id)` |  |
	| `[LWWMap](../LWWMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object>` | `[lwwmapFromBinary](#lwwmapFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `[LWWMap](../LWWMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object>` | `[lwwmapFromProto](#lwwmapFromProto(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.LWWMap))​([ReplicatedDataMessages.LWWMap](msg/ReplicatedDataMessages.LWWMap.html "class in akka.cluster.ddata.protobuf.msg") lwwmap)` |  |
	| `[ReplicatedDataMessages.LWWMap](msg/ReplicatedDataMessages.LWWMap.html "class in akka.cluster.ddata.protobuf.msg")` | `[lwwmapToProto](#lwwmapToProto(akka.cluster.ddata.LWWMap))​([LWWMap](../LWWMap.html "class in akka.cluster.ddata")<?,​?> lwwmap)` |  |
	| `[LWWRegister](../LWWRegister.html "class in akka.cluster.ddata")<java.lang.Object>` | `[lwwRegisterFromBinary](#lwwRegisterFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `[LWWRegister](../LWWRegister.html "class in akka.cluster.ddata")<java.lang.Object>` | `[lwwRegisterFromProto](#lwwRegisterFromProto(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.LWWRegister))​([ReplicatedDataMessages.LWWRegister](msg/ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg") lwwRegister)` |  |
	| `[ReplicatedDataMessages.LWWRegister](msg/ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg")` | `[lwwRegisterToProto](#lwwRegisterToProto(akka.cluster.ddata.LWWRegister))​([LWWRegister](../LWWRegister.html "class in akka.cluster.ddata")<?> lwwRegister)` |  |
	| `java.lang.String` | `[manifest](#manifest(java.lang.Object))​(java.lang.Object obj)` | Return the manifest (type hint) that will be provided in the fromBinary method. |
	| `<PEntry extends akka.protobufv3.internal.GeneratedMessageV3,​A extends akka.protobufv3.internal.GeneratedMessageV3,​B extends [ReplicatedData](../ReplicatedData.html "interface in akka.cluster.ddata")>scala.collection.immutable.Map<java.lang.Object,​B>` | `[mapTypeFromProto](#mapTypeFromProto(java.util.List,scala.Function1,akka.cluster.ddata.protobuf.ReplicatedDataSerializer.ProtoMapEntryReader))​(java.util.List<PEntry> input,  scala.Function1<A,​B> valueCreator,  [ReplicatedDataSerializer.ProtoMapEntryReader](ReplicatedDataSerializer.ProtoMapEntryReader.html "interface in akka.cluster.ddata.protobuf")<PEntry,​A> eh)` |  |
	| `[ORMultiMap](../ORMultiMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object>` | `[multimapFromBinary](#multimapFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `[ORMultiMap](../ORMultiMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object>` | `[multimapFromProto](#multimapFromProto(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMultiMap))​([ReplicatedDataMessages.ORMultiMap](msg/ReplicatedDataMessages.ORMultiMap.html "class in akka.cluster.ddata.protobuf.msg") multimap)` |  |
	| `[ReplicatedDataMessages.ORMultiMap](msg/ReplicatedDataMessages.ORMultiMap.html "class in akka.cluster.ddata.protobuf.msg")` | `[multimapToProto](#multimapToProto(akka.cluster.ddata.ORMultiMap))​([ORMultiMap](../ORMultiMap.html "class in akka.cluster.ddata")<?,​?> multimap)` |  |
	| `[ORMap](../ORMap.html "class in akka.cluster.ddata")<java.lang.Object,​[ReplicatedData](../ReplicatedData.html "interface in akka.cluster.ddata")>` | `[ormapFromBinary](#ormapFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `[ORMap](../ORMap.html "class in akka.cluster.ddata")<java.lang.Object,​[ReplicatedData](../ReplicatedData.html "interface in akka.cluster.ddata")>` | `[ormapFromProto](#ormapFromProto(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap))​([ReplicatedDataMessages.ORMap](msg/ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg") ormap)` |  |
	| `[ReplicatedDataMessages.ORMap](msg/ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg")` | `[ormapToProto](#ormapToProto(akka.cluster.ddata.ORMap))​([ORMap](../ORMap.html "class in akka.cluster.ddata")<?,​?> ormap)` |  |
	| `[ORSet](../ORSet.html "class in akka.cluster.ddata")<java.lang.Object>` | `[orsetFromBinary](#orsetFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `[ORSet](../ORSet.html "class in akka.cluster.ddata")<java.lang.Object>` | `[orsetFromProto](#orsetFromProto(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSet))​([ReplicatedDataMessages.ORSet](msg/ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") orset)` |  |
	| `[ReplicatedDataMessages.ORSet](msg/ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[orsetToProto](#orsetToProto(akka.cluster.ddata.ORSet))​([ORSet](../ORSet.html "class in akka.cluster.ddata")<?> orset)` |  |
	| `[PNCounter](../PNCounter.html "class in akka.cluster.ddata")` | `[pncounterFromBinary](#pncounterFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `[PNCounter](../PNCounter.html "class in akka.cluster.ddata")` | `[pncounterFromProto](#pncounterFromProto(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounter))​([ReplicatedDataMessages.PNCounter](msg/ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") pncounter)` |  |
	| `[PNCounterMap](../PNCounterMap.html "class in akka.cluster.ddata")<?>` | `[pncountermapFromBinary](#pncountermapFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `[PNCounterMap](../PNCounterMap.html "class in akka.cluster.ddata")<?>` | `[pncountermapFromProto](#pncountermapFromProto(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounterMap))​([ReplicatedDataMessages.PNCounterMap](msg/ReplicatedDataMessages.PNCounterMap.html "class in akka.cluster.ddata.protobuf.msg") pncountermap)` |  |
	| `[ReplicatedDataMessages.PNCounterMap](msg/ReplicatedDataMessages.PNCounterMap.html "class in akka.cluster.ddata.protobuf.msg")` | `[pncountermapToProto](#pncountermapToProto(akka.cluster.ddata.PNCounterMap))​([PNCounterMap](../PNCounterMap.html "class in akka.cluster.ddata")<?> pncountermap)` |  |
	| `[ReplicatedDataMessages.PNCounter](msg/ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[pncounterToProto](#pncounterToProto(akka.cluster.ddata.PNCounter))​([PNCounter](../PNCounter.html "class in akka.cluster.ddata") pncounter)` |  |
	| `<PEntry extends akka.protobufv3.internal.GeneratedMessageV3,​A extends akka.protobufv3.internal.GeneratedMessageV3>java.lang.Object` | `[singleKeyEntryFromProto](#singleKeyEntryFromProto(scala.Option,akka.cluster.ddata.protobuf.ReplicatedDataSerializer.ProtoMapEntryReader))​(scala.Option<PEntry> entryOption,  [ReplicatedDataSerializer.ProtoMapEntryReader](ReplicatedDataSerializer.ProtoMapEntryReader.html "interface in akka.cluster.ddata.protobuf")<PEntry,​A> eh)` |  |
	| `<PEntry extends akka.protobufv3.internal.GeneratedMessageV3,​A extends akka.protobufv3.internal.GeneratedMessageV3,​B extends [ReplicatedData](../ReplicatedData.html "interface in akka.cluster.ddata")>scala.collection.immutable.Map<java.lang.Object,​B>` | `[singleMapEntryFromProto](#singleMapEntryFromProto(java.util.List,scala.Function1,akka.cluster.ddata.protobuf.ReplicatedDataSerializer.ProtoMapEntryReader))​(java.util.List<PEntry> input,  scala.Function1<A,​B> valueCreator,  [ReplicatedDataSerializer.ProtoMapEntryReader](ReplicatedDataSerializer.ProtoMapEntryReader.html "interface in akka.cluster.ddata.protobuf")<PEntry,​A> eh)` |  |
	| `[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` | Actor system which is required by most serializer implementations. |
	| `byte[]` | `[toBinary](#toBinary(java.lang.Object))​(java.lang.Object obj)` | Serializes the given object into an Array of Byte. |
	
	
		- ### Methods inherited from class akka.serialization.[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")
		
		
		`[fromBinary](../../../serialization/SerializerWithStringManifest.html#fromBinary(byte%5B%5D,scala.Option)), [includeManifest](../../../serialization/SerializerWithStringManifest.html#includeManifest())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[BaseSerializer](../../../serialization/BaseSerializer.html "interface in akka.serialization")
		
		
		`[identifierFromConfig](../../../serialization/BaseSerializer.html#identifierFromConfig()), [SerializationIdentifiers](../../../serialization/BaseSerializer.html#SerializationIdentifiers())`
		- ### Methods inherited from interface akka.cluster.ddata.protobuf.[SerializationSupport](SerializationSupport.html "interface in akka.cluster.ddata.protobuf")
		
		
		`[addressFromProto](SerializationSupport.html#addressFromProto(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address)), [addressProtocol](SerializationSupport.html#addressProtocol()), [addressToProto](SerializationSupport.html#addressToProto(akka.actor.Address)), [BufferSize](SerializationSupport.html#BufferSize()), [compress](SerializationSupport.html#compress(akka.protobufv3.internal.MessageLite)), [decompress](SerializationSupport.html#decompress(byte%5B%5D)), [otherMessageFromBinary](SerializationSupport.html#otherMessageFromBinary(byte%5B%5D)), [otherMessageFromProto](SerializationSupport.html#otherMessageFromProto(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage)), [otherMessageToProto](SerializationSupport.html#otherMessageToProto(java.lang.Object)), [protocol_$eq](SerializationSupport.html#protocol_$eq(java.lang.String)), [resolveActorRef](SerializationSupport.html#resolveActorRef(java.lang.String)), [ser_$eq](SerializationSupport.html#ser_$eq(akka.serialization.Serialization)), [serialization](SerializationSupport.html#serialization()), [transportInfo_$eq](SerializationSupport.html#transportInfo_$eq(akka.serialization.Serialization.Information)), [transportInformation](SerializationSupport.html#transportInformation()), [uniqueAddressFromProto](SerializationSupport.html#uniqueAddressFromProto(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress)), [uniqueAddressToProto](SerializationSupport.html#uniqueAddressToProto(akka.cluster.UniqueAddress)), [versionVectorFromBinary](SerializationSupport.html#versionVectorFromBinary(byte%5B%5D)), [versionVectorFromProto](SerializationSupport.html#versionVectorFromProto(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector)), [versionVectorToProto](SerializationSupport.html#versionVectorToProto(akka.cluster.ddata.VersionVector))`
		- ### Methods inherited from interface akka.serialization.[Serializer](../../../serialization/Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](../../../serialization/Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](../../../serialization/Serializer.html#fromBinary(byte%5B%5D,java.lang.Class)), [fromBinary](../../../serialization/Serializer.html#fromBinary(byte%5B%5D,scala.Option)), [includeManifest](../../../serialization/Serializer.html#includeManifest())`

- - ### Constructor Detail
	
	
	
		- #### ReplicatedDataSerializer
		
		
		
		```
		public ReplicatedDataSerializer​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### identifier
		
		
		
		```
		public int identifier()
		```
		
		Description copied from class: `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html#identifier())`
		Completely unique value to identify this implementation of Serializer, used to optimize network traffic.
		 Values from 0 to 40 are reserved for Akka internal usage.
		
		Specified by:
		`[identifier](../../../serialization/BaseSerializer.html#identifier())` in interface `[BaseSerializer](../../../serialization/BaseSerializer.html "interface in akka.serialization")`
		Specified by:
		`[identifier](../../../serialization/Serializer.html#identifier())` in interface `[Serializer](../../../serialization/Serializer.html "interface in akka.serialization")`
		Specified by:
		`[identifier](../../../serialization/SerializerWithStringManifest.html#identifier())` in class `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")`
		- #### akka$serialization$BaseSerializer$\_setter\_$identifier\_$eq
		
		
		
		```
		protected void akka$serialization$BaseSerializer$_setter_$identifier_$eq​(int x$1)
		```
		
		Description copied from interface: `[BaseSerializer](../../../serialization/BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))`
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		
		
		
		Specified by:
		`[akka$serialization$BaseSerializer$_setter_$identifier_$eq](../../../serialization/BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))` in interface `[BaseSerializer](../../../serialization/BaseSerializer.html "interface in akka.serialization")`
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		
		Description copied from interface: `[BaseSerializer](../../../serialization/BaseSerializer.html#system())`
		Actor system which is required by most serializer implementations.
		
		Specified by:
		`[system](../../../serialization/BaseSerializer.html#system())` in interface `[BaseSerializer](../../../serialization/BaseSerializer.html "interface in akka.serialization")`
		Specified by:
		`[system](SerializationSupport.html#system())` in interface `[SerializationSupport](SerializationSupport.html "interface in akka.cluster.ddata.protobuf")`
		- #### manifest
		
		
		
		```
		public java.lang.String manifest​(java.lang.Object obj)
		```
		
		Description copied from class: `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html#manifest(java.lang.Object))`
		Return the manifest (type hint) that will be provided in the fromBinary method.
		 Use `""` if manifest is not needed.
		
		Specified by:
		`[manifest](../../../serialization/SerializerWithStringManifest.html#manifest(java.lang.Object))` in class `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")`
		- #### toBinary
		
		
		
		```
		public byte[] toBinary​(java.lang.Object obj)
		```
		
		Description copied from class: `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html#toBinary(java.lang.Object))`
		Serializes the given object into an Array of Byte.
		 
		 Note that the array must not be mutated by the serializer after it has been returned.
		
		
		
		Specified by:
		`[toBinary](../../../serialization/Serializer.html#toBinary(java.lang.Object))` in interface `[Serializer](../../../serialization/Serializer.html "interface in akka.serialization")`
		Specified by:
		`[toBinary](../../../serialization/SerializerWithStringManifest.html#toBinary(java.lang.Object))` in class `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")`
		- #### fromBinary
		
		
		
		```
		public java.lang.Object fromBinary​(byte[] bytes,
		                                   java.lang.String manifest)
		```
		
		Description copied from class: `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html#fromBinary(byte%5B%5D,java.lang.String))`
		Produces an object from an array of bytes, with an optional type\-hint.
		 
		 It's recommended to throw `java.io.NotSerializableException` in `fromBinary`
		 if the manifest is unknown. This makes it possible to introduce new message
		 types and send them to nodes that don't know about them. This is typically
		 needed when performing rolling upgrades, i.e. running a cluster with mixed
		 versions for while. `NotSerializableException` is treated as a transient
		 problem in the TCP based remoting layer. The problem will be logged
		 and message is dropped. Other exceptions will tear down the TCP connection
		 because it can be an indication of corrupt bytes from the underlying transport.
		
		
		
		Specified by:
		`[fromBinary](../../../serialization/SerializerWithStringManifest.html#fromBinary(byte%5B%5D,java.lang.String))` in class `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")`
		- #### gsetToProto
		
		
		
		```
		public [ReplicatedDataMessages.GSet](msg/ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg") gsetToProto​([GSet](../GSet.html "class in akka.cluster.ddata")<?> gset)
		```
		- #### gsetFromBinary
		
		
		
		```
		public [GSet](../GSet.html "class in akka.cluster.ddata")<?> gsetFromBinary​(byte[] bytes)
		```
		- #### gsetFromProto
		
		
		
		```
		public [GSet](../GSet.html "class in akka.cluster.ddata")<java.lang.Object> gsetFromProto​([ReplicatedDataMessages.GSet](msg/ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg") gset)
		```
		- #### orsetToProto
		
		
		
		```
		public [ReplicatedDataMessages.ORSet](msg/ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") orsetToProto​([ORSet](../ORSet.html "class in akka.cluster.ddata")<?> orset)
		```
		- #### orsetFromBinary
		
		
		
		```
		public [ORSet](../ORSet.html "class in akka.cluster.ddata")<java.lang.Object> orsetFromBinary​(byte[] bytes)
		```
		- #### orsetFromProto
		
		
		
		```
		public [ORSet](../ORSet.html "class in akka.cluster.ddata")<java.lang.Object> orsetFromProto​([ReplicatedDataMessages.ORSet](msg/ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") orset)
		```
		- #### flagToProto
		
		
		
		```
		public [ReplicatedDataMessages.Flag](msg/ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg") flagToProto​([Flag](../Flag.html "class in akka.cluster.ddata") flag)
		```
		- #### flagFromBinary
		
		
		
		```
		public [Flag](../Flag.html "class in akka.cluster.ddata") flagFromBinary​(byte[] bytes)
		```
		- #### flagFromProto
		
		
		
		```
		public [Flag](../Flag.html "class in akka.cluster.ddata") flagFromProto​([ReplicatedDataMessages.Flag](msg/ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg") flag)
		```
		- #### lwwRegisterToProto
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister](msg/ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg") lwwRegisterToProto​([LWWRegister](../LWWRegister.html "class in akka.cluster.ddata")<?> lwwRegister)
		```
		- #### lwwRegisterFromBinary
		
		
		
		```
		public [LWWRegister](../LWWRegister.html "class in akka.cluster.ddata")<java.lang.Object> lwwRegisterFromBinary​(byte[] bytes)
		```
		- #### lwwRegisterFromProto
		
		
		
		```
		public [LWWRegister](../LWWRegister.html "class in akka.cluster.ddata")<java.lang.Object> lwwRegisterFromProto​([ReplicatedDataMessages.LWWRegister](msg/ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg") lwwRegister)
		```
		- #### gcounterToProto
		
		
		
		```
		public [ReplicatedDataMessages.GCounter](msg/ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") gcounterToProto​([GCounter](../GCounter.html "class in akka.cluster.ddata") gcounter)
		```
		- #### gcounterFromBinary
		
		
		
		```
		public [GCounter](../GCounter.html "class in akka.cluster.ddata") gcounterFromBinary​(byte[] bytes)
		```
		- #### gcounterFromProto
		
		
		
		```
		public [GCounter](../GCounter.html "class in akka.cluster.ddata") gcounterFromProto​([ReplicatedDataMessages.GCounter](msg/ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") gcounter)
		```
		- #### pncounterToProto
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter](msg/ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") pncounterToProto​([PNCounter](../PNCounter.html "class in akka.cluster.ddata") pncounter)
		```
		- #### pncounterFromBinary
		
		
		
		```
		public [PNCounter](../PNCounter.html "class in akka.cluster.ddata") pncounterFromBinary​(byte[] bytes)
		```
		- #### pncounterFromProto
		
		
		
		```
		public [PNCounter](../PNCounter.html "class in akka.cluster.ddata") pncounterFromProto​([ReplicatedDataMessages.PNCounter](msg/ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") pncounter)
		```
		- #### ormapToProto
		
		
		
		```
		public [ReplicatedDataMessages.ORMap](msg/ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg") ormapToProto​([ORMap](../ORMap.html "class in akka.cluster.ddata")<?,​?> ormap)
		```
		- #### ormapFromBinary
		
		
		
		```
		public [ORMap](../ORMap.html "class in akka.cluster.ddata")<java.lang.Object,​[ReplicatedData](../ReplicatedData.html "interface in akka.cluster.ddata")> ormapFromBinary​(byte[] bytes)
		```
		- #### mapTypeFromProto
		
		
		
		```
		public <PEntry extends akka.protobufv3.internal.GeneratedMessageV3,​A extends akka.protobufv3.internal.GeneratedMessageV3,​B extends [ReplicatedData](../ReplicatedData.html "interface in akka.cluster.ddata")> scala.collection.immutable.Map<java.lang.Object,​B> mapTypeFromProto​(java.util.List<PEntry> input,
		                                                                                                                                                                                                                                         scala.Function1<A,​B> valueCreator,
		                                                                                                                                                                                                                                         [ReplicatedDataSerializer.ProtoMapEntryReader](ReplicatedDataSerializer.ProtoMapEntryReader.html "interface in akka.cluster.ddata.protobuf")<PEntry,​A> eh)
		```
		- #### ormapFromProto
		
		
		
		```
		public [ORMap](../ORMap.html "class in akka.cluster.ddata")<java.lang.Object,​[ReplicatedData](../ReplicatedData.html "interface in akka.cluster.ddata")> ormapFromProto​([ReplicatedDataMessages.ORMap](msg/ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg") ormap)
		```
		- #### singleMapEntryFromProto
		
		
		
		```
		public <PEntry extends akka.protobufv3.internal.GeneratedMessageV3,​A extends akka.protobufv3.internal.GeneratedMessageV3,​B extends [ReplicatedData](../ReplicatedData.html "interface in akka.cluster.ddata")> scala.collection.immutable.Map<java.lang.Object,​B> singleMapEntryFromProto​(java.util.List<PEntry> input,
		                                                                                                                                                                                                                                                scala.Function1<A,​B> valueCreator,
		                                                                                                                                                                                                                                                [ReplicatedDataSerializer.ProtoMapEntryReader](ReplicatedDataSerializer.ProtoMapEntryReader.html "interface in akka.cluster.ddata.protobuf")<PEntry,​A> eh)
		```
		- #### singleKeyEntryFromProto
		
		
		
		```
		public <PEntry extends akka.protobufv3.internal.GeneratedMessageV3,​A extends akka.protobufv3.internal.GeneratedMessageV3> java.lang.Object singleKeyEntryFromProto​(scala.Option<PEntry> entryOption,
		                                                                                                                                                                         [ReplicatedDataSerializer.ProtoMapEntryReader](ReplicatedDataSerializer.ProtoMapEntryReader.html "interface in akka.cluster.ddata.protobuf")<PEntry,​A> eh)
		```
		- #### lwwmapToProto
		
		
		
		```
		public [ReplicatedDataMessages.LWWMap](msg/ReplicatedDataMessages.LWWMap.html "class in akka.cluster.ddata.protobuf.msg") lwwmapToProto​([LWWMap](../LWWMap.html "class in akka.cluster.ddata")<?,​?> lwwmap)
		```
		- #### lwwmapFromBinary
		
		
		
		```
		public [LWWMap](../LWWMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object> lwwmapFromBinary​(byte[] bytes)
		```
		- #### lwwmapFromProto
		
		
		
		```
		public [LWWMap](../LWWMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object> lwwmapFromProto​([ReplicatedDataMessages.LWWMap](msg/ReplicatedDataMessages.LWWMap.html "class in akka.cluster.ddata.protobuf.msg") lwwmap)
		```
		- #### pncountermapToProto
		
		
		
		```
		public [ReplicatedDataMessages.PNCounterMap](msg/ReplicatedDataMessages.PNCounterMap.html "class in akka.cluster.ddata.protobuf.msg") pncountermapToProto​([PNCounterMap](../PNCounterMap.html "class in akka.cluster.ddata")<?> pncountermap)
		```
		- #### pncountermapFromBinary
		
		
		
		```
		public [PNCounterMap](../PNCounterMap.html "class in akka.cluster.ddata")<?> pncountermapFromBinary​(byte[] bytes)
		```
		- #### pncountermapFromProto
		
		
		
		```
		public [PNCounterMap](../PNCounterMap.html "class in akka.cluster.ddata")<?> pncountermapFromProto​([ReplicatedDataMessages.PNCounterMap](msg/ReplicatedDataMessages.PNCounterMap.html "class in akka.cluster.ddata.protobuf.msg") pncountermap)
		```
		- #### multimapToProto
		
		
		
		```
		public [ReplicatedDataMessages.ORMultiMap](msg/ReplicatedDataMessages.ORMultiMap.html "class in akka.cluster.ddata.protobuf.msg") multimapToProto​([ORMultiMap](../ORMultiMap.html "class in akka.cluster.ddata")<?,​?> multimap)
		```
		- #### multimapFromBinary
		
		
		
		```
		public [ORMultiMap](../ORMultiMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object> multimapFromBinary​(byte[] bytes)
		```
		- #### multimapFromProto
		
		
		
		```
		public [ORMultiMap](../ORMultiMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object> multimapFromProto​([ReplicatedDataMessages.ORMultiMap](msg/ReplicatedDataMessages.ORMultiMap.html "class in akka.cluster.ddata.protobuf.msg") multimap)
		```
		- #### keyIdToBinary
		
		
		
		```
		public byte[] keyIdToBinary​(java.lang.String id)
		```
		- #### keyIdFromBinary
		
		
		
		```
		public java.lang.String keyIdFromBinary​(byte[] bytes)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Flag.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounterMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.KeyComparator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.LWWMapEntry$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.LWWMapEntryComparator$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.ORMapDeltaGroupEntry$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.ORMapEntry$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.ORMapEntryComparator$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.ORMultiMapEntry$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.ORMultiMapEntryComparator$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.PNCounterMapEntry$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.PNCounterMapEntryComparator$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.ProtoMapEntryReader.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.ProtoMapEntryWriter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/SerializationSupport.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.Flag.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWRegister.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMultiMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounterMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/BaseSerializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/SerializerWithStringManifest.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html)*