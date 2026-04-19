---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:41:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/package-summary.html
title: akka.cluster.ddata.protobuf
---

# akka.cluster.ddata.protobuf

## Content

# Package akka.cluster.ddata.protobuf

- Interface Summary 
| Interface | Description |
| [ReplicatedDataSerializer.ProtoMapEntryReader](ReplicatedDataSerializer.ProtoMapEntryReader.html "interface in akka.cluster.ddata.protobuf")\<Entry extends akka.protobufv3\.internal.GeneratedMessageV3,​A extends akka.protobufv3\.internal.GeneratedMessageV3\> |  |
| --- | --- |
| [ReplicatedDataSerializer.ProtoMapEntryWriter](ReplicatedDataSerializer.ProtoMapEntryWriter.html "interface in akka.cluster.ddata.protobuf")\<Entry extends akka.protobufv3\.internal.GeneratedMessageV3,​EntryBuilder extends akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<EntryBuilder\>,​Value extends akka.protobufv3\.internal.GeneratedMessageV3\> |  |
| [SerializationSupport](SerializationSupport.html "interface in akka.cluster.ddata.protobuf") | Some useful serialization helper methods. |
- Class Summary 
| Class | Description |
| [AbstractSerializationSupport](AbstractSerializationSupport.html "class in akka.cluster.ddata.protobuf") | Java API |
| --- | --- |
| [OtherMessageComparator](OtherMessageComparator.html "class in akka.cluster.ddata.protobuf") |  |
| [OtherMessageComparator$](OtherMessageComparator$.html "class in akka.cluster.ddata.protobuf") |  |
| [ReplicatedDataSerializer](ReplicatedDataSerializer.html "class in akka.cluster.ddata.protobuf") | Protobuf serializer of ReplicatedData. |
| [ReplicatedDataSerializer.KeyComparator](ReplicatedDataSerializer.KeyComparator.html "class in akka.cluster.ddata.protobuf")\<A extends akka.protobufv3\.internal.GeneratedMessageV3\> |  |
| [ReplicatedDataSerializer.LWWMapEntry$](ReplicatedDataSerializer.LWWMapEntry$.html "class in akka.cluster.ddata.protobuf") |  |
| [ReplicatedDataSerializer.LWWMapEntryComparator$](ReplicatedDataSerializer.LWWMapEntryComparator$.html "class in akka.cluster.ddata.protobuf") |  |
| [ReplicatedDataSerializer.ORMapDeltaGroupEntry$](ReplicatedDataSerializer.ORMapDeltaGroupEntry$.html "class in akka.cluster.ddata.protobuf") |  |
| [ReplicatedDataSerializer.ORMapEntry$](ReplicatedDataSerializer.ORMapEntry$.html "class in akka.cluster.ddata.protobuf") |  |
| [ReplicatedDataSerializer.ORMapEntryComparator$](ReplicatedDataSerializer.ORMapEntryComparator$.html "class in akka.cluster.ddata.protobuf") |  |
| [ReplicatedDataSerializer.ORMultiMapEntry$](ReplicatedDataSerializer.ORMultiMapEntry$.html "class in akka.cluster.ddata.protobuf") |  |
| [ReplicatedDataSerializer.ORMultiMapEntryComparator$](ReplicatedDataSerializer.ORMultiMapEntryComparator$.html "class in akka.cluster.ddata.protobuf") |  |
| [ReplicatedDataSerializer.PNCounterMapEntry$](ReplicatedDataSerializer.PNCounterMapEntry$.html "class in akka.cluster.ddata.protobuf") |  |
| [ReplicatedDataSerializer.PNCounterMapEntryComparator$](ReplicatedDataSerializer.PNCounterMapEntryComparator$.html "class in akka.cluster.ddata.protobuf") |  |
| [ReplicatedDataSerializer$](ReplicatedDataSerializer$.html "class in akka.cluster.ddata.protobuf") |  |
| [ReplicatorMessageSerializer](ReplicatorMessageSerializer.html "class in akka.cluster.ddata.protobuf") | Protobuf serializer of ReplicatorMessage messages. |
| [ReplicatorMessageSerializer.SmallCache](ReplicatorMessageSerializer.SmallCache.html "class in akka.cluster.ddata.protobuf")\<A,​B\> | A cache that is designed for a small number (\<\= 32\) of  entries. |
| [ReplicatorMessageSerializer$](ReplicatorMessageSerializer$.html "class in akka.cluster.ddata.protobuf") | INTERNAL API |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/OtherMessageComparator$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/OtherMessageComparator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer$.html
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
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.SmallCache.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/SerializationSupport.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/package-summary.html)*